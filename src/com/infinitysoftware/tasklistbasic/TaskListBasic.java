package com.infinitysoftware.tasklistbasic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.infinitysoftware.tasks.TaskList;


public class TaskListBasic extends TaskList
{
	public TaskListBasic(){
		super();
	}
	public TaskListBasic( String desc){
		super(desc);
	}

	public TaskListBasic(Date dt, String desc){
		super(dt,desc);
	}

	public String ShowBasicData(){
		DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		String strDate;
		Date itemDate = getItemDate();
		if(itemDate != null){
			strDate = dateformat.format(itemDate);
		}else{
			strDate = "";
		}

		return "\n" +"TaskList is: \n" + " Description: " +getItemDescription() + "\n" + 
		" Date: " + strDate;//  + " Person: " + itemPersonName + " Date:" + strDate           + "\n")  ;
	}
	public String ShowDescription(){
		return getItemDescription();
	}//ShowDescription
	public Date ShowDate(){
		return getItemDate();
	}//ShowDate

	public String toString(){
		DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		String strDate;
		Date itemDate = getItemDate();
		if(itemDate != null){
			strDate = dateformat.format(itemDate);
		}else{
			strDate = "";
		}

		return " TaskList is: Description: " +getItemDescription() +  
				" Date: " + strDate;		
	}



}//TaskListBasic

