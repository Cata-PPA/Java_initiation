package model;

public class TestPerson {
    public static void main(String[] args) {
        Person om1 = new Person();
        Person om2 = new Person();


        om1.setName("Andrei");
        System.out.println(om1.getName());

        om1.setAge(24);
        om1.setCity("Cluj-N");
        om1.setGender("Masculin");

        om2.setAge(24);

        System.out.println(om1.getAge());
        System.out.println(om1.getCity());
        System.out.println(om1.getGender());
    }


}
