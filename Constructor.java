public class Constructor {
    String name;
    int age;

    Constructor(String name , int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        Constructor c1 = new Constructor( "Srujan", 20);

        System.out.println("Student name : "+c1.name);
        System.out.println("Student age : "+c1.age);
    }
}
