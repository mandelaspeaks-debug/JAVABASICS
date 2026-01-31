class Test {
    private int age;
    private String name;

    public int age() {
        return age;
    }
    public String name() {
        return name;
    }

    public Test(String name, int age){
        this.age =age;
        this.name = name;
    }
}


public class site {
    public static void main (String a[]) {

        Test p = new Test("daniel", 40);




        System.out.println(p.age() + " " + p.name());



    }
}