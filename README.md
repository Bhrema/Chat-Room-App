# Chat Room App

## Overview
This project is an Android application that allows users to join chat rooms and communicate in real-time. It demonstrates the use of Java and Kotlin with Gradle for building and managing dependencies. The app follows the MVVM (Model-View-ViewModel) architecture and uses Firebase Firestore for real-time data storage and synchronization.

## Features
- User authentication
- Real-time messaging
- Push notifications
- Chat room creation and management

## Technologies Used
- Kotlin
- Gradle
- Firebase Firestore

## Getting Started

### Prerequisites
- JDK 11 or higher
- Gradle

### Installation
1. Clone the repository:
    ```sh
    https://github.com/Bhrema/Chat-Room-App.git
)
    ```
2. Open the project in Android Studio.
3. Sync the project with Gradle files.

### Running the Application
1. Connect an Android device or start an emulator.
2. Click on the "Run" button in Android Studio.

## Usage
To use the application, follow these steps:
1. Register or log in using your credentials.
2. Join an existing chat room or create a new one.
3. Start sending and receiving messages in real-time.
4. Enable push notifications to receive updates on new messages.

## Firebase and Firestore
This application uses Firebase Firestore for storing and retrieving chat room data in real-time. The `RoomRepository` class handles the interaction with Firestore, including creating new chat rooms and fetching existing ones.

## MVVM Architecture
The application follows the MVVM (Model-View-ViewModel) architecture:
- **Model**: Represents the data layer, including the `RoomRepository` class that interacts with Firestore.
- **View**: Represents the UI layer, which displays data and sends user actions to the ViewModel.
- **ViewModel**: Acts as a bridge between the Model and the View, handling business logic and preparing data for the UI.

## Contributing
1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -m 'Add some feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Open a Pull Request.


## Acknowledgements
- Inspiration from various open-source chat applications.
- References from official Android documentation.
