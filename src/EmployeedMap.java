import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeedMap {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
        map.put(12, "Alina");
        map.put(13, "Valya");
        map.put(14, "Olga");
        map.put(15, "Iryna");
        map.put(16, "Anna");
        map.put(17, "Oksana");
        map.put(18, "Mila");
        {System.out.println(map);}

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            BufferedReader id = new BufferedReader((new InputStreamReader(System.in)));
            System.out.println("Enter id");
            int b =Integer.parseInt(id.readLine());
            if( map.containsKey( b)){
                System.out.println("Yes this Id exists " + value );
            }
            else {System.out.println("No this Id doesn't exists ");
            }

            BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
            System.out.println("Enter name ");
            String  name = br.readLine();
            if(map.containsValue(name)){
                System.out.println("Yes this name exists " + key);
            }
            else {System.out.println("No this name doesn't exists "); }}



    }}

