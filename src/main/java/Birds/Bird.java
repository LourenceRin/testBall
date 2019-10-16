package Birds;

public abstract class Bird {
    private String name;
    private String color;
    private String diet;
    private int size;

    public abstract void move();

    public abstract void fly();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDiet(){
        return diet;
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
