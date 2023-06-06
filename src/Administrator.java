public class Administrator extends Owner {
    private int age;
    private String nation;

    public Administrator(int age, String nation, Education education, Salary salary) {
        super();
        this.age = age;
        this.nation = nation;
        super.setEducation(education);
        super.setSalary(salary);
    }

    public int getAge() {
        return age;
    }

    public String getNation() {
        return nation;
    }

    public final void giveInstructions(){
        System.out.println("Hire a waiter");
    }
    public String giveInstructions(String instructions){
        System.out.println(instructions);
        return null;
    }

    public String getInfo(){
        return "Age: " + getAge() +
                "\nNationality: " + getNation() + " (administrator)"+
                "\nEducation: " + getEducation().getAcademy() +
                "\nFaculty of: " + getEducation().getCountry() +
                "\nSalary: " + this.getSalary();
    }
}
