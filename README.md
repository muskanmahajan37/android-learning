
        
# Android програмчлалын үндсэн ойлголтууд

#### Android програмчлалын үндсэн хамгийн чухал ойлголтуудыг практик дээр хэрэгжүүлэх

#### Хамгийн эхний төсөл

Энэхүү төслийн хүрээнд андройд хөгжүүлэлтийн хамгийн чухал ойлголтууд болох дараах зүйлсийг сурах болно.

* [Шинэ project үүсгэх](#1-шинэ-project-үүсгэх)
* [Bottom Navigation View](#2-bottom-navigation-view)
* [Fragments](#3-fragments)
* [Android Studio дээрх төслөө хэрхэн Github-тай холбох](#4-android-studio-дээрх-төслөө-хэрхэн-github-тай-холбох)
* [Splash Screen хийх](#5-splash-screen-хийх)
* [Material Search bar хэрхэн оруулах](#6-material-search-bar-хэрхэн-оруулах)
* [Model үүсгэх](#7-model-үүсгэх)
* Өгөгдлийн сантай ажиллах
  * [Өгөгдлийн сан үүсгэх](#81-өгөгдлийн-сан-үүсгэх)
  * [Хүснэгт үүсгэх](#82-хүснэгт-үүсгэх)
  * [Хүснэгтэд өгөгдөл нэмэх болон select хийх](#83-хүснэгтэд-өгөгдөл-нэмэх-болон-select-хийх)
* Вэбтэй холбогдох
  * [Okhttp](#91-ohkttp)
* [RecyclerView болон Adapter](#10-recyclerView-болон-adapter)
* [Connection Detector](#11-connectoin-detector)
* [Material SearchBar search and suggest](#12-material-searchbar-search-and-suggest)

## 1. Шинэ project үүсгэх

Gradle гэж юу вэ?

### Short Answer

Gradle is a build system.

### Long Answer

Before Android Studio you were using Eclipse for your development purposes, and, chances are, you didn't know how to build your Android APK without Eclipse.

You can do this on the command line, but you have to learn what each tool (dx, aapt) does in the SDK.
Eclipse saved us all from these low level but important, fundamental details by giving us their own build system.

Now, have you ever wondered why the `res` folder is in the same directory as your `src` folder? 

This is where the build system enters the picture. The build system automatically takes all the source files (`.java` or `.xml`), then applies the appropriate tool (e.g. takes `java` class files and converts them to `dex` files), and groups all of them into one compressed file, our beloved APK.

This build system uses some conventions: an example of one is to specify the directory containing the source files (in Eclipse it is `\src` folder) or resources files (in Eclipse it is `\res` folder).

Now, in order to automate all these tasks, there has to be a script; you can write your own build system using shell scripting in linux or batch files syntax in windows. Got it?

Gradle is another **build system** that takes the best features from other build systems and combines them into one. It is improved based off of their shortcomings.
It is a **JVM based build system**, what that means is that you can write your own script in Java, which Android Studio makes use of.

One cool thing about gradle is that it is a **plugin based system**. This means if you have your own programming language and you want to automate the task of building some package (output like a JAR for Java) from sources then you can write a complete plugin in Java or Groovy(or Kotlin, see [here][1]), and distribute it to rest of world.

### Why did Google use it?

Google saw one of the most advanced build systems on the market and realized that you could write scripts of your own with little to no learning curve, and without learning Groovy or any other new language. So they wrote the Android plugin for Gradle.

You must have seen `build.gradle` file(s) in your project. That is where you can write scripts to automate your tasks. The code you saw in these files is Groovy code. If you write `System.out.println("Hello Gradle!");` then it will print on your console.

### What can you do in a build script?
A simple example is that you have to copy some files from one directory to another before the actual build process happens. A Gradle build script can do this.

[1]: https://blog.gradle.org/kotlin-meets-gradle

```
    implementation 'com.android.support:design:27.1.1'
    implementation 'com.android.support:recyclerview-v7:27.1.1'
    implementation 'com.android.support:cardview-v7:27.1.1'
    implementation 'com.squareup.okhttp3:okhttp:3.10.0'
    implementation 'com.android.support:support-vector-drawable:27.1.1'
    implementation 'com.orhanobut:logger:2.1.1'
    implementation 'com.github.mancj:MaterialSearchBar:0.7.6'
```

Хичээлийн холбоос: https://youtu.be/0Yyz_Ga0uAY

Нэмэлт унших материалууд 

https://developer.android.com/studio/build/

https://stackoverflow.com/questions/16754643/what-is-gradle-in-android-studio

## 2. Bottom Navigation View

Хичээлийн холбоос: https://youtu.be/zTCWuP-r5hk

## 3. Fragments

Хичээлийн холбоос: https://youtu.be/otY8m5THgQs

https://developer.android.com/guide/components/fragments

https://www.tutorialspoint.com/android/android_fragments.htm

https://medium.com/inloopx/using-android-fragments-in-2018-b9cf0b05b718

## 4. Android Studio дээрх төслөө хэрхэн Github-тай холбох

Хичээлийн холбоос: https://youtu.be/qbldKX6tQ6U

1. Sign up and create a GitHub account in www.github.com.

2. Download git from https://git-scm.com/downloads and install it in your system.

3. Open the project in android studio and go to File - Settings -Version Control - Git.

4. Click on test button to test "path to Git executable". 
   If successful message is shown everything is ok, else navigate to git.exe from where you installed git and test again.
   
5. Go to File - Settings - Version Control - GitHub. 
   Enter your email and password used to create GitHub account and click on OK button.
   
6. Then go to VCS - Import into Version Control - Share Project on GitHub. 
   Enter Repository name, Description and click Share button.
   
7. In the next window check all files in order to add files for initial commit and click OK.

8. Now the project will be uploaded to the GitHub repository and when uploading is finished 
   we will get a message in android studio showing "Successfully shared project on GitHub". 
   Click on the link provided in that message to go to GitHub repository.

## 5. Splash Screen хийх

Хичээлийн холбоос: https://youtu.be/GuHbkC4ajvM

## 6. Material Search bar хэрхэн оруулах

Хичээлийн холбоос: https://youtu.be/Qxlo6IIwLD0

## 7. Model үүсгэх

Хичээлийн холбоос: https://youtu.be/y5y95VX5t_0

## 8. Өгөгдлийн сантай ажиллах

### 8.1. Өгөгдлийн сан үүсгэх

Хичээлийн холбоос: https://youtu.be/TZZMQinZaII

### 8.2. Хүснэгт үүсгэх

Хичээлийн холбоос: https://youtu.be/4IkUxJ_whw4

### 8.3. Хүснэгтэд өгөгдөл нэмэх болон select хийх

Хичээлийн холбоос: https://youtu.be/O5uzsZQ1yTA

## 9. Вэбтэй холбогдох

## 9.1. OkHttp

Хичээлийн холбоос: https://youtu.be/nXvaComQrMU

## 10. RecyclerView болон Adapter

Хичээлийн холбоос: https://youtu.be/PUZW4kH4nD4

## 11. Connection Detector

Хичээлийн холбоос: https://youtu.be/1vcxwiNiyk4

## 12. Material SearchBar search and suggest

Хичээлийн холбоос: https://youtu.be/wK899PhR20Y
