package abstractclass;

public enum Dimension {
    TRIDIMENSIONAL (0 ,"3D"),
    DOIDIMENSIONAL (1, "2D"),
    ADIMENSIONAL (2 ,"ND");


    private int tip;
    private String name;

    Dimension(int tip, String name){
        this.tip=tip;
        this.name=name;
    }


    public int getTip(){
        return tip;
    }

    public String getName(){
        return name;
    }
}
