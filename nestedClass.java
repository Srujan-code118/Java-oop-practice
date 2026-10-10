public  class nestedClass {
    int x = 10;
    class InnerClass{
        void display(){
            System.out.printf("The value of x : " +x);
        }
    }
    public static void main(String[]args){
        nestedClass obj1 = new nestedClass();
        nestedClass.InnerClass obj2 = obj1.new InnerClass();

        obj2.display();
    }
}
 