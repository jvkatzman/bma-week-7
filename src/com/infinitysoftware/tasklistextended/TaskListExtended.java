package com.infinitysoftware.tasklistextended;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.infinitysoftware.tasklistbasic.TaskListBasic;;

public class TaskListExtended extends TaskListBasic{
	private String itemPersonName;
	private Date itemCompletionDate;
	private Date itemDueDate;
	private Boolean itemIsComplete;
	private String itemTitle;
	private String itemComment;

	public TaskListExtended(){
		super();
	}
	public TaskListExtended( String desc){
		super(desc);
	}

	public TaskListExtended(Date dt, String desc){
		super(dt,desc);
	}

	public TaskListExtended(Date dt, String Description, String PersonName,
			Date CompletionDate, Date DueDate, Boolean IsComplete,String Title, String Comment	){
		super(dt,Description);
		setItemPersonName(PersonName);
		setItemCompletionDate(CompletionDate);
		setItemDueDate(DueDate);
		setItemIsComplete(IsComplete);
		setItemTitle(Title);
		setItemComment(Comment);		 
	}// all items


	// Accessor methods	 	
	protected String getItemPersonName (){ return itemPersonName;}
	protected void setItemPersonName (String personName){itemPersonName=personName;}

	protected Date getItemCompletionDate (){ return itemCompletionDate;}
	protected void setItemCompletionDate(Date compdt){itemCompletionDate = compdt;}

	protected Date getItemDueDate (){ return itemDueDate;}
	protected void setItemDueDate(Date duedt){itemDueDate = duedt;}

	protected Boolean getIsComplete (){ return itemIsComplete;}
	protected void setItemIsComplete(Boolean blIsComp){itemIsComplete = blIsComp;}

	protected String getItemTitle (){ return itemTitle;}
	
	protected void setItemTitle (String strItemTitle){itemTitle=strItemTitle;}
	protected String getItemComment (){ return itemComment;}
	protected void setItemComment (String strItemComment){itemComment=strItemComment;}

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

		return "TaskList is: Description: " +getItemDescription() + " Date: " + strDate +
				" Person Name: " + itemPersonName + " Completion Date: " + stritemCompletionDate +
				" Due Date: " + stritemDueDate + " Is Complete: " + strIsComplete +
				" Title: " + itemTitle + " Comment: " + itemComment;
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

		return "TaskList is: Description: " +getItemDescription() + "\n" + 
		" Date: " + strDate +"\n" +
		" Person Name: " + itemPersonName +"\n" + 
		" Completion Date: " + stritemCompletionDate +"\n" +
		" Due Date: " + stritemDueDate + "\n" +
		" Is Complete: " + strIsComplete +"\n" +
		" Title: " + itemTitle + "\n" +
		" Comment: " + itemComment;

	}

}//TaskListExtended
