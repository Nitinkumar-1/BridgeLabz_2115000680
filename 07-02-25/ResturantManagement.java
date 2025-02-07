class ResturantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101);
        System.out.println(chef.displayRole());
        chef.performDuties();

        Waiter waiter = new Waiter("John Doe", 102);
        System.out.println(waiter.displayRole());
        waiter.performDuties();
    }
}

class Person {
    String name;
    int id;
    
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    String displayRole() {
        return "General Person";
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    
    @Override
    String displayRole() {
        return "Chef: " + name;
    }
    
    @Override
    public void performDuties() {
        System.out.println(name + " is cooking dishes.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    
    @Override
    String displayRole() {
        return "Waiter: " + name;
    }
    
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers.");
    }
}
