let todo = ["Wake up at 7:30", "Eat Healthy", "Complete Apna College Lec"];

let choice = prompt("Enter a command (list/add/delete/quit or 1/2/3):");

while (true) {
    if (choice.toLowerCase() === "quit" || choice == "4") {
        console.log("Exited Todo!!!");
        break;
    }

    if (choice.toLowerCase() === "list" || choice == "1") {
        console.log("Your Todo List:");
        for (let i = 0; i < todo.length; i++) {
            console.log(`${i+1}: ${todo[i]}`);
        }
    } else if (choice.toLowerCase() === "add" || choice == "2") {
        let value = prompt("Insert the task:");
        todo.push(value);
        console.log("Task Added.");
    } else if (choice.toLowerCase() === "delete" || choice == "3") {
        let val = parseInt(prompt("Enter the index of the task to delete:"));
        if (val >= 0 && val < todo.length) {
            todo.splice(val, 1);
            console.log("Task Deleted.");
        } else {
            console.log("Invalid index!");
        }
    } else {
        console.log("Invalid command!");
    }

    choice = prompt("Enter a command (list/add/delete/quit or 1/2/3):");
}


// html content to paste in index.html
//<h3>Todo App:</h3>
//<h4>Enter List: To Show All Task.</h4>
//<h4>Enter Add: To Add a Task.</h4>
//<h4>Enter Delete: To Delete a Task.</h4>
//<h4>Enter Quit: To Quit the Todo App.</h4>