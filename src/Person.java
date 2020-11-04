import java.util.HashMap;
import java.util.Map;

public class Person {
    public static void main(String[] args) {
        HashMap<String,String> person = new HashMap<String,String>();

        person.put("Nazaruk","Alina");
        person.put("Ivanov","Andrii");
        person.put("Kidman","Nikol");
        person.put("Trump","Donald");
        person.put("Nazaruk","Ruslan");
        person.put("Kruz","Robin");
        person.put("Soyer","Tom");
        person.put("Hug","Jeck");
        person.put("Sydoruk","Dima");
        person.put("Nazaruk","Roman");

        for (Map.Entry<String, String> entry: person.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println( key + " " + value);}
        // three persons have the same Last Name, as were not printed

        String name = person.remove("Hug");
        {
            System.out.println("Updated personMap: " + person);}

    }}
