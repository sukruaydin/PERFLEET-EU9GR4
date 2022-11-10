# Automation Testing Exercise Project
Project Name : PERFLEET-EU9GR4
In this repository, as a team, we use different test scenarios to show how QA/SDET can 
implement Cucumber framework, which is one of the populer framework in the IT market, 
in their work environment. As seen, Cucumber framework is easy to use for particulary a UI test.

## Instructions
Test Scenarios are prepared by;

## QA Team

**Serdar**
**Cemal**
**Emre**
**Ekrem**
**Mustafa**
**Muhammet**
**Turgay**
**Burhan**
**Şükrü**



qaTeam@gmail.com

Build Tool
Maven
Dependency
<dependency>
<groupId>com.intuit.karate</groupId>
<artifactId>karate-apache</artifactId>
<version>0.9.6</version>
<scope>test</scope>
</dependency>

        <dependency>
            <groupId>com.intuit.karate</groupId>
            <artifactId>karate-junit5</artifactId>
            <version>0.9.6</version>
            <scope>test</scope>
        </dependency>
Features
src > test > java > com > finspire > features
System Requirements
Java 8 + SDK

Test Scenario
I particulary created scenarios to show how to use Karate Framewrok features.
There are two more packages names data and utilites.
In the utilities package, there are different java class for the database connection, data generator and so on.
Since there are more than one scenarios in some features, there is Parallel runner to execute in parallel.
