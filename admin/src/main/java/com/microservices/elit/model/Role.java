package com.microservices.elit.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "role")
    private String role;

    public Role() {
    }
    
    public Role(AdminRole a) {
    	this.roleId=a.getRoleId();
    	this.role=a.getRole();
    }

    public Role(int id, String string) {
		// TODO Auto-generated constructor stub
    	this.roleId=id;
	}

	public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
