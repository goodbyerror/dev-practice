class A {
    private final B thisIsB;

    A (B thisIsB) {
        this.thisIsB = thisIsB;
    }

    String nameOfB() {
        return thisIsB.getName();
    }
}

class B {
    private String name;

    B (String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

public class C {
    public static void main(String[] args) {
        String name = "B";
        B b = new B(name);
        A a = new A(b);

        System.out.println(a.nameOfB());

    }

}
