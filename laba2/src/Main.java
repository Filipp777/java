public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(sum(nums, ExpressionHelper::isEven));
        Expression expr = ExpressionHelper::isPositive;
        System.out.println(sum(nums, expr));
    }
    private static int sum (int[] numbers, Expression func)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }


/*public class Main {
    public static void main(String[] args) {
        //LambdaApp.main(args); // Вызов метода main класса LambdaApp
        Expression func = n -> n % 2 == 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(nums, func)); // 20
        int x = sum(nums, (n)-> n > 5); // сумма чисел, которые больше 5
        System.out.println(x); // 30
    }
        private static int sum( int[] numbers, Expression func)
        {
            int result = 0;
            for (int i : numbers) {
                if (func.isEqual(i))
                    result += i;
            }
            return result;
        }*/
    /*public class LambdaApp {
        public static void main(String[] args) {
            Operationables<Integer> operation1 = (x, y)-> x + y;
            Operationables<String> operation2 = (x, y) -> x + y;
            System.out.println(operation1.calculate(20, 10)); //30
            System.out.println(operation2.calculate("20", "10")); //2010
        }
    }
    public interface Operationables<T> {
        T calculate(T x, T y);
    }*/
    /*public class LambdaApp {
        static int x = 10;
        static int y = 20;
        public static void main(String[] args) {
            Operationable operation = (int x, int y)-> {
                if(y==0)
                    return 0;
                else return x/y;
            };
            System.out.println(operation.calculate(20, 10)); //2
            System.out.println(operation.calculate(20, 0)); //0
        }
    }*/
    /*public class LambdaApp {
        public static void main(String[] args) {
            int n=70;
            int m=30;
            Operation op = ()->{
                //n=100; - так нельзя сделать
                return m+n;
            };
            // n=100; - так тоже нельзя
            System.out.println(op.calculate()); // 100
        }
    }*/
    /*public class LambdaApp {
        static int x = 10;
        static int y = 20;
        public static void main(String[] args) {

            Operation operation = () -> {
                x = 30;
                return x+y;
            };
            System.out.println(operation.calculate()); // 50
            System.out.println(x); // 30 - значение x изменилось
        }
    }*/
    /*public class LambdaApp {
        public static void main(String[] args) {
            Operationable operation1;
            Operationable operation2;
            Operationable operation3;
            operation1 = (x,y)->x+y;
            operation2 = (x,y)->x-y;
            operation3 = (x,y)->x*y;
            int result1 = operation1.calculate(10, 20);
            int result2 = operation2.calculate(10, 20);
            int result3 = operation3.calculate(10, 20);
            System.out.println(result1); //30
            System.out.println(result2); //-10
            System.out.println(result3); //200
            Printable printer = s->System.out.println(s);
            printer.print("Hello Java!");
        }
    }*/
    /*public class LambdaApp {
        public static void main(String[] args) {
            Operationable op = new Operationable(){
                public int calculate(int x, int y){
                    return x + y;
                }
            };
            int z = op.calculate(20, 10);
            System.out.println(z); // 30
        }
    }
    */

    public interface Operationable {
        int calculate(int x, int y);
    }
    interface Printable{
        void print(String s);
    }
    interface Operation {
        int calculate();
    }
    // Функциональный интерфейс Expression
    interface Expression {
        boolean isEqual(int n);
    }
    public class ExpressionHelper {
        static boolean isEven(int n) {
            return n % 2 == 0;
        }

        static boolean isPositive(int n) {
            return n > 0;
        }
    }
}



