public class Main {
    public static void main(String[] args) {
        Education education = new Education("Italy", "Italian academy");
        Administrator administrator = new Administrator(29, "Kyrgyz", education, Salary.TIMEBASED);
        administrator.giveInstructions();
        administrator.giveInstructions("fire the waiter");
        System.out.println("_______________________");

        Education education1 = new Education("Spain", "Spain academy");
        Employee employee1 = new Employee(19, "Kyrgyz", education, Salary.TIMEBASED, "Tilek");
        administrator.giveInstructions();
        administrator.giveInstructions("fire the waiter");
        System.out.println("_______________________");

        Education education2 = new Education("Germany", "Germany academy");
        Employee employee2 = new Employee(33, "Kyrgyz", education, Salary.PIECEWORK, "Azamat");
        administrator.giveInstructions();
        administrator.giveInstructions("fire the waiter");
        System.out.println("_______________________");


    }
}