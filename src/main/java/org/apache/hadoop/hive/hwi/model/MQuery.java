package org.apache.hadoop.hive.hwi.model;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MQuery {

    public static enum Status {
        INITED, RUNNING, FINISHED, CANCELLED, FAILED, SYNTAXERROR
    };

    private Integer id;

    private String name;

    private String query;

    private String resultLocation;

    private Status status;

    private String errorMsg;

    private Integer errorCode;

    private String callback;

    private String jobId;

    private String userId;

    private Integer crontabId;

    private Date created;

    private Date updated;

    private Integer cpuTime;

    private Integer totalTime;

    public MQuery(String name, String query, String callback, String userId) {
        this.name = name;
        this.query = query;
        this.callback = callback;
        this.resultLocation = "";
        this.created = Calendar.getInstance(TimeZone.getDefault()).getTime();
        this.updated = this.created;
        this.status = Status.INITED;
        this.userId = userId;
    }

    public void copy(MQuery mquery) {
        name = mquery.name;
        query = mquery.query;
        callback = mquery.callback;
        resultLocation = mquery.resultLocation;
        errorMsg = mquery.errorMsg;
        errorCode = mquery.errorCode;
        created = mquery.created;
        updated = mquery.updated;
        status = mquery.status;
        userId = mquery.userId;
        jobId = mquery.jobId;
        crontabId = mquery.crontabId;
        cpuTime = mquery.cpuTime;
        totalTime = mquery.totalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getResultLocation() {
        return resultLocation;
    }

    public void setResultLocation(String resultLocation) {
        this.resultLocation = resultLocation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCrontabId() {
        return crontabId;
    }

    public void setCrontabId(Integer crontabId) {
        this.crontabId = crontabId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Integer getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Integer cpuTime) {
        this.cpuTime = cpuTime;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

}
