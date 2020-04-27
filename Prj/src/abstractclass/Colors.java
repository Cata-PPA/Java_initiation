package abstractclass;

public enum Colors {
    GALBEN ("Yellow"),
    VERDE ("Green"),
    ROSU ("Red");

    private String name;

    Colors(String name){ //putem pune parametrii elementelor enumeratiei si
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
