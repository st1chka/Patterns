package Data_Mapper;

public class Person {
    private int idPerson;
    private String name;
    private String phone;

    public Person(int idPerson, String name, String phone) {
        this.idPerson = idPerson;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + idPerson +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getId() {
        return idPerson;
    }

    public void setId(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
