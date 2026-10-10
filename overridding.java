class overridding {
    void sound(){
        System.out.println("Student name : Srujan");
    }    
    public static void main(String[]args){
        overridding a1 = new dog();
        overridding a2 = new cat();

        a1.sound();
        a2.sound();
    }
}
class dog extends overridding{
    @Override
    void sound(){
        System.out.println("Student name : Srujan ");
    }
}
class cat extends dog{
    @Override
    void sound(){
        System.out.println("Student SRN : 273");
    }
    
}
