//importing java.io library
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

//Adding atributes and methods to the Gender class
public class Genre{
    private int genreId;
    private String genreDesc;

//Genre constructor
    public Genre(){
        this.genreId = 0;
        this.genreDesc = "";
    }    
    public Genre(int genreId, String genreDesc){
        this.genreId = genreId;
        this.genreDesc = genreDesc;
    }
//Getters and setters for Gender class(Encapsulation)
    public void setGenreId(int genreId){
        this.genreId = genreId;
    }
    public int getGenreId(){
        return genreId;
    }
    public void setGenreDesc(String genreDesc){
        this.genreDesc = genreDesc;
    }
    public String getGenreDesc(){
        return genreDesc;
    }
    public void WriteInFile(String path){
        //PT-BR> Precisamos de um escritor de arquivo, então na linha abaixo é como se fosse um escritor(FileWriter) usado para compor
        //outro escritor(BufferedWriter) mais eficiente.
        //EN-US> Here we need a file writer, so in the line bellow, it acts like a component used to create another writer that
        //provides better efficiency
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))){
            writer.write("ID: " + getGenreId());
            writer.newLine();
            writer.write("Description: " + getGenreDesc());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }
    //PT-BR>Como tinhamos precisado de um escritor, agora precisamos de um leitor. A lógica é bem semelhante: um leitor(FileReader) age como um componente
    //usado para criar outro leitor(BufferedReader) mais eficiente.
    //Nesse método, nós vamos ler e printar o conteúdo de um arquivo específico.

    //EN-US> Since we needed a writer before, now we need a reader. 
    //The logic is very similar: a reader acts as a component used to create another reader that provides better efficiency. 
    //In this method, we will read and print the content from the specified file.
    public void ReadFile(String path){
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            //PT-BR> Criamos uma variável para armazenar temporariamente cada linha que for lida de um arquivo 
            //durante o processo de leitura
            //EN-US> We create a variable as a temporary storage to hold each line of text read from a file during 
            //the reading process
            String line;
            //PT-BR> Aqui usamos uma estrutura de: enquanto o que estiver na linha for diferente de vazio, printe a linha
            //EN-US> Here, we use a structure that prints each line as long as the content is not empty.
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
