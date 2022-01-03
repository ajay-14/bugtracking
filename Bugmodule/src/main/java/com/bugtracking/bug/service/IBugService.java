package com.bugtracking.bug.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bugtracking.bug.dto.BugDto;
import com.bugtracking.bug.entities.Bug;

public interface IBugService {

	List<BugDto> getall();

	BugDto getbug(long bid);

	BugDto deletebug(long bid);

	BugDto createbug(BugDto bugDto);

	BugDto updatebug(long bid,BugDto bugDto);

	List<BugDto> getbugsbystatus(String status);

}
