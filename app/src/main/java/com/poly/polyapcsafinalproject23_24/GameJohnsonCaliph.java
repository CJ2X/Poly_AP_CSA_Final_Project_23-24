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

        tvTitle.setText("Sunday Chores");
        tvSubtitle.setText("Let do your do Chores");
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


        ivStory.setImageResource(R.drawable.im_johnsoncaliph_chore_day);
        tvStoryText.setText("It's chore day. Let's go on a chores sweep!");

        setAllBtnVisible();
        btn1.setText("Let's do your chores");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doYourChores();
            }
        });




    }
    private void doYourChores()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_do_chore);
        tvStoryText.setText("\nYou picked to do your chores and the first thing you do is clean your room \n1. Clean the bed\n2. Clean the desk \n3. Clean the living room ");

        setAllBtnVisible();
        btn1.setText("Clean the desk");
        btn2.setText("Go clean my room");
        btn3.setText("Go clean the living room ");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheDesk();
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
                cleanTheLivingRoom();
            }
        });

    }

    private void cleanTheBed()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_hurt);
        tvStoryText.setText("\nYou picked to clean the bed but you accidentally slipped and fell and broke your leg");

        defeat();
    }

    private void cleanTheDesk()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_desk);
        tvStoryText.setText("\nYou cleaned the desk then... \n1.Cook salad\n2. Cook turkey");


        setAllBtnVisible();
        btn1.setText("Cook salad");
        btn2.setText("Cook turkey");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookDinner();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheBed();
            }
        });


    }

    private void useYourHands()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_desk);
        tvStoryText.setText("You picked to use your hands to clean the desk");
        defeat();
    }
    private void GetGloves()
    {
        tvStoryText.setText("\nGreat job you picked the right choice");
    }

    private void nogloves()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_desk);
        tvStoryText.setText("\nDamm you picked not to use gloves");
        defeat();
    }
    // COOK DINNER
    private void cookDinner()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_making_salad);
        tvStoryText.setText("\nCooking dinner should be easy, So you will be making which salad");


        setAllBtnVisible();
        btn1.setText("Make a veggie salad");
        btn2.setText("Make a meat salad");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeVeggieSalad();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeMeatSalad();
            }
        });


    }

    private void makeVeggieSalad()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_veggie_salad);
        tvStoryText.setText("\nNice job you're making a veggie salad so you don't have to worry about getting sick off meat");
    }
    private void makeMeatSalad()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_meat_salad);
        tvStoryText.setText("\nYou picked to make a meat salad but you got sick off of it");


        setAllBtnVisible();
        btn1.setText("Leave the salad");
        btn2.setText("Clean the salad up");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leavetheSalad();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheSalad();
            }
        });


    }
    private void leavetheSalad()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_leftover_salad);
        tvStoryText.setText("\nYou picked to leave the salad now you are not to feeling too good now");
        defeat();
    }

    private void cleanTheSalad()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_cleaning_dish);
        tvStoryText.setText("\nYou picked to clean the salad up and you feel better now");
        defeat();
    }

    private void cookTurkey()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_cook_turkey);
        tvStoryText.setText("\nYou picked to cook turkey but your not to sure on how cook it right");


        setAllBtnVisible();
        btn1.setText("Cook it in the mircowave");
        btn2.setText("Cook it in the oven");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookInTheMicrowave();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookInTheOven();
            }
        });

    }

    private void cookInTheMicrowave()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_cook_turkey);
        tvStoryText.setText("\nYou picked to cook it in the microwave but it is still not cooked enough");
        defeat();
    }
    private void cookInTheOven()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_microwave);
        tvStoryText.setText("\nYou picked to cook it in the oven and it is cooked perfectly");


        setAllBtnVisible();
        btn1.setText("Season the turkey");
        btn2.setText("Don't season the turkey");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seasonTheTurkey();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dontSeasonTheTurkey();
            }
        });

    }

    private void seasonTheTurkey()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_seasoned_turkey);
        tvStoryText.setText("Its good to see that the turkey is cooked great could've been a bit better though");
        defeat();
    }
    private void dontSeasonTheTurkey()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_unseasoned_turkey);
        tvStoryText.setText("\nYou picked not to season the turkey and you are not feeling the best now");
        defeat();
    }
    //CLEAN THE LIVING ROOM
    private void cleanTheLivingRoom()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_livingroom);
        tvStoryText.setText("\nCleaning the living room is very important becuase it is one of the biggest rooms in the house");


        setAllBtnVisible();
        btn1.setText("Clean the couch");
        btn2.setText("Clean the TV");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheCouch();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheTV();
            }
        });

    }
    private void cleanTheCouch()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_couch );
        tvStoryText.setText("\nYou picked to clean the couch but you layed down and feel asleep");
        defeat();
    }

    private void cleanTheTV()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_tv);
        tvStoryText.setText("\nYou picked to clean the TV and it is clean now you are ready to clean out the drawers");


        setAllBtnVisible();
        btn1.setText("Clean the drawers fully");
        btn2.setText("Clean the drawers partially");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheDrawersFully();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheDrawersPartially();
            }
        });

    }

    private void cleanTheDrawersFully()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_drawer);
        tvStoryText.setText("\nYou picked to clean the drawers complety and now you are ready to clean the closet");
        btn1.setText("LET GOOO!!!");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheCloset();
            }
        });
    }


    private void cleanTheDrawersPartially()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_spider_bite);
        tvStoryText.setText("\nThis didn't work out for because there was a spider in drawer and it bit you");
        defeat();
    }

    private void cleanTheCloset()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_clean_closest);
        tvStoryText.setText("\nCleaning closet is going to be a big task to handle which would you like to start with first");
        tvStoryText.setText("1.Clean the clothes\n2.Clean the shoes");

        setAllBtnVisible();
        btn1.setText("Clean the clothes");
        btn2.setText("Clean the shoes");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheClothes();
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cleanTheShoes();
            }
        });

    }
    private void cleanTheClothes()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_clothes_clean);
        tvStoryText.setText("\nYou picked to clean the clothes but you missed a few pieces");
        defeat();
    }

    private void cleanTheShoes()
    {
        ivStory.setImageResource(R.drawable.im_johnsoncaliph_shoe);
        defeat();
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










}
