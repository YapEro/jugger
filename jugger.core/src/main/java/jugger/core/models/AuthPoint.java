package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class AuthPoint {
    private String apSid;
    private String apName;
    private String apAppSid;
    private String apModuleSid;
    private String apExt;
    private String apDesc;
    private Collection<AuthAssign> authAssignsByApSid;
    private Collection<AuthDependency> authDependenciesByApSid;
    private Application applicationByApAppSid;

    public String getApSid() {
        return apSid;
    }

    public void setApSid(String apSid) {
        this.apSid = apSid;
    }

    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }

    public String getApAppSid() {
        return apAppSid;
    }

    public void setApAppSid(String apAppSid) {
        this.apAppSid = apAppSid;
    }

    public String getApModuleSid() {
        return apModuleSid;
    }

    public void setApModuleSid(String apModuleSid) {
        this.apModuleSid = apModuleSid;
    }

    public String getApExt() {
        return apExt;
    }

    public void setApExt(String apExt) {
        this.apExt = apExt;
    }

    public String getApDesc() {
        return apDesc;
    }

    public void setApDesc(String apDesc) {
        this.apDesc = apDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthPoint authPoint = (AuthPoint) o;

        if (apSid != null ? !apSid.equals(authPoint.apSid) : authPoint.apSid != null) return false;
        if (apName != null ? !apName.equals(authPoint.apName) : authPoint.apName != null) return false;
        if (apAppSid != null ? !apAppSid.equals(authPoint.apAppSid) : authPoint.apAppSid != null) return false;
        if (apModuleSid != null ? !apModuleSid.equals(authPoint.apModuleSid) : authPoint.apModuleSid != null)
            return false;
        if (apExt != null ? !apExt.equals(authPoint.apExt) : authPoint.apExt != null) return false;
        if (apDesc != null ? !apDesc.equals(authPoint.apDesc) : authPoint.apDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apSid != null ? apSid.hashCode() : 0;
        result = 31 * result + (apName != null ? apName.hashCode() : 0);
        result = 31 * result + (apAppSid != null ? apAppSid.hashCode() : 0);
        result = 31 * result + (apModuleSid != null ? apModuleSid.hashCode() : 0);
        result = 31 * result + (apExt != null ? apExt.hashCode() : 0);
        result = 31 * result + (apDesc != null ? apDesc.hashCode() : 0);
        return result;
    }

    public Collection<AuthAssign> getAuthAssignsByApSid() {
        return authAssignsByApSid;
    }

    public void setAuthAssignsByApSid(Collection<AuthAssign> authAssignsByApSid) {
        this.authAssignsByApSid = authAssignsByApSid;
    }

    public Collection<AuthDependency> getAuthDependenciesByApSid() {
        return authDependenciesByApSid;
    }

    public void setAuthDependenciesByApSid(Collection<AuthDependency> authDependenciesByApSid) {
        this.authDependenciesByApSid = authDependenciesByApSid;
    }

    public Application getApplicationByApAppSid() {
        return applicationByApAppSid;
    }

    public void setApplicationByApAppSid(Application applicationByApAppSid) {
        this.applicationByApAppSid = applicationByApAppSid;
    }
}
