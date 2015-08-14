package com.bmsm.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bmsm.common.entities.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer>{

}
