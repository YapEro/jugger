package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class SystemMenu {
    private String smSid;
    private String smAppSid;
    private String smModuleSid;
    private String smName;
    private String smTitle;
    private String smParent;
    private String smView;
    private Integer smSort;
    private String smIcon;
    private String smFocusIcon;
    private String smDesc;
    private Application applicationBySmAppSid;
    private Module moduleBySmModuleSid;
    private SystemMenu systemMenuBySmParent;
    private Collection<SystemMenu> systemMenusBySmSid;

    public String getSmSid() {
        return smSid;
    }

    public void setSmSid(String smSid) {
        this.smSid = smSid;
    }

    public String getSmAppSid() {
        return smAppSid;
    }

    public void setSmAppSid(String smAppSid) {
        this.smAppSid = smAppSid;
    }

    public String getSmModuleSid() {
        return smModuleSid;
    }

    public void setSmModuleSid(String smModuleSid) {
        this.smModuleSid = smModuleSid;
    }

    public String getSmName() {
        return smName;
    }

    public void setSmName(String smName) {
        this.smName = smName;
    }

    public String getSmTitle() {
        return smTitle;
    }

    public void setSmTitle(String smTitle) {
        this.smTitle = smTitle;
    }

    public String getSmParent() {
        return smParent;
    }

    public void setSmParent(String smParent) {
        this.smParent = smParent;
    }

    public String getSmView() {
        return smView;
    }

    public void setSmView(String smView) {
        this.smView = smView;
    }

    public Integer getSmSort() {
        return smSort;
    }

    public void setSmSort(Integer smSort) {
        this.smSort = smSort;
    }

    public String getSmIcon() {
        return smIcon;
    }

    public void setSmIcon(String smIcon) {
        this.smIcon = smIcon;
    }

    public String getSmFocusIcon() {
        return smFocusIcon;
    }

    public void setSmFocusIcon(String smFocusIcon) {
        this.smFocusIcon = smFocusIcon;
    }

    public String getSmDesc() {
        return smDesc;
    }

    public void setSmDesc(String smDesc) {
        this.smDesc = smDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemMenu that = (SystemMenu) o;

        if (smSid != null ? !smSid.equals(that.smSid) : that.smSid != null) return false;
        if (smAppSid != null ? !smAppSid.equals(that.smAppSid) : that.smAppSid != null) return false;
        if (smModuleSid != null ? !smModuleSid.equals(that.smModuleSid) : that.smModuleSid != null) return false;
        if (smName != null ? !smName.equals(that.smName) : that.smName != null) return false;
        if (smTitle != null ? !smTitle.equals(that.smTitle) : that.smTitle != null) return false;
        if (smParent != null ? !smParent.equals(that.smParent) : that.smParent != null) return false;
        if (smView != null ? !smView.equals(that.smView) : that.smView != null) return false;
        if (smSort != null ? !smSort.equals(that.smSort) : that.smSort != null) return false;
        if (smIcon != null ? !smIcon.equals(that.smIcon) : that.smIcon != null) return false;
        if (smFocusIcon != null ? !smFocusIcon.equals(that.smFocusIcon) : that.smFocusIcon != null) return false;
        if (smDesc != null ? !smDesc.equals(that.smDesc) : that.smDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = smSid != null ? smSid.hashCode() : 0;
        result = 31 * result + (smAppSid != null ? smAppSid.hashCode() : 0);
        result = 31 * result + (smModuleSid != null ? smModuleSid.hashCode() : 0);
        result = 31 * result + (smName != null ? smName.hashCode() : 0);
        result = 31 * result + (smTitle != null ? smTitle.hashCode() : 0);
        result = 31 * result + (smParent != null ? smParent.hashCode() : 0);
        result = 31 * result + (smView != null ? smView.hashCode() : 0);
        result = 31 * result + (smSort != null ? smSort.hashCode() : 0);
        result = 31 * result + (smIcon != null ? smIcon.hashCode() : 0);
        result = 31 * result + (smFocusIcon != null ? smFocusIcon.hashCode() : 0);
        result = 31 * result + (smDesc != null ? smDesc.hashCode() : 0);
        return result;
    }

    public Application getApplicationBySmAppSid() {
        return applicationBySmAppSid;
    }

    public void setApplicationBySmAppSid(Application applicationBySmAppSid) {
        this.applicationBySmAppSid = applicationBySmAppSid;
    }

    public Module getModuleBySmModuleSid() {
        return moduleBySmModuleSid;
    }

    public void setModuleBySmModuleSid(Module moduleBySmModuleSid) {
        this.moduleBySmModuleSid = moduleBySmModuleSid;
    }

    public SystemMenu getSystemMenuBySmParent() {
        return systemMenuBySmParent;
    }

    public void setSystemMenuBySmParent(SystemMenu systemMenuBySmParent) {
        this.systemMenuBySmParent = systemMenuBySmParent;
    }

    public Collection<SystemMenu> getSystemMenusBySmSid() {
        return systemMenusBySmSid;
    }

    public void setSystemMenusBySmSid(Collection<SystemMenu> systemMenusBySmSid) {
        this.systemMenusBySmSid = systemMenusBySmSid;
    }
}
