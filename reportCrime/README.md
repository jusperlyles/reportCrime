# Report Crime - Android Application

A comprehensive crime reporting and community safety application for Uganda.

## Features

- **Report Crime**: Submit crime reports with location and details
- **Get Help**: Access emergency services and support resources
- **Lost and Found**: Post and search for lost items or found items
- **Missing Persons**: Report and search for missing persons
- **Search Stations**: Find nearby police stations and emergency services
- **Laws and Rights**: Access constitutional laws and citizen rights information
- **Real-time Notifications**: Stay updated with alerts and announcements
- **Multi-language Support**: Available in multiple languages

## Project Structure

```
android_project/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/reportcrime/
│   │       │   ├── MainActivity.java
│   │       │   ├── splash.java
│   │       │   ├── authentication.java
│   │       │   ├── ReportCrimeActivity.java
│   │       │   ├── GetHelp.java
│   │       │   ├── Lost_and_found.java
│   │       │   ├── MissingPersonsActivity.java
│   │       │   ├── Search_Stations.java
│   │       │   ├── Laws_and_rights.java
│   │       │   ├── notification.java
│   │       │   └── Setting.java
│   │       ├── res/
│   │       │   ├── layout/          # XML layout files
│   │       │   ├── drawable/        # Images and icons
│   │       │   ├── values/          # Strings, colors, styles
│   │       │   ├── menu/            # Menu definitions
│   │       │   └── anim/            # Animations
│   │       └── AndroidManifest.xml
│   ├── build.gradle                 # App-level build configuration
│   └── google-services.json         # Firebase configuration
├── build.gradle                     # Project-level build configuration
├── settings.gradle                  # Project settings
└── gradle.properties                # Gradle properties

```

## Requirements

- Android Studio Arctic Fox or newer
- Android SDK API 24 (Android 7.0) or higher
- Java 8 or higher
- Firebase account (for backend services)

## Setup Instructions

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd android_project
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an Existing Project"
   - Navigate to the `android_project` folder

3. **Configure Firebase**
   - Create a Firebase project at https://console.firebase.google.com/
   - Add your Android app to the Firebase project
   - Download `google-services.json` and place it in `app/` directory
   - Enable Firebase Authentication, Realtime Database, and Analytics

4. **Sync Gradle**
   - Click "Sync Now" when prompted
   - Wait for dependencies to download

5. **Run the App**
   - Connect an Android device or start an emulator
   - Click the "Run" button in Android Studio

## Permissions

The app requires the following permissions:
- **INTERNET**: For network communication
- **ACCESS_FINE_LOCATION**: For location-based features
- **ACCESS_COARSE_LOCATION**: For general location access
- **CALL_PHONE**: For emergency calling features

## Key Activities

- **splash.java**: Splash screen with app logo and animations
- **MainActivity.java**: Main dashboard with navigation drawer
- **authentication.java**: User login and registration
- **ReportCrimeActivity.java**: Crime reporting form
- **GetHelp.java**: Emergency help and resources
- **Lost_and_found.java**: Lost and found items management
- **MissingPersonsActivity.java**: Missing persons reports
- **Search_Stations.java**: Police station locator
- **Laws_and_rights.java**: Legal information and rights
- **notification.java**: Notifications center
- **Setting.java**: App settings and preferences

## Dependencies

- AndroidX libraries
- Material Design Components
- Firebase (Auth, Database, Analytics)
- Google Play Services (Maps, Location)
- Navigation Component

## Build Variants

- **Debug**: Development build with debugging enabled
- **Release**: Production build with optimizations

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License.

## Support

For support and inquiries:
- Email: support@reportcrime.ug
- Emergency: 999 (Uganda Police)

## Version

- **Version Name**: 1.0
- **Version Code**: 1
- **Min SDK**: 24 (Android 7.0)
- **Target SDK**: 34 (Android 14)
