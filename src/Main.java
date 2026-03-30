import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        ImageHandler.limparFrames("src/images/frames_queue");
//        ImageHandler.limparFrames("src/images/frames_stack");

        BufferedImage image = ImageHandler.carregar("src/images/pixelart.png");

        ImageViewer viewer = new ImageViewer(image);

        JFrame frame = new JFrame("Flood Fill");
        frame.add(viewer);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        new Thread(() -> {
            try {
//                FloodFill.paintQueue(image, 32, 32, new Color(198, 152, 59), viewer);
                FloodFill.paintStack(image, 32, 32, new Color(198, 152, 59), viewer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}