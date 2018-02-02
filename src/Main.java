import java.util.*;

public class Main {

    public static void main(String[] args){

        List<String> names = new ArrayList<String>();
       names.add("Rodney");
       names.add("Kamau");
       names.add("Tre");
       names.add("Kimberly");
       System.out.println(names);

       System.out.println(names.contains("Rodney"));
        System.out.println(names.isEmpty());

        names.remove(3);
        System.out.println(names);

        names.set(2, "Amber");
        System.out.println(names);

        System.out.println(names.size());

        names.add(2, "Nhia");
        System.out.println(names);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(2);
        numbers.add(22);
        System.out.println(numbers);
        System.out.println(numbers.indexOf(7));


        System.out.println(numbers.subList(2, 4));

        System.out.println(numbers.contains(7));
        System.out.println(numbers.isEmpty());

        numbers.remove(2);
        System.out.println(numbers);
        numbers.set(3, 10);
        System.out.println(numbers);

        System.out.println(numbers.size());

        numbers.add(2, 9 );
        System.out.println(numbers);

        Map<Integer, String> bands = new HashMap<>();
        bands.put(1, "Avenged Sevenfold");
        bands.put(2, "Hollywood Undead");
        bands.put(3, "Halestorm");
        bands.put(4, "Skillet");
        bands.put(5, "Atreyu");

        for(Map.Entry<Integer, String> e : bands.entrySet()){
            System.out.println("Key = " + e.getKey() + ", Value = " + e.getValue());
        }
    }
}
