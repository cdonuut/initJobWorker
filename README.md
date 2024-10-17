# Camunda Job Worker Example 

### Experimental Only. Please only base your generic idea! Build your solution by being advised at https://docs.camunda.io/

## How to setup the project

### Step 1 - Clone the project: 
Pre-requisites:
- Java Development Kit (JDK) 8 or later
- GIT
- Any IDE (IntelliJ, Eclipse, etc.)

Clone this repository to your machine by opening your preferred terminal and typing:
```
git clone https://github.com/cdonuut/jobWorkerTest.git
```


### Step 2 - Perform the clean build:
Navigate to the project directory (at the location where you've setup the project)
```
cd jobWorkerTest
```
Build the project using Maven:
```
mvn clean install
```

Run the application!


## Prepare your connection settings

Fill the application.properties file with the credentials you received when creating your API client information on Cluster Setup
```
zeebe.client.cloud.region=xxx
zeebe.client.cloud.clusterId=xxxxx
zeebe.client.cloud.clientId=yxxxxx
zeebe.client.cloud.clientSecret=.xxxxxx
```
