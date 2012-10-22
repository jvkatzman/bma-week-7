package com.infinitysoftware.taskfilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.infinitysoftware.com.taskfilterinterface.TaskFilterInterface;
import com.infinitysoftware.tasklistbasic.TaskListBasic;
import com.infinitysoftware.tasks.TaskList;

public class TaskFilter implements  TaskFilterInterface {
	
	@Override
	public TaskListBasic[] FilterDesc(TaskListBasic[] tasks) {
		TaskListBasic[] taskout;
		taskout= new TaskListBasic[10] ;
		
		 // blank out array
		 for (int i = 0; i < taskout.length; i++) {
			 taskout[i] = new TaskListBasic();	
		 	}// blank out array
		 
		int i = 0;
		
		for (TaskListBasic tsk : tasks){
			String strDescription = tsk.ShowDescription();
			
			if(strDescription.indexOf("basic task")>0){
				taskout[i] = new TaskListBasic(tsk.ShowDate(), tsk.ShowDescription());
				i++;
			}// description found
		}// for
		
		return taskout;

	}//filterDesc
	
	public void PrintFilterDesc(TaskListBasic[] tasks) {
	//public void PrintFilterDesc( FilterDesc (TaskListBasic[] tasks)) {	
	
		TaskListBasic[] tasksFiltered = FilterDesc(tasks);
		
		 
		 for (int i = 0; i < tasksFiltered.length; i++) {
			 
			 
		DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		String strDate;
		TaskListBasic task = tasksFiltered[i];
		
		Date itemDate = task.ShowDate();
		if(itemDate != null){
			strDate = dateformat.format(itemDate);
		}else{
			strDate = "";
		}
		
		if (task.ShowDescription() !=""){
			
			System.out.println( task.toString());
			System.out.println("\n" +"Filtered TaskList is: \n" + " Description: " + task.ShowDescription() + "\n" + 
			 " Date: " + strDate );
			
		}// date not null
		
		}
	}//PrintFilterDesc
	
}//TaskFilter
