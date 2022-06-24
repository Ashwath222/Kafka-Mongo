
package com.ashwath.model;

import javax.annotation.Generated;

import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.codecs.pojo.annotations.BsonRepresentation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Incident Datetime",
"Incident Date",
"Incident Time",
"Incident Year",
"Incident Day of Week",
"Report Datetime",
"Row ID",
"Incident ID",
"Incident Number",
"CAD Number",
"Report Type Code",
"Report Type Description",
"Filed Online",
"Incident Code",
"Incident Category",
"Incident Subcategory",
"Incident Description",
"Resolution",
"Intersection",
"CNN",
"Police District",
"Analysis Neighborhood",
"Supervisor District",
"Latitude",
"Longitude",
"point"
})
public class IncidentData {

	
	
public IncidentData() {
	}

@JsonProperty("Incident Datetime")
private String incidentDatetime;
@JsonProperty("Incident Date")
private String incidentDate;
@JsonProperty("Incident Time")
private String incidentTime;
@JsonProperty("Incident Year")
private Integer incidentYear;
@JsonProperty("Incident Day of Week")
private String incidentDayOfWeek;
@JsonProperty("Report Datetime")
private String reportDatetime;
@JsonProperty("Row ID")
private Long rowID;
@JsonProperty("Incident ID")
private Integer incidentID;
@JsonProperty("Incident Number")
private Integer incidentNumber;
@JsonProperty("CAD Number")
private Integer cADNumber;
@JsonProperty("Report Type Code")
private String reportTypeCode;
@JsonProperty("Report Type Description")
private String reportTypeDescription;
@JsonProperty("Filed Online")
private Boolean filedOnline;
@JsonProperty("Incident Code")
private Integer incidentCode;
@JsonProperty("Incident Category")
private String incidentCategory;
@JsonProperty("Incident Subcategory")
private String incidentSubcategory;
@JsonProperty("Incident Description")
private String incidentDescription;
@JsonProperty("Resolution")
private String resolution;
@JsonProperty("Intersection")
private String intersection;
@JsonProperty("CNN")
private Integer cnn;
@JsonProperty("Police District")
private String policeDistrict;
@JsonProperty("Analysis Neighborhood")
private String analysisNeighborhood;
@JsonProperty("Supervisor District")
private Integer supervisorDistrict;
@JsonProperty("Latitude")
private String latitude;
@JsonProperty("Longitude")
private String longitude;
@JsonProperty("point")
private String point;

@JsonProperty("Incident Datetime")
public String getIncidentDatetime() {
return incidentDatetime;
}

@JsonProperty("Incident Datetime")
public void setIncidentDatetime(String incidentDatetime) {
this.incidentDatetime = incidentDatetime;
}

@JsonProperty("Incident Date")
public String getIncidentDate() {
return incidentDate;
}

@JsonProperty("Incident Date")
public void setIncidentDate(String incidentDate) {
this.incidentDate = incidentDate;
}

@JsonProperty("Incident Time")
public String getIncidentTime() {
return incidentTime;
}

@JsonProperty("Incident Time")
public void setIncidentTime(String incidentTime) {
this.incidentTime = incidentTime;
}

@JsonProperty("Incident Year")
public Integer getIncidentYear() {
return incidentYear;
}

@JsonProperty("Incident Year")
public void setIncidentYear(Integer incidentYear) {
this.incidentYear = incidentYear;
}

@JsonProperty("Incident Day of Week")
public String getIncidentDayOfWeek() {
return incidentDayOfWeek;
}

@JsonProperty("Incident Day of Week")
public void setIncidentDayOfWeek(String incidentDayOfWeek) {
this.incidentDayOfWeek = incidentDayOfWeek;
}

@JsonProperty("Report Datetime")
public String getReportDatetime() {
return reportDatetime;
}

@JsonProperty("Report Datetime")
public void setReportDatetime(String reportDatetime) {
this.reportDatetime = reportDatetime;
}

@JsonProperty("Row ID")
public Long getRowID() {
return rowID;
}

@JsonProperty("Row ID")
public void setRowID(Long rowID) {
this.rowID = rowID;
}

@JsonProperty("Incident ID")
public Integer getIncidentID() {
return incidentID;
}

@JsonProperty("Incident ID")
public void setIncidentID(Integer incidentID) {
this.incidentID = incidentID;
}

@JsonProperty("Incident Number")
public Integer getIncidentNumber() {
return incidentNumber;
}

@JsonProperty("Incident Number")
public void setIncidentNumber(Integer incidentNumber) {
this.incidentNumber = incidentNumber;
}

@JsonProperty("CAD Number")
public Integer getCADNumber() {
return cADNumber;
}

@JsonProperty("CAD Number")
public void setCADNumber(Integer cADNumber) {
this.cADNumber = cADNumber;
}

@JsonProperty("Report Type Code")
public String getReportTypeCode() {
return reportTypeCode;
}

@JsonProperty("Report Type Code")
public void setReportTypeCode(String reportTypeCode) {
this.reportTypeCode = reportTypeCode;
}

@JsonProperty("Report Type Description")
public String getReportTypeDescription() {
return reportTypeDescription;
}

@JsonProperty("Report Type Description")
public void setReportTypeDescription(String reportTypeDescription) {
this.reportTypeDescription = reportTypeDescription;
}

@JsonProperty("Filed Online")
public Boolean getFiledOnline() {
return filedOnline;
}

@JsonProperty("Filed Online")
public void setFiledOnline(Boolean filedOnline) {
this.filedOnline = filedOnline;
}

@JsonProperty("Incident Code")
public Integer getIncidentCode() {
return incidentCode;
}

@JsonProperty("Incident Code")
public void setIncidentCode(Integer incidentCode) {
this.incidentCode = incidentCode;
}

@JsonProperty("Incident Category")
public String getIncidentCategory() {
return incidentCategory;
}

@JsonProperty("Incident Category")
public void setIncidentCategory(String incidentCategory) {
this.incidentCategory = incidentCategory;
}

@JsonProperty("Incident Subcategory")
public String getIncidentSubcategory() {
return incidentSubcategory;
}

@JsonProperty("Incident Subcategory")
public void setIncidentSubcategory(String incidentSubcategory) {
this.incidentSubcategory = incidentSubcategory;
}

@JsonProperty("Incident Description")
public String getIncidentDescription() {
return incidentDescription;
}

@JsonProperty("Incident Description")
public void setIncidentDescription(String incidentDescription) {
this.incidentDescription = incidentDescription;
}

@JsonProperty("Resolution")
public String getResolution() {
return resolution;
}

@JsonProperty("Resolution")
public void setResolution(String resolution) {
this.resolution = resolution;
}

@JsonProperty("Intersection")
public String getIntersection() {
return intersection;
}

@JsonProperty("Intersection")
public void setIntersection(String intersection) {
this.intersection = intersection;
}

@JsonProperty("CNN")
public Integer getCnn() {
return cnn;
}

@JsonProperty("CNN")
public void setCnn(Integer cnn) {
this.cnn = cnn;
}

@JsonProperty("Police District")
public String getPoliceDistrict() {
return policeDistrict;
}

@JsonProperty("Police District")
public void setPoliceDistrict(String policeDistrict) {
this.policeDistrict = policeDistrict;
}

@JsonProperty("Analysis Neighborhood")
public String getAnalysisNeighborhood() {
return analysisNeighborhood;
}

@JsonProperty("Analysis Neighborhood")
public void setAnalysisNeighborhood(String analysisNeighborhood) {
this.analysisNeighborhood = analysisNeighborhood;
}

@JsonProperty("Supervisor District")
public Integer getSupervisorDistrict() {
return supervisorDistrict;
}

@JsonProperty("Supervisor District")
public void setSupervisorDistrict(Integer supervisorDistrict) {
this.supervisorDistrict = supervisorDistrict;
}

@JsonProperty("Latitude")
public String getLatitude() {
return latitude;
}

@JsonProperty("Latitude")
public void setLatitude(String latitude) {
this.latitude = latitude;
}

@JsonProperty("Longitude")
public String getLongitude() {
return longitude;
}

@JsonProperty("Longitude")
public void setLongitude(String longitude) {
this.longitude = longitude;
}

@JsonProperty("point")
public String getPoint() {
return point;
}

@JsonProperty("point")
public void setPoint(String point) {
this.point = point;
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(IncidentData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("incidentDatetime");
sb.append('=');
sb.append(((this.incidentDatetime == null)?"<null>":this.incidentDatetime));
sb.append(',');
sb.append("incidentDate");
sb.append('=');
sb.append(((this.incidentDate == null)?"<null>":this.incidentDate));
sb.append(',');
sb.append("incidentTime");
sb.append('=');
sb.append(((this.incidentTime == null)?"<null>":this.incidentTime));
sb.append(',');
sb.append("incidentYear");
sb.append('=');
sb.append(((this.incidentYear == null)?"<null>":this.incidentYear));
sb.append(',');
sb.append("incidentDayOfWeek");
sb.append('=');
sb.append(((this.incidentDayOfWeek == null)?"<null>":this.incidentDayOfWeek));
sb.append(',');
sb.append("reportDatetime");
sb.append('=');
sb.append(((this.reportDatetime == null)?"<null>":this.reportDatetime));
sb.append(',');
sb.append("rowID");
sb.append('=');
sb.append(((this.rowID == null)?"<null>":this.rowID));
sb.append(',');
sb.append("incidentID");
sb.append('=');
sb.append(((this.incidentID == null)?"<null>":this.incidentID));
sb.append(',');
sb.append("incidentNumber");
sb.append('=');
sb.append(((this.incidentNumber == null)?"<null>":this.incidentNumber));
sb.append(',');
sb.append("cADNumber");
sb.append('=');
sb.append(((this.cADNumber == null)?"<null>":this.cADNumber));
sb.append(',');
sb.append("reportTypeCode");
sb.append('=');
sb.append(((this.reportTypeCode == null)?"<null>":this.reportTypeCode));
sb.append(',');
sb.append("reportTypeDescription");
sb.append('=');
sb.append(((this.reportTypeDescription == null)?"<null>":this.reportTypeDescription));
sb.append(',');
sb.append("filedOnline");
sb.append('=');
sb.append(((this.filedOnline == null)?"<null>":this.filedOnline));
sb.append(',');
sb.append("incidentCode");
sb.append('=');
sb.append(((this.incidentCode == null)?"<null>":this.incidentCode));
sb.append(',');
sb.append("incidentCategory");
sb.append('=');
sb.append(((this.incidentCategory == null)?"<null>":this.incidentCategory));
sb.append(',');
sb.append("incidentSubcategory");
sb.append('=');
sb.append(((this.incidentSubcategory == null)?"<null>":this.incidentSubcategory));
sb.append(',');
sb.append("incidentDescription");
sb.append('=');
sb.append(((this.incidentDescription == null)?"<null>":this.incidentDescription));
sb.append(',');
sb.append("resolution");
sb.append('=');
sb.append(((this.resolution == null)?"<null>":this.resolution));
sb.append(',');
sb.append("intersection");
sb.append('=');
sb.append(((this.intersection == null)?"<null>":this.intersection));
sb.append(',');
sb.append("cnn");
sb.append('=');
sb.append(((this.cnn == null)?"<null>":this.cnn));
sb.append(',');
sb.append("policeDistrict");
sb.append('=');
sb.append(((this.policeDistrict == null)?"<null>":this.policeDistrict));
sb.append(',');
sb.append("analysisNeighborhood");
sb.append('=');
sb.append(((this.analysisNeighborhood == null)?"<null>":this.analysisNeighborhood));
sb.append(',');
sb.append("supervisorDistrict");
sb.append('=');
sb.append(((this.supervisorDistrict == null)?"<null>":this.supervisorDistrict));
sb.append(',');
sb.append("latitude");
sb.append('=');
sb.append(((this.latitude == null)?"<null>":this.latitude));
sb.append(',');
sb.append("longitude");
sb.append('=');
sb.append(((this.longitude == null)?"<null>":this.longitude));
sb.append(',');
sb.append("point");
sb.append('=');
sb.append(((this.point == null)?"<null>":this.point));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}
