package HW25and26;

import java.util.HashMap;
import java.util.Map;

public class EmployeeSalary {
    public static void main(String[] args) {
        Map<String,Double>employeeSalaries=new HashMap();
        employeeSalaries.put("Ahmed", 30000.0);
        employeeSalaries.put("Amaan",2500.0);
        employeeSalaries.put("Mari",2600.0);
        employeeSalaries.put("Amaani",2400.0);
        employeeSalaries.put("Kamari",2300.0);
        double highestSalary=0.0;
        String highestPaidEmployee=" ";
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            String employeeName = entry.getKey();
            double salary = entry.getValue();
            if (salary > highestSalary) {
                highestSalary = salary;
                highestPaidEmployee = employeeName;
            }

        }
        System.out.println(highestPaidEmployee+"=$"+highestSalary);
    }
}

