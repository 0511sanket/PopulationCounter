/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package population.density;

public class EntryForm {
      private String regNo;
      private String name;
      private String age;
      private String gender;
      private String city;
      private String pincode;
      private String address;
      private String contactNo;

    public EntryForm() {
    }

    public EntryForm(String regNo, String name, String age, String gender, String city, String pincode, String address, String contactNo) {
        this.regNo = regNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.pincode = pincode;
        this.address = address;
        this.contactNo = contactNo;
    }
      

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
      
}
