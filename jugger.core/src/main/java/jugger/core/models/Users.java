package jugger.core.models;

import java.sql.Date;
import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class Users {
    private String usrSid;
    private String usrSno;
    private String usrPwd;
    private String usrName;
    private int usrGender;
    private String usrPhoto;
    private Date usrBirthday;
    private String usrOrg;
    private int usrType;
    private int usrStatus;
    private String usrEmail;
    private String usrPhone;
    private String usrDomain;
    private Boolean usrSys;
    private String usrExt;
    private String usrDes;
    private Collection<RoleUserRef> roleUserRefsByUsrSid;
    private Orgnization orgnizationByUsrOrg;

    public String getUsrSid() {
        return usrSid;
    }

    public void setUsrSid(String usrSid) {
        this.usrSid = usrSid;
    }

    public String getUsrSno() {
        return usrSno;
    }

    public void setUsrSno(String usrSno) {
        this.usrSno = usrSno;
    }

    public String getUsrPwd() {
        return usrPwd;
    }

    public void setUsrPwd(String usrPwd) {
        this.usrPwd = usrPwd;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public int getUsrGender() {
        return usrGender;
    }

    public void setUsrGender(int usrGender) {
        this.usrGender = usrGender;
    }

    public String getUsrPhoto() {
        return usrPhoto;
    }

    public void setUsrPhoto(String usrPhoto) {
        this.usrPhoto = usrPhoto;
    }

    public Date getUsrBirthday() {
        return usrBirthday;
    }

    public void setUsrBirthday(Date usrBirthday) {
        this.usrBirthday = usrBirthday;
    }

    public String getUsrOrg() {
        return usrOrg;
    }

    public void setUsrOrg(String usrOrg) {
        this.usrOrg = usrOrg;
    }

    public int getUsrType() {
        return usrType;
    }

    public void setUsrType(int usrType) {
        this.usrType = usrType;
    }

    public int getUsrStatus() {
        return usrStatus;
    }

    public void setUsrStatus(int usrStatus) {
        this.usrStatus = usrStatus;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrPhone() {
        return usrPhone;
    }

    public void setUsrPhone(String usrPhone) {
        this.usrPhone = usrPhone;
    }

    public String getUsrDomain() {
        return usrDomain;
    }

    public void setUsrDomain(String usrDomain) {
        this.usrDomain = usrDomain;
    }

    public Boolean getUsrSys() {
        return usrSys;
    }

    public void setUsrSys(Boolean usrSys) {
        this.usrSys = usrSys;
    }

    public String getUsrExt() {
        return usrExt;
    }

    public void setUsrExt(String usrExt) {
        this.usrExt = usrExt;
    }

    public String getUsrDes() {
        return usrDes;
    }

    public void setUsrDes(String usrDes) {
        this.usrDes = usrDes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (usrGender != users.usrGender) return false;
        if (usrType != users.usrType) return false;
        if (usrStatus != users.usrStatus) return false;
        if (usrSid != null ? !usrSid.equals(users.usrSid) : users.usrSid != null) return false;
        if (usrSno != null ? !usrSno.equals(users.usrSno) : users.usrSno != null) return false;
        if (usrPwd != null ? !usrPwd.equals(users.usrPwd) : users.usrPwd != null) return false;
        if (usrName != null ? !usrName.equals(users.usrName) : users.usrName != null) return false;
        if (usrPhoto != null ? !usrPhoto.equals(users.usrPhoto) : users.usrPhoto != null) return false;
        if (usrBirthday != null ? !usrBirthday.equals(users.usrBirthday) : users.usrBirthday != null) return false;
        if (usrOrg != null ? !usrOrg.equals(users.usrOrg) : users.usrOrg != null) return false;
        if (usrEmail != null ? !usrEmail.equals(users.usrEmail) : users.usrEmail != null) return false;
        if (usrPhone != null ? !usrPhone.equals(users.usrPhone) : users.usrPhone != null) return false;
        if (usrDomain != null ? !usrDomain.equals(users.usrDomain) : users.usrDomain != null) return false;
        if (usrSys != null ? !usrSys.equals(users.usrSys) : users.usrSys != null) return false;
        if (usrExt != null ? !usrExt.equals(users.usrExt) : users.usrExt != null) return false;
        if (usrDes != null ? !usrDes.equals(users.usrDes) : users.usrDes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usrSid != null ? usrSid.hashCode() : 0;
        result = 31 * result + (usrSno != null ? usrSno.hashCode() : 0);
        result = 31 * result + (usrPwd != null ? usrPwd.hashCode() : 0);
        result = 31 * result + (usrName != null ? usrName.hashCode() : 0);
        result = 31 * result + usrGender;
        result = 31 * result + (usrPhoto != null ? usrPhoto.hashCode() : 0);
        result = 31 * result + (usrBirthday != null ? usrBirthday.hashCode() : 0);
        result = 31 * result + (usrOrg != null ? usrOrg.hashCode() : 0);
        result = 31 * result + usrType;
        result = 31 * result + usrStatus;
        result = 31 * result + (usrEmail != null ? usrEmail.hashCode() : 0);
        result = 31 * result + (usrPhone != null ? usrPhone.hashCode() : 0);
        result = 31 * result + (usrDomain != null ? usrDomain.hashCode() : 0);
        result = 31 * result + (usrSys != null ? usrSys.hashCode() : 0);
        result = 31 * result + (usrExt != null ? usrExt.hashCode() : 0);
        result = 31 * result + (usrDes != null ? usrDes.hashCode() : 0);
        return result;
    }

    public Collection<RoleUserRef> getRoleUserRefsByUsrSid() {
        return roleUserRefsByUsrSid;
    }

    public void setRoleUserRefsByUsrSid(Collection<RoleUserRef> roleUserRefsByUsrSid) {
        this.roleUserRefsByUsrSid = roleUserRefsByUsrSid;
    }

    public Orgnization getOrgnizationByUsrOrg() {
        return orgnizationByUsrOrg;
    }

    public void setOrgnizationByUsrOrg(Orgnization orgnizationByUsrOrg) {
        this.orgnizationByUsrOrg = orgnizationByUsrOrg;
    }
}
