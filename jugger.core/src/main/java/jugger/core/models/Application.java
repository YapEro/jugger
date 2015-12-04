package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class Application {
    private String appSid;
    private String appSno;
    private String appName;
    private String appDbConn;
    private int appStatus;
    private int appType;
    private String appPath;
    private String appExt;
    private String appDesc;
    private Collection<ApiService> apiServicesByAppSid;
    private Collection<AuthPoint> authPointsByAppSid;
    private Collection<CodeService> codeServicesByAppSid;
    private Collection<DataDictionary> dataDictionariesByAppSid;
    private Collection<EntityConfig> entityConfigsByAppSid;
    private Collection<Module> modulesByAppSid;
    private Collection<OperationLog> operationLogsByAppSid;
    private Collection<Role> rolesByAppSid;
    private Collection<SystemLog> systemLogsByAppSid;
    private Collection<SystemMenu> systemMenusByAppSid;
    private Collection<TextResource> textResourcesByAppSid;
    private Collection<ViewService> viewServicesByAppSid;
    private Collection<WorkflowConfig> workflowConfigsByAppSid;

    public String getAppSid() {
        return appSid;
    }

    public void setAppSid(String appSid) {
        this.appSid = appSid;
    }

    public String getAppSno() {
        return appSno;
    }

    public void setAppSno(String appSno) {
        this.appSno = appSno;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDbConn() {
        return appDbConn;
    }

    public void setAppDbConn(String appDbConn) {
        this.appDbConn = appDbConn;
    }

    public int getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(int appStatus) {
        this.appStatus = appStatus;
    }

    public int getAppType() {
        return appType;
    }

    public void setAppType(int appType) {
        this.appType = appType;
    }

    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public String getAppExt() {
        return appExt;
    }

    public void setAppExt(String appExt) {
        this.appExt = appExt;
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Application that = (Application) o;

        if (appStatus != that.appStatus) return false;
        if (appType != that.appType) return false;
        if (appSid != null ? !appSid.equals(that.appSid) : that.appSid != null) return false;
        if (appSno != null ? !appSno.equals(that.appSno) : that.appSno != null) return false;
        if (appName != null ? !appName.equals(that.appName) : that.appName != null) return false;
        if (appDbConn != null ? !appDbConn.equals(that.appDbConn) : that.appDbConn != null) return false;
        if (appPath != null ? !appPath.equals(that.appPath) : that.appPath != null) return false;
        if (appExt != null ? !appExt.equals(that.appExt) : that.appExt != null) return false;
        if (appDesc != null ? !appDesc.equals(that.appDesc) : that.appDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = appSid != null ? appSid.hashCode() : 0;
        result = 31 * result + (appSno != null ? appSno.hashCode() : 0);
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (appDbConn != null ? appDbConn.hashCode() : 0);
        result = 31 * result + appStatus;
        result = 31 * result + appType;
        result = 31 * result + (appPath != null ? appPath.hashCode() : 0);
        result = 31 * result + (appExt != null ? appExt.hashCode() : 0);
        result = 31 * result + (appDesc != null ? appDesc.hashCode() : 0);
        return result;
    }

    public Collection<ApiService> getApiServicesByAppSid() {
        return apiServicesByAppSid;
    }

    public void setApiServicesByAppSid(Collection<ApiService> apiServicesByAppSid) {
        this.apiServicesByAppSid = apiServicesByAppSid;
    }

    public Collection<AuthPoint> getAuthPointsByAppSid() {
        return authPointsByAppSid;
    }

    public void setAuthPointsByAppSid(Collection<AuthPoint> authPointsByAppSid) {
        this.authPointsByAppSid = authPointsByAppSid;
    }

    public Collection<CodeService> getCodeServicesByAppSid() {
        return codeServicesByAppSid;
    }

    public void setCodeServicesByAppSid(Collection<CodeService> codeServicesByAppSid) {
        this.codeServicesByAppSid = codeServicesByAppSid;
    }

    public Collection<DataDictionary> getDataDictionariesByAppSid() {
        return dataDictionariesByAppSid;
    }

    public void setDataDictionariesByAppSid(Collection<DataDictionary> dataDictionariesByAppSid) {
        this.dataDictionariesByAppSid = dataDictionariesByAppSid;
    }

    public Collection<EntityConfig> getEntityConfigsByAppSid() {
        return entityConfigsByAppSid;
    }

    public void setEntityConfigsByAppSid(Collection<EntityConfig> entityConfigsByAppSid) {
        this.entityConfigsByAppSid = entityConfigsByAppSid;
    }

    public Collection<Module> getModulesByAppSid() {
        return modulesByAppSid;
    }

    public void setModulesByAppSid(Collection<Module> modulesByAppSid) {
        this.modulesByAppSid = modulesByAppSid;
    }

    public Collection<OperationLog> getOperationLogsByAppSid() {
        return operationLogsByAppSid;
    }

    public void setOperationLogsByAppSid(Collection<OperationLog> operationLogsByAppSid) {
        this.operationLogsByAppSid = operationLogsByAppSid;
    }

    public Collection<Role> getRolesByAppSid() {
        return rolesByAppSid;
    }

    public void setRolesByAppSid(Collection<Role> rolesByAppSid) {
        this.rolesByAppSid = rolesByAppSid;
    }

    public Collection<SystemLog> getSystemLogsByAppSid() {
        return systemLogsByAppSid;
    }

    public void setSystemLogsByAppSid(Collection<SystemLog> systemLogsByAppSid) {
        this.systemLogsByAppSid = systemLogsByAppSid;
    }

    public Collection<SystemMenu> getSystemMenusByAppSid() {
        return systemMenusByAppSid;
    }

    public void setSystemMenusByAppSid(Collection<SystemMenu> systemMenusByAppSid) {
        this.systemMenusByAppSid = systemMenusByAppSid;
    }

    public Collection<TextResource> getTextResourcesByAppSid() {
        return textResourcesByAppSid;
    }

    public void setTextResourcesByAppSid(Collection<TextResource> textResourcesByAppSid) {
        this.textResourcesByAppSid = textResourcesByAppSid;
    }

    public Collection<ViewService> getViewServicesByAppSid() {
        return viewServicesByAppSid;
    }

    public void setViewServicesByAppSid(Collection<ViewService> viewServicesByAppSid) {
        this.viewServicesByAppSid = viewServicesByAppSid;
    }

    public Collection<WorkflowConfig> getWorkflowConfigsByAppSid() {
        return workflowConfigsByAppSid;
    }

    public void setWorkflowConfigsByAppSid(Collection<WorkflowConfig> workflowConfigsByAppSid) {
        this.workflowConfigsByAppSid = workflowConfigsByAppSid;
    }
}
