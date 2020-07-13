# Gojek
Gojek app (java console)

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
Design imitation of gojek application based on java console. This application provide 3 service : goride,gosend and gofood.

Design Program : 
1. This application build based on MVCS architecture.
2. This application provide GoRide service , GoSend service and GoFood service with different input and output.
3. User must input data for using service whatever he choose and save data transaction for history. Saved data has been save as a list.
4. for calculate trip fare , programmer using formula = ((length of name of destination location) + (length of name of pickup location)) * (1000/km)
5. Gopay payment method , rating and tip feature added
5. implement try and catch method to accept only proper input.
6. only exit from application by choose menu in application
	
## Technologies
Project is created with:
* Eclipse IDE for Eclipse Committers , Version: 2019-12 (4.14.0)
* Java 8
	
## Setup
To run this project, download all files in folder and run program at App.java 
