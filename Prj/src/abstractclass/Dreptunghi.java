package abstractclass;

public class Dreptunghi  extends Shape implements IShape{
    private double length;
    private double height;
    private String name;


    //constructor
    public Dreptunghi (String name,
                   double length,
                   double height){
        this.name=name;
        this.height=height;
        this.length=length;
    }
    // getters                          getters
    public String getName(){
        return name;
    }
    public double getLength(){
        return length;
    }
    public double getHeight(){
        return height;
    }
    // setters                          setters
    public void setName(){
        this.name=name;
    }
    public void setLength(){
        this.length=length;
    }
    public void setHeight(){
        this.height=height;
    }

    @Override
    public double getPerimetru(){
        return 2*length+2*height;
    }

    @Override
    public double getArea(){
        return length*height;
    }

    @Override
    public String toString(){
        return  "\nname=" +getName()+
                "\nheight= " +getHeight()+
                "\nlength= " +getLength();
    }





}
