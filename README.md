# Sample Classifieds

The application which uses amazonaws api as a base to list down sample classifieds.

# Libraries Used
 
  *  Retrofit - For the network call.

# Project Structure

  *  com.example.sampleclassifieds.screens - Contains all activities and their respective presenters.
  *  com.example.sampleclassifieds.models - Contains all our data models.
  *  com.example.sampleclassifieds.network - Contains all networking code.
  *  com.example.sampleclassifieds.image_loader - Contains all the code of custom made image loader.
  
# Tests Written

  *  Unit Test - This test is written to check if the sample size is calculated correctly for image loader.
  *  Integration Test - This test is written to validate the API response.
  
# Class written in JAVA

  *  Details Activity - This particular class is written in JAVA.

# Project Description

This project is using amazonaws api to fetch sample classifieds and display in a list. Upon clicking on any list item the user will be navigated to the classified details page where the details are shown.

# MVP

The MPV pattren is used to develop this application. In each activity package you can find a presentaion class for that particular activity. All of the application logic and functionality about any particular activity is implemented in it's respective presenter class where as the data in the correct format and from the correct source is the responsibility of model class. So, if there is any change in future or some additional functionality we shall be sure about where exactly the change is going to happen in the code.

Using MVP pattren makes this application highly extensible and maintainable.
