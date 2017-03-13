package org.kangnam.service;

import java.util.List;

import org.kangnam.domain.Criteria;
import org.kangnam.domain.LockifmVO;
import org.kangnam.domain.SearchCriteria;
import org.kangnam.domain.SeatifmVO;

public interface SeatifmService {

	// 좌석 현황을 출력한다.
	public List<SeatifmVO> list() throws Exception;

	// 퇴실 처리 한다.
	public void update(String seat_aloc_sq) throws Exception;
	
	// 좌석 현황을 출력한다.
	public List<SeatifmVO> monList() throws Exception;
}
