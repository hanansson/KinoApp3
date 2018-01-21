import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Favoriten {

    public ArrayList<Filmeintrag> gesamtEinträge;

    public void writeToFile(String s){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Merkliste.txt"));
                writer.write(s);
                writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public String[][] read () throws IOException {
        List<String[]> list = new ArrayList<String[]>();
        try{
            BufferedReader read = new BufferedReader(new FileReader("Merkliste.txt"));
            String in = read.readLine();

            while (in !=null){
                String[] line=in.split(";");
                list.add(line);
                in=read.readLine();

            }
        } catch (Exception e){
            e.printStackTrace();
        }
        String[][] tmp=new String[list.size()][];
        return list.toArray(tmp);
    }
}