package tasks1.gpt;

import java.util.List;
import java.util.stream.Collectors;

public class Task13ClassPerson {
    private String name;
    private  int age;

    public Task13ClassPerson(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\''  +
                ", age=" + age;
    }

    public List<Task13ClassPerson> listFilterAgeSelectName(List<Task13ClassPerson> listPerson){
        return listPerson.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
    }

}
