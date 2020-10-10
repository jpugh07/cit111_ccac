/*Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.*/
package week6;

import java.util.Scanner;

/*The purpose of this program is to prompt the user to answer a series of yes/no
questions and at the end to answer whether or not the user and programmer could be friends.
@ author Jonathan Pugh*/
public class MightWeBeFriends {
    public static void main(String[] args) {
        // print out header to program
        System.out.println("Might We Be Friends?");
        // create container for storing input, no value given
        int responseJedi;
        // create an initial score of 40 that will be affected by the answers given
        int friendScore = 40;
        // Ask initial question
        System.out.println("Were you once a Jedi Knight? (0 = no, 1 = yes)");
        // create a Scanner object and create variable for it to reference to
        Scanner anakinSkywalker = new Scanner(System.in);
        responseJedi = anakinSkywalker.nextInt();
        // Question 1 followed by if/else block to determine first score, include
        // print out response for either answer. Remember, 0 = -10 off of friendScore
        // 1 = friendScore not changed
        if(responseJedi == 1){
            friendScore = friendScore;
            System.out.println("Hello there!");
        } else {
            friendScore = friendScore - 10;
            System.out.println("So uncivilized");
        }// end if else block
        // Question 2, follow same instruction for Question 1
        System.out.println("Were you the best star pilot in the galaxy (0 = no, 1 = yes)");
        // no need to create new scanner but repeat line 37
        responseJedi = anakinSkywalker.nextInt();
        // 
        if(responseJedi == 1){
            friendScore = friendScore;
            System.out.println("Hello there");
        } else {
            friendScore = friendScore - 10;
            System.out.println("So uncivilized");
            
        }// end if else block 
        
        // Repeat process for Question 3
        System.out.println("Were you a cunning warrior? (0 = no, 1 = yes)");
        
        responseJedi = anakinSkywalker.nextInt();
        
        if(responseJedi == 1){
            friendScore = friendScore;
            System.out.println("Hello there");
        } else {
            friendScore = friendScore - 10;
            System.out.println("So uncivilized");
        }// end if else block
        
        // Final question, repeat process but make true =-40 and false = no change
        // to friendScore
        System.out.println("Did you help the Empire hunt down and destroy the Jedi Knights? "
                + "(0 = no, 1 = yes)");
        
        responseJedi = anakinSkywalker.nextInt();
        
        if(responseJedi == 1){
            friendScore = friendScore - 40;
            System.out.println("You were supposed to destroy the Sith not join them");
        } else {
            friendScore = friendScore;
            System.out.println("You are strong and wise and I am very proud of you");
        }// end if else block
        // Print out for end of program
        System.out.println("*****FINAL FRIEND DETERMINATION*****");
        // if/else block for final score, which should be 40, any other total
        // means we might not be friends
        if(friendScore == 40){
            System.out.println("We might be friends");
        } else {
            System.out.println("We might not be friends");
        }// end if else block
    }// end main
}// end class MightWeBeFriends
