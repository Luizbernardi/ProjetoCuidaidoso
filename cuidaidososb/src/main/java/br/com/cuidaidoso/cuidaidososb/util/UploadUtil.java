package br.com.cuidaidoso.cuidaidososb.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.web.multipart.MultipartFile;

public class UploadUtil {

    public static boolean fazerUploadImagem(MultipartFile imagem) {
        boolean sucessoUpload = false;

        if (!imagem.isEmpty()) {
            String nomeArquivo = imagem.getOriginalFilename();
            try {

                String pastaUploadImagem = "C:\\Users\\Luizb\\OneDrive\\Documentos\\WorkspaceVsCode\\ProjetoCuidaidoso\\cuidaidososb\\src\\main\\resources\\static\\img\\img-uploads";
                File dir = new File(pastaUploadImagem);
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                File serverFile = new File(dir.getAbsolutePath() + File.separator
                        + nomeArquivo);

                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));

                stream.write(imagem.getBytes());
                stream.close();

                System.out.println("Armazenado em: " + serverFile.getAbsolutePath());
                System.out.println("Voce fez o upload do arquivo" + nomeArquivo + "com sucesso");

            } catch (Exception e) {
                System.out.println("Voce Falhou em carregar o arquivo : " + nomeArquivo + "=>" + e.getMessage());

            }

        } else {
            System.out.println("Voce falhou em carregar o arquivo por ele estar vazio");

        }

        return sucessoUpload;
    }
}
