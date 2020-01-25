package com.dpslink.dpstimeapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpslink.dpstimeapi.models.TimeEntry;

public interface TimeEntryRepository extends JpaRepository<TimeEntry, Long> {
}
