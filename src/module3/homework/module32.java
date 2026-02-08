class Employee {

    private String name;
    private double baseSalary;
    // private String employeeType; // "Permanent", "Contract", "Intern"

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

// class EmployeeSalaryCalculator {

//     public double calculateSalary(Employee employee) {

//         if (employee.getEmployeeType().equals("Permanent")) {

//             return employee.getBaseSalary() * 1.2;

//         } else if (employee.getEmployeeType().equals("Contract")) {

//             return employee.getBaseSalary() * 1.1;

//         } else if (employee.getEmployeeType().equals("Intern")) {

//             return employee.getBaseSalary() * 0.8;

//         } else {

//             throw new UnsupportedOperationException("Employee type not supported");
//         }
//     }


// }


interface SalaryCalculator{
    void calculateSalaryPermanent();
}

class CalculateSalaryIntern implements SalaryCalculator{
    @Override
    public void calculateSalary(){
        return employee.getBaseSalary * 0.8;
    }
}

class CalculateSalaryContract implements SalaryCalculator{
    @Override
    public void calculateSalary(){
        return empleyee.getBaseSalary * 1.1;
    }
}

class CalculateSalaryPermanent implements SalaryCalculator{
    @Override
    public void calculateSalary(){
        return employee.getBaseSalary * 1.2;
    }
}
