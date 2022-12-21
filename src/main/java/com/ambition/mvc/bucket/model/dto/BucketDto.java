package com.ambition.mvc.bucket.model.dto;

import java.sql.Date;


public class BucketDto {

	private Long bucketCode;
	private String content;
	private Date cofigDate;
	private Date successDate;
	private CategoryDto category;
	private String delStatus;
	
	public BucketDto() {}

	public BucketDto(Long bucketCode, String content, Date cofigDate, Date successDate, CategoryDto category,
			String delStatus) {
		super();
		this.bucketCode = bucketCode;
		this.content = content;
		this.cofigDate = cofigDate;
		this.successDate = successDate;
		this.category = category;
		this.delStatus = delStatus;
	}

	public Long getBucketCode() {
		return bucketCode;
	}

	public void setBucketCode(Long bucketCode) {
		this.bucketCode = bucketCode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCofigDate() {
		return cofigDate;
	}

	public void setCofigDate(Date cofigDate) {
		this.cofigDate = cofigDate;
	}

	public Date getSuccessDate() {
		return successDate;
	}

	public void setSuccessDate(Date successDate) {
		this.successDate = successDate;
	}

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public String getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(String delStatus) {
		this.delStatus = delStatus;
	}

	public String toString() {
		return "BucketDto [bucketCode=" + bucketCode + ", content=" + content + ", cofigDate=" + cofigDate
				+ ", successDate=" + successDate + ", category=" + category + ", delStatus=" + delStatus + "]";
	}
	
	
}
