public class Main {
    public static void main(String[] args) {

        // Car class
//        Car porche = new Car();
//        Car audi = new Car();
//        porche.setModel("Carrera");
//        System.out.println("The model of the car is "+ porche.getModel());
//        porche.setModel("Logan");
//        System.out.println("The model of the car is "+ porche.getModel());


        // Simple calculator class
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add: " + calculator.getAdditionalResult());
//        System.out.println("divide: " + calculator.getDivisionResult());
//        System.out.println("multiply: " + calculator.getMultiplicationResult());
//        System.out.println("substract: " + calculator.getSubstractionResult());
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(0);
//        System.out.println("divide: " + calculator.getDivisionResult());

        // Person class
//        Person person = new Person();
//        person.setFirstName(""); // firstname is set to empty;
//        person.setLastName(""); // lastname is set to empty;
//        person.setAge(10);
//        System.out.println("fullName: " + person.getFullName());
//        System.out.println("is teen: " + person.isTeen());
//        person.setFirstName("John");
//        person.setAge(18);
//        System.out.println("fullName: " + person.getFullName());
//        System.out.println("is teen: " + person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("fullName: " + person.getFullName());

        // Account class
//        Account bobsAccount = new Account("12345",0.00,"BOB MArlye","test@test.test","123-123-321-322");
//
//        System.out.println(bobsAccount.getCustomerName());
//        System.out.println(bobsAccount.getCustomerEmailAddress());
//        System.out.println();
//
//        Account emptyAccount = new Account();
//
//        System.out.println(emptyAccount.getCustomerName());
//        System.out.println(emptyAccount.getCustomerEmailAddress());
//        System.out.println();
//
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("0543-123-423");
//
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100.0);
//        bobsAccount.deposit(53);
//        bobsAccount.withdrawal(100.0);
//        System.out.println();
//
//        Account timsAccount = new Account("Tim","tim@email.com","123123");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
//        System.out.println("Current balance is: " + timsAccount.getBalance());
//        timsAccount.withdrawal(100.55);

        // VipCustomer class
//        VipCustomer person1 = new VipCustomer();
//        System.out.println(person1.getName());
//
//        VipCustomer person2 = new VipCustomer("bob",200.00);
//        System.out.println(person2.getName());
//
//        VipCustomer person3 = new VipCustomer("tim",100.00,"test@test.test");
//        System.out.println(person3.getName());
//        System.out.println(person3.getEmailAddress());

        // Wall class
        Wall wall0 = new Wall();
        System.out.println("Wall 0 getArea: " + wall0.getArea());
        wall0.setHeight(3.23);
        wall0.setWidth(-2.1);
        wall0.getHeight();
        wall0.getWidth();
        System.out.println("Wall 0 getArea: " + wall0.getArea());

        wall0.setWidth(3);
        System.out.println("Wall 0 getArea: " + wall0.getArea());

        Wall wall1 = new Wall(5.33, -2.22);
        wall1.getWidth();
        wall1.getHeight();
        System.out.println("Wall 1 getArea: " + wall1.getArea());

        Wall wall2 = new Wall(5.3, 5.1);
        System.out.println("Wall 2 getArea: " + wall2.getArea());
    }
}
