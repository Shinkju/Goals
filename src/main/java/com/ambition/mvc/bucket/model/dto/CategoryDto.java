package com.ambition.mvc.bucket.model.dto;

public class CategoryDto {
	
	private Long categoryCode;
	private String categoryName;
	
	public CategoryDto() {}

	public CategoryDto(Long categoryCode, String categoryName) {
		super();
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
	}

	public Long getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(Long categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String toString() {
		return "CategoryDto [categoryCode=" + categoryCode + ", categoryName=" + categoryName + "]";
	}
	
	

}
