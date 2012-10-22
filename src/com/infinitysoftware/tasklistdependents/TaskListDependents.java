package com.infinitysoftware.tasklistdependents;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.infinitysoftware.tasklistextended.TaskListExtended;

public class TaskListDependents extends TaskListExtended{
	private String itemDependents;
	private Boolean itemHasDependents;
	private Boolean itemIsDependentComplete;


	public TaskListDependents(){
		super();
	}
	public TaskListDependents( String desc){
		super(desc);
	}

	public TaskListDependents(Date dt, String desc){
		super(dt,desc);
	}

	public TaskListDependents(Date dt, String Description, String PersonName,
			Date CompletionDate, Date DueDate, Boolean IsComplete,String Title, String Comment,
			String Dependents, Boolean HasDependents, Boolean IsDependentComplete ){
		super(dt,Description);
		setItemPersonName(PersonName);
		setItemCompletionDate(CompletionDate);
		setItemDueDate(DueDate);
		setItemIsComplete(IsComplete);
		setItemTitle(Title);
		setItemComment(Comment);

		setItemDependents(Dependents);
		setItemHasDependents(HasDependents);
		setItemIsDependentComplete(IsDependentComplete); 

	}// all items

	public String getItemDependents (){ return itemDependents;}
	public void setItemDependents (String strItemDependents){itemDependents=strItemDependents;}

	public Boolean getHasDependents (){ return itemHasDependents;}
	public void setItemHasDependents(Boolean blHasDependents){itemHasDependents = blHasDependents;}

	public Boolean getIsDependentComplete (){ return itemIsDependentComplete;}
	public void setItemIsDependentComplete(Boolean blIsDependentComplete){itemIsDependentComplete = blIsDependentComplete;}

	public String toString(){
		DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		//String strDate = dateformat.format(itemDate);
		String strDate;
		Date itemDate = getItemDate();
		if(itemDate != null){
			strDate = dateformat.format(itemDate);
		}else{
			strDate = "";
		}

		String itemPersonName = getItemPersonName();

		Date itemCompletionDate = getItemCompletionDate();
		String stritemCompletionDate ;
		if(itemCompletionDate != null){
			stritemCompletionDate = dateformat.format(itemCompletionDate);
		}else{
			stritemCompletionDate = "";
		}

		Date itemDueDate = getItemDueDate();
		String stritemDueDate ;
		if(itemDueDate != null){
			stritemDueDate = dateformat.format(itemDueDate);
		}else{
			stritemDueDate = "";
		}	

		Boolean itemIsComplete = getIsComplete();
		String strIsComplete ;
		if(itemIsComplete){
			strIsComplete = "Y";
		}else{
			strIsComplete = "N";
		}	

		String itemTitle = getItemTitle();
		String 	itemComment = getItemComment();

		Boolean itemHasDependents = getHasDependents();
		String strHasDependents ;
		if(itemHasDependents){
			strHasDependents = "Y";
		}else{
			strHasDependents = "N";
		}	


		Boolean itemIsDependentComplete = getIsDependentComplete();
		String strIsDependentComplete ;
		if(itemIsDependentComplete){
			strIsDependentComplete = "Y";
		}else{
			strIsDependentComplete = "N";
		}	

		return "TaskList is: Description: " +getItemDescription() + " Date: " + strDate +
				" Person Name: " + itemPersonName + " Completion Date: " + stritemCompletionDate +
				" Due Date: " + stritemDueDate + " Is Complete: " + strIsComplete +
				" Title: " + itemTitle + "Comment: " + itemComment +
				" Has Dependents: " + strHasDependents + 
				" Dependents: " + itemDependents +
				" Dependent Complete: " + strIsDependentComplete;

	}//toString	

	public String ShowBasicData(){
		DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		String strDate;
		Date itemDate = getItemDate();
		if(itemDate != null){
			strDate = dateformat.format(itemDate);
		}else{
			strDate = "";
		}

		String itemPersonName = getItemPersonName();

		Date itemCompletionDate = getItemCompletionDate();
		String stritemCompletionDate ;
		if(itemCompletionDate != null){
			stritemCompletionDate = dateformat.format(itemCompletionDate);
		}else{
			stritemCompletionDate = "";
		}

		Date itemDueDate = getItemDueDate();
		String stritemDueDate ;
		if(itemDueDate != null){
			stritemDueDate = dateformat.format(itemDueDate);
		}else{
			stritemDueDate = "";
		}	

		Boolean itemIsComplete = getIsComplete();
		String strIsComplete ;
		if(itemIsComplete){
			strIsComplete = "Y";
		}else{
			strIsComplete = "N";
		}	

		String itemTitle = getItemTitle();
		String 	itemComment = getItemComment();


		Boolean itemHasDependents = getHasDependents();
		String strHasDependents ;
		if(itemHasDependents){
			strHasDependents = "Y";
		}else{
			strHasDependents = "N";
		}	


		Boolean itemIsDependentComplete = getIsDependentComplete();
		String strIsDependentComplete ;
		if(itemIsDependentComplete){
			strIsDependentComplete = "Y";
		}else{
			strIsDependentComplete = "N";
		}	

		return "TaskList is: Description: " +getItemDescription() + "\n" + 
		" Date: " + strDate +"\n" +
		" Person Name: " + itemPersonName +"\n" + 
		" Completion Date: " + stritemCompletionDate +"\n" +
		" Due Date: " + stritemDueDate + "\n" +
		" Is Complete: " + strIsComplete +"\n" +
		" Title: " + itemTitle + "\n" +
		" Comment: " + itemComment  + "\n" +
		" Has Dependents: " + strHasDependents + "\n" + 
		" Dependents: " + itemDependents +"\n" +
		" Dependent Complete: " + strIsDependentComplete;
	}//ShowBasicData
}//TaskListDependents
