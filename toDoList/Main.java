package individualDSA;

public class Main {

	public static void main(String[] args) {
		    ToDoList toDoList = new ToDoList();
		  
		    toDoList.addToDo(new Task("Task 1", "Description 1"));
		    toDoList.addToDo(new Task("Task 2", "Description 2"));
		    toDoList.addToDo(new Task("Task 3", "Description 3"));
		    
		    toDoList.markToDoAsCompleted("Task 2");
		    toDoList.viewToDoList();
		}
	}


