package kr.co.jhta.service.appli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jhta.dao.appli.DisenrollmentDao;

@Service
public class DisenrollmentServiceImpl implements DisenrollmentService{

	@Autowired
	DisenrollmentDao disenrollDao;
	
}
