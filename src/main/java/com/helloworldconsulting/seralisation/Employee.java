package helloworldconsulting.seralisation;

import java.io.Serializable;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;
    private transient String password; // This will not be serialized

    public Employee(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", id=" + id +
            ", password='" + password + '\'' +
            '}';
    }
}
