package model;

import java.sql.Date;

public class Task {
private  String Title;
private  String Description;
private  String Status;
private  String Deadline;
private  String Category;


public Task() {
	super();
}




public Task(String title) {
	super();
	Title = title;
}




public Task(String title, String description, String status, String deadline, String category) {
	super();
	Title = title;
	Description = description;
	Status = status;
	Deadline = deadline;
	Category = category;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public String getDeadline() {
	return Deadline;
}
public void setDeadline(String deadline) {
	Deadline = deadline;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}



@Override
public String toString() {
	return "Task [Title=" + Title + ", Description=" + Description + ", Status=" + Status + ", Deadline=" + Deadline
			+ ", Category=" + Category + "]";
}

}


