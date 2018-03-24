package vn.myclass.core.persistence.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Admin on 4/6/2017.
 */
@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "roleid")
    private Integer roleId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "roleEntity", fetch = FetchType.LAZY)
    private List<User> userEntityList;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserEntityList() {
        return userEntityList;
    }

    public void setUserEntityList(List<User> userEntityList) {
        this.userEntityList = userEntityList;
    }
}
