package jugger.core.models;

import java.sql.Timestamp;

/**
 * Created by root on 12/4/15.
 */
public class SystemLog {
    private String slSid;
    private String slAppSid;
    private String slUser;
    private String slClass;
    private String slMethod;
    private Timestamp slTime;
    private String slLevel;
    private String slContent;
    private Application applicationBySlAppSid;

    public String getSlSid() {
        return slSid;
    }

    public void setSlSid(String slSid) {
        this.slSid = slSid;
    }

    public String getSlAppSid() {
        return slAppSid;
    }

    public void setSlAppSid(String slAppSid) {
        this.slAppSid = slAppSid;
    }

    public String getSlUser() {
        return slUser;
    }

    public void setSlUser(String slUser) {
        this.slUser = slUser;
    }

    public String getSlClass() {
        return slClass;
    }

    public void setSlClass(String slClass) {
        this.slClass = slClass;
    }

    public String getSlMethod() {
        return slMethod;
    }

    public void setSlMethod(String slMethod) {
        this.slMethod = slMethod;
    }

    public Timestamp getSlTime() {
        return slTime;
    }

    public void setSlTime(Timestamp slTime) {
        this.slTime = slTime;
    }

    public String getSlLevel() {
        return slLevel;
    }

    public void setSlLevel(String slLevel) {
        this.slLevel = slLevel;
    }

    public String getSlContent() {
        return slContent;
    }

    public void setSlContent(String slContent) {
        this.slContent = slContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemLog systemLog = (SystemLog) o;

        if (slSid != null ? !slSid.equals(systemLog.slSid) : systemLog.slSid != null) return false;
        if (slAppSid != null ? !slAppSid.equals(systemLog.slAppSid) : systemLog.slAppSid != null) return false;
        if (slUser != null ? !slUser.equals(systemLog.slUser) : systemLog.slUser != null) return false;
        if (slClass != null ? !slClass.equals(systemLog.slClass) : systemLog.slClass != null) return false;
        if (slMethod != null ? !slMethod.equals(systemLog.slMethod) : systemLog.slMethod != null) return false;
        if (slTime != null ? !slTime.equals(systemLog.slTime) : systemLog.slTime != null) return false;
        if (slLevel != null ? !slLevel.equals(systemLog.slLevel) : systemLog.slLevel != null) return false;
        if (slContent != null ? !slContent.equals(systemLog.slContent) : systemLog.slContent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = slSid != null ? slSid.hashCode() : 0;
        result = 31 * result + (slAppSid != null ? slAppSid.hashCode() : 0);
        result = 31 * result + (slUser != null ? slUser.hashCode() : 0);
        result = 31 * result + (slClass != null ? slClass.hashCode() : 0);
        result = 31 * result + (slMethod != null ? slMethod.hashCode() : 0);
        result = 31 * result + (slTime != null ? slTime.hashCode() : 0);
        result = 31 * result + (slLevel != null ? slLevel.hashCode() : 0);
        result = 31 * result + (slContent != null ? slContent.hashCode() : 0);
        return result;
    }

    public Application getApplicationBySlAppSid() {
        return applicationBySlAppSid;
    }

    public void setApplicationBySlAppSid(Application applicationBySlAppSid) {
        this.applicationBySlAppSid = applicationBySlAppSid;
    }
}
