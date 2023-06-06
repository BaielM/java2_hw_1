public final class Employee extends Administrator {
    private String name;

    public Employee(int age, String nation, Education education, Salary salary, String name) {
        super(age, nation, education, salary);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName" + getName();
    }
}
