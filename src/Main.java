import java.awt.image.BufferedImage;
import java.awt.Color;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedImage imagem = ImageHandler.carregar("src/images/pixelart.png");

        System.out.println("Largura: " + imagem.getWidth());
        System.out.println("Altura: " + imagem.getHeight());
        int cor = imagem.getRGB(200, 200);
        Color c = new Color(cor, true);
        System.out.println("R: " + c.getRed());
        System.out.println("G: " + c.getGreen());
        System.out.println("B: " + c.getBlue());
        System.out.println("A: " + c.getAlpha());

        ImageHandler.salvar(imagem, "src/images/pixelartNova.png");
    }
}