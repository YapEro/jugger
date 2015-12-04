package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class ApiService {
    private String asSid;
    private String asAppSid;
    private String asName;
    private String asPath;
    private String asReturnType;
    private Integer asType;
    private String asGroup;
    private String asDesc;
    private Application applicationByAsAppSid;
    private Collection<ApiServiceParams> apiServiceParamsesByAsSid;

    public String getAsSid() {
        return asSid;
    }

    public void setAsSid(String asSid) {
        this.asSid = asSid;
    }

    public String getAsAppSid() {
        return asAppSid;
    }

    public void setAsAppSid(String asAppSid) {
        this.asAppSid = asAppSid;
    }

    public String getAsName() {
        return asName;
    }

    public void setAsName(String asName) {
        this.asName = asName;
    }

    public String getAsPath() {
        return asPath;
    }

    public void setAsPath(String asPath) {
        this.asPath = asPath;
    }

    public String getAsReturnType() {
        return asReturnType;
    }

    public void setAsReturnType(String asReturnType) {
        this.asReturnType = asReturnType;
    }

    public Integer getAsType() {
        return asType;
    }

    public void setAsType(Integer asType) {
        this.asType = asType;
    }

    public String getAsGroup() {
        return asGroup;
    }

    public void setAsGroup(String asGroup) {
        this.asGroup = asGroup;
    }

    public String getAsDesc() {
        return asDesc;
    }

    public void setAsDesc(String asDesc) {
        this.asDesc = asDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiService that = (ApiService) o;

        if (asSid != null ? !asSid.equals(that.asSid) : that.asSid != null) return false;
        if (asAppSid != null ? !asAppSid.equals(that.asAppSid) : that.asAppSid != null) return false;
        if (asName != null ? !asName.equals(that.asName) : that.asName != null) return false;
        if (asPath != null ? !asPath.equals(that.asPath) : that.asPath != null) return false;
        if (asReturnType != null ? !asReturnType.equals(that.asReturnType) : that.asReturnType != null) return false;
        if (asType != null ? !asType.equals(that.asType) : that.asType != null) return false;
        if (asGroup != null ? !asGroup.equals(that.asGroup) : that.asGroup != null) return false;
        if (asDesc != null ? !asDesc.equals(that.asDesc) : that.asDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = asSid != null ? asSid.hashCode() : 0;
        result = 31 * result + (asAppSid != null ? asAppSid.hashCode() : 0);
        result = 31 * result + (asName != null ? asName.hashCode() : 0);
        result = 31 * result + (asPath != null ? asPath.hashCode() : 0);
        result = 31 * result + (asReturnType != null ? asReturnType.hashCode() : 0);
        result = 31 * result + (asType != null ? asType.hashCode() : 0);
        result = 31 * result + (asGroup != null ? asGroup.hashCode() : 0);
        result = 31 * result + (asDesc != null ? asDesc.hashCode() : 0);
        return result;
    }

    public Application getApplicationByAsAppSid() {
        return applicationByAsAppSid;
    }

    public void setApplicationByAsAppSid(Application applicationByAsAppSid) {
        this.applicationByAsAppSid = applicationByAsAppSid;
    }

    public Collection<ApiServiceParams> getApiServiceParamsesByAsSid() {
        return apiServiceParamsesByAsSid;
    }

    public void setApiServiceParamsesByAsSid(Collection<ApiServiceParams> apiServiceParamsesByAsSid) {
        this.apiServiceParamsesByAsSid = apiServiceParamsesByAsSid;
    }
}
