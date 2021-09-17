public class ClassesAndObjects {
    public static void main(String[] args) {
       Person person1 = new Person();
       //person1.age = 6;
       //person1.name = "Mher";
       person1.setName("Mher");
       person1.setAge(6);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
       //person1.speak();
    }
}

class Person {
    private String name;
    private int age;
//setter
    public void setName(String username){
        if (username.isEmpty()){
            System.out.println("You entered empaty name");
        } else {
            name = username;
        }
    }
//getter
    public String getName(){
        return name;
    }
//setter
    public void setAge(int userage){
        if(userage <= 0){
            System.out.println("Enter number more than 0");
        } else {
            age = userage;
        }
    }
//getter
    public int getAge(){
        return age;
    }

    int calculateYearstoRetirment(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        System.out.println("May name is " + name + ", " + "I'am " + age);
    }
    void sayHello(){
        System.out.println("Hello");
    }

}
