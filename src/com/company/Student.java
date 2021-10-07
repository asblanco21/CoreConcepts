package com.company;

import java.util.Locale;

public class Student

        {
            //fields
            private String id;
            private String firstName;
            private String lastName;
            private String eMail;
            private String phoneNumber;

            //constructor


            public Student(String localid, String localFirstName, String localLastName, String localEmail, String localPhoneNumber){
                this.id = localid;
                this.firstName = localFirstName.toUpperCase().trim();
                this.lastName = localLastName.toUpperCase().trim();
                this.eMail = localEmail;
                this.phoneNumber = localPhoneNumber;
            }
            //getters and setters

            public String getId() {
                return this.id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getFirstName() {
                return this.firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return this.lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String geteMail() {
                return this.eMail;
            }

            public void seteMail(String eMail) {
                this.eMail = eMail;
            }

            public String getPhoneNumber() {
                return this.phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            //override


            @Override
            public String toString() {
                return "Student{" +
                        "id='" + id + '\'' +
                        ", firstName='" + firstName + '\'' +
                        ", lastName='" + lastName + '\'' +
                        ", eMail='" + eMail + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        '}';
            }
        }
