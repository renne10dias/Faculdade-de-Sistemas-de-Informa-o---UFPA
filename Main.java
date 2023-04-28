import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Cadastrar novo usuário");
            System.out.println("2 - Fazer login");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir o \n deixado pelo nextInt()

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    Usuario usuario = new Usuario(nome, email, senha, telefone, endereco);
                    try {
                        Metodos.adicionarUsuario(usuario);
                        System.out.println("Usuário cadastrado com sucesso!");
                    } catch (IOException e) {
                        System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("E-mail: ");
                    String emailLogin = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senhaLogin = scanner.nextLine();
                    try {
                        List<Usuario> usuarios = Metodos.lerUsuarios();
                        boolean encontrado = false;
                        for (Usuario u : usuarios) {
                            if (u.getEmail().equals(emailLogin) && u.getSenha().equals(senhaLogin)) {
                                System.out.println("Login bem-sucedido!");
                                System.out.println("Nome: " + u.getNome());
                                System.out.println("Telefone: " + u.getTelefone());
                                System.out.println("Endereço: " + u.getEndereco());
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("E-mail ou senha incorretos!");
                        }
                    } catch (IOException e) {
                        System.out.println("Erro ao ler usuários: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();
        }
    }
}
