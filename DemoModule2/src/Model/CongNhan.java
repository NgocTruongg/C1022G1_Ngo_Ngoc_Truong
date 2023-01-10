package Model;

public class CongNhan {
    private String id;
    private String name;
    private String email;
    private String diaChi;

    public CongNhan() {
    }

    public CongNhan(String id, String name, String email, String diaChi) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.diaChi = diaChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", diaChi=" + diaChi +
                '}';
    }
}
