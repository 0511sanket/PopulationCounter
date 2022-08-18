package population.density;

public class Signup 
{
    private String regNo;
    private String name;
    private String city;
    private String pincode;
    private String contactNo;
    private String age;  
    private String password;
    private String confirmPassword;

    public Signup() {
    }
    
    
    public Signup(String regNo, String name, String city, String pincode, String contactNo, String age, String password, String confirmPassword) {
        this.regNo = regNo;
        this.name = name;
        this.city = city;
        this.pincode = pincode;
        this.contactNo = contactNo;
        this.age = age;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

  public   Signup(String name, String city, String pincode, String contactNo, String age, String password, String confirmPassword) {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
}
 
