package com.dpslink.dpstimeapi.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "time_entry")
public class TimeEntry {
	
	private static final long serialVersionUID = -931674539917471395L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long uid;
    
    
    @Column(name="entry_date")
    private Date entryDate;
    
    @Column(name="client_id")
    private String clientId;
    
    @Column(name="client_location")
    private String clientLocation;
    
    @Column(name="job")
    private String job;
    
    @Column(name="task")
    private String task;
    
    @Column(name="activity")
    private String activity;
    
    @Column(name="tracked_time")
    private Float trackedTime;
    
    @Column(name="adjusted_time")
    private Float adjustedTime;
    
    // TODO - Make this field an expenses object
    @Column(name="expenses")
    private Float expenses;
    
    @Column(name="pro_bono")
    private boolean proBono;
    
    @Column(name="use_contract")
    private boolean contract;
    
    @Column(name="comment")
    private String comment;
    
    @Column(name="billed")
    private boolean billed;
    
    
    
	public TimeEntry(Long uid, Date entryDate, String clientId, String clientLocation, String job, String task,
			String activity, Float trackedTime, Float adjustedTime, Float expenses, boolean proBono, boolean contract,
			String comment, boolean billed) {
		super();
		this.uid = uid;
		this.entryDate = entryDate;
		this.clientId = clientId;
		this.clientLocation = clientLocation;
		this.job = job;
		this.task = task;
		this.activity = activity;
		this.trackedTime = trackedTime;
		this.adjustedTime = adjustedTime;
		this.expenses = expenses;
		this.proBono = proBono;
		this.contract = contract;
		this.comment = comment;
		this.billed = billed;
	}

	public boolean isBilled() {
		return billed;
	}

	public void setBilled(boolean billed) {
		this.billed = billed;
	}

	public Long getUid() {
		return uid;
	}
	
	public void setUid(Long uid) {
		this.uid = uid;
	}
	
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public String getCustomerId() {
		return clientId;
	}
	public void setCustomerId(String customerId) {
		this.clientId = customerId;
	}
	public String getCustomerLocation() {
		return clientLocation;
	}
	public void setCustomerLocation(String customerLocation) {
		this.clientLocation = customerLocation;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public Float getTrackedTime() {
		return trackedTime;
	}
	public void setTrackedTime(Float trackedTime) {
		this.trackedTime = trackedTime;
	}
	public Float getAdjustedTime() {
		return adjustedTime;
	}
	public void setAdjustedTime(Float adjustedTime) {
		this.adjustedTime = adjustedTime;
	}
	public Float getExpenses() {
		return expenses;
	}
	public void setExpenses(Float expenses) {
		this.expenses = expenses;
	}
	public boolean isProBono() {
		return proBono;
	}
	public void setProBono(boolean proBono) {
		this.proBono = proBono;
	}
	public boolean isContract() {
		return contract;
	}
	public void setContract(boolean contract) {
		this.contract = contract;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
    
    
}
