public class CopyConstructor {
    String employee_name;
    int employee_id;

    CopyConstructor(String name,int id){
        this.employee_name=name;
        this.employee_id=id;
    }
    CopyConstructor(CopyConstructor c){
        this.employee_name=c.employee_name;
        this.employee_id=c.employee_id;
    }
    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor("Srujan",273);
        System.out.println("Employee name = "+c1.employee_name);
        System.out.println("Employee id = "+c1.employee_id);
    }
}

