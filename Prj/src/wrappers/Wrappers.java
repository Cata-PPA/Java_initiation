package wrappers;

public class Wrappers {
    public static void main(String[] args){
        int i1=10;                                   //***** important
        Integer i2=120;                              //****   important
        Integer i3=new Integer(10);
        Integer i4=new Integer("100");
        int i5=i1;                                  //****   important
        Integer i6=i5;                              //****   important
        Integer i7=Integer.valueOf("120");
        int i8=Integer.parseInt("130");          //****   important

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println(i7);
        System.out.println(i8);
        System.out.println("8888888888888");

        double d1=20.2;
        Double d2=32.2;
        Double d3=new Double(3.20);
        Double d4=new Double("89.098");
        double d5=d1;
        Double d6=d5;
        Double d7=Double.valueOf("2439.4");
        double d8=Double.parseDouble("234.21");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
        System.out.println(d8);





    }

}
