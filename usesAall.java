class surname {
    String name;

    surname(String name) {
        this.name = name;
    }

    void method() {
        System.out.println("YOUR SURNAME IS: " + name);
    }
}

class middlename {
    String middle;

    middlename(String middle) {
        this.middle = middle;
    }

    void method2(surname s) { 
        System.out.println("YOUR MIDDLENAME IS: " + middle);
        s.method();
    }
}

class main {
    public static void main(String[] args) {

        middlename m = new middlename("vishnu");
        surname s = new surname("vennam");

        m.method2(s);
    }
}