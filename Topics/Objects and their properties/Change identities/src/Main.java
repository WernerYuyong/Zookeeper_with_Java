
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempNameP1 = p1.name;
        int tempAgeP1 = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = tempNameP1;
        p2.age = tempAgeP1;
    }
}

/* improved version:

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class MakingChanges {
    public static void swapIdentities(Person p1, Person p2) {
        String tempName = p1.getName();
        int tempAge = p1.getAge();
        p1.setName(p2.getName());
        p1.setAge(p2.getAge());
        p2.setName(tempName);
        p2.setAge(tempAge);
    }
}
 */
