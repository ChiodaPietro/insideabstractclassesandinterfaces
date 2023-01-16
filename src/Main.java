public class Main {
    public static void main(String[] args) {
        //we are using an abstract class without extending it
        Summ s= new Summ() {
            @Override
            public double sum(double b) {
                return getA()+b;
            }
        };
        //how to use an interface we don't implement
        //we don't need the type of the variables

        // we call the name of the interface, we name it, we pass the
        //parameters, we write an arrow, and we place th code inside the
        // curly brackets
        Test test= (s1, a, b) -> {
            return s1+(a+b);
        };
        //using the interface
        System.out.println(test.words("sum ", 10, 20));
    }
}
