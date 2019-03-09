public class Cat extends Animal {
    // Fields specific to the Cat family
    String owner;
    int numberOfTeeth;
    int age;

    public static void main(String[] args) {
        Cat myCat = new Cat();
        // Since Cat inherits from Animal, we have access to it's methods and fields
        // We don't need to redefine these methods and fields
        myCat.setFamily("Cat");
        myCat.setName("Puppy");
        myCat.ears = 2;
        myCat.legs = 4;
        myCat.eyes = 2;
        System.out.println(myCat.getFamily());
        System.out.println(myCat.getName());
        System.out.println(myCat.ears);
        System.out.println(myCat.legs);
        System.out.println(myCat.eyes);
    }
}
