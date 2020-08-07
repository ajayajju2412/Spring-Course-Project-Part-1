package com.upgrad.hirewheels.entities;



import javax.persistence.*;


@Entity
public class Role {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId ;

    @Column(nullable = false, unique = true)
    private String roleName ;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
