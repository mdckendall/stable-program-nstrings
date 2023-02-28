public class Horse {
  private String name;
  private double weight;
  private boolean on;

  public Horse(String name, double weight, boolean on) {
    this.name = name;
    this.weight = weight;
    this.on = on;
  }
  
public String toString() {
    return "Name: " + name + "Weight: " + weight + "Tame: " + on;
  }
}