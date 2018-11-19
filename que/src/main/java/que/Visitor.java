package que;

import java.util.Objects;

class Visitor implements Comparable<Visitor> {
    private static final int INT = 60;
    private final String name;
    private final int age;

    Visitor(final String nameField, final int ageField) {
        this.name = nameField;
        this.age = ageField;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Visitor visitor = (Visitor) o;
        return Integer.compare(visitor.age, age) == 0
                && Objects.equals(name, visitor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Visitor{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(final Visitor visitor) {
        if (visitor.age >= INT) {
            return 1;
        } else {
            return -1;
        }
        }
    }


