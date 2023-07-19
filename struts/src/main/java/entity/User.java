package entity;

public class User {
    private Integer id;
    private String userName;
    private Integer sex; //1 :男  2:女
    private String phone;

    public User(Integer id, String userName, Integer sex, String phone) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.phone = phone;
    }

    public User() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
