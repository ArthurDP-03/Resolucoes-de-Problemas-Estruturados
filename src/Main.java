import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ImageHandler.deletarArquivo("src/images/frame_final.png");
        ImageHandler.limparFrames("src/images/frames");


        BufferedImage image = ImageHandler.carregar("src/images/pixelart.png");

        ImageViewer viewer = new ImageViewer(image);

        JFrame frame = new JFrame("Flood Fill");
        frame.add(viewer);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Object[] options = {"Queue", "Stack"};
        int choice = JOptionPane.showOptionDialog(frame, "Escolha o método:", "Flood Fill", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        new Thread(() -> {
            try {
                if (choice == 0) {
                    FloodFill.paintQueue(image, 32, 32, new Color(198, 152, 59), viewer);
                } else {
                    FloodFill.paintStack(image, 32, 32, new Color(198, 152, 59), viewer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}