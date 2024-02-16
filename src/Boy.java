public class Boy extends Parent{
   private int age;
   private String color;


    public Boy(String name, String surName, int age,String color) {
        super(name, surName);
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "age=" + age +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
