package com.dpslink.dpstimeapi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.dpslink.dpstimeapi.dao.TimeEntryRepository;
import com.dpslink.dpstimeapi.models.TimeEntry;

@RestController
public class TimeEntryController {

	@Autowired                                                                                                                                                                                                                                                    
	private TimeEntryRepository timeEntryRepository;
	
	@PostMapping("/api/createTimeEntry")
	public TimeEntry createTimeEntry(@Valid @RequestBody TimeEntry timeEntry) {
		return timeEntryRepository.save(timeEntry);

	}
	
}
