import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PesquisaUsuarioGithub {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Digite o nick do usuário: ");
        Scanner leitor = new Scanner(System.in);
        String buscaUsuario = leitor.nextLine();

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com/users/" + buscaUsuario))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 404) {
                throw new ErroConsultaGithubException("Usuário não encontrado.");
            }

            String buscaJson = response.body();

            Gson gson = new Gson();
            Perfil buscaPerfil = gson.fromJson(buscaJson, Perfil.class);

            System.out.println(buscaPerfil);

        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        }
        catch (ErroConsultaGithubException e) {
            System.out.println(e.getMessage());
        }
    }
}