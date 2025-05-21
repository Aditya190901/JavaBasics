class Programmer{
    String name;
    int age;

    Programmer(String name,int age){
        this.age = age;
        this.name = name;
    }
    
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

     @Override
    public String toString() {
        return "Programmer [name=" + name + ", age=" + age + "]";
    }
}


public class ClassAndObject {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Aditya",22);

        // p1.setName("Aditya");
        // p1.setAge(24);
        System.out.println(p1.toString());
        // System.out.println(p1.getName());
        // System.out.println(p1.getAge());
        // System.out.println(p1.getClass());
    }
}
