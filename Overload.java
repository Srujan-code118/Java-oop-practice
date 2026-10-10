public class Overload {
    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
    public static void main (String [] args){
        Overload o = new Overload();

        System.out.println(o.add(5,7));
        System.out.println(o.add(3,5,9));
        System.out.println(o.add(5.6,6.7));
    }

}
