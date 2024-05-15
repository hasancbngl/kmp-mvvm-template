# Kotlin Multiplatform MVVM Starter Template

Welcome to the Kotlin Multiplatform (KMP) MVVM starter template! This template provides a foundation for building cross-platform applications using Kotlin Multiplatform technology. It utilizes various libraries and resources to streamline development for Android, iOS, and desktop platforms.

## Features

- **Koin:** Dependency injection framework for managing application-level dependencies.
- **ViewModel:** Architecture component for managing UI-related data in a lifecycle-aware manner.
- **Jetpack Compose Navigation:** Navigation component tailored for Jetpack Compose UI framework.
- **Room Database:** Persistence library for managing local database operations.
- **Shared Code:** Write once and share code across Android, iOS, and desktop platforms.

## Getting Started

1. Clone or download this repository.
2. Open the project in your preferred IDE (Android Studio, IntelliJ IDEA, etc.).
3. Explore the shared code modules (`commonMain`, `androidMain`, `iosMain`, `desktopMain`).
4. Run the sample application on Android, iOS simulator, or desktop platform.

## Helpful Resources

- [Kotlin Multiplatform Samples](https://github.com/android/kotlin-multiplatform-samples): Official Kotlin Multiplatform samples repository by Android team.
- [Room KMP Documentation](https://developer.android.com/kotlin/multiplatform/room): Learn how to use Room in Kotlin Multiplatform projects.
- [Compose Tips: Room in KMP](https://www.youtube.com/watch?v=2E-3FDRPmYI): Video tutorial on integrating Room with Jetpack Compose in Kotlin Multiplatform.
- [How to Share ViewModel in Compose Navigation](https://www.youtube.com/watch?v=O85qOS7U3XQ): Video guide on sharing ViewModel instances in Jetpack Compose Navigation.
- [Kotlin Symbol Processing (KSP)](https://kotlinlang.org/docs/ksp-multiplatform.html): Official documentation for Kotlin Symbol Processing in multiplatform projects.
- [MVVM Todo App Tutorial](https://www.youtube.com/watch?v=1TLk36FdmMA): Video tutorial demonstrating MVVM architecture in a todo app (reference).

## Project Reference

This project was inspired by concepts from the MVVM Todo App tutorial ([video link](https://www.youtube.com/watch?v=1TLk36FdmMA)). While it shares similarities and some code patterns, it has been customized and enhanced with different libraries and approaches tailored to the needs of this starter template.

**Key Features:**
- Utilizes MVVM architecture for clean separation of UI and business logic.
- Implements dependency injection using Koin for managing application-level dependencies.
- Integrates Jetpack Compose Navigation for navigation within the application.
- Includes Room database for local data persistence across platforms.
- Provides shared code modules (`commonMain`, `androidMain`, `iosMain`, `desktopMain`) for cross-platform development.
- Supports Android, iOS, and desktop platforms for comprehensive app development.

**Project Link:** [KMP Basic Todo App](https://github.com/hasancbngl/kmp-basic-todo-app)

Feel free to explore and customize this starter template for your Kotlin Multiplatform (KMP) projects.

## Contributing

Contributions are welcome! Feel free to fork the repository, make improvements, and submit pull requests.

## License

This project is open source and is licensed under the [MIT License](LICENSE). Feel free to use, modify, and distribute the code as per the terms of the license.