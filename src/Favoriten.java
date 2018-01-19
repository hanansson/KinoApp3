import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Favoriten {

        public void Favoriten () throws IOException {

            ArrayList<Filmeintrag> getGesamtEinträge = new ArrayList<Filmeintrag>();

            try{
                BufferedWriter writer = new BufferedWriter(new FileWriter("Merkliste.txt"));
                for(int i=0; i < getGesamtEinträge.size(); i++){
                    for (int j=0; j<getGesamtEinträge.size();j++){
                        writer.write(getGesamtEinträge+ ";");
                    }
                    writer.newLine();
                }
                writer.close();
            } catch(IOException e){
                e.printStackTrace();
            }

            System.out.println(getGesamtEinträge);
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
