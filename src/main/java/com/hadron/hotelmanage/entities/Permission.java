package com.hadron.hotelmanage.entities;


import java.sql.Timestamp;
import java.util.List;

/**
 * @Author Hadron
 * @date 2019/8/5 19:34
 */
public class Permission {
    /**
     * 权限表的实体类
     */
    private Integer permissionId;
    private Integer parentId;
    private String name;
    private String url;
    private String type;
    private Integer orderNum;
    private String icon;
    private Integer status;
    private Timestamp createTime;
    private List<Permission> permissions;

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId=" + permissionId +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", orderNum=" + orderNum +
                ", icon='" + icon + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                ", permissions=" + permissions +
                '}';
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
