## 📱 MyApplication – Android App with Kotlin + Jetpack Compose

This project demonstrates a simple Android application built with Jetpack Compose, MVVM architecture, and Retrofit.
The app fetches a list of posts from the JSONPlaceholder API and displays them in card views.
When a post is clicked, a dialog window opens showing detailed information such as the User ID and Post ID.

## ⚙️ Tech stack
1. Kotlin
2. Jetpack Compose (Material 3)
3. MVVM (ViewModel + State)
4. Retrofit + Gson
5. Coroutines
6. JSONPlaceholder API

## 📂 Project structure
.
├── components/         # UI components (PostItem, PostScreen, DialogWindow)
├── model/              # Data model (Post) and ViewModel
├── network/            # ApiService + RetrofitInstance
├── ui/theme/           # Material 3 theme
└── MainActivity.kt     # Entry point

## 🔧 How to run

Clone the repository:

```
git clone https://github.com/<your-username>/<repo-name>.git
```
Open the project in Android Studio.
Run it on an emulator or a physical device.

## ✅ Features
Fetch posts from a REST API.
Display posts in a scrollable list (LazyColumn).
Show post details in a dialog window.
Implement MVVM architecture with ViewModel.
