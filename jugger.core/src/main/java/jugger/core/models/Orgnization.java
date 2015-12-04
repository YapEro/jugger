package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class Orgnization {
    private String orgSid;
    private String orgName;
    private String orgParent;
    private int orgLevel;
    private String orgPath;
    private int orgType;
    private String orgCharge;
    private String orgExt;
    private String orgDesc;
    private Collection<RoleUserRef> roleUserRefsByOrgSid;
    private Collection<Users> usersesByOrgSid;

    public String getOrgSid() {
        return orgSid;
    }

    public void setOrgSid(String orgSid) {
        this.orgSid = orgSid;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgParent() {
        return orgParent;
    }

    public void setOrgParent(String orgParent) {
        this.orgParent = orgParent;
    }

    public int getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(int orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getOrgPath() {
        return orgPath;
    }

    public void setOrgPath(String orgPath) {
        this.orgPath = orgPath;
    }

    public int getOrgType() {
        return orgType;
    }

    public void setOrgType(int orgType) {
        this.orgType = orgType;
    }

    public String getOrgCharge() {
        return orgCharge;
    }

    public void setOrgCharge(String orgCharge) {
        this.orgCharge = orgCharge;
    }

    public String getOrgExt() {
        return orgExt;
    }

    public void setOrgExt(String orgExt) {
        this.orgExt = orgExt;
    }

    public String getOrgDesc() {
        return orgDesc;
    }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orgnization that = (Orgnization) o;

        if (orgLevel != that.orgLevel) return false;
        if (orgType != that.orgType) return false;
        if (orgSid != null ? !orgSid.equals(that.orgSid) : that.orgSid != null) return false;
        if (orgName != null ? !orgName.equals(that.orgName) : that.orgName != null) return false;
        if (orgParent != null ? !orgParent.equals(that.orgParent) : that.orgParent != null) return false;
        if (orgPath != null ? !orgPath.equals(that.orgPath) : that.orgPath != null) return false;
        if (orgCharge != null ? !orgCharge.equals(that.orgCharge) : that.orgCharge != null) return false;
        if (orgExt != null ? !orgExt.equals(that.orgExt) : that.orgExt != null) return false;
        if (orgDesc != null ? !orgDesc.equals(that.orgDesc) : that.orgDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orgSid != null ? orgSid.hashCode() : 0;
        result = 31 * result + (orgName != null ? orgName.hashCode() : 0);
        result = 31 * result + (orgParent != null ? orgParent.hashCode() : 0);
        result = 31 * result + orgLevel;
        result = 31 * result + (orgPath != null ? orgPath.hashCode() : 0);
        result = 31 * result + orgType;
        result = 31 * result + (orgCharge != null ? orgCharge.hashCode() : 0);
        result = 31 * result + (orgExt != null ? orgExt.hashCode() : 0);
        result = 31 * result + (orgDesc != null ? orgDesc.hashCode() : 0);
        return result;
    }

    public Collection<RoleUserRef> getRoleUserRefsByOrgSid() {
        return roleUserRefsByOrgSid;
    }

    public void setRoleUserRefsByOrgSid(Collection<RoleUserRef> roleUserRefsByOrgSid) {
        this.roleUserRefsByOrgSid = roleUserRefsByOrgSid;
    }

    public Collection<Users> getUsersesByOrgSid() {
        return usersesByOrgSid;
    }

    public void setUsersesByOrgSid(Collection<Users> usersesByOrgSid) {
        this.usersesByOrgSid = usersesByOrgSid;
    }
}
