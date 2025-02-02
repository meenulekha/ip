# Leo User Guide
![Ui.png](https://github.com/meenulekha/ip/blob/master/docs/Ui.png)

Welcome to Leo, a task management application that helps you stay organized and keep track of your tasks. This user guide will walk you through the various features and functionalities of Leo.

Leo is a simple and intuitive task management application designed to assist you in managing your tasks effectively. With Leo, you can easily add, mark, unmark, delete, and find tasks, making task management a breeze.

## Adding Tasks, deadlines and events

Leo allows you to add tasks with deadlines. Follow the steps below to add a deadline to your tasks.

**Action:** 'deadline &lt;task_description&gt; /by &lt;deadline_date&gt;'
- **&lt;task_description&gt;** : Description of the task.
- **&lt;deadline_date&gt;**:  Deadline date in the format dd/MM/yyyy or MMM dd yyyy.


```
deadline Complete report /by 28/02/2024

```
expected output:
```
Got it. I've added this task:ch
[D] Complete report (by: Feb 28, 2024)
Now you have 1 task(s) in your list!
------------------------------
```

## Adding Events

## Adding Events

Leo allows you to add events to your tasks. Follow the steps below to add an event.

**Command:** `event &lt;event_description&gt; /from &lt;start_date&gt; /to &lt;end_date&gt;`
- **&lt;event_description&gt;**: Description of the event.
- **&lt;start_date&gt;**: Start date of the event in the format `dd/MM/yyyy` or `MMM dd yyyy`.
- **&lt;end_date&gt;**: End date of the event in the format `dd/MM/yyyy` or `MMM dd yyyy`.

**Example:**

```plaintext
event Team meeting /from 28/02/2024 /to 29/02/2024
```
**Expected Output:**

```
Got it. I've added this task:
[E] Team meeting (from: Feb 28, 2024, to: Feb 29, 2024)
Now you have 2 task(s) in your list!
------------------------------
```
## Deleting a Task

To delete a task, use the following command:

**Command:** `delete &lt;task_number&gt;`
- **&lt;task_number&gt;**: The number associated with the task in the list.

**Example:**

```plaintext
delete 1
```

**Expected Output:**

```
Noted. I've removed this task:
[D] Complete report (by: Feb 28, 2024)
Now you have 1 task(s) in the list.
------------------------------
```
## Finding Tasks

To find tasks containing a specific keyword, use the following command:

**Command:** `find &lt;keyword&gt;`
- **&lt;keyword&gt;**: The keyword to search for in task descriptions.

**Example:**

```plaintext
find meeting
```
**Expected Output:**

```
Here are the matching tasks in your list:
1. [E] Team meeting (from: Feb 28, 2024, to: Feb 29, 2024)
------------------------------
```

## Chronologically sorted deadlines!

"list" will allow you to see all of your tasks, deadlines and events in a chronological order


## Find your tasks easily!
"find" will allow you to find certain tasks, deadlines and events that you are looking for!

***Feel free to explore Leo's other features by using the commands mentioned in the user guide. 

  Happy tasking with Leo!
