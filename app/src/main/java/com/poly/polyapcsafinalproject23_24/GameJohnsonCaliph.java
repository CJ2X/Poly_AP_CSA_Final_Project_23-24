package com.poly.polyapcsafinalproject23_24;

import java.util.Scanner;

public class GameJohnsonCaliph extends GameActivity {

    private TextView tvTitle, tvSubtitle, tvStoryText;

    private ImageView ivStory;

    private Button btn1, btn2, btn3;

    private boolean isWon;

    private int numLives;
    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        setContentView(R.layout.activty_game_3_button);

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

        //create a player object (optional)
        //player = new Player(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("Chores of the day");
        System.out.println("This game is about dealing with chores you need to do for day you have options to make good or bad choices");
        Util.pauseConsole();
        start();
    }
    private void setAllBtnVisible()
    {
        btn1.setVisbility(View.VISBLE);
        btn2.setVisbility(View.VISBLE);
        btn3.setVisbility(View.VISBLE);
    }

    public void start()
    {
        //start adventure here

        isWon = false;

        ivStory.setImageResource(R.drawable.im_chores_title);
        playAudio(R.raw.audio_bass);

        tvStoryText.setText("It's chore day. let's go on a Chore sweep!");

        setAllBtnsVisible();
        btn1.setText("Go clean dog poop");
        btn2.setText("Go clean my room");
        btn3.setText("Go clean the backyard");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { doYourChores(); }
         });





    private void dontDoYourChores()
    {
        Util.clearConsole();
        System.out.println("\nSince you didn't do your chores then you automatially lose the game");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    //DO YOUR CHORES
    private void doYourChores()
    {
        btn2.setOnClickLisenter(new View.OnClickListner() {
            @Override
            public void onClick(View v) {cleanTheBed();}
        });


    }


    private void cleanTheBed()
    {
        Util.clearConsole();
        System.out.println("\nYou picked to clean the bed but you accidentally slipped and fell and broke your leg");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void cleanTheDesk()
    {
        Util.clearConsole();
        System.out.println("\nYou picked need gloves to clean the desk");
        System.out.println("1. Get gloves\n2. Don't get gloves");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            getGloves();
        }
        else if(choice == 2)
        {
            dontGetGloves();
        }
    }

    private void useYourHands()
    {
        Util.clearConsole();
        System.out.println("You picked to use your hands to clean the desk");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }
    private void GetGloves()
    {
        Util.clearConsole();
        System.out.println("\nGreat job you picked the right choice");
        Util.pauseConsole();
        Util.clearConsole();
    }

    private void nogloves()
    {
        Util.clearConsole();
        System.out.println("\nDamm you picked not to use gloves");
        Util.pauseConsole();
        defeat();
    }
    // COOK DINNER
    private void cookDinner()
    {
        Util.clearConsole();
        System.out.println("\nCooking dinner should be easy, so you will be making a salad");
        System.out.println("1. Make a veggie salad\n2. Make a meat salad");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            makeVeggieSalad();
        }
        else if(choice == 2)
        {
            makeMeatSalad();
        }
    }

    private void makeVeggieSalad()
    {
        Util.clearConsole();
        System.out.println("\nNice job you're making a veggie salad so you don't have to worry about gettingsick off meat");
        Util.pauseConsole();
        Util.clearConsole();
    }
    private void makeMeatSalad()
    {
        System.out.println("\nYou picked to make a meat salad but you got sick off of it");
        System.out.println("1. leave the salad\n2. clean the salad up");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            leaveTheSalad();
        }
        else if(choice == 2)
        {
            cleanTheSalad();
        }
    }
    private void leavetheSalad()
    {
        Util.clearConsole();
        System.out.println("\nYou picked to leave the salad now you are not to feeling too good now");
        Util.pauseConsole();
        Util.clearConsole();
        defeat();
    }

    private void cleanTheSalad()
    {
        System.out.println("\nYou picked to clean the salad up and you feel better now");
        Util.pauseConsole();
        Util.clearConsole();
    }

    private void cookTurkey()
    {
        Util.clearConsole();
        System.out.println("\nYou picked to cook turkey but your not to sure on how cook it right");
        System.out.println("1. Cook it in the mircowave\n2. Cook it in the oven");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            cookInTheMicrowave();
        }
        else if (choice == 2)
        {
            cookInTheOven();
        }
    }

    private void cookInTheMicrowave()
    {
        Util.clearConsole();
        System.out.println("\nYou picked to cook it in the microwave but it is still not cooked enough");
        Util.pauseConsole();
        defeat();
    }
    private void cookInTheOven()
    {
        Util.clearConsole();
        System.out.println("\nYou picked to cook it in the oven and it is cooked perfectly");
        System.out.println("1. Season the turkey\n2. Don't season the turkey");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            seasonTheTurkey();
        }
        else if (choice == 2)
        {
            dontSeasonTheTurkey();
        }
    }

    private void seasonTheTurkey()
    {
        Util.clearConsole();
        System.out.println("Its good to see that the turkey is cooked great could've been a bit better though");
        Util.pauseConsole();
        defeat();
    }
    private void dontSeasonTheTurkey()
    {
        Util.clearConsole();
        System.out.println("\nYou picked not to season the turkey and you are not feeling the best now");
        Util.pauseConsole();
        defeat();
    }
    //CLEAN THE LIVING ROOM
    private void cleanTheLivingRoom()
    {
        Util.clearConsole();
        System.out.println("\nCleaning the living room is very important becuase it is one of the biggest rooms in the house");
        System.out.println("1. Clean the couch\n2. Clean the TV");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            cleanTheCouch();
        }
        else if (choice == 2)
        {
            cleanTheTV();
        }
    }
    private void cleanTheCouch()
    {
        Util.clearConsole();
        System.out.println("\nYou picked to clean the couch but you layed down and feel asleep");
        Util.pauseConsole();
        defeat();
    }

    private void cleanTheTV()
    {
        Util.clearConsole();
        System.out.println("\nYou picked to clean the TV and it is clean now you are ready to clean out the drawers");
        System.out.println("1. Clean the drawers fully\n2.Clean the drawers partially");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            cleanTheDrawersFully();
        }
        else if (choice == 2)
        {
            cleanTheDrawersPartially();
        }
    }

    private void cleanTheDrawersFully()
    {
        Util.clearConsole();
        System.out.println("\nYou picked to clean the drawers complety and now you are ready to clean the closet");
        Util.pauseConsole();
        Util.clearConsole();
    }


    private void cleanTheDrawersPartially()
    {
        Util.clearConsole();
        System.out.println("\nThis didn't work out for because there was a spider in drawer and it bit you");
        Util.pauseConsole();
        defeat();
    }

    private void cleanTheCloset()
    {
        Util.clearConsole();
        System.out.println("\nCleaning closet is going to be a big task to handle which would you like to start with first");
        System.out.println("1. Clean the clothes\n2. Clean the shoes");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            cleanTheClothes();
        }
        else if (choice == 2)
        {
            cleanTheShoes();
        }
    }
    private void cleanTheClothes()
    {
        Util.clearConsole();
        System.out.println("\nYou picked to clean the clothes but you missed a few pieces");
        Util.pauseConsole();
        defeat();
    }

    private void cleanTheShoes()
    {
        Util.clearConsole();
        System.out.println("\nYou are doing pretty smooth so far by picking up the shoes which means you are done with evrything great job");
        Util.pauseConsole();
        Util.clearConsole();
    }


    private void defeat()
    {
        numLives--;
        Util.clearConsole();
        System.out.println("You lose bud");
        Util.pauseConsole();

        if(numLives > 0)
        {
            start();
        }
        else if(numLives == 0)
        {
            System.out.println("Play again");
        }
    }



    private void getGloves() {

    }
    private void dontGetGloves() {

    }
    private void leaveTheSalad() {

    }







}
