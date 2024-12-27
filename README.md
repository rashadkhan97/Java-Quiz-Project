# QUIZ Management System 
## Introduction 
This project provides a role-based experience for managing and participating in quizzes. It supports two user roles: **Admin** and **Student**, offering tailored functionality to create and take quizzes effectively. The system is implemented using JSON for data storage and ensures an interactive and streamlined experience.

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
  - Once 10 questions done, Again ask if they want to continue quiz until student press 'q' to stop after 10 questions.
    
- **Result Evaluation**:
  - After completing the quiz, the system evaluates the answers.
  - Displays the result based on the number of correct answers.
    
- **Result Criteria with Feedback:**
    - 8-10 marks: Excellent!
    - 6-7 marks: Good.
    - 3-5 marks: Very poor.
    - 0-2 marks: Very sorry, you are failed.
      
## Prerequisites
- Basic understanding of Java programming language.
- Java Development Kit (JDK) installed on your machine.
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).

**Files:**
- ```users.json```: Contains the login credentials and roles for both admin and students.
- ```quiz.json```: Stores the questions, options, and answer keys added by the admin.
