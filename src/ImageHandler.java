import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandler {
    public static BufferedImage carregar(String caminho) throws IOException {
        File arquivo = new File(caminho);
        BufferedImage imagem = ImageIO.read(arquivo);
        return imagem;
    }
}
