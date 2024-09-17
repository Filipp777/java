import java.time.LocalDate;

class main {
    public static void main(String[] args) {
        Object Employee = new Object() {
            String name_surname = "Иосиф Виссарионович Джугашвили";
            LocalDate birthdate = LocalDate.of(1878, 12, 18);
            String phone = "+7 777 777 7777 ";
            String address = "Ивановская площадь";

            void printObjectEmploerInfo(){
                System.out.println("ФИО сотрудника:  " + name_surname);
                System.out.println("Дата рождения: " + birthdate );
                System.out.println("Номер телефона: " + phone);
                System.out.println("Адрес: " + address);
            }
        };
        System.out.println("Информация о сотруднике");
        Employee.getClass().getDeclaredMethods()[0].setAccessible(true);
        try {
            Employee.getClass().getDeclaredMethods()[0].invoke(Employee);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        Object post = new Object() {
            String named = "Народный комиссар обороны СССР";
            double salary = 225.00; //в рублях

            void printPostInfo() {
                System.out.println("Должность: " + named);
                System.out.println("Оклад: " + salary);
            }
        };

        System.out.println("Информация о должностях: ");
        post.getClass().getDeclaredMethods()[0].setAccessible(true);
        try {
            post.getClass().getDeclaredMethods()[0].invoke(post);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
