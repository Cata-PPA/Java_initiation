package abstractclass;

public class Patrat extends Shape implements IShape  {
    private double height;
    private String name;


    //constructor
        public Patrat (String name,
                       double height){
            this.name=name;
            this.height=height;
        }
    // getters                          getters
    public String getName(){
            return name;
    }

    public double getHeight(){
            return height;
    }
    // setters                          setters
    public void setName(){
            this.name=name;
    }

    public void setHeight(){
            this.height=height;
    }

    @Override
    public double getPerimetru(){
            return 4*height;
    }

    @Override
    public double getArea(){
        return height*height;
    }


    @Override
    public String toString(){
            return  "\nname= " +getName()+
                    "\nheight= " +getHeight();
    }


}
