

public class OtherFile {
  public static void main(String[] args) {
    
    // Create two different Bicycle objects
    ACMEBicycle bike1 = new ACMEBicycle();
    ACMEBicycle bike2 = new ACMEBicycle();
    MountainBike bike3 = new MountainBike();

    // Invoke methods on those objects
    bike1.changeCadence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.printStates();

    bike2.changeCadence(60);
    bike2.speedUp(15);
    bike2.changeGear(3);

    bike3.changeCadence(70);
    bike3.speedUp(20);
    bike3.changeGear(4);
    bike3.setHeight(10);
    bike3.printStates();

    bike2.changeCadence(40);
    bike2.speedUp(10);
    bike2.changeGear(4);
    
    bike2.printStates();
  }
}

class Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  void changeCadence(int newValue) {
    cadence = newValue;
  }

  void changeGear(int newValue) {
    gear = newValue;
  }

  void speedUp(int increment) {
    speed += increment;
  }

  void applyBrakes(int decrement) {
    speed -= decrement;
  }

  void printStates() {
    IO.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
  }

}

class MountainBike extends Bicycle {
  int seatHeight;

  void setHeight(int newValue) {
    seatHeight = newValue;
  }

  @Override
  void printStates() {
    IO.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear + " seat height: " + seatHeight);
  }
}

interface BicycleInterface {
  void changeCadence(int newValue);
  void changeGear(int newValue);
  void speedUp(int increment);
  void applyBrakes(int decrement);
  void printStates();
}

class ACMEBicycle implements BicycleInterface {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  public void changeCadence(int newValue) {
    cadence = newValue;
  }

  public void changeGear(int newValue) {
    gear = newValue;
  }

  public void speedUp(int increment) {
    speed += increment;
  }

  public void applyBrakes(int decrement) {
    speed -= decrement;
  }

  public void printStates() {
    IO.println("ACME Bicycle - cadence: " + cadence + " speed: " + speed + " gear: " + gear);
  }

}
