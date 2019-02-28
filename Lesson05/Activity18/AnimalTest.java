public class AnimalTest {

   public static void  main(String[] args){

       Cat cat = new Cat();
       Cow cow = new Cow();

       System.out.println(cat.owner);
      
       Animal animal = (Animal)cat;
       //System.out.println(animal.owner);
       System.out.println(cow.sound);

       //Animal animal1 = (Animal)cow;
       Cat cat1 = (Cat)animal;
       System.out.println(cat1.owner);
   }
}
