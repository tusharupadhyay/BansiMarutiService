package com.bmsm.serviceImpl;

import org.springframework.stereotype.Service;

import com.bmsm.common.entities.Attendance;
import com.bmsm.jpa.repositories.AttendanceRepository;
import com.bmsm.service.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	private AttendanceRepository attendanceRepository;
	
	@Override
	public void save(Attendance attendance) {
		attendanceRepository.save(attendance);		
	}
	
}
