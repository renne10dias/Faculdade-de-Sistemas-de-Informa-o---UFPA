import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Metodos {
    private static final String CAMINHO_ARQUIVO = "usuarios.txt";

    // método para ler todos os usuários do arquivo de texto e retorná-los como uma lista de usuários
    public static List<Usuario> lerUsuarios() throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        BufferedReader leitor = new BufferedReader(new FileReader(CAMINHO_ARQUIVO));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            String[] campos = linha.split(",");
            Usuario usuario = new Usuario(campos[0], campos[1], campos[2], campos[3], campos[4]);
            usuarios.add(usuario);
        }
        leitor.close();
        return usuarios;
    }

    // método para adicionar um novo usuário ao arquivo de texto
    public static void adicionarUsuario(Usuario usuario) throws IOException {
        BufferedWriter escritor = new BufferedWriter(new FileWriter(CAMINHO_ARQUIVO, true));
        escritor.write(usuario.toString());
        escritor.newLine();
        escritor.close();
    }
}
