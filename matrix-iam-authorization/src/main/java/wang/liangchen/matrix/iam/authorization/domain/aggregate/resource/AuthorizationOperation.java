package wang.liangchen.matrix.iam.authorization.domain.aggregate.resource;

import wang.liangchen.matrix.framework.commons.object.ObjectUtil;
import wang.liangchen.matrix.framework.commons.type.ClassUtil;
import wang.liangchen.matrix.framework.data.annotation.ColumnMarkDelete;
import wang.liangchen.matrix.framework.data.dao.entity.RootEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Liangchen.Wang
 */
@Entity(name = "matrix_authorization_operation")
@Table(name = "matrix_authorization_operation")
public class AuthorizationOperation extends RootEntity {
    @Id
    @Column(name = "operation_id")
    private Long operationId;
    @Column(name = "resource_id")
    private Long resourceId;
    @Column(name = "operation_code")
    private String operationCode;
    @Column(name = "operation_name")
    private String operationName;
    @Column(name = "operation_dependency")
    private String operationDependency;
    @Column(name = "data_mode")
    private Short dataMode;
    @Version
    @Column(name = "version")
    private Integer version;
    @Column(name = "sort")
    private Integer sort;
    @Column(name = "owner")
    private String owner;
    @Column(name = "creator")
    private String creator;
    @Column(name = "create_datetime")
    private LocalDateTime createDatetime;
    @Column(name = "modifier")
    private String modifier;
    @Column(name = "modify_datetime")
    private LocalDateTime modifyDatetime;
    @Column(name = "summary")
    private String summary;
    @ColumnMarkDelete("deleted")
    @Column(name = "state")
    private String state;

    public static AuthorizationOperation valueOf(Object source) {
        return ObjectUtil.INSTANCE.copyProperties(source, AuthorizationOperation.class);
    }

    public static AuthorizationOperation newInstance() {
        return ClassUtil.INSTANCE.instantiate(AuthorizationOperation.class);
    }

    public Long getOperationId() {
        return this.operationId;
    }
    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }
    public Long getResourceId() {
        return this.resourceId;
    }
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
    public String getOperationCode() {
        return this.operationCode;
    }
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }
    public String getOperationName() {
        return this.operationName;
    }
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }
    public String getOperationDependency() {
        return this.operationDependency;
    }
    public void setOperationDependency(String operationDependency) {
        this.operationDependency = operationDependency;
    }
    public Short getDataMode() {
        return this.dataMode;
    }
    public void setDataMode(Short dataMode) {
        this.dataMode = dataMode;
    }
    public Integer getVersion() {
        return this.version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    public Integer getSort() {
        return this.sort;
    }
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getCreator() {
        return this.creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public LocalDateTime getCreateDatetime() {
        return this.createDatetime;
    }
    public void setCreateDatetime(LocalDateTime createDatetime) {
        this.createDatetime = createDatetime;
    }
    public String getModifier() {
        return this.modifier;
    }
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
    public LocalDateTime getModifyDatetime() {
        return this.modifyDatetime;
    }
    public void setModifyDatetime(LocalDateTime modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }
    public String getSummary() {
        return this.summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getState() {
        return this.state;
    }
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AuthorizationOperation{");
        builder.append("operationId = ").append(operationId).append(", ");
        builder.append("resourceId = ").append(resourceId).append(", ");
        builder.append("operationCode = ").append(operationCode).append(", ");
        builder.append("operationName = ").append(operationName).append(", ");
        builder.append("operationDependency = ").append(operationDependency).append(", ");
        builder.append("dataMode = ").append(dataMode).append(", ");
        builder.append("version = ").append(version).append(", ");
        builder.append("sort = ").append(sort).append(", ");
        builder.append("owner = ").append(owner).append(", ");
        builder.append("creator = ").append(creator).append(", ");
        builder.append("createDatetime = ").append(createDatetime).append(", ");
        builder.append("modifier = ").append(modifier).append(", ");
        builder.append("modifyDatetime = ").append(modifyDatetime).append(", ");
        builder.append("summary = ").append(summary).append(", ");
        builder.append("state = ").append(state).append(", ");
        builder.deleteCharAt(builder.length() - 1);
        builder.append("}");
        return builder.toString();
    }
}