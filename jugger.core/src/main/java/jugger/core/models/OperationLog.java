package jugger.core.models;

import java.sql.Timestamp;

/**
 * Created by root on 12/4/15.
 */
public class OperationLog {
    private String olSid;
    private String olAppSid;
    private String olUser;
    private Timestamp olTime;
    private Integer olType;
    private String olContent;
    private Application applicationByOlAppSid;

    public String getOlSid() {
        return olSid;
    }

    public void setOlSid(String olSid) {
        this.olSid = olSid;
    }

    public String getOlAppSid() {
        return olAppSid;
    }

    public void setOlAppSid(String olAppSid) {
        this.olAppSid = olAppSid;
    }

    public String getOlUser() {
        return olUser;
    }

    public void setOlUser(String olUser) {
        this.olUser = olUser;
    }

    public Timestamp getOlTime() {
        return olTime;
    }

    public void setOlTime(Timestamp olTime) {
        this.olTime = olTime;
    }

    public Integer getOlType() {
        return olType;
    }

    public void setOlType(Integer olType) {
        this.olType = olType;
    }

    public String getOlContent() {
        return olContent;
    }

    public void setOlContent(String olContent) {
        this.olContent = olContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OperationLog that = (OperationLog) o;

        if (olSid != null ? !olSid.equals(that.olSid) : that.olSid != null) return false;
        if (olAppSid != null ? !olAppSid.equals(that.olAppSid) : that.olAppSid != null) return false;
        if (olUser != null ? !olUser.equals(that.olUser) : that.olUser != null) return false;
        if (olTime != null ? !olTime.equals(that.olTime) : that.olTime != null) return false;
        if (olType != null ? !olType.equals(that.olType) : that.olType != null) return false;
        if (olContent != null ? !olContent.equals(that.olContent) : that.olContent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = olSid != null ? olSid.hashCode() : 0;
        result = 31 * result + (olAppSid != null ? olAppSid.hashCode() : 0);
        result = 31 * result + (olUser != null ? olUser.hashCode() : 0);
        result = 31 * result + (olTime != null ? olTime.hashCode() : 0);
        result = 31 * result + (olType != null ? olType.hashCode() : 0);
        result = 31 * result + (olContent != null ? olContent.hashCode() : 0);
        return result;
    }

    public Application getApplicationByOlAppSid() {
        return applicationByOlAppSid;
    }

    public void setApplicationByOlAppSid(Application applicationByOlAppSid) {
        this.applicationByOlAppSid = applicationByOlAppSid;
    }
}
