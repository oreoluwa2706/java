/**package tdd.CHAPTER3;

public class HealthRecords {
    public  String firstName;
    public  String lastName;

    public int monthOfBirth;
    public int dayOfBirth;
    public int yearOfBirth;
    public  int height;
    public  double weight;



    public HealthRecords(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth, int height, double weight ){

        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;

    }

    public  void setFirstName(String firstName){
        this.firstName = firstName;
    }
      public String getFirstName() {
        return firstName;
      }

      public void setLastName(String lastName){
        this.lastName = lastName;
      }

      public String getLastName() {
        return lastName;
      }

      public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
      }
       public int getMonthOfBirth() {
        return monthOfBirth;
       }

       public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
       }
       public int getDayOfBirth() {
        return dayOfBirth;
       }

       public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
       }
        public int getYearOfBirth() {
        return yearOfBirth;
        }

        public void setHeight(int height) {
        this.height = height;
        }
        public double getHeight() {
        return height;
        }
        public void setWeight(double weight) {
        this.weight = weight;
        }
        public double getWeight() {
        return weight;
    }
    public void age() {
        int age = 2022 - yearOfBirth;

        System.out.printf("%d%n", age);
        System.out.printf("%.2f", maximumheartrate);
    }
}

*/