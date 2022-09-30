import java.util.Objects;

public class Animal {
    private String name;
    private int age;

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "не указано имя";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void eat() {
        System.out.println("кушать");
    }

    void sleep() {
        System.out.println("sleep");
    }

    void go() {
        System.out.println("идет");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public boolean equals(Animal a) {
        if (this.hashCode() == a.hashCode()) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
