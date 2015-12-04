package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class Role {
    private String rlSid;
    private String rlName;
    private String rlAppSid;
    private Boolean rlSys;
    private int rlStatus;
    private String rlExt;
    private String rlDesc;
    private Application applicationByRlAppSid;
    private Collection<RoleUserRef> roleUserRefsByRlSid;

    public String getRlSid() {
        return rlSid;
    }

    public void setRlSid(String rlSid) {
        this.rlSid = rlSid;
    }

    public String getRlName() {
        return rlName;
    }

    public void setRlName(String rlName) {
        this.rlName = rlName;
    }

    public String getRlAppSid() {
        return rlAppSid;
    }

    public void setRlAppSid(String rlAppSid) {
        this.rlAppSid = rlAppSid;
    }

    public Boolean getRlSys() {
        return rlSys;
    }

    public void setRlSys(Boolean rlSys) {
        this.rlSys = rlSys;
    }

    public int getRlStatus() {
        return rlStatus;
    }

    public void setRlStatus(int rlStatus) {
        this.rlStatus = rlStatus;
    }

    public String getRlExt() {
        return rlExt;
    }

    public void setRlExt(String rlExt) {
        this.rlExt = rlExt;
    }

    public String getRlDesc() {
        return rlDesc;
    }

    public void setRlDesc(String rlDesc) {
        this.rlDesc = rlDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (rlStatus != role.rlStatus) return false;
        if (rlSid != null ? !rlSid.equals(role.rlSid) : role.rlSid != null) return false;
        if (rlName != null ? !rlName.equals(role.rlName) : role.rlName != null) return false;
        if (rlAppSid != null ? !rlAppSid.equals(role.rlAppSid) : role.rlAppSid != null) return false;
        if (rlSys != null ? !rlSys.equals(role.rlSys) : role.rlSys != null) return false;
        if (rlExt != null ? !rlExt.equals(role.rlExt) : role.rlExt != null) return false;
        if (rlDesc != null ? !rlDesc.equals(role.rlDesc) : role.rlDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rlSid != null ? rlSid.hashCode() : 0;
        result = 31 * result + (rlName != null ? rlName.hashCode() : 0);
        result = 31 * result + (rlAppSid != null ? rlAppSid.hashCode() : 0);
        result = 31 * result + (rlSys != null ? rlSys.hashCode() : 0);
        result = 31 * result + rlStatus;
        result = 31 * result + (rlExt != null ? rlExt.hashCode() : 0);
        result = 31 * result + (rlDesc != null ? rlDesc.hashCode() : 0);
        return result;
    }

    public Application getApplicationByRlAppSid() {
        return applicationByRlAppSid;
    }

    public void setApplicationByRlAppSid(Application applicationByRlAppSid) {
        this.applicationByRlAppSid = applicationByRlAppSid;
    }

    public Collection<RoleUserRef> getRoleUserRefsByRlSid() {
        return roleUserRefsByRlSid;
    }

    public void setRoleUserRefsByRlSid(Collection<RoleUserRef> roleUserRefsByRlSid) {
        this.roleUserRefsByRlSid = roleUserRefsByRlSid;
    }
}
