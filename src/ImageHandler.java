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

    public static void salvar(BufferedImage imagem, String caminho) throws IOException {
        File arquivo = new File(caminho);
        ImageIO.write(imagem, "png", arquivo);
    }

//    public static void limparFrames(String pasta) {
//        File diretorio = new File(pasta);
//        File[] arquivos = diretorio.listFiles();
//
//        if (arquivos != null) {
//            for (File arquivo : arquivos) {
//                arquivo.delete();
//            }
//        }
//    }

    public static void deletarArquivo(String caminho) {
        File arquivo = new File(caminho);
        arquivo.delete();
    }
}
