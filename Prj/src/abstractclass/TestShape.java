package abstractclass;

public class TestShape {
    public static void main(String[] args){
        Patrat forma1=new Patrat("Patratel", 7);

        Dreptunghi forma2=new Dreptunghi("Dreptun", 8,9.2);

        System.out.println(forma1.getName());
        System.out.println(forma1.getHeight());
        System.out.println(forma1.getPerimetru());
        System.out.println(forma1.getArea());
        System.out.println(IShape.COLOR);
        System.out.println(forma1.COD);
        System.out.println(Colors.GALBEN.getName());
        System.out.println(Colors.GALBEN);
        System.out.println(Dimension.ADIMENSIONAL.getName());


        System.out.println(forma2.getName());
        System.out.println(forma2.getHeight());
        System.out.println(forma2.getLength());
        System.out.println(forma2.getPerimetru());
        System.out.println(IShape.COLOR);
        System.out.println(forma2.COD);
        System.out.println(Colors.VERDE);
// GETTERI SE APELEAZA INTOTDEAUNA CU VARIABILA *************
        String dim=Dimension.ADIMENSIONAL.getName();
        System.out.println(dim);



        Dimension dimen=Dimension.ADIMENSIONAL;
        switch (dimen){
            case DOIDIMENSIONAL:
                System.out.println("Este adimensional"); break;
            case TRIDIMENSIONAL:
                System.out.println("Este tridimensional"); break;
            default:
                System.out.println("E altceva");
        }

        }
}
