package com.infinitysoftware.tasklist;
import java.awt.print.Book;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.infinitysoftware.tasks.TaskList;
import com.infinitysoftware.tasklistbasic.TaskListBasic;
import com.infinitysoftware.tasklistextended.TaskListExtended;
import com.infinitysoftware.tasklistdependents.TaskListDependents;
import com.infinitysoftware.taskfilter.TaskFilter;

public class Assignment {
	
	public static void main(String[] args)   {
		//The purpose of this assignment is to review inheritance and implement filtering
		
		
		TaskListBasic tasks[] = new TaskListBasic[5]; 
		 // blank out array
		 for (int i = 0; i < tasks.length; i++) {
			 tasks[i] = new TaskListBasic();	
		}
		 
		 tasks[0] = new TaskListBasic();
		 tasks[1] = new TaskListBasic(new  Date(),"This is a basic task with date");
		 tasks[2] = new TaskListBasic("This is a basic task with description only");
		 tasks[3] = new TaskListExtended(new Date(), "Extended Task", "Muddy Waters", new Date(), new Date(), false, "New Songs", "Coming in a long time");	 
		 tasks[4] = new TaskListDependents(new Date(), "Extended Task", "Muddy Waters", new Date(), new Date(), false, "New Songs", "Coming in a long time","Need to be able to sing", true, false);
		 
		 //show task list
		 for (int i = 0; i < tasks.length; i++) {
			 System.out.println("\nShow Basic Data: " + i );
			 System.out.println(tasks[i].ShowBasicData());
			 System.out.println("\nTo String Data: ");
			 System.out.println(tasks[i].toString());	 	
		}
	
		// show filter
		 TaskFilter taskFilter = new TaskFilter();
		 System.out.println("\n\n" );
		 taskFilter.PrintFilterDesc(tasks);
		 
	
		 

	}//main
	
	
}//Assignment
