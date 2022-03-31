public class Account {
    public final void withdraw(double amount) {
        double newBalance = balance - amount;

        if(newBalance > 0){
            balance = newBalance;
        }
    }
    class A {
        public  void print() {
            System.out.println("in A");
        }
    }

    class B extends A {
        public void print() {
            System.out.println("in B");
        }
    }

    class Test {
        public static void main(String[] args) {
            A myObject = new B();
            myObject.print(); // prints “in A”
        }
    }
}
