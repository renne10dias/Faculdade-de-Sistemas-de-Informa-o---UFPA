import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        cenarioDeTeste1();
        cenarioDeTeste2();
        cenarioDeTeste3();

    }




    //Todos dos dados fornecidos
    public static void cenarioDeTeste1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("CENÁRIO DE TESTE 1");


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
            if(emailLogin != "" && senhaLogin != ""){
                if (!encontrado) {
                    System.out.println("E-mail ou senha incorretos!\n");
                }
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler usuários: " + e.getMessage());
        }

        if(emailLogin == ""){
            System.out.println("O campo Email esta vazio!");
        }
        if(senhaLogin == ""){
            System.out.println("O campo Senha esta vazio!");
        }

    }



    //Email não fornecido
    public static void cenarioDeTeste2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("CENÁRIO DE TESTE 2");

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
            if(emailLogin != "" && senhaLogin != ""){
                if (!encontrado) {
                    System.out.println("E-mail ou senha incorretos!\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler usuários: " + e.getMessage());
        }

        if(emailLogin == ""){
            System.out.println("O campo Email esta vazio!");
        }
        if(senhaLogin == ""){
            System.out.println("O campo Senha esta vazio!");
        }

    }

    //Senha não fornecida
    public static void cenarioDeTeste3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("CENÁRIO DE TESTE 3");


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
            if(emailLogin != "" && senhaLogin != ""){
                if (!encontrado) {
                    System.out.println("E-mail ou senha incorretos!\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler usuários: " + e.getMessage());
        }

        if(emailLogin == ""){
            System.out.println("O campo Email esta vazio!");
        }
        if(senhaLogin == ""){
            System.out.println("O campo Senha esta vazio!");
        }

    }
}
