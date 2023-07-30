import java.io.BufferedReader;
import java.io.FileReader;

public class DZ2 {
    public static void main(String[] args) throws Exception {
        String [] list = ReadLineFromFile("dataForSelect.txt"); 
        System.out.println(list[0]); 
        StringBuilder resultSelect = LineInList(list[0]);
        System.out.println(resultSelect);
      }
      public static StringBuilder LineInList(String line) {
          String line1 = line.replace("{", "");
          String line2 = line1.replace("}", "");
          String line3 = line2.replaceAll("\"", "");
          System.out.println(line3);
          StringBuilder result = new StringBuilder("select * from students where ");
  
          String [] arrayData = line3.split(", ");
          for (int i =0; i < arrayData.length; i++) {
              String[] arrData = arrayData[i].split(":");
              if(arrData[1].equals("null") == false) {
                  if (i != 0) {
                      result.append(", ");
                      result.append(arrData[0]);
                      result.append(" = ");
                      result.append(arrData[1]);
                  } else {
                      result.append(arrData[0]);
                      result.append(" = ");
                      result.append(arrData[1]);
                  }
              }
              
          }
          return result;
      }
      public static String [] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size +=1;
            }
        br.close();
        String [] listData = new String [size];
       
        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
            }
        br1.close();
        return listData;
    
    }
}
