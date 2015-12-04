package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class Module {
    private String mdSid;
    private String mdSno;
    private String mdAppSid;
    private Integer mdStatus;
    private String mdExt;
    private String mdDesc;
    private Collection<EntityConfig> entityConfigsByMdSid;
    private Application applicationByMdAppSid;
    private Collection<SystemMenu> systemMenusByMdSid;

    public String getMdSid() {
        return mdSid;
    }

    public void setMdSid(String mdSid) {
        this.mdSid = mdSid;
    }

    public String getMdSno() {
        return mdSno;
    }

    public void setMdSno(String mdSno) {
        this.mdSno = mdSno;
    }

    public String getMdAppSid() {
        return mdAppSid;
    }

    public void setMdAppSid(String mdAppSid) {
        this.mdAppSid = mdAppSid;
    }

    public Integer getMdStatus() {
        return mdStatus;
    }

    public void setMdStatus(Integer mdStatus) {
        this.mdStatus = mdStatus;
    }

    public String getMdExt() {
        return mdExt;
    }

    public void setMdExt(String mdExt) {
        this.mdExt = mdExt;
    }

    public String getMdDesc() {
        return mdDesc;
    }

    public void setMdDesc(String mdDesc) {
        this.mdDesc = mdDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Module module = (Module) o;

        if (mdSid != null ? !mdSid.equals(module.mdSid) : module.mdSid != null) return false;
        if (mdSno != null ? !mdSno.equals(module.mdSno) : module.mdSno != null) return false;
        if (mdAppSid != null ? !mdAppSid.equals(module.mdAppSid) : module.mdAppSid != null) return false;
        if (mdStatus != null ? !mdStatus.equals(module.mdStatus) : module.mdStatus != null) return false;
        if (mdExt != null ? !mdExt.equals(module.mdExt) : module.mdExt != null) return false;
        if (mdDesc != null ? !mdDesc.equals(module.mdDesc) : module.mdDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mdSid != null ? mdSid.hashCode() : 0;
        result = 31 * result + (mdSno != null ? mdSno.hashCode() : 0);
        result = 31 * result + (mdAppSid != null ? mdAppSid.hashCode() : 0);
        result = 31 * result + (mdStatus != null ? mdStatus.hashCode() : 0);
        result = 31 * result + (mdExt != null ? mdExt.hashCode() : 0);
        result = 31 * result + (mdDesc != null ? mdDesc.hashCode() : 0);
        return result;
    }

    public Collection<EntityConfig> getEntityConfigsByMdSid() {
        return entityConfigsByMdSid;
    }

    public void setEntityConfigsByMdSid(Collection<EntityConfig> entityConfigsByMdSid) {
        this.entityConfigsByMdSid = entityConfigsByMdSid;
    }

    public Application getApplicationByMdAppSid() {
        return applicationByMdAppSid;
    }

    public void setApplicationByMdAppSid(Application applicationByMdAppSid) {
        this.applicationByMdAppSid = applicationByMdAppSid;
    }

    public Collection<SystemMenu> getSystemMenusByMdSid() {
        return systemMenusByMdSid;
    }

    public void setSystemMenusByMdSid(Collection<SystemMenu> systemMenusByMdSid) {
        this.systemMenusByMdSid = systemMenusByMdSid;
    }
}
