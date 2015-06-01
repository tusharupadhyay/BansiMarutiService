package com.bmsm.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmsm.common.entities.user.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
