package com.corexfin.model;

import com.corexfin.pk_id_generator.BranchIdGenerator;
import com.corexfin.pk_id_generator.IfscCodeGenerator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name="branch")
public class Branch {
    @Id
    @GeneratedValue(generator = "branch_uuid")
    @GenericGenerator(name = "branch_uuid",type= BranchIdGenerator.class)
    @Column(name = "branch_id")
    private String id;
    @Column(name = "branch_name",unique = true)
    private String  name;

    @Column(name="branch_ifsc_code",unique = true)
    @GenericGenerator(name = "ifsc_code_generate",type = IfscCodeGenerator.class)
    String ifscCode;

    @Column(name = "branch_micr_code",unique = true)
    @SequenceGenerator(name = "micr_code_generator",initialValue =  250005000,allocationSize = 1)
    private String  micrCode;

    @Column(name="branch_email",unique = true)
    private String  email;
    @Column(name = "branch_phone",unique = true)
    private String  phone;
    @Column(name="branch_type",unique = true)
    private String  type;
    @Column(name = "bank_id",unique = true)
    private String  bankId;

    public Branch(){
    }

    public Branch(String id, String name, String ifscCode, String micrCode, String email, String phone, String type, String addressDetails, String bankId) {
        this.id = id;
        this.name = name;
        this.ifscCode = ifscCode;
        this.micrCode = micrCode;
        this.email = email;
        this.phone = phone;
        this.type = type;

        this.bankId = bankId;
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

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getMicrCode() {
        return micrCode;
    }

    public void setMicrCode(String micrCode) {
        this.micrCode = micrCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", micrCode='" + micrCode + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", type='" + type + '\'' +
                ", addressDetails='" + addressDetails + '\'' +
                ", bankId='" + bankId + '\'' +
                '}';
    }
}
