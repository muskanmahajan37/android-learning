
        # Android програмчлалын үндсэн ойлголтууд

#### Android програмчлалын үндсэн хамгийн чухал ойлголтуудыг практик дээр хэрэгжүүлэх

#### Хамгийн эхний төсөл

Энэхүү төслийн хүрээнд андройд хөгжүүлэлтийн хамгийн чухал ойлголтууд болох дараах зүйлсийг сурах болно.

* [Шинэ project үүсгэх](#1-шинэ-project-үүсгэх)
* [Bottom Navigation View](#2-resources)
* [Fragments](#3-layouts)
* [Android Studio дээрх төслөө хэрхэн Github-тай холбох](#4-activities)
* [Splash Screen хийх](#5-fragments)
* [Material Search bar хэрхэн оруулах](#6-shared-preference)
* [Model үүсгэх](#7-models)
* [Өгөгдлийн сантай ажиллах]
  * [Өгөгдлийн сан үүсгэх](#81-databasehelper)
  * [Хүснэгт үүсгэх](#83-хүснэгтэй-ажиллах)
  * [Хүснэгтэд өгөгдөл нэмэх болон select хийх](#83-хүснэгтэй-ажиллах)
* [Вэбтэй холбогдох]
  * [Okhttp](#101-ohkttp)
* [RecyclerView, Adapter ](#11-recyclerview)
* [Connection Detector](#9-connectoin-detector)
* [Material SearchBar search and suggest](#9-connectoin-detector)

## 1. Шинэ project үүсгэх

Dependencies гэдэг нь гаднаас сангуудыг өөрийн програмдаа дуудаж ашиглах боломжтой болгосон зүйлийг хэлнэ.

Android дээр dependencies удирдахын тулд gradle ашиглана. Доорх хэсэг gradle-ийн тохиргооны файл юу юунаас бүрддэг талаар тайлбарлая

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
