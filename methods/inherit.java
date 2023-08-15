public class inherit {
  protected String brand = "OPPO";

  public void ringtone() {
    System.out.println("ringggggg!!!!");
  }
}
class Phone extends inherit {
  private String modelName = "A5S";

   public static void main(String[] args) {

    Phone myPhone = new Phone();

    myPhone.ringtone();

    System.out.println(myPhone.brand + " " + myPhone.modelName);
  }
}