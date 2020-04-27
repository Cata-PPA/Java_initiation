package collections;

import spital.Pacient;
import spital.Person;

import java.util.*;

public class PlayWithList {
    public static void main(String[] args){

        List<String> list=new ArrayList();
        list.add("132");
        list.add("456");
        list.add("Duminica");
        list.add("noiembrie");
        list.add("Craciun fericit!");

        boolean listEmpty=list.isEmpty();
        int size=list.size();
        boolean result=list.contains("noiembrie");
        String value=list.get(2);
        list.remove("Duminica");

        for(String s:list){
            System.out.println(s);
        }

        Collections.sort(list);
        System.out.println(list);


        System.out.println("88888888      888888888       888888888");

        List<Double> doubleList=new ArrayList();
        doubleList.add(252.3);
        doubleList.add(35.33);
        doubleList.add(0.12);
        doubleList.add(9.0);
        doubleList.add(.999);
        doubleList.add(1.1234);

        boolean listEmpty2=doubleList.isEmpty();
        int size2=doubleList.size();
        boolean result2=list.contains("noiembrie");
        Double value2=doubleList.get(2);
        doubleList.remove("0.999");
        int position=doubleList.indexOf(9.0);

        System.out.println(position);
        System.out.println(result2);

        for(Double s:doubleList){
            System.out.println(s);
        }

        Collections.sort(doubleList);
        System.out.println(doubleList);


        Set <String> colors=new HashSet<>();
        colors.add("bronze");
        colors.add("blue");
        colors.add("red");
        colors.add("gray");
        colors.add("gray");
        colors.add("gray");


        colors.remove("red");
        int sizeColors=colors.size();
        boolean resultColors=colors.contains("gray");

        System.out.println(sizeColors);

        System.out.println(resultColors);

        for(String colorShow:colors){
            System.out.println(colorShow);
        }

        System.out.println("888888     888888888         888888888");



        Map <Integer, String> myMap=new HashMap<>();
        myMap.put(1, "Monday");
        myMap.put(2, "Tuesday");
        myMap.put(3, "Wednesday");
        myMap.put(4, "Thursday");
        myMap.put(5, "Friday");

        int sizeMap=myMap.size();
        myMap.remove(3);
        myMap.remove(2,"Tuesday");
        myMap.remove(4,"Thursday");
        boolean rezultat=myMap.isEmpty();

        Collection<String> values=myMap.values();
        for (String val:values){
            System.out.println(val);
        }
        System.out.println(rezultat);

        System.out.println("");
        System.out.println("***************   **************");

        Map<String, Double> catalog=new HashMap<>();
        catalog.put("Catalin", 9.23);
        catalog.put("Patricia", 9.15);
        catalog.put("Delia", 8.55);
        catalog.put("Alin", 9.00);

        int sizeCatalog=catalog.size();
        catalog.remove("Catalin");

        Collection<Double> note=catalog.values();
        for(Double n:note){
            System.out.println(n);
        }
        System.out.println();
        System.out.println();

        Set<String> keySet=catalog.keySet();
        for(String i:keySet){
            System.out.println(i);
        }

        System.out.println("Aici facem o lista cu pacienti din package-ul spital");
        System.out.println();
        System.out.println();

        Pacient p1=new Pacient("Raul", "Sol","Sibiu",21,176, "M", "Raceala cronica", "Student", null, "1930617323530", null);
        Pacient p2=new Pacient("Paul", "Rol","Sebes",31,186, "M", "Raceala acuta", "Student", null, "1930617323520", null);
        Pacient p3=new Pacient("Saul", "Tol","Simeria",41,196, "M", "Raceala-probabil", "Student", null, "1830617323530", null);
        Pacient p4=new Pacient("Toni", "Col","Sighisoara",51,206, "M", "Raceala-sigur", "Student", null, "1520617323530", null);

        List<Pacient> listaPacienti=new ArrayList();
        listaPacienti.add(p1);
        listaPacienti.add(p2);
        listaPacienti.add(p3);
        listaPacienti.add(p4);

        for(Pacient que:listaPacienti){
            System.out.println(que);
        }










    }
}
