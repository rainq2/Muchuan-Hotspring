package com.example.hotspringtest;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class HomePageHoliday extends AppCompatActivity {
    private int sss = 100;
    private int b2haha = 12*sss;
    private int y2haha = 24*sss;
    private int r2haha = 30*sss;
    private int b3haha = 12*sss;
    private int y3haha = 48*sss;
    private int r3haha = 54*sss;
    private int time1 = 18*sss;
    private int time2 = 36*sss;
    public boolean peopleha3_1;
    public boolean peopleha3_2;
    public boolean peopleha3_3;
    public boolean peopleha3_4;
    public boolean peopleha3_5;

    public boolean peopleha3_7;
    public boolean peopleha3_8;
    public boolean peopleha3_9;
    public boolean peopleha3_10;
    public boolean peopleha3_11;
    public boolean peopleha3_12;
    public boolean peopleha3_13;
    public boolean peopleha3_14;
    public boolean peopleha3_15;
    public boolean peopleha3_16;
    public boolean peopleha3_17;
    public boolean peopleha3_18;
    public boolean peopleha3_19;
    public boolean peopleha3_20;
    public boolean peopleha3_21;
    public boolean peopleha3_22;
    public boolean peopleha3_23;
    public boolean peopleha3_24;
    public boolean peopleha3_25;
    //public boolean peopleha3_266;
    public boolean peopleha3_27KK;
    public boolean peopleha3_28KK;
    public boolean peopleha3_66;
    public boolean peopleha3_26KK;

    private SharedPreferences sharedPreferenceshaha1;
    private SharedPreferences.Editor editorhaha1;
    private static final String TIMER_STARTED_KEYhaha1 = "timer_startedhaha1";
    private static final String START_TIME_KEYhaha1 = "start_timehaha1";
    private static final String ELAPSED_TIME_KEYhaha1 = "elapsed_timehaha1";

    private SharedPreferences sharedPreferenceshaha2;
    private SharedPreferences.Editor editorhaha2haha;
    private static final String TIMER_STARTED_KEy2haha = "timer_startedhaha2";
    private static final String START_TIME_KEy2haha = "start_timehaha2";
    private static final String ELAPSED_TIME_KEy2haha = "elapsed_timehaha2";

    private SharedPreferences sharedPreferenceshaha3;
    private SharedPreferences.Editor editorhaha3haha;
    private static final String TIMER_STARTED_KEy3haha = "timer_startedhaha3";
    private static final String START_TIME_KEy3haha = "start_timehaha3";
    private static final String ELAPSED_TIME_KEy3haha = "elapsed_timehaha3";

    private SharedPreferences sharedPreferenceshaha4;
    private SharedPreferences.Editor editorhaha4;
    private static final String TIMER_STARTED_KEYhaha4 = "timer_startedhaha4";
    private static final String START_TIME_KEYhaha4 = "start_timehaha4";
    private static final String ELAPSED_TIME_KEYhaha4 = "elapsed_timehaha4";
    private SharedPreferences sharedPreferenceshaha5;
    private SharedPreferences.Editor editorhaha5;
    private static final String TIMER_STARTED_KEYhaha5 = "timer_startedhaha5";
    private static final String START_TIME_KEYhaha5 = "start_timehaha5";
    private static final String ELAPSED_TIME_KEYhaha5 = "elapsed_timehaha5";



    private SharedPreferences sharedPreferenceshaha7;
    private SharedPreferences.Editor editorhaha7;
    private static final String TIMER_STARTED_KEYhaha7 = "timer_startedhaha7";
    private static final String START_TIME_KEYhaha7 = "start_timehaha7";
    private static final String ELAPSED_TIME_KEYhaha7 = "elapsed_timehaha7";

    private SharedPreferences sharedPreferenceshaha8;
    private SharedPreferences.Editor editorhaha8;
    private static final String TIMER_STARTED_KEYhaha8 = "timer_startedhaha8";
    private static final String START_TIME_KEYhaha8 = "start_timehaha8";
    private static final String ELAPSED_TIME_KEYhaha8 = "elapsed_timehaha8";

    private SharedPreferences sharedPreferenceshaha9;
    private SharedPreferences.Editor editorhaha9;
    private static final String TIMER_STARTED_KEYhaha9 = "timer_startedhaha9";
    private static final String START_TIME_KEYhaha9 = "start_timehaha9";
    private static final String ELAPSED_TIME_KEYhaha9 = "elapsed_timehaha9";

    private SharedPreferences sharedPreferenceshaha10;
    private SharedPreferences.Editor editorhaha10;
    private static final String TIMER_STARTED_KEYhaha10 = "timer_startedhaha10";
    private static final String START_TIME_KEYhaha10 = "start_timehaha1haha0";
    private static final String ELAPSED_TIME_KEYhaha10 = "elapsed_timehaha1haha0";

    private SharedPreferences sharedPreferenceshaha11;
    private SharedPreferences.Editor editorhaha11;
    private static final String TIMER_STARTED_KEYhaha11 = "timer_startedhaha11";
    private static final String START_TIME_KEYhaha11 = "start_timehaha1haha1";
    private static final String ELAPSED_TIME_KEYhaha11 = "elapsed_timehaha1haha1";

    private SharedPreferences sharedPreferenceshaha12;
    private SharedPreferences.Editor editorhaha12;
    private static final String TIMER_STARTED_KEYhaha12 = "timer_startedhaha12";
    private static final String START_TIME_KEYhaha12 = "start_timehaha1haha2";
    private static final String ELAPSED_TIME_KEYhaha12 = "elapsed_timehaha1haha2";
    private SharedPreferences sharedPreferenceshaha13;
    private SharedPreferences.Editor editorhaha13;
    private static final String TIMER_STARTED_KEYhaha13 = "timer_startedhaha13";
    private static final String START_TIME_KEYhaha13 = "start_timehaha1haha3";
    private static final String ELAPSED_TIME_KEYhaha13 = "elapsed_timehaha1haha3";

    private SharedPreferences sharedPreferenceshaha14;
    private SharedPreferences.Editor editorhaha14;
    private static final String TIMER_STARTED_KEYhaha14 = "timer_startedhaha14";
    private static final String START_TIME_KEYhaha14 = "start_timehaha1haha4";
    private static final String ELAPSED_TIME_KEYhaha14 = "elapsed_timehaha1haha4";

    private SharedPreferences sharedPreferenceshaha15;
    private SharedPreferences.Editor editorhaha15;
    private static final String TIMER_STARTED_KEYhaha15 = "timer_startedhaha15";
    private static final String START_TIME_KEYhaha15 = "start_timehaha1haha5";
    private static final String ELAPSED_TIME_KEYhaha15 = "elapsed_timehaha1haha5";

    private SharedPreferences sharedPreferenceshaha16;
    private SharedPreferences.Editor editorhaha16;
    private static final String TIMER_STARTED_KEYhaha16 = "timer_startedhaha16";
    private static final String START_TIME_KEYhaha16 = "start_timehaha1haha6";
    private static final String ELAPSED_TIME_KEYhaha16 = "elapsed_timehaha1haha6";

    private SharedPreferences sharedPreferenceshaha17;
    private SharedPreferences.Editor editorhaha17;
    private static final String TIMER_STARTED_KEYhaha17 = "timer_startedhaha17";
    private static final String START_TIME_KEYhaha17 = "start_timehaha1haha7";
    private static final String ELAPSED_TIME_KEYhaha17 = "elapsed_timehaha1haha7";

    private SharedPreferences sharedPreferenceshaha18;
    private SharedPreferences.Editor editorhaha18;
    private static final String TIMER_STARTED_KEYhaha18 = "timer_startedhaha18";
    private static final String START_TIME_KEYhaha18 = "start_timehaha1haha8";
    private static final String ELAPSED_TIME_KEYhaha18 = "elapsed_timehaha1haha8";

    private SharedPreferences sharedPreferenceshaha19;
    private SharedPreferences.Editor editorhaha19;
    private static final String TIMER_STARTED_KEYhaha19 = "timer_startedhaha19";
    private static final String START_TIME_KEYhaha19 = "start_timehaha1haha9";
    private static final String ELAPSED_TIME_KEYhaha19 = "elapsed_timehaha1haha9";

    private SharedPreferences sharedPreferenceshaha20;
    private SharedPreferences.Editor editorhaha2haha0;
    private static final String TIMER_STARTED_KEy2haha0 = "timer_startedhaha20";
    private static final String START_TIME_KEy2haha0 = "start_timehaha2haha0";
    private static final String ELAPSED_TIME_KEy2haha0 = "elapsed_timehaha2haha0";

    private SharedPreferences sharedPreferenceshaha21;
    private SharedPreferences.Editor editorhaha2haha1;
    private static final String TIMER_STARTED_KEy2haha1 = "timer_startedhaha21";
    private static final String START_TIME_KEy2haha1 = "start_timehaha2haha1";
    private static final String ELAPSED_TIME_KEy2haha1 = "elapsed_timehaha2haha1";

    private SharedPreferences sharedPreferenceshaha22;
    private SharedPreferences.Editor editorhaha2haha2;
    private static final String TIMER_STARTED_KEy2haha2 = "timer_startedhaha22";
    private static final String START_TIME_KEy2haha2 = "start_timehaha2haha2";
    private static final String ELAPSED_TIME_KEy2haha2 = "elapsed_timehaha2haha2";

    private SharedPreferences sharedPreferenceshaha23;
    private SharedPreferences.Editor editorhaha2haha3;
    private static final String TIMER_STARTED_KEy2haha3 = "timer_startedhaha23";
    private static final String START_TIME_KEy2haha3 = "start_timehaha2haha3";
    private static final String ELAPSED_TIME_KEy2haha3 = "elapsed_timehaha2haha3";

    private SharedPreferences sharedPreferenceshaha24;
    private SharedPreferences.Editor editorhaha2haha4;
    private static final String TIMER_STARTED_KEy2haha4 = "timer_startedhaha24";
    private static final String START_TIME_KEy2haha4 = "start_timehaha2haha4";
    private static final String ELAPSED_TIME_KEy2haha4 = "elapsed_timehaha2haha4";

    private SharedPreferences sharedPreferenceshaha25;
    private SharedPreferences.Editor editorhaha2haha5;
    private static final String TIMER_STARTED_KEy2haha5 = "timer_startedhaha25";
    private static final String START_TIME_KEy2haha5 = "start_timehaha2haha5";
    private static final String ELAPSED_TIME_KEy2haha5 = "elapsed_timehaha2haha5";

    private SharedPreferences sharedPreferenceshaha27KK;
    private SharedPreferences.Editor editorhaha2haha7KK;
    private static final String TIMER_STARTED_KEy2haha7KK = "timer_startedhaha27KK";
    private static final String START_TIME_KEy2haha7KK = "start_timehaha2haha7KK";
    private static final String ELAPSED_TIME_KEy2haha7KK = "elapsed_timehaha2haha7KK";

    private SharedPreferences sharedPreferenceshaha28KK;
    private SharedPreferences.Editor editorhaha2haha8KK;
    private static final String TIMER_STARTED_KEy2haha8KK = "timer_startedhaha28KK";
    private static final String START_TIME_KEy2haha8KK = "start_timehaha2haha8KK";
    private static final String ELAPSED_TIME_KEy2haha8KK = "elapsed_timehaha2haha8KK";

    private SharedPreferences sharedPreferenceshaha66;
    private SharedPreferences.Editor editorhaha66;
    private static final String TIMER_STARTED_KEYhaha66 = "timer_startedhaha66";
    private static final String START_TIME_KEYhaha66 = "start_timehaha66";
    private static final String ELAPSED_TIME_KEYhaha66 = "elapsed_timehaha66";

    private SharedPreferences sharedPreferenceshaha26KK;
    private SharedPreferences.Editor editorhaha2haha6KK;
    private static final String TIMER_STARTED_KEy2haha6KK = "timer_startedhaha26KK";
    private static final String START_TIME_KEy2haha6KK = "start_timehaha2haha6KK";
    private static final String ELAPSED_TIME_KEy2haha6KK = "elapsed_timehaha2haha6KK";


    private Handler handlerhaha1 = new Handler();
    private int originalblueThresholdhaha2 = b2haha;
    private int originalyellowThresholdhaha2 = y2haha;
    private int originalredThresholdhaha2 = r2haha;
    private int originalblueThresholdhaha3 = b3haha;
    private int originalyellowThresholdhaha3 = y3haha;
    private int originalredThresholdhaha3 = r3haha;


    private long starttimeha1 = 0L;
    private long timeInMillisechaondshaha1 = 0L;
    private long updatedtimeha1 = 0L;
    private int sechaondsha1 = 0;
    private int secha1 = 0;
    private int minutesha1 = 0;
    private int hoursha1 = 0;
    private Button btnTimerha1;
    //此為測試用 正式版應改為正確時間
    private int blueThresholdha1 = b2haha;   //b2haha
    private int yellowThresholdha1 = y2haha; //y2haha
    private int redThresholdha1 = r2haha;    //r2haha
    //此為測試用 正式版應改為正確時間
    public int peopleha1;
    private boolean isTimerRunningha1 = false;



    private long starttimeha2 = 0L;
    private long timeInMillisechaondshaha2 = 0L;
    private long updatedtimeha2 = 0L;
    private int sechaondsha2 = 0;
    private int secha2 = 0;
    private int minutesha2 = 0;
    private int hoursha2 = 0;
    private Button btnTimerha2haha;
    private int blueThresholdha2 = b2haha;
    private int yellowThresholdha2 = y2haha;
    private int redThresholdha2 = r2haha;
    public int peopleha2;
    private boolean isTimerRunningha2 = false;


    private long startTimeha3 = 0L;
    private long timeInMillisechaondshaha3 = 0L;
    private long updatedTime3 = 0L;
    private int sechaondsha3 = 0;
    private int secha3 = 0;
    private int minutesha3 = 0;
    private int hoursha3 = 0;
    private Button btnTimerha3haha;
    private int blueThresholdha3 = b2haha;
    private int yellowThresholdha3 = y2haha;
    private int redThresholdha3 = r2haha;
    public int peopleha3;
    private boolean isTimerRunningha3 = false;


    private long startTimeha4 = 0L;
    private long timeInMillisechaondshaha4 = 0L;
    private long updatedTime4 = 0L;
    private int sechaondsha4 = 0;
    private int secha4 = 0;
    private int minutesha4 = 0;
    private int hoursha4 = 0;
    private Button btnTimerha4;
    private int blueThresholdha4 = b2haha;
    private int yellowThresholdha4 = y2haha;
    private int redThresholdha4 = r2haha;
    public int peopleha4;
    private boolean isTimerRunningha4 = false;

    private long startTimeha5 = 0L;
    private long timeInMillisechaondshaha5 = 0L;
    private long updatedTime5 = 0L;
    private int sechaondsha5 = 0;
    private int secha5 = 0;
    private int minutesha5 = 0;
    private int hoursha5 = 0;
    private Button btnTimerha5;
    private int blueThresholdha5 = b2haha;
    private int yellowThresholdha5 = y2haha;
    private int redThresholdha5 = r2haha;
    public int peopleha5;
    private boolean isTimerRunningha5 = false;

    private long startTimeha6 = 0L;
    private long timeInMillisechaondshaha6 = 0L;
    private long updatedTime6 = 0L;
    private int sechaondsha6 = 0;
    private int secha6 = 0;
    private int minutesha6 = 0;
    private int hoursha6 = 0;
    private Button btnTimerha6;
    private int blueThresholdha6 = b2haha;
    private int yellowThresholdha6 = y2haha;
    private int redThresholdha6 = r2haha;
    public int peopleha6;
    private boolean isTimerRunningha6 = false;

    private long startTimeha7 = 0L;
    private long timeInMillisechaondshaha7 = 0L;
    private long updatedTime7 = 0L;
    private int sechaondsha7 = 0;
    private int secha7 = 0;
    private int minutesha7 = 0;
    private int hoursha7 = 0;
    private Button btnTimerha7;
    private int blueThresholdha7 = b2haha;
    private int yellowThresholdha7 = y2haha;
    private int redThresholdha7 = r2haha;
    public int peopleha7;
    private boolean isTimerRunningha7 = false;

    private long startTimeha8 = 0L;
    private long timeInMillisechaondshaha8 = 0L;
    private long updatedTime8 = 0L;
    private int sechaondsha8 = 0;
    private int secha8 = 0;
    private int minutesha8 = 0;
    private int hoursha8 = 0;
    private Button btnTimerha8;
    private int blueThresholdha8 = b2haha;
    private int yellowThresholdha8 = y2haha;
    private int redThresholdha8 = r2haha;
    public int peopleha8;
    private boolean isTimerRunningha8 = false;

    private long startTimeha9 = 0L;
    private long timeInMillisechaondshaha9 = 0L;
    private long updatedTime9 = 0L;
    private int sechaondsha9 = 0;
    private int secha9 = 0;
    private int minutesha9 = 0;
    private int hoursha9 = 0;
    private Button btnTimerha9;
    private int blueThresholdha9 = b2haha;
    private int yellowThresholdha9 = y2haha;
    private int redThresholdha9 = r2haha;
    public int peopleha9;
    private boolean isTimerRunningha9 = false;

    private long starttimeha10 = 0L;
    private long timeInMillisechaondshaha10 = 0L;
    private long updatedtimeha10 = 0L;
    private int sechaondsha10 = 0;
    private int secha10 = 0;
    private int minutesha10 = 0;
    private int hoursha10 = 0;
    private Button btnTimerha10;
    private int blueThresholdha10 = b2haha;
    private int yellowThresholdha10 = y2haha;
    private int redThresholdha10 = r2haha;
    public int peopleha10;
    private boolean isTimerRunningha10 = false;

    private long starttimeha11 = 0L;
    private long timeInMillisechaondshaha11 = 0L;
    private long updatedtimeha11 = 0L;
    private int sechaondsha11 = 0;
    private int secha11 = 0;
    private int minutesha11 = 0;
    private int hoursha11 = 0;
    private Button btnTimerha11;
    private int blueThresholdha11 = b2haha;
    private int yellowThresholdha11 = y2haha;
    private int redThresholdha11 = r2haha;
    public int peopleha11;
    private boolean isTimerRunningha11 = false;

    private long starttimeha16 = 0L;
    private long timeInMillisechaondshaha16 = 0L;
    private long updatedtimeha16 = 0L;
    private int sechaondsha16 = 0;
    private int secha16 = 0;
    private int minutesha16 = 0;
    private int hoursha16 = 0;
    private Button btnTimerha16;
    private int blueThresholdha16 = b2haha;
    private int yellowThresholdha16 = y2haha;
    private int redThresholdha16 = r2haha;
    public int peopleha16;
    private boolean isTimerRunningha16 = false;

    private long starttimeha17 = 0L;
    private long timeInMillisechaondshaha17 = 0L;
    private long updatedtimeha17 = 0L;
    private int sechaondsha17 = 0;
    private int secha17 = 0;
    private int minutesha17 = 0;
    private int hoursha17 = 0;
    private Button btnTimerha17;
    private int blueThresholdha17 = b2haha;
    private int yellowThresholdha17 = y2haha;
    private int redThresholdha17 = r2haha;
    public int peopleha17;
    private boolean isTimerRunningha17 = false;


    private long starttimeha18 = 0L;
    private long timeInMillisechaondshaha18 = 0L;
    private long updatedtimeha18 = 0L;
    private int sechaondsha18 = 0;
    private int secha18 = 0;
    private int minutesha18 = 0;
    private int hoursha18 = 0;
    private Button btnTimerha18;
    private int blueThresholdha18 = b2haha;
    private int yellowThresholdha18 = y2haha;
    private int redThresholdha18 = r2haha;
    public int peopleha18;
    private boolean isTimerRunningha18 = false;

    private long starttimeha19 = 0L;
    private long timeInMillisechaondshaha19 = 0L;
    private long updatedtimeha19 = 0L;
    private int sechaondsha19 = 0;
    private int secha19 = 0;
    private int minutesha19 = 0;
    private int hoursha19 = 0;
    private Button btnTimerha19;
    private int blueThresholdha19 = b2haha;
    private int yellowThresholdha19 = y2haha;
    private int redThresholdha19 = r2haha;
    public int peopleha19;
    private boolean isTimerRunningha19 = false;

    private long starttimeha20 = 0L;
    private long timeInMillisechaondshaha20 = 0L;
    private long updatedtimeha20 = 0L;
    private int sechaondsha20 = 0;
    private int secha20 = 0;
    private int minutesha20 = 0;
    private int hoursha20 = 0;
    private Button btnTimerha2haha0;
    private int blueThresholdha20 = b2haha;
    private int yellowThresholdha20 = y2haha;
    private int redThresholdha20 = r2haha;
    public int peopleha20;
    private boolean isTimerRunningha20 = false;


    private long starttimeha21 = 0L;
    private long timeInMillisechaondshaha21 = 0L;
    private long updatedtimeha21 = 0L;
    private int sechaondsha21 = 0;
    private int secha21 = 0;
    private int minutesha21 = 0;
    private int hoursha21 = 0;
    private Button btnTimerha2haha1;
    private int blueThresholdha21 = b2haha;
    private int yellowThresholdha21 = y2haha;
    private int redThresholdha21 = r2haha;
    public int peopleha21;
    private boolean isTimerRunningha21 = false;

    private long starttimeha22 = 0L;
    private long timeInMillisechaondshaha22 = 0L;
    private long updatedtimeha22 = 0L;
    private int sechaondsha22 = 0;
    private int secha22 = 0;
    private int minutesha22 = 0;
    private int hoursha22 = 0;
    private Button btnTimerha2haha2;
    private int blueThresholdha22 = b2haha;
    private int yellowThresholdha22 = y2haha;
    private int redThresholdha22 = r2haha;
    public int peopleha22;
    private boolean isTimerRunningha22 = false;

    private long starttimeha23 = 0L;
    private long timeInMillisechaondshaha23 = 0L;
    private long updatedtimeha23 = 0L;
    private int sechaondsha23 = 0;
    private int secha23 = 0;
    private int minutesha23 = 0;
    private int hoursha23 = 0;
    private Button btnTimerha2haha3;
    private int blueThresholdha23 = b2haha;
    private int yellowThresholdha23 = y2haha;
    private int redThresholdha23 = r2haha;
    public int peopleha23;
    private boolean isTimerRunningha23 = false;

    private long starttimeha24 = 0L;
    private long timeInMillisechaondshaha24 = 0L;
    private long updatedtimeha24 = 0L;
    private int sechaondsha24 = 0;
    private int secha24 = 0;
    private int minutesha24 = 0;
    private int hoursha24 = 0;
    private Button btnTimerha2haha4;
    private int blueThresholdha24 = b2haha;
    private int yellowThresholdha24 = y2haha;
    private int redThresholdha24 = r2haha;
    public int peopleha24;
    private boolean isTimerRunningha24 = false;


    private long starttimeha25 = 0L;
    private long timeInMillisechaondshaha25 = 0L;
    private long updatedtimeha25 = 0L;
    private int sechaondsha25 = 0;
    private int secha25 = 0;
    private int minutesha25 = 0;
    private int hoursha25 = 0;
    private Button btnTimerha2haha5;
    private int blueThresholdha25 = b2haha;
    private int yellowThresholdha25 = y2haha;
    private int redThresholdha25 = r2haha;
    public int peopleha25;
    private boolean isTimerRunningha25 = false;
/*
    private long starttimeha266 = 0L;
    private long timeInMillisechaondshaha266 = 0L;
    private long updatedtimeha266 = 0L;
    private int sechaondsha266 = 0;
    private int secha266 = 0;
    private int minutesha266 = 0;
    private int hoursha266 = 0;
    private Button btnTimerha2haha6;
    private int blueThresholdha266 = b2haha;
    private int yellowThresholdha266 = y2haha;
    private int redThresholdha266 = r2haha;
    public int peopleha266;
    private boolean isTimerRunningha266 = false;
*/
    private long starttimeha27KK = 0L;
    private long timeInMillisechaondshaha27KK = 0L;
    private long updatedtimeha27KK = 0L;
    private int sechaondsha27KK = 0;
    private int secha27KK = 0;
    private int minutesha27KK = 0;
    private int hoursha27KK = 0;
    private Button btnTimerha2haha7KK;
    private int blueThresholdha27KK = b2haha;
    private int yellowThresholdha27KK = y2haha;
    private int redThresholdha27KK = r2haha;
    public int peopleha27KK;
    private boolean isTimerRunningha27KK = false;

    private long starttimeha28KK = 0L;
    private long timeInMillisechaondshaha28KK = 0L;
    private long updatedtimeha28KK = 0L;
    private int sechaondsha28KK = 0;
    private int secha28KK = 0;
    private int minutesha28KK = 0;
    private int hoursha28KK = 0;
    private Button btnTimerha2haha8KK;
    private int blueThresholdha28KK = b2haha;
    private int yellowThresholdha28KK = y2haha;
    private int redThresholdha28KK = r2haha;
    public int peopleha28KK;
    private boolean isTimerRunningha28KK = false;

    private long startTimeha66 = 0L;
    private long timeInMillisechaondshaha66 = 0L;
    private long updatedTime66 = 0L;
    private int sechaondsha66 = 0;
    private int secha66 = 0;
    private int minutesha66 = 0;
    private int hoursha66 = 0;
    private Button btnTimerha66;
    private int blueThresholdha66 = b2haha;
    private int yellowThresholdha66 = y2haha;
    private int redThresholdha66 = r2haha;
    public int peopleha66;
    private boolean isTimerRunningha66 = false;

    private long starttimeha201 = 0L;
    private long timeInMillisechaondshaha201 = 0L;
    private long updatedtimeha201 = 0L;
    private int sechaondsha201 = 0;
    private int secha201 = 0;
    private int minutesha201 = 0;
    private int hoursha201 = 0;
    private Button btnTimerha2haha01;
    private int blueThresholdha201 = b3haha;
    private int yellowThresholdha201 = y3haha;
    private int redThresholdha201 = r3haha;
    public int peopleha201;
    private boolean isTimerRunningha201 = false;

    private long starttimeha202 = 0L;
    private long timeInMillisechaondshaha202 = 0L;
    private long updatedtimeha202 = 0L;
    private int sechaondsha202 = 0;
    private int secha202 = 0;
    private int hoursha202 = 0;
    private int minutesha202 = 0;
    private Button btnTimerha2haha02;
    private int blueThresholdha202 = b3haha;
    private int yellowThresholdha202 = y3haha;
    private int redThresholdha202 = r3haha;
    public int peopleha202;
    private boolean isTimerRunningha202 = false;

    private long starttimeha203 = 0L;
    private long timeInMillisechaondshaha203 = 0L;
    private long updatedtimeha203 = 0L;
    private int sechaondsha203 = 0;
    private int secha203 = 0;
    private int minutesha203 = 0;
    private int hoursha203 = 0;
    private Button btnTimerha2haha03;
    private int blueThresholdha203 = b3haha;
    private int yellowThresholdha203 = y3haha;
    private int redThresholdha203 = r3haha;
    public int peopleha203;
    private boolean isTimerRunningha203 = false;

    private long starttimeha204 = 0L;
    private long timeInMillisechaondshaha204 = 0L;
    private long updatedtimeha204 = 0L;
    private int sechaondsha204 = 0;
    private int secha204 = 0;
    private int minutesha204 = 0;
    private int hoursha204 = 0;
    private Button btnTimerha2haha04;
    private int blueThresholdha204 = b3haha;
    private int yellowThresholdha204 = y3haha;
    private int redThresholdha204 = r3haha;
    public int peopleha204;
    private boolean isTimerRunningha204 = false;

    private long starttimeha26KK = 0L;
    private long timeInMillisechaondshaha26KK = 0L;
    private long updatedtimeha26KK = 0L;
    private int sechaondsha26KK = 0;
    private int secha26KK = 0;
    private int minutesha26KK = 0;
    private int hoursha26KK = 0;
    private Button btnTimerha2haha6KK;
    private int blueThresholdha26KK = b2haha;
    private int yellowThresholdha26KK = y2haha;
    private int redThresholdha26KK = r2haha;
    public int peopleha26KK;
    private boolean isTimerRunningha26KK = false;

    private boolean flashingha1;
    private boolean flashingha2;
    private boolean flashingha3;
    private boolean flashingha4;
    private boolean flashingha5;
    private boolean flashingha6;
    private boolean flashingha7;
    private boolean flashingha8 ;
    private boolean flashingha9 ;
    private boolean flashingha10 ;
    private boolean flashingha11 ;
    private boolean flashingha201 ;
    private boolean flashingha202 ;
    private boolean flashingha203 ;
    private boolean flashingha204 ;
    private boolean flashingha16 ;
    private boolean flashingha17 ;
    private boolean flashingha18 ;
    private boolean flashingha19 ;
    private boolean flashingha20 ;
    private boolean flashingha21 ;
    private boolean flashingha22 ;
    private boolean flashingha23 ;
    private boolean flashingha24 ;
    private boolean flashingha25 ;
    //private boolean flashingha266 ;
    private boolean flashingha27KK ;
    private boolean flashingha28KK ;

    private boolean flashingha66 ;
    private boolean flashingha26KK ;

    private boolean flashinghag1;
    private boolean flashinghag2 ;
    private boolean flashinghag3 ;
    private boolean flashinghag4 ;
    private boolean flashinghag5 ;
    private boolean flashinghag6 ;
    private boolean flashinghag7 ;
    private boolean flashinghag8 ;
    private boolean flashinghag9 ;
    private boolean flashinghag10 ;
    private boolean flashinghag11 ;
    private boolean flashinghag201 ;
    private boolean flashinghag202 ;
    private boolean flashinghag203 ;
    private boolean flashinghag204 ;
    private boolean flashinghag16 ;
    private boolean flashinghag17 ;
    private boolean flashinghag18 ;
    private boolean flashinghag19 ;
    private boolean flashinghag20 ;
    private boolean flashinghag21 ;
    private boolean flashinghag22 ;
    private boolean flashinghag23 ;
    private boolean flashinghag24 ;
    private boolean flashinghag25 ;
    //private boolean flashinghag266 ;
    private boolean flashinghag27KK ;
    private boolean flashinghag28KK ;
    private boolean flashinghag66 ;
    private boolean flashinghag26KK ;

    // 獲得現在的時間

    int currentHourha1;
    int currentMinuteha1;

    int currentHourha2haha;
    int currentMinuteha2;

    int currentHourha3haha;
    int currentMinuteha3;

    int currentHourha4;
    int currentMinuteha4;

    int currentHourha5;
    int currentMinuteha5;

    int currentHourha6;
    int currentMinuteha6;

    int currentHourha7;
    int currentMinuteha7;

    int currentHourha8;
    int currentMinuteha8;

    int currentHourha9;
    int currentMinuteha9;

    int currentHourha10;
    int currentMinuteha10;

    int currentHourha11;
    int currentMinuteha11;

    int currentHourha12;
    int currentMinuteha12;

    int currentHourha13;
    int currentMinuteha13;

    int currentHourha14;
    int currentMinuteha14;

    int currentHourha15;
    int currentMinuteha15;

    int currentHourha16;
    int currentMinuteha16;

    int currentHourha17;
    int currentMinuteha17;

    int currentHourha18;
    int currentMinuteha18;

    int currentHourha19;
    int currentMinuteha19;

    int currentHourha2haha0;
    int currentMinuteha20;

    int currentHourha2haha1;
    int currentMinuteha21;

    int currentHourha2haha2;
    int currentMinuteha22;

    int currentHourha2haha3;
    int currentMinuteha23;

    int currentHourha2haha4;
    int currentMinuteha24;

    int currentHourha2haha5;
    int currentMinuteha25;

    //int currentHourha2haha6;
    //int currentMinuteha266;

    int currentHourha2haha7KK;
    int currentMinuteha27KK;

    int currentHourha2haha8KK;
    int currentMinuteha28KK;

    int currentHourha66;
    int currentMinuteha66;
    int currentHourha2haha6KK;
    int currentMinuteha26KK;

    int futureHourha1;
    int futureMinuteha1;
    int futureHourha2haha;
    int futureMinuteha2;

    int futureHourha3haha;
    int futureMinuteha3;

    int futureHourha4;
    int futureMinuteha4;

    int futureHourha5;
    int futureMinuteha5;

    int futureHourha6;
    int futureMinuteha6;

    int futureHourha7;
    int futureMinuteha7;

    int futureHourha8;
    int futureMinuteha8;

    int futureHourha9;
    int futureMinuteha9;

    int futureHourha10;
    int futureMinuteha10;

    int futureHourha11;
    int futureMinuteha11;

    int futureHourha12;
    int futureMinuteha12;

    int futureHourha13;
    int futureMinuteha13;

    int futureHourha14;
    int futureMinuteha14;

    int futureHourha15;
    int futureMinuteha15;

    int futureHourha16;
    int futureMinuteha16;

    int futureHourha17;
    int futureMinuteha17;

    int futureHourha18;
    int futureMinuteha18;

    int futureHourha19;
    int futureMinuteha19;

    int futureHourha2haha0;
    int futureMinuteha20;

    int futureHourha2haha1;
    int futureMinuteha21;

    int futureHourha2haha2;
    int futureMinuteha22;

    int futureHourha2haha3;
    int futureMinuteha23;

    int futureHourha2haha4;
    int futureMinuteha24;

    int futureHourha2haha5;
    int futureMinuteha25;

    //int futureHourha2haha6;
    //int futureMinuteha266;

    int futureHourha2haha7KK;
    int futureMinuteha27KK;

    int futureHourha2haha8KK;
    int futureMinuteha28KK;
    int futureHourha66;
    int futureMinuteha66;
    int futureHourha2haha6KK;
    int futureMinuteha26KK;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_holiday);



        // 啟動計時器服務
        Intent timerServiceIntenthaha = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntenthaha);
        } else {
            startService(timerServiceIntenthaha);
        }
        // 初始化 SharedPreferences 和 editorhaha1
        sharedPreferenceshaha1 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha1 = sharedPreferenceshaha1.edit();

        // 初始化 SharedPreferences 和 editorhaha2haha
        sharedPreferenceshaha2 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha = sharedPreferenceshaha2.edit();
// 初始化 SharedPreferences 和 editorhaha3haha
        sharedPreferenceshaha3 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha3haha = sharedPreferenceshaha3.edit();

// 初始化 SharedPreferences 和 editorhaha4
        sharedPreferenceshaha4 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha4 = sharedPreferenceshaha4.edit();
        sharedPreferenceshaha5 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha5 = sharedPreferenceshaha5.edit();



        sharedPreferenceshaha7 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha7 = sharedPreferenceshaha7.edit();

        sharedPreferenceshaha8 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha8 = sharedPreferenceshaha8.edit();

        sharedPreferenceshaha9 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha9 = sharedPreferenceshaha9.edit();

        sharedPreferenceshaha10 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha10 = sharedPreferenceshaha10.edit();

        sharedPreferenceshaha11 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha11 = sharedPreferenceshaha11.edit();

        sharedPreferenceshaha12 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha12 = sharedPreferenceshaha12.edit();

        sharedPreferenceshaha13 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha13 = sharedPreferenceshaha13.edit();

        sharedPreferenceshaha14 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha14 = sharedPreferenceshaha14.edit();

        sharedPreferenceshaha15 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha15 = sharedPreferenceshaha15.edit();

        sharedPreferenceshaha16 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha16 = sharedPreferenceshaha16.edit();

        sharedPreferenceshaha17 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha17 = sharedPreferenceshaha17.edit();

        sharedPreferenceshaha18 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha18 = sharedPreferenceshaha18.edit();

        sharedPreferenceshaha19 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha19 = sharedPreferenceshaha19.edit();

        sharedPreferenceshaha20 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha0 = sharedPreferenceshaha20.edit();

        sharedPreferenceshaha21 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha1 = sharedPreferenceshaha21.edit();

        sharedPreferenceshaha22 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha2 = sharedPreferenceshaha22.edit();

        sharedPreferenceshaha23 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha3 = sharedPreferenceshaha23.edit();

        sharedPreferenceshaha24 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha4 = sharedPreferenceshaha24.edit();

        sharedPreferenceshaha25 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha5 = sharedPreferenceshaha25.edit();

        //sharedPreferenceshaha266 = PreferenceManager.getDefaultSharedPreferences(this);
        //editorhaha2haha6 = sharedPreferenceshaha266.edit();

        sharedPreferenceshaha27KK = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha7KK = sharedPreferenceshaha27KK.edit();

        sharedPreferenceshaha28KK = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha8KK = sharedPreferenceshaha28KK.edit();

        sharedPreferenceshaha66 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha66 = sharedPreferenceshaha66.edit();

        sharedPreferenceshaha26KK = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha6KK = sharedPreferenceshaha26KK.edit();



        btnTimerha1 = findViewById(R.id.b1);
        btnTimerha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha1){
                    showConfirmationDialogForButton1();
                    //isTimerRunningha1 = true;
                    updateButtonColorha1(); // 更新颜色
                } else if (isTimerRunningha1) {
                    if (secha1 < blueThresholdha1) {
                        updateButtonColorha1();
                        showConfirmationDialogYNForButton1();
                    } else if (blueThresholdha1 <= secha1  && secha1 < yellowThresholdha1  ) {
                        if(!flashingha1){
                            flashingha1 = true; // 停止蓝色闪烁
                            updateButtonColorha1();
                        } else if (flashingha1) {
                            updateButtonColorha1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (yellowThresholdha1 <= secha1  && secha1 < redThresholdha1) {
                        if(!flashinghag1){
                            flashinghag1 = true; // 停止黄色闪烁
                            updateButtonColorha1();
                        } else if (flashinghag1) {
                            updateButtonColorha1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (secha1 >= redThresholdha1) {
                        updateButtonColorha1();
                        showConfirmationDialogYNForButton1();
                    }
                }
            }
        });

        btnTimerha1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton1();
                return true;
            }
        });

        btnTimerha2haha = findViewById(R.id.b2);
        btnTimerha2haha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha2){
                    showConfirmationDialogForButton2();
                    //isTimerRunningha2 = true;
                    updateButtonColorha2haha(); // 更新颜色
                } else if (isTimerRunningha2) {
                    if (secha2 < blueThresholdha2) {
                        updateButtonColorha2haha();
                        showConfirmationDialogYNForButton2();
                    } else if (blueThresholdha2 <= secha2  && secha2 < yellowThresholdha2  ) {
                        if(!flashingha2){
                            flashingha2 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha();
                        } else if (flashingha2) {
                            updateButtonColorha2haha();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (yellowThresholdha2 <= secha2  && secha2 < redThresholdha2) {
                        if(!flashinghag2){
                            flashinghag2 = true; // 停止黄色闪烁
                            updateButtonColorha2haha();
                        } else if (flashinghag2) {
                            updateButtonColorha2haha();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (secha2 >= redThresholdha2) {
                        updateButtonColorha2haha();
                        showConfirmationDialogYNForButton2();
                    }
                }
            }
        });

        btnTimerha2haha.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton2();
                return true;
            }
        });


        btnTimerha3haha = findViewById(R.id.b3);
        btnTimerha3haha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha3){
                    showConfirmationDialogForButton3();
                    //isTimerRunningha3 = true;
                    updateButtonColorha3haha(); // 更新颜色
                } else if (isTimerRunningha3) {
                    if (secha3 < blueThresholdha3) {
                        updateButtonColorha3haha();
                        showConfirmationDialogYNForButton3();
                    } else if (blueThresholdha3 <= secha3  && secha3 < yellowThresholdha3  ) {
                        if(!flashingha3){
                            flashingha3 = true; // 停止蓝色闪烁
                            updateButtonColorha3haha();
                        } else if (flashingha3) {
                            updateButtonColorha3haha();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (yellowThresholdha3 <= secha3  && secha3 < redThresholdha3) {
                        if(!flashinghag3){
                            flashinghag3 = true; // 停止黄色闪烁
                            updateButtonColorha3haha();
                        } else if (flashinghag3) {
                            updateButtonColorha3haha();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (secha3 >= redThresholdha3) {
                        updateButtonColorha3haha();
                        showConfirmationDialogYNForButton3();
                    }
                }
            }
        });

        btnTimerha3haha.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton3();
                return true;
            }
        });

        btnTimerha4 = findViewById(R.id.b4);
        btnTimerha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha4){
                    showConfirmationDialogForButton4();
                    //isTimerRunningha4 = true;
                    updateButtonColorha4(); // 更新颜色
                } else if (isTimerRunningha4) {
                    if (secha4 < blueThresholdha4) {
                        updateButtonColorha4();
                        showConfirmationDialogYNForButton4();
                    } else if (blueThresholdha4 <= secha4  && secha4 < yellowThresholdha4  ) {
                        if(!flashingha4){
                            flashingha4 = true; // 停止蓝色闪烁
                            updateButtonColorha4();
                        } else if (flashingha4) {
                            updateButtonColorha4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (yellowThresholdha4 <= secha4  && secha4 < redThresholdha4) {
                        if(!flashinghag4){
                            flashinghag4 = true; // 停止黄色闪烁
                            updateButtonColorha4();
                        } else if (flashinghag4) {
                            updateButtonColorha4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (secha4 >= redThresholdha4) {
                        updateButtonColorha4();
                        showConfirmationDialogYNForButton4();
                    }
                }
            }
        });

        btnTimerha4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton4();
                return true;
            }
        });

        btnTimerha5 = findViewById(R.id.b5);
        btnTimerha5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha5){
                    showConfirmationDialogForButton5();
                    //isTimerRunningha5 = true;
                    updateButtonColorha5(); // 更新颜色
                } else if (isTimerRunningha5) {
                    if (secha5 < blueThresholdha5) {
                        updateButtonColorha5();
                        showConfirmationDialogYNForButton5();
                    } else if (blueThresholdha5 <= secha5  && secha5 < yellowThresholdha5  ) {
                        if(!flashingha5){
                            flashingha5 = true; // 停止蓝色闪烁
                            updateButtonColorha5();
                        } else if (flashingha5) {
                            updateButtonColorha5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (yellowThresholdha5 <= secha5  && secha5 < redThresholdha5) {
                        if(!flashinghag5){
                            flashinghag5 = true; // 停止黄色闪烁
                            updateButtonColorha5();
                        } else if (flashinghag5) {
                            updateButtonColorha5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (secha5 >= redThresholdha5) {
                        updateButtonColorha5();
                        showConfirmationDialogYNForButton5();
                    }
                }
            }
        });

        btnTimerha5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton5();
                return true;
            }
        });





        btnTimerha7 = findViewById(R.id.b7);
        btnTimerha7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha7){
                    showConfirmationDialogForButton7();
                    //isTimerRunningha7 = true;
                    updateButtonColorha7(); // 更新颜色
                } else if (isTimerRunningha7) {
                    if (secha7 < blueThresholdha7) {
                        updateButtonColorha7();
                        showConfirmationDialogYNForButton7();
                    } else if (blueThresholdha7 <= secha7  && secha7 < yellowThresholdha7  ) {
                        if(!flashingha7){
                            flashingha7 = true; // 停止蓝色闪烁
                            updateButtonColorha7();
                        } else if (flashingha7) {
                            updateButtonColorha7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (yellowThresholdha7 <= secha7  && secha7 < redThresholdha7) {
                        if(!flashinghag7){
                            flashinghag7 = true; // 停止黄色闪烁
                            updateButtonColorha7();
                        } else if (flashinghag7) {
                            updateButtonColorha7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (secha7 >= redThresholdha7) {
                        updateButtonColorha7();
                        showConfirmationDialogYNForButton7();
                    }
                }
            }
        });

        btnTimerha7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton7();
                return true;
            }
        });

        btnTimerha8 = findViewById(R.id.b8);
        btnTimerha8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha8){
                    showConfirmationDialogForButton8();
                    //isTimerRunningha8 = true;
                    updateButtonColorha8(); // 更新颜色
                } else if (isTimerRunningha8) {
                    if (secha8 < blueThresholdha8) {
                        updateButtonColorha8();
                        showConfirmationDialogYNForButton8();
                    } else if (blueThresholdha8 <= secha8  && secha8 < yellowThresholdha8  ) {
                        if(!flashingha8){
                            flashingha8 = true; // 停止蓝色闪烁
                            updateButtonColorha8();
                        } else if (flashingha8) {
                            updateButtonColorha8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (yellowThresholdha8 <= secha8  && secha8 < redThresholdha8) {
                        if(!flashinghag8){
                            flashinghag8 = true; // 停止黄色闪烁
                            updateButtonColorha8();
                        } else if (flashinghag8) {
                            updateButtonColorha8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (secha8 >= redThresholdha8) {
                        updateButtonColorha8();
                        showConfirmationDialogYNForButton8();
                    }
                }
            }
        });

        btnTimerha8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton8();
                return true;
            }
        });

        btnTimerha9 = findViewById(R.id.b9);
        btnTimerha9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha9){
                    showConfirmationDialogForButton9();
                    //isTimerRunningha9 = true;
                    updateButtonColorha9(); // 更新颜色
                } else if (isTimerRunningha9) {
                    if (secha9 < blueThresholdha9) {
                        updateButtonColorha9();
                        showConfirmationDialogYNForButton9();
                    } else if (blueThresholdha9 <= secha9  && secha9 < yellowThresholdha9  ) {
                        if(!flashingha9){
                            flashingha9 = true; // 停止蓝色闪烁
                            updateButtonColorha9();
                        } else if (flashingha9) {
                            updateButtonColorha9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (yellowThresholdha9 <= secha9  && secha9 < redThresholdha9) {
                        if(!flashinghag9){
                            flashinghag9 = true; // 停止黄色闪烁
                            updateButtonColorha9();
                        } else if (flashinghag9) {
                            updateButtonColorha9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (secha9 >= redThresholdha9) {
                        updateButtonColorha9();
                        showConfirmationDialogYNForButton9();
                    }
                }
            }
        });

        btnTimerha9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton9();
                return true;
            }
        });

        btnTimerha10 = findViewById(R.id.b10);
        btnTimerha10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha10){
                    showConfirmationDialogForButton10();
                    //isTimerRunningha10 = true;
                    updateButtonColorha10(); // 更新颜色
                } else if (isTimerRunningha10) {
                    if (secha10 < blueThresholdha10) {
                        updateButtonColorha10();
                        showConfirmationDialogYNForButton10();
                    } else if (blueThresholdha10 <= secha10  && secha10 < yellowThresholdha10  ) {
                        if(!flashingha10){
                            flashingha10 = true; // 停止蓝色闪烁
                            updateButtonColorha10();
                        } else if (flashingha10) {
                            updateButtonColorha10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (yellowThresholdha10 <= secha10  && secha10 < redThresholdha10) {
                        if(!flashinghag10){
                            flashinghag10 = true; // 停止黄色闪烁
                            updateButtonColorha10();
                        } else if (flashinghag10) {
                            updateButtonColorha10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (secha10 >= redThresholdha10) {
                        updateButtonColorha10();
                        showConfirmationDialogYNForButton10();
                    }
                }
            }
        });

        btnTimerha10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton10();
                return true;
            }
        });

        btnTimerha11 = findViewById(R.id.b11);
        btnTimerha11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha11){
                    showConfirmationDialogForButton11();
                    //isTimerRunningha11 = true;
                    updateButtonColorha11(); // 更新颜色
                } else if (isTimerRunningha11) {
                    if (secha11 < blueThresholdha11) {
                        updateButtonColorha11();
                        showConfirmationDialogYNForButton11();
                    } else if (blueThresholdha11 <= secha11  && secha11 < yellowThresholdha11  ) {
                        if(!flashingha11){
                            flashingha11 = true; // 停止蓝色闪烁
                            updateButtonColorha11();
                        } else if (flashingha11) {
                            updateButtonColorha11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (yellowThresholdha11 <= secha11  && secha11 < redThresholdha11) {
                        if(!flashinghag11){
                            flashinghag11 = true; // 停止黄色闪烁
                            updateButtonColorha11();
                        } else if (flashinghag11) {
                            updateButtonColorha11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (secha11 >= redThresholdha11) {
                        updateButtonColorha11();
                        showConfirmationDialogYNForButton11();
                    }
                }
            }
        });

        btnTimerha11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton11();
                return true;
            }
        });


        btnTimerha16 = findViewById(R.id.b16);
        btnTimerha16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha16){
                    showConfirmationDialogForButton16();
                    //isTimerRunningha16 = true;
                    updateButtonColorha16(); // 更新颜色
                } else if (isTimerRunningha16) {
                    if (secha16 < blueThresholdha16) {
                        updateButtonColorha16();
                        showConfirmationDialogYNForButton16();
                    } else if (blueThresholdha16 <= secha16  && secha16 < yellowThresholdha16  ) {
                        if(!flashingha16){
                            flashingha16 = true; // 停止蓝色闪烁
                            updateButtonColorha16();
                        } else if (flashingha16) {
                            updateButtonColorha16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (yellowThresholdha16 <= secha16  && secha16 < redThresholdha16) {
                        if(!flashinghag16){
                            flashinghag16 = true; // 停止黄色闪烁
                            updateButtonColorha16();
                        } else if (flashinghag16) {
                            updateButtonColorha16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (secha16 >= redThresholdha16) {
                        updateButtonColorha16();
                        showConfirmationDialogYNForButton16();
                    }
                }
            }
        });

        btnTimerha16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton16();
                return true;
            }
        });


        btnTimerha17 = findViewById(R.id.b17);
        btnTimerha17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha17){
                    showConfirmationDialogForButton17();
                    //isTimerRunningha17 = true;
                    updateButtonColorha17(); // 更新颜色
                } else if (isTimerRunningha17) {
                    if (secha17 < blueThresholdha17) {
                        updateButtonColorha17();
                        showConfirmationDialogYNForButton17();
                    } else if (blueThresholdha17 <= secha17  && secha17 < yellowThresholdha17  ) {
                        if(!flashingha17){
                            flashingha17 = true; // 停止蓝色闪烁
                            updateButtonColorha17();
                        } else if (flashingha17) {
                            updateButtonColorha17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (yellowThresholdha17 <= secha17  && secha17 < redThresholdha17) {
                        if(!flashinghag17){
                            flashinghag17 = true; // 停止黄色闪烁
                            updateButtonColorha17();
                        } else if (flashinghag17) {
                            updateButtonColorha17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (secha17 >= redThresholdha17) {
                        updateButtonColorha17();
                        showConfirmationDialogYNForButton17();
                    }
                }
            }
        });

        btnTimerha17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton17();
                return true;
            }
        });

        btnTimerha18 = findViewById(R.id.b18);
        btnTimerha18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha18){
                    showConfirmationDialogForButton18();
                    //isTimerRunningha18 = true;
                    updateButtonColorha18(); // 更新颜色
                } else if (isTimerRunningha18) {
                    if (secha18 < blueThresholdha18) {
                        updateButtonColorha18();
                        showConfirmationDialogYNForButton18();
                    } else if (blueThresholdha18 <= secha18  && secha18 < yellowThresholdha18  ) {
                        if(!flashingha18){
                            flashingha18 = true; // 停止蓝色闪烁
                            updateButtonColorha18();
                        } else if (flashingha18) {
                            updateButtonColorha18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (yellowThresholdha18 <= secha18  && secha18 < redThresholdha18) {
                        if(!flashinghag18){
                            flashinghag18 = true; // 停止黄色闪烁
                            updateButtonColorha18();
                        } else if (flashinghag18) {
                            updateButtonColorha18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (secha18 >= redThresholdha18) {
                        updateButtonColorha18();
                        showConfirmationDialogYNForButton18();
                    }
                }
            }
        });

        btnTimerha18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton18();
                return true;
            }
        });

        btnTimerha19 = findViewById(R.id.b19);
        btnTimerha19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha19){
                    showConfirmationDialogForButton19();
                    //isTimerRunningha19 = true;
                    updateButtonColorha19(); // 更新颜色
                } else if (isTimerRunningha19) {
                    if (secha19 < blueThresholdha19) {
                        updateButtonColorha19();
                        showConfirmationDialogYNForButton19();
                    } else if (blueThresholdha19 <= secha19  && secha19 < yellowThresholdha19  ) {
                        if(!flashingha19){
                            flashingha19 = true; // 停止蓝色闪烁
                            updateButtonColorha19();
                        } else if (flashingha19) {
                            updateButtonColorha19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (yellowThresholdha19 <= secha19  && secha19 < redThresholdha19) {
                        if(!flashinghag19){
                            flashinghag19 = true; // 停止黄色闪烁
                            updateButtonColorha19();
                        } else if (flashinghag19) {
                            updateButtonColorha19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (secha19 >= redThresholdha19) {
                        updateButtonColorha19();
                        showConfirmationDialogYNForButton19();
                    }
                }
            }
        });

        btnTimerha19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton19();
                return true;
            }
        });

        btnTimerha2haha0 = findViewById(R.id.b20);
        btnTimerha2haha0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha20){
                    showConfirmationDialogForButton20();
                    //isTimerRunningha20 = true;
                    updateButtonColorha2haha0(); // 更新颜色
                } else if (isTimerRunningha20) {
                    if (secha20 < blueThresholdha20) {
                        updateButtonColorha2haha0();
                        showConfirmationDialogYNForButton20();
                    } else if (blueThresholdha20 <= secha20  && secha20 < yellowThresholdha20  ) {
                        if(!flashingha20){
                            flashingha20 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha0();
                        } else if (flashingha20) {
                            updateButtonColorha2haha0();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (yellowThresholdha20 <= secha20  && secha20 < redThresholdha20) {
                        if(!flashinghag20){
                            flashinghag20 = true; // 停止黄色闪烁
                            updateButtonColorha2haha0();
                        } else if (flashinghag20) {
                            updateButtonColorha2haha0();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (secha20 >= redThresholdha20) {
                        updateButtonColorha2haha0();
                        showConfirmationDialogYNForButton20();
                    }
                }
            }
        });

        btnTimerha2haha0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton20();
                return true;
            }
        });

        btnTimerha2haha1 = findViewById(R.id.b21);
        btnTimerha2haha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha21){
                    showConfirmationDialogForButton21();
                    //isTimerRunningha21 = true;
                    updateButtonColorha2haha1(); // 更新颜色
                } else if (isTimerRunningha21) {
                    if (secha21 < blueThresholdha21) {
                        updateButtonColorha2haha1();
                        showConfirmationDialogYNForButton21();
                    } else if (blueThresholdha21 <= secha21  && secha21 < yellowThresholdha21  ) {
                        if(!flashingha21){
                            flashingha21 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha1();
                        } else if (flashingha21) {
                            updateButtonColorha2haha1();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (yellowThresholdha21 <= secha21  && secha21 < redThresholdha21) {
                        if(!flashinghag21){
                            flashinghag21 = true; // 停止黄色闪烁
                            updateButtonColorha2haha1();
                        } else if (flashinghag21) {
                            updateButtonColorha2haha1();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (secha21 >= redThresholdha21) {
                        updateButtonColorha2haha1();
                        showConfirmationDialogYNForButton21();
                    }
                }
            }
        });

        btnTimerha2haha1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton21();
                return true;
            }
        });

        btnTimerha2haha2 = findViewById(R.id.b22);
        btnTimerha2haha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha22){
                    showConfirmationDialogForButton22();
                    //isTimerRunningha22 = true;
                    updateButtonColorha2haha2(); // 更新颜色
                } else if (isTimerRunningha22) {
                    if (secha22 < blueThresholdha22) {
                        updateButtonColorha2haha2();
                        showConfirmationDialogYNForButton22();
                    } else if (blueThresholdha22 <= secha22  && secha22 < yellowThresholdha22  ) {
                        if(!flashingha22){
                            flashingha22 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha2();
                        } else if (flashingha22) {
                            updateButtonColorha2haha2();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (yellowThresholdha22 <= secha22  && secha22 < redThresholdha22) {
                        if(!flashinghag22){
                            flashinghag22 = true; // 停止黄色闪烁
                            updateButtonColorha2haha2();
                        } else if (flashinghag22) {
                            updateButtonColorha2haha2();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (secha22 >= redThresholdha22) {
                        updateButtonColorha2haha2();
                        showConfirmationDialogYNForButton22();
                    }
                }
            }
        });

        btnTimerha2haha2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton22();
                return true;
            }
        });

        btnTimerha2haha3 = findViewById(R.id.b23);
        btnTimerha2haha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha23){
                    showConfirmationDialogForButton23();
                    //isTimerRunningha23 = true;
                    updateButtonColorha2haha3(); // 更新颜色
                } else if (isTimerRunningha23) {
                    if (secha23 < blueThresholdha23) {
                        updateButtonColorha2haha3();
                        showConfirmationDialogYNForButton23();
                    } else if (blueThresholdha23 <= secha23  && secha23 < yellowThresholdha23  ) {
                        if(!flashingha23){
                            flashingha23 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha3();
                        } else if (flashingha23) {
                            updateButtonColorha2haha3();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (yellowThresholdha23 <= secha23  && secha23 < redThresholdha23) {
                        if(!flashinghag23){
                            flashinghag23 = true; // 停止黄色闪烁
                            updateButtonColorha2haha3();
                        } else if (flashinghag23) {
                            updateButtonColorha2haha3();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (secha23 >= redThresholdha23) {
                        updateButtonColorha2haha3();
                        showConfirmationDialogYNForButton23();
                    }
                }
            }
        });

        btnTimerha2haha3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton23();
                return true;
            }
        });

        btnTimerha2haha4 = findViewById(R.id.b24);
        btnTimerha2haha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha24){
                    showConfirmationDialogForButton24();
                    //isTimerRunningha24 = true;
                    updateButtonColorha2haha4(); // 更新颜色
                } else if (isTimerRunningha24) {
                    if (secha24 < blueThresholdha24) {
                        updateButtonColorha2haha4();
                        showConfirmationDialogYNForButton24();
                    } else if (blueThresholdha24 <= secha24  && secha24 < yellowThresholdha24  ) {
                        if(!flashingha24){
                            flashingha24 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha4();
                        } else if (flashingha24) {
                            updateButtonColorha2haha4();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (yellowThresholdha24 <= secha24  && secha24 < redThresholdha24) {
                        if(!flashinghag24){
                            flashinghag24 = true; // 停止黄色闪烁
                            updateButtonColorha2haha4();
                        } else if (flashinghag24) {
                            updateButtonColorha2haha4();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (secha24 >= redThresholdha24) {
                        updateButtonColorha2haha4();
                        showConfirmationDialogYNForButton24();
                    }
                }
            }
        });

        btnTimerha2haha4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton24();
                return true;
            }
        });

        btnTimerha2haha5 = findViewById(R.id.b25);
        btnTimerha2haha5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha25){
                    showConfirmationDialogForButton25();
                    //isTimerRunningha25 = true;
                    updateButtonColorha2haha5(); // 更新颜色
                } else if (isTimerRunningha25) {
                    if (secha25 < blueThresholdha25) {
                        updateButtonColorha2haha5();
                        showConfirmationDialogYNForButton25();
                    } else if (blueThresholdha25 <= secha25  && secha25 < yellowThresholdha25  ) {
                        if(!flashingha25){
                            flashingha25 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha5();
                        } else if (flashingha25) {
                            updateButtonColorha2haha5();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (yellowThresholdha25 <= secha25  && secha25 < redThresholdha25) {
                        if(!flashinghag25){
                            flashinghag25 = true; // 停止黄色闪烁
                            updateButtonColorha2haha5();
                        } else if (flashinghag25) {
                            updateButtonColorha2haha5();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (secha25 >= redThresholdha25) {
                        updateButtonColorha2haha5();
                        showConfirmationDialogYNForButton25();
                    }
                }
            }
        });

        btnTimerha2haha5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton25();
                return true;
            }
        });

        btnTimerha2haha7KK = findViewById(R.id.b27KK);
        btnTimerha2haha7KK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha27KK){
                    showConfirmationDialogForButton27KK();
                    //isTimerRunningha27KK = true;
                    updateButtonColorha2haha7KK(); // 更新颜色
                } else if (isTimerRunningha27KK) {
                    if (secha27KK < blueThresholdha27KK) {
                        updateButtonColorha2haha7KK();
                        showConfirmationDialogYNForButton27KK();
                    } else if (blueThresholdha27KK <= secha27KK  && secha27KK < yellowThresholdha27KK  ) {
                        if(!flashingha27KK){
                            flashingha27KK = true; // 停止蓝色闪烁
                            updateButtonColorha2haha7KK();
                        } else if (flashingha27KK) {
                            updateButtonColorha2haha7KK();
                            showConfirmationDialogYNForButton27KK();
                        }

                    } else if (yellowThresholdha27KK <= secha27KK  && secha27KK < redThresholdha27KK) {
                        if(!flashinghag27KK){
                            flashinghag27KK = true; // 停止黄色闪烁
                            updateButtonColorha2haha7KK();
                        } else if (flashinghag27KK) {
                            updateButtonColorha2haha7KK();
                            showConfirmationDialogYNForButton27KK();
                        }

                    } else if (secha27KK >= redThresholdha27KK) {
                        updateButtonColorha2haha7KK();
                        showConfirmationDialogYNForButton27KK();
                    }
                }
            }
        });

        btnTimerha2haha7KK.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton27KK();
                return true;
            }
        });

        btnTimerha2haha8KK = findViewById(R.id.b28KK);
        btnTimerha2haha8KK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha28KK){
                    showConfirmationDialogForButton28KK();
                    //isTimerRunningha28KK = true;
                    updateButtonColorha2haha8KK(); // 更新颜色
                } else if (isTimerRunningha28KK) {
                    if (secha28KK < blueThresholdha28KK) {
                        updateButtonColorha2haha8KK();
                        showConfirmationDialogYNForButton28KK();
                    } else if (blueThresholdha28KK <= secha28KK  && secha28KK < yellowThresholdha28KK  ) {
                        if(!flashingha28KK){
                            flashingha28KK = true; // 停止蓝色闪烁
                            updateButtonColorha2haha8KK();
                        } else if (flashingha28KK) {
                            updateButtonColorha2haha8KK();
                            showConfirmationDialogYNForButton28KK();
                        }

                    } else if (yellowThresholdha28KK <= secha28KK  && secha28KK < redThresholdha28KK) {
                        if(!flashinghag28KK){
                            flashinghag28KK = true; // 停止黄色闪烁
                            updateButtonColorha2haha8KK();
                        } else if (flashinghag28KK) {
                            updateButtonColorha2haha8KK();
                            showConfirmationDialogYNForButton28KK();
                        }

                    } else if (secha28KK >= redThresholdha28KK) {
                        updateButtonColorha2haha8KK();
                        showConfirmationDialogYNForButton28KK();
                    }
                }
            }
        });

        btnTimerha2haha8KK.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton28KK();
                return true;
            }
        });

        btnTimerha66 = findViewById(R.id.b666);
        btnTimerha66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha66){
                    showConfirmationDialogForButton66();
                    //isTimerRunningha66 = true;
                    updateButtonColorha66(); // 更新颜色
                } else if (isTimerRunningha66) {
                    if (secha66 < blueThresholdha66) {
                        updateButtonColorha66();
                        showConfirmationDialogYNForButton66();
                    } else if (blueThresholdha66 <= secha66  && secha66 < yellowThresholdha66  ) {
                        if(!flashingha66){
                            flashingha66 = true; // 停止蓝色闪烁
                            updateButtonColorha66();
                        } else if (flashingha66) {
                            updateButtonColorha66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (yellowThresholdha66 <= secha66  && secha66 < redThresholdha66) {
                        if(!flashinghag66){
                            flashinghag66 = true; // 停止黄色闪烁
                            updateButtonColorha66();
                        } else if (flashinghag66) {
                            updateButtonColorha66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (secha66 >= redThresholdha66) {
                        updateButtonColorha66();
                        showConfirmationDialogYNForButton66();
                    }
                }
            }
        });

        btnTimerha66.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton66();
                return true;
            }
        });
        btnTimerha2haha01 = findViewById(R.id.b201);
        btnTimerha2haha01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha201){
                    showConfirmationDialogForButton201();
                    //isTimerRunningha201 = true;
                    updateButtonColorha2haha01(); // 更新颜色
                } else if (isTimerRunningha201) {
                    if (secha201 < blueThresholdha201) {
                        updateButtonColorha2haha01();
                        showConfirmationDialogYNForButton201();
                    } else if (blueThresholdha201 <= secha201  && secha201 < yellowThresholdha201  ) {
                        if(!flashingha201){
                            flashingha201 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha01();
                        } else if (flashingha201) {
                            updateButtonColorha2haha01();
                            showConfirmationDialogYNForButton201();
                        }

                    } else if (yellowThresholdha201 <= secha201  && secha201 < redThresholdha201) {
                        if(!flashinghag201){
                            flashinghag201 = true; // 停止黄色闪烁
                            updateButtonColorha2haha01();
                        } else if (flashinghag201) {
                            updateButtonColorha2haha01();
                            showConfirmationDialogYNForButton201();
                        }

                    } else if (secha201 >= redThresholdha201) {
                        updateButtonColorha2haha01();
                        showConfirmationDialogYNForButton201();
                    }
                }
            }
        });

        btnTimerha2haha01.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton201();
                return true;
            }
        });

        btnTimerha2haha02 = findViewById(R.id.b202);
        btnTimerha2haha02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha202){
                    showConfirmationDialogForButton202();
                    //isTimerRunningha202 = true;
                    updateButtonColorha2haha02(); // 更新颜色
                } else if (isTimerRunningha202) {
                    if (secha202 < blueThresholdha202) {
                        updateButtonColorha2haha02();
                        showConfirmationDialogYNForButton202();
                    } else if (blueThresholdha202 <= secha202  && secha202 < yellowThresholdha202  ) {
                        if(!flashingha202){
                            flashingha202 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha02();
                        } else if (flashingha202) {
                            updateButtonColorha2haha02();
                            showConfirmationDialogYNForButton202();
                        }

                    } else if (yellowThresholdha202 <= secha202  && secha202 < redThresholdha202) {
                        if(!flashinghag202){
                            flashinghag202 = true; // 停止黄色闪烁
                            updateButtonColorha2haha02();
                        } else if (flashinghag202) {
                            updateButtonColorha2haha02();
                            showConfirmationDialogYNForButton202();
                        }

                    } else if (secha202 >= redThresholdha202) {
                        updateButtonColorha2haha02();
                        showConfirmationDialogYNForButton202();
                    }
                }
            }
        });

        btnTimerha2haha02.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton202();
                return true;
            }
        });

        btnTimerha2haha03 = findViewById(R.id.b203);
        btnTimerha2haha03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha203){
                    showConfirmationDialogForButton203();
                    //isTimerRunningha203 = true;
                    updateButtonColorha2haha03(); // 更新颜色
                } else if (isTimerRunningha203) {
                    if (secha203 < blueThresholdha203) {
                        updateButtonColorha2haha03();
                        showConfirmationDialogYNForButton203();
                    } else if (blueThresholdha203 <= secha203  && secha203 < yellowThresholdha203  ) {
                        if(!flashingha203){
                            flashingha203 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha03();
                        } else if (flashingha203) {
                            updateButtonColorha2haha03();
                            showConfirmationDialogYNForButton203();
                        }

                    } else if (yellowThresholdha203 <= secha203  && secha203 < redThresholdha203) {
                        if(!flashinghag203){
                            flashinghag203 = true; // 停止黄色闪烁
                            updateButtonColorha2haha03();
                        } else if (flashinghag203) {
                            updateButtonColorha2haha03();
                            showConfirmationDialogYNForButton203();
                        }

                    } else if (secha203 >= redThresholdha203) {
                        updateButtonColorha2haha03();
                        showConfirmationDialogYNForButton203();
                    }
                }
            }
        });

        btnTimerha2haha03.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton203();
                return true;
            }
        });

        btnTimerha2haha04 = findViewById(R.id.b204);
        btnTimerha2haha04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha204){
                    showConfirmationDialogForButton204();
                    //isTimerRunningha204 = true;
                    updateButtonColorha2haha04(); // 更新颜色
                } else if (isTimerRunningha204) {
                    if (secha204 < blueThresholdha204) {
                        updateButtonColorha2haha04();
                        showConfirmationDialogYNForButton204();
                    } else if (blueThresholdha204 <= secha204  && secha204 < yellowThresholdha204  ) {
                        if(!flashingha204){
                            flashingha204 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha04();
                        } else if (flashingha204) {
                            updateButtonColorha2haha04();
                            showConfirmationDialogYNForButton204();
                        }

                    } else if (yellowThresholdha204 <= secha204  && secha204 < redThresholdha204) {
                        if(!flashinghag204){
                            flashinghag204 = true; // 停止黄色闪烁
                            updateButtonColorha2haha04();
                        } else if (flashinghag204) {
                            updateButtonColorha2haha04();
                            showConfirmationDialogYNForButton204();
                        }

                    } else if (secha204 >= redThresholdha204) {
                        updateButtonColorha2haha04();
                        showConfirmationDialogYNForButton204();
                    }
                }
            }
        });

        btnTimerha2haha04.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton204();
                return true;
            }
        });

        btnTimerha2haha6KK = findViewById(R.id.b26KK);
        btnTimerha2haha6KK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha26KK){
                    showConfirmationDialogForButton26KK();
                    //isTimerRunningha26KK = true;
                    updateButtonColorha2haha6KK(); // 更新颜色
                } else if (isTimerRunningha26KK) {
                    if (secha26KK < blueThresholdha26KK) {
                        updateButtonColorha2haha6KK();
                        showConfirmationDialogYNForButton26KK();
                    } else if (blueThresholdha26KK <= secha26KK  && secha26KK < yellowThresholdha26KK  ) {
                        if(!flashingha26KK){
                            flashingha26KK = true; // 停止蓝色闪烁
                            updateButtonColorha2haha6KK();
                        } else if (flashingha26KK) {
                            updateButtonColorha2haha6KK();
                            showConfirmationDialogYNForButton26KK();
                        }

                    } else if (yellowThresholdha26KK <= secha26KK  && secha26KK < redThresholdha26KK) {
                        if(!flashinghag26KK){
                            flashinghag26KK = true; // 停止黄色闪烁
                            updateButtonColorha2haha6KK();
                        } else if (flashinghag26KK) {
                            updateButtonColorha2haha6KK();
                            showConfirmationDialogYNForButton26KK();
                        }

                    } else if (secha26KK >= redThresholdha26KK) {
                        updateButtonColorha2haha6KK();
                        showConfirmationDialogYNForButton26KK();
                    }
                }
            }
        });

        btnTimerha2haha6KK.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton26KK();
                return true;
            }
        });

    }
    //--------------------------------------------------------------------------

    @Override
    public void onDestroy() {
        super.onDestroy();
        handlerhaha1.removeCallbacks(updateTimerThreadha1);
        handlerhaha1.removeCallbacks(updateTimerThreadha2);
        handlerhaha1.removeCallbacks(updateTimerThreadha3);
        handlerhaha1.removeCallbacks(updateTimerThreadha4);
        handlerhaha1.removeCallbacks(updateTimerThreadha5);
        handlerhaha1.removeCallbacks(updateTimerThreadha66);
        handlerhaha1.removeCallbacks(updateTimerThreadha7);
        handlerhaha1.removeCallbacks(updateTimerThreadha8);
        handlerhaha1.removeCallbacks(updateTimerThreadha9);
        handlerhaha1.removeCallbacks(updateTimerThreadha10);
        handlerhaha1.removeCallbacks(updateTimerThreadha11);
        handlerhaha1.removeCallbacks(updateTimerThreadha201);
        handlerhaha1.removeCallbacks(updateTimerThreadha202);
        handlerhaha1.removeCallbacks(updateTimerThreadha203);
        handlerhaha1.removeCallbacks(updateTimerThreadha204);
        handlerhaha1.removeCallbacks(updateTimerThreadha16);
        handlerhaha1.removeCallbacks(updateTimerThreadha17);
        handlerhaha1.removeCallbacks(updateTimerThreadha18);
        handlerhaha1.removeCallbacks(updateTimerThreadha19);
        handlerhaha1.removeCallbacks(updateTimerThreadha20);
        handlerhaha1.removeCallbacks(updateTimerThreadha21);
        handlerhaha1.removeCallbacks(updateTimerThreadha22);
        handlerhaha1.removeCallbacks(updateTimerThreadha23);
        handlerhaha1.removeCallbacks(updateTimerThreadha24);
        handlerhaha1.removeCallbacks(updateTimerThreadha25);
        /*handlerhaha1.removeCallbacks(updateTimerThreadha266);*/
        handlerhaha1.removeCallbacks(updateTimerThreadha27KK);
        handlerhaha1.removeCallbacks(updateTimerThreadha28KK);
        handlerhaha1.removeCallbacks(updateTimerThreadha26KK);






        // 停止計時器服務
        Intent timerServiceIntenthaha = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha);
        // 停止計時器服務
        Intent timerServiceIntenthaha1 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha1);

        Intent timerServiceIntenthaha2 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha2);

        Intent timerServiceIntenthaha3 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha3);

        Intent timerServiceIntenthaha4 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha4);

        Intent timerServiceIntenthaha5 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha5);

        Intent timerServiceIntenthaha6 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha6);

        Intent timerServiceIntenthaha7 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha7);

        Intent timerServiceIntenthaha8 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha8);

        Intent timerServiceIntenthaha9 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha9);

        Intent timerServiceIntenthaha10 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha10);

        Intent timerServiceIntenthaha11 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha11);

        Intent timerServiceIntenthaha12 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha12);

        Intent timerServiceIntenthaha13 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha13);

        Intent timerServiceIntenthaha14 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha14);

        Intent timerServiceIntenthaha15 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha15);

        Intent timerServiceIntenthaha16 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha16);

        Intent timerServiceIntenthaha17 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha17);

        Intent timerServiceIntenthaha18 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha18);

        Intent timerServiceIntenthaha19 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha19);

        Intent timerServiceIntenthaha20 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha20);

        Intent timerServiceIntenthaha21 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha21);

        Intent timerServiceIntenthaha22 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha22);

        Intent timerServiceIntenthaha23 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha23);

        Intent timerServiceIntenthaha24 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha24);

        Intent timerServiceIntenthaha25 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha25);

        //Intent timerServiceIntenthaha266 = new Intent(this, TimerServiceS2.class);
        //stopService(timerServiceIntenthaha266);

        Intent timerServiceIntenthaha27KK = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha27KK);

        Intent timerServiceIntenthaha28KK = new Intent(this,TimerServiceS2.class);
        stopService(timerServiceIntenthaha28KK);

        Intent timerServiceIntenthaha66 = new Intent(this,TimerServiceS2.class);
        stopService(timerServiceIntenthaha66);

        Intent timerServiceIntenthaha26KK = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha26KK);

    }


    @Override
    public void onPause() {
        super.onPause();

        // 在保存計時器1狀態時，使用editorhaha1對象進行同步
        synchronized (editorhaha1) {
            editorhaha1.putBoolean(TIMER_STARTED_KEYhaha1, handlerhaha1.hasCallbacks(updateTimerThreadha1));
            editorhaha1.putLong(START_TIME_KEYhaha1, starttimeha1);
            editorhaha1.putLong(ELAPSED_TIME_KEYhaha1, timeInMillisechaondshaha1);
            editorhaha1.putBoolean("peopleha_key1", peopleha3_1);
            editorhaha1.putBoolean("flashingha_key1", flashingha1);
            editorhaha1.putBoolean("flashinghag_key1", flashinghag1);
            editorhaha1.putBoolean("isTimerRunningha1", isTimerRunningha1);
            editorhaha1.putInt("currentHourha1",currentHourha1);
            editorhaha1.putInt("currentMinuteha1",currentMinuteha1);

            // 保存加時時間到SharedPreferences
            editorhaha1.putInt("blueThresholdha1", blueThresholdha1);
            editorhaha1.putInt("yellowThresholdha1", yellowThresholdha1);
            editorhaha1.putInt("redThresholdha1", redThresholdha1);
            editorhaha1.apply();
        }

        // 在保存計時器2狀態時，使用editorhaha2haha對象進行同步
        synchronized (editorhaha2haha) {
            editorhaha2haha.putBoolean(TIMER_STARTED_KEy2haha, handlerhaha1.hasCallbacks(updateTimerThreadha2));
            editorhaha2haha.putLong(START_TIME_KEy2haha, starttimeha2);
            editorhaha2haha.putLong(ELAPSED_TIME_KEy2haha, timeInMillisechaondshaha2);
            editorhaha2haha.putBoolean("peopleha_key2haha", peopleha3_2);


            editorhaha2haha.putBoolean("flashingha_key2haha", flashingha2);
            editorhaha2haha.putBoolean("flashinghag_key2haha", flashinghag2);
            editorhaha2haha.putBoolean("isTimerRunningha2", isTimerRunningha2);
            editorhaha2haha.putInt("currentHourha2haha", currentHourha2haha);
            editorhaha2haha.putInt("currentMinuteha2", currentMinuteha2);


            // 保存加時時間到SharedPreferences
            editorhaha2haha.putInt("blueThresholdha2", blueThresholdha2);
            editorhaha2haha.putInt("yellowThresholdha2", yellowThresholdha2);
            editorhaha2haha.putInt("redThresholdha2", redThresholdha2);
            editorhaha2haha.apply();
        }

        synchronized (editorhaha3haha) {
            editorhaha3haha.putBoolean(TIMER_STARTED_KEy3haha, handlerhaha1.hasCallbacks(updateTimerThreadha3));
            editorhaha3haha.putLong(START_TIME_KEy3haha, startTimeha3);
            editorhaha3haha.putLong(ELAPSED_TIME_KEy3haha, timeInMillisechaondshaha3);
            editorhaha3haha.putBoolean("peopleha_key3haha", peopleha3_3);

            editorhaha3haha.putBoolean("flashingha_key3haha", flashingha3);
            editorhaha3haha.putBoolean("flashinghag_key3haha", flashinghag3);
            editorhaha3haha.putBoolean("isTimerRunningha3", isTimerRunningha3);
            editorhaha3haha.putInt("currentHourha3haha", currentHourha3haha);
            editorhaha3haha.putInt("currentMinuteha3", currentMinuteha3);


            // 保存加時時間到SharedPreferences
            editorhaha3haha.putInt("blueThresholdha3", blueThresholdha3);
            editorhaha3haha.putInt("yellowThresholdha3", yellowThresholdha3);
            editorhaha3haha.putInt("redThresholdha3", redThresholdha3);
            editorhaha3haha.apply();
        }

        synchronized (editorhaha4) {
            editorhaha4.putBoolean(TIMER_STARTED_KEYhaha4, handlerhaha1.hasCallbacks(updateTimerThreadha4));
            editorhaha4.putLong(START_TIME_KEYhaha4, startTimeha4);
            editorhaha4.putLong(ELAPSED_TIME_KEYhaha4, timeInMillisechaondshaha4);
            editorhaha4.putBoolean("peopleha_key4", peopleha3_4);

            editorhaha4.putBoolean("flashingha_key4", flashingha4);
            editorhaha4.putBoolean("flashinghag_key4", flashinghag4);
            editorhaha4.putBoolean("isTimerRunningha4", isTimerRunningha4);
            editorhaha4.putInt("currentHourha4", currentHourha4);
            editorhaha4.putInt("currentMinuteha4", currentMinuteha4);


            // 保存加時時間到SharedPreferences
            editorhaha4.putInt("blueThresholdha4", blueThresholdha4);
            editorhaha4.putInt("yellowThresholdha4", yellowThresholdha4);
            editorhaha4.putInt("redThresholdha4", redThresholdha4);
            editorhaha4.apply();
        }

        synchronized (editorhaha5) {
            editorhaha5.putBoolean(TIMER_STARTED_KEYhaha5, handlerhaha1.hasCallbacks(updateTimerThreadha5));
            editorhaha5.putLong(START_TIME_KEYhaha5, startTimeha5);
            editorhaha5.putLong(ELAPSED_TIME_KEYhaha5, timeInMillisechaondshaha5);
            editorhaha5.putBoolean("peopleha_key5", peopleha3_5);

            editorhaha5.putBoolean("flashingha_key5", flashingha5);
            editorhaha5.putBoolean("flashinghag_key5", flashinghag5);
            editorhaha5.putBoolean("isTimerRunningha5", isTimerRunningha5);
            editorhaha5.putInt("currentHourha5", currentHourha5);
            editorhaha5.putInt("currentMinuteha5", currentMinuteha5);


// 保存加時時間到SharedPreferences
            editorhaha5.putInt("blueThresholdha5", blueThresholdha5);
            editorhaha5.putInt("yellowThresholdha5", yellowThresholdha5);
            editorhaha5.putInt("redThresholdha5", redThresholdha5);
            editorhaha5.apply();
        }



        synchronized (editorhaha7) {
            editorhaha7.putBoolean(TIMER_STARTED_KEYhaha7, handlerhaha1.hasCallbacks(updateTimerThreadha7));
            editorhaha7.putLong(START_TIME_KEYhaha7, startTimeha7);
            editorhaha7.putLong(ELAPSED_TIME_KEYhaha7, timeInMillisechaondshaha7);
            editorhaha7.putBoolean("peopleha_key7", peopleha3_7);

            editorhaha7.putBoolean("flashingha_key7", flashingha7);
            editorhaha7.putBoolean("flashinghag_key7", flashinghag7);
            editorhaha7.putBoolean("isTimerRunningha7", isTimerRunningha7);

            editorhaha7.putInt("currentHourha7", currentHourha7);
            editorhaha7.putInt("currentMinuteha7", currentMinuteha7);


            // 保存加時時間到SharedPreferences
            editorhaha7.putInt("blueThresholdha7", blueThresholdha7);
            editorhaha7.putInt("yellowThresholdha7", yellowThresholdha7);
            editorhaha7.putInt("redThresholdha7", redThresholdha7);
            editorhaha7.apply();
        }

        synchronized (editorhaha8) {
            editorhaha8.putBoolean(TIMER_STARTED_KEYhaha8, handlerhaha1.hasCallbacks(updateTimerThreadha8));
            editorhaha8.putLong(START_TIME_KEYhaha8, startTimeha8);
            editorhaha8.putLong(ELAPSED_TIME_KEYhaha8, timeInMillisechaondshaha8);
            editorhaha8.putBoolean("peopleha_key8", peopleha3_8);

            editorhaha8.putBoolean("flashingha_key8", flashingha8);
            editorhaha8.putBoolean("flashinghag_key8", flashinghag8);
            editorhaha8.putBoolean("isTimerRunningha8", isTimerRunningha8);
            editorhaha8.putInt("currentHourha8", currentHourha8);
            editorhaha8.putInt("currentMinuteha8", currentMinuteha8);


// 保存加時時間到SharedPreferences
            editorhaha8.putInt("blueThresholdha8", blueThresholdha8);
            editorhaha8.putInt("yellowThresholdha8", yellowThresholdha8);
            editorhaha8.putInt("redThresholdha8", redThresholdha8);
            editorhaha8.apply();
        }

        synchronized (editorhaha9) {
            editorhaha9.putBoolean(TIMER_STARTED_KEYhaha9, handlerhaha1.hasCallbacks(updateTimerThreadha9));
            editorhaha9.putLong(START_TIME_KEYhaha9, startTimeha9);
            editorhaha9.putLong(ELAPSED_TIME_KEYhaha9, timeInMillisechaondshaha9);
            editorhaha9.putBoolean("peopleha_key9", peopleha3_9);

            editorhaha9.putBoolean("flashingha_key9", flashingha9);
            editorhaha9.putBoolean("flashinghag_key9", flashinghag9);
            editorhaha9.putBoolean("isTimerRunningha9", isTimerRunningha9);
            editorhaha9.putInt("currentHourha9", currentHourha9);
            editorhaha9.putInt("currentMinuteha9", currentMinuteha9);


            editorhaha9.putInt("blueThresholdha9", blueThresholdha9);
            editorhaha9.putInt("yellowThresholdha9", yellowThresholdha9);
            editorhaha9.putInt("redThresholdha9", redThresholdha9);
            editorhaha9.apply();
        }

        synchronized (editorhaha10) {
            editorhaha10.putBoolean(TIMER_STARTED_KEYhaha10, handlerhaha1.hasCallbacks(updateTimerThreadha10));
            editorhaha10.putLong(START_TIME_KEYhaha10, starttimeha10);
            editorhaha10.putLong(ELAPSED_TIME_KEYhaha10, timeInMillisechaondshaha10);
            editorhaha10.putBoolean("peopleha_key10", peopleha3_10);

            editorhaha10.putBoolean("flashingha_key10", flashingha10);
            editorhaha10.putBoolean("flashinghag_key10", flashinghag10);
            editorhaha10.putBoolean("isTimerRunningha10", isTimerRunningha10);
            editorhaha10.putInt("currentHourha10", currentHourha10);
            editorhaha10.putInt("currentMinuteha10", currentMinuteha10);


            editorhaha10.putInt("blueThresholdha10", blueThresholdha10);
            editorhaha10.putInt("yellowThresholdha10", yellowThresholdha10);
            editorhaha10.putInt("redThresholdha10", redThresholdha10);
            editorhaha10.apply();
        }

        synchronized (editorhaha11) {
            editorhaha11.putBoolean(TIMER_STARTED_KEYhaha11, handlerhaha1.hasCallbacks(updateTimerThreadha11));
            editorhaha11.putLong(START_TIME_KEYhaha11, starttimeha11);
            editorhaha11.putLong(ELAPSED_TIME_KEYhaha11, timeInMillisechaondshaha11);
            editorhaha11.putBoolean("peopleha_key11", peopleha3_11);

            editorhaha11.putBoolean("flashingha_key11", flashingha11);
            editorhaha11.putBoolean("flashinghag_key11", flashinghag11);
            editorhaha11.putBoolean("isTimerRunningha11", isTimerRunningha11);
            editorhaha11.putInt("currentHourha11", currentHourha11);
            editorhaha11.putInt("currentMinuteha11", currentMinuteha11);



            editorhaha11.putInt("blueThresholdha11", blueThresholdha11);
            editorhaha11.putInt("yellowThresholdha11", yellowThresholdha11);
            editorhaha11.putInt("redThresholdha11", redThresholdha11);
            editorhaha11.apply();
        }

        synchronized (editorhaha12) {
            editorhaha12.putBoolean(TIMER_STARTED_KEYhaha12, handlerhaha1.hasCallbacks(updateTimerThreadha201));
            editorhaha12.putLong(START_TIME_KEYhaha12, starttimeha201);
            editorhaha12.putLong(ELAPSED_TIME_KEYhaha12, timeInMillisechaondshaha201);
            editorhaha12.putBoolean("peopleha_key12", peopleha3_12);

            editorhaha12.putBoolean("flashingha_key12", flashingha201);
            editorhaha12.putBoolean("flashinghag_key12", flashinghag201);
            editorhaha12.putBoolean("isTimerRunningha12", isTimerRunningha201);
            editorhaha12.putInt("currentHourha12", currentHourha12);
            editorhaha12.putInt("currentMinuteha12", currentMinuteha12);


            editorhaha12.putInt("blueThresholdha12", blueThresholdha201);
            editorhaha12.putInt("yellowThresholdha12", yellowThresholdha201);
            editorhaha12.putInt("redThresholdha12", redThresholdha201);
            editorhaha12.apply();
        }

        synchronized (editorhaha13) {
            editorhaha13.putBoolean(TIMER_STARTED_KEYhaha13, handlerhaha1.hasCallbacks(updateTimerThreadha202));
            editorhaha13.putLong(START_TIME_KEYhaha13, starttimeha202);
            editorhaha13.putLong(ELAPSED_TIME_KEYhaha13, timeInMillisechaondshaha202);
            editorhaha13.putBoolean("peopleha_key13", peopleha3_13);

            editorhaha13.putBoolean("flashingha_key13", flashingha202);
            editorhaha13.putBoolean("flashinghag_key13", flashinghag202);
            editorhaha13.putBoolean("isTimerRunningha13", isTimerRunningha202);
            editorhaha13.putInt("currentHourha13", currentHourha13);
            editorhaha13.putInt("currentMinuteha13", currentMinuteha13);


            editorhaha13.putInt("blueThresholdha13", blueThresholdha202);
            editorhaha13.putInt("yellowThresholdha13", yellowThresholdha202);
            editorhaha13.putInt("redThresholdha13", redThresholdha202);
            editorhaha13.apply();
        }

        synchronized (editorhaha14) {
            editorhaha14.putBoolean(TIMER_STARTED_KEYhaha14, handlerhaha1.hasCallbacks(updateTimerThreadha203));
            editorhaha14.putLong(START_TIME_KEYhaha14, starttimeha203);
            editorhaha14.putLong(ELAPSED_TIME_KEYhaha14, timeInMillisechaondshaha203);
            editorhaha14.putBoolean("peopleha_key14", peopleha3_14);

            editorhaha14.putBoolean("flashingha_key14", flashingha203);
            editorhaha14.putBoolean("flashinghag_key14", flashinghag203);
            editorhaha14.putBoolean("isTimerRunningha14", isTimerRunningha203);
            editorhaha14.putInt("currentHourha14", currentHourha14);
            editorhaha14.putInt("currentMinuteha14", currentMinuteha14);


            editorhaha14.putInt("blueThresholdha14", blueThresholdha203);
            editorhaha14.putInt("yellowThresholdha14", yellowThresholdha203);
            editorhaha14.putInt("redThresholdha14", redThresholdha203);
            editorhaha14.apply();
        }

        synchronized (editorhaha15) {
            editorhaha15.putBoolean(TIMER_STARTED_KEYhaha15, handlerhaha1.hasCallbacks(updateTimerThreadha204));
            editorhaha15.putLong(START_TIME_KEYhaha15, starttimeha204);
            editorhaha15.putLong(ELAPSED_TIME_KEYhaha15, timeInMillisechaondshaha204);
            editorhaha15.putBoolean("peopleha_key15", peopleha3_15);

            editorhaha15.putBoolean("flashingha_key15", flashingha204);
            editorhaha15.putBoolean("flashinghag_key15", flashinghag204);
            editorhaha15.putBoolean("isTimerRunningha15", isTimerRunningha204);
            editorhaha15.putInt("currentHourha15", currentHourha15);
            editorhaha15.putInt("currentMinuteha15", currentMinuteha15);


            editorhaha15.putInt("blueThresholdha15", blueThresholdha204);
            editorhaha15.putInt("yellowThresholdha15", yellowThresholdha204);
            editorhaha15.putInt("redThresholdha15", redThresholdha204);
            editorhaha15.apply();
        }

        synchronized (editorhaha16) {
            editorhaha16.putBoolean(TIMER_STARTED_KEYhaha16, handlerhaha1.hasCallbacks(updateTimerThreadha16));
            editorhaha16.putLong(START_TIME_KEYhaha16, starttimeha16);
            editorhaha16.putLong(ELAPSED_TIME_KEYhaha16, timeInMillisechaondshaha16);
            editorhaha16.putBoolean("peopleha_key16", peopleha3_16);

            editorhaha16.putBoolean("flashingha_key16", flashingha16);
            editorhaha16.putBoolean("flashinghag_key16", flashinghag16);
            editorhaha16.putBoolean("isTimerRunningha16", isTimerRunningha16);
            editorhaha16.putInt("currentHourha16", currentHourha16);
            editorhaha16.putInt("currentMinuteha16", currentMinuteha16);


            editorhaha16.putInt("blueThresholdha16", blueThresholdha16);
            editorhaha16.putInt("yellowThresholdha16", yellowThresholdha16);
            editorhaha16.putInt("redThresholdha16", redThresholdha16);
            editorhaha16.apply();
        }

        synchronized (editorhaha17) {
            editorhaha17.putBoolean(TIMER_STARTED_KEYhaha17, handlerhaha1.hasCallbacks(updateTimerThreadha17));
            editorhaha17.putLong(START_TIME_KEYhaha17, starttimeha17);
            editorhaha17.putLong(ELAPSED_TIME_KEYhaha17, timeInMillisechaondshaha17);
            editorhaha17.putBoolean("peopleha_key17", peopleha3_17);

            editorhaha17.putBoolean("flashingha_key17", flashingha17);
            editorhaha17.putBoolean("flashinghag_key17", flashinghag17);
            editorhaha17.putBoolean("isTimerRunningha17", isTimerRunningha17);
            editorhaha17.putInt("currentHourha17", currentHourha17);
            editorhaha17.putInt("currentMinuteha17", currentMinuteha17);


            editorhaha17.putInt("blueThresholdha17", blueThresholdha17);
            editorhaha17.putInt("yellowThresholdha17", yellowThresholdha17);
            editorhaha17.putInt("redThresholdha17", redThresholdha17);
            editorhaha17.apply();
        }

        synchronized (editorhaha18) {
            editorhaha18.putBoolean(TIMER_STARTED_KEYhaha18, handlerhaha1.hasCallbacks(updateTimerThreadha18));
            editorhaha18.putLong(START_TIME_KEYhaha18, starttimeha18);
            editorhaha18.putLong(ELAPSED_TIME_KEYhaha18, timeInMillisechaondshaha18);
            editorhaha18.putBoolean("peopleha_key18", peopleha3_18);

            editorhaha18.putBoolean("flashingha_key18", flashingha18);
            editorhaha18.putBoolean("flashinghag_key18", flashinghag18);
            editorhaha18.putBoolean("isTimerRunningha18", isTimerRunningha18);
            editorhaha18.putInt("currentHourha18", currentHourha18);
            editorhaha18.putInt("currentMinuteha18", currentMinuteha18);


            editorhaha18.putInt("blueThresholdha18", blueThresholdha18);
            editorhaha18.putInt("yellowThresholdha18", yellowThresholdha18);
            editorhaha18.putInt("redThresholdha18", redThresholdha18);
            editorhaha18.apply();
        }

        synchronized (editorhaha19) {
            editorhaha19.putBoolean(TIMER_STARTED_KEYhaha19, handlerhaha1.hasCallbacks(updateTimerThreadha19));
            editorhaha19.putLong(START_TIME_KEYhaha19, starttimeha19);
            editorhaha19.putLong(ELAPSED_TIME_KEYhaha19, timeInMillisechaondshaha19);
            editorhaha19.putBoolean("peopleha_key19", peopleha3_19);

            editorhaha19.putBoolean("flashingha_key19", flashingha19);
            editorhaha19.putBoolean("flashinghag_key19", flashinghag19);
            editorhaha19.putBoolean("isTimerRunningha19", isTimerRunningha19);
            editorhaha19.putInt("currentHourha19", currentHourha19);
            editorhaha19.putInt("currentMinuteha19", currentMinuteha19);


            editorhaha19.putInt("blueThresholdha19", blueThresholdha19);
            editorhaha19.putInt("yellowThresholdha19", yellowThresholdha19);
            editorhaha19.putInt("redThresholdha19", redThresholdha19);
            editorhaha19.apply();
        }

        synchronized (editorhaha2haha0) {
            editorhaha2haha0.putBoolean(TIMER_STARTED_KEy2haha0, handlerhaha1.hasCallbacks(updateTimerThreadha20));
            editorhaha2haha0.putLong(START_TIME_KEy2haha0, starttimeha20);
            editorhaha2haha0.putLong(ELAPSED_TIME_KEy2haha0, timeInMillisechaondshaha20);
            editorhaha2haha0.putBoolean("peopleha_key2haha0", peopleha3_20);

            editorhaha2haha0.putBoolean("flashingha_key2haha0", flashingha20);
            editorhaha2haha0.putBoolean("flashinghag_key2haha0", flashinghag20);
            editorhaha2haha0.putBoolean("isTimerRunningha20", isTimerRunningha20);
            editorhaha2haha0.putInt("currentHourha2haha0", currentHourha2haha0);
            editorhaha2haha0.putInt("currentMinuteha20", currentMinuteha20);



            editorhaha2haha0.putInt("blueThresholdha20", blueThresholdha20);
            editorhaha2haha0.putInt("yellowThresholdha20", yellowThresholdha20);
            editorhaha2haha0.putInt("redThresholdha20", redThresholdha20);
            editorhaha2haha0.apply();
        }

        synchronized (editorhaha2haha1) {
            editorhaha2haha1.putBoolean(TIMER_STARTED_KEy2haha1, handlerhaha1.hasCallbacks(updateTimerThreadha21));
            editorhaha2haha1.putLong(START_TIME_KEy2haha1, starttimeha21);
            editorhaha2haha1.putLong(ELAPSED_TIME_KEy2haha1, timeInMillisechaondshaha21);
            editorhaha2haha1.putBoolean("peopleha_key2haha1", peopleha3_21);

            editorhaha2haha1.putBoolean("flashingha_key2haha1", flashingha21);
            editorhaha2haha1.putBoolean("flashinghag_key2haha1", flashinghag21);
            editorhaha2haha1.putBoolean("isTimerRunningha21", isTimerRunningha21);
            editorhaha2haha1.putInt("currentHourha2haha1", currentHourha2haha1);
            editorhaha2haha1.putInt("currentMinuteha21", currentMinuteha21);


            editorhaha2haha1.putInt("blueThresholdha21", blueThresholdha21);
            editorhaha2haha1.putInt("yellowThresholdha21", yellowThresholdha21);
            editorhaha2haha1.putInt("redThresholdha21", redThresholdha21);
            editorhaha2haha1.apply();
        }

        synchronized (editorhaha2haha2) {
            editorhaha2haha2.putBoolean(TIMER_STARTED_KEy2haha2, handlerhaha1.hasCallbacks(updateTimerThreadha22));
            editorhaha2haha2.putLong(START_TIME_KEy2haha2, starttimeha22);
            editorhaha2haha2.putLong(ELAPSED_TIME_KEy2haha2, timeInMillisechaondshaha22);
            editorhaha2haha2.putBoolean("peopleha_key2haha2", peopleha3_22);

            editorhaha2haha2.putBoolean("flashingha_key2haha2", flashingha22);
            editorhaha2haha2.putBoolean("flashinghag_key2haha2", flashinghag22);
            editorhaha2haha2.putBoolean("isTimerRunningha22", isTimerRunningha22);
            editorhaha2haha2.putInt("currentHourha2haha2", currentHourha2haha2);
            editorhaha2haha2.putInt("currentMinuteha22", currentMinuteha22);


// 保存加時時間到SharedPreferences
            editorhaha2haha2.putInt("blueThresholdha22", blueThresholdha22);
            editorhaha2haha2.putInt("yellowThresholdha22", yellowThresholdha22);
            editorhaha2haha2.putInt("redThresholdha22", redThresholdha22);
            editorhaha2haha2.apply();
        }

        synchronized (editorhaha2haha3) {
            editorhaha2haha3.putBoolean(TIMER_STARTED_KEy2haha3, handlerhaha1.hasCallbacks(updateTimerThreadha23));
            editorhaha2haha3.putLong(START_TIME_KEy2haha3, starttimeha23);
            editorhaha2haha3.putLong(ELAPSED_TIME_KEy2haha3, timeInMillisechaondshaha23);
            editorhaha2haha3.putBoolean("peopleha_key2haha3", peopleha3_23);

            editorhaha2haha3.putBoolean("flashingha_key2haha3", flashingha23);
            editorhaha2haha3.putBoolean("flashinghag_key2haha3", flashinghag23);
            editorhaha2haha3.putBoolean("isTimerRunningha23", isTimerRunningha23);
            editorhaha2haha3.putInt("currentHourha2haha3", currentHourha2haha3);
            editorhaha2haha3.putInt("currentMinuteha23", currentMinuteha23);


            editorhaha2haha3.putInt("blueThresholdha23", blueThresholdha23);
            editorhaha2haha3.putInt("yellowThresholdha23", yellowThresholdha23);
            editorhaha2haha3.putInt("redThresholdha23", redThresholdha23);
            editorhaha2haha3.apply();
        }

        synchronized (editorhaha2haha4) {
            editorhaha2haha4.putBoolean(TIMER_STARTED_KEy2haha4, handlerhaha1.hasCallbacks(updateTimerThreadha24));
            editorhaha2haha4.putLong(START_TIME_KEy2haha4, starttimeha24);
            editorhaha2haha4.putLong(ELAPSED_TIME_KEy2haha4, timeInMillisechaondshaha24);
            editorhaha2haha4.putBoolean("peopleha_key2haha4", peopleha3_24);

            editorhaha2haha4.putBoolean("flashingha_key2haha4", flashingha24);
            editorhaha2haha4.putBoolean("flashinghag_key2haha4", flashinghag24);
            editorhaha2haha4.putBoolean("isTimerRunningha24", isTimerRunningha24);
            editorhaha2haha4.putInt("currentHourha2haha4", currentHourha2haha4);
            editorhaha2haha4.putInt("currentMinuteha24", currentMinuteha24);


            editorhaha2haha4.putInt("blueThresholdha24", blueThresholdha24);
            editorhaha2haha4.putInt("yellowThresholdha24", yellowThresholdha24);
            editorhaha2haha4.putInt("redThresholdha24", redThresholdha24);
            editorhaha2haha4.apply();
        }

        synchronized (editorhaha2haha5) {
            editorhaha2haha5.putBoolean(TIMER_STARTED_KEy2haha5, handlerhaha1.hasCallbacks(updateTimerThreadha25));
            editorhaha2haha5.putLong(START_TIME_KEy2haha5, starttimeha25);
            editorhaha2haha5.putLong(ELAPSED_TIME_KEy2haha5, timeInMillisechaondshaha25);
            editorhaha2haha5.putBoolean("peopleha_key2haha5", peopleha3_25);

            editorhaha2haha5.putBoolean("flashingha_key2haha5", flashingha25);
            editorhaha2haha5.putBoolean("flashinghag_key2haha5", flashinghag25);
            editorhaha2haha5.putBoolean("isTimerRunningha25", isTimerRunningha25);
            editorhaha2haha5.putInt("currentHourha2haha5", currentHourha2haha5);
            editorhaha2haha5.putInt("currentMinuteha25", currentMinuteha25);


            editorhaha2haha5.putInt("blueThresholdha25", blueThresholdha25);
            editorhaha2haha5.putInt("yellowThresholdha25", yellowThresholdha25);
            editorhaha2haha5.putInt("redThresholdha25", redThresholdha25);
            editorhaha2haha5.apply();
        }

        synchronized (editorhaha2haha7KK) {
            editorhaha2haha7KK.putBoolean(TIMER_STARTED_KEy2haha7KK, handlerhaha1.hasCallbacks(updateTimerThreadha27KK));
            editorhaha2haha7KK.putLong(START_TIME_KEy2haha7KK, starttimeha27KK);
            editorhaha2haha7KK.putLong(ELAPSED_TIME_KEy2haha7KK, timeInMillisechaondshaha27KK);
            editorhaha2haha7KK.putBoolean("peopleha_key2haha7KK", peopleha3_27KK);

            editorhaha2haha7KK.putBoolean("flashingha_key2haha7KK", flashingha27KK);
            editorhaha2haha7KK.putBoolean("flashinghag_key2haha7KK", flashinghag27KK);
            editorhaha2haha7KK.putBoolean("isTimerRunningha27KK", isTimerRunningha27KK);
            editorhaha2haha7KK.putInt("currentHourha2haha7KK", currentHourha2haha7KK);
            editorhaha2haha7KK.putInt("currentMinuteha27KK", currentMinuteha27KK);


            editorhaha2haha7KK.putInt("blueThresholdha27KK", blueThresholdha27KK);
            editorhaha2haha7KK.putInt("yellowThresholdha27KK", yellowThresholdha27KK);
            editorhaha2haha7KK.putInt("redThresholdha27KK", redThresholdha27KK);
            editorhaha2haha7KK.apply();
        }

        synchronized (editorhaha2haha8KK) {
            editorhaha2haha8KK.putBoolean(TIMER_STARTED_KEy2haha8KK, handlerhaha1.hasCallbacks(updateTimerThreadha28KK));
            editorhaha2haha8KK.putLong(START_TIME_KEy2haha8KK, starttimeha28KK);
            editorhaha2haha8KK.putLong(ELAPSED_TIME_KEy2haha8KK, timeInMillisechaondshaha28KK);
            editorhaha2haha8KK.putBoolean("peopleha_key2haha8KK", peopleha3_28KK);

            editorhaha2haha8KK.putBoolean("flashingha_key2haha8KK", flashingha28KK);
            editorhaha2haha8KK.putBoolean("flashinghag_key2haha8KK", flashinghag28KK);
            editorhaha2haha8KK.putBoolean("isTimerRunningha28KK", isTimerRunningha28KK);
            editorhaha2haha8KK.putInt("currentHourha2haha8KK", currentHourha2haha8KK);
            editorhaha2haha8KK.putInt("currentMinuteha28KK", currentMinuteha28KK);


            editorhaha2haha8KK.putInt("blueThresholdha28KK", blueThresholdha28KK);
            editorhaha2haha8KK.putInt("yellowThresholdha28KK", yellowThresholdha28KK);
            editorhaha2haha8KK.putInt("redThresholdha28KK", redThresholdha28KK);
            editorhaha2haha8KK.apply();
        }
        synchronized (editorhaha66) {
            editorhaha66.putBoolean(TIMER_STARTED_KEYhaha66, handlerhaha1.hasCallbacks(updateTimerThreadha66));
            editorhaha66.putLong(START_TIME_KEYhaha66, startTimeha66);
            editorhaha66.putLong(ELAPSED_TIME_KEYhaha66, timeInMillisechaondshaha66);
            editorhaha66.putBoolean("peopleha_key66", peopleha3_66);

            editorhaha66.putBoolean("flashingha_key66", flashingha66);
            editorhaha66.putBoolean("flashinghag_key66", flashinghag66);
            editorhaha66.putBoolean("isTimerRunningha66", isTimerRunningha66);
            editorhaha66.putInt("currentHourha66", currentHourha66);
            editorhaha66.putInt("currentMinuteha66", currentMinuteha66);


            editorhaha66.putInt("blueThresholdha66", blueThresholdha66);
            editorhaha66.putInt("yellowThresholdha66", yellowThresholdha66);
            editorhaha66.putInt("redThresholdha66", redThresholdha66);
            editorhaha66.apply();
        }

        synchronized (editorhaha2haha6KK) {
            editorhaha2haha6KK.putBoolean(TIMER_STARTED_KEy2haha6KK, handlerhaha1.hasCallbacks(updateTimerThreadha26KK));
            editorhaha2haha6KK.putLong(START_TIME_KEy2haha6KK, starttimeha26KK);
            editorhaha2haha6KK.putLong(ELAPSED_TIME_KEy2haha6KK, timeInMillisechaondshaha26KK);
            editorhaha2haha6KK.putBoolean("peopleha_key2haha6KK", peopleha3_26KK);

            editorhaha2haha6KK.putBoolean("flashingha_key2haha6KK", flashingha26KK);
            editorhaha2haha6KK.putBoolean("flashinghag_key2haha6KK", flashinghag26KK);
            editorhaha2haha6KK.putBoolean("isTimerRunningha26KK", isTimerRunningha26KK);
            editorhaha2haha6KK.putInt("currentHourha2haha6KK", currentHourha2haha6KK);
            editorhaha2haha6KK.putInt("currentMinuteha26KK", currentMinuteha26KK);


            editorhaha2haha6KK.putInt("blueThresholdha26KK", blueThresholdha26KK);
            editorhaha2haha6KK.putInt("yellowThresholdha26KK", yellowThresholdha26KK);
            editorhaha2haha6KK.putInt("redThresholdha26KK", redThresholdha26KK);
            editorhaha2haha6KK.apply();
        }


    }

    @Override
    public void onResume() {
        super.onResume();

        synchronized (editorhaha1) {
            boolean timerStarted1 = sharedPreferenceshaha1.getBoolean(TIMER_STARTED_KEYhaha1, false);
            if (timerStarted1) {
                starttimeha1 = sharedPreferenceshaha1.getLong(START_TIME_KEYhaha1, 0);
                timeInMillisechaondshaha1 = sharedPreferenceshaha1.getLong(ELAPSED_TIME_KEYhaha1, 0);
                secha1 = (int) (timeInMillisechaondshaha1 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha1, 0);
            }
            peopleha3_1 = sharedPreferenceshaha1.getBoolean("peopleha_key1", false);
            flashingha1 = sharedPreferenceshaha1.getBoolean("flashingha_key1", false);
            flashinghag1 = sharedPreferenceshaha1.getBoolean("flashinghag_key1", false);
            isTimerRunningha1 = sharedPreferenceshaha1.getBoolean("isTimerRunningha1", false);
            currentHourha1 = sharedPreferenceshaha1.getInt("currentHourha1",currentHourha1);
            currentMinuteha1 = sharedPreferenceshaha1.getInt("currentMinuteha1",currentMinuteha1);

            // 恢复加時時間  測試用
            blueThresholdha1 = sharedPreferenceshaha1.getInt("blueThresholdha1", originalblueThresholdhaha2);
            yellowThresholdha1 = sharedPreferenceshaha1.getInt("yellowThresholdha1", originalyellowThresholdhaha2);
            redThresholdha1 = sharedPreferenceshaha1.getInt("redThresholdha1", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha1();
        }

        synchronized (editorhaha2haha) {
            boolean timerStarted2 = sharedPreferenceshaha2.getBoolean(TIMER_STARTED_KEy2haha, false);
            if (timerStarted2) {
                starttimeha2 = sharedPreferenceshaha2.getLong(START_TIME_KEy2haha, 0);
                timeInMillisechaondshaha2 = sharedPreferenceshaha2.getLong(ELAPSED_TIME_KEy2haha, 0);
                secha2 = (int) (timeInMillisechaondshaha2 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha2, 0);
            }
            peopleha3_2 = sharedPreferenceshaha2.getBoolean("peopleha_key2haha", false);
            flashingha2 = sharedPreferenceshaha2.getBoolean("flashingha_key2haha", false);
            flashinghag2 = sharedPreferenceshaha2.getBoolean("flashinghag_key2haha", false);
            isTimerRunningha2 = sharedPreferenceshaha2.getBoolean("isTimerRunningha2", false);
            currentHourha2haha = sharedPreferenceshaha2.getInt("currentHourha2haha", currentHourha2haha);
            currentMinuteha2 = sharedPreferenceshaha2.getInt("currentMinuteha2", currentMinuteha2);




            // 恢复加時時間
            blueThresholdha2 = sharedPreferenceshaha2.getInt("blueThresholdha2", originalblueThresholdhaha2);
            yellowThresholdha2 = sharedPreferenceshaha2.getInt("yellowThresholdha2", originalyellowThresholdhaha2);
            redThresholdha2 = sharedPreferenceshaha2.getInt("redThresholdha2", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha();
        }

        synchronized (editorhaha3haha) {
            boolean timerStarted3 = sharedPreferenceshaha3.getBoolean(TIMER_STARTED_KEy3haha, false);
            if (timerStarted3) {
                startTimeha3 = sharedPreferenceshaha3.getLong(START_TIME_KEy3haha, 0);
                timeInMillisechaondshaha3 = sharedPreferenceshaha3.getLong(ELAPSED_TIME_KEy3haha, 0);
                secha3 = (int) (timeInMillisechaondshaha3 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha3, 0);
            }
            peopleha3_3 = sharedPreferenceshaha3.getBoolean("peopleha_key3haha", false);
            flashingha3 = sharedPreferenceshaha3.getBoolean("flashingha_key3haha", false);
            flashinghag3 = sharedPreferenceshaha3.getBoolean("flashinghag_key3haha", false);
            isTimerRunningha3 = sharedPreferenceshaha3.getBoolean("isTimerRunningha3", false);
            currentHourha3haha = sharedPreferenceshaha3.getInt("currentHourha3haha", currentHourha3haha);
            currentMinuteha3 = sharedPreferenceshaha3.getInt("currentMinuteha3", currentMinuteha3);




            // 恢复加時時間
            blueThresholdha3 = sharedPreferenceshaha3.getInt("blueThresholdha3", originalblueThresholdhaha2);
            yellowThresholdha3 = sharedPreferenceshaha3.getInt("yellowThresholdha3", originalyellowThresholdhaha2);
            redThresholdha3 = sharedPreferenceshaha3.getInt("redThresholdha3", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha3haha();
        }

        synchronized (editorhaha4) {
            boolean timerStarted4 = sharedPreferenceshaha4.getBoolean(TIMER_STARTED_KEYhaha4, false);
            if (timerStarted4) {
                startTimeha4 = sharedPreferenceshaha4.getLong(START_TIME_KEYhaha4, 0);
                timeInMillisechaondshaha4 = sharedPreferenceshaha4.getLong(ELAPSED_TIME_KEYhaha4, 0);
                secha4 = (int) (timeInMillisechaondshaha4 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha4, 0);
            }
            peopleha3_4 = sharedPreferenceshaha4.getBoolean("peopleha_key4", false);
            flashingha4 = sharedPreferenceshaha4.getBoolean("flashingha_key4", false);
            flashinghag4 = sharedPreferenceshaha4.getBoolean("flashinghag_key4", false);
            isTimerRunningha4 = sharedPreferenceshaha4.getBoolean("isTimerRunningha4", false);
            currentHourha4 = sharedPreferenceshaha4.getInt("currentHourha4", currentHourha4);
            currentMinuteha4 = sharedPreferenceshaha4.getInt("currentMinuteha4", currentMinuteha4);



            // 恢复加時時間
            blueThresholdha4 = sharedPreferenceshaha4.getInt("blueThresholdha4", originalblueThresholdhaha2);
            yellowThresholdha4 = sharedPreferenceshaha4.getInt("yellowThresholdha4", originalyellowThresholdhaha2);
            redThresholdha4 = sharedPreferenceshaha4.getInt("redThresholdha4", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha4();
        }

        synchronized (editorhaha5) {
            boolean timerStarted5 = sharedPreferenceshaha5.getBoolean(TIMER_STARTED_KEYhaha5, false);
            if (timerStarted5) {
                startTimeha5 = sharedPreferenceshaha5.getLong(START_TIME_KEYhaha5, 0);
                timeInMillisechaondshaha5 = sharedPreferenceshaha5.getLong(ELAPSED_TIME_KEYhaha5, 0);
                secha5 = (int) (timeInMillisechaondshaha5 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha5, 0);
            }
            peopleha3_5 = sharedPreferenceshaha5.getBoolean("peopleha_key5", false);
            flashingha5 = sharedPreferenceshaha5.getBoolean("flashingha_key5", false);
            flashinghag5 = sharedPreferenceshaha5.getBoolean("flashinghag_key5", false);
            isTimerRunningha5 = sharedPreferenceshaha5.getBoolean("isTimerRunningha5", false);
            currentHourha5 = sharedPreferenceshaha5.getInt("currentHourha5", currentHourha5);
            currentMinuteha5 = sharedPreferenceshaha5.getInt("currentMinuteha5", currentMinuteha5);




            // 恢复加時時間
            blueThresholdha5 = sharedPreferenceshaha5.getInt("blueThresholdha5", originalblueThresholdhaha2);
            yellowThresholdha5 = sharedPreferenceshaha5.getInt("yellowThresholdha5", originalyellowThresholdhaha2);
            redThresholdha5 = sharedPreferenceshaha5.getInt("redThresholdha5", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha5();
        }



        synchronized (editorhaha7) {
            boolean timerStarted7 = sharedPreferenceshaha7.getBoolean(TIMER_STARTED_KEYhaha7, false);
            if (timerStarted7) {
                startTimeha7 = sharedPreferenceshaha7.getLong(START_TIME_KEYhaha7, 0);
                timeInMillisechaondshaha7 = sharedPreferenceshaha7.getLong(ELAPSED_TIME_KEYhaha7, 0);
                secha7 = (int) (timeInMillisechaondshaha7 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha7, 0);
            }
            peopleha3_7 = sharedPreferenceshaha7.getBoolean("peopleha_key7", false);
            flashingha7 = sharedPreferenceshaha7.getBoolean("flashingha_key7", false);
            flashinghag7 = sharedPreferenceshaha7.getBoolean("flashinghag_key7", false);
            isTimerRunningha7 = sharedPreferenceshaha7.getBoolean("isTimerRunningha7", false);
            currentHourha7 = sharedPreferenceshaha7.getInt("currentHourha7", currentHourha7);
            currentMinuteha7 = sharedPreferenceshaha7.getInt("currentMinuteha7", currentMinuteha7);




            // 恢复加時時間
            blueThresholdha7 = sharedPreferenceshaha7.getInt("blueThresholdha7", originalblueThresholdhaha2);
            yellowThresholdha7 = sharedPreferenceshaha7.getInt("yellowThresholdha7", originalyellowThresholdhaha2);
            redThresholdha7 = sharedPreferenceshaha7.getInt("redThresholdha7", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha7();
        }

        synchronized (editorhaha8) {
            boolean timerStarted8 = sharedPreferenceshaha8.getBoolean(TIMER_STARTED_KEYhaha8, false);
            if (timerStarted8) {
                startTimeha8 = sharedPreferenceshaha8.getLong(START_TIME_KEYhaha8, 0);
                timeInMillisechaondshaha8 = sharedPreferenceshaha8.getLong(ELAPSED_TIME_KEYhaha8, 0);
                secha8 = (int) (timeInMillisechaondshaha8 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha8, 0);
            }
            peopleha3_8 = sharedPreferenceshaha8.getBoolean("peopleha_key8", false);
            flashingha8 = sharedPreferenceshaha8.getBoolean("flashingha_key8", false);
            flashinghag8 = sharedPreferenceshaha8.getBoolean("flashinghag_key8", false);
            isTimerRunningha8 = sharedPreferenceshaha8.getBoolean("isTimerRunningha8", false);
            currentHourha8 = sharedPreferenceshaha8.getInt("currentHourha8", currentHourha8);
            currentMinuteha8 = sharedPreferenceshaha8.getInt("currentMinuteha8", currentMinuteha8);




            // 恢复加時時間
            blueThresholdha8 = sharedPreferenceshaha8.getInt("blueThresholdha8", originalblueThresholdhaha2);
            yellowThresholdha8 = sharedPreferenceshaha8.getInt("yellowThresholdha8", originalyellowThresholdhaha2);
            redThresholdha8 = sharedPreferenceshaha8.getInt("redThresholdha8", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha8();
        }

        synchronized (editorhaha9) {
            boolean timerStarted9 = sharedPreferenceshaha9.getBoolean(TIMER_STARTED_KEYhaha9, false);
            if (timerStarted9) {
                startTimeha9 = sharedPreferenceshaha9.getLong(START_TIME_KEYhaha9, 0);
                timeInMillisechaondshaha9 = sharedPreferenceshaha9.getLong(ELAPSED_TIME_KEYhaha9, 0);
                secha9 = (int) (timeInMillisechaondshaha9 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha9, 0);
            }
            peopleha3_9 = sharedPreferenceshaha9.getBoolean("peopleha_key9", false);
            flashingha9 = sharedPreferenceshaha9.getBoolean("flashingha_key9", false);
            flashinghag9 = sharedPreferenceshaha9.getBoolean("flashinghag_key9", false);
            isTimerRunningha9 = sharedPreferenceshaha9.getBoolean("isTimerRunningha9", false);
            currentHourha9 = sharedPreferenceshaha9.getInt("currentHourha9", currentHourha9);
            currentMinuteha9 = sharedPreferenceshaha9.getInt("currentMinuteha9", currentMinuteha9);




            // 恢复加時時間
            blueThresholdha9 = sharedPreferenceshaha9.getInt("blueThresholdha9", originalblueThresholdhaha2);
            yellowThresholdha9 = sharedPreferenceshaha9.getInt("yellowThresholdha9", originalyellowThresholdhaha2);
            redThresholdha9 = sharedPreferenceshaha9.getInt("redThresholdha9", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha9();
        }

        synchronized (editorhaha10) {
            boolean timerStarted10 = sharedPreferenceshaha10.getBoolean(TIMER_STARTED_KEYhaha10, false);
            if (timerStarted10) {
                starttimeha10 = sharedPreferenceshaha10.getLong(START_TIME_KEYhaha10, 0);
                timeInMillisechaondshaha10 = sharedPreferenceshaha10.getLong(ELAPSED_TIME_KEYhaha10, 0);
                secha10 = (int) (timeInMillisechaondshaha10 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha10, 0);
            }
            peopleha3_10 = sharedPreferenceshaha10.getBoolean("peopleha_key10", false);
            flashingha10 = sharedPreferenceshaha10.getBoolean("flashingha_key10", false);
            flashinghag10 = sharedPreferenceshaha10.getBoolean("flashinghag_key10", false);
            isTimerRunningha10 = sharedPreferenceshaha10.getBoolean("isTimerRunningha10", false);
            currentHourha10 = sharedPreferenceshaha10.getInt("currentHourha10", currentHourha10);
            currentMinuteha10 = sharedPreferenceshaha10.getInt("currentMinuteha10", currentMinuteha10);




            // 恢复加時時間
            blueThresholdha10 = sharedPreferenceshaha10.getInt("blueThresholdha10", originalblueThresholdhaha2);
            yellowThresholdha10 = sharedPreferenceshaha10.getInt("yellowThresholdha10", originalyellowThresholdhaha2);
            redThresholdha10 = sharedPreferenceshaha10.getInt("redThresholdha10", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha10();
        }

        synchronized (editorhaha11) {
            boolean timerStarted11 = sharedPreferenceshaha11.getBoolean(TIMER_STARTED_KEYhaha11, false);
            if (timerStarted11) {
                starttimeha11 = sharedPreferenceshaha11.getLong(START_TIME_KEYhaha11, 0);
                timeInMillisechaondshaha11 = sharedPreferenceshaha11.getLong(ELAPSED_TIME_KEYhaha11, 0);
                secha11 = (int) (timeInMillisechaondshaha11 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha11, 0);
            }
            peopleha3_11 = sharedPreferenceshaha11.getBoolean("peopleha_key11", false);
            flashingha11 = sharedPreferenceshaha11.getBoolean("flashingha_key11", false);
            flashinghag11 = sharedPreferenceshaha11.getBoolean("flashinghag_key11", false);
            isTimerRunningha11 = sharedPreferenceshaha11.getBoolean("isTimerRunningha11", false);
            currentHourha11 = sharedPreferenceshaha11.getInt("currentHourha11", currentHourha11);
            currentMinuteha11 = sharedPreferenceshaha11.getInt("currentMinuteha11", currentMinuteha11);




            // 恢复加時時間
            blueThresholdha11 = sharedPreferenceshaha11.getInt("blueThresholdha11", originalblueThresholdhaha2);
            yellowThresholdha11 = sharedPreferenceshaha11.getInt("yellowThresholdha11", originalyellowThresholdhaha2);
            redThresholdha11 = sharedPreferenceshaha11.getInt("redThresholdha11", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha11();
        }

        synchronized (editorhaha12) {
            boolean timerStarted12 = sharedPreferenceshaha12.getBoolean(TIMER_STARTED_KEYhaha12, false);
            if (timerStarted12) {
                starttimeha201 = sharedPreferenceshaha12.getLong(START_TIME_KEYhaha12, 0);
                timeInMillisechaondshaha201 = sharedPreferenceshaha12.getLong(ELAPSED_TIME_KEYhaha12, 0);
                secha201 = (int) (timeInMillisechaondshaha201 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha201, 0);
            }
            peopleha3_12 = sharedPreferenceshaha12.getBoolean("peopleha_key12", false);
            flashingha201 = sharedPreferenceshaha12.getBoolean("flashingha_key12", false);
            flashinghag201 = sharedPreferenceshaha12.getBoolean("flashinghag_key12", false);
            isTimerRunningha201 = sharedPreferenceshaha12.getBoolean("isTimerRunningha12", false);
            currentHourha12 = sharedPreferenceshaha12.getInt("currentHourha12", currentHourha12);
            currentMinuteha12 = sharedPreferenceshaha12.getInt("currentMinuteha12", currentMinuteha12);




            // 恢复加時時間
            blueThresholdha201 = sharedPreferenceshaha12.getInt("blueThresholdha12", originalblueThresholdhaha3);
            yellowThresholdha201 = sharedPreferenceshaha12.getInt("yellowThresholdha12", originalyellowThresholdhaha3);
            redThresholdha201 = sharedPreferenceshaha12.getInt("redThresholdha12", originalredThresholdhaha3);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha01();
        }

        synchronized (editorhaha13) {
            boolean timerStarted13 = sharedPreferenceshaha13.getBoolean(TIMER_STARTED_KEYhaha13, false);
            if (timerStarted13) {
                starttimeha202 = sharedPreferenceshaha13.getLong(START_TIME_KEYhaha13, 0);
                timeInMillisechaondshaha202 = sharedPreferenceshaha13.getLong(ELAPSED_TIME_KEYhaha13, 0);
                secha202 = (int) (timeInMillisechaondshaha202 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha202, 0);
            }
            peopleha3_13 = sharedPreferenceshaha13.getBoolean("peopleha_key13", false);
            flashingha202 = sharedPreferenceshaha13.getBoolean("flashingha_key13", false);
            flashinghag202 = sharedPreferenceshaha13.getBoolean("flashinghag_key13", false);
            isTimerRunningha202 = sharedPreferenceshaha13.getBoolean("isTimerRunningha13", false);
            currentHourha13 = sharedPreferenceshaha13.getInt("currentHourha13", currentHourha13);
            currentMinuteha13 = sharedPreferenceshaha13.getInt("currentMinuteha13", currentMinuteha13);




            // 恢复加時時間
            blueThresholdha202 = sharedPreferenceshaha13.getInt("blueThresholdha13", originalblueThresholdhaha3);
            yellowThresholdha202 = sharedPreferenceshaha13.getInt("yellowThresholdha13", originalyellowThresholdhaha3);
            redThresholdha202 = sharedPreferenceshaha13.getInt("redThresholdha13", originalredThresholdhaha3);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha02();
        }

        synchronized (editorhaha14) {
            boolean timerStarted14 = sharedPreferenceshaha14.getBoolean(TIMER_STARTED_KEYhaha14, false);
            if (timerStarted14) {
                starttimeha203 = sharedPreferenceshaha14.getLong(START_TIME_KEYhaha14, 0);
                timeInMillisechaondshaha203 = sharedPreferenceshaha14.getLong(ELAPSED_TIME_KEYhaha14, 0);
                secha203 = (int) (timeInMillisechaondshaha203 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha203, 0);
            }
            peopleha3_14 = sharedPreferenceshaha14.getBoolean("peopleha_key14", false);
            flashingha203 = sharedPreferenceshaha14.getBoolean("flashingha_key14", false);
            flashinghag203 = sharedPreferenceshaha14.getBoolean("flashinghag_key14", false);
            isTimerRunningha203 = sharedPreferenceshaha14.getBoolean("isTimerRunningha14", false);
            currentHourha14 = sharedPreferenceshaha14.getInt("currentHourha14", currentHourha14);
            currentMinuteha14 = sharedPreferenceshaha14.getInt("currentMinuteha14", currentMinuteha14);




            // 恢复加時時間
            blueThresholdha203 = sharedPreferenceshaha14.getInt("blueThresholdha14", originalblueThresholdhaha3);
            yellowThresholdha203 = sharedPreferenceshaha14.getInt("yellowThresholdha14", originalyellowThresholdhaha3);
            redThresholdha203 = sharedPreferenceshaha14.getInt("redThresholdha14", originalredThresholdhaha3);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha03();
        }

        synchronized (editorhaha15) {
            boolean timerStarted15 = sharedPreferenceshaha15.getBoolean(TIMER_STARTED_KEYhaha15, false);
            if (timerStarted15) {
                starttimeha204 = sharedPreferenceshaha15.getLong(START_TIME_KEYhaha15, 0);
                timeInMillisechaondshaha204 = sharedPreferenceshaha15.getLong(ELAPSED_TIME_KEYhaha15, 0);
                secha204 = (int) (timeInMillisechaondshaha204 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha204, 0);
            }
            peopleha3_15 = sharedPreferenceshaha15.getBoolean("peopleha_key15", false);
            flashingha204 = sharedPreferenceshaha15.getBoolean("flashingha_key15", false);
            flashinghag204 = sharedPreferenceshaha15.getBoolean("flashinghag_key15", false);
            isTimerRunningha204 = sharedPreferenceshaha15.getBoolean("isTimerRunningha15", false);
            currentHourha15 = sharedPreferenceshaha15.getInt("currentHourha15", currentHourha15);
            currentMinuteha15 = sharedPreferenceshaha15.getInt("currentMinuteha15", currentMinuteha15);





            // 恢复加時時間
            blueThresholdha204 = sharedPreferenceshaha15.getInt("blueThresholdha15", originalblueThresholdhaha3);
            yellowThresholdha204 = sharedPreferenceshaha15.getInt("yellowThresholdha15", originalyellowThresholdhaha3);
            redThresholdha204 = sharedPreferenceshaha15.getInt("redThresholdha15", originalredThresholdhaha3);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha04();
        }

        synchronized (editorhaha16) {
            boolean timerStarted16 = sharedPreferenceshaha16.getBoolean(TIMER_STARTED_KEYhaha16, false);
            if (timerStarted16) {
                starttimeha16 = sharedPreferenceshaha16.getLong(START_TIME_KEYhaha16, 0);
                timeInMillisechaondshaha16 = sharedPreferenceshaha16.getLong(ELAPSED_TIME_KEYhaha16, 0);
                secha16 = (int) (timeInMillisechaondshaha16 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha16, 0);
            }
            peopleha3_16 = sharedPreferenceshaha16.getBoolean("peopleha_key16", false);
            flashingha16 = sharedPreferenceshaha16.getBoolean("flashingha_key16", false);
            flashinghag16 = sharedPreferenceshaha16.getBoolean("flashinghag_key16", false);
            isTimerRunningha16 = sharedPreferenceshaha16.getBoolean("isTimerRunningha16", false);
            currentHourha16 = sharedPreferenceshaha16.getInt("currentHourha16", currentHourha16);
            currentMinuteha16 = sharedPreferenceshaha16.getInt("currentMinuteha16", currentMinuteha16);




            // 恢复加時時間
            blueThresholdha16 = sharedPreferenceshaha16.getInt("blueThresholdha16", originalblueThresholdhaha2);
            yellowThresholdha16 = sharedPreferenceshaha16.getInt("yellowThresholdha16", originalyellowThresholdhaha2);
            redThresholdha16 = sharedPreferenceshaha16.getInt("redThresholdha16", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha16();
        }

        synchronized (editorhaha17) {
            boolean timerStarted17 = sharedPreferenceshaha17.getBoolean(TIMER_STARTED_KEYhaha17, false);
            if (timerStarted17) {
                starttimeha17 = sharedPreferenceshaha17.getLong(START_TIME_KEYhaha17, 0);
                timeInMillisechaondshaha17 = sharedPreferenceshaha17.getLong(ELAPSED_TIME_KEYhaha17, 0);
                secha17 = (int) (timeInMillisechaondshaha17 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha17, 0);
            }
            peopleha3_17 = sharedPreferenceshaha17.getBoolean("peopleha_key17", false);
            flashingha17 = sharedPreferenceshaha17.getBoolean("flashingha_key17", false);
            flashinghag17 = sharedPreferenceshaha17.getBoolean("flashinghag_key17", false);
            isTimerRunningha17 = sharedPreferenceshaha17.getBoolean("isTimerRunningha17", false);
            currentHourha17 = sharedPreferenceshaha17.getInt("currentHourha17", currentHourha17);
            currentMinuteha17 = sharedPreferenceshaha17.getInt("currentMinuteha17", currentMinuteha17);




            // 恢复加時時間
            blueThresholdha17 = sharedPreferenceshaha17.getInt("blueThresholdha17", originalblueThresholdhaha2);
            yellowThresholdha17 = sharedPreferenceshaha17.getInt("yellowThresholdha17", originalyellowThresholdhaha2);
            redThresholdha17 = sharedPreferenceshaha17.getInt("redThresholdha17", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha17();
        }

        synchronized (editorhaha18) {
            boolean timerStarted18 = sharedPreferenceshaha18.getBoolean(TIMER_STARTED_KEYhaha18, false);
            if (timerStarted18) {
                starttimeha18 = sharedPreferenceshaha18.getLong(START_TIME_KEYhaha18, 0);
                timeInMillisechaondshaha18 = sharedPreferenceshaha18.getLong(ELAPSED_TIME_KEYhaha18, 0);
                secha18 = (int) (timeInMillisechaondshaha18 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha18, 0);
            }
            peopleha3_18 = sharedPreferenceshaha18.getBoolean("peopleha_key18", false);
            flashingha18 = sharedPreferenceshaha18.getBoolean("flashingha_key18", false);
            flashinghag18 = sharedPreferenceshaha18.getBoolean("flashinghag_key18", false);
            isTimerRunningha18 = sharedPreferenceshaha18.getBoolean("isTimerRunningha18", false);
            currentHourha18 = sharedPreferenceshaha18.getInt("currentHourha18", currentHourha18);
            currentMinuteha18 = sharedPreferenceshaha18.getInt("currentMinuteha18", currentMinuteha18);




            // 恢复加時時間
            blueThresholdha18 = sharedPreferenceshaha18.getInt("blueThresholdha18", originalblueThresholdhaha2);
            yellowThresholdha18 = sharedPreferenceshaha18.getInt("yellowThresholdha18", originalyellowThresholdhaha2);
            redThresholdha18 = sharedPreferenceshaha18.getInt("redThresholdha18", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha18();
        }

        synchronized (editorhaha19) {
            boolean timerStarted19 = sharedPreferenceshaha19.getBoolean(TIMER_STARTED_KEYhaha19, false);
            if (timerStarted19) {
                starttimeha19 = sharedPreferenceshaha19.getLong(START_TIME_KEYhaha19, 0);
                timeInMillisechaondshaha19 = sharedPreferenceshaha19.getLong(ELAPSED_TIME_KEYhaha19, 0);
                secha19 = (int) (timeInMillisechaondshaha19 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha19, 0);
            }
            peopleha3_19 = sharedPreferenceshaha19.getBoolean("peopleha_key19", false);
            flashingha19 = sharedPreferenceshaha19.getBoolean("flashingha_key19", false);
            flashinghag19 = sharedPreferenceshaha19.getBoolean("flashinghag_key19", false);
            isTimerRunningha19 = sharedPreferenceshaha19.getBoolean("isTimerRunningha19", false);
            currentHourha19 = sharedPreferenceshaha19.getInt("currentHourha19", currentHourha19);
            currentMinuteha19 = sharedPreferenceshaha19.getInt("currentMinuteha19", currentMinuteha19);




            // 恢复加時時間
            blueThresholdha19 = sharedPreferenceshaha19.getInt("blueThresholdha19", originalblueThresholdhaha2);
            yellowThresholdha19 = sharedPreferenceshaha19.getInt("yellowThresholdha19", originalyellowThresholdhaha2);
            redThresholdha19 = sharedPreferenceshaha19.getInt("redThresholdha19", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha19();
        }

        synchronized (editorhaha2haha0) {
            boolean timerStarted20 = sharedPreferenceshaha20.getBoolean(TIMER_STARTED_KEy2haha0, false);
            if (timerStarted20) {
                starttimeha20 = sharedPreferenceshaha20.getLong(START_TIME_KEy2haha0, 0);
                timeInMillisechaondshaha20 = sharedPreferenceshaha20.getLong(ELAPSED_TIME_KEy2haha0, 0);
                secha20 = (int) (timeInMillisechaondshaha20 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha20, 0);
            }
            peopleha3_20 = sharedPreferenceshaha20.getBoolean("peopleha_key2haha0", false);
            flashingha20 = sharedPreferenceshaha20.getBoolean("flashingha_key2haha0", false);
            flashinghag20 = sharedPreferenceshaha20.getBoolean("flashinghag_key2haha0", false);
            isTimerRunningha20 = sharedPreferenceshaha20.getBoolean("isTimerRunningha20", false);
            currentHourha2haha0 = sharedPreferenceshaha20.getInt("currentHourha2haha0", currentHourha2haha0);
            currentMinuteha20 = sharedPreferenceshaha20.getInt("currentMinuteha20", currentMinuteha20);
            currentHourha2haha0 = sharedPreferenceshaha20.getInt("currentHourha2haha0", currentHourha2haha0);
            currentMinuteha20 = sharedPreferenceshaha20.getInt("currentMinuteha20", currentMinuteha20);




            // 恢复加時時間
            blueThresholdha20 = sharedPreferenceshaha20.getInt("blueThresholdha20", originalblueThresholdhaha2);
            yellowThresholdha20 = sharedPreferenceshaha20.getInt("yellowThresholdha20", originalyellowThresholdhaha2);
            redThresholdha20 = sharedPreferenceshaha20.getInt("redThresholdha20", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha0();
        }

        synchronized (editorhaha2haha1) {
            boolean timerStarted21 = sharedPreferenceshaha21.getBoolean(TIMER_STARTED_KEy2haha1, false);
            if (timerStarted21) {
                starttimeha21 = sharedPreferenceshaha21.getLong(START_TIME_KEy2haha1, 0);
                timeInMillisechaondshaha21 = sharedPreferenceshaha21.getLong(ELAPSED_TIME_KEy2haha1, 0);
                secha21 = (int) (timeInMillisechaondshaha21 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha21, 0);
            }
            peopleha3_21 = sharedPreferenceshaha21.getBoolean("peopleha_key2haha1", false);
            flashingha21 = sharedPreferenceshaha21.getBoolean("flashingha_key2haha1", false);
            flashinghag21 = sharedPreferenceshaha21.getBoolean("flashinghag_key2haha1", false);
            isTimerRunningha21 = sharedPreferenceshaha21.getBoolean("isTimerRunningha21", false);
            currentHourha2haha1 = sharedPreferenceshaha21.getInt("currentHourha2haha1", currentHourha2haha1);
            currentMinuteha21 = sharedPreferenceshaha21.getInt("currentMinuteha21", currentMinuteha21);




            // 恢复加時時間
            blueThresholdha21 = sharedPreferenceshaha21.getInt("blueThresholdha21", originalblueThresholdhaha2);
            yellowThresholdha21 = sharedPreferenceshaha21.getInt("yellowThresholdha21", originalyellowThresholdhaha2);
            redThresholdha21 = sharedPreferenceshaha21.getInt("redThresholdha21", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha1();
        }

        synchronized (editorhaha2haha2) {
            boolean timerStarted22 = sharedPreferenceshaha22.getBoolean(TIMER_STARTED_KEy2haha2, false);
            if (timerStarted22) {
                starttimeha22 = sharedPreferenceshaha22.getLong(START_TIME_KEy2haha2, 0);
                timeInMillisechaondshaha22 = sharedPreferenceshaha22.getLong(ELAPSED_TIME_KEy2haha2, 0);
                secha22 = (int) (timeInMillisechaondshaha22 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha22, 0);
            }
            peopleha3_22 = sharedPreferenceshaha22.getBoolean("peopleha_key2haha2", false);
            flashingha22 = sharedPreferenceshaha22.getBoolean("flashingha_key2haha2", false);
            flashinghag22 = sharedPreferenceshaha22.getBoolean("flashinghag_key2haha2", false);
            isTimerRunningha22 = sharedPreferenceshaha22.getBoolean("isTimerRunningha22", false);
            currentHourha2haha2 = sharedPreferenceshaha22.getInt("currentHourha2haha2", currentHourha2haha2);
            currentMinuteha22 = sharedPreferenceshaha22.getInt("currentMinuteha22", currentMinuteha22);




            // 恢复加時時間
            blueThresholdha22 = sharedPreferenceshaha22.getInt("blueThresholdha22", originalblueThresholdhaha2);
            yellowThresholdha22 = sharedPreferenceshaha22.getInt("yellowThresholdha22", originalyellowThresholdhaha2);
            redThresholdha22 = sharedPreferenceshaha22.getInt("redThresholdha22", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha2();
        }

        synchronized (editorhaha2haha3) {
            boolean timerStarted23 = sharedPreferenceshaha23.getBoolean(TIMER_STARTED_KEy2haha3, false);
            if (timerStarted23) {
                starttimeha23 = sharedPreferenceshaha23.getLong(START_TIME_KEy2haha3, 0);
                timeInMillisechaondshaha23 = sharedPreferenceshaha23.getLong(ELAPSED_TIME_KEy2haha3, 0);
                secha23 = (int) (timeInMillisechaondshaha23 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha23, 0);
            }
            peopleha3_23 = sharedPreferenceshaha23.getBoolean("peopleha_key2haha3", false);
            flashingha23 = sharedPreferenceshaha23.getBoolean("flashingha_key2haha3", false);
            flashinghag23 = sharedPreferenceshaha23.getBoolean("flashinghag_key2haha3", false);
            isTimerRunningha23 = sharedPreferenceshaha23.getBoolean("isTimerRunningha23", false);
            currentHourha2haha3 = sharedPreferenceshaha23.getInt("currentHourha2haha3", currentHourha2haha3);
            currentMinuteha23 = sharedPreferenceshaha23.getInt("currentMinuteha23", currentMinuteha23);




            // 恢复加時時間
            blueThresholdha23 = sharedPreferenceshaha23.getInt("blueThresholdha23", originalblueThresholdhaha2);
            yellowThresholdha23 = sharedPreferenceshaha23.getInt("yellowThresholdha23", originalyellowThresholdhaha2);
            redThresholdha23 = sharedPreferenceshaha23.getInt("redThresholdha23", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha3();
        }

        synchronized (editorhaha2haha4) {
            boolean timerStarted24 = sharedPreferenceshaha24.getBoolean(TIMER_STARTED_KEy2haha4, false);
            if (timerStarted24) {
                starttimeha24 = sharedPreferenceshaha24.getLong(START_TIME_KEy2haha4, 0);
                timeInMillisechaondshaha24 = sharedPreferenceshaha24.getLong(ELAPSED_TIME_KEy2haha4, 0);
                secha24 = (int) (timeInMillisechaondshaha24 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha24, 0);
            }
            peopleha3_24 = sharedPreferenceshaha24.getBoolean("peopleha_key2haha4", false);
            flashingha24 = sharedPreferenceshaha24.getBoolean("flashingha_key2haha4", false);
            flashinghag24 = sharedPreferenceshaha24.getBoolean("flashinghag_key2haha4", false);
            isTimerRunningha24 = sharedPreferenceshaha24.getBoolean("isTimerRunningha24", false);
            currentHourha2haha4 = sharedPreferenceshaha24.getInt("currentHourha2haha4", currentHourha2haha4);
            currentMinuteha24 = sharedPreferenceshaha24.getInt("currentMinuteha24", currentMinuteha24);




            // 恢复加時時間
            blueThresholdha24 = sharedPreferenceshaha24.getInt("blueThresholdha24", originalblueThresholdhaha2);
            yellowThresholdha24 = sharedPreferenceshaha24.getInt("yellowThresholdha24", originalyellowThresholdhaha2);
            redThresholdha24 = sharedPreferenceshaha24.getInt("redThresholdha24", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha4();
        }

        synchronized (editorhaha2haha5) {
            boolean timerStarted25 = sharedPreferenceshaha25.getBoolean(TIMER_STARTED_KEy2haha5, false);
            if (timerStarted25) {
                starttimeha25 = sharedPreferenceshaha25.getLong(START_TIME_KEy2haha5, 0);
                timeInMillisechaondshaha25 = sharedPreferenceshaha25.getLong(ELAPSED_TIME_KEy2haha5, 0);
                secha25 = (int) (timeInMillisechaondshaha25 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha25, 0);
            }
            peopleha3_25 = sharedPreferenceshaha25.getBoolean("peopleha_key2haha5", false);
            flashingha25 = sharedPreferenceshaha25.getBoolean("flashingha_key2haha5", false);
            flashinghag25 = sharedPreferenceshaha25.getBoolean("flashinghag_key2haha5", false);
            isTimerRunningha25 = sharedPreferenceshaha25.getBoolean("isTimerRunningha25", false);
            currentHourha2haha5 = sharedPreferenceshaha25.getInt("currentHourha2haha5", currentHourha2haha5);
            currentMinuteha25 = sharedPreferenceshaha25.getInt("currentMinuteha25", currentMinuteha25);


            // 恢复加時時間
            blueThresholdha25 = sharedPreferenceshaha25.getInt("blueThresholdha25", originalblueThresholdhaha2);
            yellowThresholdha25 = sharedPreferenceshaha25.getInt("yellowThresholdha25", originalyellowThresholdhaha2);
            redThresholdha25 = sharedPreferenceshaha25.getInt("redThresholdha25", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha5();
        }

        synchronized (editorhaha2haha7KK) {
            boolean timerStarted27KK = sharedPreferenceshaha27KK.getBoolean(TIMER_STARTED_KEy2haha7KK, false);
            if (timerStarted27KK) {
                starttimeha27KK = sharedPreferenceshaha27KK.getLong(START_TIME_KEy2haha7KK, 0);
                timeInMillisechaondshaha27KK = sharedPreferenceshaha27KK.getLong(ELAPSED_TIME_KEy2haha7KK, 0);
                secha27KK = (int) (timeInMillisechaondshaha27KK / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha27KK, 0);
            }
            peopleha3_27KK = sharedPreferenceshaha27KK.getBoolean("peopleha_key2haha7KK", false);
            flashingha27KK = sharedPreferenceshaha27KK.getBoolean("flashingha_key2haha7KK", false);
            flashinghag27KK = sharedPreferenceshaha27KK.getBoolean("flashinghag_key2haha7KK", false);
            isTimerRunningha27KK = sharedPreferenceshaha27KK.getBoolean("isTimerRunningha27KK", false);
            currentHourha2haha7KK = sharedPreferenceshaha27KK.getInt("currentHourha2haha7KK", currentHourha2haha7KK);
            currentMinuteha27KK = sharedPreferenceshaha27KK.getInt("currentMinuteha27KK", currentMinuteha27KK);


            // 恢复加時時間
            blueThresholdha27KK = sharedPreferenceshaha27KK.getInt("blueThresholdha27KK", originalblueThresholdhaha2);
            yellowThresholdha27KK = sharedPreferenceshaha27KK.getInt("yellowThresholdha27KK", originalyellowThresholdhaha2);
            redThresholdha27KK = sharedPreferenceshaha27KK.getInt("redThresholdha27KK", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha7KK();
        }

        synchronized (editorhaha2haha8KK) {
            boolean timerStarted28KK = sharedPreferenceshaha28KK.getBoolean(TIMER_STARTED_KEy2haha8KK, false);
            if (timerStarted28KK) {
                starttimeha28KK = sharedPreferenceshaha28KK.getLong(START_TIME_KEy2haha8KK, 0);
                timeInMillisechaondshaha28KK = sharedPreferenceshaha28KK.getLong(ELAPSED_TIME_KEy2haha8KK, 0);
                secha28KK = (int) (timeInMillisechaondshaha28KK / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha28KK, 0);
            }
            peopleha3_28KK = sharedPreferenceshaha28KK.getBoolean("peopleha_key2haha8KK", false);
            flashingha28KK = sharedPreferenceshaha28KK.getBoolean("flashingha_key2haha8KK", false);
            flashinghag28KK = sharedPreferenceshaha28KK.getBoolean("flashinghag_key2haha8KK", false);
            isTimerRunningha28KK = sharedPreferenceshaha28KK.getBoolean("isTimerRunningha28KK", false);
            currentHourha2haha8KK = sharedPreferenceshaha28KK.getInt("currentHourha2haha8KK", currentHourha2haha8KK);
            currentMinuteha28KK = sharedPreferenceshaha28KK.getInt("currentMinuteha28KK", currentMinuteha28KK);


            // 恢复加時時間
            blueThresholdha28KK = sharedPreferenceshaha28KK.getInt("blueThresholdha28KK", originalblueThresholdhaha2);
            yellowThresholdha28KK = sharedPreferenceshaha28KK.getInt("yellowThresholdha28KK", originalyellowThresholdhaha2);
            redThresholdha28KK = sharedPreferenceshaha28KK.getInt("redThresholdha28KK", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha8KK();
        }
        synchronized (editorhaha66) {
            boolean timerStarted66 = sharedPreferenceshaha66.getBoolean(TIMER_STARTED_KEYhaha66, false);
            if (timerStarted66) {
                startTimeha66 = sharedPreferenceshaha66.getLong(START_TIME_KEYhaha66, 0);
                timeInMillisechaondshaha66 = sharedPreferenceshaha66.getLong(ELAPSED_TIME_KEYhaha66, 0);
                secha66 = (int) (timeInMillisechaondshaha66 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha66, 0);
            }
            peopleha3_66 = sharedPreferenceshaha66.getBoolean("peopleha_key66", false);
            flashingha66 = sharedPreferenceshaha66.getBoolean("flashingha_key66", false);
            flashinghag66 = sharedPreferenceshaha66.getBoolean("flashinghag_key66", false);
            isTimerRunningha66 = sharedPreferenceshaha66.getBoolean("isTimerRunningha66", false);
            currentHourha66 = sharedPreferenceshaha66.getInt("currentHourha66", currentHourha66);
            currentMinuteha66 = sharedPreferenceshaha66.getInt("currentMinuteha66", currentMinuteha66);




            // 恢复加時時間
            blueThresholdha66 = sharedPreferenceshaha66.getInt("blueThresholdha66", originalblueThresholdhaha2);
            yellowThresholdha66 = sharedPreferenceshaha66.getInt("yellowThresholdha66", originalyellowThresholdhaha2);
            redThresholdha66 = sharedPreferenceshaha66.getInt("redThresholdha66", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha66();

        }

        synchronized (editorhaha2haha6KK) {
            boolean timerStarted26KK = sharedPreferenceshaha26KK.getBoolean(TIMER_STARTED_KEy2haha6KK, false);
            if (timerStarted26KK) {
                starttimeha26KK = sharedPreferenceshaha26KK.getLong(START_TIME_KEy2haha6KK, 0);
                timeInMillisechaondshaha26KK = sharedPreferenceshaha26KK.getLong(ELAPSED_TIME_KEy2haha6KK, 0);
                secha26KK = (int) (timeInMillisechaondshaha26KK / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha26KK, 0);
            }
            peopleha3_26KK = sharedPreferenceshaha26KK.getBoolean("peopleha_key2haha6KK", false);
            flashingha26KK = sharedPreferenceshaha26KK.getBoolean("flashingha_key2haha6KK", false);
            flashinghag26KK = sharedPreferenceshaha26KK.getBoolean("flashinghag_key2haha6KK", false);
            isTimerRunningha26KK = sharedPreferenceshaha26KK.getBoolean("isTimerRunningha26KK", false);
            currentHourha2haha6KK = sharedPreferenceshaha26KK.getInt("currentHourha2haha6KK", currentHourha2haha6KK);
            currentMinuteha26KK = sharedPreferenceshaha26KK.getInt("currentMinuteha26KK", currentMinuteha26KK);




            // 恢复加時時間
            blueThresholdha26KK = sharedPreferenceshaha26KK.getInt("blueThresholdha26KK", originalblueThresholdhaha2);
            yellowThresholdha26KK = sharedPreferenceshaha26KK.getInt("yellowThresholdha26KK", originalyellowThresholdhaha2);
            redThresholdha26KK = sharedPreferenceshaha26KK.getInt("redThresholdha26KK", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha6KK();
        }

    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void stopTimer1() {
        handlerhaha1.removeCallbacks(updateTimerThreadha1);
    }
    private void stopTimer2haha() {
        handlerhaha1.removeCallbacks(updateTimerThreadha2);
    }
    private void stopTimer3haha() {
        handlerhaha1.removeCallbacks(updateTimerThreadha3);
    }
    private void stopTimer4() {
        handlerhaha1.removeCallbacks(updateTimerThreadha4);
    }
    private void stopTimer5() {
        handlerhaha1.removeCallbacks(updateTimerThreadha5);
    }

    private void stopTimer7() {
        handlerhaha1.removeCallbacks(updateTimerThreadha7);
    }
    private void stopTimer8() {
        handlerhaha1.removeCallbacks(updateTimerThreadha8);
    }
    private void stopTimer9() {
        handlerhaha1.removeCallbacks(updateTimerThreadha9);
    }
    private void stopTimer10() {
        handlerhaha1.removeCallbacks(updateTimerThreadha10);
    }
    private void stopTimer11() {
        handlerhaha1.removeCallbacks(updateTimerThreadha11);
    }
    private void stopTimer16() {
        handlerhaha1.removeCallbacks(updateTimerThreadha16);
    }
    private void stopTimer17() {
        handlerhaha1.removeCallbacks(updateTimerThreadha17);
    }
    private void stopTimer18() {
        handlerhaha1.removeCallbacks(updateTimerThreadha18);
    }
    private void stopTimer19() {
        handlerhaha1.removeCallbacks(updateTimerThreadha19);
    }
    private void stopTimer2haha0() {
        handlerhaha1.removeCallbacks(updateTimerThreadha20);
    }
    private void stopTimer2haha1() {
        handlerhaha1.removeCallbacks(updateTimerThreadha21);
    }
    private void stopTimer2haha2() {
        handlerhaha1.removeCallbacks(updateTimerThreadha22);
    }
    private void stopTimer2haha3() {
        handlerhaha1.removeCallbacks(updateTimerThreadha23);
    }
    private void stopTimer2haha4() {
        handlerhaha1.removeCallbacks(updateTimerThreadha24);
    }
    private void stopTimer2haha5() {
        handlerhaha1.removeCallbacks(updateTimerThreadha25);
    }
    /*private void stopTimer2haha6() {
        handlerhaha1.removeCallbacks(updateTimerThreadha266);
    }*/
    private void stopTimer2haha7KK() {
        handlerhaha1.removeCallbacks(updateTimerThreadha27KK);
    }
    private void stopTimer2haha8KK() {
        handlerhaha1.removeCallbacks(updateTimerThreadha28KK);
    }
    private void stopTimer2haha01() {
        handlerhaha1.removeCallbacks(updateTimerThreadha201);
    }
    private void stopTimer2haha02() {
        handlerhaha1.removeCallbacks(updateTimerThreadha202);
    }
    private void stopTimer2haha03() {
        handlerhaha1.removeCallbacks(updateTimerThreadha203);
    }
    private void stopTimer2haha04() {
        handlerhaha1.removeCallbacks(updateTimerThreadha204);
    }
    private void stopTimer66() {
        handlerhaha1.removeCallbacks(updateTimerThreadha66);
    }

    private void stopTimer2haha6KK() {
        handlerhaha1.removeCallbacks(updateTimerThreadha26KK);
    }

    private void resetsechaondsha1() {
        sechaondsha1 = 0;
        secha1 = 0;
        minutesha1 = 0;
        hoursha1 = 0;
        String timeString = String.format("%02d:%02d", hoursha1, minutesha1);
        btnTimerha1.setText(timeString);
    }
    private void resetsechaondsha2() {
        sechaondsha2 = 0;
        secha2 = 0;
        minutesha2 = 0;
        hoursha2 = 0;
        String timeString = String.format("%02d:%02d", hoursha2, minutesha2);
        btnTimerha2haha.setText(timeString);
    }

    private void resetsechaondsha3() {
        sechaondsha3 = 0;
        secha3 = 0;
        minutesha3 = 0;
        hoursha3 = 0;
        String timeString = String.format("%02d:%02d", hoursha3, minutesha3);
        btnTimerha3haha.setText(timeString);
    }

    private void resetsechaondsha4() {
        sechaondsha4 = 0;
        secha4 = 0;
        minutesha4 = 0;
        hoursha4 = 0;
        String timeString = String.format("%02d:%02d", hoursha4, minutesha4);
        btnTimerha4.setText(timeString);
    }
    private void resetsechaondsha5() {
        sechaondsha5 = 0;
        secha5 = 0;
        minutesha5 = 0;
        hoursha5 = 0;
        String timeString = String.format("%02d:%02d", hoursha5, minutesha5);
        btnTimerha5.setText(timeString);
    }

    private void resetsechaondsha6() {
        sechaondsha6 = 0;
        secha6 = 0;
        minutesha6 = 0;
        hoursha6 = 0;
        String timeString = String.format("%02d:%02d", hoursha6, minutesha6);
        btnTimerha6.setText(timeString);
    }

    private void resetsechaondsha7() {
        sechaondsha7 = 0;
        secha7 = 0;
        minutesha7 = 0;
        hoursha7 = 0;
        String timeString = String.format("%02d:%02d", hoursha7, minutesha7);
        btnTimerha7.setText(timeString);
    }

    private void resetsechaondsha8() {
        sechaondsha8 = 0;
        secha8 = 0;
        minutesha8 = 0;
        hoursha8 = 0;
        String timeString = String.format("%02d:%02d", hoursha8, minutesha8);
        btnTimerha8.setText(timeString);
    }

    private void resetsechaondsha9() {
        sechaondsha9 = 0;
        secha9 = 0;
        minutesha9 = 0;
        hoursha9 = 0;
        String timeString = String.format("%02d:%02d", hoursha9, minutesha9);
        btnTimerha9.setText(timeString);
    }

    private void resetsechaondsha10() {
        sechaondsha10 = 0;
        secha10 = 0;
        minutesha10 = 0;
        hoursha10 = 0;
        String timeString = String.format("%02d:%02d", hoursha10, minutesha10);
        btnTimerha10.setText(timeString);
    }

    private void resetsechaondsha11() {
        sechaondsha11 = 0;
        secha11 = 0;
        minutesha11 = 0;
        hoursha11 = 0;
        String timeString = String.format("%02d:%02d", hoursha11, minutesha11);
        btnTimerha11.setText(timeString);
    }

    private void resetsechaondsha16() {
        sechaondsha16 = 0;
        secha16 = 0;
        minutesha16 = 0;
        hoursha16 = 0;
        String timeString = String.format("%02d:%02d", hoursha16, minutesha16);
        btnTimerha16.setText(timeString);
    }

    private void resetsechaondsha17() {
        sechaondsha17 = 0;
        secha17 = 0;
        minutesha17 = 0;
        hoursha17 = 0;
        String timeString = String.format("%02d:%02d", hoursha17, minutesha17);
        btnTimerha17.setText(timeString);
    }

    private void resetsechaondsha18() {
        sechaondsha18 = 0;
        secha18 = 0;
        minutesha18 = 0;
        hoursha18 = 0;
        String timeString = String.format("%02d:%02d", hoursha18, minutesha18);
        btnTimerha18.setText(timeString);
    }

    private void resetsechaondsha19() {
        sechaondsha19 = 0;
        secha19 = 0;
        minutesha19 = 0;
        hoursha19 = 0;
        String timeString = String.format("%02d:%02d", hoursha19, minutesha19);
        btnTimerha19.setText(timeString);
    }

    private void resetsechaondsha20() {
        sechaondsha20 = 0;
        secha20 = 0;
        minutesha20 = 0;
        hoursha20 = 0;
        String timeString = String.format("%02d:%02d", hoursha20, minutesha20);
        btnTimerha2haha0.setText(timeString);
    }

    private void resetsechaondsha21() {
        sechaondsha21 = 0;
        secha21 = 0;
        minutesha21 = 0;
        hoursha21 = 0;
        String timeString = String.format("%02d:%02d", hoursha21, minutesha21);
        btnTimerha2haha1.setText(timeString);
    }

    private void resetsechaondsha22() {
        sechaondsha22 = 0;
        secha22 = 0;
        minutesha22 = 0;
        hoursha22 = 0;
        String timeString = String.format("%02d:%02d", hoursha22, minutesha22);
        btnTimerha2haha2.setText(timeString);
    }

    private void resetsechaondsha23() {
        sechaondsha23 = 0;
        secha23 = 0;
        minutesha23 = 0;
        hoursha23 = 0;
        String timeString = String.format("%02d:%02d", hoursha23, minutesha23);
        btnTimerha2haha3.setText(timeString);
    }

    private void resetsechaondsha24() {
        sechaondsha24 = 0;
        secha24 = 0;
        minutesha24 = 0;
        hoursha24 = 0;
        String timeString = String.format("%02d:%02d", hoursha24, minutesha24);
        btnTimerha2haha4.setText(timeString);
    }

    private void resetsechaondsha25() {
        sechaondsha25 = 0;
        secha25 = 0;
        minutesha25 = 0;
        hoursha25 = 0;
        String timeString = String.format("%02d:%02d", hoursha25, minutesha25);
        btnTimerha2haha5.setText(timeString);
    }
/*
    private void resetsechaondsha266() {
        sechaondsha266 = 0;
        secha266 = 0;
        minutesha266 = 0;
        hoursha266 = 0;
        String timeString = String.format("%02d:%02d", hoursha266, minutesha266);
        btnTimerha2haha6.setText(timeString);
    }
*/
    private void resetsechaondsha27KK() {
        sechaondsha27KK = 0;
        secha27KK = 0;
        minutesha27KK = 0;
        hoursha27KK = 0;
        String timeString = String.format("%02d:%02d",  hoursha27KK, minutesha27KK);
        btnTimerha2haha7KK.setText(timeString);
    }

    private void resetsechaondsha28KK() {
        sechaondsha28KK = 0;
        secha28KK = 0;
        minutesha28KK = 0;
        hoursha28KK = 0;
        String timeString = String.format("%02d:%02d",  hoursha28KK, minutesha28KK);
        btnTimerha2haha8KK.setText(timeString);
    }
    private void resetsechaondsha66() {
        sechaondsha66 = 0;
        secha66 = 0;
        minutesha66 = 0;
        hoursha66 = 0;
        String timeString = String.format("%02d:%02d",  hoursha66, minutesha66);
        btnTimerha66.setText(timeString);
    }

    private void resetsechaondsha201() {
        sechaondsha201 = 0;
        secha201 = 0;
        minutesha201 = 0;
        hoursha201 = 0;
        String timeString = String.format("%02d:%02d", hoursha201, minutesha201);
        btnTimerha2haha01.setText(timeString);
    }

    private void resetsechaondsha202() {
        sechaondsha202 = 0;
        secha202 = 0;
        minutesha202 = 0;
        hoursha202 = 0;
        String timeString = String.format("%02d:%02d", hoursha202, minutesha202);
        btnTimerha2haha02.setText(timeString);
    }

    private void resetsechaondsha203() {
        sechaondsha203 = 0;
        secha203 = 0;
        minutesha203 = 0;
        hoursha203 = 0;
        String timeString = String.format("%02d:%02d", hoursha203, minutesha203);
        btnTimerha2haha03.setText(timeString);
    }

    private void resetsechaondsha204() {
        sechaondsha204 = 0;
        secha204 = 0;
        minutesha204 = 0;
        hoursha204 = 0;
        String timeString = String.format("%02d:%02d", hoursha204, minutesha204);
        btnTimerha2haha04.setText(timeString);
    }

    private void resetsechaondsha26KK() {
        sechaondsha26KK = 0;
        secha26KK = 0;
        minutesha26KK = 0;
        hoursha26KK = 0;
        String timeString = String.format("%02d:%02d", hoursha26KK, minutesha26KK);
        btnTimerha2haha6KK.setText(timeString);
    }




    private void resetButtonColor1() {
        btnTimerha1.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor2haha() {
        btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor3haha() {
        btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor4() {
        btnTimerha4.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor5() {
        btnTimerha5.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor6() {
        btnTimerha6.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor7() {
        btnTimerha7.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor8() {
        btnTimerha8.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor9() {
        btnTimerha9.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor10() {
        btnTimerha10.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor11() {
        btnTimerha11.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor16() {
        btnTimerha16.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor17() {
        btnTimerha17.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor18() {
        btnTimerha18.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor19() {
        btnTimerha19.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha0() {
        btnTimerha2haha0.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha1() {
        btnTimerha2haha1.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha2() {
        btnTimerha2haha2.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha3() {
        btnTimerha2haha3.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha4() {
        btnTimerha2haha4.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha5() {
        btnTimerha2haha5.setBackgroundColor(getResources().getColor(R.color.white));
    }
/*
    private void resetButtonColor2haha6() {
        btnTimerha2haha6.setBackgroundColor(getResources().getColor(R.color.white));
    }*/

    private void resetButtonColor2haha7KK() {
        btnTimerha2haha7KK.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha8KK() {
        btnTimerha2haha8KK.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor66() {
        btnTimerha66.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha01() {
        btnTimerha2haha01.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha02() {
        btnTimerha2haha02.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha03() {
        btnTimerha2haha03.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha04() {
        btnTimerha2haha04.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha6KK() {
        btnTimerha2haha6KK.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void showConfirmationDialogYNForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer1();
                resetThresholdsToOriginal1();
                resetsechaondsha1();
                resetButtonColor1();
                btnTimerha1.clearAnimation();
                flashingha1 = false;
                flashinghag1 = false;
                isTimerRunningha1 = false;
                dialog.dismiss();

            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha();
                resetThresholdsToOriginal2();
                resetsechaondsha2();
                resetButtonColor2haha();
                btnTimerha2haha.clearAnimation();
                flashingha2 = false;flashinghag2 = false;
                isTimerRunningha2 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer3haha();
                resetThresholdsToOriginal3();
                resetsechaondsha3();
                resetButtonColor3haha();
                btnTimerha3haha.clearAnimation();
                flashingha3 = false;flashinghag3 = false;
                isTimerRunningha3 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer4();
                resetThresholdsToOriginal4();
                resetsechaondsha4();
                resetButtonColor4();
                btnTimerha4.clearAnimation();
                flashingha4 = false;flashinghag4 = false;
                isTimerRunningha4 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer5();
                resetThresholdsToOriginal5();
                resetsechaondsha5();
                resetButtonColor5();
                btnTimerha5.clearAnimation();
                flashingha5 = false;flashinghag5 = false;
                isTimerRunningha5 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


    private void showConfirmationDialogYNForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer7();
                resetThresholdsToOriginal7();
                resetsechaondsha7();
                resetButtonColor7();
                btnTimerha7.clearAnimation();
                flashingha7 = false;flashinghag7 = false;
                isTimerRunningha7 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer8();
                resetThresholdsToOriginal8();
                resetsechaondsha8();
                resetButtonColor8();
                btnTimerha8.clearAnimation();
                flashingha8 = false;flashinghag8 = false;
                isTimerRunningha8 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer9();
                resetThresholdsToOriginal9();
                resetsechaondsha9();
                resetButtonColor9();
                btnTimerha9.clearAnimation();
                flashingha9 = false;flashinghag9 = false;
                isTimerRunningha9 = false;



                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer10();
                resetThresholdsToOriginal10();
                resetsechaondsha10();
                resetButtonColor10();
                btnTimerha10.clearAnimation();
                flashingha10 = false;flashinghag10 = false;
                isTimerRunningha10 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer11();
                resetThresholdsToOriginal11();
                resetsechaondsha11();
                resetButtonColor11();
                btnTimerha11.clearAnimation();
                flashingha11 = false;flashinghag11 = false;
                isTimerRunningha11 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton16() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer16();
                resetThresholdsToOriginal16();
                resetsechaondsha16();
                resetButtonColor16();
                btnTimerha16.clearAnimation();
                flashingha16 = false;flashinghag16 = false;
                isTimerRunningha16 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton17() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer17();
                resetThresholdsToOriginal17();
                resetsechaondsha17();
                resetButtonColor17();
                btnTimerha17.clearAnimation();
                flashingha17 = false;flashinghag17 = false;
                isTimerRunningha17 = false;


                dialog.dismiss();
            }

        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton18() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer18();
                resetThresholdsToOriginal18();
                resetsechaondsha18();
                resetButtonColor18();
                btnTimerha18.clearAnimation();
                flashingha18 = false;flashinghag18 = false;
                isTimerRunningha18 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton19() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer19();
                resetThresholdsToOriginal19();
                resetsechaondsha19();
                resetButtonColor19();
                btnTimerha19.clearAnimation();
                flashingha19 = false;flashinghag19 = false;
                isTimerRunningha19 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton20() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha0();
                resetThresholdsToOriginal20();
                resetsechaondsha20();
                resetButtonColor2haha0();
                btnTimerha2haha0.clearAnimation();
                flashingha20 = false;flashinghag20 = false;
                isTimerRunningha20 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton21() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha1();
                resetThresholdsToOriginal21();
                resetsechaondsha21();
                resetButtonColor2haha1();
                btnTimerha2haha1.clearAnimation();
                flashingha21 = false;flashinghag21 = false;
                isTimerRunningha21 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton22() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha2();
                resetThresholdsToOriginal22();
                resetsechaondsha22();
                resetButtonColor2haha2();
                btnTimerha2haha2.clearAnimation();
                flashingha22 = false;flashinghag22 = false;
                isTimerRunningha22 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton23() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha3();
                resetThresholdsToOriginal23();
                resetsechaondsha23();
                resetButtonColor2haha3();
                btnTimerha2haha3.clearAnimation();
                flashingha23 = false;flashinghag23 = false;
                isTimerRunningha23 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton24() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha4();
                resetThresholdsToOriginal24();
                resetsechaondsha24();
                resetButtonColor2haha4();
                btnTimerha2haha4.clearAnimation();
                flashingha24 = false;flashinghag24 = false;
                isTimerRunningha24 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton25() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha5();
                resetThresholdsToOriginal25();
                resetsechaondsha25();
                resetButtonColor2haha5();
                btnTimerha2haha5.clearAnimation();
                flashingha25 = false;flashinghag25 = false;
                isTimerRunningha25 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton27KK() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha7KK();
                resetThresholdsToOriginal27KK();
                resetsechaondsha27KK();
                resetButtonColor2haha7KK();
                btnTimerha2haha7KK.clearAnimation();
                flashingha27KK = false;flashinghag27KK = false;
                isTimerRunningha27KK = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton28KK() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha8KK();
                resetThresholdsToOriginal28KK();
                resetsechaondsha28KK();
                resetButtonColor2haha8KK();
                btnTimerha2haha8KK.clearAnimation();
                flashingha28KK = false;flashinghag28KK = false;
                isTimerRunningha28KK = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer66();
                resetThresholdsToOriginal66();
                resetsechaondsha66();
                resetButtonColor66();
                btnTimerha66.clearAnimation();
                flashingha66 = false;flashinghag66 = false;
                isTimerRunningha66 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton201() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha01();
                resetThresholdsToOriginal201();
                resetsechaondsha201();
                resetButtonColor2haha01();
                btnTimerha2haha01.clearAnimation();
                flashingha201 = false;flashinghag201 = false;
                isTimerRunningha201 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton202() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha02();
                resetThresholdsToOriginal202();
                resetsechaondsha202();
                resetButtonColor2haha02();
                btnTimerha2haha02.clearAnimation();
                flashingha202 = false;flashinghag202 = false;
                isTimerRunningha202 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton203() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha03();
                resetThresholdsToOriginal203();
                resetsechaondsha203();
                resetButtonColor2haha03();
                btnTimerha2haha03.clearAnimation();
                flashingha203 = false;flashinghag203 = false;
                isTimerRunningha203 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton204() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha04();
                resetThresholdsToOriginal204();
                resetsechaondsha204();
                resetButtonColor2haha04();
                btnTimerha2haha04.clearAnimation();
                flashingha204 = false;flashinghag204 = false;
                isTimerRunningha204 = false;



                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton26KK() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha6KK();
                resetThresholdsToOriginal26KK();
                resetsechaondsha26KK();
                resetButtonColor2haha6KK();
                btnTimerha2haha6KK.clearAnimation();
                flashingha26KK = false;flashinghag26KK = false;
                isTimerRunningha26KK = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_1 = true;
                isTimerRunningha1 = true;
                starttimeha1r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1 = Calendar.getInstance();
                currentHourha1 = currentTime1.get(Calendar.HOUR_OF_DAY);
                currentMinuteha1 = currentTime1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_1 = false;
                isTimerRunningha1 = true;
                starttimeha1r();
                flashingha1 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourha1 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteha1 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }


    private void showConfirmationDialogForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_2 = true;isTimerRunningha2 = true;
                starttimeha2r();
                dialog.dismiss();
                Calendar currentTime2 = Calendar.getInstance();
                currentHourha2haha = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinuteha2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_2 = false;isTimerRunningha2 = true;
                starttimeha2r();
                dialog.dismiss();
                flashingha2 = true;
                Calendar currentTime2 = Calendar.getInstance();
                currentHourha2haha = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinuteha2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_3 = true;isTimerRunningha3 = true;
                startTimeha3r();
                dialog.dismiss();
                Calendar currentTime3 = Calendar.getInstance();
                currentHourha3haha = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinuteha3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_3 = false;isTimerRunningha3 = true;
                startTimeha3r();
                dialog.dismiss();
                flashingha3 = true;
                Calendar currentTime3 = Calendar.getInstance();
                currentHourha3haha = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinuteha3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_4 = true;isTimerRunningha4 = true;
                startTimeha4r();
                dialog.dismiss();
                Calendar currentTime4 = Calendar.getInstance();
                currentHourha4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinuteha4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_4 = false;isTimerRunningha4 = true;
                startTimeha4r();
                dialog.dismiss();
                flashingha4 = true;
                Calendar currentTime4 = Calendar.getInstance();
                currentHourha4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinuteha4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_5 = true;isTimerRunningha5 = true;
                startTimeha5r();
                dialog.dismiss();
                Calendar currentTime5 = Calendar.getInstance();
                currentHourha5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinuteha5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_5 = false;isTimerRunningha5 = true;
                startTimeha5r();
                dialog.dismiss();
                flashingha5 = true;
                Calendar currentTime5 = Calendar.getInstance();
                currentHourha5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinuteha5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }



    private void showConfirmationDialogForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_7 = true;isTimerRunningha7 = true;
                startTimeha7r();
                dialog.dismiss();
                Calendar currentTime7 = Calendar.getInstance();
                currentHourha7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinuteha7 = currentTime7.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_7 = false;isTimerRunningha7 = true;
                startTimeha7r();
                dialog.dismiss();
                flashingha7 = true;
                Calendar currentTime7 = Calendar.getInstance();
                currentHourha7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinuteha7 = currentTime7.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_8 = true;isTimerRunningha8 = true;
                startTimeha8r();
                dialog.dismiss();

                Calendar currentTime8 = Calendar.getInstance();
                currentHourha8 = currentTime8.get(Calendar.HOUR_OF_DAY);
                currentMinuteha8 = currentTime8.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_8 = false;isTimerRunningha8 = true;
                startTimeha8r();
                dialog.dismiss();
                flashingha8 = true;

                Calendar currentTime8 = Calendar.getInstance();
                currentHourha8 = currentTime8.get(Calendar.HOUR_OF_DAY);
                currentMinuteha8 = currentTime8.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_9 = true;isTimerRunningha9 = true;
                startTimeha9r();
                dialog.dismiss();

                Calendar currentTime9 = Calendar.getInstance();
                currentHourha9 = currentTime9.get(Calendar.HOUR_OF_DAY);
                currentMinuteha9 = currentTime9.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_9 = false;isTimerRunningha9 = true;
                startTimeha9r();
                dialog.dismiss();
                flashingha9 = true;

                Calendar currentTime9 = Calendar.getInstance();
                currentHourha9 = currentTime9.get(Calendar.HOUR_OF_DAY);
                currentMinuteha9 = currentTime9.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_10 = true;isTimerRunningha10 = true;
                starttimeha10r();
                dialog.dismiss();

                Calendar currentTime10 = Calendar.getInstance();
                currentHourha10 = currentTime10.get(Calendar.HOUR_OF_DAY);
                currentMinuteha10 = currentTime10.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_10 = false;isTimerRunningha10 = true;
                starttimeha10r();
                dialog.dismiss();
                flashingha10 = true;

                Calendar currentTime10 = Calendar.getInstance();
                currentHourha10 = currentTime10.get(Calendar.HOUR_OF_DAY);
                currentMinuteha10 = currentTime10.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_11 = true;isTimerRunningha11 = true;
                starttimeha11r();
                dialog.dismiss();

                Calendar currentTime11 = Calendar.getInstance();
                currentHourha11 = currentTime11.get(Calendar.HOUR_OF_DAY);
                currentMinuteha11 = currentTime11.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_11 = false;isTimerRunningha11 = true;
                starttimeha11r();
                dialog.dismiss();
                flashingha11 = true;

                Calendar currentTime11 = Calendar.getInstance();
                currentHourha11 = currentTime11.get(Calendar.HOUR_OF_DAY);
                currentMinuteha11 = currentTime11.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton16() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_16 = true;isTimerRunningha16 = true;
                starttimeha16r();
                dialog.dismiss();
                Calendar currentTime16 = Calendar.getInstance();
                currentHourha16 = currentTime16.get(Calendar.HOUR_OF_DAY);
                currentMinuteha16 = currentTime16.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_16 = false;isTimerRunningha16 = true;
                starttimeha16r();
                dialog.dismiss();
                flashingha16 = true;
                Calendar currentTime16 = Calendar.getInstance();
                currentHourha16 = currentTime16.get(Calendar.HOUR_OF_DAY);
                currentMinuteha16 = currentTime16.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton17() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_17 = true;isTimerRunningha17 = true;
                starttimeha17r();
                dialog.dismiss();

                Calendar currentTime17 = Calendar.getInstance();
                currentHourha17 = currentTime17.get(Calendar.HOUR_OF_DAY);
                currentMinuteha17 = currentTime17.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_17 = false;isTimerRunningha17 = true;
                starttimeha17r();
                dialog.dismiss();
                flashingha17 = true;

                Calendar currentTime17 = Calendar.getInstance();
                currentHourha17 = currentTime17.get(Calendar.HOUR_OF_DAY);
                currentMinuteha17 = currentTime17.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton18() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_18 = true;isTimerRunningha18 = true;
                starttimeha18r();
                dialog.dismiss();

                Calendar currentTime18 = Calendar.getInstance();
                currentHourha18 = currentTime18.get(Calendar.HOUR_OF_DAY);
                currentMinuteha18 = currentTime18.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_18 = false;isTimerRunningha18 = true;
                starttimeha18r();
                dialog.dismiss();
                flashingha18 = true;

                Calendar currentTime18 = Calendar.getInstance();
                currentHourha18 = currentTime18.get(Calendar.HOUR_OF_DAY);
                currentMinuteha18 = currentTime18.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton19() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_19 = true;isTimerRunningha19 = true;
                starttimeha19r();
                dialog.dismiss();

                Calendar currentTime19 = Calendar.getInstance();
                currentHourha19 = currentTime19.get(Calendar.HOUR_OF_DAY);
                currentMinuteha19 = currentTime19.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_19 = false;isTimerRunningha19 = true;
                starttimeha19r();
                dialog.dismiss();
                flashingha19 = true;

                Calendar currentTime19 = Calendar.getInstance();
                currentHourha19 = currentTime19.get(Calendar.HOUR_OF_DAY);
                currentMinuteha19 = currentTime19.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton20() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_20 = true;isTimerRunningha20 = true;
                starttimeha20r();
                dialog.dismiss();

                Calendar currentTime20 = Calendar.getInstance();
                currentHourha2haha0 = currentTime20.get(Calendar.HOUR_OF_DAY);
                currentMinuteha20 = currentTime20.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_20 = false;isTimerRunningha20 = true;
                starttimeha20r();
                dialog.dismiss();
                flashingha20 = true;

                Calendar currentTime20 = Calendar.getInstance();
                currentHourha2haha0 = currentTime20.get(Calendar.HOUR_OF_DAY);
                currentMinuteha20 = currentTime20.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton21() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_21 = true;isTimerRunningha21 = true;
                starttimeha21r();
                dialog.dismiss();

                Calendar currentTime21 = Calendar.getInstance();
                currentHourha2haha1 = currentTime21.get(Calendar.HOUR_OF_DAY);
                currentMinuteha21 = currentTime21.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_21 = false;isTimerRunningha21 = true;
                starttimeha21r();
                dialog.dismiss();
                flashingha21 = true;

                Calendar currentTime21 = Calendar.getInstance();
                currentHourha2haha1 = currentTime21.get(Calendar.HOUR_OF_DAY);
                currentMinuteha21 = currentTime21.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton22() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_22 = true;isTimerRunningha22 = true;
                starttimeha22r();
                dialog.dismiss();

                Calendar currentTime22 = Calendar.getInstance();
                currentHourha2haha2 = currentTime22.get(Calendar.HOUR_OF_DAY);
                currentMinuteha22 = currentTime22.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_22 = false;isTimerRunningha22 = true;
                starttimeha22r();
                dialog.dismiss();
                flashingha22= true;

                Calendar currentTime22 = Calendar.getInstance();
                currentHourha2haha2 = currentTime22.get(Calendar.HOUR_OF_DAY);
                currentMinuteha22 = currentTime22.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton23() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_23 = true;isTimerRunningha23 = true;
                starttimeha23r();
                dialog.dismiss();

                Calendar currentTime23 = Calendar.getInstance();
                currentHourha2haha3 = currentTime23.get(Calendar.HOUR_OF_DAY);
                currentMinuteha23 = currentTime23.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_23 = false;isTimerRunningha23 = true;
                starttimeha23r();
                dialog.dismiss();
                flashingha23 = true;

                Calendar currentTime23 = Calendar.getInstance();
                currentHourha2haha3 = currentTime23.get(Calendar.HOUR_OF_DAY);
                currentMinuteha23 = currentTime23.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton24() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_24 = true;isTimerRunningha24 = true;
                starttimeha24r();
                dialog.dismiss();

                Calendar currentTime24 = Calendar.getInstance();
                currentHourha2haha4 = currentTime24.get(Calendar.HOUR_OF_DAY);
                currentMinuteha24 = currentTime24.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_24 = false;isTimerRunningha24 = true;
                starttimeha24r();
                dialog.dismiss();
                flashingha24 = true;

                Calendar currentTime24 = Calendar.getInstance();
                currentHourha2haha4 = currentTime24.get(Calendar.HOUR_OF_DAY);
                currentMinuteha24 = currentTime24.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton25() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_25 = true;isTimerRunningha25 = true;
                starttimeha25r();
                dialog.dismiss();

                Calendar currentTime25 = Calendar.getInstance();
                currentHourha2haha5 = currentTime25.get(Calendar.HOUR_OF_DAY);
                currentMinuteha25 = currentTime25.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_25 = false;isTimerRunningha25 = true;
                starttimeha25r();
                dialog.dismiss();
                flashingha25 = true;

                Calendar currentTime25 = Calendar.getInstance();
                currentHourha2haha5 = currentTime25.get(Calendar.HOUR_OF_DAY);
                currentMinuteha25 = currentTime25.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton27KK() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_27KK = true;isTimerRunningha27KK = true;
                starttimeha27KKr();
                dialog.dismiss();

                Calendar currentTime27KK = Calendar.getInstance();
                currentHourha2haha7KK = currentTime27KK.get(Calendar.HOUR_OF_DAY);
                currentMinuteha27KK = currentTime27KK.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_27KK = false;isTimerRunningha27KK = true;
                starttimeha27KKr();
                dialog.dismiss();
                flashingha27KK = true;

                Calendar currentTime27KK = Calendar.getInstance();
                currentHourha2haha7KK = currentTime27KK.get(Calendar.HOUR_OF_DAY);
                currentMinuteha27KK = currentTime27KK.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton28KK() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_28KK = true;isTimerRunningha28KK = true;
                starttimeha28KKr();
                dialog.dismiss();

                Calendar currentTime28KK = Calendar.getInstance();
                currentHourha2haha8KK = currentTime28KK.get(Calendar.HOUR_OF_DAY);
                currentMinuteha28KK = currentTime28KK.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_28KK = false;isTimerRunningha28KK = true;
                starttimeha28KKr();
                dialog.dismiss();
                flashingha28KK = true;

                Calendar currentTime28KK = Calendar.getInstance();
                currentHourha2haha8KK = currentTime28KK.get(Calendar.HOUR_OF_DAY);
                currentMinuteha28KK = currentTime28KK.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_66 = true;isTimerRunningha66 = true;
                startTimeha66r();
                dialog.dismiss();

                Calendar currentTime66 = Calendar.getInstance();
                currentHourha66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinuteha66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_66 = false;isTimerRunningha66 = true;
                startTimeha66r();
                dialog.dismiss();
                flashingha66 = true;

                Calendar currentTime66 = Calendar.getInstance();
                currentHourha66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinuteha66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton201() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_12 = true;isTimerRunningha201 = true;
                starttimeha201r();
                dialog.dismiss();

                Calendar currentTime12 = Calendar.getInstance();
                currentHourha12 = currentTime12.get(Calendar.HOUR_OF_DAY);
                currentMinuteha12 = currentTime12.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_12 = false;isTimerRunningha201 = true;
                starttimeha201r();
                dialog.dismiss();
                flashingha201 = true;

                Calendar currentTime12 = Calendar.getInstance();
                currentHourha12 = currentTime12.get(Calendar.HOUR_OF_DAY);
                currentMinuteha12 = currentTime12.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton202() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_13 = true;isTimerRunningha202 = true;
                starttimeha202r();
                dialog.dismiss();

                Calendar currentTime13 = Calendar.getInstance();
                currentHourha13 = currentTime13.get(Calendar.HOUR_OF_DAY);
                currentMinuteha13 = currentTime13.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_13 = false;isTimerRunningha202 = true;
                starttimeha202r();
                dialog.dismiss();
                flashingha202 = true;

                Calendar currentTime13 = Calendar.getInstance();
                currentHourha13 = currentTime13.get(Calendar.HOUR_OF_DAY);
                currentMinuteha13 = currentTime13.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton203() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_14 = true;isTimerRunningha203 = true;
                starttimeha203r();
                dialog.dismiss();

                Calendar currentTime14 = Calendar.getInstance();
                currentHourha14 = currentTime14.get(Calendar.HOUR_OF_DAY);
                currentMinuteha14 = currentTime14.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_14 = false;isTimerRunningha203 = true;
                starttimeha203r();
                dialog.dismiss();
                flashingha203 = true;

                Calendar currentTime14 = Calendar.getInstance();
                currentHourha14 = currentTime14.get(Calendar.HOUR_OF_DAY);
                currentMinuteha14 = currentTime14.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton204() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_15 = true;isTimerRunningha204 = true;
                starttimeha204r();
                dialog.dismiss();

                Calendar currentTime15 = Calendar.getInstance();
                currentHourha15 = currentTime15.get(Calendar.HOUR_OF_DAY);
                currentMinuteha15 = currentTime15.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_15 = false;isTimerRunningha204 = true;
                starttimeha204r();
                dialog.dismiss();
                flashingha204 = true;

                Calendar currentTime15 = Calendar.getInstance();
                currentHourha15 = currentTime15.get(Calendar.HOUR_OF_DAY);
                currentMinuteha15 = currentTime15.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton26KK() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_26KK = true;isTimerRunningha26KK = true;
                starttimeha26KKr();
                dialog.dismiss();
                Calendar currentTime26KK = Calendar.getInstance();
                currentHourha2haha6KK = currentTime26KK.get(Calendar.HOUR_OF_DAY);
                currentMinuteha26KK = currentTime26KK.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_26KK = false;isTimerRunningha26KK = true;
                starttimeha26KKr();
                dialog.dismiss();
                flashingha26KK = true;
                Calendar currentTime26KK = Calendar.getInstance();
                currentHourha2haha6KK = currentTime26KK.get(Calendar.HOUR_OF_DAY);
                currentMinuteha26KK = currentTime26KK.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }

    private void starttimeha1r() {
        starttimeha1 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha1, 0);
    }
    private void starttimeha2r() {
        starttimeha2 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha2, 0);
    }

    private void startTimeha3r() {
        startTimeha3 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha3, 0);
    }

    private void startTimeha4r() {
        startTimeha4 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha4, 0);
    }
    private void startTimeha5r() {
        startTimeha5 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha5, 0);
    }



    private void startTimeha7r() {
        startTimeha7 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha7, 0);
    }

    private void startTimeha8r() {
        startTimeha8 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha8, 0);
    }

    private void startTimeha9r() {
        startTimeha9 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha9, 0);
    }
    private void starttimeha10r() {
        starttimeha10 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha10, 0);
    }
    private void starttimeha11r() {
        starttimeha11 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha11, 0);
    }
    private void starttimeha16r() {
        starttimeha16 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha16, 0);
    }
    private void starttimeha17r() {
        starttimeha17 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha17, 0);
    }
    private void starttimeha18r() {
        starttimeha18 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha18, 0);
    }

    private void starttimeha19r() {
        starttimeha19 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha19, 0);
    }

    private void starttimeha20r() {
        starttimeha20 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha20, 0);
    }

    private void starttimeha21r() {
        starttimeha21 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha21, 0);
    }
    private void starttimeha22r() {
        starttimeha22 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha22, 0);
    }

    private void starttimeha23r() {
        starttimeha23 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha23, 0);
    }

    private void starttimeha24r() {
        starttimeha24 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha24, 0);
    }

    private void starttimeha25r() {
        starttimeha25 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha25, 0);
    }
/*
    private void starttimeha266r() {
        starttimeha266 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha266, 0);
    }
*/
    private void starttimeha27KKr() {
        starttimeha27KK = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha27KK, 0);
    }

    private void starttimeha28KKr() {
        starttimeha28KK = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha28KK, 0);
    }
    private void startTimeha66r() {
        startTimeha66 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha66, 0);
    }
    private void starttimeha201r() {
        starttimeha201 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha201, 0);
    }

    private void starttimeha202r() {
        starttimeha202 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha202, 0);
    }

    private void starttimeha203r() {
        starttimeha203 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha203, 0);
    }

    private void starttimeha204r() {
        starttimeha204 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha204, 0);
    }

    private void starttimeha26KKr() {
        starttimeha26KK = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha26KK, 0);
    }




    private void resetThresholdsToOriginal1() {
        //此為測試用 正式版應改為originalyellowThresholdhaha2
        yellowThresholdha1 = originalyellowThresholdhaha2;
        redThresholdha1 = originalredThresholdhaha2;
        blueThresholdha1 = originalblueThresholdhaha2;
        //yellowThresholdha1 = originalyellowThresholdhaha2;
        //redThresholdha1 = originalredThresholdhaha2;
        //blueThresholdha1 = originalblueThresholdhaha2;
        //此為測試用
    }
    private void resetThresholdsToOriginal2() {
        yellowThresholdha2 = originalyellowThresholdhaha2;
        redThresholdha2 = originalredThresholdhaha2;
        blueThresholdha2 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal3() {
        yellowThresholdha3 = originalyellowThresholdhaha2;
        redThresholdha3 = originalredThresholdhaha2;
        blueThresholdha3 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal4() {
        yellowThresholdha4 = originalyellowThresholdhaha2;
        redThresholdha4 = originalredThresholdhaha2;
        blueThresholdha4 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal5() {
        yellowThresholdha5 = originalyellowThresholdhaha2;
        redThresholdha5 = originalredThresholdhaha2;
        blueThresholdha5 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal6() {
        yellowThresholdha6 = originalyellowThresholdhaha2;
        redThresholdha6 = originalredThresholdhaha2;
        blueThresholdha6 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal7() {
        yellowThresholdha7 = originalyellowThresholdhaha2;
        redThresholdha7 = originalredThresholdhaha2;
        blueThresholdha7 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal8() {
        yellowThresholdha8 = originalyellowThresholdhaha2;
        redThresholdha8 = originalredThresholdhaha2;
        blueThresholdha8 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal9() {
        yellowThresholdha9 = originalyellowThresholdhaha2;
        redThresholdha9 = originalredThresholdhaha2;
        blueThresholdha9 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal10() {
        yellowThresholdha10 = originalyellowThresholdhaha2;
        redThresholdha10 = originalredThresholdhaha2;
        blueThresholdha10 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal11() {
        yellowThresholdha11 = originalyellowThresholdhaha2;
        redThresholdha11 = originalredThresholdhaha2;
        blueThresholdha11 = originalblueThresholdhaha2;
    }
    private void resetThresholdsToOriginal16() {
        yellowThresholdha16 = originalyellowThresholdhaha2;
        redThresholdha16 = originalredThresholdhaha2;
        blueThresholdha16 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal17() {
        yellowThresholdha17 = originalyellowThresholdhaha2;
        redThresholdha17 = originalredThresholdhaha2;
        blueThresholdha17 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal18() {
        yellowThresholdha18 = originalyellowThresholdhaha2;
        redThresholdha18 = originalredThresholdhaha2;
        blueThresholdha18 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal19() {
        yellowThresholdha19 = originalyellowThresholdhaha2;
        redThresholdha19 = originalredThresholdhaha2;
        blueThresholdha19 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal20() {
        yellowThresholdha20 = originalyellowThresholdhaha2;
        redThresholdha20 = originalredThresholdhaha2;
        blueThresholdha20 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal21() {
        yellowThresholdha21 = originalyellowThresholdhaha2;
        redThresholdha21 = originalredThresholdhaha2;
        blueThresholdha21 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal22() {
        yellowThresholdha22 = originalyellowThresholdhaha2;
        redThresholdha22 = originalredThresholdhaha2;
        blueThresholdha22 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal23() {
        yellowThresholdha23 = originalyellowThresholdhaha2;
        redThresholdha23 = originalredThresholdhaha2;
        blueThresholdha23 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal24() {
        yellowThresholdha24 = originalyellowThresholdhaha2;
        redThresholdha24 = originalredThresholdhaha2;
        blueThresholdha24 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal25() {
        yellowThresholdha25 = originalyellowThresholdhaha2;
        redThresholdha25 = originalredThresholdhaha2;
        blueThresholdha25 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal27KK() {
        yellowThresholdha27KK = originalyellowThresholdhaha2;
        redThresholdha27KK = originalredThresholdhaha2;
        blueThresholdha27KK = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal28KK() {
        yellowThresholdha28KK = originalyellowThresholdhaha2;
        redThresholdha28KK = originalredThresholdhaha2;
        blueThresholdha28KK = originalblueThresholdhaha2;
    }
    private void resetThresholdsToOriginal66() {
        yellowThresholdha66 = originalyellowThresholdhaha2;
        redThresholdha66 = originalredThresholdhaha2;
        blueThresholdha66 = originalblueThresholdhaha2;
    }
    private void resetThresholdsToOriginal201() {
        yellowThresholdha201 = originalyellowThresholdhaha3;
        redThresholdha201 = originalredThresholdhaha3;
        blueThresholdha201 = originalblueThresholdhaha3;
    }

    private void resetThresholdsToOriginal202() {
        yellowThresholdha202 = originalyellowThresholdhaha3;
        redThresholdha202 = originalredThresholdhaha3;
        blueThresholdha202 = originalblueThresholdhaha3;
    }

    private void resetThresholdsToOriginal203() {
        yellowThresholdha203 = originalyellowThresholdhaha3;
        redThresholdha203 = originalredThresholdhaha3;
        blueThresholdha203 = originalblueThresholdhaha3;
    }

    private void resetThresholdsToOriginal204() {
        yellowThresholdha204 = originalyellowThresholdhaha3;
        redThresholdha204 = originalredThresholdhaha3;
        blueThresholdha204 = originalblueThresholdhaha3;
    }

    private void resetThresholdsToOriginal26KK() {
        yellowThresholdha26KK = originalyellowThresholdhaha2;
        redThresholdha26KK = originalredThresholdhaha2;
        blueThresholdha26KK = originalblueThresholdhaha2;
    }



    private Runnable updateTimerThreadha1 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha1 = SystemClock.uptimeMillis() - starttimeha1;
            updatedtimeha1 = timeInMillisechaondshaha1;
            sechaondsha1 = (int) (updatedtimeha1 / 1000);
            minutesha1 = sechaondsha1 / 60;
            hoursha1 = minutesha1 / 60;
            sechaondsha1 = sechaondsha1 % 60;
            minutesha1 = minutesha1 % 60;
            secha1 = hoursha1 * 3600 + minutesha1 * 60 + sechaondsha1;

            // 计算当前时间加上 redThresholdha1 后的时间（秒数）
            int totalSeconds = currentHourha1 * 60 * 60 + currentMinuteha1 * 60 + redThresholdha1;
            // 计算小时和分钟
            futureHourha1 = totalSeconds / 3600;
            futureMinuteha1 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha1 >= 24) {
                futureHourha1 %= 24;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha1, currentMinuteha1);
            String futureTimeString = String.format("%02d:%02d", futureHourha1, futureMinuteha1);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha1.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha1.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha1();
            handlerhaha1.postDelayed(this, 1000);
        }
    };




    private Runnable updateTimerThreadha2 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha2 = SystemClock.uptimeMillis() - starttimeha2;
            updatedtimeha2 = timeInMillisechaondshaha2;
            sechaondsha2 = (int) (updatedtimeha2 / 1000);
            minutesha2 = sechaondsha2 / 60;
            hoursha2 = minutesha2 / 60;
            sechaondsha2 = sechaondsha2 % 60;
            minutesha2 = minutesha2 % 60;
            secha2 = hoursha2 * 3600 + minutesha2 * 60 + sechaondsha2;

            // 计算当前时间加上 redThresholdha2 后的时间（秒数）
            int totalSeconds = currentHourha2haha * 60 * 60 + currentMinuteha2 * 60 + redThresholdha2;
            // 计算小时和分钟
            futureHourha2haha = totalSeconds / 3600;
            futureMinuteha2 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha >= 24) {
                futureHourha2haha %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha, currentMinuteha2);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha, futureMinuteha2);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha3 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha3 = SystemClock.uptimeMillis() - startTimeha3;
            updatedTime3 = timeInMillisechaondshaha3;
            sechaondsha3 = (int) (updatedTime3 / 1000);
            minutesha3 = sechaondsha3 / 60;
            hoursha3 = minutesha3 / 60;
            sechaondsha3 = sechaondsha3 % 60;
            minutesha3 = minutesha3 % 60;
            secha3 = hoursha3 * 3600 + minutesha3 * 60 + sechaondsha3;

// 计算当前时间加上 redThresholdha3 后的时间（秒数）
            int totalSeconds = currentHourha3haha * 60 * 60 + currentMinuteha3 * 60 + redThresholdha3;
            // 计算小时和分钟
            futureHourha3haha = totalSeconds / 3600;
            futureMinuteha3 = (totalSeconds % 3600) / 60;
            // 处理超过34小时的进位
            if (futureHourha3haha >= 24) {
                futureHourha3haha %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha3haha, currentMinuteha3);
            String futureTimeString = String.format("%02d:%02d", futureHourha3haha, futureMinuteha3);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha3haha.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha3haha.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha3haha();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha4 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha4 = SystemClock.uptimeMillis() - startTimeha4;
            updatedTime4 = timeInMillisechaondshaha4;
            sechaondsha4 = (int) (updatedTime4 / 1000);
            minutesha4 = sechaondsha4 / 60;
            hoursha4 = minutesha4 / 60;
            sechaondsha4 = sechaondsha4 % 60;
            minutesha4 = minutesha4 % 60;
            secha4 =hoursha4 * 3600 + minutesha4 * 60 + sechaondsha4;


            // 计算当前时间加上 redThresholdha4 后的时间（秒数）
            int totalSeconds = currentHourha4 * 60 * 60 + currentMinuteha4 * 60 + redThresholdha4;
            // 计算小时和分钟
            futureHourha4 = totalSeconds / 3600;
            futureMinuteha4 = (totalSeconds % 3600) / 60;
            // 处理超过44小时的进位
            if (futureHourha4 >= 24) {
                futureHourha4 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha4, currentMinuteha4);
            String futureTimeString = String.format("%02d:%02d", futureHourha4, futureMinuteha4);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha4.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha4.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha4();
            handlerhaha1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThreadha5 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha5 = SystemClock.uptimeMillis() - startTimeha5;
            updatedTime5 = timeInMillisechaondshaha5;
            sechaondsha5 = (int) (updatedTime5 / 1000);
            minutesha5 = sechaondsha5 / 60;
            hoursha5 = minutesha5 / 60;
            sechaondsha5 = sechaondsha5 % 60;
            minutesha5 = minutesha5 % 60;
            secha5 =hoursha5 * 3600 + minutesha5 * 60 + sechaondsha5;



            // 计算当前时间加上 redThresholdha5 后的时间（秒数）
            int totalSeconds = currentHourha5 * 60 * 60 + currentMinuteha5 * 60 + redThresholdha5;
            // 计算小时和分钟
            futureHourha5 = totalSeconds / 3600;
            futureMinuteha5 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha5 >= 24) {
                futureHourha5 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha5, currentMinuteha5);
            String futureTimeString = String.format("%02d:%02d", futureHourha5, futureMinuteha5);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha5.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha5.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha5();
            handlerhaha1.postDelayed(this, 1000);
        }
    };



    private Runnable updateTimerThreadha7 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha7 = SystemClock.uptimeMillis() - startTimeha7;
            updatedTime7 = timeInMillisechaondshaha7;
            sechaondsha7 = (int) (updatedTime7 / 1000);
            minutesha7 = sechaondsha7 / 60;
            hoursha7 = minutesha7 / 60;
            sechaondsha7 = sechaondsha7 % 60;
            minutesha7 = minutesha7 % 60;
            secha7 =hoursha7 * 3600 + minutesha7 * 60 + sechaondsha7;



            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha7 * 60 * 60 + currentMinuteha7 * 60 + redThresholdha7;
            // 计算小时和分钟
            futureHourha7 = totalSeconds / 3600;
            futureMinuteha7 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha7 >= 24) {
                futureHourha7 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha7, currentMinuteha7);
            String futureTimeString = String.format("%02d:%02d", futureHourha7, futureMinuteha7);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha7.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha7.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha7();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha8 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha8 = SystemClock.uptimeMillis() - startTimeha8;
            updatedTime8 = timeInMillisechaondshaha8;
            sechaondsha8 = (int) (updatedTime8 / 1000);
            minutesha8 = sechaondsha8 / 60;
            hoursha8 = minutesha8 / 60;
            sechaondsha8 = sechaondsha8 % 60;
            minutesha8 = minutesha8 % 60;
            secha8 =hoursha8 * 3600 + minutesha8 * 60 + sechaondsha8;



            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha8 * 60 * 60 + currentMinuteha8 * 60 + redThresholdha8;
            // 计算小时和分钟
            futureHourha8 = totalSeconds / 3600;
            futureMinuteha8 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha8 >= 24) {
                futureHourha8 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha8, currentMinuteha8);
            String futureTimeString = String.format("%02d:%02d", futureHourha8, futureMinuteha8);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha8.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha8.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha8();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha9 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha9 = SystemClock.uptimeMillis() - startTimeha9;
            updatedTime9 = timeInMillisechaondshaha9;
            sechaondsha9 = (int) (updatedTime9 / 1000);
            minutesha9 = sechaondsha9 / 60;
            hoursha9 = minutesha9 / 60;
            sechaondsha9 = sechaondsha9 % 60;
            minutesha9 = minutesha9 % 60;
            secha9 =hoursha9 * 3600 + minutesha9 * 60 + sechaondsha9;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha9 * 60 * 60 + currentMinuteha9 * 60 + redThresholdha9;
            // 计算小时和分钟
            futureHourha9 = totalSeconds / 3600;
            futureMinuteha9 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha9 >= 24) {
                futureHourha9 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha9, currentMinuteha9);
            String futureTimeString = String.format("%02d:%02d", futureHourha9, futureMinuteha9);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha9.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha9.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha9();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha10 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha10 = SystemClock.uptimeMillis() - starttimeha10;
            updatedtimeha10 = timeInMillisechaondshaha10;
            sechaondsha10 = (int) (updatedtimeha10 / 1000);
            minutesha10 = sechaondsha10 / 60;
            hoursha10 = minutesha10 / 60;
            sechaondsha10 = sechaondsha10 % 60;
            minutesha10 = minutesha10 % 60;
            secha10 =hoursha10 * 3600 + minutesha10 * 60 + sechaondsha10;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha10 * 60 * 60 + currentMinuteha10 * 60 + redThresholdha10;
            // 计算小时和分钟
            futureHourha10 = totalSeconds / 3600;
            futureMinuteha10 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha10 >= 24) {
                futureHourha10 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha10, currentMinuteha10);
            String futureTimeString = String.format("%02d:%02d", futureHourha10, futureMinuteha10);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha10.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha10.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha10();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha11 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha11 = SystemClock.uptimeMillis() - starttimeha11;
            updatedtimeha11 = timeInMillisechaondshaha11;
            sechaondsha11 = (int) (updatedtimeha11 / 1000);
            minutesha11 = sechaondsha11 / 60;
            hoursha11 = minutesha11 / 60;
            sechaondsha11 = sechaondsha11 % 60;
            minutesha11 = minutesha11 % 60;
            secha11 =hoursha11 * 3600 + minutesha11 * 60 + sechaondsha11;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha11 * 60 * 60 + currentMinuteha11 * 60 + redThresholdha11;
            // 计算小时和分钟
            futureHourha11 = totalSeconds / 3600;
            futureMinuteha11 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha11 >= 24) {
                futureHourha11 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha11, currentMinuteha11);
            String futureTimeString = String.format("%02d:%02d", futureHourha11, futureMinuteha11);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha11.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha11.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha11();
            handlerhaha1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThreadha16 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha16 = SystemClock.uptimeMillis() - starttimeha16;
            updatedtimeha16 = timeInMillisechaondshaha16;
            sechaondsha16 = (int) (updatedtimeha16 / 1000);
            minutesha16 = sechaondsha16 / 60;
            hoursha16 = minutesha16 / 60;
            sechaondsha16 = sechaondsha16 % 60;
            minutesha16 = minutesha16 % 60;
            secha16 =hoursha16 * 3600 + minutesha16 * 60 + sechaondsha16;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha16 * 60 * 60 + currentMinuteha16 * 60 + redThresholdha16;
            // 计算小时和分钟
            futureHourha16 = totalSeconds / 3600;
            futureMinuteha16 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha16 >= 24) {
                futureHourha16 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha16, currentMinuteha16);
            String futureTimeString = String.format("%02d:%02d", futureHourha16, futureMinuteha16);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha16.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha16.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha16();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha17 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha17 = SystemClock.uptimeMillis() - starttimeha17;
            updatedtimeha17 = timeInMillisechaondshaha17;
            sechaondsha17 = (int) (updatedtimeha17 / 1000);
            minutesha17 = sechaondsha17 / 60;
            hoursha17 = minutesha17 / 60;
            sechaondsha17 = sechaondsha17 % 60;
            minutesha17 = minutesha17 % 60;
            secha17 =hoursha17 * 3600 + minutesha17 * 60 + sechaondsha17;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha17 * 60 * 60 + currentMinuteha17 * 60 + redThresholdha17;
            // 计算小时和分钟
            futureHourha17 = totalSeconds / 3600;
            futureMinuteha17 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha17 >= 24) {
                futureHourha17 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha17, currentMinuteha17);
            String futureTimeString = String.format("%02d:%02d", futureHourha17, futureMinuteha17);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha17.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha17.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha17();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha18 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha18 = SystemClock.uptimeMillis() - starttimeha18;
            updatedtimeha18 = timeInMillisechaondshaha18;
            sechaondsha18 = (int) (updatedtimeha18 / 1000);
            minutesha18 = sechaondsha18 / 60;
            hoursha18 = minutesha18 / 60;
            sechaondsha18 = sechaondsha18 % 60;
            minutesha18 = minutesha18 % 60;
            secha18 =hoursha18 * 3600 + minutesha18 * 60 + sechaondsha18;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha18 * 60 * 60 + currentMinuteha18 * 60 + redThresholdha18;
            // 计算小时和分钟
            futureHourha18 = totalSeconds / 3600;
            futureMinuteha18 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha18 >= 24) {
                futureHourha18 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha18, currentMinuteha18);
            String futureTimeString = String.format("%02d:%02d", futureHourha18, futureMinuteha18);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha18.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha18.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha18();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha19 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha19 = SystemClock.uptimeMillis() - starttimeha19;
            updatedtimeha19 = timeInMillisechaondshaha19;
            sechaondsha19 = (int) (updatedtimeha19 / 1000);
            minutesha19 = sechaondsha19 / 60;
            hoursha19 = minutesha19 / 60;
            sechaondsha19 = sechaondsha19 % 60;
            minutesha19 = minutesha19 % 60;
            secha19 =hoursha19 * 3600 + minutesha19 * 60 + sechaondsha19;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha19 * 60 * 60 + currentMinuteha19 * 60 + redThresholdha19;
            // 计算小时和分钟
            futureHourha19 = totalSeconds / 3600;
            futureMinuteha19 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha19 >= 24) {
                futureHourha19 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha19, currentMinuteha19);
            String futureTimeString = String.format("%02d:%02d", futureHourha19, futureMinuteha19);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha19.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha19.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha19();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha20 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha20 = SystemClock.uptimeMillis() - starttimeha20;
            updatedtimeha20 = timeInMillisechaondshaha20;
            sechaondsha20 = (int) (updatedtimeha20 / 1000);
            minutesha20 = sechaondsha20 / 60;
            hoursha20 = minutesha20 / 60;
            sechaondsha20 = sechaondsha20 % 60;
            minutesha20 = minutesha20 % 60;
            secha20 =hoursha20 * 3600 + minutesha20 * 60 + sechaondsha20;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha0 * 60 * 60 + currentMinuteha20 * 60 + redThresholdha20;
            // 计算小时和分钟
            futureHourha2haha0 = totalSeconds / 3600;
            futureMinuteha20 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha0 >= 24) {
                futureHourha2haha0 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha0, currentMinuteha20);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha0, futureMinuteha20);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha0.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha0.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha0();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha21 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha21 = SystemClock.uptimeMillis() - starttimeha21;
            updatedtimeha21 = timeInMillisechaondshaha21;
            sechaondsha21 = (int) (updatedtimeha21 / 1000);
            minutesha21 = sechaondsha21 / 60;
            hoursha21 = minutesha21 / 60;
            sechaondsha21 = sechaondsha21 % 60;
            minutesha21 = minutesha21 % 60;
            secha21 =hoursha21 * 3600 + minutesha21 * 60 + sechaondsha21;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha1 * 60 * 60 + currentMinuteha21 * 60 + redThresholdha21;
            // 计算小时和分钟
            futureHourha2haha1 = totalSeconds / 3600;
            futureMinuteha21 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha1 >= 24) {
                futureHourha2haha1 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha1, currentMinuteha21);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha1, futureMinuteha21);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha1.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha1.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha1();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha22 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha22 = SystemClock.uptimeMillis() - starttimeha22;
            updatedtimeha22 = timeInMillisechaondshaha22;
            sechaondsha22 = (int) (updatedtimeha22 / 1000);
            minutesha22 = sechaondsha22 / 60;
            hoursha22 = minutesha22 / 60;
            sechaondsha22 = sechaondsha22 % 60;
            minutesha22 = minutesha22 % 60;
            secha22 =hoursha22 * 3600 + minutesha22 * 60 + sechaondsha22;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha2 * 60 * 60 + currentMinuteha22 * 60 + redThresholdha22;
            // 计算小时和分钟
            futureHourha2haha2 = totalSeconds / 3600;
            futureMinuteha22 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha2 >= 24) {
                futureHourha2haha2 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha2, currentMinuteha22);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha2, futureMinuteha22);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha2.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha2.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha2();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha23 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha23 = SystemClock.uptimeMillis() - starttimeha23;
            updatedtimeha23 = timeInMillisechaondshaha23;
            sechaondsha23 = (int) (updatedtimeha23 / 1000);
            minutesha23 = sechaondsha23 / 60;
            hoursha23 = minutesha23 / 60;
            sechaondsha23 = sechaondsha23 % 60;
            minutesha23 = minutesha23 % 60;
            secha23 =hoursha23 * 3600 + minutesha23 * 60 + sechaondsha23;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha3 * 60 * 60 + currentMinuteha23 * 60 + redThresholdha23;
            // 计算小时和分钟
            futureHourha2haha3 = totalSeconds / 3600;
            futureMinuteha23 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha3 >= 24) {
                futureHourha2haha3 %= 24;
            }
            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha3, currentMinuteha23);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha3, futureMinuteha23);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha3.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha3.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha3();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha24 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha24 = SystemClock.uptimeMillis() - starttimeha24;
            updatedtimeha24 = timeInMillisechaondshaha24;
            sechaondsha24 = (int) (updatedtimeha24 / 1000);
            minutesha24 = sechaondsha24 / 60;
            hoursha24 = minutesha24 / 60;
            sechaondsha24 = sechaondsha24 % 60;
            minutesha24 = minutesha24 % 60;
            secha24 =hoursha24 * 3600 + minutesha24 * 60 + sechaondsha24;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha4 * 60 * 60 + currentMinuteha24 * 60 + redThresholdha24;
            // 计算小时和分钟
            futureHourha2haha4 = totalSeconds / 3600;
            futureMinuteha24 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha4 >= 24) {
                futureHourha2haha4 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha4, currentMinuteha24);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha4, futureMinuteha24);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha4.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha4.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha4();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha25 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha25 = SystemClock.uptimeMillis() - starttimeha25;
            updatedtimeha25 = timeInMillisechaondshaha25;
            sechaondsha25 = (int) (updatedtimeha25 / 1000);
            minutesha25 = sechaondsha25 / 60;
            hoursha25 = minutesha25 / 60;
            sechaondsha25 = sechaondsha25 % 60;
            minutesha25 = minutesha25 % 60;
            secha25 =hoursha25 * 3600 + minutesha25 * 60 + sechaondsha25;

            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha5 * 60 * 60 + currentMinuteha25 * 60 + redThresholdha25;
            // 计算小时和分钟
            futureHourha2haha5 = totalSeconds / 3600;
            futureMinuteha25 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha5 >= 24) {
                futureHourha2haha5 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha5, currentMinuteha25);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha5, futureMinuteha25);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha5.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha5.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha5();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha27KK = new Runnable() {
        public void run() {
            timeInMillisechaondshaha27KK = SystemClock.uptimeMillis() - starttimeha27KK;
            updatedtimeha27KK = timeInMillisechaondshaha27KK;
            sechaondsha27KK = (int) (updatedtimeha27KK / 1000);
            minutesha27KK = sechaondsha27KK / 60;
            hoursha27KK = minutesha27KK / 60;
            sechaondsha27KK = sechaondsha27KK % 60;
            minutesha27KK = minutesha27KK % 60;
            secha27KK =hoursha27KK * 3600 + minutesha27KK * 60 + sechaondsha27KK;

            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha7KK * 60 * 60 + currentMinuteha27KK * 60 + redThresholdha27KK;
            // 计算小时和分钟
            futureHourha2haha7KK = totalSeconds / 3600;
            futureMinuteha27KK = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha7KK >= 24) {
                futureHourha2haha7KK %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha7KK, currentMinuteha27KK);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha7KK, futureMinuteha27KK);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha7KK.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha7KK.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha7KK();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha28KK = new Runnable() {
        public void run() {
            timeInMillisechaondshaha28KK = SystemClock.uptimeMillis() - starttimeha28KK;
            updatedtimeha28KK = timeInMillisechaondshaha28KK;
            sechaondsha28KK = (int) (updatedtimeha28KK / 1000);
            minutesha28KK = sechaondsha28KK / 60;
            hoursha28KK = minutesha28KK / 60;
            sechaondsha28KK = sechaondsha28KK % 60;
            minutesha28KK = minutesha28KK % 60;
            secha28KK =hoursha28KK * 3600 + minutesha28KK * 60 + sechaondsha28KK;

            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha8KK * 60 * 60 + currentMinuteha28KK * 60 + redThresholdha28KK;
            // 计算小时和分钟
            futureHourha2haha8KK = totalSeconds / 3600;
            futureMinuteha28KK = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha8KK >= 24) {
                futureHourha2haha8KK %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha8KK, currentMinuteha28KK);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha8KK, futureMinuteha28KK);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha8KK.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha8KK.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha8KK();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha66 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha66 = SystemClock.uptimeMillis() - startTimeha66;
            updatedTime66 = timeInMillisechaondshaha66;
            sechaondsha66 = (int) (updatedTime66 / 1000);
            minutesha66 = sechaondsha66 / 60;
            hoursha66 = minutesha66 / 60;
            sechaondsha66 = sechaondsha66 % 60;
            minutesha66 = minutesha66 % 60;
            secha66 =hoursha66 * 3600 + minutesha66 * 60 + sechaondsha66;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha66 * 60 * 60 + currentMinuteha66 * 60 + redThresholdha66;
            // 计算小时和分钟
            futureHourha66 = totalSeconds / 3600;
            futureMinuteha66 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha66 >= 24) {
                futureHourha66 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha66, currentMinuteha66);
            String futureTimeString = String.format("%02d:%02d", futureHourha66, futureMinuteha66);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha66.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha66.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha66();
            handlerhaha1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThreadha201 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha201 = SystemClock.uptimeMillis() - starttimeha201;
            updatedtimeha201 = timeInMillisechaondshaha201;
            sechaondsha201 = (int) (updatedtimeha201 / 1000);
            minutesha201 = sechaondsha201 / 60;
            hoursha201 = minutesha201 / 60;
            sechaondsha201 = sechaondsha201 % 60;
            minutesha201 = minutesha201 % 60;
            secha201 =hoursha201 * 3600 + minutesha201 * 60 + sechaondsha201;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha12 * 60 * 60 + currentMinuteha12 * 60 + redThresholdha201;
            // 计算小时和分钟
            futureHourha12 = totalSeconds / 3600;
            futureMinuteha12 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha12 >= 24) {
                futureHourha12 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha12, currentMinuteha12);
            String futureTimeString = String.format("%02d:%02d", futureHourha12, futureMinuteha12);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"-----" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha01.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha01.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha01();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha202 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha202 = SystemClock.uptimeMillis() - starttimeha202;
            updatedtimeha202 = timeInMillisechaondshaha202;
            sechaondsha202 = (int) (updatedtimeha202 / 1000);
            minutesha202 = sechaondsha202 / 60;
            hoursha202 = minutesha202 / 60;
            sechaondsha202 = sechaondsha202 % 60;
            minutesha202 = minutesha202 % 60;
            secha202 =hoursha202 * 3600 + minutesha202 * 60 + sechaondsha202;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha13 * 60 * 60 + currentMinuteha13 * 60 + redThresholdha202;
            // 计算小时和分钟
            futureHourha13 = totalSeconds / 3600;
            futureMinuteha13 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha13 >= 24) {
                futureHourha13 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha13, currentMinuteha13);
            String futureTimeString = String.format("%02d:%02d", futureHourha13, futureMinuteha13);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"-----" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha02.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha02.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha02();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha203 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha203 = SystemClock.uptimeMillis() - starttimeha203;
            updatedtimeha203 = timeInMillisechaondshaha203;
            sechaondsha203 = (int) (updatedtimeha203 / 1000);
            minutesha203 = sechaondsha203 / 60;
            hoursha203 = minutesha203 / 60;
            sechaondsha203 = sechaondsha203 % 60;
            minutesha203 = minutesha203 % 60;
            secha203 =hoursha203 * 3600 + minutesha203 * 60 + sechaondsha203;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha14 * 60 * 60 + currentMinuteha14 * 60 + redThresholdha203;
            // 计算小时和分钟
            futureHourha14 = totalSeconds / 3600;
            futureMinuteha14 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha14 >= 24) {
                futureHourha14 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha14, currentMinuteha14);
            String futureTimeString = String.format("%02d:%02d", futureHourha14, futureMinuteha14);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"-----" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha03.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha03.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha03();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha204 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha204 = SystemClock.uptimeMillis() - starttimeha204;
            updatedtimeha204 = timeInMillisechaondshaha204;
            sechaondsha204 = (int) (updatedtimeha204 / 1000);
            minutesha204 = sechaondsha204 / 60;
            hoursha204 = minutesha204 / 60;
            sechaondsha204 = sechaondsha204 % 60;
            minutesha204 = minutesha204 % 60;
            secha204 =hoursha204 * 3600 + minutesha204 * 60 + sechaondsha204;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha15 * 60 * 60 + currentMinuteha15 * 60 + redThresholdha204;
            // 计算小时和分钟
            futureHourha15 = totalSeconds / 3600;
            futureMinuteha15 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha15 >= 24) {
                futureHourha15 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha15, currentMinuteha15);
            String futureTimeString = String.format("%02d:%02d", futureHourha15, futureMinuteha15);


// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha04.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha04.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha04();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha26KK = new Runnable() {
        public void run() {
            timeInMillisechaondshaha26KK = SystemClock.uptimeMillis() - starttimeha26KK;
            updatedtimeha26KK = timeInMillisechaondshaha26KK;
            sechaondsha26KK = (int) (updatedtimeha26KK / 1000);
            minutesha26KK = sechaondsha26KK / 60;
            hoursha26KK = minutesha26KK / 60;
            sechaondsha26KK = sechaondsha26KK % 60;
            minutesha26KK = minutesha26KK % 60;
            secha26KK =hoursha26KK * 3600 + minutesha26KK * 60 + sechaondsha26KK;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha6KK * 60 * 60 + currentMinuteha26KK * 60 + redThresholdha26KK;
            // 计算小时和分钟
            futureHourha2haha6KK = totalSeconds / 3600;
            futureMinuteha26KK = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha6KK >= 24) {
                futureHourha2haha6KK %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha6KK, currentMinuteha26KK);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha6KK, futureMinuteha26KK);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha6KK.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha6KK.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha6KK();
            handlerhaha1.postDelayed(this, 1000);
        }
    };


    public class CustomArrayAdapter extends ArrayAdapter<String> {
        private Context context;
        private String[] options;
        private int textSize; // 字体大小字段

        public CustomArrayAdapter(Context context, String[] options, int textSize) {
            super(context, R.layout.custom_dialog_layout, options);
            this.context = context;
            this.options = options;
            this.textSize = textSize; // 设置字体大小
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.custom_dialog_layout, parent, false);

            TextView textView = rowView.findViewById(R.id.dialogTitle);
            textView.setText(options[position]);

            // 根据选项文本设置字体大小
            if (options[position].equals("30秒") || options[position].equals("60秒")) {
                textView.setTextSize(textSize); // 设置大字体大小
            } else {
                textView.setTextSize(textSize - 4); // 设置较小字体大小
            }

            return rowView;
        }
    }

    private void showTimeDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("1號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime1(time1);//time1

                    if(secha1 >= blueThresholdha1){
                        flashingha1 = true;
                        updateButtonColorha1();
                    }
                    if(flashinghag1){
                        flashinghag1 = false;
                        updateButtonColorha1();
                    }

                    break;
                case "60分鐘":
                    addtime1(time2);//time2

                    if(secha1 >= blueThresholdha1){
                        flashingha1 = true;
                        updateButtonColorha1();
                    }
                    if(flashinghag1){
                        flashinghag1 = false;
                        updateButtonColorha1();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("2號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime2(time1);

                    if (secha2 >= blueThresholdha2) {
                        flashingha2 = true;
                        updateButtonColorha2haha();
                    }

                    if (flashinghag2) {
                        flashinghag2 = false;
                        updateButtonColorha2haha();
                    }
                    break;
                case "60分鐘":
                    addtime2(time2);
                    if (secha2 >= blueThresholdha2) {
                        flashingha2 = true;
                        updateButtonColorha2haha();
                    }

                    if (flashinghag2) {
                        flashinghag2 = false;
                        updateButtonColorha2haha();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("5號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime3(time1); // Customize the time for buttonh 3


                    if (secha3 >= blueThresholdha3) {
                        flashingha3 = true;
                        updateButtonColorha3haha();
                    }

                    if (flashinghag3) {
                        flashinghag3 = false;
                        updateButtonColorha3haha();
                    }

                    break;
                case "60分鐘":
                    addTime3(time2); // Customize the time for buttonh 3

                    if (secha3 >= blueThresholdha3) {
                        flashingha3 = true;
                        updateButtonColorha3haha();
                    }
                    if (flashinghag3) {
                        flashinghag3 = false;
                        updateButtonColorha3haha();
                    }

                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("7號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime4(time1); // Customize the time for buttonh 4


                    if (secha4 >= blueThresholdha4) {
                        flashingha4 = true;
                        updateButtonColorha4();
                    }
                    if (flashinghag4) {
                        flashinghag4 = false;
                        updateButtonColorha4();
                    }
                    break;
                case "60分鐘":
                    addTime4(time2); // Customize the time for buttonh 4


                    if (secha4 >= blueThresholdha4) {
                        flashingha4 = true;
                        updateButtonColorha4();
                    }
                    if (flashinghag4) {
                        flashinghag4 = false;
                        updateButtonColorha4();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("8號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime5(time1); // Customize the time for buttonh 5



                    if (secha5 >= blueThresholdha5) {
                        flashingha5 = true;
                        updateButtonColorha5();
                    }
                    if (flashinghag5) {
                        flashinghag5 = false;
                        updateButtonColorha5();
                    }
                    break;
                case "60分鐘":
                    addTime5(time2); // Customize the time for buttonh 5

                    if (secha5 >= blueThresholdha5) {
                        flashingha5 = true;
                        updateButtonColorha5();
                    }
                    if (flashinghag5) {
                        flashinghag5 = false;
                        updateButtonColorha5();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }



    private void showTimeDialogForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("10號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime7(time1); // Customize the time for buttonh 7



                    if (secha7 >= blueThresholdha7) {
                        flashingha7 = true;
                        updateButtonColorha7();
                    }
                    if (flashinghag7) {
                        flashinghag7 = false;
                        updateButtonColorha7();
                    }
                    break;
                case "60分鐘":
                    addTime7(time2); // Customize the time for buttonh 7

                    if (secha7 >= blueThresholdha7) {
                        flashingha7 = true;
                        updateButtonColorha7();
                    }
                    if (flashinghag7) {
                        flashinghag7 = false;
                        updateButtonColorha7();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("11號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime8(time1); // Customize the time for buttonh 8


                    if (secha8 >= blueThresholdha8) {
                        flashingha8 = true;
                        updateButtonColorha8();
                    }
                    if (flashinghag8) {
                        flashinghag8 = false;
                        updateButtonColorha8();
                    }
                    break;
                case "60分鐘":
                    addTime8(time2); // Customize the time for buttonh 8

                    if (secha8 >= blueThresholdha8) {
                        flashingha8 = true;
                        updateButtonColorha8();
                    }
                    if (flashinghag8) {
                        flashinghag8 = false;
                        updateButtonColorha8();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("12號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime9(time1); // Customize the time for buttonh 9

                    if (secha9 >= blueThresholdha9) {
                        flashingha9 = true;
                        updateButtonColorha9();
                    }
                    if (flashinghag9) {
                        flashinghag9 = false;
                        updateButtonColorha9();
                    }
                    break;
                case "60分鐘":
                    addTime9(time2); // Customize the time for buttonh 9

                    if (secha9 >= blueThresholdha9) {
                        flashingha9 = true;
                        updateButtonColorha9();
                    }
                    if (flashinghag9) {
                        flashinghag9 = false;
                        updateButtonColorha9();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("13號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime10(time1); // Customize the time for buttonh 10


                    if (secha10 >= blueThresholdha10) {
                        flashingha10 = true;
                        updateButtonColorha10();
                    }
                    if (flashinghag10) {
                        flashinghag10 = false;
                        updateButtonColorha10();
                    }
                    break;
                case "60分鐘":
                    addtime10(time2); // Customize the time for buttonh 10

                    if (secha10 >= blueThresholdha10) {
                        flashingha10 = true;
                        updateButtonColorha10();
                    }
                    if (flashinghag10) {
                        flashinghag10 = false;
                        updateButtonColorha10();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("15號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime11(time1); // Customize the time for buttonh 11




                    if (secha11 >= blueThresholdha11) {
                        flashingha11 = true;
                        updateButtonColorha11();
                    }
                    if (flashinghag11) {
                        flashinghag11 = false;
                        updateButtonColorha11();
                    }
                    break;
                case "60分鐘":
                    addtime11(time2); // Customize the time for buttonh 11


                    if (secha11 >= blueThresholdha11) {
                        flashingha11 = true;
                        updateButtonColorha11();
                    }
                    if (flashinghag11) {
                        flashinghag11 = false;
                        updateButtonColorha11();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton16() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("16號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime16(time1); // Customize the time for buttonh 16

                    if (secha16 >= blueThresholdha16) {
                        flashingha16 = true;
                        updateButtonColorha16();
                    }
                    if (flashinghag16) {
                        flashinghag16 = false;
                        updateButtonColorha16();
                    }
                    break;
                case "60分鐘":
                    addtime16(time2); // Customize the time for buttonh 16

                    if (secha16 >= blueThresholdha16) {
                        flashingha16 = true;
                        updateButtonColorha16();
                    }
                    if (flashinghag16) {
                        flashinghag16 = false;
                        updateButtonColorha16();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton17() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("17號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime17(time1); // Customize the time for buttonh 17



                    if (secha17 >= blueThresholdha17) {
                        flashingha17 = true;
                        updateButtonColorha17();
                    }
                    if (flashinghag17) {
                        flashinghag17 = false;
                        updateButtonColorha17();
                    }

                    break;
                case "60分鐘":
                    addtime17(time2); // Customize the time for buttonh 17

                    if (secha17 >= blueThresholdha17) {
                        flashingha17 = true;
                        updateButtonColorha17();
                    }
                    if (flashinghag17) {
                        flashinghag17 = false;
                        updateButtonColorha17();
                    }

                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton18() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("18號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime18(time1); // Customize the time for buttonh 18


                    if (secha18 >= blueThresholdha18) {
                        flashingha18 = true;
                        updateButtonColorha18();
                    }
                    if (flashinghag18) {
                        flashinghag18 = false;
                        updateButtonColorha18();
                    }
                    break;
                case "60分鐘":
                    addtime18(time2); // Customize the time for buttonh 18

                    if (secha18 >= blueThresholdha18) {
                        flashingha18 = true;
                        updateButtonColorha18();
                    }
                    if (flashinghag18) {
                        flashinghag18 = false;
                        updateButtonColorha18();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton19() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("19號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime19(time1); // Customize the time for buttonh 19


                    if (secha19 >= blueThresholdha19) {
                        flashingha19 = true;
                        updateButtonColorha19();
                    }
                    if (flashinghag19) {
                        flashinghag19 = false;
                        updateButtonColorha19();
                    }
                    break;
                case "60分鐘":
                    addtime19(time2); // Customize the time for buttonh 19

                    if (secha19 >= blueThresholdha19) {
                        flashingha19 = true;
                        updateButtonColorha19();
                    }
                    if (flashinghag19) {
                        flashinghag19 = false;
                        updateButtonColorha19();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton20() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("20號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime20(time1); // Customize the time for buttonh 20


                    if (secha20 >= blueThresholdha20) {
                        flashingha20 = true;
                        updateButtonColorha2haha0();
                    }
                    if (flashinghag20) {
                        flashinghag20 = false;
                        updateButtonColorha2haha0();
                    }
                    break;
                case "60分鐘":
                    addtime20(time2); // Customize the time for buttonh 20

                    if (secha20 >= blueThresholdha20) {
                        flashingha20 = true;
                        updateButtonColorha2haha0();
                    }
                    if (flashinghag20) {
                        flashinghag20 = false;
                        updateButtonColorha2haha0();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton21() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("21號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime21(time1); // Customize the time for buttonh 21



                    if (secha21 >= blueThresholdha21) {
                        flashingha21 = true;
                        updateButtonColorha2haha1();
                    }
                    if (flashinghag21) {
                        flashinghag21 = false;
                        updateButtonColorha2haha1();
                    }
                    break;
                case "60分鐘":
                    addtime21(time2); // Customize the time for buttonh 21

                    if (secha21 >= blueThresholdha21) {
                        flashingha21 = true;
                        updateButtonColorha2haha1();
                    }
                    if (flashinghag21) {
                        flashinghag21 = false;
                        updateButtonColorha2haha1();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton22() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("22號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime22(time1); // Customize the time for buttonh 22

                    if (secha22 >= blueThresholdha22) {
                        flashingha22 = true;
                        updateButtonColorha2haha2();
                    }
                    if (flashinghag22) {
                        flashinghag22 = false;
                        updateButtonColorha2haha2();
                    }
                    break;
                case "60分鐘":
                    addtime22(time2); // Customize the time for buttonh 22

                    if (secha22 >= blueThresholdha22) {
                        flashingha22 = true;
                        updateButtonColorha2haha2();
                    }
                    if (flashinghag22) {
                        flashinghag22 = false;
                        updateButtonColorha2haha2();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton23() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("23號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime23(time1); // Customize the time for buttonh 23


                    if (secha23 >= blueThresholdha23) {
                        flashingha23 = true;
                        updateButtonColorha2haha3();
                    }
                    if (flashinghag23) {
                        flashinghag23 = false;
                        updateButtonColorha2haha3();
                    }
                    break;
                case "60分鐘":
                    addtime23(time2); // Customize the time for buttonh 23

                    if (secha23 >= blueThresholdha23) {
                        flashingha23 = true;
                        updateButtonColorha2haha3();
                    }
                    if (flashinghag23) {
                        flashinghag23 = false;
                        updateButtonColorha2haha3();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton24() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("25號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime24(time1); // Customize the time for buttonh 24

                    if (secha24 >= blueThresholdha24) {
                        flashingha24 = true;
                        updateButtonColorha2haha4();
                    }
                    if (flashinghag24) {
                        flashinghag24 = false;
                        updateButtonColorha2haha4();
                    }
                    break;
                case "60分鐘":
                    addtime24(time2); // Customize the time for buttonh 24

                    if (secha24 >= blueThresholdha24) {
                        flashingha24 = true;
                        updateButtonColorha2haha4();
                    }
                    if (flashinghag24) {
                        flashinghag24 = false;
                        updateButtonColorha2haha4();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton25() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("26號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime25(time1); // Customize the time for buttonh 25



                    if (secha25 >= blueThresholdha25) {
                        flashingha25 = true;
                        updateButtonColorha2haha5();
                    }
                    if (flashinghag25) {
                        flashinghag25 = false;
                        updateButtonColorha2haha5();
                    }
                    break;
                case "60分鐘":
                    addtime25(time2); // Customize the time for buttonh 25

                    if (secha25 >= blueThresholdha25) {
                        flashingha25 = true;
                        updateButtonColorha2haha5();
                    }
                    if (flashinghag25) {
                        flashinghag25 = false;
                        updateButtonColorha2haha5();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton27KK() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("28號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime27KK(time1); // Customize the time for buttonh 27KK



                    if (secha27KK >= blueThresholdha27KK) {
                        flashingha27KK = true;
                        updateButtonColorha2haha7KK();
                    }
                    if (flashinghag27KK) {
                        flashinghag27KK = false;
                        updateButtonColorha2haha7KK();
                    }
                    break;
                case "60分鐘":
                    addtime27KK(time2); // Customize the time for buttonh 27KK

                    if (secha27KK >= blueThresholdha27KK) {
                        flashingha27KK = true;
                        updateButtonColorha2haha7KK();
                    }
                    if (flashinghag27KK) {
                        flashinghag27KK = false;
                        updateButtonColorha2haha7KK();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton28KK() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("29號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime28KK(time1); // Customize the time for buttonh 28KK



                    if (secha28KK >= blueThresholdha28KK) {
                        flashingha28KK = true;
                        updateButtonColorha2haha8KK();
                    }
                    if (flashinghag28KK) {
                        flashinghag28KK = false;
                        updateButtonColorha2haha8KK();
                    }
                    break;
                case "60分鐘":
                    addtime28KK(time2); // Customize the time for buttonh 28KK

                    if (secha28KK >= blueThresholdha28KK) {
                        flashingha28KK = true;
                        updateButtonColorha2haha8KK();
                    }
                    if (flashinghag28KK) {
                        flashinghag28KK = false;
                        updateButtonColorha2haha8KK();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("9號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime66(time1); // Customize the time for buttonh 66

                    if (secha66 >= blueThresholdha66) {
                        flashingha66 = true;
                        updateButtonColorha66();
                    }

                    if (flashinghag66) {
                        flashinghag66 = false;
                        updateButtonColorha66();
                    }
                    break;
                case "60分鐘":
                    addTime66(time2); // Customize the time for buttonh 66

                    if (secha66 >= blueThresholdha66) {
                        flashingha66 = true;
                        updateButtonColorha66();
                    }
                    if (flashinghag66) {
                        flashinghag66 = false;
                        updateButtonColorha66();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton201() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("201號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime201(time1); // Customize the time for buttonh 28


                    if (secha201 >= blueThresholdha201) {
                        flashingha201 = true;
                        updateButtonColorha2haha01();
                    }
                    if (flashinghag201) {
                        flashinghag201 = false;
                        updateButtonColorha2haha01();
                    }
                    break;
                case "60分鐘":
                    addtime201(time2); // Customize the time for buttonh 28

                    if (secha201 >= blueThresholdha201) {
                        flashingha201 = true;
                        updateButtonColorha2haha01();
                    }
                    if (flashinghag201) {
                        flashinghag201 = false;
                        updateButtonColorha2haha01();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton202() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("202號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime202(time1); // Customize the time for buttonh 28



                    if (secha202 >= blueThresholdha202) {
                        flashingha202 = true;
                        updateButtonColorha2haha02();
                    }
                    if (flashinghag202) {
                        flashinghag202 = false;
                        updateButtonColorha2haha02();
                    }
                    break;
                case "60分鐘":
                    addtime202(time2); // Customize the time for buttonh 28

                    if (secha202 >= blueThresholdha202) {
                        flashingha202 = true;
                        updateButtonColorha2haha02();
                    }
                    if (flashinghag202) {
                        flashinghag202 = false;
                        updateButtonColorha2haha02();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton203() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("203號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime203(time1); // Customize the time for buttonh 28




                    if (secha203 >= blueThresholdha203) {
                        flashingha203 = true;
                        updateButtonColorha2haha03();
                    }
                    if (flashinghag203) {
                        flashinghag203 = false;
                        updateButtonColorha2haha03();
                    }
                    break;
                case "60分鐘":
                    addtime203(time2); // Customize the time for buttonh 28

                    if (secha203 >= blueThresholdha203) {
                        flashingha203 = true;
                        updateButtonColorha2haha03();
                    }
                    if (flashinghag203) {
                        flashinghag203 = false;
                        updateButtonColorha2haha03();
                    }

                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton204() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("205號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime204(time1); // Customize the time for buttonh 28



                    if (secha204 >= blueThresholdha204) {
                        flashingha204 = true;
                        updateButtonColorha2haha04();
                    }
                    if (flashinghag204) {
                        flashinghag204 = false;
                        updateButtonColorha2haha04();
                    }
                    break;
                case "60分鐘":
                    addtime204(time2); // Customize the time for buttonh 28

                    if (secha204 >= blueThresholdha204) {
                        flashingha204 = true;
                        updateButtonColorha2haha04();
                    }
                    if (flashinghag204) {
                        flashinghag204 = false;
                        updateButtonColorha2haha04();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton26KK() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("27號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime26KK(time1); // Customize the time for buttonh 26KK


                    if (secha26KK >= blueThresholdha26KK) {
                        flashingha26KK = true;
                        updateButtonColorha2haha6KK();
                    }
                    if (flashinghag26KK) {
                        flashinghag26KK = false;
                        updateButtonColorha2haha6KK();
                    }
                    break;
                case "60分鐘":
                    addtime26KK(time2); // Customize the time for buttonh 26KK


                    if (secha26KK >= blueThresholdha26KK) {
                        flashingha26KK = true;
                        updateButtonColorha2haha6KK();
                    }
                    if (flashinghag26KK) {
                        flashinghag26KK = false;
                        updateButtonColorha2haha6KK();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void addtime1(int sechaondshaToAdd) {
        //blueThresholdha1 += sechaondshaToAdd;
        yellowThresholdha1 += sechaondshaToAdd;
        redThresholdha1 += sechaondshaToAdd;
        updateButtonColorha1();
    }
    private void addtime2(int sechaondshaToAdd) {
        //blueThresholdha2 += sechaondshaToAdd;
        yellowThresholdha2 += sechaondshaToAdd;
        redThresholdha2 += sechaondshaToAdd;

        updateButtonColorha2haha();
    }

    private void addTime3(int sechaondshaToAdd) {
        //blueThresholdha3 += sechaondshaToAdd; // Customize for buttonh 3
        yellowThresholdha3 += sechaondshaToAdd; // Customize for buttonh 3
        redThresholdha3 += sechaondshaToAdd; // Customize for buttonh 3

        updateButtonColorha3haha();
    }

    private void addTime4(int sechaondshaToAdd) {
        //blueThresholdha4 += sechaondshaToAdd; // Customize for buttonh 4
        yellowThresholdha4 += sechaondshaToAdd; // Customize for buttonh 4
        redThresholdha4 += sechaondshaToAdd; // Customize for buttonh 4

        updateButtonColorha4();
    }
    private void addTime5(int sechaondshaToAdd) {
        //blueThresholdha5 += sechaondshaToAdd; // Customize for buttonh 5
        yellowThresholdha5 += sechaondshaToAdd; // Customize for buttonh 5
        redThresholdha5 += sechaondshaToAdd; // Customize for buttonh 5

        updateButtonColorha5();
    }

    private void addTime7(int sechaondshaToAdd) {
        //blueThresholdha7 += sechaondshaToAdd; // Customize for buttonh 7
        yellowThresholdha7 += sechaondshaToAdd; // Customize for buttonh 7
        redThresholdha7 += sechaondshaToAdd; // Customize for buttonh 7

        updateButtonColorha7();
    }

    private void addTime8(int sechaondshaToAdd) {
        //blueThresholdha8 += sechaondshaToAdd; // Customize for buttonh 8
        yellowThresholdha8 += sechaondshaToAdd; // Customize for buttonh 8
        redThresholdha8 += sechaondshaToAdd; // Customize for buttonh 8

        updateButtonColorha8();
    }

    private void addTime9(int sechaondshaToAdd) {
        //blueThresholdha9 += sechaondshaToAdd; // Customize for buttonh 9
        yellowThresholdha9 += sechaondshaToAdd; // Customize for buttonh 9
        redThresholdha9 += sechaondshaToAdd; // Customize for buttonh 9

        updateButtonColorha9();
    }

    private void addtime10(int sechaondshaToAdd) {
        //blueThresholdha10 += sechaondshaToAdd; // Customize for buttonh 10
        yellowThresholdha10 += sechaondshaToAdd; // Customize for buttonh 10
        redThresholdha10 += sechaondshaToAdd; // Customize for buttonh 10

        updateButtonColorha10();
    }

    private void addtime11(int sechaondshaToAdd) {
        //blueThresholdha11 += sechaondshaToAdd; // Customize for buttonh 11
        yellowThresholdha11 += sechaondshaToAdd; // Customize for buttonh 11
        redThresholdha11 += sechaondshaToAdd; // Customize for buttonh 11

        updateButtonColorha11();
    }
    private void addtime16(int sechaondshaToAdd) {
        //blueThresholdha16 += sechaondshaToAdd; // Customize for buttonh 16
        yellowThresholdha16 += sechaondshaToAdd; // Customize for buttonh 16
        redThresholdha16 += sechaondshaToAdd; // Customize for buttonh 16

        updateButtonColorha16();
    }

    private void addtime17(int sechaondshaToAdd) {
        //blueThresholdha17 += sechaondshaToAdd; // Customize for buttonh 17
        yellowThresholdha17 += sechaondshaToAdd; // Customize for buttonh 17
        redThresholdha17 += sechaondshaToAdd; // Customize for buttonh 17

        updateButtonColorha17();
    }

    private void addtime18(int sechaondshaToAdd) {
        //blueThresholdha18 += sechaondshaToAdd; // Customize for buttonh 18
        yellowThresholdha18 += sechaondshaToAdd; // Customize for buttonh 18
        redThresholdha18 += sechaondshaToAdd; // Customize for buttonh 18

        updateButtonColorha18();

    }

    private void addtime19(int sechaondshaToAdd) {
        //blueThresholdha19 += sechaondshaToAdd; // Customize for buttonh 19
        yellowThresholdha19 += sechaondshaToAdd; // Customize for buttonh 19
        redThresholdha19 += sechaondshaToAdd; // Customize for buttonh 19

        updateButtonColorha19();

    }

    private void addtime20(int sechaondshaToAdd) {
        //blueThresholdha20 += sechaondshaToAdd; // Customize for buttonh 20
        yellowThresholdha20 += sechaondshaToAdd; // Customize for buttonh 20
        redThresholdha20 += sechaondshaToAdd; // Customize for buttonh 20

        updateButtonColorha2haha0();
    }

    private void addtime21(int sechaondshaToAdd) {
        //blueThresholdha21 += sechaondshaToAdd; // Customize for buttonh 21
        yellowThresholdha21 += sechaondshaToAdd; // Customize for buttonh 21
        redThresholdha21 += sechaondshaToAdd; // Customize for buttonh 21


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha1();
    }

    private void addtime22(int sechaondshaToAdd) {
        //blueThresholdha22 += sechaondshaToAdd; // Customize for buttonh 22
        yellowThresholdha22 += sechaondshaToAdd; // Customize for buttonh 22
        redThresholdha22 += sechaondshaToAdd; // Customize for buttonh 22


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha2();
    }

    private void addtime23(int sechaondshaToAdd) {
        //blueThresholdha23 += sechaondshaToAdd; // Customize for buttonh 23
        yellowThresholdha23 += sechaondshaToAdd; // Customize for buttonh 23
        redThresholdha23 += sechaondshaToAdd; // Customize for buttonh 23


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha3();
    }

    private void addtime24(int sechaondshaToAdd) {
        //blueThresholdha24 += sechaondshaToAdd; // Customize for buttonh 24
        yellowThresholdha24 += sechaondshaToAdd; // Customize for buttonh 24
        redThresholdha24 += sechaondshaToAdd; // Customize for buttonh 24


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha4();
    }

    private void addtime25(int sechaondshaToAdd) {
        //blueThresholdha25 += sechaondshaToAdd; // Customize for buttonh 25
        yellowThresholdha25 += sechaondshaToAdd; // Customize for buttonh 25
        redThresholdha25 += sechaondshaToAdd; // Customize for buttonh 25


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha5();
    }
/*
    private void addtime266(int sechaondshaToAdd) {
        //blueThresholdha266 += sechaondshaToAdd; // Customize for buttonh 266
        yellowThresholdha266 += sechaondshaToAdd; // Customize for buttonh 266
        redThresholdha266 += sechaondshaToAdd; // Customize for buttonh 266


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha6();
    }
*/
    private void addtime27KK(int sechaondshaToAdd) {
        //blueThresholdha27 += sechaondshaToAdd; // Customize for buttonh 27
        yellowThresholdha27KK += sechaondshaToAdd; // Customize for buttonh 27
        redThresholdha27KK += sechaondshaToAdd; // Customize for buttonh 27


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha7KK();
    }

    private void addtime28KK(int sechaondshaToAdd) {
        //blueThresholdha28 += sechaondshaToAdd; // Customize for buttonh 28
        yellowThresholdha28KK += sechaondshaToAdd; // Customize for buttonh 28
        redThresholdha28KK += sechaondshaToAdd; // Customize for buttonh 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha8KK();
    }
    private void addTime66(int sechaondshaToAdd) {
        //blueThresholdha66 += sechaondshaToAdd; // Customize for buttonh 66
        yellowThresholdha66 += sechaondshaToAdd; // Customize for buttonh 66
        redThresholdha66 += sechaondshaToAdd; // Customize for buttonh 66


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha66();
    }
    private void addtime201(int sechaondshaToAdd) {
        //blueThresholdha201 += sechaondshaToAdd; // Customize for buttonh 28
        yellowThresholdha201 += sechaondshaToAdd; // Customize for buttonh 28
        redThresholdha201 += sechaondshaToAdd; // Customize for buttonh 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha01();
    }
    private void addtime202(int sechaondshaToAdd) {
        //blueThresholdha202 += sechaondshaToAdd; // Customize for buttonh 28
        yellowThresholdha202 += sechaondshaToAdd; // Customize for buttonh 28
        redThresholdha202 += sechaondshaToAdd; // Customize for buttonh 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha02();
    }
    private void addtime203(int sechaondshaToAdd) {
        //blueThresholdha203 += sechaondshaToAdd; // Customize for buttonh 28
        yellowThresholdha203 += sechaondshaToAdd; // Customize for buttonh 28
        redThresholdha203 += sechaondshaToAdd; // Customize for buttonh 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha03();
    }
    private void addtime204(int sechaondshaToAdd) {
        //blueThresholdha204 += sechaondshaToAdd; // Customize for buttonh 28
        yellowThresholdha204 += sechaondshaToAdd; // Customize for buttonh 28
        redThresholdha204 += sechaondshaToAdd; // Customize for buttonh 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha04();
    }

    private void addtime26KK(int sechaondshaToAdd) {
        //blueThresholdha26KK += sechaondshaToAdd; // Customize for buttonh 26KK
        yellowThresholdha26KK += sechaondshaToAdd; // Customize for buttonh 26KK
        redThresholdha26KK += sechaondshaToAdd; // Customize for buttonh 26KK


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha6KK();
    }


    //--------------------------------------------------------------------------

//--------------------------------------------------------------------------


    private void updateButtonColorha1() {
        if (secha1 < 0.01) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha1 < blueThresholdha1 && peopleha3_1) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha1 < blueThresholdha1 && !peopleha3_1 ) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha1 < yellowThresholdha1 && peopleha3_1) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingha1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha1.startAnimation(blinkAnimation);
            }else{
                btnTimerha1.clearAnimation();
            }
        } else if (secha1 < yellowThresholdha1 && !peopleha3_1) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha1 < redThresholdha1) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinghag1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha1.startAnimation(blinkAnimation);
            }else{
                btnTimerha1.clearAnimation();
            }
        } else {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha1.clearAnimation();
        }
    }
    private void updateButtonColorha2haha() {
        if (secha2 < 0.01) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha2 < blueThresholdha2 && peopleha3_2) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha2 < blueThresholdha2 && !peopleha3_2 ) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha2 < yellowThresholdha2 && peopleha3_2) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingha2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha.clearAnimation();
            }
        } else if (secha2 < yellowThresholdha2 && !peopleha3_2) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha2 < redThresholdha2) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinghag2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha.clearAnimation();
            }
        } else {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha.clearAnimation();
        }
    }

    private void updateButtonColorha3haha() {
        if (secha3 < 0.01) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha3 < blueThresholdha3 && peopleha3_3) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha3 < blueThresholdha3 && !peopleha3_3 ) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha3 < yellowThresholdha3 && peopleha3_3) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha3haha.startAnimation(blinkAnimation);
            }else{
                btnTimerha3haha.clearAnimation();
            }


        } else if (secha3 < yellowThresholdha3 && !peopleha3_3) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha3 < redThresholdha3) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha3haha.startAnimation(blinkAnimation);
            }else{
                btnTimerha3haha.clearAnimation();
            }


        } else {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha3haha.clearAnimation();
        }
    }

    private void updateButtonColorha4() {
        if (secha4 < 0.01) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha4 < blueThresholdha4 && peopleha3_4) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha4 < blueThresholdha4 && !peopleha3_4 ) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha4 < yellowThresholdha4 && peopleha3_4) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha4.startAnimation(blinkAnimation);
            }else{
                btnTimerha4.clearAnimation();
            }


        } else if (secha4 < yellowThresholdha4 && !peopleha3_4) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha4 < redThresholdha4) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha4.startAnimation(blinkAnimation);
            }else{
                btnTimerha4.clearAnimation();
            }


        } else {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha4.clearAnimation();
        }
    }
    private void updateButtonColorha5() {
        if (secha5 < 0.01) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha5 < blueThresholdha5 && peopleha3_5) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha5 < blueThresholdha5 && !peopleha3_5 ) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha5 < yellowThresholdha5 && peopleha3_5) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha5.startAnimation(blinkAnimation);
            }else{
                btnTimerha5.clearAnimation();
            }


        } else if (secha5 < yellowThresholdha5 && !peopleha3_5) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha5 < redThresholdha5) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha5.startAnimation(blinkAnimation);
            }else{
                btnTimerha5.clearAnimation();
            }


        } else {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha5.clearAnimation();
        }
    }



    private void updateButtonColorha7() {
        if (secha7 < 0.01) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha7 < blueThresholdha7 && peopleha3_7) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha7 < blueThresholdha7 && !peopleha3_7 ) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha7 < yellowThresholdha7 && peopleha3_7) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha7.startAnimation(blinkAnimation);
            }else{
                btnTimerha7.clearAnimation();
            }


        } else if (secha7 < yellowThresholdha7 && !peopleha3_7) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha7 < redThresholdha7) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha7.startAnimation(blinkAnimation);
            }else{
                btnTimerha7.clearAnimation();
            }


        } else {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha7.clearAnimation();
        }
    }

    private void updateButtonColorha8() {
        if (secha8 < 0.01) {
            btnTimerha8.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha8 < blueThresholdha8 && peopleha3_8) {
            btnTimerha8.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha8 < blueThresholdha8 && !peopleha3_8 ) {
            btnTimerha8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha8 < yellowThresholdha8 && peopleha3_8) {
            btnTimerha8.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha8.startAnimation(blinkAnimation);
            }else{
                btnTimerha8.clearAnimation();
            }
        } else if (secha8 < yellowThresholdha8 && !peopleha3_8) {
            btnTimerha8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha8 < redThresholdha8) {
            btnTimerha8.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha8.startAnimation(blinkAnimation);
            }else{
                btnTimerha8.clearAnimation();
            }
        } else {
            btnTimerha8.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha8.clearAnimation();
        }
    }

    private void updateButtonColorha9() {
        if (secha9 < 0.01) {
            btnTimerha9.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha9 < blueThresholdha9 && peopleha3_9) {
            btnTimerha9.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha9 < blueThresholdha9 && !peopleha3_9 ) {
            btnTimerha9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha9 < yellowThresholdha9 && peopleha3_9) {
            btnTimerha9.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha9.startAnimation(blinkAnimation);
            }else{
                btnTimerha9.clearAnimation();
            }


        } else if (secha9 < yellowThresholdha9 && !peopleha3_9) {
            btnTimerha9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha9 < redThresholdha9) {
            btnTimerha9.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha9.startAnimation(blinkAnimation);
            }else{
                btnTimerha9.clearAnimation();
            }


        } else {
            btnTimerha9.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha9.clearAnimation();
        }
    }

    private void updateButtonColorha10() {
        if (secha10 < 0.01) {
            btnTimerha10.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha10 < blueThresholdha10 && peopleha3_10) {
            btnTimerha10.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha10 < blueThresholdha10 && !peopleha3_10 ) {
            btnTimerha10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha10 < yellowThresholdha10 && peopleha3_10) {
            btnTimerha10.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha10.startAnimation(blinkAnimation);
            }else{
                btnTimerha10.clearAnimation();
            }


        } else if (secha10 < yellowThresholdha10 && !peopleha3_10) {
            btnTimerha10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha10 < redThresholdha10) {
            btnTimerha10.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha10.startAnimation(blinkAnimation);
            }else{
                btnTimerha10.clearAnimation();
            }


        } else {
            btnTimerha10.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha10.clearAnimation();
        }
    }

    private void updateButtonColorha11() {
        if (secha11 < 0.01) {
            btnTimerha11.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha11 < blueThresholdha11 && peopleha3_11) {
            btnTimerha11.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha11 < blueThresholdha11 && !peopleha3_11 ) {
            btnTimerha11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha11 < yellowThresholdha11 && peopleha3_11) {
            btnTimerha11.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha11.startAnimation(blinkAnimation);
            }else{
                btnTimerha11.clearAnimation();
            }


        } else if (secha11 < yellowThresholdha11 && !peopleha3_11) {
            btnTimerha11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha11 < redThresholdha11) {
            btnTimerha11.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha11.startAnimation(blinkAnimation);
            }else{
                btnTimerha11.clearAnimation();
            }


        } else {
            btnTimerha11.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha11.clearAnimation();
        }
    }

    private void updateButtonColorha16() {
        if (secha16 < 0.01) {
            btnTimerha16.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha16 < blueThresholdha16 && peopleha3_16) {
            btnTimerha16.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha16 < blueThresholdha16 && !peopleha3_16 ) {
            btnTimerha16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha16 < yellowThresholdha16 && peopleha3_16) {
            btnTimerha16.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha16.startAnimation(blinkAnimation);
            }else{
                btnTimerha16.clearAnimation();
            }


        } else if (secha16 < yellowThresholdha16 && !peopleha3_16) {
            btnTimerha16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha16 < redThresholdha16) {
            btnTimerha16.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha16.startAnimation(blinkAnimation);
            }else{
                btnTimerha16.clearAnimation();
            }


        } else {
            btnTimerha16.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha16.clearAnimation();
        }
    }

    private void updateButtonColorha17() {
        if (secha17 < 0.01) {
            btnTimerha17.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha17 < blueThresholdha17 && peopleha3_17) {
            btnTimerha17.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha17 < blueThresholdha17 && !peopleha3_17 ) {
            btnTimerha17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha17 < yellowThresholdha17 && peopleha3_17) {
            btnTimerha17.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha17.startAnimation(blinkAnimation);
            }else{
                btnTimerha17.clearAnimation();
            }


        } else if (secha17 < yellowThresholdha17 && !peopleha3_17) {
            btnTimerha17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha17 < redThresholdha17) {
            btnTimerha17.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha17.startAnimation(blinkAnimation);
            }else{
                btnTimerha17.clearAnimation();
            }


        } else {
            btnTimerha17.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha17.clearAnimation();
        }
    }

    private void updateButtonColorha18() {
        if (secha18 < 0.01) {
            btnTimerha18.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha18 < blueThresholdha18 && peopleha3_18) {
            btnTimerha18.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha18 < blueThresholdha18 && !peopleha3_18 ) {
            btnTimerha18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha18 < yellowThresholdha18 && peopleha3_18) {
            btnTimerha18.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha18.startAnimation(blinkAnimation);
            }else{
                btnTimerha18.clearAnimation();
            }


        } else if (secha18 < yellowThresholdha18 && !peopleha3_18) {
            btnTimerha18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha18 < redThresholdha18) {
            btnTimerha18.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha18.startAnimation(blinkAnimation);
            }else{
                btnTimerha18.clearAnimation();
            }


        } else {
            btnTimerha18.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha18.clearAnimation();
        }
    }

    private void updateButtonColorha19() {
        if (secha19 < 0.01) {
            btnTimerha19.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha19 < blueThresholdha19 && peopleha3_19) {
            btnTimerha19.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha19 < blueThresholdha19 && !peopleha3_19 ) {
            btnTimerha19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha19 < yellowThresholdha19 && peopleha3_19) {
            btnTimerha19.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha19.startAnimation(blinkAnimation);
            }else{
                btnTimerha19.clearAnimation();
            }


        } else if (secha19 < yellowThresholdha19 && !peopleha3_19) {
            btnTimerha19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha19 < redThresholdha19) {
            btnTimerha19.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha19.startAnimation(blinkAnimation);
            }else{
                btnTimerha19.clearAnimation();
            }


        } else {
            btnTimerha19.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha19.clearAnimation();
        }
    }

    private void updateButtonColorha2haha0() {
        if (secha20 < 0.01) {
            btnTimerha2haha0.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha20 < blueThresholdha20 && peopleha3_20) {
            btnTimerha2haha0.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha20 < blueThresholdha20 && !peopleha3_20 ) {
            btnTimerha2haha0.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha20 < yellowThresholdha20 && peopleha3_20) {
            btnTimerha2haha0.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha0.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha0.clearAnimation();
            }


        } else if (secha20 < yellowThresholdha20 && !peopleha3_20) {
            btnTimerha2haha0.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha20 < redThresholdha20) {
            btnTimerha2haha0.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha0.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha0.clearAnimation();
            }


        } else {
            btnTimerha2haha0.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha0.clearAnimation();
        }
    }

    private void updateButtonColorha2haha1() {
        if (secha21 < 0.01) {
            btnTimerha2haha1.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha21 < blueThresholdha21 && peopleha3_21) {
            btnTimerha2haha1.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha21 < blueThresholdha21 && !peopleha3_21 ) {
            btnTimerha2haha1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha21 < yellowThresholdha21 && peopleha3_21) {
            btnTimerha2haha1.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha1.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha1.clearAnimation();
            }


        } else if (secha21 < yellowThresholdha21 && !peopleha3_21) {
            btnTimerha2haha1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha21 < redThresholdha21) {
            btnTimerha2haha1.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha1.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha1.clearAnimation();
            }


        } else {
            btnTimerha2haha1.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha1.clearAnimation();
        }
    }

    private void updateButtonColorha2haha2() {
        if (secha22 < 0.01) {
            btnTimerha2haha2.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha22 < blueThresholdha22 && peopleha3_22) {
            btnTimerha2haha2.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha22 < blueThresholdha22 && !peopleha3_22 ) {
            btnTimerha2haha2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha22 < yellowThresholdha22 && peopleha3_22) {
            btnTimerha2haha2.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha2.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha2.clearAnimation();
            }


        } else if (secha22 < yellowThresholdha22 && !peopleha3_22) {
            btnTimerha2haha2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha22 < redThresholdha22) {
            btnTimerha2haha2.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha2.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha2.clearAnimation();
            }


        } else {
            btnTimerha2haha2.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha2.clearAnimation();
        }
    }

    private void updateButtonColorha2haha3() {
        if (secha23 < 0.01) {
            btnTimerha2haha3.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha23 < blueThresholdha23 && peopleha3_23) {
            btnTimerha2haha3.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha23 < blueThresholdha23 && !peopleha3_23 ) {
            btnTimerha2haha3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha23 < yellowThresholdha23 && peopleha3_23) {
            btnTimerha2haha3.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha3.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha3.clearAnimation();
            }


        } else if (secha23 < yellowThresholdha23 && !peopleha3_23) {
            btnTimerha2haha3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha23 < redThresholdha23) {
            btnTimerha2haha3.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha3.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha3.clearAnimation();
            }


        } else {
            btnTimerha2haha3.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha3.clearAnimation();
        }
    }

    private void updateButtonColorha2haha4() {
        if (secha24 < 0.01) {
            btnTimerha2haha4.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha24 < blueThresholdha24 && peopleha3_24) {
            btnTimerha2haha4.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha24 < blueThresholdha24 && !peopleha3_24 ) {
            btnTimerha2haha4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha24 < yellowThresholdha24 && peopleha3_24) {
            btnTimerha2haha4.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha4.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha4.clearAnimation();
            }


        } else if (secha24 < yellowThresholdha24 && !peopleha3_24) {
            btnTimerha2haha4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha24 < redThresholdha24) {
            btnTimerha2haha4.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha4.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha4.clearAnimation();
            }


        } else {
            btnTimerha2haha4.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha4.clearAnimation();
        }
    }

    private void updateButtonColorha2haha5() {
        if (secha25 < 0.01) {
            btnTimerha2haha5.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha25 < blueThresholdha25 && peopleha3_25) {
            btnTimerha2haha5.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha25 < blueThresholdha25 && !peopleha3_25 ) {
            btnTimerha2haha5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha25 < yellowThresholdha25 && peopleha3_25) {
            btnTimerha2haha5.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha5.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha5.clearAnimation();
            }


        } else if (secha25 < yellowThresholdha25 && !peopleha3_25) {
            btnTimerha2haha5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha25 < redThresholdha25) {
            btnTimerha2haha5.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha5.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha5.clearAnimation();
            }


        } else {
            btnTimerha2haha5.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha5.clearAnimation();
        }
    }

    private void updateButtonColorha2haha7KK() {
        if (secha27KK < 0.01) {
            btnTimerha2haha7KK.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha27KK < blueThresholdha27KK && peopleha3_27KK) {
            btnTimerha2haha7KK.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha27KK < blueThresholdha27KK && !peopleha3_27KK ) {
            btnTimerha2haha7KK.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha27KK < yellowThresholdha27KK && peopleha3_27KK) {
            btnTimerha2haha7KK.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha27KK ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha7KK.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha7KK.clearAnimation();
            }


        } else if (secha27KK < yellowThresholdha27KK && !peopleha3_27KK) {
            btnTimerha2haha7KK.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha27KK < redThresholdha27KK) {
            btnTimerha2haha7KK.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag27KK ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha7KK.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha7KK.clearAnimation();
            }


        } else {
            btnTimerha2haha7KK.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha7KK.clearAnimation();
        }
    }

    private void updateButtonColorha2haha8KK() {
        if (secha28KK < 0.01) {
            btnTimerha2haha8KK.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha28KK < blueThresholdha28KK && peopleha3_28KK) {
            btnTimerha2haha8KK.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha28KK < blueThresholdha28KK && !peopleha3_28KK ) {
            btnTimerha2haha8KK.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha28KK < yellowThresholdha28KK && peopleha3_28KK) {
            btnTimerha2haha8KK.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha28KK ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha8KK.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha8KK.clearAnimation();
            }


        } else if (secha28KK < yellowThresholdha28KK && !peopleha3_28KK) {
            btnTimerha2haha8KK.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha28KK < redThresholdha28KK) {
            btnTimerha2haha8KK.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag28KK ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha8KK.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha8KK.clearAnimation();
            }


        } else {
            btnTimerha2haha8KK.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha8KK.clearAnimation();
        }
    }
    private void updateButtonColorha66() {
        if (secha66 < 0.01) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha66 < blueThresholdha66 && peopleha3_66) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha66 < blueThresholdha66 && !peopleha3_66 ) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha66 < yellowThresholdha66 && peopleha3_66) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha66.startAnimation(blinkAnimation);
            }else{
                btnTimerha66.clearAnimation();
            }


        } else if (secha66 < yellowThresholdha66 && !peopleha3_66) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha66 < redThresholdha66) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha66.startAnimation(blinkAnimation);
            }else{
                btnTimerha66.clearAnimation();
            }


        } else {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha66.clearAnimation();
        }
    }

    private void updateButtonColorha2haha01() {
        if (secha201 < 0.01) {
            btnTimerha2haha01.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha201 < blueThresholdha201 && peopleha3_12) {
            btnTimerha2haha01.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha201 < blueThresholdha201 && !peopleha3_12 ) {
            btnTimerha2haha01.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha201 < yellowThresholdha201 && peopleha3_12) {
            btnTimerha2haha01.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha201 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha01.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha01.clearAnimation();
            }


        } else if (secha201 < yellowThresholdha201 && !peopleha3_12) {
            btnTimerha2haha01.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha201 < redThresholdha201) {
            btnTimerha2haha01.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag201 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha01.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha01.clearAnimation();
            }


        } else {
            btnTimerha2haha01.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha01.clearAnimation();
        }
    }

    private void updateButtonColorha2haha02() {
        if (secha202 < 0.01) {
            btnTimerha2haha02.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha202 < blueThresholdha202 && peopleha3_13) {
            btnTimerha2haha02.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha202 < blueThresholdha202 && !peopleha3_13 ) {
            btnTimerha2haha02.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha202 < yellowThresholdha202 && peopleha3_13) {
            btnTimerha2haha02.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha202 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha02.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha02.clearAnimation();
            }
        } else if (secha202 < yellowThresholdha202 && !peopleha3_13) {
            btnTimerha2haha02.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha202 < redThresholdha202) {
            btnTimerha2haha02.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag202 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha02.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha02.clearAnimation();
            }

        } else {
            btnTimerha2haha02.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha02.clearAnimation();
        }
    }
    private void updateButtonColorha2haha03() {
        if (secha203 < 0.01) {
            btnTimerha2haha03.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha203 < blueThresholdha203 && peopleha3_14) {
            btnTimerha2haha03.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha203 < blueThresholdha203 && !peopleha3_14 ) {
            btnTimerha2haha03.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha203 < yellowThresholdha203 && peopleha3_14) {
            btnTimerha2haha03.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha203 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha03.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha03.clearAnimation();
            }


        } else if (secha203 < yellowThresholdha203 && !peopleha3_14) {
            btnTimerha2haha03.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha203 < redThresholdha203) {
            btnTimerha2haha03.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag203 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha03.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha03.clearAnimation();
            }


        } else {
            btnTimerha2haha03.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha03.clearAnimation();
        }
    }
    private void updateButtonColorha2haha04() {
        if (secha204 < 0.01) {
            btnTimerha2haha04.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha204 < blueThresholdha204 && peopleha3_15) {
            btnTimerha2haha04.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha204 < blueThresholdha204 && !peopleha3_15 ) {
            btnTimerha2haha04.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha204 < yellowThresholdha204 && peopleha3_15) {
            btnTimerha2haha04.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha204 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha04.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha04.clearAnimation();
            }


        } else if (secha204 < yellowThresholdha204 && !peopleha3_15) {
            btnTimerha2haha04.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha204 < redThresholdha204) {
            btnTimerha2haha04.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag204 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha04.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha04.clearAnimation();
            }

        } else {
            btnTimerha2haha04.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha04.clearAnimation();
        }
    }
    private void updateButtonColorha2haha6KK() {
        if (secha26KK < 0.01) {
            btnTimerha2haha6KK.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha26KK < blueThresholdha26KK && peopleha3_26KK) {
            btnTimerha2haha6KK.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha26KK < blueThresholdha26KK && !peopleha3_26KK ) {
            btnTimerha2haha6KK.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha26KK < yellowThresholdha26KK && peopleha3_26KK) {
            btnTimerha2haha6KK.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha26KK ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha6KK.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha6KK.clearAnimation();
            }


        } else if (secha26KK < yellowThresholdha26KK && !peopleha3_26KK) {
            btnTimerha2haha6KK.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha26KK < redThresholdha26KK) {
            btnTimerha2haha6KK.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag26KK ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha6KK.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha6KK.clearAnimation();
            }


        } else {
            btnTimerha2haha6KK.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha6KK.clearAnimation();
        }
    }

}

