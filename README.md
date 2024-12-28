# QUIZ Management System 
 
## **Content**
- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Features](#Features)
    - [Admin Role](#admin-role)
    - [Student Role](#student-role)
- [How to run the project](#How-to-run-the-project)
    - [Admin Dashboard](#admin-dashboard)
    - [Student Dashboard](#student-dashboard)
      
## Introduction 
This project provides a role-based experience for managing and participating in quizzes. It supports two user roles: **Admin** and **Student**, offering tailored functionality to create and take quizzes effectively. The system uses JSON for data storage and ensures an interactive and streamlined experience.



## Prerequisites
- Basic understanding of Java programming language.
- Java Development Kit (JDK) installed on your machine.
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).

**Files:**
- ```users.json```: Contains the login credentials and roles for both admin and students.
- ```quiz.json```: Stores the questions, options, and answer keys added by the admin.

## Features
### Admin Role:
- **Login**: Admin can log in using their credentials.
- **Question Management**:
  - Create multiple MCQs with 4 options and an answer key.
  - Questions are stored in a `quiz.json` file.
  - Add new questions continuously until pressing 'q' to quit.

### Student Role:
- **Login**: Students log in using their credentials.
- **Take Quiz**:
  - The system randomly selects 10 questions from the question bank stored in `quiz.json`.
  - Students answer MCQs interactively.
  - Once 10 questions are done, Again ask if they want to continue the quiz until the student presses 'q' to stop after 10 questions.
    
- **Result Evaluation**:
  - After completing the quiz, the system evaluates the answers.
  - Displays the result based on the number of correct answers.
    
- **Result Criteria with Feedback:**
    - 8-10 marks: Excellent!
    - 6-7 marks: Good.
    - 3-5 marks: Very poor.
    - 0-2 marks: Very sorry, you are failed.
 
## How to run the project

- - clone this project
   ```console
      https://github.com/rashadkhan97/Java-Quiz-Project.git
    ``` 
- Ensure ```users.json``` and ```quiz.json``` are in the same directory as your Java program.
- Run the program using your preferred IDE or the terminal.

### Admin Dashboard:
- Log in using the credentials from ```users.json``` file where (**username: ```admin```, password: ```1234```**).
- Add questions with prompts.
- Once done a message will appear - "Saved successfully! Do you want to add more questions? (press s for start and q for quit)"

#### Output Video :


https://github.com/user-attachments/assets/0ee19f98-3212-40ba-98fd-7c6b721a86a0



### Student Dashboard:
- Log in using the credentials from ```users.json``` file where (**username: ```rashad```, password: ```1234```**).
- Start the quiz by pressing ```'s'``` when prompted.
- Answer the questions interactively.
- View the result after completing the quiz.

#### Output Video: 



https://github.com/user-attachments/assets/59936335-8bb7-4342-8ab2-e3db360c6c07


