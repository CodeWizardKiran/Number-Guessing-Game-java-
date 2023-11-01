ABSTRACT
The "GuessingGame" project is a Java-based endeavour aimed at designing and 
developing an interactive two-player guessing game using the Java Swing library. 
In this project, players are engaged in a game where they alternately guess a 
randomly generated target number within a predetermined range. This 
document presents a comprehensive overview of the project's scope, 
objectives, methodology, and key design considerations.

1. INTRODUCTION

1.1 Problem Definition
The GuessingGame project aims to develop a simple two-player guessing game 
using Java's Swing library. Players take turns guessing a randomly generated 
target number within a specified range. The objective is to provide an engaging 
user experience that promotes interactive gameplay.

1.2 Objectives
The objectives of this project are as follows:
Develop a user-friendly GUI-based two-player guessing game. 
Implement a mechanism for players to enter their guesses.
Provide real-time feedback on guess correctness and proximity. 
Create a functional game log to display the progress of the game.
Enhance user engagement and interactivity through dynamic UI elements.

1.3 Methodology
The methodology for achieving the objectives includes the following steps: 
Utilizing Java's Swing library for creating the graphical user interface.
Implementing random number generation for the target number. 
Designing an event-driven system to capture player interactions. 
Establishing a feedback mechanism based on guess comparisons. 
Structuring the application using modular programming principles.

1.4 Requirement Specifications
The software requirements for the GuessingGame project include: 
Java Development Kit (JDK) for coding and compilation.
Java Swing library for building the graphical user interface. 
User input fields for players to submit their guesses.
Text display areas for conveying game progress and results.

2. JAVA COLLECTIONS FRAMEWORK
The Java Collections Framework (JCF) is a powerful set of classes and interfaces 
that provide implementations of common data structures such as lists, sets, 
maps, and queues. While the provided "GuessingGame" project doesn't 
explicitly utilize the Java Collections Framework, we can explore scenarios 
where JCF could enhance the application's functionality and maintainability.
In the context of the GuessingGame, the Java Collections Framework could be 
leveraged for the following purposes:

Player History: Maintain a record of each player's guesses using an ArrayList or 
LinkedList. This would allow the game to display historical guesses and 
outcomes to players, adding an element of strategy to the gameplay.

High Scores: Implement a high score system to keep track of players who guess 
the correct number in the fewest attempts. A TreeMap or a PriorityQueue 
could be used to manage the high scores, and the top scores could be 
displayed in the game's user interface.

Guess Statistics: Utilize a HashMap or a LinkedHashMap to keep track of 
statistics such as the frequency of guesses being too low, too high, or correct. 
This information could provide insights into player behavior and help fine-tune 
the game's difficulty.

Player Order: If the game were to expand to accommodate more than two 
players, a Queue like LinkedList could be employed to manage the order of 
player turns. This ensures fairness and systematic rotation of players.
While the current implementation of the GuessingGame does not explicitly 
employ the Java Collections Framework, the examples above illustrate how 
integrating JCF could enhance various aspects of the game's functionality, 
improve user engagement, and provide a richer experience for players.

3. SYSTEM DESIGN

3.1 Functional Block Diagram
The functional block diagram of the GuessingGame system consists of the 
following components:
Graphical User Interface (GUI) 
Input Capture (Guess submission)
Game Logic (Guess evaluation and player switching) 
Game Log (Displaying progress and results)

3.2 Module Description
GUI Module: This module handles the creation of the main application window 
and user interface components.
Input Capture Module: Responsible for capturing and processing player 
guesses entered through the text field.
Game Logic Module: Manages the core game logic, including generating the 
target number, evaluating guesses, and switching players.
Game Log Module: Displays the game's progress, player actions, and 
outcomes.

4. IMPLEMENTATION

The implementation of the "GuessingGame" project involves a step-by-step 
realization of the outlined objectives. This section delves into the technical 
aspects of the project, discussing the code structure, key components, and the 
flow of execution.

4.1 Code Implementation
The code implementation of the "GuessingGame" project is centered around 
the main class, GuessingGame, which extends JFrame. This class serves as the 
backbone of the application, managing the graphical user interface, player 
interactions, and game logic.
Graphical User Interface (GUI):
The GUI elements are instantiated and organized within the GuessingGame 
constructor. The user interface consists of labels, text fields, buttons, and a 
text area for the game log. The layout manager used is FlowLayout.
Event Handling:
The submitButton is assigned an ActionListener to handle player guess 
submissions. When the submit button is clicked, the entered guess is extracted 
from the guessField, and the checkGuess method is called to evaluate the 
guess and provide feedback.
Random Number Generation:
The generateRandomNumber method generates a random target number 
between 1 and 100 using the Math.random() method.
Guess Evaluation and Player Switching:
The checkGuess method compares the player's guess with the target number 
and updates the game log accordingly. If the guess is correct, the player is 
congratulated, and the submit button is disabled. The player turn is switched 
using the currentPlayer variable.
Updating GUI Elements:
The currentPlayerLabel is updated to display the current player's turn. The 
gameLog is updated to display the progression of guesses and game results.
Main Method:
The main method utilizes SwingUtilities.invokeLater to create the GUI within 
the Event Dispatch Thread.

5. RESULTS AND DISCUSSIONS

5.1 Gameplay Results and Discussion
This section presents the outcomes of the game based on different player 
interactions. It includes screenshots or descriptions of the game's user 
interface during gameplay. Additionally, it discusses the responsiveness of the 
UI, the effectiveness of the feedback mechanism, and any potential areas for 
improvement.

6. CONCLUSION
In summary, the "Number-Guessing-Game" project successfully created an interactive 
two-player guessing game using Java's Swing library. The project achieved its 
goals by implementing a user-friendly interface, real-time feedback, and eventdriven programming. Future possibilities include multiplayer modes and 
enhanced features, showcasing the potential for continued innovation.
