package jugger.core.models;

/**
 * Created by root on 12/4/15.
 */
public class ApiServiceParams {
    private String aspSid;
    private String aspAsSid;
    private String aspName;
    private String aspParamType;
    private String aspDefaultValue;
    private String aspDesc;
    private ApiService apiServiceByAspAsSid;

    public String getAspSid() {
        return aspSid;
    }

    public void setAspSid(String aspSid) {
        this.aspSid = aspSid;
    }

    public String getAspAsSid() {
        return aspAsSid;
    }

    public void setAspAsSid(String aspAsSid) {
        this.aspAsSid = aspAsSid;
    }

    public String getAspName() {
        return aspName;
    }

    public void setAspName(String aspName) {
        this.aspName = aspName;
    }

    public String getAspParamType() {
        return aspParamType;
    }

    public void setAspParamType(String aspParamType) {
        this.aspParamType = aspParamType;
    }

    public String getAspDefaultValue() {
        return aspDefaultValue;
    }

    public void setAspDefaultValue(String aspDefaultValue) {
        this.aspDefaultValue = aspDefaultValue;
    }

    public String getAspDesc() {
        return aspDesc;
    }

    public void setAspDesc(String aspDesc) {
        this.aspDesc = aspDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiServiceParams that = (ApiServiceParams) o;

        if (aspSid != null ? !aspSid.equals(that.aspSid) : that.aspSid != null) return false;
        if (aspAsSid != null ? !aspAsSid.equals(that.aspAsSid) : that.aspAsSid != null) return false;
        if (aspName != null ? !aspName.equals(that.aspName) : that.aspName != null) return false;
        if (aspParamType != null ? !aspParamType.equals(that.aspParamType) : that.aspParamType != null) return false;
        if (aspDefaultValue != null ? !aspDefaultValue.equals(that.aspDefaultValue) : that.aspDefaultValue != null)
            return false;
        if (aspDesc != null ? !aspDesc.equals(that.aspDesc) : that.aspDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aspSid != null ? aspSid.hashCode() : 0;
        result = 31 * result + (aspAsSid != null ? aspAsSid.hashCode() : 0);
        result = 31 * result + (aspName != null ? aspName.hashCode() : 0);
        result = 31 * result + (aspParamType != null ? aspParamType.hashCode() : 0);
        result = 31 * result + (aspDefaultValue != null ? aspDefaultValue.hashCode() : 0);
        result = 31 * result + (aspDesc != null ? aspDesc.hashCode() : 0);
        return result;
    }

    public ApiService getApiServiceByAspAsSid() {
        return apiServiceByAspAsSid;
    }

    public void setApiServiceByAspAsSid(ApiService apiServiceByAspAsSid) {
        this.apiServiceByAspAsSid = apiServiceByAspAsSid;
    }
}
