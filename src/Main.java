import java.awt.image.BufferedImage;
import java.awt.Color;

public class Main {
    public static void main(String[] args) throws Exception {
        ImageHandler.limparFrames("src/images/frames_queue");
        ImageHandler.limparFrames("src/images/frames_stack");
        BufferedImage imageQueue = ImageHandler.carregar("src/images/pixelart.png");
        BufferedImage imageStack = ImageHandler.carregar("src/images/pixelart.png");

        FloodFill floodFill = new FloodFill();
        floodFill.paintQueue(imageQueue, 32, 32, new Color(198, 152, 59));
        floodFill.paintStack(imageStack, 32, 32, new Color(198, 152, 59));
    }
}