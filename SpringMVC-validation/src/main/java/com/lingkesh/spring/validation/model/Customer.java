package com.lingkesh.spring.validation.model;

import com.lingkesh.spring.validation.returnMessage.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    @NotNull(message = "First name is required")
    @Size(min = 1, message = "First name is required")
    private String firstName;
    @NotNull(message = "Last name is required")
    @Size(min = 1, message = "Last name is required")
    private String lastName = "";

    @NotNull(message = "Free passes is required")
    @Min(value = 0, message = "Must be greater than or equal to 0")
    @Max(value = 10, message = "Must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Postal must be only 5 chars/digits")
    private String postalCode;

    @CourseCode
    private String courseCode;

    //This is for the custom messages
    @CourseCode(value = "TOPS", message = "must start with TOPS")
    private String phoneCode;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
