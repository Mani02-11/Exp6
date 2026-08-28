# 📱 Experiment 6 – Android Basic Views

## Develop an Android Application Using Basic Views

---

## 👨‍💻 Student Details

**Name:** Manikandan P  
**USN:** 25MCAR0186  
**Subject:** Mobile Application Development Lab  

---

## 🎯 Aim

To develop an Android application using Android Studio and Kotlin that demonstrates the use of basic Android Views such as TextView, EditText, Spinner, RadioButton, CheckBox, Switch, and Button.

---

## 📖 Experiment Description

This experiment demonstrates the implementation of **Basic Android Views** using Kotlin and XML.

The application provides an attractive student profile form. The user can enter personal details, select a course and academic year, choose areas of interest, enable or disable notifications, and submit the profile.

The application also provides a **Clear Form** option to reset the entered information.

### Scenario

The application simulates a **Student Profile System**.

```text
Student Profile
        ↓
Enter Personal Details
        ↓
Select Course
        ↓
Select Academic Year
        ↓
Select Interests
        ↓
Enable / Disable Notifications
        ↓
Click SUBMIT PROFILE
```

---

## 🧠 Concept / Technology Used

### Basic Android Views

Android Views are UI components used to create interactive application interfaces.

This application uses the following Android Views:

- **TextView** – Displays text, headings, and labels.
- **EditText** – Accepts user input.
- **Spinner** – Provides a dropdown list for course selection.
- **RadioButton** – Allows the user to select one academic year.
- **CheckBox** – Allows multiple interests to be selected.
- **Switch** – Provides ON/OFF functionality.
- **Button** – Performs Submit and Clear actions.
- **ScrollView** – Makes the interface scrollable on different screen sizes.
- **Kotlin** – Used for application logic.
- **XML** – Used to design the user interface.
- **Android Studio** – Used for application development.

---

## 🚀 Features

- 🎓 Attractive student profile interface
- 👤 Full Name field
- 🆔 USN field
- 📧 Email field
- 🎓 Course selection
- 📚 Academic year selection
- 💻 Multiple interest selection
- 🔔 Notification ON/OFF switch
- ✅ Form validation
- 📋 Submit Profile button
- 🧹 Clear Form button
- 💬 Toast message displaying submitted details
- 🌌 Gradient background
- ✨ Custom student logo
- 📱 Scrollable user interface

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Android Studio | Application Development |
| Kotlin | Programming Language |
| XML | User Interface Design |
| Android SDK | Android Development |
| TextView | Display Text |
| EditText | User Input |
| Spinner | Course Selection |
| RadioButton | Year Selection |
| CheckBox | Interest Selection |
| Switch | ON/OFF Control |
| Button | User Actions |

---

# 📂 Project Structure

```text
app
│
├── manifests
│   └── AndroidManifest.xml
│
├── java
│   └── Exp6
│       └── MainActivity.kt
│
├── res
│   │
│   ├── drawable
│   │   ├── gradient_bg.xml
│   │   ├── card_bg.xml
│   │   ├── edittext_bg.xml
│   │   ├── button_bg.xml
│   │   └── logo_bg.xml
│   │
│   ├── layout
│   │   └── activity_main.xml
│   │
│   └── values
│       ├── colors.xml
│       ├── strings.xml
│       └── themes.xml
│
└── Gradle Scripts
```

---

# 🎨 User Interface

The application contains a modern student profile interface with:

- Student logo
- Student Profile heading
- Personal Information section
- Full Name
- USN
- Email Address
- Course selection
- Academic year selection
- Interests
- Notification switch
- Submit Profile button
- Clear Form button

---

# 🧪 Test Cases

## Test Case 1 – Application Launch

### Objective

To verify that the application launches successfully and displays the Student Profile page.

### Input

Launch the application.

### Expected Result

The Student Profile page should be displayed successfully with the student logo, input fields, course selection, year selection, interests, notification switch, and buttons.

### Actual Result

The application launched successfully and displayed the Student Profile page.

### Status

✅ **Passed**

### Screenshot

<img width="400" height="660" alt="1000162806" src="https://github.com/user-attachments/assets/07a05725-a9f9-4e7a-9989-6db5d9e579bf" />


---

# 🧪 Test Case 2 – Fill Student Details

### Objective

To verify that the application accepts valid student details using different Android Views.

### Input

```text
Name: Manikandan P
USN: 25MCAR0186
Email: manikandan021103@gmail.com
Course: MCA
Year: 2nd Year
Interests: Programming, Database
Notifications: Enabled
```

### Expected Result

The application should accept all valid student details and allow the user to submit the profile.

### Actual Result

All student details were entered and selected successfully.

### Status

✅ **Passed**

### Screenshot

<img width="400" height="660" alt="1000162807" src="https://github.com/user-attachments/assets/afd78881-7d40-4a07-9616-39c662152150" />


---

# 🧪 Test Case 3 – Submit and Clear Form

### Objective

To verify that the Submit Profile and Clear Form buttons work correctly.

### Input

Click the **SUBMIT PROFILE** button after entering valid details.

### Expected Result

A Toast message should display the submitted student details. After clicking **Clear Form**, all entered values and selections should be reset.

### Actual Result

The profile was submitted successfully and the form was cleared successfully.

### Status

✅ **Passed**

### Screenshot

<img width="400" height="660" alt="1000162808" src="https://github.com/user-attachments/assets/509000de-3c28-44ee-b816-6fa6e2d5a0f4" />

<img width="400" height="660" alt="1000162809" src="https://github.com/user-attachments/assets/c73c0e63-5f67-4868-869b-a2afdf0a3870" />

---

# 🎓 Learning Outcomes

After completing this experiment, the following concepts were understood:

- Creating Android user interfaces using basic Views
- Using `TextView` and `EditText`
- Using `Spinner` for dropdown selection
- Using `RadioButton` for single selection
- Using `CheckBox` for multiple selections
- Handling Button click events
- Performing basic form validation
- Displaying messages using Toast
- Designing attractive Android interfaces using XML
- Handling user interaction using Kotlin
- Creating scrollable layouts for different screen sizes

---
