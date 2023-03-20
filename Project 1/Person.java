public class Person implements Comparable<Person> {
    private String name;
    private int birthYear;

    public Person() {
        name = "";
        birthYear = 0;
    }

    public Person(String name, int birthYear) {
        if (birthYear > 0) {
            this.birthYear = birthYear;
        } else {
            this.birthYear = 0;
        }
        if (name != "" && name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setName(String name) {
        if (name != "" && name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    public void setBirthYear(int birthYear) {
        if (birthYear > 0) {
            this.birthYear = birthYear;
        } else {
            this.birthYear = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (o instanceof Person) {
            Person otherPerson = (Person) o;
            if (this.getName().equals(otherPerson.getName())) {
                if (this.getBirthYear() == otherPerson.getBirthYear()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
    }

    @Override
    public int compareTo(Person p) {
        if (this.getBirthYear() < p.getBirthYear()) {
            return -1;
        }

        else if (this.getBirthYear() > p.getBirthYear()) {
            return 1;

        } else {
            return 0;
        }

    }
}
