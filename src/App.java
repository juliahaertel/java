import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
       // System.out.println("Hello, Fabio!");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Posto> listaPostos;

        int opcao;
    
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Listar todos os postos");
            System.out.println("2. Pesquisar postos por bairro");
            System.out.println("3. Pesquisar postos por tipo de produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
    
            switch (opcao) {
                case 1:

                    listaPostos = (ArrayList<Posto>)listarPostos("C:\\Users\\juuli\\java\\gasolina_etanol.csv");

                    for( Posto p : listaPostos){
                        System.out.println(p.getNomePosto());
                    }
                    break;
                case 2:
                    
                    pesquisarPorBairro(null);
                    break;
                case 3:
                    pesquisarPorTipoProduto();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
    
            System.out.println();
        } while (opcao != 4);
    
        scanner.close();
    
    }
    private static ArrayList<Posto> listarPostos(String caminho) throws FileNotFoundException, IOException
{	
   	ArrayList<Posto> postos = new ArrayList<Posto>();
        BufferedReader br = null;
        String linha = "";
        
        try
        {
            br = new BufferedReader(new FileReader(caminho));
            linha = br.readLine(); // joga for a primeira linha, com os nomes das colunas
            
            while ((linha = br.readLine()) != null)
            {
                String[] posto = linha.split(";");
                
                posto[3] = posto[3].replaceAll(",", "."); // o parseFloat exige "." em vez de ","
                postos.add(new Posto(posto[0], posto[1], posto[2], Float.parseFloat(posto[3]), posto[4]));
            }
        }
        catch (FileNotFoundException e) {}
        catch (IOException e) {}
        finally
        {
            if (br != null)
                try
                {
                    br.close();
                } catch (IOException e) {}
        }
            
        return postos;
}
    private static void pesquisarPorTipoProduto() {
    }

    private static void pesquisarPorBairro(String bairro) {
    }

    

    

    

   

    
}
