import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.IOException;

public class FloodFill {

    public static void paintStack(BufferedImage image, int startX, int startY, Color newColor, ImageViewer viewer) throws IOException {
        int width = image.getWidth();
        int height = image.getHeight();

        if (!pixelExists(startX, startY, width, height)) {
            throw new IllegalArgumentException("Pixel fora da imagem!");
        }

        Stack<Pixel> stack = new Stack();
        Pixel pixel = new Pixel(startX, startY);
        stack.push(pixel);


        int initialColor = image.getRGB(startX, startY);
        int count = 0;
        while (!stack.isEmpty()){
            Pixel currentPixel = stack.pop();

            int x = currentPixel.x;
            int y = currentPixel.y;

            if (!pixelExists(x, y, width, height)) continue;
            if(image.getRGB(x, y) != initialColor) continue;

            image.setRGB(x, y, newColor.getRGB());
            viewer.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Pixel up = new Pixel(x, y - 1);
            Pixel right = new Pixel(x + 1, y);
            Pixel down = new Pixel(x, y + 1);
            Pixel left = new Pixel(x - 1, y);

            stack.push(up);
            stack.push(right);
            stack.push(down);
            stack.push(left);

            if (count % 100 == 0 && count < 10000) {
                ImageHandler.salvar(image, "src/images/frames/frame_" + count + ".png");
            }
            count++;
        }

        ImageHandler.salvar(image, "src/images/frame_final.png");
        System.exit(0);
    }

    public static void paintQueue(BufferedImage image, int startX, int startY, Color newColor, ImageViewer viewer) throws IOException {
        int width = image.getWidth();
        int height = image.getHeight();

        if (!pixelExists(startX, startY, width, height)) {
            throw new IllegalArgumentException("Pixel fora da imagem!");
        }

        Queue<Pixel> queue = new Queue();
        Pixel pixel = new Pixel(startX, startY);
        queue.enqueue(pixel);

        int initialColor = image.getRGB(startX, startY);
        int count = 0;
        while (!queue.isEmpty()){
            Pixel currentPixel = queue.dequeue();

            int x = currentPixel.x;
            int y = currentPixel.y;

            if (!pixelExists(x, y, width, height)) continue;
            if(image.getRGB(x, y) != initialColor) continue;

            image.setRGB(x, y, newColor.getRGB());
            viewer.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



            Pixel up = new Pixel(x, y - 1);
            Pixel right = new Pixel(x + 1, y);
            Pixel down = new Pixel(x, y + 1);
            Pixel left = new Pixel(x - 1, y);

            queue.enqueue(up);
            queue.enqueue(right);
            queue.enqueue(down);
            queue.enqueue(left);
            if (count % 100 == 0 && count < 10000) {
                ImageHandler.salvar(image, "src/images/frames/frame_" + count + ".png");
            }
            count++;
        }
        ImageHandler.salvar(image, "src/images/frame_final.png");
        System.exit(0);
    }


    private static boolean pixelExists(int x, int y, int width, int height) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
