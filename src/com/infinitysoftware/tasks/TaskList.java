package com.infinitysoftware.tasks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


////////////////////////////////////////////////////////////////////////////////////////
public abstract class TaskList {

	private Date itemDate;
	private String itemDescription;

	public TaskList(){
		itemDate=null;
		itemDescription="";		 
	}// no arguments

	// Description only
	public TaskList( String Description){
		//System.out.println("All description only arguments");
		itemDate=null;
		itemDescription=Description;
	}// Description only

	public TaskList(Date dt, String Description){
		//System.out.println("All date and description arguments");
		itemDate=dt;
		itemDescription=Description;
	}// all 2 arguments

	// Accessor methods	 	
	protected Date getItemDate (){ return itemDate;}
	protected void setItemDate(Date dt){itemDate = dt;}
	protected String getItemDescription (){ return itemDescription;}
	protected void setItemDescription (String descript){itemDescription=descript;}

	public abstract String ShowBasicData();

}//TaskList - abstract
