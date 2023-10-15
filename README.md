# JAVA SCRIPTS 
Java Scripts is a note-taking application built using Spring Boot, Thymeleaf, and PostgreSQL. It allows users to create, view, edit, and delete notes easily. Its a pun on javascript but it has nothing to do with it. It's just that it is based on Java and you create note, scripts. That is why.

<br>

### Table of Contents:
#### Installation
#### Usage
#### API Endpoints
#### Data Structure
#### Technologies Used
#### Contributing
#### License

<br>

### Installation:

1. **Clone the Repository:** Begin by cloning the project repostory using Git.
2. **Navigate to the Project Directory:** Go to the project directory using your command prompt or terminal or your file manager.
3. **Open Project:** Open the project in a text editor so that it is easier to build, just run the Application.java file.    

<br>

### Usage:
 
Once the application is up and running, it exposes the following RESTful API endpoints to manage student data.

<br>

### API Endpoints

GET     {{base_url}}/                 : Get all notes.
POST    {{base_url}}/new              : Create a new note.
PUT     {{base_url}}/update/{id}      : Update an existing note.
DELETE  {{base_url}}/delete/{id}      : Delete a note.

<br>

### Data Structure
The student data structure is as follows:

public class Student {
    private Long id;
    private String note;
    private Category category;
}

<br>

### Technologies Used:

- Java
- Spring Boot
- Maven
- Hibernate
- RESTful API
- Thymeleaf
- Git
- PostgreSQL
- Postman

<br>

### Contributing:

#### Reporting Issues

If you encounter a bug or have an idea for improvement:

1. **Submit an Issue:** Visit the [issue tracker](https://github.com/dexdevtech/java-scripts-notes-app/issues) and create a new issue.
2. **Provide Details:** Clearly describe the problem or feature request.
3. **Stay Engaged:** Check for updates on your issue.

#### Code Contributions

Interested in contributing code? Follow these steps:

1. **Fork & Clone:** Fork the repository and clone it to your machine.
2. **Create a Branch:** Make a new branch for your changes.
3. **Code:** Write your code, adhering to any guidelines if available.
4. **Test:** Ensure your changes work and add tests if relevant.
5. **Pull Request:** Open a pull request from your branch.

#### Contribution Guidelines

- Maintain a polite and collaborative tone in discussions.
- Align contributions with project goals and your vision.

Feel free to reach out with questions or concerns dexdevtech@gmail.com

<br>

### License:

This project is licensed under the MIT License.

MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

