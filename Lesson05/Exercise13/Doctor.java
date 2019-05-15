public class Doctor implements PersonBehavior, PersonListener {
  @Override
  public void breathe() {
  }

  @Override
  public void sleep() {
    // TODO: Do other operations here
    // then raise event
    this.onPersonSleeping();
  }

  @Override
  public void walk(int speed) {
    // TODO: Do other operations here
    // then raise event
    this.onPersonWalking();
  }

  @Override
  public void onPersonWalking() {
    System.out.println("Event: onPersonWalking");
  }

  @Override
  public void onPersonSleeping() {
    System.out.println("Event: onPersonSleeping");
  }

  public static void main(String[] args) {
    Doctor myDoctor = new Doctor();
    myDoctor.walk(20);
    myDoctor.sleep();
  }
}