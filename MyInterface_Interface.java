interface MyInterface {
    public void method1();
    public int method2();
}

abstract class MyInterface2 implements MyInterface {
    public void method1() {
        System.out.println("Implementation of Method1");
    }

    public void nethod2() {
        System.out.println("Implementation of Method2");
    }

    public static void main(String[] args) {
        MyInterface obj = new MyInterface2();
        obj.method1();
        obj.method2();
    }
}