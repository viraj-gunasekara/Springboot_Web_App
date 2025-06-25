## FitnessFeed – Spring Boot Web App
>Viraj S. Gunasekara
>
>>Social Fitness Platform with Media Sharing, Follows, and OAuth Login
>>>Spring Boot, React JS, MySQL, Material UI, OAuth 2.0, Spring Security, REST API

## Features Implemented:
### User Management:
  * Register a new user
  * Login with credentials or via Google/Facebook (OAuth 2.0)
  * View user profile and update profile details
  * Follow other users and view public profiles
  * Dark mode support (UI theme toggle) 

### Post Management:
  * Upload up to 3 photos or 3 videos (max 30s) with a description
  * View posts by all users or specific users
  * Like and comment on posts
  * Edit posts (media and description) & Delete owned posts

## Technologies Used
### Backend:
  * Spring Boot | Spring Security – Authentication and Authorization | OAuth 2.0 – Social login (Google, Facebook) | REST API – Communication with frontend | MySQL
### Frontend:
  * React JS | Material UI (MUI) | Tailwind CSS | Formik + Yup - Form handling and validation | Axios – HTTP request handling | React Router DOM – Routing | Redux + Thunk – State management | React Hot Toast – Notification system | React Facebook Login / Google Login – OAuth integration

## Project Setup
### Backend:
```
1. Open 'Sts' (Spring Tool Suite)
2. Open Project Backend folder on 'Sts'
3. goto src/main/java/com.group36/SocialAppBackendApplication.java
4. Run As > Spring Boot App
```
### Frontend:
```
cd frontend
npm i
npm start
```
### Database:
```
Make sure you have MySQL running (MySQL Workbench)
```

## Resourses:
* Documentations, Google images, YouTube
