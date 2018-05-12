# Android програмчлалын үндсэн ойлголтууд

#### Android програмчлалын үндсэн хамгийн чухал ойлголтуудыг практик дээр хэрэгжүүлэх

#### Хамгийн эхний төсөл

Энэхүү төслийн хүрээнд андройд хөгжүүлэлтийн хамгийн чухал ойлголтууд болох дараах зүйлсийг сурах болно.

* [Dependencies](#1-dependencies)
* [Resources](#2-resources)
* [Layouts](#3-layouts)
* [Activities](#4-activities)
  * [Material Search View](#41-material-search-view)
  * [Bottom Navigation](#42-bottom-navigation)
* [Fragments](#5-fragments)
* [Shared Preference](#6-shared-preference)
* [Models](#7-models)
* [Database](#8-databasehelper)
  * [DatabaseHelper](#81-databasehelper)
  * [DatabaseManager](#82-databasemanager)
  * [Create, Update, Delete, Select](#83-хүснэгтэй-ажиллах)
* [Connection Detector](#9-connectoin-detector)
* [Вэбтэй холбогдох](#10-http)
  * [Okhttp](#101-ohkttp)
* [RecyclerView](#11-recyclerview)
  * [RecyclerView](#111-recyclerview)
  * [Adapter](#112-adapter)
* [Widget](#13-widget)
* [Services](#14-services)
* [Broadcast Receivers](#15-broadcast-receivers)
* [Content Providers](#16-content-providers)

## 1. Dependencies

Dependencies гэдэг нь гаднаас сангуудыг өөрийн програмдаа дуудаж ашиглах боломжтой болгосон зүйлийг хэлнэ.

Android дээр dependencies удирдахын тулд gradle ашиглана. Доорх хэсэг gradle-ийн тохиргооны файл юу юунаас бүрддэг талаар тайлбарлая

```
apply plugin: 'com.android.application'

apply plugin: 'kotlin-android'

apply plugin: 'kotlin-android-extensions'

//
android {
    compileSdkVersion 27
    defaultConfig {
        applicationId "cloud.techstar.jisho"
        minSdkVersion 16
        targetSdkVersion 27
        versionCode 2
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
    implementation 'com.android.support:appcompat-v7:27.1.1'
    implementation 'com.android.support.constraint:constraint-layout:1.1.0'
    implementation 'com.android.support:support-v4:27.1.1'
    implementation 'com.android.support:design:27.1.1'
    implementation 'com.android.support:recyclerview-v7:27.1.1'
    implementation 'com.android.support:cardview-v7:27.1.1'
    implementation 'com.squareup.okhttp3:okhttp:3.10.0'
    implementation 'com.android.support:support-vector-drawable:27.1.1'
    implementation 'com.orhanobut:logger:2.1.1'
    implementation 'com.github.mancj:MaterialSearchBar:0.7.6'
}

```
## 2. Resources

## 3. Layouts

## 4. Activities

Энэ нь програмын үзэгдэх давхрага юм. Програмын дэлгэц бүр Activity классаас удамшсан байна. Activity нь өөрөө хэрэглэгчийн интерфейсд харагдахгүй бөгөөд үүний тулд View-ийг ашиглаж дэлгэцэнд мэдээллийг харуулах болон хэрэглэгчийн үйлдэлд хариу үзүүлэх боломжтой.
onCreate(Bundle): Энэ функц нь Activity анх удаагаа ажиллахад дуудагдах бөгөөд зөвхөн нэг удаа ачааллах зүйлсийг хавсаргаж болно. Жнь: User Interface үүсгэх Энэ функц нь нэг параметр авах бөгөөд null эсвэл onSaveInstanceState() функцээр хадгалагдсан утга байна.

### 4.1. Material Search view

### 4.2. Bottom Navigation

## 5. Fragments
Fragment нь Activity дээр хэрэглэгддэг биеэ даасан компонент юм Fragment нь Activity дотор ажилладаг ч өөрийн гэсэн амьдралын муж (life cycle), өөрийн гэсэн хэрэглэгчийн интерфэйстэй Fragment-г динамикаар болон статикаар Activity-д нэмж болно

## 6. Shared Preference

## 7. Models

## 8. Database

### 8.1. DatabaseHelper

### 8.2. DatabaseManager

### 8.3. Хүснэгттэй ажиллах

## 9. Connection detector

## 10. http

## 10.1. OkHttp

## Android Studio дээр Git болон Github-тай хэрхэн ажиллах 

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
