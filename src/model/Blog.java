package model;

import java.time.LocalDate;

// Type your code

public class Blog{
	
	private String title;
	private String description;
	private LocalDate postedOn;
	
	public Blog(String title,String description,LocalDate postedOn){
		this.setTitle(title);
		this.setDescription(description);
		this.setPostedOn(postedOn);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	
}

