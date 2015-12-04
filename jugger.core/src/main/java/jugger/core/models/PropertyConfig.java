package jugger.core.models;

import java.util.Collection;

/**
 * Created by root on 12/4/15.
 */
public class PropertyConfig {
    private String pcSid;
    private String pcEcSid;
    private String pcColName;
    private String pcName;
    private String pcLabel;
    private String pcDataType;
    private Boolean pcIsRequire;
    private Boolean pcIsPk;
    private Boolean pcIsName;
    private Boolean pcIsType;
    private Boolean pcIsRicheditor;
    private int pcWidthType;
    private long pcLength;
    private String pcRefEntity;
    private String pcRefName;
    private int pcRefSelect;
    private String pcFormat;
    private String pcWartermark;
    private String pcValidateRegx;
    private String pcEditTemplate;
    private String pcViewTemplate;
    private int pcDictionaryValue;
    private String pcExt;
    private String pcDesc;
    private Collection<FormConfig> formConfigsByPcSid;
    private Collection<ListConfig> listConfigsByPcSid;
    private EntityConfig entityConfigByPcEcSid;

    public String getPcSid() {
        return pcSid;
    }

    public void setPcSid(String pcSid) {
        this.pcSid = pcSid;
    }

    public String getPcEcSid() {
        return pcEcSid;
    }

    public void setPcEcSid(String pcEcSid) {
        this.pcEcSid = pcEcSid;
    }

    public String getPcColName() {
        return pcColName;
    }

    public void setPcColName(String pcColName) {
        this.pcColName = pcColName;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }

    public String getPcLabel() {
        return pcLabel;
    }

    public void setPcLabel(String pcLabel) {
        this.pcLabel = pcLabel;
    }

    public String getPcDataType() {
        return pcDataType;
    }

    public void setPcDataType(String pcDataType) {
        this.pcDataType = pcDataType;
    }

    public Boolean getPcIsRequire() {
        return pcIsRequire;
    }

    public void setPcIsRequire(Boolean pcIsRequire) {
        this.pcIsRequire = pcIsRequire;
    }

    public Boolean getPcIsPk() {
        return pcIsPk;
    }

    public void setPcIsPk(Boolean pcIsPk) {
        this.pcIsPk = pcIsPk;
    }

    public Boolean getPcIsName() {
        return pcIsName;
    }

    public void setPcIsName(Boolean pcIsName) {
        this.pcIsName = pcIsName;
    }

    public Boolean getPcIsType() {
        return pcIsType;
    }

    public void setPcIsType(Boolean pcIsType) {
        this.pcIsType = pcIsType;
    }

    public Boolean getPcIsRicheditor() {
        return pcIsRicheditor;
    }

    public void setPcIsRicheditor(Boolean pcIsRicheditor) {
        this.pcIsRicheditor = pcIsRicheditor;
    }

    public int getPcWidthType() {
        return pcWidthType;
    }

    public void setPcWidthType(int pcWidthType) {
        this.pcWidthType = pcWidthType;
    }

    public long getPcLength() {
        return pcLength;
    }

    public void setPcLength(long pcLength) {
        this.pcLength = pcLength;
    }

    public String getPcRefEntity() {
        return pcRefEntity;
    }

    public void setPcRefEntity(String pcRefEntity) {
        this.pcRefEntity = pcRefEntity;
    }

    public String getPcRefName() {
        return pcRefName;
    }

    public void setPcRefName(String pcRefName) {
        this.pcRefName = pcRefName;
    }

    public int getPcRefSelect() {
        return pcRefSelect;
    }

    public void setPcRefSelect(int pcRefSelect) {
        this.pcRefSelect = pcRefSelect;
    }

    public String getPcFormat() {
        return pcFormat;
    }

    public void setPcFormat(String pcFormat) {
        this.pcFormat = pcFormat;
    }

    public String getPcWartermark() {
        return pcWartermark;
    }

    public void setPcWartermark(String pcWartermark) {
        this.pcWartermark = pcWartermark;
    }

    public String getPcValidateRegx() {
        return pcValidateRegx;
    }

    public void setPcValidateRegx(String pcValidateRegx) {
        this.pcValidateRegx = pcValidateRegx;
    }

    public String getPcEditTemplate() {
        return pcEditTemplate;
    }

    public void setPcEditTemplate(String pcEditTemplate) {
        this.pcEditTemplate = pcEditTemplate;
    }

    public String getPcViewTemplate() {
        return pcViewTemplate;
    }

    public void setPcViewTemplate(String pcViewTemplate) {
        this.pcViewTemplate = pcViewTemplate;
    }

    public int getPcDictionaryValue() {
        return pcDictionaryValue;
    }

    public void setPcDictionaryValue(int pcDictionaryValue) {
        this.pcDictionaryValue = pcDictionaryValue;
    }

    public String getPcExt() {
        return pcExt;
    }

    public void setPcExt(String pcExt) {
        this.pcExt = pcExt;
    }

    public String getPcDesc() {
        return pcDesc;
    }

    public void setPcDesc(String pcDesc) {
        this.pcDesc = pcDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PropertyConfig that = (PropertyConfig) o;

        if (pcWidthType != that.pcWidthType) return false;
        if (pcLength != that.pcLength) return false;
        if (pcRefSelect != that.pcRefSelect) return false;
        if (pcDictionaryValue != that.pcDictionaryValue) return false;
        if (pcSid != null ? !pcSid.equals(that.pcSid) : that.pcSid != null) return false;
        if (pcEcSid != null ? !pcEcSid.equals(that.pcEcSid) : that.pcEcSid != null) return false;
        if (pcColName != null ? !pcColName.equals(that.pcColName) : that.pcColName != null) return false;
        if (pcName != null ? !pcName.equals(that.pcName) : that.pcName != null) return false;
        if (pcLabel != null ? !pcLabel.equals(that.pcLabel) : that.pcLabel != null) return false;
        if (pcDataType != null ? !pcDataType.equals(that.pcDataType) : that.pcDataType != null) return false;
        if (pcIsRequire != null ? !pcIsRequire.equals(that.pcIsRequire) : that.pcIsRequire != null) return false;
        if (pcIsPk != null ? !pcIsPk.equals(that.pcIsPk) : that.pcIsPk != null) return false;
        if (pcIsName != null ? !pcIsName.equals(that.pcIsName) : that.pcIsName != null) return false;
        if (pcIsType != null ? !pcIsType.equals(that.pcIsType) : that.pcIsType != null) return false;
        if (pcIsRicheditor != null ? !pcIsRicheditor.equals(that.pcIsRicheditor) : that.pcIsRicheditor != null)
            return false;
        if (pcRefEntity != null ? !pcRefEntity.equals(that.pcRefEntity) : that.pcRefEntity != null) return false;
        if (pcRefName != null ? !pcRefName.equals(that.pcRefName) : that.pcRefName != null) return false;
        if (pcFormat != null ? !pcFormat.equals(that.pcFormat) : that.pcFormat != null) return false;
        if (pcWartermark != null ? !pcWartermark.equals(that.pcWartermark) : that.pcWartermark != null) return false;
        if (pcValidateRegx != null ? !pcValidateRegx.equals(that.pcValidateRegx) : that.pcValidateRegx != null)
            return false;
        if (pcEditTemplate != null ? !pcEditTemplate.equals(that.pcEditTemplate) : that.pcEditTemplate != null)
            return false;
        if (pcViewTemplate != null ? !pcViewTemplate.equals(that.pcViewTemplate) : that.pcViewTemplate != null)
            return false;
        if (pcExt != null ? !pcExt.equals(that.pcExt) : that.pcExt != null) return false;
        if (pcDesc != null ? !pcDesc.equals(that.pcDesc) : that.pcDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pcSid != null ? pcSid.hashCode() : 0;
        result = 31 * result + (pcEcSid != null ? pcEcSid.hashCode() : 0);
        result = 31 * result + (pcColName != null ? pcColName.hashCode() : 0);
        result = 31 * result + (pcName != null ? pcName.hashCode() : 0);
        result = 31 * result + (pcLabel != null ? pcLabel.hashCode() : 0);
        result = 31 * result + (pcDataType != null ? pcDataType.hashCode() : 0);
        result = 31 * result + (pcIsRequire != null ? pcIsRequire.hashCode() : 0);
        result = 31 * result + (pcIsPk != null ? pcIsPk.hashCode() : 0);
        result = 31 * result + (pcIsName != null ? pcIsName.hashCode() : 0);
        result = 31 * result + (pcIsType != null ? pcIsType.hashCode() : 0);
        result = 31 * result + (pcIsRicheditor != null ? pcIsRicheditor.hashCode() : 0);
        result = 31 * result + pcWidthType;
        result = 31 * result + (int) (pcLength ^ (pcLength >>> 32));
        result = 31 * result + (pcRefEntity != null ? pcRefEntity.hashCode() : 0);
        result = 31 * result + (pcRefName != null ? pcRefName.hashCode() : 0);
        result = 31 * result + pcRefSelect;
        result = 31 * result + (pcFormat != null ? pcFormat.hashCode() : 0);
        result = 31 * result + (pcWartermark != null ? pcWartermark.hashCode() : 0);
        result = 31 * result + (pcValidateRegx != null ? pcValidateRegx.hashCode() : 0);
        result = 31 * result + (pcEditTemplate != null ? pcEditTemplate.hashCode() : 0);
        result = 31 * result + (pcViewTemplate != null ? pcViewTemplate.hashCode() : 0);
        result = 31 * result + pcDictionaryValue;
        result = 31 * result + (pcExt != null ? pcExt.hashCode() : 0);
        result = 31 * result + (pcDesc != null ? pcDesc.hashCode() : 0);
        return result;
    }

    public Collection<FormConfig> getFormConfigsByPcSid() {
        return formConfigsByPcSid;
    }

    public void setFormConfigsByPcSid(Collection<FormConfig> formConfigsByPcSid) {
        this.formConfigsByPcSid = formConfigsByPcSid;
    }

    public Collection<ListConfig> getListConfigsByPcSid() {
        return listConfigsByPcSid;
    }

    public void setListConfigsByPcSid(Collection<ListConfig> listConfigsByPcSid) {
        this.listConfigsByPcSid = listConfigsByPcSid;
    }

    public EntityConfig getEntityConfigByPcEcSid() {
        return entityConfigByPcEcSid;
    }

    public void setEntityConfigByPcEcSid(EntityConfig entityConfigByPcEcSid) {
        this.entityConfigByPcEcSid = entityConfigByPcEcSid;
    }
}
