# Person_Address
Clone the files from this repository, the file path for the mainActivity is:
https://github.com/ebrunso/Person_Address/tree/master/app/src/main/java/com/example/nameandaddress

The changed files are: MainActivity.kt, activity_main.xml, dimens.xml, Person.kt, strings.xml, colors.xml


**Requirements:**
	Create an activity with an edittext for each item listed below.  On a button click, have the values from the edit text save to an Person Object. populate text views for each of the items below from the person object. (You have to make the person class)  
	First Name
	Last Name
	Street Address
	City
	State
	Zip

Compile the project and run it, enter a person's Name and address info into the designated text entries, and hit the "Generate Address Text" button. The entered info will populate under the button, as shown in the following screencap:

![Person Address Screencap](https://raw.githubusercontent.com/ebrunso/Person_Address/master/app/src/main/java/com/example/nameandaddress/Person%20address%20emulator.png)

**Research**

1. Define the following design principles: Singleton, Factory, Builder, Facade, Prototype
**Singleton: it is a design principle that restricts an object to a single instance. 

Factory: creates an object without specifying the exact class.

Builder: Creates different objects using the same class.

Facade: It is a design principle that hides complex code using a wrapper class to make a system easier to use.

Prototype: It creates an object using the clone() method to avoid using object creator subclasses.**


2. What is the differences in ART and Dalvik? 
**Dalvik is a Just In Time (JIT) compiler, and ART is an Ahead OF Time (AOT) runtime.**


3. What is the android manifest used for?
**The Android manifest is used to declare the application's package name, the components of the app, any permissions that the app uses, and connectivity to Google Play**


4. Define the difference in Runtime and Compile Time.
**Runtime is when a program is running, compile time is the instance when the entered code is being converted to an executable**


5. How does each of the following units of measure for view work: sp, dp, px, pt, in, mm
**sp: Stands for Scaled Pixels. Can be measured using Int, Double, or Float. Varies based on user's font size. Example: 10.sp
dp: Stands for Density Independent Pixels. Can be measured using Int, Double, or Float. Should be used for views that are not fonts. Example: 10.dp
px: Stands for pixels. Can be measured using Int, Double, or Float. Example: 10px
pt: Stands for 1/72 of an inch, accounting for screen size.
in: Stands for inches, accounting for screen size.
mm: Stands for Millimeters, accounting for screen size.**

6. Describe what each section of the Android Platform arch. details.
**System Apps: Core apps that allow the Android user to access email, SMS messaging, and any other apps that can be installed to the device. This is what allows the system to be fully customizable by the user.
Java API Framework: Affords the Android OS to use many of its core features and apps by re-using this framework. Examples of the services include the view system, resource manager, notification manager, activity manager and content providers.
Native C/C++ Libraries: Required for many Android core systems to run. Examples being ART and HAL.
Android Runtime: Modern android versions use ART to run multiple virtual machines at a lower memory footprint.
Hardware Abstraction Layer (HAL): Allows device hardware to interact with higher level software using library modules.
Linux Kernel: The foundation of the Android architecture. Enables the use of key security features and allows device manufacturers to update the system Kernel.**


7. What is reflection in JAVA?
**Reflection is an API that allows you to get information or modify the behavior of constructors, methods, classes or interfaces at runtime.**

8.  How does gradle work behind the scene.
**Gradle has 3 build phases, the Initialization phase, configuration phase and execution phase.
Initialization phase: Gradle will determine if the application is a single-project build or a multi-project build using the settings.gradle file. Afterwards, it will create an org.gradle.api.Project for each project identified.**

**Configuration phase: Gradle will execute the build scripts of the projects and build a Directed Acyclic Graph (DAG) for all task objects.** 

**Execution Phase: Gradle uses the DAG to determine which tasks need to be executed, and will execute them order.**
