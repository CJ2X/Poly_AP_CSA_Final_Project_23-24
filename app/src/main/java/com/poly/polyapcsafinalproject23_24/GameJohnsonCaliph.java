package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Scanner;

public class GameJohnsonCaliph extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3;

    private boolean isWon;
    //instance variables
    //   variables you plan to use throughout the adventure
    private int numLives;
    //private Player player; (optional)
    private Scanner scan;

    //private Player player; (optional)


    public void run()
    {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1= findViewById(R.id.btn_1);
        btn2= findViewById(R.id.btn_2);
        btn3= findViewById(R.id.btn_3);

        tvTitle.setText("Chores");
        //initialize number of lives
        numLives = 3;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        start();
    }
    private void setAllBtnVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    public void start()
    {
        //start adventure here

        isWon = false;


        tvStoryText.setText("It's chore day. let's go on a Chore sweep!");

        setAllBtnVisible();
        btn1.setText("Go clean dog poop");
        btn2.setText("Go clean my room");
        btn3.setText("use your Hand ");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doYourChores();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheBed();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                useYourHands();
            }
        });

    }
    private void doYourChores()
    {

        tvStoryText.setText("\nYou picked to do your chores and the first thing you do is clean your room");
        tvStoryText.setText("1. Clean the bed\n2. Clean the desk");

        setAllBtnVisible();
        btn1.setText("Go clean dog poop");
        btn2.setText("Go clean my room");
        btn3.setText("Use your hands");

    }

    private void cleanTheBed()
    {
        tvStoryText.setText("\nYou picked to clean the bed but you accidentally slipped and fell and broke your leg");

        defeat();
    }

    private void cleanTheDesk()
    {
        tvStoryText.setText("\nYou picked need gloves to clean the desk");
        tvStoryText.setText("1. Get gloves\n2. Don't get gloves");


    }

    private void useYourHands()
    {
        tvStoryText.setText("You picked to use your hands to clean the desk");
        defeat();
    }
    private void GetGloves()
    {
        tvStoryText.setText("\nGreat job you picked the right choice");
    }

    private void nogloves()
    {
        tvStoryText.setText("\nDamm you picked not to use gloves");
        defeat();
    }
    // COOK DINNER
    private void cookDinner()
    {
        tvStoryText.setText("\nCooking dinner should be easy, so you will be making a salad");
        tvStoryText.setText("1. Make a veggie salad\n2. Make a meat salad");


    }

    private void makeVeggieSalad()
    {
        tvStoryText.setText("\nNice job you're making a veggie salad so you don't have to worry about gettingsick off meat");
    }
    private void makeMeatSalad()
    {
        tvStoryText.setText("\nYou picked to make a meat salad but you got sick off of it");
        tvStoryText.setText("1. leave the salad\n2. clean the salad up");


    }
    private void leavetheSalad()
    {
        tvStoryText.setText("\nYou picked to leave the salad now you are not to feeling too good now");
        defeat();
    }

    private void cleanTheSalad()
    {
        tvStoryText.setText("\nYou picked to clean the salad up and you feel better now");
    }

    private void cookTurkey()
    {
       ivStory.setImageDrawable(R.drawable.);
        tvStoryText.setText("\nYou picked to cook turkey but your not to sure on how cook it right");
        tvStoryText.setText("1. Cook it in the mircowave\n2. Cook it in the oven");


    }

    private void cookInTheMicrowave()
    {
        tvStoryText.setText("\nYou picked to cook it in the microwave but it is still not cooked enough");
        defeat();
    }
    private void cookInTheOven()
    {
        tvStoryText.setText("\nYou picked to cook it in the oven and it is cooked perfectly");
        tvStoryText.setText("1. Season the turkey\n2. Don't season the turkey");

    }

    private void seasonTheTurkey()
    {
        tvStoryText.setText("Its good to see that the turkey is cooked great could've been a bit better though");
        defeat();
    }
    private void dontSeasonTheTurkey()
    {
        tvStoryText.setText("\nYou picked not to season the turkey and you are not feeling the best now");
        defeat();
    }
    //CLEAN THE LIVING ROOM
    private void cleanTheLivingRoom()
    {
        tvStoryText.setText("\nCleaning the living room is very important becuase it is one of the biggest rooms in the house");
        tvStoryText.setText("1. Clean the couch\n2. Clean the TV");

    }
    private void cleanTheCouch()
    {
        tvStoryText.setText("\nYou picked to clean the couch but you layed down and feel asleep");
        defeat();
    }

    private void cleanTheTV()
    {
        tvStoryText.setText("\nYou picked to clean the TV and it is clean now you are ready to clean out the drawers");
        tvStoryText.setText("1. Clean the drawers fully\n2.Clean the drawers partially");

    }

    private void cleanTheDrawersFully()
    {
        tvStoryText.setText("\nYou picked to clean the drawers complety and now you are ready to clean the closet");
    }


    private void cleanTheDrawersPartially()
    {
        tvStoryText.setText("\nThis didn't work out for because there was a spider in drawer and it bit you");
        defeat();
    }

    private void cleanTheCloset()
    {
        tvStoryText.setText("\nCleaning closet is going to be a big task to handle which would you like to start with first");
        tvStoryText.setText("1. Clean the clothes\n2. Clean the shoes");

    }
    private void cleanTheClothes()
    {
        tvStoryText.setText("\nYou picked to clean the clothes but you missed a few pieces");
        defeat();
    }

    private void cleanTheShoes()
    {
        tvStoryText.setText("\nYou are doing pretty smooth so far by picking up the shoes which means you are done with evrything great job");
    }


    private void defeat()
    {
        numLives--;
        tvStoryText.setText("You lose bud");

        if(numLives > 0)
        {
            start();
        }
        else if(numLives == 0)
        {
            tvStoryText.setText("Play again");
        }
    }



    private void getGloves() {

    }
    private void dontGetGloves() {

    }
    private void leaveTheSalad() {

    }







}
