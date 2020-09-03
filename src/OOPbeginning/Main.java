package OOPbeginning;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees[0] = new Employee("Olga", "Accountant", "olga@gb.ru", 569087, 45000, 41);
        employees[1] = new Employee("Dima", "Analythic", "dima@gb.ru", 907856, 98000, 35);
        employees[2] = new Employee("Liza", "Laborant", "liza@gb.ru", 654378, 145000, 23);
        employees[3] = new Employee("Katya", "Director", "katya@gb.ru", 987038, 200000, 53);
        employees[4] = new Employee("Andrew", "Manager", "andrew@gb.ru", 983412, 40500, 31);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].info();
            }
        }
    }
}
