package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class CodeService {
    private String csSid;
    private String csAppSid;
    private String csModuleSid;
    private String csName;
    private int csAnnotation;
    private String csFilePath;
    private String csPrjName;
    private String csClass;
    private String csInterface;
    private String csDesc;
    private Application applicationByCsAppSid;

    public String getCsSid() {
        return csSid;
    }

    public void setCsSid(String csSid) {
        this.csSid = csSid;
    }

    public String getCsAppSid() {
        return csAppSid;
    }

    public void setCsAppSid(String csAppSid) {
        this.csAppSid = csAppSid;
    }

    public String getCsModuleSid() {
        return csModuleSid;
    }

    public void setCsModuleSid(String csModuleSid) {
        this.csModuleSid = csModuleSid;
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    public int getCsAnnotation() {
        return csAnnotation;
    }

    public void setCsAnnotation(int csAnnotation) {
        this.csAnnotation = csAnnotation;
    }

    public String getCsFilePath() {
        return csFilePath;
    }

    public void setCsFilePath(String csFilePath) {
        this.csFilePath = csFilePath;
    }

    public String getCsPrjName() {
        return csPrjName;
    }

    public void setCsPrjName(String csPrjName) {
        this.csPrjName = csPrjName;
    }

    public String getCsClass() {
        return csClass;
    }

    public void setCsClass(String csClass) {
        this.csClass = csClass;
    }

    public String getCsInterface() {
        return csInterface;
    }

    public void setCsInterface(String csInterface) {
        this.csInterface = csInterface;
    }

    public String getCsDesc() {
        return csDesc;
    }

    public void setCsDesc(String csDesc) {
        this.csDesc = csDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CodeService that = (CodeService) o;

        if (csAnnotation != that.csAnnotation) return false;
        if (csSid != null ? !csSid.equals(that.csSid) : that.csSid != null) return false;
        if (csAppSid != null ? !csAppSid.equals(that.csAppSid) : that.csAppSid != null) return false;
        if (csModuleSid != null ? !csModuleSid.equals(that.csModuleSid) : that.csModuleSid != null) return false;
        if (csName != null ? !csName.equals(that.csName) : that.csName != null) return false;
        if (csFilePath != null ? !csFilePath.equals(that.csFilePath) : that.csFilePath != null) return false;
        if (csPrjName != null ? !csPrjName.equals(that.csPrjName) : that.csPrjName != null) return false;
        if (csClass != null ? !csClass.equals(that.csClass) : that.csClass != null) return false;
        if (csInterface != null ? !csInterface.equals(that.csInterface) : that.csInterface != null) return false;
        if (csDesc != null ? !csDesc.equals(that.csDesc) : that.csDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = csSid != null ? csSid.hashCode() : 0;
        result = 31 * result + (csAppSid != null ? csAppSid.hashCode() : 0);
        result = 31 * result + (csModuleSid != null ? csModuleSid.hashCode() : 0);
        result = 31 * result + (csName != null ? csName.hashCode() : 0);
        result = 31 * result + csAnnotation;
        result = 31 * result + (csFilePath != null ? csFilePath.hashCode() : 0);
        result = 31 * result + (csPrjName != null ? csPrjName.hashCode() : 0);
        result = 31 * result + (csClass != null ? csClass.hashCode() : 0);
        result = 31 * result + (csInterface != null ? csInterface.hashCode() : 0);
        result = 31 * result + (csDesc != null ? csDesc.hashCode() : 0);
        return result;
    }

    public Application getApplicationByCsAppSid() {
        return applicationByCsAppSid;
    }

    public void setApplicationByCsAppSid(Application applicationByCsAppSid) {
        this.applicationByCsAppSid = applicationByCsAppSid;
    }
}
