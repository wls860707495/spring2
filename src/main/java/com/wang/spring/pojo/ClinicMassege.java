package com.wang.spring.pojo;
import org.apache.ibatis.type.Alias;
@Alias("ClinicMassege")
public class ClinicMassege {
    private int clinicid;
    private int userid;
    private String clinic_name;

    public int getClinicid() {
        return clinicid;
    }

    public void setClinicid(int clinicid) {
        this.clinicid = clinicid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getClinic_name() {
        return clinic_name;
    }

    public void setClinic_name(String clinic_name) {
        this.clinic_name = clinic_name;
    }

    public String getClinic_email() {
        return clinic_email;
    }

    public void setClinic_email(String clinic_email) {
        this.clinic_email = clinic_email;
    }

    public String getClinic_tel() {
        return clinic_tel;
    }

    public void setClinic_tel(String clinic_tel) {
        this.clinic_tel = clinic_tel;
    }

    public String getClinic_type() {
        return clinic_type;
    }

    public void setClinic_type(String clinic_type) {
        this.clinic_type = clinic_type;
    }

    public String getClinic_head() {
        return clinic_head;
    }

    public void setClinic_head(String clinic_head) {
        this.clinic_head = clinic_head;
    }

    public String getHead_tel() {
        return head_tel;
    }

    public void setHead_tel(String head_tel) {
        this.head_tel = head_tel;
    }

    public String getHead_email() {
        return head_email;
    }

    public void setHead_email(String head_email) {
        this.head_email = head_email;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getRegis_num() {
        return regis_num;
    }

    public void setRegis_num(String regis_num) {
        this.regis_num = regis_num;
    }

    public String getBank_branch() {
        return bank_branch;
    }

    public void setBank_branch(String bank_branch) {
        this.bank_branch = bank_branch;
    }

    public String getBank_accout() {
        return bank_accout;
    }

    public void setBank_accout(String bank_accout) {
        this.bank_accout = bank_accout;
    }

    public String getAccout_name() {
        return accout_name;
    }

    public void setAccout_name(String accout_name) {
        this.accout_name = accout_name;
    }

    private String clinic_email;
    private String clinic_tel;
    private String clinic_type;
    private String clinic_head;
    private String head_tel;
    private String head_email;
    private String bank_name;
    private String regis_num;
    private String bank_branch;
    private String bank_accout;
    private String accout_name;

}
