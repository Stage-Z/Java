interface MyInterface {
    public void method1();
    public int method2();
}

class MyInterface_Interface implements MyInterface {
    @Override
    public void method1() {
        System.out.println("Implementation of Method1");
    }

    @Override
    public int method2() {
        System.out.println("Implementation of Method2");
        return 2;
    }

    public static void main(String[] args) {
        MyInterface obj = new MyInterface_Interface();
        obj.method1();
        obj.method2();
    }
}