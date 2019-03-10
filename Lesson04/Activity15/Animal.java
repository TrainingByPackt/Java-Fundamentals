public class Animal {
    int legs;
    int ears;
    int eyes;
    String family;
    String name;

    public Animal(){
        this(4, 2,2);
    }
    public Animal(int legs, int ears, int eyes){
        this.legs = legs;
        this.ears = ears;
        this.eyes = ears;

    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
public static void main(String[] args){
        	Animal cow = new Animal();
        	Animal goat = new Animal();
Animal duck = new Animal(2, 2, 2);

        cow.setName("Cow");
        cow.setFamily("Bovidae");

        goat.setName("Goat");
        goat.setFamily("Bovidae");

        duck.setName("Duck");
        duck.setFamily("Anatidae");
        
        System.out.println(cow.getName());
        System.out.println(goat.getName());
        System.out.println(duck.getFamily());

    	}

}
