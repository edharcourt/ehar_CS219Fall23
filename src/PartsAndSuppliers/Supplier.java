package PartsAndSuppliers;

public class Supplier {

    private int sno;
    private String name;
    private int status;
    private String city;

    public Supplier(int sno, String name, int status, String city) {
        this.sno = sno;
        this.name = name;
        this.status = status;
        this.city = city;
    }

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
