//1030 homepageholiday備分
/*package com.example.hotspringtest;


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
    public boolean peopleh2h_1;
    public boolean peopleh2h_2;
    public boolean peopleh2h_3;
    public boolean peopleh2h_4;
    public boolean peopleh2h_5;

    public boolean peopleh2h_7;
    public boolean peopleh2h_8;
    public boolean peopleh2h_9;
    public boolean peopleh2h_10;
    public boolean peopleh2h_11;
    public boolean peopleh2h_12;
    public boolean peopleh2h_13;
    public boolean peopleh2h_14;
    public boolean peopleh2h_15;
    public boolean peopleh2h_16;
    public boolean peopleh2h_17;
    public boolean peopleh2h_18;
    public boolean peopleh2h_19;
    public boolean peopleh2h_20;
    public boolean peopleh2h_21;
    public boolean peopleh2h_22;
    public boolean peopleh2h_23;
    public boolean peopleh2h_24;
    public boolean peopleh2h_25;
    public boolean peopleh2h_26;
    public boolean peopleh2h_27;
    public boolean peopleh2h_28;
    public boolean peopleh2h_66;

    private SharedPreferences sharedPreferences1h;
    private SharedPreferences.Editor editorh1;
    private static final String TIMER_STARTED_KEYh1 = "timer_startedh1";
    private static final String START_TIME_KEY1h = "start_time1hh";
    private static final String ELAPSED_TIME_KEYh1 = "elapsed_timeh1";

    private SharedPreferences sharedPreferences2h;
    private SharedPreferences.Editor editorh2;
    private static final String TIMER_STARTED_KEYh2 = "timer_startedh2";
    private static final String START_TIME_KEY2 = "start_time2h";
    private static final String ELAPSED_TIME_KEYh2 = "elapsed_timeh2";

    private SharedPreferences sharedPreferences3h;
    private SharedPreferences.Editor editorh3;
    private static final String TIMER_STARTED_KEYh3 = "timer_startedh3";
    private static final String START_TIME_KEY3 = "start_time3";
    private static final String ELAPSED_TIME_KEYh3 = "elapsed_timeh3";

    private SharedPreferences sharedPreferences4h;
    private SharedPreferences.Editor editorh4;
    private static final String TIMER_STARTED_KEYh4 = "timer_startedh4";
    private static final String START_TIME_KEY4 = "start_time4";
    private static final String ELAPSED_TIME_KEYh4 = "elapsed_timeh4";
    private SharedPreferences sharedPreferences5h;
    private SharedPreferences.Editor editorh5;
    private static final String TIMER_STARTED_KEYh5 = "timer_startedh5";
    private static final String START_TIME_KEY5 = "start_time5";
    private static final String ELAPSED_TIME_KEYh5 = "elapsed_timeh5";



    private SharedPreferences sharedPreferences7h;
    private SharedPreferences.Editor editorh7;
    private static final String TIMER_STARTED_KEYh7 = "timer_startedh7";
    private static final String START_TIME_KEY7 = "start_time7";
    private static final String ELAPSED_TIME_KEYh7 = "elapsed_timeh7";

    private SharedPreferences sharedPreferences8h;
    private SharedPreferences.Editor editorh8;
    private static final String TIMER_STARTED_KEYh8 = "timer_startedh8";
    private static final String START_TIME_KEY8 = "start_time8";
    private static final String ELAPSED_TIME_KEYh8 = "elapsed_timeh8";

    private SharedPreferences sharedPreferences9h;
    private SharedPreferences.Editor editorh9;
    private static final String TIMER_STARTED_KEYh9 = "timer_startedh9";
    private static final String START_TIME_KEY9 = "start_time9";
    private static final String ELAPSED_TIME_KEYh9 = "elapsed_timeh9";

    private SharedPreferences sharedPreferences1h0h;
    private SharedPreferences.Editor editorh10;
    private static final String TIMER_STARTED_KEYh10 = "timer_startedh10";
    private static final String START_TIME_KEY1h0 = "start_time1hh0";
    private static final String ELAPSED_TIME_KEYh10 = "elapsed_timeh10";

    private SharedPreferences sharedPreferences1h1h;
    private SharedPreferences.Editor editorh11;
    private static final String TIMER_STARTED_KEYh11 = "timer_startedh11";
    private static final String START_TIME_KEY1h1 = "start_time1hh1";
    private static final String ELAPSED_TIME_KEYh11 = "elapsed_timeh11";

    private SharedPreferences sharedPreferences1h2h;
    private SharedPreferences.Editor editorh12;
    private static final String TIMER_STARTED_KEYh12 = "timer_startedh12";
    private static final String START_TIME_KEY1h2 = "start_time1hh2";
    private static final String ELAPSED_TIME_KEYh12 = "elapsed_timeh12";
    private SharedPreferences sharedPreferences1h3h;
    private SharedPreferences.Editor editorh13;
    private static final String TIMER_STARTED_KEYh13 = "timer_startedh13";
    private static final String START_TIME_KEY1h3 = "start_time1hh3";
    private static final String ELAPSED_TIME_KEYh13 = "elapsed_timeh13";

    private SharedPreferences sharedPreferences1h4h;
    private SharedPreferences.Editor editorh14;
    private static final String TIMER_STARTED_KEYh14 = "timer_startedh14";
    private static final String START_TIME_KEY1h4 = "start_time1hh4";
    private static final String ELAPSED_TIME_KEYh14 = "elapsed_timeh14";

    private SharedPreferences sharedPreferences1h5h;
    private SharedPreferences.Editor editorh15;
    private static final String TIMER_STARTED_KEYh15 = "timer_startedh15";
    private static final String START_TIME_KEY1h5 = "start_time1hh5";
    private static final String ELAPSED_TIME_KEYh15 = "elapsed_timeh15";

    private SharedPreferences sharedPreferences1h6h;
    private SharedPreferences.Editor editorh16;
    private static final String TIMER_STARTED_KEYh16 = "timer_startedh16";
    private static final String START_TIME_KEY1h6 = "start_time1hh6";
    private static final String ELAPSED_TIME_KEYh16 = "elapsed_timeh16";

    private SharedPreferences sharedPreferences1h7h;
    private SharedPreferences.Editor editorh17;
    private static final String TIMER_STARTED_KEYh17 = "timer_startedh17";
    private static final String START_TIME_KEY1h7 = "start_time1hh7";
    private static final String ELAPSED_TIME_KEYh17 = "elapsed_timeh17";

    private SharedPreferences sharedPreferences1h8h;
    private SharedPreferences.Editor editorh18;
    private static final String TIMER_STARTED_KEYh18 = "timer_startedh18";
    private static final String START_TIME_KEY1h8 = "start_time1hh8";
    private static final String ELAPSED_TIME_KEYh18 = "elapsed_timeh18";

    private SharedPreferences sharedPreferences1h9h;
    private SharedPreferences.Editor editorh19;
    private static final String TIMER_STARTED_KEYh19 = "timer_startedh19";
    private static final String START_TIME_KEY1h9 = "start_time1hh9";
    private static final String ELAPSED_TIME_KEYh19 = "elapsed_timeh19";

    private SharedPreferences sharedPreferences2h0h;
    private SharedPreferences.Editor editorh20;
    private static final String TIMER_STARTED_KEYh20 = "timer_startedh20";
    private static final String START_TIME_KEY20 = "start_time2h0";
    private static final String ELAPSED_TIME_KEYh20 = "elapsed_timeh20";


    private SharedPreferences sharedPreferences2h1h;
    private SharedPreferences.Editor editorh21;
    private static final String TIMER_STARTED_KEYh21 = "timer_startedh21";
    private static final String START_TIME_KEY21 = "start_time2h1";
    private static final String ELAPSED_TIME_KEYh21 = "elapsed_timeh21";

    private SharedPreferences sharedPreferences2h2h;
    private SharedPreferences.Editor editorh22;
    private static final String TIMER_STARTED_KEYh22 = "timer_startedh22";
    private static final String START_TIME_KEY22 = "start_time2h2";
    private static final String ELAPSED_TIME_KEYh22 = "elapsed_timeh22";

    private SharedPreferences sharedPreferences2h3h;
    private SharedPreferences.Editor editorh23;
    private static final String TIMER_STARTED_KEYh23 = "timer_startedh23";
    private static final String START_TIME_KEY23 = "start_time2h3";
    private static final String ELAPSED_TIME_KEYh23 = "elapsed_timeh23";

    private SharedPreferences sharedPreferences2h4h;
    private SharedPreferences.Editor editorh24;
    private static final String TIMER_STARTED_KEYh24 = "timer_startedh24";
    private static final String START_TIME_KEY24 = "start_time2h4";
    private static final String ELAPSED_TIME_KEYh24 = "elapsed_timeh24";

    private SharedPreferences sharedPreferences2h5h;
    private SharedPreferences.Editor editorh25;
    private static final String TIMER_STARTED_KEYh25 = "timer_startedh25";
    private static final String START_TIME_KEY25 = "start_time2h5";
    private static final String ELAPSED_TIME_KEYh25 = "elapsed_timeh25";

    private SharedPreferences sharedPreferences2h6h;
    private SharedPreferences.Editor editorh26;
    private static final String TIMER_STARTED_KEYh26 = "timer_startedh26";
    private static final String START_TIME_KEY26 = "start_time2h6";
    private static final String ELAPSED_TIME_KEYh26 = "elapsed_timeh26";

    private SharedPreferences sharedPreferences2h7h;
    private SharedPreferences.Editor editorh27;
    private static final String TIMER_STARTED_KEYh27 = "timer_startedh27";
    private static final String START_TIME_KEY27 = "start_time2h7";
    private static final String ELAPSED_TIME_KEYh27 = "elapsed_timeh27";

    private SharedPreferences sharedPreferences2h8h;
    private SharedPreferences.Editor editorh28;
    private static final String TIMER_STARTED_KEYh28 = "timer_startedh28";
    private static final String START_TIME_KEY28 = "start_time2h8";
    private static final String ELAPSED_TIME_KEYh28 = "elapsed_timeh28";

    private SharedPreferences sharedPreferences6h6h;
    private SharedPreferences.Editor editorh66;
    private static final String TIMER_STARTED_KEYh66 = "timer_startedh66";
    private static final String START_TIME_KEY66 = "start_time66";
    private static final String ELAPSED_TIME_KEYh66 = "elapsed_timeh66";

    private int b2h = 1200;
    private int y2h = 2400;
    private int r2h = 3000;
    private int b3h = 1200;
    private int y3h = 4800;
    private int r3h = 5400;
    private int time1h = 1800;
    private int time2h = 3600;
    private Handler handler1 = new Handler();
    private int originalblueThresholdh2h = b2h;
    private int originalyellowThresholdh2h = y2h;
    private int originalredThresholdh2h = r2h;
    private int originalblueThresholdh3h = b3h;
    private int originalyellowThresholdh3h = y3h;
    private int originalredThresholdh3h = r3h;


    private long startTimeh1 = 0L;
    private long timeInMillisechondshh1 = 0L;
    private long updatedTimeh1 = 0L;
    private int sechondsh1 = 0;
    private int sech1 = 0;
    private int minutesh1 = 0;
    private int hoursh1 = 0;
    private Button btnTimerh1;
    //此為測試用 正式版應改為正確時間
    private int blueThresholdh1 = b2h;   //b2h
    private int yellowThresholdh1 = y2h; //y2h
    private int redThresholdh1 = r2h;    //r2h
    //此為測試用 正式版應改為正確時間
    public int peopleh1;
    private boolean isTimerRunningh1 = false;



    private long startTimeh2 = 0L;
    private long timeInMillisechondshh2 = 0L;
    private long updatedTimeh2 = 0L;
    private int sechondsh2 = 0;
    private int sech2 = 0;
    private int minutesh2 = 0;
    private int hoursh2 = 0;
    private Button btnTimerh2h;
    private int blueThresholdh2 = b2h;
    private int yellowThresholdh2 = y2h;
    private int redThresholdh2 = r2h;
    public int peopleh2h;
    private boolean isTimerRunningh2 = false;


    private long startTimeh3 = 0L;
    private long timeInMillisechondshh3 = 0L;
    private long updatedTimeh3 = 0L;
    private int sechondsh3 = 0;
    private int sech3 = 0;
    private int minutesh3 = 0;
    private int hoursh3 = 0;
    private Button btnTimerh3h;
    private int blueThresholdh3 = b2h;
    private int yellowThresholdh3 = y2h;
    private int redThresholdh3 = r2h;
    public int peopleh3;
    private boolean isTimerRunningh3 = false;


    private long startTimeh4 = 0L;
    private long timeInMillisechondshh4 = 0L;
    private long updatedTimeh4 = 0L;
    private int sechondsh4 = 0;
    private int sech4 = 0;
    private int minutesh4 = 0;
    private int hoursh4 = 0;
    private Button btnTimerh4;
    private int blueThresholdh4 = b2h;
    private int yellowThresholdh4 = y2h;
    private int redThresholdh4 = r2h;
    public int peopleh4;
    private boolean isTimerRunningh4 = false;

    private long startTimeh5 = 0L;
    private long timeInMillisechondshh5 = 0L;
    private long updatedTimeh5 = 0L;
    private int sechondsh5 = 0;
    private int sech5 = 0;
    private int minutesh5 = 0;
    private int hoursh5 = 0;
    private Button btnTimerh5;
    private int blueThresholdh5 = b2h;
    private int yellowThresholdh5 = y2h;
    private int redThresholdh5 = r2h;
    public int peopleh5;
    private boolean isTimerRunningh5 = false;

    private long startTimeh6 = 0L;
    private long timeInMillisechondshh6 = 0L;
    private long updatedTimeh6 = 0L;
    private int sechondsh6 = 0;
    private int sech6 = 0;
    private int minutesh6 = 0;
    private int hoursh6 = 0;
    private Button btnTimerh6;
    private int blueThresholdh6 = b2h;
    private int yellowThresholdh6 = y2h;
    private int redThresholdh6 = r2h;
    public int peopleh6;
    private boolean isTimerRunningh6 = false;

    private long startTimeh7 = 0L;
    private long timeInMillisechondshh7 = 0L;
    private long updatedTimeh7 = 0L;
    private int sechondsh7 = 0;
    private int sech7 = 0;
    private int minutesh7 = 0;
    private int hoursh7 = 0;
    private Button btnTimerh7;
    private int blueThresholdh7 = b2h;
    private int yellowThresholdh7 = y2h;
    private int redThresholdh7 = r2h;
    public int peopleh7;
    private boolean isTimerRunningh7 = false;

    private long startTimeh8 = 0L;
    private long timeInMillisechondshh8 = 0L;
    private long updatedTimeh8 = 0L;
    private int sechondsh8 = 0;
    private int sech8 = 0;
    private int minutesh8 = 0;
    private int hoursh8 = 0;
    private Button btnTimerh8;
    private int blueThresholdh8 = b2h;
    private int yellowThresholdh8 = y2h;
    private int redThresholdh8 = r2h;
    public int peopleh8;
    private boolean isTimerRunningh8 = false;

    private long startTimeh9 = 0L;
    private long timeInMillisechondshh9 = 0L;
    private long updatedTimeh9 = 0L;
    private int sechondsh9 = 0;
    private int sech9 = 0;
    private int minutesh9 = 0;
    private int hoursh9 = 0;
    private Button btnTimerh9;
    private int blueThresholdh9 = b2h;
    private int yellowThresholdh9 = y2h;
    private int redThresholdh9 = r2h;
    public int peopleh9;
    private boolean isTimerRunningh9 = false;

    private long startTimeh10 = 0L;
    private long timeInMillisechondshh10 = 0L;
    private long updatedTimeh10 = 0L;
    private int sechondsh10 = 0;
    private int sech10 = 0;
    private int minutesh10 = 0;
    private int hoursh10 = 0;
    private Button btnTimerh10;
    private int blueThresholdh10 = b2h;
    private int yellowThresholdh10 = y2h;
    private int redThresholdh10 = r2h;
    public int peopleh10;
    private boolean isTimerRunningh10 = false;

    private long startTimeh11 = 0L;
    private long timeInMillisechondshh11 = 0L;
    private long updatedTimeh11 = 0L;
    private int sechondsh11 = 0;
    private int sech11 = 0;
    private int minutesh11 = 0;
    private int hoursh11 = 0;
    private Button btnTimerh11;
    private int blueThresholdh11 = b2h;
    private int yellowThresholdh11 = y2h;
    private int redThresholdh11 = r2h;
    public int peopleh11;
    private boolean isTimerRunningh11 = false;

    private long startTimeh16 = 0L;
    private long timeInMillisechondshh16 = 0L;
    private long updatedTimeh16 = 0L;
    private int sechondsh16 = 0;
    private int sech16 = 0;
    private int minutesh16 = 0;
    private int hoursh16 = 0;
    private Button btnTimerh16;
    private int blueThresholdh16 = b2h;
    private int yellowThresholdh16 = y2h;
    private int redThresholdh16 = r2h;
    public int peopleh16;
    private boolean isTimerRunningh16 = false;

    private long startTimeh17 = 0L;
    private long timeInMillisechondshh17 = 0L;
    private long updatedTimeh17 = 0L;
    private int sechondsh17 = 0;
    private int sech17 = 0;
    private int minutesh17 = 0;
    private int hoursh17 = 0;
    private Button btnTimerh17;
    private int blueThresholdh17 = b2h;
    private int yellowThresholdh17 = y2h;
    private int redThresholdh17 = r2h;
    public int peopleh17;
    private boolean isTimerRunningh17 = false;


    private long startTimeh18 = 0L;
    private long timeInMillisechondshh18 = 0L;
    private long updatedTimeh18 = 0L;
    private int sechondsh18 = 0;
    private int sech18 = 0;
    private int minutesh18 = 0;
    private int hoursh18 = 0;
    private Button btnTimerh18;
    private int blueThresholdh18 = b2h;
    private int yellowThresholdh18 = y2h;
    private int redThresholdh18 = r2h;
    public int peopleh18;
    private boolean isTimerRunningh18 = false;

    private long startTimeh19 = 0L;
    private long timeInMillisechondshh19 = 0L;
    private long updatedTimeh19 = 0L;
    private int sechondsh19 = 0;
    private int sech19 = 0;
    private int minutesh19 = 0;
    private int hoursh19 = 0;
    private Button btnTimerh19;
    private int blueThresholdh19 = b2h;
    private int yellowThresholdh19 = y2h;
    private int redThresholdh19 = r2h;
    public int peopleh19;
    private boolean isTimerRunningh19 = false;

    private long startTimeh20 = 0L;
    private long timeInMillisechondshh20 = 0L;
    private long updatedTimeh20 = 0L;
    private int sechondsh20 = 0;
    private int sech20 = 0;
    private int minutesh20 = 0;
    private int hoursh20 = 0;
    private Button btnTimerh2h0;
    private int blueThresholdh20 = b2h;
    private int yellowThresholdh20 = y2h;
    private int redThresholdh20 = r2h;
    public int peopleh2h0;
    private boolean isTimerRunningh20 = false;


    private long startTimeh21 = 0L;
    private long timeInMillisechondshh21 = 0L;
    private long updatedTimeh21 = 0L;
    private int sechondsh21 = 0;
    private int sech21 = 0;
    private int minutesh21 = 0;
    private int hoursh21 = 0;
    private Button btnTimerh2h1;
    private int blueThresholdh21 = b2h;
    private int yellowThresholdh21 = y2h;
    private int redThresholdh21 = r2h;
    public int peopleh2h1;
    private boolean isTimerRunningh21 = false;

    private long startTimeh22 = 0L;
    private long timeInMillisechondshh22 = 0L;
    private long updatedTimeh22 = 0L;
    private int sechondsh22 = 0;
    private int sech22 = 0;
    private int minutesh22 = 0;
    private int hoursh22 = 0;
    private Button btnTimerh2h2;
    private int blueThresholdh22 = b2h;
    private int yellowThresholdh22 = y2h;
    private int redThresholdh22 = r2h;
    public int peopleh2h2;
    private boolean isTimerRunningh22 = false;

    private long startTimeh23 = 0L;
    private long timeInMillisechondshh23 = 0L;
    private long updatedTimeh23 = 0L;
    private int sechondsh23 = 0;
    private int sech23 = 0;
    private int minutesh23 = 0;
    private int hoursh23 = 0;
    private Button btnTimerh2h3;
    private int blueThresholdh23 = b2h;
    private int yellowThresholdh23 = y2h;
    private int redThresholdh23 = r2h;
    public int peopleh2h3;
    private boolean isTimerRunningh23 = false;

    private long startTimeh24 = 0L;
    private long timeInMillisechondshh24 = 0L;
    private long updatedTimeh24 = 0L;
    private int sechondsh24 = 0;
    private int sech24 = 0;
    private int minutesh24 = 0;
    private int hoursh24 = 0;
    private Button btnTimerh2h4;
    private int blueThresholdh24 = b2h;
    private int yellowThresholdh24 = y2h;
    private int redThresholdh24 = r2h;
    public int peopleh2h4;
    private boolean isTimerRunningh24 = false;


    private long startTimeh25 = 0L;
    private long timeInMillisechondshh25 = 0L;
    private long updatedTimeh25 = 0L;
    private int sechondsh25 = 0;
    private int sech25 = 0;
    private int minutesh25 = 0;
    private int hoursh25 = 0;
    private Button btnTimerh2h5;
    private int blueThresholdh25 = b2h;
    private int yellowThresholdh25 = y2h;
    private int redThresholdh25 = r2h;
    public int peopleh2h5;
    private boolean isTimerRunningh25 = false;

    private long startTimeh26 = 0L;
    private long timeInMillisechondshh26 = 0L;
    private long updatedTimeh26 = 0L;
    private int sechondsh26 = 0;
    private int sech26 = 0;
    private int minutesh26 = 0;
    private int hoursh26 = 0;
    private Button btnTimerh2h6;
    private int blueThresholdh26 = b2h;
    private int yellowThresholdh26 = y2h;
    private int redThresholdh26 = r2h;
    public int peopleh2h6;
    private boolean isTimerRunningh26 = false;

    private long startTimeh27 = 0L;
    private long timeInMillisechondshh27 = 0L;
    private long updatedTimeh27 = 0L;
    private int sechondsh27 = 0;
    private int sech27 = 0;
    private int minutesh27 = 0;
    private int hoursh27 = 0;
    private Button btnTimerh2h7;
    private int blueThresholdh27 = b2h;
    private int yellowThresholdh27 = y2h;
    private int redThresholdh27 = r2h;
    public int peopleh2h7;
    private boolean isTimerRunningh27 = false;

    private long startTimeh28 = 0L;
    private long timeInMillisechondshh28 = 0L;
    private long updatedTimeh28 = 0L;
    private int sechondsh28 = 0;
    private int sech28 = 0;
    private int minutesh28 = 0;
    private int hoursh28 = 0;
    private Button btnTimerh2h8;
    private int blueThresholdh28 = b2h;
    private int yellowThresholdh28 = y2h;
    private int redThresholdh28 = r2h;
    public int peopleh2h8;
    private boolean isTimerRunningh28 = false;

    private long startTimeh66 = 0L;
    private long timeInMillisechondshh66 = 0L;
    private long updatedTimeh66 = 0L;
    private int sechondsh66 = 0;
    private int sech66 = 0;
    private int minutesh66 = 0;
    private int hoursh66 = 0;
    private Button btnTimerh66;
    private int blueThresholdh66 = b2h;
    private int yellowThresholdh66 = y2h;
    private int redThresholdh66 = r2h;
    public int peopleh66;
    private boolean isTimerRunningh66 = false;

    private long startTimeh201 = 0L;
    private long timeInMillisechondshh201 = 0L;
    private long updatedTimeh201 = 0L;
    private int sechondsh201 = 0;
    private int sech201 = 0;
    private int minutesh201 = 0;
    private int hoursh201 = 0;
    private Button btnTimerh2h01;
    private int blueThresholdh201 = b3h;
    private int yellowThresholdh201 = y3h;
    private int redThresholdh201 = r3h;
    public int peopleh2h01;
    private boolean isTimerRunningh201 = false;

    private long startTimeh202 = 0L;
    private long timeInMillisechondshh202 = 0L;
    private long updatedTimeh202 = 0L;
    private int sechondsh202 = 0;
    private int sech202 = 0;
    private int hoursh202 = 0;
    private int minutesh202 = 0;
    private Button btnTimerh2h02;
    private int blueThresholdh202 = b3h;
    private int yellowThresholdh202 = y3h;
    private int redThresholdh202 = r3h;
    public int peopleh2h02;
    private boolean isTimerRunningh202 = false;

    private long startTimeh203 = 0L;
    private long timeInMillisechondshh203 = 0L;
    private long updatedTimeh203 = 0L;
    private int sechondsh203 = 0;
    private int sech203 = 0;
    private int minutesh203 = 0;
    private int hoursh203 = 0;
    private Button btnTimerh2h03;
    private int blueThresholdh203 = b3h;
    private int yellowThresholdh203 = y3h;
    private int redThresholdh203 = r3h;
    public int peopleh2h03;
    private boolean isTimerRunningh203 = false;

    private long startTimeh204 = 0L;
    private long timeInMillisechondshh204 = 0L;
    private long updatedTimeh204 = 0L;
    private int sechondsh204 = 0;
    private int sech204 = 0;
    private int minutesh204 = 0;
    private int hoursh204 = 0;
    private Button btnTimerh2h04;
    private int blueThresholdh204 = b3h;
    private int yellowThresholdh204 = y3h;
    private int redThresholdh204 = r3h;
    public int peopleh2h04;
    private boolean isTimerRunningh204 = false;

    private boolean flashingh1;
    private boolean flashingh2;
    private boolean flashingh3;
    private boolean flashingh4;
    private boolean flashingh5;
    private boolean flashingh6;
    private boolean flashingh7;
    private boolean flashingh8 ;
    private boolean flashingh9 ;
    private boolean flashingh10 ;
    private boolean flashingh11 ;
    private boolean flashingh201 ;
    private boolean flashingh202 ;
    private boolean flashingh203 ;
    private boolean flashingh204 ;
    private boolean flashingh16 ;
    private boolean flashingh17 ;
    private boolean flashingh18 ;
    private boolean flashingh19 ;
    private boolean flashingh20 ;
    private boolean flashingh21 ;
    private boolean flashingh22 ;
    private boolean flashingh23 ;
    private boolean flashingh24 ;
    private boolean flashingh25 ;
    private boolean flashingh26 ;
    private boolean flashingh27 ;
    private boolean flashingh28 ;

    private boolean flashingh66 ;

    private boolean flashinghg1;
    private boolean flashinghg2 ;
    private boolean flashinghg3 ;
    private boolean flashinghg4 ;
    private boolean flashinghg5 ;
    private boolean flashinghg6 ;
    private boolean flashinghg7 ;
    private boolean flashinghg8 ;
    private boolean flashinghg9 ;
    private boolean flashinghg10 ;
    private boolean flashinghg11 ;
    private boolean flashinghg201 ;
    private boolean flashinghg202 ;
    private boolean flashinghg203 ;
    private boolean flashinghg204 ;
    private boolean flashinghg16 ;
    private boolean flashinghg17 ;
    private boolean flashinghg18 ;
    private boolean flashinghg19 ;
    private boolean flashinghg20 ;
    private boolean flashinghg21 ;
    private boolean flashinghg22 ;
    private boolean flashinghg23 ;
    private boolean flashinghg24 ;
    private boolean flashinghg25 ;
    private boolean flashinghg26 ;
    private boolean flashinghg27 ;
    private boolean flashinghg28 ;
    private boolean flashinghg66 ;

    // 獲得現在的時間

    int currentHourh1;
    int currentMinuteh1;

    int currentHourh2h;
    int currentMinuteh2;

    int currentHourh3h;
    int currentMinuteh3;

    int currentHourh4;
    int currentMinuteh4;

    int currentHourh5;
    int currentMinuteh5;

    int currentHourh6;
    int currentMinuteh6;

    int currentHourh7;
    int currentMinuteh7;

    int currentHourh8;
    int currentMinuteh8;

    int currentHourh9;
    int currentMinuteh9;

    int currentHourh10;
    int currentMinuteh10;

    int currentHourh11;
    int currentMinuteh11;

    int currentHourh12;
    int currentMinuteh12;

    int currentHourh13;
    int currentMinuteh13;

    int currentHourh14;
    int currentMinuteh14;

    int currentHourh15;
    int currentMinuteh15;

    int currentHourh16;
    int currentMinuteh16;

    int currentHourh17;
    int currentMinuteh17;

    int currentHourh18;
    int currentMinuteh18;

    int currentHourh19;
    int currentMinuteh19;

    int currentHourh2h0;
    int currentMinuteh20;

    int currentHourh2h1;
    int currentMinuteh21;

    int currentHourh2h2;
    int currentMinuteh22;

    int currentHourh2h3;
    int currentMinuteh23;

    int currentHourh2h4;
    int currentMinuteh24;

    int currentHourh2h5;
    int currentMinuteh25;

    int currentHourh2h6;
    int currentMinuteh26;

    int currentHourh2h7;
    int currentMinuteh27;

    int currentHourh2h8;
    int currentMinuteh28;

    int currentHourh66;
    int currentMinuteh66;

    int futureHourh1;
    int futureMinute1;
    int futureHourh2h;
    int futureMinute2;

    int futureHourh3h;
    int futureMinute3;

    int futureHourh4;
    int futureMinute4;

    int futureHourh5;
    int futureMinute5;

    int futureHourh6;
    int futureMinute6;

    int futureHourh7;
    int futureMinute7;

    int futureHourh8;
    int futureMinute8;

    int futureHourh9;
    int futureMinute9;

    int futureHourh10;
    int futureMinute10;

    int futureHourh11;
    int futureMinute11;

    int futureHourh12;
    int futureMinute12;

    int futureHourh13;
    int futureMinute13;

    int futureHourh14;
    int futureMinute14;

    int futureHourh15;
    int futureMinute15;

    int futureHourh16;
    int futureMinute16;

    int futureHourh17;
    int futureMinute17;

    int futureHourh18;
    int futureMinute18;

    int futureHourh19;
    int futureMinute19;

    int futureHourh2h0;
    int futureMinute20;

    int futureHourh2h1;
    int futureMinute21;

    int futureHourh2h2;
    int futureMinute22;

    int futureHourh2h3;
    int futureMinute23;

    int futureHourh2h4;
    int futureMinute24;

    int futureHourh2h5;
    int futureMinute25;

    int futureHourh2h6;
    int futureMinute26;

    int futureHourh2h7;
    int futureMinute27;

    int futureHourh2h8;
    int futureMinute28;
    int futureHourh66;
    int futureMinute66;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_holiday);

        // 啟動計時器服務
        Intent timerServiceIntenth = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntenth);
        } else {
            startService(timerServiceIntenth);
        }
        // 初始化 SharedPreferences 和 editorh1
        sharedPreferences1h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh1 = sharedPreferences1h.edit();

        // 初始化 SharedPreferences 和 editorh2
        sharedPreferences2h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh2 = sharedPreferences2h.edit();
// 初始化 SharedPreferences 和 editorh3
        sharedPreferences3h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh3 = sharedPreferences3h.edit();

// 初始化 SharedPreferences 和 editorh4
        sharedPreferences4h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh4 = sharedPreferences4h.edit();
        sharedPreferences5h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh5 = sharedPreferences5h.edit();



        sharedPreferences7h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh7 = sharedPreferences7h.edit();

        sharedPreferences8h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh8 = sharedPreferences8h.edit();

        sharedPreferences9h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh9 = sharedPreferences9h.edit();

        sharedPreferences1h0h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh10 = sharedPreferences1h0h.edit();

        sharedPreferences1h1h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh11 = sharedPreferences1h1h.edit();

        sharedPreferences1h2h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh12 = sharedPreferences1h2h.edit();

        sharedPreferences1h3h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh13 = sharedPreferences1h3h.edit();

        sharedPreferences1h4h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh14 = sharedPreferences1h4h.edit();

        sharedPreferences1h5h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh15 = sharedPreferences1h5h.edit();

        sharedPreferences1h6h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh16 = sharedPreferences1h6h.edit();

        sharedPreferences1h7h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh17 = sharedPreferences1h7h.edit();

        sharedPreferences1h8h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh18 = sharedPreferences1h8h.edit();

        sharedPreferences1h9h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh19 = sharedPreferences1h9h.edit();

        sharedPreferences2h0h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh20 = sharedPreferences2h0h.edit();

        sharedPreferences2h1h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh21 = sharedPreferences2h1h.edit();

        sharedPreferences2h2h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh22 = sharedPreferences2h2h.edit();

        sharedPreferences2h3h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh23 = sharedPreferences2h3h.edit();

        sharedPreferences2h4h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh24 = sharedPreferences2h4h.edit();

        sharedPreferences2h5h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh25 = sharedPreferences2h5h.edit();

        sharedPreferences2h6h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh26 = sharedPreferences2h6h.edit();

        sharedPreferences2h7h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh27 = sharedPreferences2h7h.edit();

        sharedPreferences2h8h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh28 = sharedPreferences2h8h.edit();

        sharedPreferences6h6h = PreferenceManager.getDefaultSharedPreferences(this);
        editorh66 = sharedPreferences6h6h.edit();



        btnTimerh1 = findViewById(R.id.buttonn1);
        btnTimerh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh1){
                    showConfirmationDialogForButton1();
                    isTimerRunningh1 = true;
                    updateButtonColor1(); // 更新颜色
                } else if (isTimerRunningh1) {
                    if (sech1 < blueThresholdh1) {
                        updateButtonColor1();
                        showConfirmationDialogYNForButton1();
                    } else if (blueThresholdh1 <= sech1  && sech1 < yellowThresholdh1  ) {
                        if(!flashingh1){
                            flashingh1 = true; // 停止蓝色闪烁
                            updateButtonColor1();
                        } else if (flashingh1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (yellowThresholdh1 <= sech1  && sech1 < redThresholdh1) {
                        if(!flashinghg1){
                            flashinghg1 = true; // 停止黄色闪烁
                            updateButtonColor1();
                        } else if (flashinghg1) {
                            updateButtonColor1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (sech1 >= redThresholdh1) {
                        updateButtonColor1();
                        showConfirmationDialogYNForButton1();
                    }
                }
            }
        });

        btnTimerh1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton1();
                return true;
            }
        });

        btnTimerh2h = findViewById(R.id.buttonn2);
        btnTimerh2h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh2){
                    showConfirmationDialogForButton2();
                    isTimerRunningh2 = true;
                    updateButtonColor2h(); // 更新颜色
                } else if (isTimerRunningh2) {
                    if (sech2 < blueThresholdh2) {
                        updateButtonColor2h();
                        showConfirmationDialogYNForButton2();
                    } else if (blueThresholdh2 <= sech2  && sech2 < yellowThresholdh2  ) {
                        if(!flashingh2){
                            flashingh2 = true; // 停止蓝色闪烁
                            updateButtonColor2h();
                        } else if (flashingh2) {
                            updateButtonColor2h();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (yellowThresholdh2 <= sech2  && sech2 < redThresholdh2) {
                        if(!flashinghg2){
                            flashinghg2 = true; // 停止黄色闪烁
                            updateButtonColor2h();
                        } else if (flashinghg2) {
                            updateButtonColor2h();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (sech2 >= redThresholdh2) {
                        updateButtonColor2h();
                        showConfirmationDialogYNForButton2();
                    }
                }
            }
        });

        btnTimerh2h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton2();
                return true;
            }
        });


        btnTimerh3h = findViewById(R.id.buttonn3);
        btnTimerh3h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh3){
                    showConfirmationDialogForButton3();
                    isTimerRunningh3 = true;
                    updateButtonColor3h(); // 更新颜色
                } else if (isTimerRunningh3) {
                    if (sech3 < blueThresholdh3) {
                        updateButtonColor3h();
                        showConfirmationDialogYNForButton3();
                    } else if (blueThresholdh3 <= sech3  && sech3 < yellowThresholdh3  ) {
                        if(!flashingh3){
                            flashingh3 = true; // 停止蓝色闪烁
                            updateButtonColor3h();
                        } else if (flashingh3) {
                            updateButtonColor3h();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (yellowThresholdh3 <= sech3  && sech3 < redThresholdh3) {
                        if(!flashinghg3){
                            flashinghg3 = true; // 停止黄色闪烁
                            updateButtonColor3h();
                        } else if (flashinghg3) {
                            updateButtonColor3h();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (sech3 >= redThresholdh3) {
                        updateButtonColor3h();
                        showConfirmationDialogYNForButton3();
                    }
                }
            }
        });

        btnTimerh3h.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton3();
                return true;
            }
        });

        btnTimerh4 = findViewById(R.id.buttonn4);
        btnTimerh4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh4){
                    showConfirmationDialogForButton4();
                    isTimerRunningh4 = true;
                    updateButtonColor4(); // 更新颜色
                } else if (isTimerRunningh4) {
                    if (sech4 < blueThresholdh4) {
                        updateButtonColor4();
                        showConfirmationDialogYNForButton4();
                    } else if (blueThresholdh4 <= sech4  && sech4 < yellowThresholdh4  ) {
                        if(!flashingh4){
                            flashingh4 = true; // 停止蓝色闪烁
                            updateButtonColor4();
                        } else if (flashingh4) {
                            updateButtonColor4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (yellowThresholdh4 <= sech4  && sech4 < redThresholdh4) {
                        if(!flashinghg4){
                            flashinghg4 = true; // 停止黄色闪烁
                            updateButtonColor4();
                        } else if (flashinghg4) {
                            updateButtonColor4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (sech4 >= redThresholdh4) {
                        updateButtonColor4();
                        showConfirmationDialogYNForButton4();
                    }
                }
            }
        });

        btnTimerh4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton4();
                return true;
            }
        });

        btnTimerh5 = findViewById(R.id.buttonn5);
        btnTimerh5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh5){
                    showConfirmationDialogForButton5();
                    isTimerRunningh5 = true;
                    updateButtonColor5(); // 更新颜色
                } else if (isTimerRunningh5) {
                    if (sech5 < blueThresholdh5) {
                        updateButtonColor5();
                        showConfirmationDialogYNForButton5();
                    } else if (blueThresholdh5 <= sech5  && sech5 < yellowThresholdh5  ) {
                        if(!flashingh5){
                            flashingh5 = true; // 停止蓝色闪烁
                            updateButtonColor5();
                        } else if (flashingh5) {
                            updateButtonColor5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (yellowThresholdh5 <= sech5  && sech5 < redThresholdh5) {
                        if(!flashinghg5){
                            flashinghg5 = true; // 停止黄色闪烁
                            updateButtonColor5();
                        } else if (flashinghg5) {
                            updateButtonColor5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (sech5 >= redThresholdh5) {
                        updateButtonColor5();
                        showConfirmationDialogYNForButton5();
                    }
                }
            }
        });

        btnTimerh5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton5();
                return true;
            }
        });





        btnTimerh7 = findViewById(R.id.buttonn7);
        btnTimerh7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh7){
                    showConfirmationDialogForButton7();
                    isTimerRunningh7 = true;
                    updateButtonColor7(); // 更新颜色
                } else if (isTimerRunningh7) {
                    if (sech7 < blueThresholdh7) {
                        updateButtonColor7();
                        showConfirmationDialogYNForButton7();
                    } else if (blueThresholdh7 <= sech7  && sech7 < yellowThresholdh7  ) {
                        if(!flashingh7){
                            flashingh7 = true; // 停止蓝色闪烁
                            updateButtonColor7();
                        } else if (flashingh7) {
                            updateButtonColor7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (yellowThresholdh7 <= sech7  && sech7 < redThresholdh7) {
                        if(!flashinghg7){
                            flashinghg7 = true; // 停止黄色闪烁
                            updateButtonColor7();
                        } else if (flashinghg7) {
                            updateButtonColor7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (sech7 >= redThresholdh7) {
                        updateButtonColor7();
                        showConfirmationDialogYNForButton7();
                    }
                }
            }
        });

        btnTimerh7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton7();
                return true;
            }
        });

        btnTimerh8 = findViewById(R.id.buttonn8);
        btnTimerh8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh8){
                    showConfirmationDialogForButton8();
                    isTimerRunningh8 = true;
                    updateButtonColor8(); // 更新颜色
                } else if (isTimerRunningh8) {
                    if (sech8 < blueThresholdh8) {
                        updateButtonColor8();
                        showConfirmationDialogYNForButton8();
                    } else if (blueThresholdh8 <= sech8  && sech8 < yellowThresholdh8  ) {
                        if(!flashingh8){
                            flashingh8 = true; // 停止蓝色闪烁
                            updateButtonColor8();
                        } else if (flashingh8) {
                            updateButtonColor8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (yellowThresholdh8 <= sech8  && sech8 < redThresholdh8) {
                        if(!flashinghg8){
                            flashinghg8 = true; // 停止黄色闪烁
                            updateButtonColor8();
                        } else if (flashinghg8) {
                            updateButtonColor8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (sech8 >= redThresholdh8) {
                        updateButtonColor8();
                        showConfirmationDialogYNForButton8();
                    }
                }
            }
        });

        btnTimerh8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton8();
                return true;
            }
        });

        btnTimerh9 = findViewById(R.id.buttonn9);
        btnTimerh9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh9){
                    showConfirmationDialogForButton9();
                    isTimerRunningh9 = true;
                    updateButtonColor9(); // 更新颜色
                } else if (isTimerRunningh9) {
                    if (sech9 < blueThresholdh9) {
                        updateButtonColor9();
                        showConfirmationDialogYNForButton9();
                    } else if (blueThresholdh9 <= sech9  && sech9 < yellowThresholdh9  ) {
                        if(!flashingh9){
                            flashingh9 = true; // 停止蓝色闪烁
                            updateButtonColor9();
                        } else if (flashingh9) {
                            updateButtonColor9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (yellowThresholdh9 <= sech9  && sech9 < redThresholdh9) {
                        if(!flashinghg9){
                            flashinghg9 = true; // 停止黄色闪烁
                            updateButtonColor9();
                        } else if (flashinghg9) {
                            updateButtonColor9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (sech9 >= redThresholdh9) {
                        updateButtonColor9();
                        showConfirmationDialogYNForButton9();
                    }
                }
            }
        });

        btnTimerh9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton9();
                return true;
            }
        });

        btnTimerh10 = findViewById(R.id.buttonn10);
        btnTimerh10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh10){
                    showConfirmationDialogForButton10();
                    isTimerRunningh10 = true;
                    updateButtonColor10(); // 更新颜色
                } else if (isTimerRunningh10) {
                    if (sech10 < blueThresholdh10) {
                        updateButtonColor10();
                        showConfirmationDialogYNForButton10();
                    } else if (blueThresholdh10 <= sech10  && sech10 < yellowThresholdh10  ) {
                        if(!flashingh10){
                            flashingh10 = true; // 停止蓝色闪烁
                            updateButtonColor10();
                        } else if (flashingh10) {
                            updateButtonColor10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (yellowThresholdh10 <= sech10  && sech10 < redThresholdh10) {
                        if(!flashinghg10){
                            flashinghg10 = true; // 停止黄色闪烁
                            updateButtonColor10();
                        } else if (flashinghg10) {
                            updateButtonColor10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (sech10 >= redThresholdh10) {
                        updateButtonColor10();
                        showConfirmationDialogYNForButton10();
                    }
                }
            }
        });

        btnTimerh10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton10();
                return true;
            }
        });

        btnTimerh11 = findViewById(R.id.buttonn11);
        btnTimerh11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh11){
                    showConfirmationDialogForButton11();
                    isTimerRunningh11 = true;
                    updateButtonColor11(); // 更新颜色
                } else if (isTimerRunningh11) {
                    if (sech11 < blueThresholdh11) {
                        updateButtonColor11();
                        showConfirmationDialogYNForButton11();
                    } else if (blueThresholdh11 <= sech11  && sech11 < yellowThresholdh11  ) {
                        if(!flashingh11){
                            flashingh11 = true; // 停止蓝色闪烁
                            updateButtonColor11();
                        } else if (flashingh11) {
                            updateButtonColor11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (yellowThresholdh11 <= sech11  && sech11 < redThresholdh11) {
                        if(!flashinghg11){
                            flashinghg11 = true; // 停止黄色闪烁
                            updateButtonColor11();
                        } else if (flashinghg11) {
                            updateButtonColor11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (sech11 >= redThresholdh11) {
                        updateButtonColor11();
                        showConfirmationDialogYNForButton11();
                    }
                }
            }
        });

        btnTimerh11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton11();
                return true;
            }
        });


        btnTimerh16 = findViewById(R.id.buttonn16);
        btnTimerh16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh16){
                    showConfirmationDialogForButton16();
                    isTimerRunningh16 = true;
                    updateButtonColor16(); // 更新颜色
                } else if (isTimerRunningh16) {
                    if (sech16 < blueThresholdh16) {
                        updateButtonColor16();
                        showConfirmationDialogYNForButton16();
                    } else if (blueThresholdh16 <= sech16  && sech16 < yellowThresholdh16  ) {
                        if(!flashingh16){
                            flashingh16 = true; // 停止蓝色闪烁
                            updateButtonColor16();
                        } else if (flashingh16) {
                            updateButtonColor16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (yellowThresholdh16 <= sech16  && sech16 < redThresholdh16) {
                        if(!flashinghg16){
                            flashinghg16 = true; // 停止黄色闪烁
                            updateButtonColor16();
                        } else if (flashinghg16) {
                            updateButtonColor16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (sech16 >= redThresholdh16) {
                        updateButtonColor16();
                        showConfirmationDialogYNForButton16();
                    }
                }
            }
        });

        btnTimerh16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton16();
                return true;
            }
        });


        btnTimerh17 = findViewById(R.id.buttonn17);
        btnTimerh17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh17){
                    showConfirmationDialogForButton17();
                    isTimerRunningh17 = true;
                    updateButtonColor17(); // 更新颜色
                } else if (isTimerRunningh17) {
                    if (sech17 < blueThresholdh17) {
                        updateButtonColor17();
                        showConfirmationDialogYNForButton17();
                    } else if (blueThresholdh17 <= sech17  && sech17 < yellowThresholdh17  ) {
                        if(!flashingh17){
                            flashingh17 = true; // 停止蓝色闪烁
                            updateButtonColor17();
                        } else if (flashingh17) {
                            updateButtonColor17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (yellowThresholdh17 <= sech17  && sech17 < redThresholdh17) {
                        if(!flashinghg17){
                            flashinghg17 = true; // 停止黄色闪烁
                            updateButtonColor17();
                        } else if (flashinghg17) {
                            updateButtonColor17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (sech17 >= redThresholdh17) {
                        updateButtonColor17();
                        showConfirmationDialogYNForButton17();
                    }
                }
            }
        });

        btnTimerh17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton17();
                return true;
            }
        });

        btnTimerh18 = findViewById(R.id.buttonn18);
        btnTimerh18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh18){
                    showConfirmationDialogForButton18();
                    isTimerRunningh18 = true;
                    updateButtonColor18(); // 更新颜色
                } else if (isTimerRunningh18) {
                    if (sech18 < blueThresholdh18) {
                        updateButtonColor18();
                        showConfirmationDialogYNForButton18();
                    } else if (blueThresholdh18 <= sech18  && sech18 < yellowThresholdh18  ) {
                        if(!flashingh18){
                            flashingh18 = true; // 停止蓝色闪烁
                            updateButtonColor18();
                        } else if (flashingh18) {
                            updateButtonColor18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (yellowThresholdh18 <= sech18  && sech18 < redThresholdh18) {
                        if(!flashinghg18){
                            flashinghg18 = true; // 停止黄色闪烁
                            updateButtonColor18();
                        } else if (flashinghg18) {
                            updateButtonColor18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (sech18 >= redThresholdh18) {
                        updateButtonColor18();
                        showConfirmationDialogYNForButton18();
                    }
                }
            }
        });

        btnTimerh18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton18();
                return true;
            }
        });

        btnTimerh19 = findViewById(R.id.buttonn19);
        btnTimerh19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh19){
                    showConfirmationDialogForButton19();
                    isTimerRunningh19 = true;
                    updateButtonColor19(); // 更新颜色
                } else if (isTimerRunningh19) {
                    if (sech19 < blueThresholdh19) {
                        updateButtonColor19();
                        showConfirmationDialogYNForButton19();
                    } else if (blueThresholdh19 <= sech19  && sech19 < yellowThresholdh19  ) {
                        if(!flashingh19){
                            flashingh19 = true; // 停止蓝色闪烁
                            updateButtonColor19();
                        } else if (flashingh19) {
                            updateButtonColor19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (yellowThresholdh19 <= sech19  && sech19 < redThresholdh19) {
                        if(!flashinghg19){
                            flashinghg19 = true; // 停止黄色闪烁
                            updateButtonColor19();
                        } else if (flashinghg19) {
                            updateButtonColor19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (sech19 >= redThresholdh19) {
                        updateButtonColor19();
                        showConfirmationDialogYNForButton19();
                    }
                }
            }
        });

        btnTimerh19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton19();
                return true;
            }
        });

        btnTimerh2h0 = findViewById(R.id.buttonn20);
        btnTimerh2h0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh20){
                    showConfirmationDialogForButton20();
                    isTimerRunningh20 = true;
                    updateButtonColor2h0(); // 更新颜色
                } else if (isTimerRunningh20) {
                    if (sech20 < blueThresholdh20) {
                        updateButtonColor2h0();
                        showConfirmationDialogYNForButton20();
                    } else if (blueThresholdh20 <= sech20  && sech20 < yellowThresholdh20  ) {
                        if(!flashingh20){
                            flashingh20 = true; // 停止蓝色闪烁
                            updateButtonColor2h0();
                        } else if (flashingh20) {
                            updateButtonColor2h0();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (yellowThresholdh20 <= sech20  && sech20 < redThresholdh20) {
                        if(!flashinghg20){
                            flashinghg20 = true; // 停止黄色闪烁
                            updateButtonColor2h0();
                        } else if (flashinghg20) {
                            updateButtonColor2h0();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (sech20 >= redThresholdh20) {
                        updateButtonColor2h0();
                        showConfirmationDialogYNForButton20();
                    }
                }
            }
        });

        btnTimerh2h0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton20();
                return true;
            }
        });

        btnTimerh2h1 = findViewById(R.id.buttonn21);
        btnTimerh2h1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh21){
                    showConfirmationDialogForButton21();
                    isTimerRunningh21 = true;
                    updateButtonColor2h1(); // 更新颜色
                } else if (isTimerRunningh21) {
                    if (sech21 < blueThresholdh21) {
                        updateButtonColor2h1();
                        showConfirmationDialogYNForButton21();
                    } else if (blueThresholdh21 <= sech21  && sech21 < yellowThresholdh21  ) {
                        if(!flashingh21){
                            flashingh21 = true; // 停止蓝色闪烁
                            updateButtonColor2h1();
                        } else if (flashingh21) {
                            updateButtonColor2h1();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (yellowThresholdh21 <= sech21  && sech21 < redThresholdh21) {
                        if(!flashinghg21){
                            flashinghg21 = true; // 停止黄色闪烁
                            updateButtonColor2h1();
                        } else if (flashinghg21) {
                            updateButtonColor2h1();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (sech21 >= redThresholdh21) {
                        updateButtonColor2h1();
                        showConfirmationDialogYNForButton21();
                    }
                }
            }
        });

        btnTimerh2h1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton21();
                return true;
            }
        });

        btnTimerh2h2 = findViewById(R.id.buttonn22);
        btnTimerh2h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh22){
                    showConfirmationDialogForButton22();
                    isTimerRunningh22 = true;
                    updateButtonColor2h2(); // 更新颜色
                } else if (isTimerRunningh22) {
                    if (sech22 < blueThresholdh22) {
                        updateButtonColor2h2();
                        showConfirmationDialogYNForButton22();
                    } else if (blueThresholdh22 <= sech22  && sech22 < yellowThresholdh22  ) {
                        if(!flashingh22){
                            flashingh22 = true; // 停止蓝色闪烁
                            updateButtonColor2h2();
                        } else if (flashingh22) {
                            updateButtonColor2h2();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (yellowThresholdh22 <= sech22  && sech22 < redThresholdh22) {
                        if(!flashinghg22){
                            flashinghg22 = true; // 停止黄色闪烁
                            updateButtonColor2h2();
                        } else if (flashinghg22) {
                            updateButtonColor2h2();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (sech22 >= redThresholdh22) {
                        updateButtonColor2h2();
                        showConfirmationDialogYNForButton22();
                    }
                }
            }
        });

        btnTimerh2h2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton22();
                return true;
            }
        });

        btnTimerh2h3 = findViewById(R.id.buttonn23);
        btnTimerh2h3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh23){
                    showConfirmationDialogForButton23();
                    isTimerRunningh23 = true;
                    updateButtonColor2h3(); // 更新颜色
                } else if (isTimerRunningh23) {
                    if (sech23 < blueThresholdh23) {
                        updateButtonColor2h3();
                        showConfirmationDialogYNForButton23();
                    } else if (blueThresholdh23 <= sech23  && sech23 < yellowThresholdh23  ) {
                        if(!flashingh23){
                            flashingh23 = true; // 停止蓝色闪烁
                            updateButtonColor2h3();
                        } else if (flashingh23) {
                            updateButtonColor2h3();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (yellowThresholdh23 <= sech23  && sech23 < redThresholdh23) {
                        if(!flashinghg23){
                            flashinghg23 = true; // 停止黄色闪烁
                            updateButtonColor2h3();
                        } else if (flashinghg23) {
                            updateButtonColor2h3();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (sech23 >= redThresholdh23) {
                        updateButtonColor2h3();
                        showConfirmationDialogYNForButton23();
                    }
                }
            }
        });

        btnTimerh2h3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton23();
                return true;
            }
        });

        btnTimerh2h4 = findViewById(R.id.buttonn24);
        btnTimerh2h4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh24){
                    showConfirmationDialogForButton24();
                    isTimerRunningh24 = true;
                    updateButtonColor2h4(); // 更新颜色
                } else if (isTimerRunningh24) {
                    if (sech24 < blueThresholdh24) {
                        updateButtonColor2h4();
                        showConfirmationDialogYNForButton24();
                    } else if (blueThresholdh24 <= sech24  && sech24 < yellowThresholdh24  ) {
                        if(!flashingh24){
                            flashingh24 = true; // 停止蓝色闪烁
                            updateButtonColor2h4();
                        } else if (flashingh24) {
                            updateButtonColor2h4();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (yellowThresholdh24 <= sech24  && sech24 < redThresholdh24) {
                        if(!flashinghg24){
                            flashinghg24 = true; // 停止黄色闪烁
                            updateButtonColor2h4();
                        } else if (flashinghg24) {
                            updateButtonColor2h4();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (sech24 >= redThresholdh24) {
                        updateButtonColor2h4();
                        showConfirmationDialogYNForButton24();
                    }
                }
            }
        });

        btnTimerh2h4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton24();
                return true;
            }
        });

        btnTimerh2h5 = findViewById(R.id.buttonn25);
        btnTimerh2h5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh25){
                    showConfirmationDialogForButton25();
                    isTimerRunningh25 = true;
                    updateButtonColor2h5(); // 更新颜色
                } else if (isTimerRunningh25) {
                    if (sech25 < blueThresholdh25) {
                        updateButtonColor2h5();
                        showConfirmationDialogYNForButton25();
                    } else if (blueThresholdh25 <= sech25  && sech25 < yellowThresholdh25  ) {
                        if(!flashingh25){
                            flashingh25 = true; // 停止蓝色闪烁
                            updateButtonColor2h5();
                        } else if (flashingh25) {
                            updateButtonColor2h5();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (yellowThresholdh25 <= sech25  && sech25 < redThresholdh25) {
                        if(!flashinghg25){
                            flashinghg25 = true; // 停止黄色闪烁
                            updateButtonColor2h5();
                        } else if (flashinghg25) {
                            updateButtonColor2h5();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (sech25 >= redThresholdh25) {
                        updateButtonColor2h5();
                        showConfirmationDialogYNForButton25();
                    }
                }
            }
        });

        btnTimerh2h5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton25();
                return true;
            }
        });

        btnTimerh2h6 = findViewById(R.id.buttonn26);
        btnTimerh2h6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh26){
                    showConfirmationDialogForButton26();
                    isTimerRunningh26 = true;
                    updateButtonColor2h6(); // 更新颜色
                } else if (isTimerRunningh26) {
                    if (sech26 < blueThresholdh26) {
                        updateButtonColor2h6();
                        showConfirmationDialogYNForButton26();
                    } else if (blueThresholdh26 <= sech26  && sech26 < yellowThresholdh26  ) {
                        if(!flashingh26){
                            flashingh26 = true; // 停止蓝色闪烁
                            updateButtonColor2h6();
                        } else if (flashingh26) {
                            updateButtonColor2h6();
                            showConfirmationDialogYNForButton26();
                        }

                    } else if (yellowThresholdh26 <= sech26  && sech26 < redThresholdh26) {
                        if(!flashinghg26){
                            flashinghg26 = true; // 停止黄色闪烁
                            updateButtonColor2h6();
                        } else if (flashinghg26) {
                            updateButtonColor2h6();
                            showConfirmationDialogYNForButton26();
                        }

                    } else if (sech26 >= redThresholdh26) {
                        updateButtonColor2h6();
                        showConfirmationDialogYNForButton26();
                    }
                }
            }
        });

        btnTimerh2h6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton26();
                return true;
            }
        });

        btnTimerh2h7 = findViewById(R.id.buttonn27);
        btnTimerh2h7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh27){
                    showConfirmationDialogForButton27();
                    isTimerRunningh27 = true;
                    updateButtonColor2h7(); // 更新颜色
                } else if (isTimerRunningh27) {
                    if (sech27 < blueThresholdh27) {
                        updateButtonColor2h7();
                        showConfirmationDialogYNForButton27();
                    } else if (blueThresholdh27 <= sech27  && sech27 < yellowThresholdh27  ) {
                        if(!flashingh27){
                            flashingh27 = true; // 停止蓝色闪烁
                            updateButtonColor2h7();
                        } else if (flashingh27) {
                            updateButtonColor2h7();
                            showConfirmationDialogYNForButton27();
                        }

                    } else if (yellowThresholdh27 <= sech27  && sech27 < redThresholdh27) {
                        if(!flashinghg27){
                            flashinghg27 = true; // 停止黄色闪烁
                            updateButtonColor2h7();
                        } else if (flashinghg27) {
                            updateButtonColor2h7();
                            showConfirmationDialogYNForButton27();
                        }

                    } else if (sech27 >= redThresholdh27) {
                        updateButtonColor2h7();
                        showConfirmationDialogYNForButton27();
                    }
                }
            }
        });

        btnTimerh2h7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton27();
                return true;
            }
        });

        btnTimerh2h8 = findViewById(R.id.buttonn28);
        btnTimerh2h8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh28){
                    showConfirmationDialogForButton28();
                    isTimerRunningh28 = true;
                    updateButtonColor2h8(); // 更新颜色
                } else if (isTimerRunningh28) {
                    if (sech28 < blueThresholdh28) {
                        updateButtonColor2h8();
                        showConfirmationDialogYNForButton28();
                    } else if (blueThresholdh28 <= sech28  && sech28 < yellowThresholdh28  ) {
                        if(!flashingh28){
                            flashingh28 = true; // 停止蓝色闪烁
                            updateButtonColor2h8();
                        } else if (flashingh28) {
                            updateButtonColor2h8();
                            showConfirmationDialogYNForButton28();
                        }

                    } else if (yellowThresholdh28 <= sech28  && sech28 < redThresholdh28) {
                        if(!flashinghg28){
                            flashinghg28 = true; // 停止黄色闪烁
                            updateButtonColor2h8();
                        } else if (flashinghg28) {
                            updateButtonColor2h8();
                            showConfirmationDialogYNForButton28();
                        }

                    } else if (sech28 >= redThresholdh28) {
                        updateButtonColor2h8();
                        showConfirmationDialogYNForButton28();
                    }
                }
            }
        });

        btnTimerh2h8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton28();
                return true;
            }
        });

        btnTimerh66 = findViewById(R.id.buttonn66);
        btnTimerh66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh66){
                    showConfirmationDialogForButton66();
                    isTimerRunningh66 = true;
                    updateButtonColor66(); // 更新颜色
                } else if (isTimerRunningh66) {
                    if (sech66 < blueThresholdh66) {
                        updateButtonColor66();
                        showConfirmationDialogYNForButton66();
                    } else if (blueThresholdh66 <= sech66  && sech66 < yellowThresholdh66  ) {
                        if(!flashingh66){
                            flashingh66 = true; // 停止蓝色闪烁
                            updateButtonColor66();
                        } else if (flashingh66) {
                            updateButtonColor66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (yellowThresholdh66 <= sech66  && sech66 < redThresholdh66) {
                        if(!flashinghg66){
                            flashinghg66 = true; // 停止黄色闪烁
                            updateButtonColor66();
                        } else if (flashinghg66) {
                            updateButtonColor66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (sech66 >= redThresholdh66) {
                        updateButtonColor66();
                        showConfirmationDialogYNForButton66();
                    }
                }
            }
        });

        btnTimerh66.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton66();
                return true;
            }
        });
        btnTimerh2h01 = findViewById(R.id.buttonn201);
        btnTimerh2h01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh201){
                    showConfirmationDialogForButton201();
                    isTimerRunningh201 = true;
                    updateButtonColor2h01(); // 更新颜色
                } else if (isTimerRunningh201) {
                    if (sech201 < blueThresholdh201) {
                        updateButtonColor2h01();
                        showConfirmationDialogYNForButton201();
                    } else if (blueThresholdh201 <= sech201  && sech201 < yellowThresholdh201  ) {
                        if(!flashingh201){
                            flashingh201 = true; // 停止蓝色闪烁
                            updateButtonColor2h01();
                        } else if (flashingh201) {
                            updateButtonColor2h01();
                            showConfirmationDialogYNForButton201();
                        }

                    } else if (yellowThresholdh201 <= sech201  && sech201 < redThresholdh201) {
                        if(!flashinghg201){
                            flashinghg201 = true; // 停止黄色闪烁
                            updateButtonColor2h01();
                        } else if (flashinghg201) {
                            updateButtonColor2h01();
                            showConfirmationDialogYNForButton201();
                        }

                    } else if (sech201 >= redThresholdh201) {
                        updateButtonColor2h01();
                        showConfirmationDialogYNForButton201();
                    }
                }
            }
        });

        btnTimerh2h01.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton201();
                return true;
            }
        });

        btnTimerh2h02 = findViewById(R.id.buttonn202);
        btnTimerh2h02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh202){
                    showConfirmationDialogForButton202();
                    isTimerRunningh202 = true;
                    updateButtonColor2h02(); // 更新颜色
                } else if (isTimerRunningh202) {
                    if (sech202 < blueThresholdh202) {
                        updateButtonColor2h02();
                        showConfirmationDialogYNForButton202();
                    } else if (blueThresholdh202 <= sech202  && sech202 < yellowThresholdh202  ) {
                        if(!flashingh202){
                            flashingh202 = true; // 停止蓝色闪烁
                            updateButtonColor2h02();
                        } else if (flashingh202) {
                            updateButtonColor2h02();
                            showConfirmationDialogYNForButton202();
                        }

                    } else if (yellowThresholdh202 <= sech202  && sech202 < redThresholdh202) {
                        if(!flashinghg202){
                            flashinghg202 = true; // 停止黄色闪烁
                            updateButtonColor2h02();
                        } else if (flashinghg202) {
                            updateButtonColor2h02();
                            showConfirmationDialogYNForButton202();
                        }

                    } else if (sech202 >= redThresholdh202) {
                        updateButtonColor2h02();
                        showConfirmationDialogYNForButton202();
                    }
                }
            }
        });

        btnTimerh2h02.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton202();
                return true;
            }
        });

        btnTimerh2h03 = findViewById(R.id.buttonn203);
        btnTimerh2h03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh203){
                    showConfirmationDialogForButton203();
                    isTimerRunningh203 = true;
                    updateButtonColor2h03(); // 更新颜色
                } else if (isTimerRunningh203) {
                    if (sech203 < blueThresholdh203) {
                        updateButtonColor2h03();
                        showConfirmationDialogYNForButton203();
                    } else if (blueThresholdh203 <= sech203  && sech203 < yellowThresholdh203  ) {
                        if(!flashingh203){
                            flashingh203 = true; // 停止蓝色闪烁
                            updateButtonColor2h03();
                        } else if (flashingh203) {
                            updateButtonColor2h03();
                            showConfirmationDialogYNForButton203();
                        }

                    } else if (yellowThresholdh203 <= sech203  && sech203 < redThresholdh203) {
                        if(!flashinghg203){
                            flashinghg203 = true; // 停止黄色闪烁
                            updateButtonColor2h03();
                        } else if (flashinghg203) {
                            updateButtonColor2h03();
                            showConfirmationDialogYNForButton203();
                        }

                    } else if (sech203 >= redThresholdh203) {
                        updateButtonColor2h03();
                        showConfirmationDialogYNForButton203();
                    }
                }
            }
        });

        btnTimerh2h03.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton203();
                return true;
            }
        });

        btnTimerh2h04 = findViewById(R.id.buttonn204);
        btnTimerh2h04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningh204){
                    showConfirmationDialogForButton204();
                    isTimerRunningh204 = true;
                    updateButtonColor2h04(); // 更新颜色
                } else if (isTimerRunningh204) {
                    if (sech204 < blueThresholdh204) {
                        updateButtonColor2h04();
                        showConfirmationDialogYNForButton204();
                    } else if (blueThresholdh204 <= sech204  && sech204 < yellowThresholdh204  ) {
                        if(!flashingh204){
                            flashingh204 = true; // 停止蓝色闪烁
                            updateButtonColor2h04();
                        } else if (flashingh204) {
                            updateButtonColor2h04();
                            showConfirmationDialogYNForButton204();
                        }

                    } else if (yellowThresholdh204 <= sech204  && sech204 < redThresholdh204) {
                        if(!flashinghg204){
                            flashinghg204 = true; // 停止黄色闪烁
                            updateButtonColor2h04();
                        } else if (flashinghg204) {
                            updateButtonColor2h04();
                            showConfirmationDialogYNForButton204();
                        }

                    } else if (sech204 >= redThresholdh204) {
                        updateButtonColor2h04();
                        showConfirmationDialogYNForButton204();
                    }
                }
            }
        });

        btnTimerh2h04.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton204();
                return true;
            }
        });

    }
    //--------------------------------------------------------------------------

    @Override
    public void onDestroy() {
        super.onDestroy();
        // 停止計時器服務
        Intent timerServiceIntenth = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth);
        // 停止計時器服務
        Intent timerServiceIntenth1 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth1);

        Intent timerServiceIntenth2 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth2);

        Intent timerServiceIntenth3 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth3);

        Intent timerServiceIntenth4 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth4);

        Intent timerServiceIntenth5 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth5);

        Intent timerServiceIntenth6 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth6);

        Intent timerServiceIntenth7 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth7);

        Intent timerServiceIntenth8 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth8);

        Intent timerServiceIntenth9 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth9);

        Intent timerServiceIntenth10 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth10);

        Intent timerServiceIntenth11 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth11);

        Intent timerServiceIntenth12 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth12);

        Intent timerServiceIntenth13 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth13);

        Intent timerServiceIntenth14 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth14);

        Intent timerServiceIntenth15 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth15);

        Intent timerServiceIntenth16 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth16);

        Intent timerServiceIntenth17 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth17);

        Intent timerServiceIntenth18 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth18);

        Intent timerServiceIntenth19 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth19);

        Intent timerServiceIntenth20 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth20);

        Intent timerServiceIntenth21 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth21);

        Intent timerServiceIntenth22 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth22);

        Intent timerServiceIntenth23 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth23);

        Intent timerServiceIntenth24 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth24);

        Intent timerServiceIntenth25 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth25);

        Intent timerServiceIntenth26 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth26);

        Intent timerServiceIntenth27 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenth27);

        Intent timerServiceIntenth28 = new Intent(this,TimerServiceS2.class);
        stopService(timerServiceIntenth28);
        Intent timerServiceIntenth66 = new Intent(this,TimerServiceS2.class);
        stopService(timerServiceIntenth66);

    }


    @Override
    public void onPause() {
        super.onPause();

        // 在保存計時器1狀態時，使用editorh1對象進行同步
        synchronized (editorh1) {
            editorh1.putBoolean(TIMER_STARTED_KEYh1, handler1.hasCallbacks(updateTimerThread1));
            editorh1.putLong(START_TIME_KEY1h, startTimeh1);
            editorh1.putLong(ELAPSED_TIME_KEYh1, timeInMillisechondshh1);
            editorh1.putBoolean("peopleh_key1", peopleh2h_1);
            editorh1.putBoolean("flashingh_key1", flashingh1);
            editorh1.putBoolean("flashinghg_key1", flashinghg1);
            editorh1.putBoolean("isTimerRunningh1", isTimerRunningh1);
            editorh1.putInt("currentHourh1",currentHourh1);
            editorh1.putInt("currentMinuteh1",currentMinuteh1);

            // 保存加時時間到SharedPreferences
            editorh1.putInt("blueThresholdh1", blueThresholdh1);
            editorh1.putInt("yellowThresholdh1", yellowThresholdh1);
            editorh1.putInt("redThresholdh1", redThresholdh1);
            editorh1.apply();
        }

        // 在保存計時器2狀態時，使用editorh2對象進行同步
        synchronized (editorh2) {
            editorh2.putBoolean(TIMER_STARTED_KEYh2, handler1.hasCallbacks(updateTimerThread2));
            editorh2.putLong(START_TIME_KEY2, startTimeh2);
            editorh2.putLong(ELAPSED_TIME_KEYh2, timeInMillisechondshh2);
            editorh2.putBoolean("peopleh_key2h", peopleh2h_2);


            editorh2.putBoolean("flashingh_key2h", flashingh2);
            editorh2.putBoolean("flashinghg_key2h", flashinghg2);
            editorh2.putBoolean("isTimerRunningh2", isTimerRunningh2);
            editorh2.putInt("currentHourh2h", currentHourh2h);
            editorh2.putInt("currentMinuteh2", currentMinuteh2);


            // 保存加時時間到SharedPreferences
            editorh2.putInt("blueThresholdh2", blueThresholdh2);
            editorh2.putInt("yellowThresholdh2", yellowThresholdh2);
            editorh2.putInt("redThresholdh2", redThresholdh2);
            editorh2.apply();
        }

        synchronized (editorh3) {
            editorh3.putBoolean(TIMER_STARTED_KEYh3, handler1.hasCallbacks(updateTimerThread3));
            editorh3.putLong(START_TIME_KEY3, startTimeh3);
            editorh3.putLong(ELAPSED_TIME_KEYh3, timeInMillisechondshh3);
            editorh3.putBoolean("peopleh_key3h", peopleh2h_3);

            editorh3.putBoolean("flashingh_key3h", flashingh3);
            editorh3.putBoolean("flashinghg_key3h", flashinghg3);
            editorh3.putBoolean("isTimerRunningh3", isTimerRunningh3);
            editorh3.putInt("currentHourh3h", currentHourh3h);
            editorh3.putInt("currentMinuteh3", currentMinuteh3);


            // 保存加時時間到SharedPreferences
            editorh3.putInt("blueThresholdh3", blueThresholdh3);
            editorh3.putInt("yellowThresholdh3", yellowThresholdh3);
            editorh3.putInt("redThresholdh3", redThresholdh3);
            editorh3.apply();
        }

        synchronized (editorh4) {
            editorh4.putBoolean(TIMER_STARTED_KEYh4, handler1.hasCallbacks(updateTimerThread4));
            editorh4.putLong(START_TIME_KEY4, startTimeh4);
            editorh4.putLong(ELAPSED_TIME_KEYh4, timeInMillisechondshh4);
            editorh4.putBoolean("peopleh_key4", peopleh2h_4);

            editorh4.putBoolean("flashingh_key4", flashingh4);
            editorh4.putBoolean("flashinghg_key4", flashinghg4);
            editorh4.putBoolean("isTimerRunningh4", isTimerRunningh4);
            editorh4.putInt("currentHourh4", currentHourh4);
            editorh4.putInt("currentMinuteh4", currentMinuteh4);


            // 保存加時時間到SharedPreferences
            editorh4.putInt("blueThresholdh4", blueThresholdh4);
            editorh4.putInt("yellowThresholdh4", yellowThresholdh4);
            editorh4.putInt("redThresholdh4", redThresholdh4);
            editorh4.apply();
        }

        synchronized (editorh5) {
            editorh5.putBoolean(TIMER_STARTED_KEYh5, handler1.hasCallbacks(updateTimerThread5));
            editorh5.putLong(START_TIME_KEY5, startTimeh5);
            editorh5.putLong(ELAPSED_TIME_KEYh5, timeInMillisechondshh5);
            editorh5.putBoolean("peopleh_key5", peopleh2h_5);

            editorh5.putBoolean("flashingh_key5", flashingh5);
            editorh5.putBoolean("flashinghg_key5", flashinghg5);
            editorh5.putBoolean("isTimerRunningh5", isTimerRunningh5);
            editorh5.putInt("currentHourh5", currentHourh5);
            editorh5.putInt("currentMinuteh5", currentMinuteh5);


// 保存加時時間到SharedPreferences
            editorh5.putInt("blueThresholdh5", blueThresholdh5);
            editorh5.putInt("yellowThresholdh5", yellowThresholdh5);
            editorh5.putInt("redThresholdh5", redThresholdh5);
            editorh5.apply();
        }



        synchronized (editorh7) {
            editorh7.putBoolean(TIMER_STARTED_KEYh7, handler1.hasCallbacks(updateTimerThread7));
            editorh7.putLong(START_TIME_KEY7, startTimeh7);
            editorh7.putLong(ELAPSED_TIME_KEYh7, timeInMillisechondshh7);
            editorh7.putBoolean("peopleh_key7", peopleh2h_7);

            editorh7.putBoolean("flashingh_key7", flashingh7);
            editorh7.putBoolean("flashinghg_key7", flashinghg7);
            editorh7.putBoolean("isTimerRunningh7", isTimerRunningh7);

            editorh7.putInt("currentHourh7", currentHourh7);
            editorh7.putInt("currentMinuteh7", currentMinuteh7);


            // 保存加時時間到SharedPreferences
            editorh7.putInt("blueThresholdh7", blueThresholdh7);
            editorh7.putInt("yellowThresholdh7", yellowThresholdh7);
            editorh7.putInt("redThresholdh7", redThresholdh7);
            editorh7.apply();
        }

        synchronized (editorh8) {
            editorh8.putBoolean(TIMER_STARTED_KEYh8, handler1.hasCallbacks(updateTimerThread8));
            editorh8.putLong(START_TIME_KEY8, startTimeh8);
            editorh8.putLong(ELAPSED_TIME_KEYh8, timeInMillisechondshh8);
            editorh8.putBoolean("peopleh_key8", peopleh2h_8);

            editorh8.putBoolean("flashingh_key8", flashingh8);
            editorh8.putBoolean("flashinghg_key8", flashinghg8);
            editorh8.putBoolean("isTimerRunningh8", isTimerRunningh8);
            editorh8.putInt("currentHourh8", currentHourh8);
            editorh8.putInt("currentMinuteh8", currentMinuteh8);


// 保存加時時間到SharedPreferences
            editorh8.putInt("blueThresholdh8", blueThresholdh8);
            editorh8.putInt("yellowThresholdh8", yellowThresholdh8);
            editorh8.putInt("redThresholdh8", redThresholdh8);
            editorh8.apply();
        }

        synchronized (editorh9) {
            editorh9.putBoolean(TIMER_STARTED_KEYh9, handler1.hasCallbacks(updateTimerThread9));
            editorh9.putLong(START_TIME_KEY9, startTimeh9);
            editorh9.putLong(ELAPSED_TIME_KEYh9, timeInMillisechondshh9);
            editorh9.putBoolean("peopleh_key9", peopleh2h_9);

            editorh9.putBoolean("flashingh_key9", flashingh9);
            editorh9.putBoolean("flashinghg_key9", flashinghg9);
            editorh9.putBoolean("isTimerRunningh9", isTimerRunningh9);
            editorh9.putInt("currentHourh9", currentHourh9);
            editorh9.putInt("currentMinuteh9", currentMinuteh9);


            editorh9.putInt("blueThresholdh9", blueThresholdh9);
            editorh9.putInt("yellowThresholdh9", yellowThresholdh9);
            editorh9.putInt("redThresholdh9", redThresholdh9);
            editorh9.apply();
        }

        synchronized (editorh10) {
            editorh10.putBoolean(TIMER_STARTED_KEYh10, handler1.hasCallbacks(updateTimerThread10));
            editorh10.putLong(START_TIME_KEY1h0, startTimeh10);
            editorh10.putLong(ELAPSED_TIME_KEYh10, timeInMillisechondshh10);
            editorh10.putBoolean("peopleh_key10", peopleh2h_10);

            editorh10.putBoolean("flashingh_key10", flashingh10);
            editorh10.putBoolean("flashinghg_key10", flashinghg10);
            editorh10.putBoolean("isTimerRunningh10", isTimerRunningh10);
            editorh10.putInt("currentHourh10", currentHourh10);
            editorh10.putInt("currentMinuteh10", currentMinuteh10);


            editorh10.putInt("blueThresholdh10", blueThresholdh10);
            editorh10.putInt("yellowThresholdh10", yellowThresholdh10);
            editorh10.putInt("redThresholdh10", redThresholdh10);
            editorh10.apply();
        }

        synchronized (editorh11) {
            editorh11.putBoolean(TIMER_STARTED_KEYh11, handler1.hasCallbacks(updateTimerThread11));
            editorh11.putLong(START_TIME_KEY1h1, startTimeh11);
            editorh11.putLong(ELAPSED_TIME_KEYh11, timeInMillisechondshh11);
            editorh11.putBoolean("peopleh_key11", peopleh2h_11);

            editorh11.putBoolean("flashingh_key11", flashingh11);
            editorh11.putBoolean("flashinghg_key11", flashinghg11);
            editorh11.putBoolean("isTimerRunningh11", isTimerRunningh11);
            editorh11.putInt("currentHourh11", currentHourh11);
            editorh11.putInt("currentMinuteh11", currentMinuteh11);



            editorh11.putInt("blueThresholdh11", blueThresholdh11);
            editorh11.putInt("yellowThresholdh11", yellowThresholdh11);
            editorh11.putInt("redThresholdh11", redThresholdh11);
            editorh11.apply();
        }

        synchronized (editorh12) {
            editorh12.putBoolean(TIMER_STARTED_KEYh12, handler1.hasCallbacks(updateTimerThread201));
            editorh12.putLong(START_TIME_KEY1h2, startTimeh201);
            editorh12.putLong(ELAPSED_TIME_KEYh12, timeInMillisechondshh201);
            editorh12.putBoolean("peopleh_key12", peopleh2h_12);

            editorh12.putBoolean("flashingh_key12", flashingh201);
            editorh12.putBoolean("flashinghg_key12", flashinghg201);
            editorh12.putBoolean("isTimerRunningh12", isTimerRunningh201);
            editorh12.putInt("currentHourh12", currentHourh12);
            editorh12.putInt("currentMinuteh12", currentMinuteh12);


            editorh12.putInt("blueThresholdh12", blueThresholdh201);
            editorh12.putInt("yellowThresholdh12", yellowThresholdh201);
            editorh12.putInt("redThresholdh12", redThresholdh201);
            editorh12.apply();
        }

        synchronized (editorh13) {
            editorh13.putBoolean(TIMER_STARTED_KEYh13, handler1.hasCallbacks(updateTimerThread202));
            editorh13.putLong(START_TIME_KEY1h3, startTimeh202);
            editorh13.putLong(ELAPSED_TIME_KEYh13, timeInMillisechondshh202);
            editorh13.putBoolean("peopleh_key13", peopleh2h_13);

            editorh13.putBoolean("flashingh_key13", flashingh202);
            editorh13.putBoolean("flashinghg_key13", flashinghg202);
            editorh13.putBoolean("isTimerRunningh13", isTimerRunningh202);
            editorh13.putInt("currentHourh13", currentHourh13);
            editorh13.putInt("currentMinuteh13", currentMinuteh13);


            editorh13.putInt("blueThresholdh13", blueThresholdh202);
            editorh13.putInt("yellowThresholdh13", yellowThresholdh202);
            editorh13.putInt("redThresholdh13", redThresholdh202);
            editorh13.apply();
        }

        synchronized (editorh14) {
            editorh14.putBoolean(TIMER_STARTED_KEYh14, handler1.hasCallbacks(updateTimerThread203));
            editorh14.putLong(START_TIME_KEY1h4, startTimeh203);
            editorh14.putLong(ELAPSED_TIME_KEYh14, timeInMillisechondshh203);
            editorh14.putBoolean("peopleh_key14", peopleh2h_14);

            editorh14.putBoolean("flashingh_key14", flashingh203);
            editorh14.putBoolean("flashinghg_key14", flashinghg203);
            editorh14.putBoolean("isTimerRunningh14", isTimerRunningh203);
            editorh14.putInt("currentHourh14", currentHourh14);
            editorh14.putInt("currentMinuteh14", currentMinuteh14);


            editorh14.putInt("blueThresholdh14", blueThresholdh203);
            editorh14.putInt("yellowThresholdh14", yellowThresholdh203);
            editorh14.putInt("redThresholdh14", redThresholdh203);
            editorh14.apply();
        }

        synchronized (editorh15) {
            editorh15.putBoolean(TIMER_STARTED_KEYh15, handler1.hasCallbacks(updateTimerThread204));
            editorh15.putLong(START_TIME_KEY1h5, startTimeh204);
            editorh15.putLong(ELAPSED_TIME_KEYh15, timeInMillisechondshh204);
            editorh15.putBoolean("peopleh_key15", peopleh2h_15);

            editorh15.putBoolean("flashingh_key15", flashingh204);
            editorh15.putBoolean("flashinghg_key15", flashinghg204);
            editorh15.putBoolean("isTimerRunningh15", isTimerRunningh204);
            editorh15.putInt("currentHourh15", currentHourh15);
            editorh15.putInt("currentMinuteh15", currentMinuteh15);


            editorh15.putInt("blueThresholdh15", blueThresholdh204);
            editorh15.putInt("yellowThresholdh15", yellowThresholdh204);
            editorh15.putInt("redThresholdh15", redThresholdh204);
            editorh15.apply();
        }

        synchronized (editorh16) {
            editorh16.putBoolean(TIMER_STARTED_KEYh16, handler1.hasCallbacks(updateTimerThread16));
            editorh16.putLong(START_TIME_KEY1h6, startTimeh16);
            editorh16.putLong(ELAPSED_TIME_KEYh16, timeInMillisechondshh16);
            editorh16.putBoolean("peopleh_key16", peopleh2h_16);

            editorh16.putBoolean("flashingh_key16", flashingh16);
            editorh16.putBoolean("flashinghg_key16", flashinghg16);
            editorh16.putBoolean("isTimerRunningh16", isTimerRunningh16);
            editorh16.putInt("currentHourh16", currentHourh16);
            editorh16.putInt("currentMinuteh16", currentMinuteh16);


            editorh16.putInt("blueThresholdh16", blueThresholdh16);
            editorh16.putInt("yellowThresholdh16", yellowThresholdh16);
            editorh16.putInt("redThresholdh16", redThresholdh16);
            editorh16.apply();
        }

        synchronized (editorh17) {
            editorh17.putBoolean(TIMER_STARTED_KEYh17, handler1.hasCallbacks(updateTimerThread17));
            editorh17.putLong(START_TIME_KEY1h7, startTimeh17);
            editorh17.putLong(ELAPSED_TIME_KEYh17, timeInMillisechondshh17);
            editorh17.putBoolean("peopleh_key17", peopleh2h_17);

            editorh17.putBoolean("flashingh_key17", flashingh17);
            editorh17.putBoolean("flashinghg_key17", flashinghg17);
            editorh17.putBoolean("isTimerRunningh17", isTimerRunningh17);
            editorh17.putInt("currentHourh17", currentHourh17);
            editorh17.putInt("currentMinuteh17", currentMinuteh17);


            editorh17.putInt("blueThresholdh17", blueThresholdh17);
            editorh17.putInt("yellowThresholdh17", yellowThresholdh17);
            editorh17.putInt("redThresholdh17", redThresholdh17);
            editorh17.apply();
        }

        synchronized (editorh18) {
            editorh18.putBoolean(TIMER_STARTED_KEYh18, handler1.hasCallbacks(updateTimerThread18));
            editorh18.putLong(START_TIME_KEY1h8, startTimeh18);
            editorh18.putLong(ELAPSED_TIME_KEYh18, timeInMillisechondshh18);
            editorh18.putBoolean("peopleh_key18", peopleh2h_18);

            editorh18.putBoolean("flashingh_key18", flashingh18);
            editorh18.putBoolean("flashinghg_key18", flashinghg18);
            editorh18.putBoolean("isTimerRunningh18", isTimerRunningh18);
            editorh18.putInt("currentHourh18", currentHourh18);
            editorh18.putInt("currentMinuteh18", currentMinuteh18);


            editorh18.putInt("blueThresholdh18", blueThresholdh18);
            editorh18.putInt("yellowThresholdh18", yellowThresholdh18);
            editorh18.putInt("redThresholdh18", redThresholdh18);
            editorh18.apply();
        }

        synchronized (editorh19) {
            editorh19.putBoolean(TIMER_STARTED_KEYh19, handler1.hasCallbacks(updateTimerThread19));
            editorh19.putLong(START_TIME_KEY1h9, startTimeh19);
            editorh19.putLong(ELAPSED_TIME_KEYh19, timeInMillisechondshh19);
            editorh19.putBoolean("peopleh_key19", peopleh2h_19);

            editorh19.putBoolean("flashingh_key19", flashingh19);
            editorh19.putBoolean("flashinghg_key19", flashinghg19);
            editorh19.putBoolean("isTimerRunningh19", isTimerRunningh19);
            editorh19.putInt("currentHourh19", currentHourh19);
            editorh19.putInt("currentMinuteh19", currentMinuteh19);


            editorh19.putInt("blueThresholdh19", blueThresholdh19);
            editorh19.putInt("yellowThresholdh19", yellowThresholdh19);
            editorh19.putInt("redThresholdh19", redThresholdh19);
            editorh19.apply();
        }

        synchronized (editorh20) {
            editorh20.putBoolean(TIMER_STARTED_KEYh20, handler1.hasCallbacks(updateTimerThread20));
            editorh20.putLong(START_TIME_KEY20, startTimeh20);
            editorh20.putLong(ELAPSED_TIME_KEYh20, timeInMillisechondshh20);
            editorh20.putBoolean("peopleh_key2h0", peopleh2h_20);

            editorh20.putBoolean("flashingh_key2h0", flashingh20);
            editorh20.putBoolean("flashinghg_key2h0", flashinghg20);
            editorh20.putBoolean("isTimerRunningh20", isTimerRunningh20);
            editorh20.putInt("currentHourh2h0", currentHourh2h0);
            editorh20.putInt("currentMinuteh20", currentMinuteh20);



            editorh20.putInt("blueThresholdh20", blueThresholdh20);
            editorh20.putInt("yellowThresholdh20", yellowThresholdh20);
            editorh20.putInt("redThresholdh20", redThresholdh20);
            editorh20.apply();
        }

        synchronized (editorh21) {
            editorh21.putBoolean(TIMER_STARTED_KEYh21, handler1.hasCallbacks(updateTimerThread21));
            editorh21.putLong(START_TIME_KEY21, startTimeh21);
            editorh21.putLong(ELAPSED_TIME_KEYh21, timeInMillisechondshh21);
            editorh21.putBoolean("peopleh_key2h1", peopleh2h_21);

            editorh21.putBoolean("flashingh_key2h1", flashingh21);
            editorh21.putBoolean("flashinghg_key2h1", flashinghg21);
            editorh21.putBoolean("isTimerRunningh21", isTimerRunningh21);
            editorh21.putInt("currentHourh2h1", currentHourh2h1);
            editorh21.putInt("currentMinuteh21", currentMinuteh21);


            editorh21.putInt("blueThresholdh21", blueThresholdh21);
            editorh21.putInt("yellowThresholdh21", yellowThresholdh21);
            editorh21.putInt("redThresholdh21", redThresholdh21);
            editorh21.apply();
        }

        synchronized (editorh22) {
            editorh22.putBoolean(TIMER_STARTED_KEYh22, handler1.hasCallbacks(updateTimerThread22));
            editorh22.putLong(START_TIME_KEY22, startTimeh22);
            editorh22.putLong(ELAPSED_TIME_KEYh22, timeInMillisechondshh22);
            editorh22.putBoolean("peopleh_key2h2", peopleh2h_22);

            editorh22.putBoolean("flashingh_key2h2", flashingh22);
            editorh22.putBoolean("flashinghg_key2h2", flashinghg22);
            editorh22.putBoolean("isTimerRunningh22", isTimerRunningh22);
            editorh22.putInt("currentHourh2h2", currentHourh2h2);
            editorh22.putInt("currentMinuteh22", currentMinuteh22);


// 保存加時時間到SharedPreferences
            editorh22.putInt("blueThresholdh22", blueThresholdh22);
            editorh22.putInt("yellowThresholdh22", yellowThresholdh22);
            editorh22.putInt("redThresholdh22", redThresholdh22);
            editorh22.apply();
        }

        synchronized (editorh23) {
            editorh23.putBoolean(TIMER_STARTED_KEYh23, handler1.hasCallbacks(updateTimerThread23));
            editorh23.putLong(START_TIME_KEY23, startTimeh23);
            editorh23.putLong(ELAPSED_TIME_KEYh23, timeInMillisechondshh23);
            editorh23.putBoolean("peopleh_key2h3", peopleh2h_23);

            editorh23.putBoolean("flashingh_key2h3", flashingh23);
            editorh23.putBoolean("flashinghg_key2h3", flashinghg23);
            editorh23.putBoolean("isTimerRunningh23", isTimerRunningh23);
            editorh23.putInt("currentHourh2h3", currentHourh2h3);
            editorh23.putInt("currentMinuteh23", currentMinuteh23);


            editorh23.putInt("blueThresholdh23", blueThresholdh23);
            editorh23.putInt("yellowThresholdh23", yellowThresholdh23);
            editorh23.putInt("redThresholdh23", redThresholdh23);
            editorh23.apply();
        }

        synchronized (editorh24) {
            editorh24.putBoolean(TIMER_STARTED_KEYh24, handler1.hasCallbacks(updateTimerThread24));
            editorh24.putLong(START_TIME_KEY24, startTimeh24);
            editorh24.putLong(ELAPSED_TIME_KEYh24, timeInMillisechondshh24);
            editorh24.putBoolean("peopleh_key2h4", peopleh2h_24);

            editorh24.putBoolean("flashingh_key2h4", flashingh24);
            editorh24.putBoolean("flashinghg_key2h4", flashinghg24);
            editorh24.putBoolean("isTimerRunningh24", isTimerRunningh24);
            editorh24.putInt("currentHourh2h4", currentHourh2h4);
            editorh24.putInt("currentMinuteh24", currentMinuteh24);


            editorh24.putInt("blueThresholdh24", blueThresholdh24);
            editorh24.putInt("yellowThresholdh24", yellowThresholdh24);
            editorh24.putInt("redThresholdh24", redThresholdh24);
            editorh24.apply();
        }

        synchronized (editorh25) {
            editorh25.putBoolean(TIMER_STARTED_KEYh25, handler1.hasCallbacks(updateTimerThread25));
            editorh25.putLong(START_TIME_KEY25, startTimeh25);
            editorh25.putLong(ELAPSED_TIME_KEYh25, timeInMillisechondshh25);
            editorh25.putBoolean("peopleh_key2h5", peopleh2h_25);

            editorh25.putBoolean("flashingh_key2h5", flashingh25);
            editorh25.putBoolean("flashinghg_key2h5", flashinghg25);
            editorh25.putBoolean("isTimerRunningh25", isTimerRunningh25);
            editorh25.putInt("currentHourh2h5", currentHourh2h5);
            editorh25.putInt("currentMinuteh25", currentMinuteh25);


            editorh25.putInt("blueThresholdh25", blueThresholdh25);
            editorh25.putInt("yellowThresholdh25", yellowThresholdh25);
            editorh25.putInt("redThresholdh25", redThresholdh25);
            editorh25.apply();
        }

        synchronized (editorh26) {
            editorh26.putBoolean(TIMER_STARTED_KEYh26, handler1.hasCallbacks(updateTimerThread26));
            editorh26.putLong(START_TIME_KEY26, startTimeh26);
            editorh26.putLong(ELAPSED_TIME_KEYh26, timeInMillisechondshh26);
            editorh26.putBoolean("peopleh_key2h6", peopleh2h_26);

            editorh26.putBoolean("flashingh_key2h6", flashingh26);
            editorh26.putBoolean("flashinghg_key2h6", flashinghg26);
            editorh26.putBoolean("isTimerRunningh26", isTimerRunningh26);
            editorh26.putInt("currentHourh2h6", currentHourh2h6);
            editorh26.putInt("currentMinuteh26", currentMinuteh26);


            editorh26.putInt("blueThresholdh26", blueThresholdh26);
            editorh26.putInt("yellowThresholdh262", yellowThresholdh26);
            editorh26.putInt("redThresholdh26", redThresholdh26);
            editorh26.apply();
        }

        synchronized (editorh27) {
            editorh27.putBoolean(TIMER_STARTED_KEYh27, handler1.hasCallbacks(updateTimerThread27));
            editorh27.putLong(START_TIME_KEY27, startTimeh27);
            editorh27.putLong(ELAPSED_TIME_KEYh27, timeInMillisechondshh27);
            editorh27.putBoolean("peopleh_key2h7", peopleh2h_27);

            editorh27.putBoolean("flashingh_key2h7", flashingh27);
            editorh27.putBoolean("flashinghg_key2h7", flashinghg27);
            editorh27.putBoolean("isTimerRunningh27", isTimerRunningh27);
            editorh27.putInt("currentHourh2h7", currentHourh2h7);
            editorh27.putInt("currentMinuteh27", currentMinuteh27);


            editorh27.putInt("blueThresholdh27", blueThresholdh27);
            editorh27.putInt("yellowThresholdh27", yellowThresholdh27);
            editorh27.putInt("redThresholdh27", redThresholdh27);
            editorh27.apply();
        }

        synchronized (editorh28) {
            editorh28.putBoolean(TIMER_STARTED_KEYh28, handler1.hasCallbacks(updateTimerThread28));
            editorh28.putLong(START_TIME_KEY28, startTimeh28);
            editorh28.putLong(ELAPSED_TIME_KEYh28, timeInMillisechondshh28);
            editorh28.putBoolean("peopleh_key2h8", peopleh2h_28);

            editorh28.putBoolean("flashingh_key2h8", flashingh28);
            editorh28.putBoolean("flashinghg_key2h8", flashinghg28);
            editorh28.putBoolean("isTimerRunningh28", isTimerRunningh28);
            editorh28.putInt("currentHourh2h8", currentHourh2h8);
            editorh28.putInt("currentMinuteh28", currentMinuteh28);


            editorh28.putInt("blueThresholdh28", blueThresholdh28);
            editorh28.putInt("yellowThresholdh28", yellowThresholdh28);
            editorh28.putInt("redThresholdh28", redThresholdh28);
            editorh28.apply();
        }
        synchronized (editorh66) {
            editorh66.putBoolean(TIMER_STARTED_KEYh66, handler1.hasCallbacks(updateTimerThread66));
            editorh66.putLong(START_TIME_KEY66, startTimeh66);
            editorh66.putLong(ELAPSED_TIME_KEYh66, timeInMillisechondshh66);
            editorh66.putBoolean("peopleh_key66", peopleh2h_66);

            editorh66.putBoolean("flashingh_key66", flashingh66);
            editorh66.putBoolean("flashinghg_key66", flashinghg66);
            editorh66.putBoolean("isTimerRunningh66", isTimerRunningh66);
            editorh66.putInt("currentHourh66", currentHourh66);
            editorh66.putInt("currentMinuteh66", currentMinuteh66);


            editorh66.putInt("blueThresholdh66", blueThresholdh66);
            editorh66.putInt("yellowThresholdh66", yellowThresholdh66);
            editorh66.putInt("redThresholdh66", redThresholdh66);
            editorh66.apply();
        }


    }

    @Override
    public void onResume() {
        super.onResume();

        synchronized (editorh1) {
            boolean timerStarted1 = sharedPreferences1h.getBoolean(TIMER_STARTED_KEYh1, false);
            if (timerStarted1) {
                startTimeh1 = sharedPreferences1h.getLong(START_TIME_KEY1h, 0);
                timeInMillisechondshh1 = sharedPreferences1h.getLong(ELAPSED_TIME_KEYh1, 0);
                sech1 = (int) (timeInMillisechondshh1 / 1000);
                handler1.postDelayed(updateTimerThread1, 0);
            }
            peopleh2h_1 = sharedPreferences1h.getBoolean("peopleh_key1", false);
            flashingh1 = sharedPreferences1h.getBoolean("flashingh_key1", false);
            flashinghg1 = sharedPreferences1h.getBoolean("flashinghg_key1", false);
            isTimerRunningh1 = sharedPreferences1h.getBoolean("isTimerRunningh1", false);
            currentHourh1 = sharedPreferences1h.getInt("currentHourh1",currentHourh1);
            currentMinuteh1 = sharedPreferences1h.getInt("currentMinuteh1",currentMinuteh1);

            // 恢复加時時間  測試用
            blueThresholdh1 = sharedPreferences1h.getInt("blueThresholdh1", originalblueThresholdh2h);
            yellowThresholdh1 = sharedPreferences1h.getInt("yellowThresholdh1", originalyellowThresholdh2h);
            redThresholdh1 = sharedPreferences1h.getInt("redThresholdh1", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor1();
        }

        synchronized (editorh2) {
            boolean timerStarted2 = sharedPreferences2h.getBoolean(TIMER_STARTED_KEYh2, false);
            if (timerStarted2) {
                startTimeh2 = sharedPreferences2h.getLong(START_TIME_KEY2, 0);
                timeInMillisechondshh2 = sharedPreferences2h.getLong(ELAPSED_TIME_KEYh2, 0);
                sech2 = (int) (timeInMillisechondshh2 / 1000);
                handler1.postDelayed(updateTimerThread2, 0);
            }
            peopleh2h_2 = sharedPreferences2h.getBoolean("peopleh_key2h", false);
            flashingh2 = sharedPreferences2h.getBoolean("flashingh_key2h", false);
            flashinghg2 = sharedPreferences2h.getBoolean("flashinghg_key2h", false);
            isTimerRunningh2 = sharedPreferences2h.getBoolean("isTimerRunningh2", false);
            currentHourh2h = sharedPreferences2h.getInt("currentHourh2h", currentHourh2h);
            currentMinuteh2 = sharedPreferences2h.getInt("currentMinuteh2", currentMinuteh2);




            // 恢复加時時間
            blueThresholdh2 = sharedPreferences2h.getInt("blueThresholdh2", originalblueThresholdh2h);
            yellowThresholdh2 = sharedPreferences2h.getInt("yellowThresholdh2", originalyellowThresholdh2h);
            redThresholdh2 = sharedPreferences2h.getInt("redThresholdh2", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h();
        }

        synchronized (editorh3) {
            boolean timerStarted3 = sharedPreferences3h.getBoolean(TIMER_STARTED_KEYh3, false);
            if (timerStarted3) {
                startTimeh3 = sharedPreferences3h.getLong(START_TIME_KEY3, 0);
                timeInMillisechondshh3 = sharedPreferences3h.getLong(ELAPSED_TIME_KEYh3, 0);
                sech3 = (int) (timeInMillisechondshh3 / 1000);
                handler1.postDelayed(updateTimerThread3, 0);
            }
            peopleh2h_3 = sharedPreferences3h.getBoolean("peopleh_key3h", false);
            flashingh3 = sharedPreferences3h.getBoolean("flashingh_key3h", false);
            flashinghg3 = sharedPreferences3h.getBoolean("flashinghg_key3h", false);
            isTimerRunningh3 = sharedPreferences3h.getBoolean("isTimerRunningh3", false);
            currentHourh3h = sharedPreferences3h.getInt("currentHourh3h", currentHourh3h);
            currentMinuteh3 = sharedPreferences3h.getInt("currentMinuteh3", currentMinuteh3);




            // 恢复加時時間
            blueThresholdh3 = sharedPreferences3h.getInt("blueThresholdh3", originalblueThresholdh2h);
            yellowThresholdh3 = sharedPreferences3h.getInt("yellowThresholdh3", originalyellowThresholdh2h);
            redThresholdh3 = sharedPreferences3h.getInt("redThresholdh3", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor3h();
        }

        synchronized (editorh4) {
            boolean timerStarted4 = sharedPreferences4h.getBoolean(TIMER_STARTED_KEYh4, false);
            if (timerStarted4) {
                startTimeh4 = sharedPreferences4h.getLong(START_TIME_KEY4, 0);
                timeInMillisechondshh4 = sharedPreferences4h.getLong(ELAPSED_TIME_KEYh4, 0);
                sech4 = (int) (timeInMillisechondshh4 / 1000);
                handler1.postDelayed(updateTimerThread4, 0);
            }
            peopleh2h_4 = sharedPreferences4h.getBoolean("peopleh_key4", false);
            flashingh4 = sharedPreferences4h.getBoolean("flashingh_key4", false);
            flashinghg4 = sharedPreferences4h.getBoolean("flashinghg_key4", false);
            isTimerRunningh4 = sharedPreferences4h.getBoolean("isTimerRunningh4", false);
            currentHourh4 = sharedPreferences4h.getInt("currentHourh4", currentHourh4);
            currentMinuteh4 = sharedPreferences4h.getInt("currentMinuteh4", currentMinuteh4);



            // 恢复加時時間
            blueThresholdh4 = sharedPreferences4h.getInt("blueThresholdh4", originalblueThresholdh2h);
            yellowThresholdh4 = sharedPreferences4h.getInt("yellowThresholdh4", originalyellowThresholdh2h);
            redThresholdh4 = sharedPreferences4h.getInt("redThresholdh4", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor4();
        }

        synchronized (editorh5) {
            boolean timerStarted5 = sharedPreferences5h.getBoolean(TIMER_STARTED_KEYh5, false);
            if (timerStarted5) {
                startTimeh5 = sharedPreferences5h.getLong(START_TIME_KEY5, 0);
                timeInMillisechondshh5 = sharedPreferences5h.getLong(ELAPSED_TIME_KEYh5, 0);
                sech5 = (int) (timeInMillisechondshh5 / 1000);
                handler1.postDelayed(updateTimerThread5, 0);
            }
            peopleh2h_5 = sharedPreferences5h.getBoolean("peopleh_key5", false);
            flashingh5 = sharedPreferences5h.getBoolean("flashingh_key5", false);
            flashinghg5 = sharedPreferences5h.getBoolean("flashinghg_key5", false);
            isTimerRunningh5 = sharedPreferences5h.getBoolean("isTimerRunningh5", false);
            currentHourh5 = sharedPreferences5h.getInt("currentHourh5", currentHourh5);
            currentMinuteh5 = sharedPreferences5h.getInt("currentMinuteh5", currentMinuteh5);




            // 恢复加時時間
            blueThresholdh5 = sharedPreferences5h.getInt("blueThresholdh5", originalblueThresholdh2h);
            yellowThresholdh5 = sharedPreferences5h.getInt("yellowThresholdh5", originalyellowThresholdh2h);
            redThresholdh5 = sharedPreferences5h.getInt("redThresholdh5", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor5();
        }



        synchronized (editorh7) {
            boolean timerStarted7 = sharedPreferences7h.getBoolean(TIMER_STARTED_KEYh7, false);
            if (timerStarted7) {
                startTimeh7 = sharedPreferences7h.getLong(START_TIME_KEY7, 0);
                timeInMillisechondshh7 = sharedPreferences7h.getLong(ELAPSED_TIME_KEYh7, 0);
                sech7 = (int) (timeInMillisechondshh7 / 1000);
                handler1.postDelayed(updateTimerThread7, 0);
            }
            peopleh2h_7 = sharedPreferences7h.getBoolean("peopleh_key7", false);
            flashingh7 = sharedPreferences7h.getBoolean("flashingh_key7", false);
            flashinghg7 = sharedPreferences7h.getBoolean("flashinghg_key7", false);
            isTimerRunningh7 = sharedPreferences7h.getBoolean("isTimerRunningh7", false);
            currentHourh7 = sharedPreferences7h.getInt("currentHourh7", currentHourh7);
            currentMinuteh7 = sharedPreferences7h.getInt("currentMinuteh7", currentMinuteh7);




            // 恢复加時時間
            blueThresholdh7 = sharedPreferences7h.getInt("blueThresholdh7", originalblueThresholdh2h);
            yellowThresholdh7 = sharedPreferences7h.getInt("yellowThresholdh7", originalyellowThresholdh2h);
            redThresholdh7 = sharedPreferences7h.getInt("redThresholdh7", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor7();
        }

        synchronized (editorh8) {
            boolean timerStarted8 = sharedPreferences8h.getBoolean(TIMER_STARTED_KEYh8, false);
            if (timerStarted8) {
                startTimeh8 = sharedPreferences8h.getLong(START_TIME_KEY8, 0);
                timeInMillisechondshh8 = sharedPreferences8h.getLong(ELAPSED_TIME_KEYh8, 0);
                sech8 = (int) (timeInMillisechondshh8 / 1000);
                handler1.postDelayed(updateTimerThread8, 0);
            }
            peopleh2h_8 = sharedPreferences8h.getBoolean("peopleh_key8", false);
            flashingh8 = sharedPreferences8h.getBoolean("flashingh_key8", false);
            flashinghg8 = sharedPreferences8h.getBoolean("flashinghg_key8", false);
            isTimerRunningh8 = sharedPreferences8h.getBoolean("isTimerRunningh8", false);
            currentHourh8 = sharedPreferences8h.getInt("currentHourh8", currentHourh8);
            currentMinuteh8 = sharedPreferences8h.getInt("currentMinuteh8", currentMinuteh8);




            // 恢复加時時間
            blueThresholdh8 = sharedPreferences8h.getInt("blueThresholdh8", originalblueThresholdh2h);
            yellowThresholdh8 = sharedPreferences8h.getInt("yellowThresholdh8", originalyellowThresholdh2h);
            redThresholdh8 = sharedPreferences8h.getInt("redThresholdh8", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor8();
        }

        synchronized (editorh9) {
            boolean timerStarted9 = sharedPreferences9h.getBoolean(TIMER_STARTED_KEYh9, false);
            if (timerStarted9) {
                startTimeh9 = sharedPreferences9h.getLong(START_TIME_KEY9, 0);
                timeInMillisechondshh9 = sharedPreferences9h.getLong(ELAPSED_TIME_KEYh9, 0);
                sech9 = (int) (timeInMillisechondshh9 / 1000);
                handler1.postDelayed(updateTimerThread9, 0);
            }
            peopleh2h_9 = sharedPreferences9h.getBoolean("peopleh_key9", false);
            flashingh9 = sharedPreferences9h.getBoolean("flashingh_key9", false);
            flashinghg9 = sharedPreferences9h.getBoolean("flashinghg_key9", false);
            isTimerRunningh9 = sharedPreferences9h.getBoolean("isTimerRunningh9", false);
            currentHourh9 = sharedPreferences9h.getInt("currentHourh9", currentHourh9);
            currentMinuteh9 = sharedPreferences9h.getInt("currentMinuteh9", currentMinuteh9);




            // 恢复加時時間
            blueThresholdh9 = sharedPreferences9h.getInt("blueThresholdh9", originalblueThresholdh2h);
            yellowThresholdh9 = sharedPreferences9h.getInt("yellowThresholdh9", originalyellowThresholdh2h);
            redThresholdh9 = sharedPreferences9h.getInt("redThresholdh9", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor9();
        }

        synchronized (editorh10) {
            boolean timerStarted10 = sharedPreferences1h0h.getBoolean(TIMER_STARTED_KEYh10, false);
            if (timerStarted10) {
                startTimeh10 = sharedPreferences1h0h.getLong(START_TIME_KEY1h0, 0);
                timeInMillisechondshh10 = sharedPreferences1h0h.getLong(ELAPSED_TIME_KEYh10, 0);
                sech10 = (int) (timeInMillisechondshh10 / 1000);
                handler1.postDelayed(updateTimerThread10, 0);
            }
            peopleh2h_10 = sharedPreferences1h0h.getBoolean("peopleh_key10", false);
            flashingh10 = sharedPreferences1h0h.getBoolean("flashingh_key10", false);
            flashinghg10 = sharedPreferences1h0h.getBoolean("flashinghg_key10", false);
            isTimerRunningh10 = sharedPreferences1h0h.getBoolean("isTimerRunningh10", false);
            currentHourh10 = sharedPreferences1h0h.getInt("currentHourh10", currentHourh10);
            currentMinuteh10 = sharedPreferences1h0h.getInt("currentMinuteh10", currentMinuteh10);




            // 恢复加時時間
            blueThresholdh10 = sharedPreferences1h0h.getInt("blueThresholdh10", originalblueThresholdh2h);
            yellowThresholdh10 = sharedPreferences1h0h.getInt("yellowThresholdh10", originalyellowThresholdh2h);
            redThresholdh10 = sharedPreferences1h0h.getInt("redThresholdh10", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor10();
        }

        synchronized (editorh11) {
            boolean timerStarted11 = sharedPreferences1h1h.getBoolean(TIMER_STARTED_KEYh11, false);
            if (timerStarted11) {
                startTimeh11 = sharedPreferences1h1h.getLong(START_TIME_KEY1h1, 0);
                timeInMillisechondshh11 = sharedPreferences1h1h.getLong(ELAPSED_TIME_KEYh11, 0);
                sech11 = (int) (timeInMillisechondshh11 / 1000);
                handler1.postDelayed(updateTimerThread11, 0);
            }
            peopleh2h_11 = sharedPreferences1h1h.getBoolean("peopleh_key11", false);
            flashingh11 = sharedPreferences1h1h.getBoolean("flashingh_key11", false);
            flashinghg11 = sharedPreferences1h1h.getBoolean("flashinghg_key11", false);
            isTimerRunningh11 = sharedPreferences1h1h.getBoolean("isTimerRunningh11", false);
            currentHourh11 = sharedPreferences1h1h.getInt("currentHourh11", currentHourh11);
            currentMinuteh11 = sharedPreferences1h1h.getInt("currentMinuteh11", currentMinuteh11);




            // 恢复加時時間
            blueThresholdh11 = sharedPreferences1h1h.getInt("blueThresholdh11", originalblueThresholdh2h);
            yellowThresholdh11 = sharedPreferences1h1h.getInt("yellowThresholdh11", originalyellowThresholdh2h);
            redThresholdh11 = sharedPreferences1h1h.getInt("redThresholdh11", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor11();
        }

        synchronized (editorh12) {
            boolean timerStarted12 = sharedPreferences1h2h.getBoolean(TIMER_STARTED_KEYh12, false);
            if (timerStarted12) {
                startTimeh201 = sharedPreferences1h2h.getLong(START_TIME_KEY1h2, 0);
                timeInMillisechondshh201 = sharedPreferences1h2h.getLong(ELAPSED_TIME_KEYh12, 0);
                sech201 = (int) (timeInMillisechondshh201 / 1000);
                handler1.postDelayed(updateTimerThread201, 0);
            }
            peopleh2h_12 = sharedPreferences1h2h.getBoolean("peopleh_key12", false);
            flashingh201 = sharedPreferences1h2h.getBoolean("flashingh_key12", false);
            flashinghg201 = sharedPreferences1h2h.getBoolean("flashinghg_key12", false);
            isTimerRunningh201 = sharedPreferences1h2h.getBoolean("isTimerRunningh12", false);
            currentHourh12 = sharedPreferences1h2h.getInt("currentHourh12", currentHourh12);
            currentMinuteh12 = sharedPreferences1h2h.getInt("currentMinuteh12", currentMinuteh12);




            // 恢复加時時間
            blueThresholdh201 = sharedPreferences1h2h.getInt("blueThresholdh12", originalblueThresholdh3h);
            yellowThresholdh201 = sharedPreferences1h2h.getInt("yellowThresholdh12", originalyellowThresholdh3h);
            redThresholdh201 = sharedPreferences1h2h.getInt("redThresholdh12", originalredThresholdh3h);

            // 更新按鈕的背景顏色
            updateButtonColor2h01();
        }

        synchronized (editorh13) {
            boolean timerStarted13 = sharedPreferences1h3h.getBoolean(TIMER_STARTED_KEYh13, false);
            if (timerStarted13) {
                startTimeh202 = sharedPreferences1h3h.getLong(START_TIME_KEY1h3, 0);
                timeInMillisechondshh202 = sharedPreferences1h3h.getLong(ELAPSED_TIME_KEYh13, 0);
                sech202 = (int) (timeInMillisechondshh202 / 1000);
                handler1.postDelayed(updateTimerThread202, 0);
            }
            peopleh2h_13 = sharedPreferences1h3h.getBoolean("peopleh_key13", false);
            flashingh202 = sharedPreferences1h3h.getBoolean("flashingh_key13", false);
            flashinghg202 = sharedPreferences1h3h.getBoolean("flashinghg_key13", false);
            isTimerRunningh202 = sharedPreferences1h3h.getBoolean("isTimerRunningh13", false);
            currentHourh13 = sharedPreferences1h3h.getInt("currentHourh13", currentHourh13);
            currentMinuteh13 = sharedPreferences1h3h.getInt("currentMinuteh13", currentMinuteh13);




            // 恢复加時時間
            blueThresholdh202 = sharedPreferences1h3h.getInt("blueThresholdh13", originalblueThresholdh3h);
            yellowThresholdh202 = sharedPreferences1h3h.getInt("yellowThresholdh13", originalyellowThresholdh3h);
            redThresholdh202 = sharedPreferences1h3h.getInt("redThresholdh13", originalredThresholdh3h);

            // 更新按鈕的背景顏色
            updateButtonColor2h02();
        }

        synchronized (editorh14) {
            boolean timerStarted14 = sharedPreferences1h4h.getBoolean(TIMER_STARTED_KEYh14, false);
            if (timerStarted14) {
                startTimeh203 = sharedPreferences1h4h.getLong(START_TIME_KEY1h4, 0);
                timeInMillisechondshh203 = sharedPreferences1h4h.getLong(ELAPSED_TIME_KEYh14, 0);
                sech203 = (int) (timeInMillisechondshh203 / 1000);
                handler1.postDelayed(updateTimerThread203, 0);
            }
            peopleh2h_14 = sharedPreferences1h4h.getBoolean("peopleh_key14", false);
            flashingh203 = sharedPreferences1h4h.getBoolean("flashingh_key14", false);
            flashinghg203 = sharedPreferences1h4h.getBoolean("flashinghg_key14", false);
            isTimerRunningh203 = sharedPreferences1h4h.getBoolean("isTimerRunningh14", false);
            currentHourh14 = sharedPreferences1h4h.getInt("currentHourh14", currentHourh14);
            currentMinuteh14 = sharedPreferences1h4h.getInt("currentMinuteh14", currentMinuteh14);




            // 恢复加時時間
            blueThresholdh203 = sharedPreferences1h4h.getInt("blueThresholdh14", originalblueThresholdh3h);
            yellowThresholdh203 = sharedPreferences1h4h.getInt("yellowThresholdh14", originalyellowThresholdh3h);
            redThresholdh203 = sharedPreferences1h4h.getInt("redThresholdh14", originalredThresholdh3h);

            // 更新按鈕的背景顏色
            updateButtonColor2h03();
        }

        synchronized (editorh15) {
            boolean timerStarted15 = sharedPreferences1h5h.getBoolean(TIMER_STARTED_KEYh15, false);
            if (timerStarted15) {
                startTimeh204 = sharedPreferences1h5h.getLong(START_TIME_KEY1h5, 0);
                timeInMillisechondshh204 = sharedPreferences1h5h.getLong(ELAPSED_TIME_KEYh15, 0);
                sech204 = (int) (timeInMillisechondshh204 / 1000);
                handler1.postDelayed(updateTimerThread204, 0);
            }
            peopleh2h_15 = sharedPreferences1h5h.getBoolean("peopleh_key15", false);
            flashingh204 = sharedPreferences1h5h.getBoolean("flashingh_key15", false);
            flashinghg204 = sharedPreferences1h5h.getBoolean("flashinghg_key15", false);
            isTimerRunningh204 = sharedPreferences1h5h.getBoolean("isTimerRunningh15", false);
            currentHourh15 = sharedPreferences1h5h.getInt("currentHourh15", currentHourh15);
            currentMinuteh15 = sharedPreferences1h5h.getInt("currentMinuteh15", currentMinuteh15);





            // 恢复加時時間
            blueThresholdh204 = sharedPreferences1h5h.getInt("blueThresholdh15", originalblueThresholdh3h);
            yellowThresholdh204 = sharedPreferences1h5h.getInt("yellowThresholdh15", originalyellowThresholdh3h);
            redThresholdh204 = sharedPreferences1h5h.getInt("redThresholdh15", originalredThresholdh3h);

            // 更新按鈕的背景顏色
            updateButtonColor2h04();
        }

        synchronized (editorh16) {
            boolean timerStarted16 = sharedPreferences1h6h.getBoolean(TIMER_STARTED_KEYh16, false);
            if (timerStarted16) {
                startTimeh16 = sharedPreferences1h6h.getLong(START_TIME_KEY1h6, 0);
                timeInMillisechondshh16 = sharedPreferences1h6h.getLong(ELAPSED_TIME_KEYh16, 0);
                sech16 = (int) (timeInMillisechondshh16 / 1000);
                handler1.postDelayed(updateTimerThread16, 0);
            }
            peopleh2h_16 = sharedPreferences1h6h.getBoolean("peopleh_key16", false);
            flashingh16 = sharedPreferences1h6h.getBoolean("flashingh_key16", false);
            flashinghg16 = sharedPreferences1h6h.getBoolean("flashinghg_key16", false);
            isTimerRunningh16 = sharedPreferences1h6h.getBoolean("isTimerRunningh16", false);
            currentHourh16 = sharedPreferences1h6h.getInt("currentHourh16", currentHourh16);
            currentMinuteh16 = sharedPreferences1h6h.getInt("currentMinuteh16", currentMinuteh16);




            // 恢复加時時間
            blueThresholdh16 = sharedPreferences1h6h.getInt("blueThresholdh16", originalblueThresholdh2h);
            yellowThresholdh16 = sharedPreferences1h6h.getInt("yellowThresholdh16", originalyellowThresholdh2h);
            redThresholdh16 = sharedPreferences1h6h.getInt("redThresholdh16", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor16();
        }

        synchronized (editorh17) {
            boolean timerStarted17 = sharedPreferences1h7h.getBoolean(TIMER_STARTED_KEYh17, false);
            if (timerStarted17) {
                startTimeh17 = sharedPreferences1h7h.getLong(START_TIME_KEY1h7, 0);
                timeInMillisechondshh17 = sharedPreferences1h7h.getLong(ELAPSED_TIME_KEYh17, 0);
                sech17 = (int) (timeInMillisechondshh17 / 1000);
                handler1.postDelayed(updateTimerThread17, 0);
            }
            peopleh2h_17 = sharedPreferences1h7h.getBoolean("peopleh_key17", false);
            flashingh17 = sharedPreferences1h7h.getBoolean("flashingh_key17", false);
            flashinghg17 = sharedPreferences1h7h.getBoolean("flashinghg_key17", false);
            isTimerRunningh17 = sharedPreferences1h7h.getBoolean("isTimerRunningh17", false);
            currentHourh17 = sharedPreferences1h7h.getInt("currentHourh17", currentHourh17);
            currentMinuteh17 = sharedPreferences1h7h.getInt("currentMinuteh17", currentMinuteh17);




            // 恢复加時時間
            blueThresholdh17 = sharedPreferences1h7h.getInt("blueThresholdh17", originalblueThresholdh2h);
            yellowThresholdh17 = sharedPreferences1h7h.getInt("yellowThresholdh17", originalyellowThresholdh2h);
            redThresholdh17 = sharedPreferences1h7h.getInt("redThresholdh17", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor17();
        }

        synchronized (editorh18) {
            boolean timerStarted18 = sharedPreferences1h8h.getBoolean(TIMER_STARTED_KEYh18, false);
            if (timerStarted18) {
                startTimeh18 = sharedPreferences1h8h.getLong(START_TIME_KEY1h8, 0);
                timeInMillisechondshh18 = sharedPreferences1h8h.getLong(ELAPSED_TIME_KEYh18, 0);
                sech18 = (int) (timeInMillisechondshh18 / 1000);
                handler1.postDelayed(updateTimerThread18, 0);
            }
            peopleh2h_18 = sharedPreferences1h8h.getBoolean("peopleh_key18", false);
            flashingh18 = sharedPreferences1h8h.getBoolean("flashingh_key18", false);
            flashinghg18 = sharedPreferences1h8h.getBoolean("flashinghg_key18", false);
            isTimerRunningh18 = sharedPreferences1h8h.getBoolean("isTimerRunningh18", false);
            currentHourh18 = sharedPreferences1h8h.getInt("currentHourh18", currentHourh18);
            currentMinuteh18 = sharedPreferences1h8h.getInt("currentMinuteh18", currentMinuteh18);




            // 恢复加時時間
            blueThresholdh18 = sharedPreferences1h8h.getInt("blueThresholdh18", originalblueThresholdh2h);
            yellowThresholdh18 = sharedPreferences1h8h.getInt("yellowThresholdh18", originalyellowThresholdh2h);
            redThresholdh18 = sharedPreferences1h8h.getInt("redThresholdh18", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor18();
        }

        synchronized (editorh19) {
            boolean timerStarted19 = sharedPreferences1h9h.getBoolean(TIMER_STARTED_KEYh19, false);
            if (timerStarted19) {
                startTimeh19 = sharedPreferences1h9h.getLong(START_TIME_KEY1h9, 0);
                timeInMillisechondshh19 = sharedPreferences1h9h.getLong(ELAPSED_TIME_KEYh19, 0);
                sech19 = (int) (timeInMillisechondshh19 / 1000);
                handler1.postDelayed(updateTimerThread19, 0);
            }
            peopleh2h_19 = sharedPreferences1h9h.getBoolean("peopleh_key19", false);
            flashingh19 = sharedPreferences1h9h.getBoolean("flashingh_key19", false);
            flashinghg19 = sharedPreferences1h9h.getBoolean("flashinghg_key19", false);
            isTimerRunningh19 = sharedPreferences1h9h.getBoolean("isTimerRunningh19", false);
            currentHourh19 = sharedPreferences1h9h.getInt("currentHourh19", currentHourh19);
            currentMinuteh19 = sharedPreferences1h9h.getInt("currentMinuteh19", currentMinuteh19);




            // 恢复加時時間
            blueThresholdh19 = sharedPreferences1h9h.getInt("blueThresholdh19", originalblueThresholdh2h);
            yellowThresholdh19 = sharedPreferences1h9h.getInt("yellowThresholdh19", originalyellowThresholdh2h);
            redThresholdh19 = sharedPreferences1h9h.getInt("redThresholdh19", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor19();
        }

        synchronized (editorh20) {
            boolean timerStarted20 = sharedPreferences2h0h.getBoolean(TIMER_STARTED_KEYh20, false);
            if (timerStarted20) {
                startTimeh20 = sharedPreferences2h0h.getLong(START_TIME_KEY20, 0);
                timeInMillisechondshh20 = sharedPreferences2h0h.getLong(ELAPSED_TIME_KEYh20, 0);
                sech20 = (int) (timeInMillisechondshh20 / 1000);
                handler1.postDelayed(updateTimerThread20, 0);
            }
            peopleh2h_20 = sharedPreferences2h0h.getBoolean("peopleh_key2h0", false);
            flashingh20 = sharedPreferences2h0h.getBoolean("flashingh_key2h0", false);
            flashinghg20 = sharedPreferences2h0h.getBoolean("flashinghg_key2h0", false);
            isTimerRunningh20 = sharedPreferences2h0h.getBoolean("isTimerRunningh20", false);
            currentHourh2h0 = sharedPreferences2h0h.getInt("currentHourh2h0", currentHourh2h0);
            currentMinuteh20 = sharedPreferences2h0h.getInt("currentMinuteh20", currentMinuteh20);
            currentHourh2h0 = sharedPreferences2h0h.getInt("currentHourh2h0", currentHourh2h0);
            currentMinuteh20 = sharedPreferences2h0h.getInt("currentMinuteh20", currentMinuteh20);




            // 恢复加時時間
            blueThresholdh20 = sharedPreferences2h0h.getInt("blueThresholdh20", originalblueThresholdh2h);
            yellowThresholdh20 = sharedPreferences2h0h.getInt("yellowThresholdh20", originalyellowThresholdh2h);
            redThresholdh20 = sharedPreferences2h0h.getInt("redThresholdh20", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h0();
        }

        synchronized (editorh21) {
            boolean timerStarted21 = sharedPreferences2h1h.getBoolean(TIMER_STARTED_KEYh21, false);
            if (timerStarted21) {
                startTimeh21 = sharedPreferences2h1h.getLong(START_TIME_KEY21, 0);
                timeInMillisechondshh21 = sharedPreferences2h1h.getLong(ELAPSED_TIME_KEYh21, 0);
                sech21 = (int) (timeInMillisechondshh21 / 1000);
                handler1.postDelayed(updateTimerThread21, 0);
            }
            peopleh2h_21 = sharedPreferences2h1h.getBoolean("peopleh_key2h1", false);
            flashingh21 = sharedPreferences2h1h.getBoolean("flashingh_key2h1", false);
            flashinghg21 = sharedPreferences2h1h.getBoolean("flashinghg_key2h1", false);
            isTimerRunningh21 = sharedPreferences2h1h.getBoolean("isTimerRunningh21", false);
            currentHourh2h1 = sharedPreferences2h1h.getInt("currentHourh2h1", currentHourh2h1);
            currentMinuteh21 = sharedPreferences2h1h.getInt("currentMinuteh21", currentMinuteh21);




            // 恢复加時時間
            blueThresholdh21 = sharedPreferences2h1h.getInt("blueThresholdh21", originalblueThresholdh2h);
            yellowThresholdh21 = sharedPreferences2h1h.getInt("yellowThresholdh21", originalyellowThresholdh2h);
            redThresholdh21 = sharedPreferences2h1h.getInt("redThresholdh21", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h1();
        }

        synchronized (editorh22) {
            boolean timerStarted22 = sharedPreferences2h2h.getBoolean(TIMER_STARTED_KEYh22, false);
            if (timerStarted22) {
                startTimeh22 = sharedPreferences2h2h.getLong(START_TIME_KEY22, 0);
                timeInMillisechondshh22 = sharedPreferences2h2h.getLong(ELAPSED_TIME_KEYh22, 0);
                sech22 = (int) (timeInMillisechondshh22 / 1000);
                handler1.postDelayed(updateTimerThread22, 0);
            }
            peopleh2h_22 = sharedPreferences2h2h.getBoolean("peopleh_key2h2", false);
            flashingh22 = sharedPreferences2h2h.getBoolean("flashingh_key2h2", false);
            flashinghg22 = sharedPreferences2h2h.getBoolean("flashinghg_key2h2", false);
            isTimerRunningh22 = sharedPreferences2h2h.getBoolean("isTimerRunningh22", false);
            currentHourh2h2 = sharedPreferences2h2h.getInt("currentHourh2h2", currentHourh2h2);
            currentMinuteh22 = sharedPreferences2h2h.getInt("currentMinuteh22", currentMinuteh22);




            // 恢复加時時間
            blueThresholdh22 = sharedPreferences2h2h.getInt("blueThresholdh22", originalblueThresholdh2h);
            yellowThresholdh22 = sharedPreferences2h2h.getInt("yellowThresholdh22", originalyellowThresholdh2h);
            redThresholdh22 = sharedPreferences2h2h.getInt("redThresholdh22", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h2();
        }

        synchronized (editorh23) {
            boolean timerStarted23 = sharedPreferences2h3h.getBoolean(TIMER_STARTED_KEYh23, false);
            if (timerStarted23) {
                startTimeh23 = sharedPreferences2h3h.getLong(START_TIME_KEY23, 0);
                timeInMillisechondshh23 = sharedPreferences2h3h.getLong(ELAPSED_TIME_KEYh23, 0);
                sech23 = (int) (timeInMillisechondshh23 / 1000);
                handler1.postDelayed(updateTimerThread23, 0);
            }
            peopleh2h_23 = sharedPreferences2h3h.getBoolean("peopleh_key2h3", false);
            flashingh23 = sharedPreferences2h3h.getBoolean("flashingh_key2h3", false);
            flashinghg23 = sharedPreferences2h3h.getBoolean("flashinghg_key2h3", false);
            isTimerRunningh23 = sharedPreferences2h3h.getBoolean("isTimerRunningh23", false);
            currentHourh2h3 = sharedPreferences2h3h.getInt("currentHourh2h3", currentHourh2h3);
            currentMinuteh23 = sharedPreferences2h3h.getInt("currentMinuteh23", currentMinuteh23);




            // 恢复加時時間
            blueThresholdh23 = sharedPreferences2h3h.getInt("blueThresholdh23", originalblueThresholdh2h);
            yellowThresholdh23 = sharedPreferences2h3h.getInt("yellowThresholdh23", originalyellowThresholdh2h);
            redThresholdh23 = sharedPreferences2h3h.getInt("redThresholdh23", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h3();
        }

        synchronized (editorh24) {
            boolean timerStarted24 = sharedPreferences2h4h.getBoolean(TIMER_STARTED_KEYh24, false);
            if (timerStarted24) {
                startTimeh24 = sharedPreferences2h4h.getLong(START_TIME_KEY24, 0);
                timeInMillisechondshh24 = sharedPreferences2h4h.getLong(ELAPSED_TIME_KEYh24, 0);
                sech24 = (int) (timeInMillisechondshh24 / 1000);
                handler1.postDelayed(updateTimerThread24, 0);
            }
            peopleh2h_24 = sharedPreferences2h4h.getBoolean("peopleh_key2h4", false);
            flashingh24 = sharedPreferences2h4h.getBoolean("flashingh_key2h4", false);
            flashinghg24 = sharedPreferences2h4h.getBoolean("flashinghg_key2h4", false);
            isTimerRunningh24 = sharedPreferences2h4h.getBoolean("isTimerRunningh24", false);
            currentHourh2h4 = sharedPreferences2h4h.getInt("currentHourh2h4", currentHourh2h4);
            currentMinuteh24 = sharedPreferences2h4h.getInt("currentMinuteh24", currentMinuteh24);




            // 恢复加時時間
            blueThresholdh24 = sharedPreferences2h4h.getInt("blueThresholdh24", originalblueThresholdh2h);
            yellowThresholdh24 = sharedPreferences2h4h.getInt("yellowThresholdh24", originalyellowThresholdh2h);
            redThresholdh24 = sharedPreferences2h4h.getInt("redThresholdh24", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h4();
        }

        synchronized (editorh25) {
            boolean timerStarted25 = sharedPreferences2h5h.getBoolean(TIMER_STARTED_KEYh25, false);
            if (timerStarted25) {
                startTimeh25 = sharedPreferences2h5h.getLong(START_TIME_KEY25, 0);
                timeInMillisechondshh25 = sharedPreferences2h5h.getLong(ELAPSED_TIME_KEYh25, 0);
                sech25 = (int) (timeInMillisechondshh25 / 1000);
                handler1.postDelayed(updateTimerThread25, 0);
            }
            peopleh2h_25 = sharedPreferences2h5h.getBoolean("peopleh_key2h5", false);
            flashingh25 = sharedPreferences2h5h.getBoolean("flashingh_key2h5", false);
            flashinghg25 = sharedPreferences2h5h.getBoolean("flashinghg_key2h5", false);
            isTimerRunningh25 = sharedPreferences2h5h.getBoolean("isTimerRunningh25", false);
            currentHourh2h5 = sharedPreferences2h5h.getInt("currentHourh2h5", currentHourh2h5);
            currentMinuteh25 = sharedPreferences2h5h.getInt("currentMinuteh25", currentMinuteh25);


            // 恢复加時時間
            blueThresholdh25 = sharedPreferences2h5h.getInt("blueThresholdh25", originalblueThresholdh2h);
            yellowThresholdh25 = sharedPreferences2h5h.getInt("yellowThresholdh25", originalyellowThresholdh2h);
            redThresholdh25 = sharedPreferences2h5h.getInt("redThresholdh25", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h5();
        }

        synchronized (editorh26) {
            boolean timerStarted26 = sharedPreferences2h6h.getBoolean(TIMER_STARTED_KEYh26, false);
            if (timerStarted26) {
                startTimeh26 = sharedPreferences2h6h.getLong(START_TIME_KEY26, 0);
                timeInMillisechondshh26 = sharedPreferences2h6h.getLong(ELAPSED_TIME_KEYh26, 0);
                sech26 = (int) (timeInMillisechondshh26 / 1000);
                handler1.postDelayed(updateTimerThread26, 0);
            }
            peopleh2h_26 = sharedPreferences2h6h.getBoolean("peopleh_key2h6", false);
            flashingh26 = sharedPreferences2h6h.getBoolean("flashingh_key2h6", false);
            flashinghg26 = sharedPreferences2h6h.getBoolean("flashinghg_key2h6", false);
            isTimerRunningh26 = sharedPreferences2h6h.getBoolean("isTimerRunningh26", false);
            currentHourh2h6 = sharedPreferences2h6h.getInt("currentHourh2h6", currentHourh2h6);
            currentMinuteh26 = sharedPreferences2h6h.getInt("currentMinuteh26", currentMinuteh26);



            // 恢复加時時間
            blueThresholdh26 = sharedPreferences2h6h.getInt("blueThresholdh26", originalblueThresholdh2h);
            yellowThresholdh26 = sharedPreferences2h6h.getInt("yellowThresholdh26", originalyellowThresholdh2h);
            redThresholdh26 = sharedPreferences2h6h.getInt("redThresholdh26", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h6();
        }

        synchronized (editorh27) {
            boolean timerStarted27 = sharedPreferences2h7h.getBoolean(TIMER_STARTED_KEYh27, false);
            if (timerStarted27) {
                startTimeh27 = sharedPreferences2h7h.getLong(START_TIME_KEY27, 0);
                timeInMillisechondshh27 = sharedPreferences2h7h.getLong(ELAPSED_TIME_KEYh27, 0);
                sech27 = (int) (timeInMillisechondshh27 / 1000);
                handler1.postDelayed(updateTimerThread27, 0);
            }
            peopleh2h_27 = sharedPreferences2h7h.getBoolean("peopleh_key2h7", false);
            flashingh27 = sharedPreferences2h7h.getBoolean("flashingh_key2h7", false);
            flashinghg27 = sharedPreferences2h7h.getBoolean("flashinghg_key2h7", false);
            isTimerRunningh27 = sharedPreferences2h7h.getBoolean("isTimerRunningh27", false);
            currentHourh2h7 = sharedPreferences2h7h.getInt("currentHourh2h7", currentHourh2h7);
            currentMinuteh27 = sharedPreferences2h7h.getInt("currentMinuteh27", currentMinuteh27);




            // 恢复加時時間
            blueThresholdh27 = sharedPreferences2h7h.getInt("blueThresholdh27", originalblueThresholdh2h);
            yellowThresholdh27 = sharedPreferences2h7h.getInt("yellowThresholdh27", originalyellowThresholdh2h);
            redThresholdh27 = sharedPreferences2h7h.getInt("redThresholdh27", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h7();
        }

        synchronized (editorh28) {
            boolean timerStarted28 = sharedPreferences2h8h.getBoolean(TIMER_STARTED_KEYh28, false);
            if (timerStarted28) {
                startTimeh28 = sharedPreferences2h8h.getLong(START_TIME_KEY28, 0);
                timeInMillisechondshh28 = sharedPreferences2h8h.getLong(ELAPSED_TIME_KEYh28, 0);
                sech28 = (int) (timeInMillisechondshh28 / 1000);
                handler1.postDelayed(updateTimerThread28, 0);
            }
            peopleh2h_28 = sharedPreferences2h8h.getBoolean("peopleh_key2h8", false);
            flashingh28 = sharedPreferences2h8h.getBoolean("flashingh_key2h8", false);
            flashinghg28 = sharedPreferences2h8h.getBoolean("flashinghg_key2h8", false);
            isTimerRunningh28 = sharedPreferences2h8h.getBoolean("isTimerRunningh28", false);
            currentHourh2h8 = sharedPreferences2h8h.getInt("currentHourh2h8", currentHourh2h8);
            currentMinuteh28 = sharedPreferences2h8h.getInt("currentMinuteh28", currentMinuteh28);




            // 恢复加時時間
            blueThresholdh28 = sharedPreferences2h8h.getInt("blueThresholdh28", originalblueThresholdh2h);
            yellowThresholdh28 = sharedPreferences2h8h.getInt("yellowThresholdh28", originalyellowThresholdh2h);
            redThresholdh28 = sharedPreferences2h8h.getInt("redThresholdh28", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor2h8();

        }
        synchronized (editorh66) {
            boolean timerStarted66 = sharedPreferences6h6h.getBoolean(TIMER_STARTED_KEYh66, false);
            if (timerStarted66) {
                startTimeh66 = sharedPreferences6h6h.getLong(START_TIME_KEY66, 0);
                timeInMillisechondshh66 = sharedPreferences6h6h.getLong(ELAPSED_TIME_KEYh66, 0);
                sech66 = (int) (timeInMillisechondshh66 / 1000);
                handler1.postDelayed(updateTimerThread66, 0);
            }
            peopleh2h_66 = sharedPreferences6h6h.getBoolean("peopleh_key66", false);
            flashingh66 = sharedPreferences6h6h.getBoolean("flashingh_key66", false);
            flashinghg66 = sharedPreferences6h6h.getBoolean("flashinghg_key66", false);
            isTimerRunningh66 = sharedPreferences6h6h.getBoolean("isTimerRunningh66", false);
            currentHourh66 = sharedPreferences6h6h.getInt("currentHourh66", currentHourh66);
            currentMinuteh66 = sharedPreferences6h6h.getInt("currentMinuteh66", currentMinuteh66);




            // 恢复加時時間
            blueThresholdh66 = sharedPreferences6h6h.getInt("blueThresholdh66", originalblueThresholdh2h);
            yellowThresholdh66 = sharedPreferences6h6h.getInt("yellowThresholdh66", originalyellowThresholdh2h);
            redThresholdh66 = sharedPreferences6h6h.getInt("redThresholdh66", originalredThresholdh2h);

            // 更新按鈕的背景顏色
            updateButtonColor66();

        }


    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void stopTimer1() {
        handler1.removeCallbacks(updateTimerThread1);
    }
    private void stopTimer2h() {
        handler1.removeCallbacks(updateTimerThread2);
    }
    private void stopTimer3h() {
        handler1.removeCallbacks(updateTimerThread3);
    }
    private void stopTimer4() {
        handler1.removeCallbacks(updateTimerThread4);
    }
    private void stopTimer5() {
        handler1.removeCallbacks(updateTimerThread5);
    }

    private void stopTimer7() {
        handler1.removeCallbacks(updateTimerThread7);
    }
    private void stopTimer8() {
        handler1.removeCallbacks(updateTimerThread8);
    }
    private void stopTimer9() {
        handler1.removeCallbacks(updateTimerThread9);
    }
    private void stopTimer10() {
        handler1.removeCallbacks(updateTimerThread10);
    }
    private void stopTimer11() {
        handler1.removeCallbacks(updateTimerThread11);
    }
    private void stopTimer16() {
        handler1.removeCallbacks(updateTimerThread16);
    }
    private void stopTimer17() {
        handler1.removeCallbacks(updateTimerThread17);
    }
    private void stopTimer18() {
        handler1.removeCallbacks(updateTimerThread18);
    }
    private void stopTimer19() {
        handler1.removeCallbacks(updateTimerThread19);
    }
    private void stopTimer2h0() {
        handler1.removeCallbacks(updateTimerThread20);
    }
    private void stopTimer2h1() {
        handler1.removeCallbacks(updateTimerThread21);
    }
    private void stopTimer2h2() {
        handler1.removeCallbacks(updateTimerThread22);
    }
    private void stopTimer2h3() {
        handler1.removeCallbacks(updateTimerThread23);
    }
    private void stopTimer2h4() {
        handler1.removeCallbacks(updateTimerThread24);
    }
    private void stopTimer2h5() {
        handler1.removeCallbacks(updateTimerThread25);
    }
    private void stopTimer2h6() {
        handler1.removeCallbacks(updateTimerThread26);
    }
    private void stopTimer2h7() {
        handler1.removeCallbacks(updateTimerThread27);
    }
    private void stopTimer2h8() {
        handler1.removeCallbacks(updateTimerThread28);
    }
    private void stopTimer2h01() {
        handler1.removeCallbacks(updateTimerThread201);
    }
    private void stopTimer2h02() {
        handler1.removeCallbacks(updateTimerThread202);
    }
    private void stopTimer2h03() {
        handler1.removeCallbacks(updateTimerThread203);
    }
    private void stopTimer2h04() {
        handler1.removeCallbacks(updateTimerThread204);
    }
    private void stopTimer66() {
        handler1.removeCallbacks(updateTimerThread66);
    }

    private void resetsechondsh1() {
        sechondsh1 = 0;
        sech1 = 0;
        minutesh1 = 0;
        hoursh1 = 0;
        String timeString = String.format("%02d:%02d", hoursh1, minutesh1);
        btnTimerh1.setText(timeString);
    }
    private void resetsechondsh2() {
        sechondsh2 = 0;
        sech2 = 0;
        minutesh2 = 0;
        hoursh2 = 0;
        String timeString = String.format("%02d:%02d", hoursh2, minutesh2);
        btnTimerh2h.setText(timeString);
    }

    private void resetsechondsh3() {
        sechondsh3 = 0;
        sech3 = 0;
        minutesh3 = 0;
        hoursh3 = 0;
        String timeString = String.format("%02d:%02d", hoursh3, minutesh3);
        btnTimerh3h.setText(timeString);
    }

    private void resetsechondsh4() {
        sechondsh4 = 0;
        sech4 = 0;
        minutesh4 = 0;
        hoursh4 = 0;
        String timeString = String.format("%02d:%02d", hoursh4, minutesh4);
        btnTimerh4.setText(timeString);
    }
    private void resetsechondsh5() {
        sechondsh5 = 0;
        sech5 = 0;
        minutesh5 = 0;
        hoursh5 = 0;
        String timeString = String.format("%02d:%02d", hoursh5, minutesh5);
        btnTimerh5.setText(timeString);
    }

    private void resetsechondsh6() {
        sechondsh6 = 0;
        sech6 = 0;
        minutesh6 = 0;
        hoursh6 = 0;
        String timeString = String.format("%02d:%02d", hoursh6, minutesh6);
        btnTimerh6.setText(timeString);
    }

    private void resetsechondsh7() {
        sechondsh7 = 0;
        sech7 = 0;
        minutesh7 = 0;
        hoursh7 = 0;
        String timeString = String.format("%02d:%02d", hoursh7, minutesh7);
        btnTimerh7.setText(timeString);
    }

    private void resetsechondsh8() {
        sechondsh8 = 0;
        sech8 = 0;
        minutesh8 = 0;
        hoursh8 = 0;
        String timeString = String.format("%02d:%02d", hoursh8, minutesh8);
        btnTimerh8.setText(timeString);
    }

    private void resetsechondsh9() {
        sechondsh9 = 0;
        sech9 = 0;
        minutesh9 = 0;
        hoursh9 = 0;
        String timeString = String.format("%02d:%02d", hoursh9, minutesh9);
        btnTimerh9.setText(timeString);
    }

    private void resetsechondsh10() {
        sechondsh10 = 0;
        sech10 = 0;
        minutesh10 = 0;
        hoursh10 = 0;
        String timeString = String.format("%02d:%02d", hoursh10, minutesh10);
        btnTimerh10.setText(timeString);
    }

    private void resetsechondsh11() {
        sechondsh11 = 0;
        sech11 = 0;
        minutesh11 = 0;
        hoursh11 = 0;
        String timeString = String.format("%02d:%02d", hoursh11, minutesh11);
        btnTimerh11.setText(timeString);
    }

    private void resetsechondsh16() {
        sechondsh16 = 0;
        sech16 = 0;
        minutesh16 = 0;
        hoursh16 = 0;
        String timeString = String.format("%02d:%02d", hoursh16, minutesh16);
        btnTimerh16.setText(timeString);
    }

    private void resetsechondsh17() {
        sechondsh17 = 0;
        sech17 = 0;
        minutesh17 = 0;
        hoursh17 = 0;
        String timeString = String.format("%02d:%02d", hoursh17, minutesh17);
        btnTimerh17.setText(timeString);
    }

    private void resetsechondsh18() {
        sechondsh18 = 0;
        sech18 = 0;
        minutesh18 = 0;
        hoursh18 = 0;
        String timeString = String.format("%02d:%02d", hoursh18, minutesh18);
        btnTimerh18.setText(timeString);
    }

    private void resetsechondsh19() {
        sechondsh19 = 0;
        sech19 = 0;
        minutesh19 = 0;
        hoursh19 = 0;
        String timeString = String.format("%02d:%02d", hoursh19, minutesh19);
        btnTimerh19.setText(timeString);
    }

    private void resetsechondsh20() {
        sechondsh20 = 0;
        sech20 = 0;
        minutesh20 = 0;
        hoursh20 = 0;
        String timeString = String.format("%02d:%02d", hoursh20, minutesh20);
        btnTimerh2h0.setText(timeString);
    }

    private void resetsechondsh21() {
        sechondsh21 = 0;
        sech21 = 0;
        minutesh21 = 0;
        hoursh21 = 0;
        String timeString = String.format("%02d:%02d", hoursh21, minutesh21);
        btnTimerh2h1.setText(timeString);
    }

    private void resetsechondsh22() {
        sechondsh22 = 0;
        sech22 = 0;
        minutesh22 = 0;
        hoursh22 = 0;
        String timeString = String.format("%02d:%02d", hoursh22, minutesh22);
        btnTimerh2h2.setText(timeString);
    }

    private void resetsechondsh23() {
        sechondsh23 = 0;
        sech23 = 0;
        minutesh23 = 0;
        hoursh23 = 0;
        String timeString = String.format("%02d:%02d", hoursh23, minutesh23);
        btnTimerh2h3.setText(timeString);
    }

    private void resetsechondsh24() {
        sechondsh24 = 0;
        sech24 = 0;
        minutesh24 = 0;
        hoursh24 = 0;
        String timeString = String.format("%02d:%02d", hoursh24, minutesh24);
        btnTimerh2h4.setText(timeString);
    }

    private void resetsechondsh25() {
        sechondsh25 = 0;
        sech25 = 0;
        minutesh25 = 0;
        hoursh25 = 0;
        String timeString = String.format("%02d:%02d", hoursh25, minutesh25);
        btnTimerh2h5.setText(timeString);
    }

    private void resetsechondsh26() {
        sechondsh26 = 0;
        sech26 = 0;
        minutesh26 = 0;
        hoursh26 = 0;
        String timeString = String.format("%02d:%02d", hoursh26, minutesh26);
        btnTimerh2h6.setText(timeString);
    }

    private void resetsechondsh27() {
        sechondsh27 = 0;
        sech27 = 0;
        minutesh27 = 0;
        hoursh27 = 0;
        String timeString = String.format("%02d:%02d",  hoursh27, minutesh27);
        btnTimerh2h7.setText(timeString);
    }

    private void resetsechondsh28() {
        sechondsh28 = 0;
        sech28 = 0;
        minutesh28 = 0;
        hoursh28 = 0;
        String timeString = String.format("%02d:%02d",  hoursh28, minutesh28);
        btnTimerh2h8.setText(timeString);
    }
    private void resetsechondsh66() {
        sechondsh66 = 0;
        sech66 = 0;
        minutesh66 = 0;
        hoursh66 = 0;
        String timeString = String.format("%02d:%02d",  hoursh66, minutesh66);
        btnTimerh66.setText(timeString);
    }

    private void resetsechondsh201() {
        sechondsh201 = 0;
        sech201 = 0;
        minutesh201 = 0;
        hoursh201 = 0;
        String timeString = String.format("%02d:%02d", hoursh201, minutesh201);
        btnTimerh2h01.setText(timeString);
    }

    private void resetsechondsh202() {
        sechondsh202 = 0;
        sech202 = 0;
        minutesh202 = 0;
        hoursh202 = 0;
        String timeString = String.format("%02d:%02d", hoursh202, minutesh202);
        btnTimerh2h02.setText(timeString);
    }

    private void resetsechondsh203() {
        sechondsh203 = 0;
        sech203 = 0;
        minutesh203 = 0;
        hoursh203 = 0;
        String timeString = String.format("%02d:%02d", hoursh203, minutesh203);
        btnTimerh2h03.setText(timeString);
    }

    private void resetsechondsh204() {
        sechondsh204 = 0;
        sech204 = 0;
        minutesh204 = 0;
        hoursh204 = 0;
        String timeString = String.format("%02d:%02d", hoursh204, minutesh204);
        btnTimerh2h04.setText(timeString);
    }


    private void resetButtonColor1() {
        btnTimerh1.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor2h() {
        btnTimerh2h.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor3h() {
        btnTimerh3h.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor4() {
        btnTimerh4.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor5() {
        btnTimerh5.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor6() {
        btnTimerh6.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor7() {
        btnTimerh7.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor8() {
        btnTimerh8.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor9() {
        btnTimerh9.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor10() {
        btnTimerh10.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor11() {
        btnTimerh11.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor16() {
        btnTimerh16.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor17() {
        btnTimerh17.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor18() {
        btnTimerh18.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor19() {
        btnTimerh19.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h0() {
        btnTimerh2h0.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h1() {
        btnTimerh2h1.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h2() {
        btnTimerh2h2.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h3() {
        btnTimerh2h3.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h4() {
        btnTimerh2h4.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h5() {
        btnTimerh2h5.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h6() {
        btnTimerh2h6.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h7() {
        btnTimerh2h7.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h8() {
        btnTimerh2h8.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor66() {
        btnTimerh66.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h01() {
        btnTimerh2h01.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h02() {
        btnTimerh2h02.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h03() {
        btnTimerh2h03.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2h04() {
        btnTimerh2h04.setBackgroundColor(getResources().getColor(R.color.white));
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
                resetsechondsh1();
                resetButtonColor1();
                btnTimerh1.clearAnimation();
                flashingh1 = false;
                flashinghg1 = false;
                isTimerRunningh1 = false;
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
                stopTimer2h();
                resetThresholdsToOriginal2();
                resetsechondsh2();
                resetButtonColor2h();
                btnTimerh2h.clearAnimation();
                flashingh2 = false;flashinghg2 = false;
                isTimerRunningh2 = false;


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
                stopTimer3h();
                resetThresholdsToOriginal3();
                resetsechondsh3();
                resetButtonColor3h();
                btnTimerh3h.clearAnimation();
                flashingh3 = false;flashinghg3 = false;
                isTimerRunningh3 = false;

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
                resetsechondsh4();
                resetButtonColor4();
                btnTimerh4.clearAnimation();
                flashingh4 = false;flashinghg4 = false;
                isTimerRunningh4 = false;

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
                resetsechondsh5();
                resetButtonColor5();
                btnTimerh5.clearAnimation();
                flashingh5 = false;flashinghg5 = false;
                isTimerRunningh5 = false;


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
                resetsechondsh7();
                resetButtonColor7();
                btnTimerh7.clearAnimation();
                flashingh7 = false;flashinghg7 = false;
                isTimerRunningh7 = false;


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
                resetsechondsh8();
                resetButtonColor8();
                btnTimerh8.clearAnimation();
                flashingh8 = false;flashinghg8 = false;
                isTimerRunningh8 = false;


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
                resetsechondsh9();
                resetButtonColor9();
                btnTimerh9.clearAnimation();
                flashingh9 = false;flashinghg9 = false;
                isTimerRunningh9 = false;



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
                resetsechondsh10();
                resetButtonColor10();
                btnTimerh10.clearAnimation();
                flashingh10 = false;flashinghg10 = false;
                isTimerRunningh10 = false;

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
                resetsechondsh11();
                resetButtonColor11();
                btnTimerh11.clearAnimation();
                flashingh11 = false;flashinghg11 = false;
                isTimerRunningh11 = false;


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
                resetsechondsh16();
                resetButtonColor16();
                btnTimerh16.clearAnimation();
                flashingh16 = false;flashinghg16 = false;
                isTimerRunningh16 = false;


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
                resetsechondsh17();
                resetButtonColor17();
                btnTimerh17.clearAnimation();
                flashingh17 = false;flashinghg17 = false;
                isTimerRunningh17 = false;


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
                resetsechondsh18();
                resetButtonColor18();
                btnTimerh18.clearAnimation();
                flashingh18 = false;flashinghg18 = false;
                isTimerRunningh18 = false;

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
                resetsechondsh19();
                resetButtonColor19();
                btnTimerh19.clearAnimation();
                flashingh19 = false;flashinghg19 = false;
                isTimerRunningh19 = false;

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
                stopTimer2h0();
                resetThresholdsToOriginal20();
                resetsechondsh20();
                resetButtonColor2h0();
                btnTimerh2h0.clearAnimation();
                flashingh20 = false;flashinghg20 = false;
                isTimerRunningh20 = false;

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
                stopTimer2h1();
                resetThresholdsToOriginal21();
                resetsechondsh21();
                resetButtonColor2h1();
                btnTimerh2h1.clearAnimation();
                flashingh21 = false;flashinghg21 = false;
                isTimerRunningh21 = false;

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
                stopTimer2h2();
                resetThresholdsToOriginal22();
                resetsechondsh22();
                resetButtonColor2h2();
                btnTimerh2h2.clearAnimation();
                flashingh22 = false;flashinghg22 = false;
                isTimerRunningh22 = false;

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
                stopTimer2h3();
                resetThresholdsToOriginal23();
                resetsechondsh23();
                resetButtonColor2h3();
                btnTimerh2h3.clearAnimation();
                flashingh23 = false;flashinghg23 = false;
                isTimerRunningh23 = false;


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
                stopTimer2h4();
                resetThresholdsToOriginal24();
                resetsechondsh24();
                resetButtonColor2h4();
                btnTimerh2h4.clearAnimation();
                flashingh24 = false;flashinghg24 = false;
                isTimerRunningh24 = false;

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
                stopTimer2h5();
                resetThresholdsToOriginal25();
                resetsechondsh25();
                resetButtonColor2h5();
                btnTimerh2h5.clearAnimation();
                flashingh25 = false;flashinghg25 = false;
                isTimerRunningh25 = false;

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

    private void showConfirmationDialogYNForButton26() {
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
                stopTimer2h6();
                resetThresholdsToOriginal26();
                resetsechondsh26();
                resetButtonColor2h6();
                btnTimerh2h6.clearAnimation();
                flashingh26 = false;flashinghg26 = false;
                isTimerRunningh26 = false;

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

    private void showConfirmationDialogYNForButton27() {
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
                stopTimer2h7();
                resetThresholdsToOriginal27();
                resetsechondsh27();
                resetButtonColor2h7();
                btnTimerh2h7.clearAnimation();
                flashingh27 = false; flashinghg27 = false;
                isTimerRunningh27 = false;

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

    private void showConfirmationDialogYNForButton28() {
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
                stopTimer2h8();
                resetThresholdsToOriginal28();
                resetsechondsh28();
                resetButtonColor2h8();
                btnTimerh2h8.clearAnimation();
                flashingh28 = false;flashinghg28 = false;
                isTimerRunningh28 = false;

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
                resetsechondsh66();
                resetButtonColor66();
                btnTimerh66.clearAnimation();
                flashingh66 = false;flashinghg66 = false;
                isTimerRunningh66 = false;

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
                stopTimer2h01();
                resetThresholdsToOriginal201();
                resetsechondsh201();
                resetButtonColor2h01();
                btnTimerh2h01.clearAnimation();
                flashingh201 = false;flashinghg201 = false;
                isTimerRunningh201 = false;

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
                stopTimer2h02();
                resetThresholdsToOriginal202();
                resetsechondsh202();
                resetButtonColor2h02();
                btnTimerh2h02.clearAnimation();
                flashingh202 = false;flashinghg202 = false;
                isTimerRunningh202 = false;

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
                stopTimer2h03();
                resetThresholdsToOriginal203();
                resetsechondsh203();
                resetButtonColor2h03();
                btnTimerh2h03.clearAnimation();
                flashingh203 = false;flashinghg203 = false;
                isTimerRunningh203 = false;

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
                stopTimer2h04();
                resetThresholdsToOriginal204();
                resetsechondsh204();
                resetButtonColor2h04();
                btnTimerh2h04.clearAnimation();
                flashingh204 = false;flashinghg204 = false;
                isTimerRunningh204 = false;



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
                peopleh2h_1 = true;
                startTimeh1r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1 = Calendar.getInstance();
                currentHourh1 = currentTime1.get(Calendar.HOUR_OF_DAY);
                currentMinuteh1 = currentTime1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_1 = false;
                startTimeh1r();
                flashingh1 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourh1 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteh1 = currentTime.get(Calendar.MINUTE);

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
                peopleh2h_2 = true;
                startTimeh2r();
                dialog.dismiss();
                Calendar currentTime2 = Calendar.getInstance();
                currentHourh2h = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinuteh2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_2 = false;
                startTimeh2r();
                dialog.dismiss();
                flashingh2 = true;
                Calendar currentTime2 = Calendar.getInstance();
                currentHourh2h = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinuteh2 = currentTime2.get(Calendar.MINUTE);
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
                peopleh2h_3 = true;
                startTimeh3r();
                dialog.dismiss();
                Calendar currentTime3 = Calendar.getInstance();
                currentHourh3h = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinuteh3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_3 = false;
                startTimeh3r();
                dialog.dismiss();
                flashingh3 = true;
                Calendar currentTime3 = Calendar.getInstance();
                currentHourh3h = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinuteh3 = currentTime3.get(Calendar.MINUTE);
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
                peopleh2h_4 = true;
                startTimeh4r();
                dialog.dismiss();
                Calendar currentTime4 = Calendar.getInstance();
                currentHourh4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinuteh4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_4 = false;
                startTimeh4r();
                dialog.dismiss();
                flashingh4 = true;
                Calendar currentTime4 = Calendar.getInstance();
                currentHourh4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinuteh4 = currentTime4.get(Calendar.MINUTE);
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
                peopleh2h_5 = true;
                startTimeh5r();
                dialog.dismiss();
                Calendar currentTime5 = Calendar.getInstance();
                currentHourh5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinuteh5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_5 = false;
                startTimeh5r();
                dialog.dismiss();
                flashingh5 = true;
                Calendar currentTime5 = Calendar.getInstance();
                currentHourh5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinuteh5 = currentTime5.get(Calendar.MINUTE);
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
                peopleh2h_7 = true;
                startTimeh7r();
                dialog.dismiss();
                Calendar currentTime7 = Calendar.getInstance();
                currentHourh7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinuteh7 = currentTime7.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_7 = false;
                startTimeh7r();
                dialog.dismiss();
                flashingh7 = true;
                Calendar currentTime7 = Calendar.getInstance();
                currentHourh7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinuteh7 = currentTime7.get(Calendar.MINUTE);

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
                peopleh2h_8 = true;
                startTimeh8r();
                dialog.dismiss();

                Calendar currentTime8 = Calendar.getInstance();
                currentHourh8 = currentTime8.get(Calendar.HOUR_OF_DAY);
                currentMinuteh8 = currentTime8.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_8 = false;
                startTimeh8r();
                dialog.dismiss();
                flashingh8 = true;

                Calendar currentTime8 = Calendar.getInstance();
                currentHourh8 = currentTime8.get(Calendar.HOUR_OF_DAY);
                currentMinuteh8 = currentTime8.get(Calendar.MINUTE);
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
                peopleh2h_9 = true;
                startTimeh9r();
                dialog.dismiss();

                Calendar currentTime9 = Calendar.getInstance();
                currentHourh9 = currentTime9.get(Calendar.HOUR_OF_DAY);
                currentMinuteh9 = currentTime9.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_9 = false;
                startTimeh9r();
                dialog.dismiss();
                flashingh9 = true;

                Calendar currentTime9 = Calendar.getInstance();
                currentHourh9 = currentTime9.get(Calendar.HOUR_OF_DAY);
                currentMinuteh9 = currentTime9.get(Calendar.MINUTE);
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
                peopleh2h_10 = true;
                startTimeh10r();
                dialog.dismiss();

                Calendar currentTime10 = Calendar.getInstance();
                currentHourh10 = currentTime10.get(Calendar.HOUR_OF_DAY);
                currentMinuteh10 = currentTime10.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_10 = false;
                startTimeh10r();
                dialog.dismiss();
                flashingh10 = true;

                Calendar currentTime10 = Calendar.getInstance();
                currentHourh10 = currentTime10.get(Calendar.HOUR_OF_DAY);
                currentMinuteh10 = currentTime10.get(Calendar.MINUTE);
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
                peopleh2h_11 = true;
                startTimeh11r();
                dialog.dismiss();

                Calendar currentTime11 = Calendar.getInstance();
                currentHourh11 = currentTime11.get(Calendar.HOUR_OF_DAY);
                currentMinuteh11 = currentTime11.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_11 = false;
                startTimeh11r();
                dialog.dismiss();
                flashingh11 = true;

                Calendar currentTime11 = Calendar.getInstance();
                currentHourh11 = currentTime11.get(Calendar.HOUR_OF_DAY);
                currentMinuteh11 = currentTime11.get(Calendar.MINUTE);
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
                peopleh2h_16 = true;
                startTimeh16r();
                dialog.dismiss();
                Calendar currentTime16 = Calendar.getInstance();
                currentHourh16 = currentTime16.get(Calendar.HOUR_OF_DAY);
                currentMinuteh16 = currentTime16.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_16 = false;
                startTimeh16r();
                dialog.dismiss();
                flashingh16 = true;
                Calendar currentTime16 = Calendar.getInstance();
                currentHourh16 = currentTime16.get(Calendar.HOUR_OF_DAY);
                currentMinuteh16 = currentTime16.get(Calendar.MINUTE);
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
                peopleh2h_17 = true;
                startTimeh17r();
                dialog.dismiss();

                Calendar currentTime17 = Calendar.getInstance();
                currentHourh17 = currentTime17.get(Calendar.HOUR_OF_DAY);
                currentMinuteh17 = currentTime17.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_17 = false;
                startTimeh17r();
                dialog.dismiss();
                flashingh17 = true;

                Calendar currentTime17 = Calendar.getInstance();
                currentHourh17 = currentTime17.get(Calendar.HOUR_OF_DAY);
                currentMinuteh17 = currentTime17.get(Calendar.MINUTE);
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
                peopleh2h_18 = true;
                startTimeh18r();
                dialog.dismiss();

                Calendar currentTime18 = Calendar.getInstance();
                currentHourh18 = currentTime18.get(Calendar.HOUR_OF_DAY);
                currentMinuteh18 = currentTime18.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_18 = false;
                startTimeh18r();
                dialog.dismiss();
                flashingh18 = true;

                Calendar currentTime18 = Calendar.getInstance();
                currentHourh18 = currentTime18.get(Calendar.HOUR_OF_DAY);
                currentMinuteh18 = currentTime18.get(Calendar.MINUTE);
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
                peopleh2h_19 = true;
                startTimeh19r();
                dialog.dismiss();

                Calendar currentTime19 = Calendar.getInstance();
                currentHourh19 = currentTime19.get(Calendar.HOUR_OF_DAY);
                currentMinuteh19 = currentTime19.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_19 = false;
                startTimeh19r();
                dialog.dismiss();
                flashingh19 = true;

                Calendar currentTime19 = Calendar.getInstance();
                currentHourh19 = currentTime19.get(Calendar.HOUR_OF_DAY);
                currentMinuteh19 = currentTime19.get(Calendar.MINUTE);
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
                peopleh2h_20 = true;
                startTimeh20r();
                dialog.dismiss();

                Calendar currentTime20 = Calendar.getInstance();
                currentHourh2h0 = currentTime20.get(Calendar.HOUR_OF_DAY);
                currentMinuteh20 = currentTime20.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_20 = false;
                startTimeh20r();
                dialog.dismiss();
                flashingh20 = true;

                Calendar currentTime20 = Calendar.getInstance();
                currentHourh2h0 = currentTime20.get(Calendar.HOUR_OF_DAY);
                currentMinuteh20 = currentTime20.get(Calendar.MINUTE);
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
                peopleh2h_21 = true;
                startTimeh21r();
                dialog.dismiss();

                Calendar currentTime21 = Calendar.getInstance();
                currentHourh2h1 = currentTime21.get(Calendar.HOUR_OF_DAY);
                currentMinuteh21 = currentTime21.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_21 = false;
                startTimeh21r();
                dialog.dismiss();
                flashingh21 = true;

                Calendar currentTime21 = Calendar.getInstance();
                currentHourh2h1 = currentTime21.get(Calendar.HOUR_OF_DAY);
                currentMinuteh21 = currentTime21.get(Calendar.MINUTE);
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
                peopleh2h_22 = true;
                startTimeh22r();
                dialog.dismiss();

                Calendar currentTime22 = Calendar.getInstance();
                currentHourh2h2 = currentTime22.get(Calendar.HOUR_OF_DAY);
                currentMinuteh22 = currentTime22.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_22 = false;
                startTimeh22r();
                dialog.dismiss();
                flashingh22= true;

                Calendar currentTime22 = Calendar.getInstance();
                currentHourh2h2 = currentTime22.get(Calendar.HOUR_OF_DAY);
                currentMinuteh22 = currentTime22.get(Calendar.MINUTE);
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
                peopleh2h_23 = true;
                startTimeh23r();
                dialog.dismiss();

                Calendar currentTime23 = Calendar.getInstance();
                currentHourh2h3 = currentTime23.get(Calendar.HOUR_OF_DAY);
                currentMinuteh23 = currentTime23.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_23 = false;
                startTimeh23r();
                dialog.dismiss();
                flashingh23 = true;

                Calendar currentTime23 = Calendar.getInstance();
                currentHourh2h3 = currentTime23.get(Calendar.HOUR_OF_DAY);
                currentMinuteh23 = currentTime23.get(Calendar.MINUTE);
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
                peopleh2h_24 = true;
                startTimeh24r();
                dialog.dismiss();

                Calendar currentTime24 = Calendar.getInstance();
                currentHourh2h4 = currentTime24.get(Calendar.HOUR_OF_DAY);
                currentMinuteh24 = currentTime24.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_24 = false;
                startTimeh24r();
                dialog.dismiss();
                flashingh24 = true;

                Calendar currentTime24 = Calendar.getInstance();
                currentHourh2h4 = currentTime24.get(Calendar.HOUR_OF_DAY);
                currentMinuteh24 = currentTime24.get(Calendar.MINUTE);
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
                peopleh2h_25 = true;
                startTimeh25r();
                dialog.dismiss();

                Calendar currentTime25 = Calendar.getInstance();
                currentHourh2h5 = currentTime25.get(Calendar.HOUR_OF_DAY);
                currentMinuteh25 = currentTime25.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_25 = false;
                startTimeh25r();
                dialog.dismiss();
                flashingh25 = true;

                Calendar currentTime25 = Calendar.getInstance();
                currentHourh2h5 = currentTime25.get(Calendar.HOUR_OF_DAY);
                currentMinuteh25 = currentTime25.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton26() {
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
                peopleh2h_26 = true;
                startTimeh26r();
                dialog.dismiss();

                Calendar currentTime26 = Calendar.getInstance();
                currentHourh2h6 = currentTime26.get(Calendar.HOUR_OF_DAY);
                currentMinuteh26 = currentTime26.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_26 = false;
                startTimeh26r();
                dialog.dismiss();
                flashingh26 = true;

                Calendar currentTime26 = Calendar.getInstance();
                currentHourh2h6 = currentTime26.get(Calendar.HOUR_OF_DAY);
                currentMinuteh26 = currentTime26.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton27() {
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
                peopleh2h_27 = true;
                startTimeh27r();
                dialog.dismiss();

                Calendar currentTime27 = Calendar.getInstance();
                currentHourh2h7 = currentTime27.get(Calendar.HOUR_OF_DAY);
                currentMinuteh27 = currentTime27.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_27 = false;
                startTimeh27r();
                dialog.dismiss();
                flashingh27 = true;

                Calendar currentTime27 = Calendar.getInstance();
                currentHourh2h7 = currentTime27.get(Calendar.HOUR_OF_DAY);
                currentMinuteh27 = currentTime27.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton28() {
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
                peopleh2h_28 = true;
                startTimeh28r();
                dialog.dismiss();

                Calendar currentTime28 = Calendar.getInstance();
                currentHourh2h8 = currentTime28.get(Calendar.HOUR_OF_DAY);
                currentMinuteh28 = currentTime28.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_28 = false;
                startTimeh28r();
                dialog.dismiss();
                flashingh28 = true;

                Calendar currentTime28 = Calendar.getInstance();
                currentHourh2h8 = currentTime28.get(Calendar.HOUR_OF_DAY);
                currentMinuteh28 = currentTime28.get(Calendar.MINUTE);
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
                peopleh2h_66 = true;
                startTimeh66r();
                dialog.dismiss();

                Calendar currentTime66 = Calendar.getInstance();
                currentHourh66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinuteh66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_66 = false;
                startTimeh66r();
                dialog.dismiss();
                flashingh66 = true;

                Calendar currentTime66 = Calendar.getInstance();
                currentHourh66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinuteh66 = currentTime66.get(Calendar.MINUTE);
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
                peopleh2h_12 = true;
                startTimeh201r();
                dialog.dismiss();

                Calendar currentTime12 = Calendar.getInstance();
                currentHourh12 = currentTime12.get(Calendar.HOUR_OF_DAY);
                currentMinuteh12 = currentTime12.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_12 = false;
                startTimeh201r();
                dialog.dismiss();
                flashingh201 = true;

                Calendar currentTime12 = Calendar.getInstance();
                currentHourh12 = currentTime12.get(Calendar.HOUR_OF_DAY);
                currentMinuteh12 = currentTime12.get(Calendar.MINUTE);
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
                peopleh2h_13 = true;
                startTimeh202r();
                dialog.dismiss();

                Calendar currentTime13 = Calendar.getInstance();
                currentHourh13 = currentTime13.get(Calendar.HOUR_OF_DAY);
                currentMinuteh13 = currentTime13.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_13 = false;
                startTimeh202r();
                dialog.dismiss();
                flashingh202 = true;

                Calendar currentTime13 = Calendar.getInstance();
                currentHourh13 = currentTime13.get(Calendar.HOUR_OF_DAY);
                currentMinuteh13 = currentTime13.get(Calendar.MINUTE);
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
                peopleh2h_14 = true;
                startTimeh203r();
                dialog.dismiss();

                Calendar currentTime14 = Calendar.getInstance();
                currentHourh14 = currentTime14.get(Calendar.HOUR_OF_DAY);
                currentMinuteh14 = currentTime14.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_14 = false;
                startTimeh203r();
                dialog.dismiss();
                flashingh203 = true;

                Calendar currentTime14 = Calendar.getInstance();
                currentHourh14 = currentTime14.get(Calendar.HOUR_OF_DAY);
                currentMinuteh14 = currentTime14.get(Calendar.MINUTE);
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
                peopleh2h_15 = true;
                startTimeh204r();
                dialog.dismiss();

                Calendar currentTime15 = Calendar.getInstance();
                currentHourh15 = currentTime15.get(Calendar.HOUR_OF_DAY);
                currentMinuteh15 = currentTime15.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleh2h_15 = false;
                startTimeh204r();
                dialog.dismiss();
                flashingh204 = true;

                Calendar currentTime15 = Calendar.getInstance();
                currentHourh15 = currentTime15.get(Calendar.HOUR_OF_DAY);
                currentMinuteh15 = currentTime15.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }



    private void startTimeh1r() {
        startTimeh1 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread1, 0);
    }
    private void startTimeh2r() {
        startTimeh2 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread2, 0);
    }

    private void startTimeh3r() {
        startTimeh3 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread3, 0);
    }

    private void startTimeh4r() {
        startTimeh4 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread4, 0);
    }
    private void startTimeh5r() {
        startTimeh5 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread5, 0);
    }



    private void startTimeh7r() {
        startTimeh7 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread7, 0);
    }

    private void startTimeh8r() {
        startTimeh8 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread8, 0);
    }

    private void startTimeh9r() {
        startTimeh9 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread9, 0);
    }
    private void startTimeh10r() {
        startTimeh10 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread10, 0);
    }
    private void startTimeh11r() {
        startTimeh11 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread11, 0);
    }
    private void startTimeh16r() {
        startTimeh16 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread16, 0);
    }
    private void startTimeh17r() {
        startTimeh17 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread17, 0);
    }
    private void startTimeh18r() {
        startTimeh18 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread18, 0);
    }

    private void startTimeh19r() {
        startTimeh19 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread19, 0);
    }

    private void startTimeh20r() {
        startTimeh20 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread20, 0);
    }

    private void startTimeh21r() {
        startTimeh21 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread21, 0);
    }
    private void startTimeh22r() {
        startTimeh22 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread22, 0);
    }

    private void startTimeh23r() {
        startTimeh23 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread23, 0);
    }

    private void startTimeh24r() {
        startTimeh24 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread24, 0);
    }

    private void startTimeh25r() {
        startTimeh25 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread25, 0);
    }

    private void startTimeh26r() {
        startTimeh26 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread26, 0);
    }

    private void startTimeh27r() {
        startTimeh27 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread27, 0);
    }

    private void startTimeh28r() {
        startTimeh28 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread28, 0);
    }
    private void startTimeh66r() {
        startTimeh66 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread66, 0);
    }
    private void startTimeh201r() {
        startTimeh201 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread201, 0);
    }

    private void startTimeh202r() {
        startTimeh202 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread202, 0);
    }

    private void startTimeh203r() {
        startTimeh203 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread203, 0);
    }

    private void startTimeh204r() {
        startTimeh204 = SystemClock.uptimeMillis();
        handler1.postDelayed(updateTimerThread204, 0);
    }






    private void resetThresholdsToOriginal1() {
        //此為測試用 正式版應改為originalyellowThresholdh2
        yellowThresholdh1 = originalyellowThresholdh2h;
        redThresholdh1 = originalredThresholdh2h;
        blueThresholdh1 = originalblueThresholdh2h;
        //yellowThresholdh1 = originalyellowThresholdh2h;
        //redThresholdh1 = originalredThresholdh2h;
        //blueThresholdh1 = originalblueThresholdh2h;
        //此為測試用
    }
    private void resetThresholdsToOriginal2() {
        yellowThresholdh2 = originalyellowThresholdh2h;
        redThresholdh2 = originalredThresholdh2h;
        blueThresholdh2 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal3() {
        yellowThresholdh3 = originalyellowThresholdh2h;
        redThresholdh3 = originalredThresholdh2h;
        blueThresholdh3 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal4() {
        yellowThresholdh4 = originalyellowThresholdh2h;
        redThresholdh4 = originalredThresholdh2h;
        blueThresholdh4 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal5() {
        yellowThresholdh5 = originalyellowThresholdh2h;
        redThresholdh5 = originalredThresholdh2h;
        blueThresholdh5 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal6() {
        yellowThresholdh6 = originalyellowThresholdh2h;
        redThresholdh6 = originalredThresholdh2h;
        blueThresholdh6 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal7() {
        yellowThresholdh7 = originalyellowThresholdh2h;
        redThresholdh7 = originalredThresholdh2h;
        blueThresholdh7 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal8() {
        yellowThresholdh8 = originalyellowThresholdh2h;
        redThresholdh8 = originalredThresholdh2h;
        blueThresholdh8 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal9() {
        yellowThresholdh9 = originalyellowThresholdh2h;
        redThresholdh9 = originalredThresholdh2h;
        blueThresholdh9 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal10() {
        yellowThresholdh10 = originalyellowThresholdh2h;
        redThresholdh10 = originalredThresholdh2h;
        blueThresholdh10 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal11() {
        yellowThresholdh11 = originalyellowThresholdh2h;
        redThresholdh11 = originalredThresholdh2h;
        blueThresholdh11 = originalblueThresholdh2h;
    }
    private void resetThresholdsToOriginal16() {
        yellowThresholdh16 = originalyellowThresholdh2h;
        redThresholdh16 = originalredThresholdh2h;
        blueThresholdh16 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal17() {
        yellowThresholdh17 = originalyellowThresholdh2h;
        redThresholdh17 = originalredThresholdh2h;
        blueThresholdh17 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal18() {
        yellowThresholdh18 = originalyellowThresholdh2h;
        redThresholdh18 = originalredThresholdh2h;
        blueThresholdh18 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal19() {
        yellowThresholdh19 = originalyellowThresholdh2h;
        redThresholdh19 = originalredThresholdh2h;
        blueThresholdh19 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal20() {
        yellowThresholdh20 = originalyellowThresholdh2h;
        redThresholdh20 = originalredThresholdh2h;
        blueThresholdh20 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal21() {
        yellowThresholdh21 = originalyellowThresholdh2h;
        redThresholdh21 = originalredThresholdh2h;
        blueThresholdh21 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal22() {
        yellowThresholdh22 = originalyellowThresholdh2h;
        redThresholdh22 = originalredThresholdh2h;
        blueThresholdh22 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal23() {
        yellowThresholdh23 = originalyellowThresholdh2h;
        redThresholdh23 = originalredThresholdh2h;
        blueThresholdh23 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal24() {
        yellowThresholdh24 = originalyellowThresholdh2h;
        redThresholdh24 = originalredThresholdh2h;
        blueThresholdh24 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal25() {
        yellowThresholdh25 = originalyellowThresholdh2h;
        redThresholdh25 = originalredThresholdh2h;
        blueThresholdh25 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal26() {
        yellowThresholdh26 = originalyellowThresholdh2h;
        redThresholdh26 = originalredThresholdh2h;
        blueThresholdh26 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal27() {
        yellowThresholdh27 = originalyellowThresholdh2h;
        redThresholdh27 = originalredThresholdh2h;
        blueThresholdh27 = originalblueThresholdh2h;
    }

    private void resetThresholdsToOriginal28() {
        yellowThresholdh28 = originalyellowThresholdh2h;
        redThresholdh28 = originalredThresholdh2h;
        blueThresholdh28 = originalblueThresholdh2h;
    }
    private void resetThresholdsToOriginal66() {
        yellowThresholdh66 = originalyellowThresholdh2h;
        redThresholdh66 = originalredThresholdh2h;
        blueThresholdh66 = originalblueThresholdh2h;
    }
    private void resetThresholdsToOriginal201() {
        yellowThresholdh201 = originalyellowThresholdh3h;
        redThresholdh201 = originalredThresholdh3h;
        blueThresholdh201 = originalblueThresholdh3h;
    }

    private void resetThresholdsToOriginal202() {
        yellowThresholdh202 = originalyellowThresholdh3h;
        redThresholdh202 = originalredThresholdh3h;
        blueThresholdh202 = originalblueThresholdh3h;
    }

    private void resetThresholdsToOriginal203() {
        yellowThresholdh203 = originalyellowThresholdh3h;
        redThresholdh203 = originalredThresholdh3h;
        blueThresholdh203 = originalblueThresholdh3h;
    }

    private void resetThresholdsToOriginal204() {
        yellowThresholdh204 = originalyellowThresholdh3h;
        redThresholdh204 = originalredThresholdh3h;
        blueThresholdh204 = originalblueThresholdh3h;
    }

    private Runnable updateTimerThread1 = new Runnable() {
        public void run() {
            timeInMillisechondshh1 = SystemClock.uptimeMillis() - startTimeh1;
            updatedTimeh1 = timeInMillisechondshh1;
            sechondsh1 = (int) (updatedTimeh1 / 1000);
            minutesh1 = sechondsh1 / 60;
            hoursh1 = minutesh1 / 60;
            sechondsh1 = sechondsh1 % 60;
            minutesh1 = minutesh1 % 60;
            sech1 = hoursh1 * 3600 + minutesh1 * 60 + sechondsh1;

            // 计算当前时间加上 redThresholdh1 后的时间（秒数）
            int totalSeconds = currentHourh1 * 60 * 60 + currentMinuteh1 * 60 + redThresholdh1;
            // 计算小时和分钟
            futureHourh1 = totalSeconds / 3600;
            futureMinute1 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh1 >= 24) {
                futureHourh1 %= 24;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh1, currentMinuteh1);
            String futureTimeString = String.format("%02d:%02d", futureHourh1, futureMinute1);

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
                btnTimerh1.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh1.setText(Html.fromHtml(displayText));
            }

            updateButtonColor1();
            handler1.postDelayed(this, 1000);
        }
    };




    private Runnable updateTimerThread2 = new Runnable() {
        public void run() {
            timeInMillisechondshh2 = SystemClock.uptimeMillis() - startTimeh2;
            updatedTimeh2 = timeInMillisechondshh2;
            sechondsh2 = (int) (updatedTimeh2 / 1000);
            minutesh2 = sechondsh2 / 60;
            hoursh2 = minutesh2 / 60;
            sechondsh2 = sechondsh2 % 60;
            minutesh2 = minutesh2 % 60;
            sech2 = hoursh2 * 3600 + minutesh2 * 60 + sechondsh2;

            // 计算当前时间加上 redThresholdh2 后的时间（秒数）
            int totalSeconds = currentHourh2h * 60 * 60 + currentMinuteh2 * 60 + redThresholdh2;
            // 计算小时和分钟
            futureHourh2h = totalSeconds / 3600;
            futureMinute2 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h >= 24) {
                futureHourh2h %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h, currentMinuteh2);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h, futureMinute2);

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
                btnTimerh2h.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread3 = new Runnable() {
        public void run() {
            timeInMillisechondshh3 = SystemClock.uptimeMillis() - startTimeh3;
            updatedTimeh3 = timeInMillisechondshh3;
            sechondsh3 = (int) (updatedTimeh3 / 1000);
            minutesh3 = sechondsh3 / 60;
            hoursh3 = minutesh3 / 60;
            sechondsh3 = sechondsh3 % 60;
            minutesh3 = minutesh3 % 60;
            sech3 = hoursh3 * 3600 + minutesh3 * 60 + sechondsh3;

// 计算当前时间加上 redThresholdh3 后的时间（秒数）
            int totalSeconds = currentHourh3h * 60 * 60 + currentMinuteh3 * 60 + redThresholdh3;
            // 计算小时和分钟
            futureHourh3h = totalSeconds / 3600;
            futureMinute3 = (totalSeconds % 3600) / 60;
            // 处理超过34小时的进位
            if (futureHourh3h >= 24) {
                futureHourh3h %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh3h, currentMinuteh3);
            String futureTimeString = String.format("%02d:%02d", futureHourh3h, futureMinute3);

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
                btnTimerh3h.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh3h.setText(Html.fromHtml(displayText));
            }

            updateButtonColor3h();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread4 = new Runnable() {
        public void run() {
            timeInMillisechondshh4 = SystemClock.uptimeMillis() - startTimeh4;
            updatedTimeh4 = timeInMillisechondshh4;
            sechondsh4 = (int) (updatedTimeh4 / 1000);
            minutesh4 = sechondsh4 / 60;
            hoursh4 = minutesh4 / 60;
            sechondsh4 = sechondsh4 % 60;
            minutesh4 = minutesh4 % 60;
            sech4 =hoursh4 * 3600 + minutesh4 * 60 + sechondsh4;


            // 计算当前时间加上 redThresholdh4 后的时间（秒数）
            int totalSeconds = currentHourh4 * 60 * 60 + currentMinuteh4 * 60 + redThresholdh4;
            // 计算小时和分钟
            futureHourh4 = totalSeconds / 3600;
            futureMinute4 = (totalSeconds % 3600) / 60;
            // 处理超过44小时的进位
            if (futureHourh4 >= 24) {
                futureHourh4 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh4, currentMinuteh4);
            String futureTimeString = String.format("%02d:%02d", futureHourh4, futureMinute4);

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
                btnTimerh4.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh4.setText(Html.fromHtml(displayText));
            }

            updateButtonColor4();
            handler1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThread5 = new Runnable() {
        public void run() {
            timeInMillisechondshh5 = SystemClock.uptimeMillis() - startTimeh5;
            updatedTimeh5 = timeInMillisechondshh5;
            sechondsh5 = (int) (updatedTimeh5 / 1000);
            minutesh5 = sechondsh5 / 60;
            hoursh5 = minutesh5 / 60;
            sechondsh5 = sechondsh5 % 60;
            minutesh5 = minutesh5 % 60;
            sech5 =hoursh5 * 3600 + minutesh5 * 60 + sechondsh5;



            // 计算当前时间加上 redThresholdh5 后的时间（秒数）
            int totalSeconds = currentHourh5 * 60 * 60 + currentMinuteh5 * 60 + redThresholdh5;
            // 计算小时和分钟
            futureHourh5 = totalSeconds / 3600;
            futureMinute5 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh5 >= 24) {
                futureHourh5 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh5, currentMinuteh5);
            String futureTimeString = String.format("%02d:%02d", futureHourh5, futureMinute5);

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
                btnTimerh5.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh5.setText(Html.fromHtml(displayText));
            }

            updateButtonColor5();
            handler1.postDelayed(this, 1000);
        }
    };



    private Runnable updateTimerThread7 = new Runnable() {
        public void run() {
            timeInMillisechondshh7 = SystemClock.uptimeMillis() - startTimeh7;
            updatedTimeh7 = timeInMillisechondshh7;
            sechondsh7 = (int) (updatedTimeh7 / 1000);
            minutesh7 = sechondsh7 / 60;
            hoursh7 = minutesh7 / 60;
            sechondsh7 = sechondsh7 % 60;
            minutesh7 = minutesh7 % 60;
            sech7 =hoursh7 * 3600 + minutesh7 * 60 + sechondsh7;



            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh7 * 60 * 60 + currentMinuteh7 * 60 + redThresholdh7;
            // 计算小时和分钟
            futureHourh7 = totalSeconds / 3600;
            futureMinute7 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh7 >= 24) {
                futureHourh7 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh7, currentMinuteh7);
            String futureTimeString = String.format("%02d:%02d", futureHourh7, futureMinute7);

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
                btnTimerh7.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh7.setText(Html.fromHtml(displayText));
            }

            updateButtonColor7();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread8 = new Runnable() {
        public void run() {
            timeInMillisechondshh8 = SystemClock.uptimeMillis() - startTimeh8;
            updatedTimeh8 = timeInMillisechondshh8;
            sechondsh8 = (int) (updatedTimeh8 / 1000);
            minutesh8 = sechondsh8 / 60;
            hoursh8 = minutesh8 / 60;
            sechondsh8 = sechondsh8 % 60;
            minutesh8 = minutesh8 % 60;
            sech8 =hoursh8 * 3600 + minutesh8 * 60 + sechondsh8;



            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh8 * 60 * 60 + currentMinuteh8 * 60 + redThresholdh8;
            // 计算小时和分钟
            futureHourh8 = totalSeconds / 3600;
            futureMinute8 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh8 >= 24) {
                futureHourh8 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh8, currentMinuteh8);
            String futureTimeString = String.format("%02d:%02d", futureHourh8, futureMinute8);

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
                btnTimerh8.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh8.setText(Html.fromHtml(displayText));
            }

            updateButtonColor8();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread9 = new Runnable() {
        public void run() {
            timeInMillisechondshh9 = SystemClock.uptimeMillis() - startTimeh9;
            updatedTimeh9 = timeInMillisechondshh9;
            sechondsh9 = (int) (updatedTimeh9 / 1000);
            minutesh9 = sechondsh9 / 60;
            hoursh9 = minutesh9 / 60;
            sechondsh9 = sechondsh9 % 60;
            minutesh9 = minutesh9 % 60;
            sech9 =hoursh9 * 3600 + minutesh9 * 60 + sechondsh9;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh9 * 60 * 60 + currentMinuteh9 * 60 + redThresholdh9;
            // 计算小时和分钟
            futureHourh9 = totalSeconds / 3600;
            futureMinute9 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh9 >= 24) {
                futureHourh9 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh9, currentMinuteh9);
            String futureTimeString = String.format("%02d:%02d", futureHourh9, futureMinute9);

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
                btnTimerh9.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh9.setText(Html.fromHtml(displayText));
            }

            updateButtonColor9();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread10 = new Runnable() {
        public void run() {
            timeInMillisechondshh10 = SystemClock.uptimeMillis() - startTimeh10;
            updatedTimeh10 = timeInMillisechondshh10;
            sechondsh10 = (int) (updatedTimeh10 / 1000);
            minutesh10 = sechondsh10 / 60;
            hoursh10 = minutesh10 / 60;
            sechondsh10 = sechondsh10 % 60;
            minutesh10 = minutesh10 % 60;
            sech10 =hoursh10 * 3600 + minutesh10 * 60 + sechondsh10;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh10 * 60 * 60 + currentMinuteh10 * 60 + redThresholdh10;
            // 计算小时和分钟
            futureHourh10 = totalSeconds / 3600;
            futureMinute10 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh10 >= 24) {
                futureHourh10 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh10, currentMinuteh10);
            String futureTimeString = String.format("%02d:%02d", futureHourh10, futureMinute10);

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
                btnTimerh10.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh10.setText(Html.fromHtml(displayText));
            }

            updateButtonColor10();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread11 = new Runnable() {
        public void run() {
            timeInMillisechondshh11 = SystemClock.uptimeMillis() - startTimeh11;
            updatedTimeh11 = timeInMillisechondshh11;
            sechondsh11 = (int) (updatedTimeh11 / 1000);
            minutesh11 = sechondsh11 / 60;
            hoursh11 = minutesh11 / 60;
            sechondsh11 = sechondsh11 % 60;
            minutesh11 = minutesh11 % 60;
            sech11 =hoursh11 * 3600 + minutesh11 * 60 + sechondsh11;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh11 * 60 * 60 + currentMinuteh11 * 60 + redThresholdh11;
            // 计算小时和分钟
            futureHourh11 = totalSeconds / 3600;
            futureMinute11 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh11 >= 24) {
                futureHourh11 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh11, currentMinuteh11);
            String futureTimeString = String.format("%02d:%02d", futureHourh11, futureMinute11);

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
                btnTimerh11.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh11.setText(Html.fromHtml(displayText));
            }

            updateButtonColor11();
            handler1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThread16 = new Runnable() {
        public void run() {
            timeInMillisechondshh16 = SystemClock.uptimeMillis() - startTimeh16;
            updatedTimeh16 = timeInMillisechondshh16;
            sechondsh16 = (int) (updatedTimeh16 / 1000);
            minutesh16 = sechondsh16 / 60;
            hoursh16 = minutesh16 / 60;
            sechondsh16 = sechondsh16 % 60;
            minutesh16 = minutesh16 % 60;
            sech16 =hoursh16 * 3600 + minutesh16 * 60 + sechondsh16;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh16 * 60 * 60 + currentMinuteh16 * 60 + redThresholdh16;
            // 计算小时和分钟
            futureHourh16 = totalSeconds / 3600;
            futureMinute16 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh16 >= 24) {
                futureHourh16 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh16, currentMinuteh16);
            String futureTimeString = String.format("%02d:%02d", futureHourh16, futureMinute16);

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
                btnTimerh16.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh16.setText(Html.fromHtml(displayText));
            }

            updateButtonColor16();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread17 = new Runnable() {
        public void run() {
            timeInMillisechondshh17 = SystemClock.uptimeMillis() - startTimeh17;
            updatedTimeh17 = timeInMillisechondshh17;
            sechondsh17 = (int) (updatedTimeh17 / 1000);
            minutesh17 = sechondsh17 / 60;
            hoursh17 = minutesh17 / 60;
            sechondsh17 = sechondsh17 % 60;
            minutesh17 = minutesh17 % 60;
            sech17 =hoursh17 * 3600 + minutesh17 * 60 + sechondsh17;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh17 * 60 * 60 + currentMinuteh17 * 60 + redThresholdh17;
            // 计算小时和分钟
            futureHourh17 = totalSeconds / 3600;
            futureMinute17 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh17 >= 24) {
                futureHourh17 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh17, currentMinuteh17);
            String futureTimeString = String.format("%02d:%02d", futureHourh17, futureMinute17);

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
                btnTimerh17.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh17.setText(Html.fromHtml(displayText));
            }

            updateButtonColor17();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread18 = new Runnable() {
        public void run() {
            timeInMillisechondshh18 = SystemClock.uptimeMillis() - startTimeh18;
            updatedTimeh18 = timeInMillisechondshh18;
            sechondsh18 = (int) (updatedTimeh18 / 1000);
            minutesh18 = sechondsh18 / 60;
            hoursh18 = minutesh18 / 60;
            sechondsh18 = sechondsh18 % 60;
            minutesh18 = minutesh18 % 60;
            sech18 =hoursh18 * 3600 + minutesh18 * 60 + sechondsh18;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh18 * 60 * 60 + currentMinuteh18 * 60 + redThresholdh18;
            // 计算小时和分钟
            futureHourh18 = totalSeconds / 3600;
            futureMinute18 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh18 >= 24) {
                futureHourh18 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh18, currentMinuteh18);
            String futureTimeString = String.format("%02d:%02d", futureHourh18, futureMinute18);

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
                btnTimerh18.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh18.setText(Html.fromHtml(displayText));
            }

            updateButtonColor18();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread19 = new Runnable() {
        public void run() {
            timeInMillisechondshh19 = SystemClock.uptimeMillis() - startTimeh19;
            updatedTimeh19 = timeInMillisechondshh19;
            sechondsh19 = (int) (updatedTimeh19 / 1000);
            minutesh19 = sechondsh19 / 60;
            hoursh19 = minutesh19 / 60;
            sechondsh19 = sechondsh19 % 60;
            minutesh19 = minutesh19 % 60;
            sech19 =hoursh19 * 3600 + minutesh19 * 60 + sechondsh19;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh19 * 60 * 60 + currentMinuteh19 * 60 + redThresholdh19;
            // 计算小时和分钟
            futureHourh19 = totalSeconds / 3600;
            futureMinute19 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh19 >= 24) {
                futureHourh19 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh19, currentMinuteh19);
            String futureTimeString = String.format("%02d:%02d", futureHourh19, futureMinute19);

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
                btnTimerh19.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh19.setText(Html.fromHtml(displayText));
            }

            updateButtonColor19();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread20 = new Runnable() {
        public void run() {
            timeInMillisechondshh20 = SystemClock.uptimeMillis() - startTimeh20;
            updatedTimeh20 = timeInMillisechondshh20;
            sechondsh20 = (int) (updatedTimeh20 / 1000);
            minutesh20 = sechondsh20 / 60;
            hoursh20 = minutesh20 / 60;
            sechondsh20 = sechondsh20 % 60;
            minutesh20 = minutesh20 % 60;
            sech20 =hoursh20 * 3600 + minutesh20 * 60 + sechondsh20;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh2h0 * 60 * 60 + currentMinuteh20 * 60 + redThresholdh20;
            // 计算小时和分钟
            futureHourh2h0 = totalSeconds / 3600;
            futureMinute20 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h0 >= 24) {
                futureHourh2h0 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h0, currentMinuteh20);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h0, futureMinute20);

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
                btnTimerh2h0.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h0.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h0();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread21 = new Runnable() {
        public void run() {
            timeInMillisechondshh21 = SystemClock.uptimeMillis() - startTimeh21;
            updatedTimeh21 = timeInMillisechondshh21;
            sechondsh21 = (int) (updatedTimeh21 / 1000);
            minutesh21 = sechondsh21 / 60;
            hoursh21 = minutesh21 / 60;
            sechondsh21 = sechondsh21 % 60;
            minutesh21 = minutesh21 % 60;
            sech21 =hoursh21 * 3600 + minutesh21 * 60 + sechondsh21;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh2h1 * 60 * 60 + currentMinuteh21 * 60 + redThresholdh21;
            // 计算小时和分钟
            futureHourh2h1 = totalSeconds / 3600;
            futureMinute21 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h1 >= 24) {
                futureHourh2h1 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h1, currentMinuteh21);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h1, futureMinute21);

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
                btnTimerh2h1.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h1.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h1();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread22 = new Runnable() {
        public void run() {
            timeInMillisechondshh22 = SystemClock.uptimeMillis() - startTimeh22;
            updatedTimeh22 = timeInMillisechondshh22;
            sechondsh22 = (int) (updatedTimeh22 / 1000);
            minutesh22 = sechondsh22 / 60;
            hoursh22 = minutesh22 / 60;
            sechondsh22 = sechondsh22 % 60;
            minutesh22 = minutesh22 % 60;
            sech22 =hoursh22 * 3600 + minutesh22 * 60 + sechondsh22;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh2h2 * 60 * 60 + currentMinuteh22 * 60 + redThresholdh22;
            // 计算小时和分钟
            futureHourh2h2 = totalSeconds / 3600;
            futureMinute22 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h2 >= 24) {
                futureHourh2h2 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h2, currentMinuteh22);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h2, futureMinute22);

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
                btnTimerh2h2.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h2.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h2();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread23 = new Runnable() {
        public void run() {
            timeInMillisechondshh23 = SystemClock.uptimeMillis() - startTimeh23;
            updatedTimeh23 = timeInMillisechondshh23;
            sechondsh23 = (int) (updatedTimeh23 / 1000);
            minutesh23 = sechondsh23 / 60;
            hoursh23 = minutesh23 / 60;
            sechondsh23 = sechondsh23 % 60;
            minutesh23 = minutesh23 % 60;
            sech23 =hoursh23 * 3600 + minutesh23 * 60 + sechondsh23;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh2h3 * 60 * 60 + currentMinuteh23 * 60 + redThresholdh23;
            // 计算小时和分钟
            futureHourh2h3 = totalSeconds / 3600;
            futureMinute23 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h3 >= 24) {
                futureHourh2h3 %= 24;
            }
            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h3, currentMinuteh23);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h3, futureMinute23);

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
                btnTimerh2h3.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h3.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h3();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread24 = new Runnable() {
        public void run() {
            timeInMillisechondshh24 = SystemClock.uptimeMillis() - startTimeh24;
            updatedTimeh24 = timeInMillisechondshh24;
            sechondsh24 = (int) (updatedTimeh24 / 1000);
            minutesh24 = sechondsh24 / 60;
            hoursh24 = minutesh24 / 60;
            sechondsh24 = sechondsh24 % 60;
            minutesh24 = minutesh24 % 60;
            sech24 =hoursh24 * 3600 + minutesh24 * 60 + sechondsh24;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh2h4 * 60 * 60 + currentMinuteh24 * 60 + redThresholdh24;
            // 计算小时和分钟
            futureHourh2h4 = totalSeconds / 3600;
            futureMinute24 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h4 >= 24) {
                futureHourh2h4 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h4, currentMinuteh24);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h4, futureMinute24);

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
                btnTimerh2h4.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h4.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h4();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread25 = new Runnable() {
        public void run() {
            timeInMillisechondshh25 = SystemClock.uptimeMillis() - startTimeh25;
            updatedTimeh25 = timeInMillisechondshh25;
            sechondsh25 = (int) (updatedTimeh25 / 1000);
            minutesh25 = sechondsh25 / 60;
            hoursh25 = minutesh25 / 60;
            sechondsh25 = sechondsh25 % 60;
            minutesh25 = minutesh25 % 60;
            sech25 =hoursh25 * 3600 + minutesh25 * 60 + sechondsh25;

            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh2h5 * 60 * 60 + currentMinuteh25 * 60 + redThresholdh25;
            // 计算小时和分钟
            futureHourh2h5 = totalSeconds / 3600;
            futureMinute25 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h5 >= 24) {
                futureHourh2h5 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h5, currentMinuteh25);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h5, futureMinute25);

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
                btnTimerh2h5.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h5.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h5();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread26 = new Runnable() {
        public void run() {
            timeInMillisechondshh26 = SystemClock.uptimeMillis() - startTimeh26;
            updatedTimeh26 = timeInMillisechondshh26;
            sechondsh26 = (int) (updatedTimeh26 / 1000);
            minutesh26 = sechondsh26 / 60;
            hoursh26 = minutesh26 / 60;
            sechondsh26 = sechondsh26 % 60;
            minutesh26 = minutesh26 % 60;
            sech26 =hoursh26 * 3600 + minutesh26 * 60 + sechondsh26;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh2h6 * 60 * 60 + currentMinuteh26 * 60 + redThresholdh26;
            // 计算小时和分钟
            futureHourh2h6 = totalSeconds / 3600;
            futureMinute26 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h6 >= 24) {
                futureHourh2h6 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h6, currentMinuteh26);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h6, futureMinute26);

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
                btnTimerh2h6.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h6.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h6();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread27 = new Runnable() {
        public void run() {
            timeInMillisechondshh27 = SystemClock.uptimeMillis() - startTimeh27;
            updatedTimeh27 = timeInMillisechondshh27;
            sechondsh27 = (int) (updatedTimeh27 / 1000);
            minutesh27 = sechondsh27 / 60;
            hoursh27 = minutesh27 / 60;
            sechondsh27 = sechondsh27 % 60;
            minutesh27 = minutesh27 % 60;
            sech27 =hoursh27 * 3600 + minutesh27 * 60 + sechondsh27;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh2h7 * 60 * 60 + currentMinuteh27 * 60 + redThresholdh27;
            // 计算小时和分钟
            futureHourh2h7 = totalSeconds / 3600;
            futureMinute27 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h7 >= 24) {
                futureHourh2h7 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h7, currentMinuteh27);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h7, futureMinute27);

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
                btnTimerh2h7.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h7.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h7();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread28 = new Runnable() {
        public void run() {
            timeInMillisechondshh28 = SystemClock.uptimeMillis() - startTimeh28;
            updatedTimeh28 = timeInMillisechondshh28;
            sechondsh28 = (int) (updatedTimeh28 / 1000);
            minutesh28 = sechondsh28 / 60;
            hoursh28 = minutesh28 / 60;
            sechondsh28 = sechondsh28 % 60;
            minutesh28 = minutesh28 % 60;
            sech28 =hoursh28 * 3600 + minutesh28 * 60 + sechondsh28;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh2h8 * 60 * 60 + currentMinuteh28 * 60 + redThresholdh28;
            // 计算小时和分钟
            futureHourh2h8 = totalSeconds / 3600;
            futureMinute28 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh2h8 >= 24) {
                futureHourh2h8 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh2h8, currentMinuteh28);
            String futureTimeString = String.format("%02d:%02d", futureHourh2h8, futureMinute28);

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
                btnTimerh2h8.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h8.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h8();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread66 = new Runnable() {
        public void run() {
            timeInMillisechondshh66 = SystemClock.uptimeMillis() - startTimeh66;
            updatedTimeh66 = timeInMillisechondshh66;
            sechondsh66 = (int) (updatedTimeh66 / 1000);
            minutesh66 = sechondsh66 / 60;
            hoursh66 = minutesh66 / 60;
            sechondsh66 = sechondsh66 % 60;
            minutesh66 = minutesh66 % 60;
            sech66 =hoursh66 * 3600 + minutesh66 * 60 + sechondsh66;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh66 * 60 * 60 + currentMinuteh66 * 60 + redThresholdh66;
            // 计算小时和分钟
            futureHourh66 = totalSeconds / 3600;
            futureMinute66 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh66 >= 24) {
                futureHourh66 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh66, currentMinuteh66);
            String futureTimeString = String.format("%02d:%02d", futureHourh66, futureMinute66);

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
                btnTimerh66.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh66.setText(Html.fromHtml(displayText));
            }

            updateButtonColor66();
            handler1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThread201 = new Runnable() {
        public void run() {
            timeInMillisechondshh201 = SystemClock.uptimeMillis() - startTimeh201;
            updatedTimeh201 = timeInMillisechondshh201;
            sechondsh201 = (int) (updatedTimeh201 / 1000);
            minutesh201 = sechondsh201 / 60;
            hoursh201 = minutesh201 / 60;
            sechondsh201 = sechondsh201 % 60;
            minutesh201 = minutesh201 % 60;
            sech201 =hoursh201 * 3600 + minutesh201 * 60 + sechondsh201;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh12 * 60 * 60 + currentMinuteh12 * 60 + redThresholdh201;
            // 计算小时和分钟
            futureHourh12 = totalSeconds / 3600;
            futureMinute12 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh12 >= 24) {
                futureHourh12 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh12, currentMinuteh12);
            String futureTimeString = String.format("%02d:%02d", futureHourh12, futureMinute12);

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
                btnTimerh2h01.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h01.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h01();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread202 = new Runnable() {
        public void run() {
            timeInMillisechondshh202 = SystemClock.uptimeMillis() - startTimeh202;
            updatedTimeh202 = timeInMillisechondshh202;
            sechondsh202 = (int) (updatedTimeh202 / 1000);
            minutesh202 = sechondsh202 / 60;
            hoursh202 = minutesh202 / 60;
            sechondsh202 = sechondsh202 % 60;
            minutesh202 = minutesh202 % 60;
            sech202 =hoursh202 * 3600 + minutesh202 * 60 + sechondsh202;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh13 * 60 * 60 + currentMinuteh13 * 60 + redThresholdh202;
            // 计算小时和分钟
            futureHourh13 = totalSeconds / 3600;
            futureMinute13 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh13 >= 24) {
                futureHourh13 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh13, currentMinuteh13);
            String futureTimeString = String.format("%02d:%02d", futureHourh13, futureMinute13);

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
                btnTimerh2h02.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h02.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h02();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread203 = new Runnable() {
        public void run() {
            timeInMillisechondshh203 = SystemClock.uptimeMillis() - startTimeh203;
            updatedTimeh203 = timeInMillisechondshh203;
            sechondsh203 = (int) (updatedTimeh203 / 1000);
            minutesh203 = sechondsh203 / 60;
            hoursh203 = minutesh203 / 60;
            sechondsh203 = sechondsh203 % 60;
            minutesh203 = minutesh203 % 60;
            sech203 =hoursh203 * 3600 + minutesh203 * 60 + sechondsh203;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh14 * 60 * 60 + currentMinuteh14 * 60 + redThresholdh203;
            // 计算小时和分钟
            futureHourh14 = totalSeconds / 3600;
            futureMinute14 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh14 >= 24) {
                futureHourh14 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh14, currentMinuteh14);
            String futureTimeString = String.format("%02d:%02d", futureHourh14, futureMinute14);

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
                btnTimerh2h03.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h03.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h03();
            handler1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThread204 = new Runnable() {
        public void run() {
            timeInMillisechondshh204 = SystemClock.uptimeMillis() - startTimeh204;
            updatedTimeh204 = timeInMillisechondshh204;
            sechondsh204 = (int) (updatedTimeh204 / 1000);
            minutesh204 = sechondsh204 / 60;
            hoursh204 = minutesh204 / 60;
            sechondsh204 = sechondsh204 % 60;
            minutesh204 = minutesh204 % 60;
            sech204 =hoursh204 * 3600 + minutesh204 * 60 + sechondsh204;


            // 计算当前时间加上 redThresholdh6 后的时间（秒数）
            int totalSeconds = currentHourh15 * 60 * 60 + currentMinuteh15 * 60 + redThresholdh204;
            // 计算小时和分钟
            futureHourh15 = totalSeconds / 3600;
            futureMinute15 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourh15 >= 24) {
                futureHourh15 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourh15, currentMinuteh15);
            String futureTimeString = String.format("%02d:%02d", futureHourh15, futureMinute15);

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
                btnTimerh2h04.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerh2h04.setText(Html.fromHtml(displayText));
            }

            updateButtonColor2h04();
            handler1.postDelayed(this, 1000);
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
        HomePageHoliday.CustomArrayAdapter adapter = new HomePageHoliday.CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime1(time1h);//time1h

                    if(sech1 >= blueThresholdh1){
                        flashingh1 = true;
                        updateButtonColor1();
                    }

                    break;
                case "60分鐘":
                    addTime1(time2h);//time2h

                    if(sech1 >= blueThresholdh1){
                        flashingh1 = true;
                        updateButtonColor1();
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
                    addTime2(time1h);

                    if (sech2 >= blueThresholdh2) {
                        flashingh2 = true;
                        updateButtonColor2h();
                    }
                    break;
                case "60分鐘":
                    addTime2(time2h);
                    if (sech2 >= blueThresholdh2) {
                        flashingh2 = true;
                        updateButtonColor2h();
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
                    addTime3(time1h); // Customize the time for button 3


                    if (sech3 >= blueThresholdh3) {
                        flashingh3 = true;
                        updateButtonColor3h();
                    }

                    break;
                case "60分鐘":
                    addTime3(time2h); // Customize the time for button 3

                    if (sech3 >= blueThresholdh3) {
                        flashingh3 = true;
                        updateButtonColor3h();
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
                    addTime4(time1h); // Customize the time for button 4


                    if (sech4 >= blueThresholdh4) {
                        flashingh4 = true;
                        updateButtonColor4();
                    }
                    break;
                case "60分鐘":
                    addTime4(time2h); // Customize the time for button 4


                    if (sech4 >= blueThresholdh4) {
                        flashingh4 = true;
                        updateButtonColor4();
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
                    addTime5(time1h); // Customize the time for button 5



                    if (sech5 >= blueThresholdh5) {
                        flashingh5 = true;
                        updateButtonColor5();
                    }
                    break;
                case "60分鐘":
                    addTime5(time2h); // Customize the time for button 5

                    if (sech5 >= blueThresholdh5) {
                        flashingh5 = true;
                        updateButtonColor5();
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
                    addTime7(time1h); // Customize the time for button 7



                    if (sech7 >= blueThresholdh7) {
                        flashingh7 = true;
                        updateButtonColor7();
                    }
                    break;
                case "60分鐘":
                    addTime7(time2h); // Customize the time for button 7

                    if (sech7 >= blueThresholdh7) {
                        flashingh7 = true;
                        updateButtonColor7();
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
                    addTime8(time1h); // Customize the time for button 8


                    if (sech8 >= blueThresholdh8) {
                        flashingh8 = true;
                        updateButtonColor8();
                    }
                    break;
                case "60分鐘":
                    addTime8(time2h); // Customize the time for button 8

                    if (sech8 >= blueThresholdh8) {
                        flashingh8 = true;
                        updateButtonColor8();
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
                    addTime9(time1h); // Customize the time for button 9

                    if (sech9 >= blueThresholdh9) {
                        flashingh9 = true;
                        updateButtonColor9();
                    }
                    break;
                case "60分鐘":
                    addTime9(time2h); // Customize the time for button 9

                    if (sech9 >= blueThresholdh9) {
                        flashingh9 = true;
                        updateButtonColor9();
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
                    addTime10(time1h); // Customize the time for button 10


                    if (sech10 >= blueThresholdh10) {
                        flashingh10 = true;
                        updateButtonColor10();
                    }
                    break;
                case "60分鐘":
                    addTime10(time2h); // Customize the time for button 10

                    if (sech10 >= blueThresholdh10) {
                        flashingh10 = true;
                        updateButtonColor10();
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
                    addTime11(time1h); // Customize the time for button 11




                    if (sech11 >= blueThresholdh11) {
                        flashingh11 = true;
                        updateButtonColor11();
                    }
                    break;
                case "60分鐘":
                    addTime11(time2h); // Customize the time for button 11


                    if (sech11 >= blueThresholdh11) {
                        flashingh11 = true;
                        updateButtonColor11();
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
                    addTime16(time1h); // Customize the time for button 16

                    if (sech16 >= blueThresholdh16) {
                        flashingh16 = true;
                        updateButtonColor16();
                    }
                    break;
                case "60分鐘":
                    addTime16(time2h); // Customize the time for button 16

                    if (sech16 >= blueThresholdh16) {
                        flashingh16 = true;
                        updateButtonColor16();
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
                    addTime17(time1h); // Customize the time for button 17



                    if (sech17 >= blueThresholdh17) {
                        flashingh17 = true;
                        updateButtonColor17();
                    }

                    break;
                case "60分鐘":
                    addTime17(time2h); // Customize the time for button 17

                    if (sech17 >= blueThresholdh17) {
                        flashingh17 = true;
                        updateButtonColor17();
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
                    addTime18(time1h); // Customize the time for button 18


                    if (sech18 >= blueThresholdh18) {
                        flashingh18 = true;
                        updateButtonColor18();
                    }
                    break;
                case "60分鐘":
                    addTime18(time2h); // Customize the time for button 18

                    if (sech18 >= blueThresholdh18) {
                        flashingh18 = true;
                        updateButtonColor18();
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
                    addTime19(time1h); // Customize the time for button 19


                    if (sech19 >= blueThresholdh19) {
                        flashingh19 = true;
                        updateButtonColor19();
                    }
                    break;
                case "60分鐘":
                    addTime19(time2h); // Customize the time for button 19

                    if (sech19 >= blueThresholdh19) {
                        flashingh19 = true;
                        updateButtonColor19();
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
                    addTime20(time1h); // Customize the time for button 20


                    if (sech20 >= blueThresholdh20) {
                        flashingh20 = true;
                        updateButtonColor2h0();
                    }
                    break;
                case "60分鐘":
                    addTime20(time2h); // Customize the time for button 20

                    if (sech20 >= blueThresholdh20) {
                        flashingh20 = true;
                        updateButtonColor2h0();
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
                    addTime21(time1h); // Customize the time for button 21



                    if (sech21 >= blueThresholdh21) {
                        flashingh21 = true;
                        updateButtonColor2h1();
                    }
                    break;
                case "60分鐘":
                    addTime21(time2h); // Customize the time for button 21

                    if (sech21 >= blueThresholdh21) {
                        flashingh21 = true;
                        updateButtonColor2h1();
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
                    addTime22(time1h); // Customize the time for button 22

                    if (sech22 >= blueThresholdh22) {
                        flashingh22 = true;
                        updateButtonColor2h2();
                    }
                    break;
                case "60分鐘":
                    addTime22(time2h); // Customize the time for button 22

                    if (sech22 >= blueThresholdh22) {
                        flashingh22 = true;
                        updateButtonColor2h2();
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
                    addTime23(time1h); // Customize the time for button 23


                    if (sech23 >= blueThresholdh23) {
                        flashingh23 = true;
                        updateButtonColor2h3();
                    }
                    break;
                case "60分鐘":
                    addTime23(time2h); // Customize the time for button 23

                    if (sech23 >= blueThresholdh23) {
                        flashingh23 = true;
                        updateButtonColor2h3();
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
                    addTime24(time1h); // Customize the time for button 24

                    if (sech24 >= blueThresholdh24) {
                        flashingh24 = true;
                        updateButtonColor2h4();
                    }
                    break;
                case "60分鐘":
                    addTime24(time2h); // Customize the time for button 24

                    if (sech24 >= blueThresholdh24) {
                        flashingh24 = true;
                        updateButtonColor2h4();
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
                    addTime25(time1h); // Customize the time for button 25



                    if (sech25 >= blueThresholdh25) {
                        flashingh25 = true;
                        updateButtonColor2h5();
                    }
                    break;
                case "60分鐘":
                    addTime25(time2h); // Customize the time for button 25

                    if (sech25 >= blueThresholdh25) {
                        flashingh25 = true;
                        updateButtonColor2h5();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton26() {
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
                    addTime26(time1h); // Customize the time for button 26


                    if (sech26 >= blueThresholdh26) {
                        flashingh26 = true;
                        updateButtonColor2h6();
                    }
                    break;
                case "60分鐘":
                    addTime26(time2h); // Customize the time for button 26

                    if (sech26 >= blueThresholdh26) {
                        flashingh26 = true;
                        updateButtonColor2h6();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton27() {
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
                    addTime27(time1h); // Customize the time for button 27


                    if (sech27 >= blueThresholdh27) {
                        flashingh27 = true;
                        updateButtonColor2h7();
                    }
                    break;
                case "60分鐘":
                    addTime27(time2h); // Customize the time for button 27


                    if (sech27 >= blueThresholdh27) {
                        flashingh27 = true;
                        updateButtonColor2h7();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton28() {
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
                    addTime28(time1h); // Customize the time for button 28

                    if (sech28 >= blueThresholdh28) {
                        flashingh28 = true;
                        updateButtonColor2h8();
                    }
                    break;
                case "60分鐘":
                    addTime28(time2h); // Customize the time for button 28

                    if (sech28 >= blueThresholdh28) {
                        flashingh28 = true;
                        updateButtonColor2h8();
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
                    addTime66(time1h); // Customize the time for button 66

                    if (sech66 >= blueThresholdh66) {
                        flashingh66 = true;
                        updateButtonColor66();
                    }
                    break;
                case "60分鐘":
                    addTime66(time2h); // Customize the time for button 66

                    if (sech66 >= blueThresholdh66) {
                        flashingh66 = true;
                        updateButtonColor66();
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
                    addTime201(time1h); // Customize the time for button 28


                    if (sech201 >= blueThresholdh201) {
                        flashingh201 = true;
                        updateButtonColor2h01();
                    }
                    break;
                case "60分鐘":
                    addTime201(time2h); // Customize the time for button 28

                    if (sech201 >= blueThresholdh201) {
                        flashingh201 = true;
                        updateButtonColor2h01();
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
                    addTime202(time1h); // Customize the time for button 28



                    if (sech202 >= blueThresholdh202) {
                        flashingh202 = true;
                        updateButtonColor2h02();
                    }
                    break;
                case "60分鐘":
                    addTime202(time2h); // Customize the time for button 28

                    if (sech202 >= blueThresholdh202) {
                        flashingh202 = true;
                        updateButtonColor2h02();
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
                    addTime203(time1h); // Customize the time for button 28




                    if (sech203 >= blueThresholdh203) {
                        flashingh203 = true;
                        updateButtonColor2h03();
                    }
                    break;
                case "60分鐘":
                    addTime203(time2h); // Customize the time for button 28

                    if (sech203 >= blueThresholdh203) {
                        flashingh203 = true;
                        updateButtonColor2h03();
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
                    addTime204(time1h); // Customize the time for button 28



                    if (sech204 >= blueThresholdh204) {
                        flashingh204 = true;
                        updateButtonColor2h04();
                    }
                    break;
                case "60分鐘":
                    addTime204(time2h); // Customize the time for button 28

                    if (sech204 >= blueThresholdh204) {
                        flashingh204 = true;
                        updateButtonColor2h04();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void addTime1(int sechondshToAdd) {
        //blueThresholdh1 += sechondshToAdd;
        yellowThresholdh1 += sechondshToAdd;
        redThresholdh1 += sechondshToAdd;
        updateButtonColor1();
    }
    private void addTime2(int sechondshToAdd) {
        //blueThresholdh2 += sechondshToAdd;
        yellowThresholdh2 += sechondshToAdd;
        redThresholdh2 += sechondshToAdd;

        updateButtonColor2h();
    }

    private void addTime3(int sechondshToAdd) {
        //blueThresholdh3 += sechondshToAdd; // Customize for button 3
        yellowThresholdh3 += sechondshToAdd; // Customize for button 3
        redThresholdh3 += sechondshToAdd; // Customize for button 3

        updateButtonColor3h();
    }

    private void addTime4(int sechondshToAdd) {
        //blueThresholdh4 += sechondshToAdd; // Customize for button 4
        yellowThresholdh4 += sechondshToAdd; // Customize for button 4
        redThresholdh4 += sechondshToAdd; // Customize for button 4

        updateButtonColor4();
    }
    private void addTime5(int sechondshToAdd) {
        //blueThresholdh5 += sechondshToAdd; // Customize for button 5
        yellowThresholdh5 += sechondshToAdd; // Customize for button 5
        redThresholdh5 += sechondshToAdd; // Customize for button 5

        updateButtonColor5();
    }

    private void addTime7(int sechondshToAdd) {
        //blueThresholdh7 += sechondshToAdd; // Customize for button 7
        yellowThresholdh7 += sechondshToAdd; // Customize for button 7
        redThresholdh7 += sechondshToAdd; // Customize for button 7

        updateButtonColor7();
    }

    private void addTime8(int sechondshToAdd) {
        //blueThresholdh8 += sechondshToAdd; // Customize for button 8
        yellowThresholdh8 += sechondshToAdd; // Customize for button 8
        redThresholdh8 += sechondshToAdd; // Customize for button 8

        updateButtonColor8();
    }

    private void addTime9(int sechondshToAdd) {
        //blueThresholdh9 += sechondshToAdd; // Customize for button 9
        yellowThresholdh9 += sechondshToAdd; // Customize for button 9
        redThresholdh9 += sechondshToAdd; // Customize for button 9

        updateButtonColor9();
    }

    private void addTime10(int sechondshToAdd) {
        //blueThresholdh10 += sechondshToAdd; // Customize for button 10
        yellowThresholdh10 += sechondshToAdd; // Customize for button 10
        redThresholdh10 += sechondshToAdd; // Customize for button 10

        updateButtonColor10();
    }

    private void addTime11(int sechondshToAdd) {
        //blueThresholdh11 += sechondshToAdd; // Customize for button 11
        yellowThresholdh11 += sechondshToAdd; // Customize for button 11
        redThresholdh11 += sechondshToAdd; // Customize for button 11

        updateButtonColor11();
    }
    private void addTime16(int sechondshToAdd) {
        //blueThresholdh16 += sechondshToAdd; // Customize for button 16
        yellowThresholdh16 += sechondshToAdd; // Customize for button 16
        redThresholdh16 += sechondshToAdd; // Customize for button 16

        updateButtonColor16();
    }

    private void addTime17(int sechondshToAdd) {
        //blueThresholdh17 += sechondshToAdd; // Customize for button 17
        yellowThresholdh17 += sechondshToAdd; // Customize for button 17
        redThresholdh17 += sechondshToAdd; // Customize for button 17

        updateButtonColor17();
    }

    private void addTime18(int sechondshToAdd) {
        //blueThresholdh18 += sechondshToAdd; // Customize for button 18
        yellowThresholdh18 += sechondshToAdd; // Customize for button 18
        redThresholdh18 += sechondshToAdd; // Customize for button 18

        updateButtonColor18();

    }

    private void addTime19(int sechondshToAdd) {
        //blueThresholdh19 += sechondshToAdd; // Customize for button 19
        yellowThresholdh19 += sechondshToAdd; // Customize for button 19
        redThresholdh19 += sechondshToAdd; // Customize for button 19

        updateButtonColor19();

    }

    private void addTime20(int sechondshToAdd) {
        //blueThresholdh20 += sechondshToAdd; // Customize for button 20
        yellowThresholdh20 += sechondshToAdd; // Customize for button 20
        redThresholdh20 += sechondshToAdd; // Customize for button 20

        updateButtonColor2h0();
    }

    private void addTime21(int sechondshToAdd) {
        //blueThresholdh21 += sechondshToAdd; // Customize for button 21
        yellowThresholdh21 += sechondshToAdd; // Customize for button 21
        redThresholdh21 += sechondshToAdd; // Customize for button 21


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h1();
    }

    private void addTime22(int sechondshToAdd) {
        //blueThresholdh22 += sechondshToAdd; // Customize for button 22
        yellowThresholdh22 += sechondshToAdd; // Customize for button 22
        redThresholdh22 += sechondshToAdd; // Customize for button 22


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h2();
    }

    private void addTime23(int sechondshToAdd) {
        //blueThresholdh23 += sechondshToAdd; // Customize for button 23
        yellowThresholdh23 += sechondshToAdd; // Customize for button 23
        redThresholdh23 += sechondshToAdd; // Customize for button 23


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h3();
    }

    private void addTime24(int sechondshToAdd) {
        //blueThresholdh24 += sechondshToAdd; // Customize for button 24
        yellowThresholdh24 += sechondshToAdd; // Customize for button 24
        redThresholdh24 += sechondshToAdd; // Customize for button 24


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h4();
    }

    private void addTime25(int sechondshToAdd) {
        //blueThresholdh25 += sechondshToAdd; // Customize for button 25
        yellowThresholdh25 += sechondshToAdd; // Customize for button 25
        redThresholdh25 += sechondshToAdd; // Customize for button 25


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h5();
    }

    private void addTime26(int sechondshToAdd) {
        //blueThresholdh26 += sechondshToAdd; // Customize for button 26
        yellowThresholdh26 += sechondshToAdd; // Customize for button 26
        redThresholdh26 += sechondshToAdd; // Customize for button 26


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h6();
    }

    private void addTime27(int sechondshToAdd) {
        //blueThresholdh27 += sechondshToAdd; // Customize for button 27
        yellowThresholdh27 += sechondshToAdd; // Customize for button 27
        redThresholdh27 += sechondshToAdd; // Customize for button 27


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h7();
    }

    private void addTime28(int sechondshToAdd) {
        //blueThresholdh28 += sechondshToAdd; // Customize for button 28
        yellowThresholdh28 += sechondshToAdd; // Customize for button 28
        redThresholdh28 += sechondshToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h8();
    }
    private void addTime66(int sechondshToAdd) {
        //blueThresholdh66 += sechondshToAdd; // Customize for button 66
        yellowThresholdh66 += sechondshToAdd; // Customize for button 66
        redThresholdh66 += sechondshToAdd; // Customize for button 66


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor66();
    }
    private void addTime201(int sechondshToAdd) {
        //blueThresholdh201 += sechondshToAdd; // Customize for button 28
        yellowThresholdh201 += sechondshToAdd; // Customize for button 28
        redThresholdh201 += sechondshToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h01();
    }
    private void addTime202(int sechondshToAdd) {
        //blueThresholdh202 += sechondshToAdd; // Customize for button 28
        yellowThresholdh202 += sechondshToAdd; // Customize for button 28
        redThresholdh202 += sechondshToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h02();
    }
    private void addTime203(int sechondshToAdd) {
        //blueThresholdh203 += sechondshToAdd; // Customize for button 28
        yellowThresholdh203 += sechondshToAdd; // Customize for button 28
        redThresholdh203 += sechondshToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h03();
    }
    private void addTime204(int sechondshToAdd) {
        //blueThresholdh204 += sechondshToAdd; // Customize for button 28
        yellowThresholdh204 += sechondshToAdd; // Customize for button 28
        redThresholdh204 += sechondshToAdd; // Customize for button 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColor2h04();
    }



    //--------------------------------------------------------------------------

//--------------------------------------------------------------------------


    private void updateButtonColor1() {
        if (sech1 < 0.01) {
            btnTimerh1.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech1 < blueThresholdh1 && peopleh2h_1) {
            btnTimerh1.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech1 < blueThresholdh1 && !peopleh2h_1 ) {
            btnTimerh1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech1 < yellowThresholdh1 && peopleh2h_1) {
            btnTimerh1.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingh1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh1.startAnimation(blinkAnimation);
            }else{
                btnTimerh1.clearAnimation();
            }
        } else if (sech1 < yellowThresholdh1 && !peopleh2h_1) {
            btnTimerh1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech1 < redThresholdh1) {
            btnTimerh1.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinghg1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh1.startAnimation(blinkAnimation);
            }else{
                btnTimerh1.clearAnimation();
            }
        } else {
            btnTimerh1.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh1.clearAnimation();
        }
    }
    private void updateButtonColor2h() {
        if (sech2 < 0.01) {
            btnTimerh2h.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech2 < blueThresholdh2 && peopleh2h_2) {
            btnTimerh2h.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech2 < blueThresholdh2 && !peopleh2h_2 ) {
            btnTimerh2h.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech2 < yellowThresholdh2 && peopleh2h_2) {
            btnTimerh2h.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingh2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h.clearAnimation();
            }
        } else if (sech2 < yellowThresholdh2 && !peopleh2h_2) {
            btnTimerh2h.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech2 < redThresholdh2) {
            btnTimerh2h.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinghg2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h.clearAnimation();
            }
        } else {
            btnTimerh2h.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h.clearAnimation();
        }
    }

    private void updateButtonColor3h() {
        if (sech3 < 0.01) {
            btnTimerh3h.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech3 < blueThresholdh3 && peopleh2h_3) {
            btnTimerh3h.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech3 < blueThresholdh3 && !peopleh2h_3 ) {
            btnTimerh3h.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech3 < yellowThresholdh3 && peopleh2h_3) {
            btnTimerh3h.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh3h.startAnimation(blinkAnimation);
            }else{
                btnTimerh3h.clearAnimation();
            }


        } else if (sech3 < yellowThresholdh3 && !peopleh2h_3) {
            btnTimerh3h.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech3 < redThresholdh3) {
            btnTimerh3h.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh3h.startAnimation(blinkAnimation);
            }else{
                btnTimerh3h.clearAnimation();
            }


        } else {
            btnTimerh3h.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh3h.clearAnimation();
        }
    }

    private void updateButtonColor4() {
        if (sech4 < 0.01) {
            btnTimerh4.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech4 < blueThresholdh4 && peopleh2h_4) {
            btnTimerh4.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech4 < blueThresholdh4 && !peopleh2h_4 ) {
            btnTimerh4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech4 < yellowThresholdh4 && peopleh2h_4) {
            btnTimerh4.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh4.startAnimation(blinkAnimation);
            }else{
                btnTimerh4.clearAnimation();
            }


        } else if (sech4 < yellowThresholdh4 && !peopleh2h_4) {
            btnTimerh4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech4 < redThresholdh4) {
            btnTimerh4.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh4.startAnimation(blinkAnimation);
            }else{
                btnTimerh4.clearAnimation();
            }


        } else {
            btnTimerh4.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh4.clearAnimation();
        }
    }
    private void updateButtonColor5() {
        if (sech5 < 0.01) {
            btnTimerh5.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech5 < blueThresholdh5 && peopleh2h_5) {
            btnTimerh5.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech5 < blueThresholdh5 && !peopleh2h_5 ) {
            btnTimerh5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech5 < yellowThresholdh5 && peopleh2h_5) {
            btnTimerh5.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh5.startAnimation(blinkAnimation);
            }else{
                btnTimerh5.clearAnimation();
            }


        } else if (sech5 < yellowThresholdh5 && !peopleh2h_5) {
            btnTimerh5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech5 < redThresholdh5) {
            btnTimerh5.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh5.startAnimation(blinkAnimation);
            }else{
                btnTimerh5.clearAnimation();
            }


        } else {
            btnTimerh5.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh5.clearAnimation();
        }
    }



    private void updateButtonColor7() {
        if (sech7 < 0.01) {
            btnTimerh7.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech7 < blueThresholdh7 && peopleh2h_7) {
            btnTimerh7.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech7 < blueThresholdh7 && !peopleh2h_7 ) {
            btnTimerh7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech7 < yellowThresholdh7 && peopleh2h_7) {
            btnTimerh7.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh7.startAnimation(blinkAnimation);
            }else{
                btnTimerh7.clearAnimation();
            }


        } else if (sech7 < yellowThresholdh7 && !peopleh2h_7) {
            btnTimerh7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech7 < redThresholdh7) {
            btnTimerh7.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh7.startAnimation(blinkAnimation);
            }else{
                btnTimerh7.clearAnimation();
            }


        } else {
            btnTimerh7.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh7.clearAnimation();
        }
    }

    private void updateButtonColor8() {
        if (sech8 < 0.01) {
            btnTimerh8.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech8 < blueThresholdh8 && peopleh2h_8) {
            btnTimerh8.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech8 < blueThresholdh8 && !peopleh2h_8 ) {
            btnTimerh8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech8 < yellowThresholdh8 && peopleh2h_8) {
            btnTimerh8.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh8.startAnimation(blinkAnimation);
            }else{
                btnTimerh8.clearAnimation();
            }
        } else if (sech8 < yellowThresholdh8 && !peopleh2h_8) {
            btnTimerh8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech8 < redThresholdh8) {
            btnTimerh8.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg8 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh8.startAnimation(blinkAnimation);
            }else{
                btnTimerh8.clearAnimation();
            }
        } else {
            btnTimerh8.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh8.clearAnimation();
        }
    }

    private void updateButtonColor9() {
        if (sech9 < 0.01) {
            btnTimerh9.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech9 < blueThresholdh9 && peopleh2h_9) {
            btnTimerh9.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech9 < blueThresholdh9 && !peopleh2h_9 ) {
            btnTimerh9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech9 < yellowThresholdh9 && peopleh2h_9) {
            btnTimerh9.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh9.startAnimation(blinkAnimation);
            }else{
                btnTimerh9.clearAnimation();
            }


        } else if (sech9 < yellowThresholdh9 && !peopleh2h_9) {
            btnTimerh9.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech9 < redThresholdh9) {
            btnTimerh9.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg9 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh9.startAnimation(blinkAnimation);
            }else{
                btnTimerh9.clearAnimation();
            }


        } else {
            btnTimerh9.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh9.clearAnimation();
        }
    }

    private void updateButtonColor10() {
        if (sech10 < 0.01) {
            btnTimerh10.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech10 < blueThresholdh10 && peopleh2h_10) {
            btnTimerh10.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech10 < blueThresholdh10 && !peopleh2h_10 ) {
            btnTimerh10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech10 < yellowThresholdh10 && peopleh2h_10) {
            btnTimerh10.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh10.startAnimation(blinkAnimation);
            }else{
                btnTimerh10.clearAnimation();
            }


        } else if (sech10 < yellowThresholdh10 && !peopleh2h_10) {
            btnTimerh10.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech10 < redThresholdh10) {
            btnTimerh10.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg10 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh10.startAnimation(blinkAnimation);
            }else{
                btnTimerh10.clearAnimation();
            }


        } else {
            btnTimerh10.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh10.clearAnimation();
        }
    }

    private void updateButtonColor11() {
        if (sech11 < 0.01) {
            btnTimerh11.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech11 < blueThresholdh11 && peopleh2h_11) {
            btnTimerh11.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech11 < blueThresholdh11 && !peopleh2h_11 ) {
            btnTimerh11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech11 < yellowThresholdh11 && peopleh2h_11) {
            btnTimerh11.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh11.startAnimation(blinkAnimation);
            }else{
                btnTimerh11.clearAnimation();
            }


        } else if (sech11 < yellowThresholdh11 && !peopleh2h_11) {
            btnTimerh11.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech11 < redThresholdh11) {
            btnTimerh11.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg11 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh11.startAnimation(blinkAnimation);
            }else{
                btnTimerh11.clearAnimation();
            }


        } else {
            btnTimerh11.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh11.clearAnimation();
        }
    }

    private void updateButtonColor16() {
        if (sech16 < 0.01) {
            btnTimerh16.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech16 < blueThresholdh16 && peopleh2h_16) {
            btnTimerh16.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech16 < blueThresholdh16 && !peopleh2h_16 ) {
            btnTimerh16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech16 < yellowThresholdh16 && peopleh2h_16) {
            btnTimerh16.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh16.startAnimation(blinkAnimation);
            }else{
                btnTimerh16.clearAnimation();
            }


        } else if (sech16 < yellowThresholdh16 && !peopleh2h_16) {
            btnTimerh16.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech16 < redThresholdh16) {
            btnTimerh16.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg16 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh16.startAnimation(blinkAnimation);
            }else{
                btnTimerh16.clearAnimation();
            }


        } else {
            btnTimerh16.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh16.clearAnimation();
        }
    }

    private void updateButtonColor17() {
        if (sech17 < 0.01) {
            btnTimerh17.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech17 < blueThresholdh17 && peopleh2h_17) {
            btnTimerh17.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech17 < blueThresholdh17 && !peopleh2h_17 ) {
            btnTimerh17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech17 < yellowThresholdh17 && peopleh2h_17) {
            btnTimerh17.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh17.startAnimation(blinkAnimation);
            }else{
                btnTimerh17.clearAnimation();
            }


        } else if (sech17 < yellowThresholdh17 && !peopleh2h_17) {
            btnTimerh17.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech17 < redThresholdh17) {
            btnTimerh17.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg17 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh17.startAnimation(blinkAnimation);
            }else{
                btnTimerh17.clearAnimation();
            }


        } else {
            btnTimerh17.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh17.clearAnimation();
        }
    }

    private void updateButtonColor18() {
        if (sech18 < 0.01) {
            btnTimerh18.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech18 < blueThresholdh18 && peopleh2h_18) {
            btnTimerh18.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech18 < blueThresholdh18 && !peopleh2h_18 ) {
            btnTimerh18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech18 < yellowThresholdh18 && peopleh2h_18) {
            btnTimerh18.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh18.startAnimation(blinkAnimation);
            }else{
                btnTimerh18.clearAnimation();
            }


        } else if (sech18 < yellowThresholdh18 && !peopleh2h_18) {
            btnTimerh18.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech18 < redThresholdh18) {
            btnTimerh18.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg18 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh18.startAnimation(blinkAnimation);
            }else{
                btnTimerh18.clearAnimation();
            }


        } else {
            btnTimerh18.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh18.clearAnimation();
        }
    }

    private void updateButtonColor19() {
        if (sech19 < 0.01) {
            btnTimerh19.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech19 < blueThresholdh19 && peopleh2h_19) {
            btnTimerh19.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech19 < blueThresholdh19 && !peopleh2h_19 ) {
            btnTimerh19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech19 < yellowThresholdh19 && peopleh2h_19) {
            btnTimerh19.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh19.startAnimation(blinkAnimation);
            }else{
                btnTimerh19.clearAnimation();
            }


        } else if (sech19 < yellowThresholdh19 && !peopleh2h_19) {
            btnTimerh19.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech19 < redThresholdh19) {
            btnTimerh19.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg19 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh19.startAnimation(blinkAnimation);
            }else{
                btnTimerh19.clearAnimation();
            }


        } else {
            btnTimerh19.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh19.clearAnimation();
        }
    }

    private void updateButtonColor2h0() {
        if (sech20 < 0.01) {
            btnTimerh2h0.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech20 < blueThresholdh20 && peopleh2h_20) {
            btnTimerh2h0.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech20 < blueThresholdh20 && !peopleh2h_20 ) {
            btnTimerh2h0.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech20 < yellowThresholdh20 && peopleh2h_20) {
            btnTimerh2h0.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h0.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h0.clearAnimation();
            }


        } else if (sech20 < yellowThresholdh20 && !peopleh2h_20) {
            btnTimerh2h0.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech20 < redThresholdh20) {
            btnTimerh2h0.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg20 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h0.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h0.clearAnimation();
            }


        } else {
            btnTimerh2h0.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h0.clearAnimation();
        }
    }

    private void updateButtonColor2h1() {
        if (sech21 < 0.01) {
            btnTimerh2h1.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech21 < blueThresholdh21 && peopleh2h_21) {
            btnTimerh2h1.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech21 < blueThresholdh21 && !peopleh2h_21 ) {
            btnTimerh2h1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech21 < yellowThresholdh21 && peopleh2h_21) {
            btnTimerh2h1.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h1.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h1.clearAnimation();
            }


        } else if (sech21 < yellowThresholdh21 && !peopleh2h_21) {
            btnTimerh2h1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech21 < redThresholdh21) {
            btnTimerh2h1.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg21 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h1.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h1.clearAnimation();
            }


        } else {
            btnTimerh2h1.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h1.clearAnimation();
        }
    }

    private void updateButtonColor2h2() {
        if (sech22 < 0.01) {
            btnTimerh2h2.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech22 < blueThresholdh22 && peopleh2h_22) {
            btnTimerh2h2.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech22 < blueThresholdh22 && !peopleh2h_22 ) {
            btnTimerh2h2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech22 < yellowThresholdh22 && peopleh2h_22) {
            btnTimerh2h2.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h2.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h2.clearAnimation();
            }


        } else if (sech22 < yellowThresholdh22 && !peopleh2h_22) {
            btnTimerh2h2.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech22 < redThresholdh22) {
            btnTimerh2h2.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg22 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h2.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h2.clearAnimation();
            }


        } else {
            btnTimerh2h2.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h2.clearAnimation();
        }
    }

    private void updateButtonColor2h3() {
        if (sech23 < 0.01) {
            btnTimerh2h3.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech23 < blueThresholdh23 && peopleh2h_23) {
            btnTimerh2h3.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech23 < blueThresholdh23 && !peopleh2h_23 ) {
            btnTimerh2h3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech23 < yellowThresholdh23 && peopleh2h_23) {
            btnTimerh2h3.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h3.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h3.clearAnimation();
            }


        } else if (sech23 < yellowThresholdh23 && !peopleh2h_23) {
            btnTimerh2h3.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech23 < redThresholdh23) {
            btnTimerh2h3.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg23 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h3.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h3.clearAnimation();
            }


        } else {
            btnTimerh2h3.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h3.clearAnimation();
        }
    }

    private void updateButtonColor2h4() {
        if (sech24 < 0.01) {
            btnTimerh2h4.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech24 < blueThresholdh24 && peopleh2h_24) {
            btnTimerh2h4.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech24 < blueThresholdh24 && !peopleh2h_24 ) {
            btnTimerh2h4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech24 < yellowThresholdh24 && peopleh2h_24) {
            btnTimerh2h4.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h4.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h4.clearAnimation();
            }


        } else if (sech24 < yellowThresholdh24 && !peopleh2h_24) {
            btnTimerh2h4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech24 < redThresholdh24) {
            btnTimerh2h4.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg24 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h4.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h4.clearAnimation();
            }


        } else {
            btnTimerh2h4.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h4.clearAnimation();
        }
    }

    private void updateButtonColor2h5() {
        if (sech25 < 0.01) {
            btnTimerh2h5.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech25 < blueThresholdh25 && peopleh2h_25) {
            btnTimerh2h5.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech25 < blueThresholdh25 && !peopleh2h_25 ) {
            btnTimerh2h5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech25 < yellowThresholdh25 && peopleh2h_25) {
            btnTimerh2h5.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h5.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h5.clearAnimation();
            }


        } else if (sech25 < yellowThresholdh25 && !peopleh2h_25) {
            btnTimerh2h5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech25 < redThresholdh25) {
            btnTimerh2h5.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg25 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h5.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h5.clearAnimation();
            }


        } else {
            btnTimerh2h5.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h5.clearAnimation();
        }
    }

    private void updateButtonColor2h6() {
        if (sech26 < 0.01) {
            btnTimerh2h6.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech26 < blueThresholdh26 && peopleh2h_26) {
            btnTimerh2h6.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech26 < blueThresholdh26 && !peopleh2h_26 ) {
            btnTimerh2h6.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech26 < yellowThresholdh26 && peopleh2h_26) {
            btnTimerh2h6.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh26 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h6.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h6.clearAnimation();
            }


        } else if (sech26 < yellowThresholdh26 && !peopleh2h_26) {
            btnTimerh2h6.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech26 < redThresholdh26) {
            btnTimerh2h6.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg26 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h6.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h6.clearAnimation();
            }


        } else {
            btnTimerh2h6.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h6.clearAnimation();
        }
    }

    private void updateButtonColor2h7() {
        if (sech27 < 0.01) {
            btnTimerh2h7.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech27 < blueThresholdh27 && peopleh2h_27) {
            btnTimerh2h7.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech27 < blueThresholdh27 && !peopleh2h_27 ) {
            btnTimerh2h7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech27 < yellowThresholdh27 && peopleh2h_27) {
            btnTimerh2h7.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh27 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h7.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h7.clearAnimation();
            }


        } else if (sech27 < yellowThresholdh27 && !peopleh2h_27) {
            btnTimerh2h7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech27 < redThresholdh27) {
            btnTimerh2h7.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg27 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h7.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h7.clearAnimation();
            }


        } else {
            btnTimerh2h7.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h7.clearAnimation();
        }
    }

    private void updateButtonColor2h8() {
        if (sech28 < 0.01) {
            btnTimerh2h8.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech28 < blueThresholdh28 && peopleh2h_28) {
            btnTimerh2h8.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech28 < blueThresholdh28 && !peopleh2h_28 ) {
            btnTimerh2h8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech28 < yellowThresholdh28 && peopleh2h_28) {
            btnTimerh2h8.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh28 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h8.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h8.clearAnimation();
            }


        } else if (sech28 < yellowThresholdh28 && !peopleh2h_28) {
            btnTimerh2h8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech28 < redThresholdh28) {
            btnTimerh2h8.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg28 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h8.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h8.clearAnimation();
            }


        } else {
            btnTimerh2h8.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h8.clearAnimation();
        }
    }
    private void updateButtonColor66() {
        if (sech66 < 0.01) {
            btnTimerh66.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech66 < blueThresholdh66 && peopleh2h_66) {
            btnTimerh66.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech66 < blueThresholdh66 && !peopleh2h_66 ) {
            btnTimerh66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech66 < yellowThresholdh66 && peopleh2h_66) {
            btnTimerh66.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh66.startAnimation(blinkAnimation);
            }else{
                btnTimerh66.clearAnimation();
            }


        } else if (sech66 < yellowThresholdh66 && !peopleh2h_66) {
            btnTimerh66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech66 < redThresholdh66) {
            btnTimerh66.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh66.startAnimation(blinkAnimation);
            }else{
                btnTimerh66.clearAnimation();
            }


        } else {
            btnTimerh66.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh66.clearAnimation();
        }
    }

    private void updateButtonColor2h01() {
        if (sech201 < 0.01) {
            btnTimerh2h01.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech201 < blueThresholdh201 && peopleh2h_12) {
            btnTimerh2h01.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech201 < blueThresholdh201 && !peopleh2h_12 ) {
            btnTimerh2h01.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech201 < yellowThresholdh201 && peopleh2h_12) {
            btnTimerh2h01.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh201 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h01.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h01.clearAnimation();
            }


        } else if (sech201 < yellowThresholdh201 && !peopleh2h_12) {
            btnTimerh2h01.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech201 < redThresholdh201) {
            btnTimerh2h01.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg201 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h01.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h01.clearAnimation();
            }


        } else {
            btnTimerh2h01.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h01.clearAnimation();
        }
    }

    private void updateButtonColor2h02() {
        if (sech202 < 0.01) {
            btnTimerh2h02.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech202 < blueThresholdh202 && peopleh2h_13) {
            btnTimerh2h02.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech202 < blueThresholdh202 && !peopleh2h_13 ) {
            btnTimerh2h02.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech202 < yellowThresholdh202 && peopleh2h_13) {
            btnTimerh2h02.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh202 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h02.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h02.clearAnimation();
            }
        } else if (sech202 < yellowThresholdh202 && !peopleh2h_13) {
            btnTimerh2h02.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech202 < redThresholdh202) {
            btnTimerh2h02.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg202 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h02.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h02.clearAnimation();
            }

        } else {
            btnTimerh2h02.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h02.clearAnimation();
        }
    }
    private void updateButtonColor2h03() {
        if (sech203 < 0.01) {
            btnTimerh2h03.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech203 < blueThresholdh203 && peopleh2h_14) {
            btnTimerh2h03.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech203 < blueThresholdh203 && !peopleh2h_14 ) {
            btnTimerh2h03.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech203 < yellowThresholdh203 && peopleh2h_14) {
            btnTimerh2h03.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh203 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h03.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h03.clearAnimation();
            }


        } else if (sech203 < yellowThresholdh203 && !peopleh2h_14) {
            btnTimerh2h03.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech203 < redThresholdh203) {
            btnTimerh2h03.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg203 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h03.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h03.clearAnimation();
            }


        } else {
            btnTimerh2h03.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h03.clearAnimation();
        }
    }
    private void updateButtonColor2h04() {
        if (sech204 < 0.01) {
            btnTimerh2h04.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (sech204 < blueThresholdh204 && peopleh2h_15) {
            btnTimerh2h04.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (sech204 < blueThresholdh204 && !peopleh2h_15 ) {
            btnTimerh2h04.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech204 < yellowThresholdh204 && peopleh2h_15) {
            btnTimerh2h04.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingh204 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h04.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h04.clearAnimation();
            }


        } else if (sech204 < yellowThresholdh204 && !peopleh2h_15) {
            btnTimerh2h04.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (sech204 < redThresholdh204) {
            btnTimerh2h04.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghg204 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerh2h04.startAnimation(blinkAnimation);
            }else{
                btnTimerh2h04.clearAnimation();
            }

        } else {
            btnTimerh2h04.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerh2h04.clearAnimation();
        }
    }
}

*/

/*
1101
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
    private int b2haha = 1200;
    private int y2haha = 2400;
    private int r2haha = 3000;
    private int b3haha = 1200;
    private int y3haha = 4800;
    private int r3haha = 5400;
    private int time1 = 1800;
    private int time2 = 3600;
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
    public boolean peopleha3_266;
    public boolean peopleha3_27;
    public boolean peopleha3_28;
    public boolean peopleha3_66;

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

    private SharedPreferences sharedPreferenceshaha266;
    private SharedPreferences.Editor editorhaha2haha6;
    private static final String TIMER_STARTED_KEy2haha6 = "timer_startedhaha266";
    private static final String START_TIME_KEy2haha6 = "start_timehaha2haha6";
    private static final String ELAPSED_TIME_KEy2haha6 = "elapsed_timehaha2haha6";

    private SharedPreferences sharedPreferenceshaha27;
    private SharedPreferences.Editor editorhaha2haha7;
    private static final String TIMER_STARTED_KEy2haha7 = "timer_startedhaha27";
    private static final String START_TIME_KEy2haha7 = "start_timehaha2haha7";
    private static final String ELAPSED_TIME_KEy2haha7 = "elapsed_timehaha2haha7";

    private SharedPreferences sharedPreferenceshaha28;
    private SharedPreferences.Editor editorhaha2haha8;
    private static final String TIMER_STARTED_KEy2haha8 = "timer_startedhaha28";
    private static final String START_TIME_KEy2haha8 = "start_timehaha2haha8";
    private static final String ELAPSED_TIME_KEy2haha8 = "elapsed_timehaha2haha8";

    private SharedPreferences sharedPreferenceshaha66;
    private SharedPreferences.Editor editorhaha66;
    private static final String TIMER_STARTED_KEYhaha66 = "timer_startedhaha66";
    private static final String START_TIME_KEYhaha66 = "start_timehaha66";
    private static final String ELAPSED_TIME_KEYhaha66 = "elapsed_timehaha66";


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

    private long starttimeha27 = 0L;
    private long timeInMillisechaondshaha27 = 0L;
    private long updatedtimeha27 = 0L;
    private int sechaondsha27 = 0;
    private int secha27 = 0;
    private int minutesha27 = 0;
    private int hoursha27 = 0;
    private Button btnTimerha2haha7;
    private int blueThresholdha27 = b2haha;
    private int yellowThresholdha27 = y2haha;
    private int redThresholdha27 = r2haha;
    public int peopleha27;
    private boolean isTimerRunningha27 = false;

    private long starttimeha28 = 0L;
    private long timeInMillisechaondshaha28 = 0L;
    private long updatedtimeha28 = 0L;
    private int sechaondsha28 = 0;
    private int secha28 = 0;
    private int minutesha28 = 0;
    private int hoursha28 = 0;
    private Button btnTimerha2haha8;
    private int blueThresholdha28 = b2haha;
    private int yellowThresholdha28 = y2haha;
    private int redThresholdha28 = r2haha;
    public int peopleha28;
    private boolean isTimerRunningha28 = false;

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
    private boolean flashingha266 ;
    private boolean flashingha27 ;
    private boolean flashingha28 ;

    private boolean flashingha66 ;

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
    private boolean flashinghag266 ;
    private boolean flashinghag27 ;
    private boolean flashinghag28 ;
    private boolean flashinghag66 ;

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

    int currentHourha2haha6;
    int currentMinuteha266;

    int currentHourha2haha7;
    int currentMinuteha27;

    int currentHourha2haha8;
    int currentMinuteha28;

    int currentHourha66;
    int currentMinuteha66;

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

    int futureHourha2haha6;
    int futureMinuteha266;

    int futureHourha2haha7;
    int futureMinuteha27;

    int futureHourha2haha8;
    int futureMinuteha28;
    int futureHourha66;
    int futureMinuteha66;



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

        sharedPreferenceshaha266 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha6 = sharedPreferenceshaha266.edit();

        sharedPreferenceshaha27 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha7 = sharedPreferenceshaha27.edit();

        sharedPreferenceshaha28 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha8 = sharedPreferenceshaha28.edit();

        sharedPreferenceshaha66 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha66 = sharedPreferenceshaha66.edit();



        btnTimerha1 = findViewById(R.id.b1);
        btnTimerha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha1){
                    showConfirmationDialogForButton1();
                    isTimerRunningha1 = true;
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
                    isTimerRunningha2 = true;
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
                    isTimerRunningha3 = true;
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
                    isTimerRunningha4 = true;
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
                    isTimerRunningha5 = true;
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
                    isTimerRunningha7 = true;
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
                    isTimerRunningha8 = true;
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
                    isTimerRunningha9 = true;
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
                    isTimerRunningha10 = true;
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
                    isTimerRunningha11 = true;
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
                    isTimerRunningha16 = true;
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
                    isTimerRunningha17 = true;
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
                    isTimerRunningha18 = true;
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
                    isTimerRunningha19 = true;
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
                    isTimerRunningha20 = true;
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
                    isTimerRunningha21 = true;
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
                    isTimerRunningha22 = true;
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
                    isTimerRunningha23 = true;
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
                    isTimerRunningha24 = true;
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
                    isTimerRunningha25 = true;
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

        btnTimerha2haha6 = findViewById(R.id.b266);
        btnTimerha2haha6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha266){
                    showConfirmationDialogForButton266();
                    isTimerRunningha266 = true;
                    updateButtonColorha2haha6(); // 更新颜色
                } else if (isTimerRunningha266) {
                    if (secha266 < blueThresholdha266) {
                        updateButtonColorha2haha6();
                        showConfirmationDialogYNForButton266();
                    } else if (blueThresholdha266 <= secha266  && secha266 < yellowThresholdha266  ) {
                        if(!flashingha266){
                            flashingha266 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha6();
                        } else if (flashingha266) {
                            updateButtonColorha2haha6();
                            showConfirmationDialogYNForButton266();
                        }

                    } else if (yellowThresholdha266 <= secha266  && secha266 < redThresholdha266) {
                        if(!flashinghag266){
                            flashinghag266 = true; // 停止黄色闪烁
                            updateButtonColorha2haha6();
                        } else if (flashinghag266) {
                            updateButtonColorha2haha6();
                            showConfirmationDialogYNForButton266();
                        }

                    } else if (secha266 >= redThresholdha266) {
                        updateButtonColorha2haha6();
                        showConfirmationDialogYNForButton266();
                    }
                }
            }
        });

        btnTimerha2haha6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton266();
                return true;
            }
        });

        btnTimerha2haha7 = findViewById(R.id.b27);
        btnTimerha2haha7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha27){
                    showConfirmationDialogForButton27();
                    isTimerRunningha27 = true;
                    updateButtonColorha2haha7(); // 更新颜色
                } else if (isTimerRunningha27) {
                    if (secha27 < blueThresholdha27) {
                        updateButtonColorha2haha7();
                        showConfirmationDialogYNForButton27();
                    } else if (blueThresholdha27 <= secha27  && secha27 < yellowThresholdha27  ) {
                        if(!flashingha27){
                            flashingha27 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha7();
                        } else if (flashingha27) {
                            updateButtonColorha2haha7();
                            showConfirmationDialogYNForButton27();
                        }

                    } else if (yellowThresholdha27 <= secha27  && secha27 < redThresholdha27) {
                        if(!flashinghag27){
                            flashinghag27 = true; // 停止黄色闪烁
                            updateButtonColorha2haha7();
                        } else if (flashinghag27) {
                            updateButtonColorha2haha7();
                            showConfirmationDialogYNForButton27();
                        }

                    } else if (secha27 >= redThresholdha27) {
                        updateButtonColorha2haha7();
                        showConfirmationDialogYNForButton27();
                    }
                }
            }
        });

        btnTimerha2haha7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton27();
                return true;
            }
        });

        btnTimerha2haha8 = findViewById(R.id.b28);
        btnTimerha2haha8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha28){
                    showConfirmationDialogForButton28();
                    isTimerRunningha28 = true;
                    updateButtonColorha2haha8(); // 更新颜色
                } else if (isTimerRunningha28) {
                    if (secha28 < blueThresholdha28) {
                        updateButtonColorha2haha8();
                        showConfirmationDialogYNForButton28();
                    } else if (blueThresholdha28 <= secha28  && secha28 < yellowThresholdha28  ) {
                        if(!flashingha28){
                            flashingha28 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha8();
                        } else if (flashingha28) {
                            updateButtonColorha2haha8();
                            showConfirmationDialogYNForButton28();
                        }

                    } else if (yellowThresholdha28 <= secha28  && secha28 < redThresholdha28) {
                        if(!flashinghag28){
                            flashinghag28 = true; // 停止黄色闪烁
                            updateButtonColorha2haha8();
                        } else if (flashinghag28) {
                            updateButtonColorha2haha8();
                            showConfirmationDialogYNForButton28();
                        }

                    } else if (secha28 >= redThresholdha28) {
                        updateButtonColorha2haha8();
                        showConfirmationDialogYNForButton28();
                    }
                }
            }
        });

        btnTimerha2haha8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton28();
                return true;
            }
        });

        btnTimerha66 = findViewById(R.id.b666);
        btnTimerha66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha66){
                    showConfirmationDialogForButton66();
                    isTimerRunningha66 = true;
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
                    isTimerRunningha201 = true;
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
                    isTimerRunningha202 = true;
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
                    isTimerRunningha203 = true;
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
                    isTimerRunningha204 = true;
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

    }
    //--------------------------------------------------------------------------

    @Override
    public void onDestroy() {
        super.onDestroy();
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

        Intent timerServiceIntenthaha266 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha266);

        Intent timerServiceIntenthaha27 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha27);

        Intent timerServiceIntenthaha28 = new Intent(this,TimerServiceS2.class);
        stopService(timerServiceIntenthaha28);
        Intent timerServiceIntenthaha66 = new Intent(this,TimerServiceS2.class);
        stopService(timerServiceIntenthaha66);

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

        synchronized (editorhaha2haha6) {
            editorhaha2haha6.putBoolean(TIMER_STARTED_KEy2haha6, handlerhaha1.hasCallbacks(updateTimerThreadha266));
            editorhaha2haha6.putLong(START_TIME_KEy2haha6, starttimeha266);
            editorhaha2haha6.putLong(ELAPSED_TIME_KEy2haha6, timeInMillisechaondshaha266);
            editorhaha2haha6.putBoolean("peopleha_key2haha6", peopleha3_266);

            editorhaha2haha6.putBoolean("flashingha_key2haha6", flashingha266);
            editorhaha2haha6.putBoolean("flashinghag_key2haha6", flashinghag266);
            editorhaha2haha6.putBoolean("isTimerRunningha266", isTimerRunningha266);
            editorhaha2haha6.putInt("currentHourha2haha6", currentHourha2haha6);
            editorhaha2haha6.putInt("currentMinuteha266", currentMinuteha266);


            editorhaha2haha6.putInt("blueThresholdha266", blueThresholdha266);
            editorhaha2haha6.putInt("yellowThresholdha2662", yellowThresholdha266);
            editorhaha2haha6.putInt("redThresholdha266", redThresholdha266);
            editorhaha2haha6.apply();
        }

        synchronized (editorhaha2haha7) {
            editorhaha2haha7.putBoolean(TIMER_STARTED_KEy2haha7, handlerhaha1.hasCallbacks(updateTimerThreadha27));
            editorhaha2haha7.putLong(START_TIME_KEy2haha7, starttimeha27);
            editorhaha2haha7.putLong(ELAPSED_TIME_KEy2haha7, timeInMillisechaondshaha27);
            editorhaha2haha7.putBoolean("peopleha_key2haha7", peopleha3_27);

            editorhaha2haha7.putBoolean("flashingha_key2haha7", flashingha27);
            editorhaha2haha7.putBoolean("flashinghag_key2haha7", flashinghag27);
            editorhaha2haha7.putBoolean("isTimerRunningha27", isTimerRunningha27);
            editorhaha2haha7.putInt("currentHourha2haha7", currentHourha2haha7);
            editorhaha2haha7.putInt("currentMinuteha27", currentMinuteha27);


            editorhaha2haha7.putInt("blueThresholdha27", blueThresholdha27);
            editorhaha2haha7.putInt("yellowThresholdha27", yellowThresholdha27);
            editorhaha2haha7.putInt("redThresholdha27", redThresholdha27);
            editorhaha2haha7.apply();
        }

        synchronized (editorhaha2haha8) {
            editorhaha2haha8.putBoolean(TIMER_STARTED_KEy2haha8, handlerhaha1.hasCallbacks(updateTimerThreadha28));
            editorhaha2haha8.putLong(START_TIME_KEy2haha8, starttimeha28);
            editorhaha2haha8.putLong(ELAPSED_TIME_KEy2haha8, timeInMillisechaondshaha28);
            editorhaha2haha8.putBoolean("peopleha_key2haha8", peopleha3_28);

            editorhaha2haha8.putBoolean("flashingha_key2haha8", flashingha28);
            editorhaha2haha8.putBoolean("flashinghag_key2haha8", flashinghag28);
            editorhaha2haha8.putBoolean("isTimerRunningha28", isTimerRunningha28);
            editorhaha2haha8.putInt("currentHourha2haha8", currentHourha2haha8);
            editorhaha2haha8.putInt("currentMinuteha28", currentMinuteha28);


            editorhaha2haha8.putInt("blueThresholdha28", blueThresholdha28);
            editorhaha2haha8.putInt("yellowThresholdha28", yellowThresholdha28);
            editorhaha2haha8.putInt("redThresholdha28", redThresholdha28);
            editorhaha2haha8.apply();
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

        synchronized (editorhaha2haha6) {
            boolean timerStarted266 = sharedPreferenceshaha266.getBoolean(TIMER_STARTED_KEy2haha6, false);
            if (timerStarted266) {
                starttimeha266 = sharedPreferenceshaha266.getLong(START_TIME_KEy2haha6, 0);
                timeInMillisechaondshaha266 = sharedPreferenceshaha266.getLong(ELAPSED_TIME_KEy2haha6, 0);
                secha266 = (int) (timeInMillisechaondshaha266 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha266, 0);
            }
            peopleha3_266 = sharedPreferenceshaha266.getBoolean("peopleha_key2haha6", false);
            flashingha266 = sharedPreferenceshaha266.getBoolean("flashingha_key2haha6", false);
            flashinghag266 = sharedPreferenceshaha266.getBoolean("flashinghag_key2haha6", false);
            isTimerRunningha266 = sharedPreferenceshaha266.getBoolean("isTimerRunningha266", false);
            currentHourha2haha6 = sharedPreferenceshaha266.getInt("currentHourha2haha6", currentHourha2haha6);
            currentMinuteha266 = sharedPreferenceshaha266.getInt("currentMinuteha266", currentMinuteha266);



            // 恢复加時時間
            blueThresholdha266 = sharedPreferenceshaha266.getInt("blueThresholdha266", originalblueThresholdhaha2);
            yellowThresholdha266 = sharedPreferenceshaha266.getInt("yellowThresholdha266", originalyellowThresholdhaha2);
            redThresholdha266 = sharedPreferenceshaha266.getInt("redThresholdha266", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha6();
        }

        synchronized (editorhaha2haha7) {
            boolean timerStarted27 = sharedPreferenceshaha27.getBoolean(TIMER_STARTED_KEy2haha7, false);
            if (timerStarted27) {
                starttimeha27 = sharedPreferenceshaha27.getLong(START_TIME_KEy2haha7, 0);
                timeInMillisechaondshaha27 = sharedPreferenceshaha27.getLong(ELAPSED_TIME_KEy2haha7, 0);
                secha27 = (int) (timeInMillisechaondshaha27 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha27, 0);
            }
            peopleha3_27 = sharedPreferenceshaha27.getBoolean("peopleha_key2haha7", false);
            flashingha27 = sharedPreferenceshaha27.getBoolean("flashingha_key2haha7", false);
            flashinghag27 = sharedPreferenceshaha27.getBoolean("flashinghag_key2haha7", false);
            isTimerRunningha27 = sharedPreferenceshaha27.getBoolean("isTimerRunningha27", false);
            currentHourha2haha7 = sharedPreferenceshaha27.getInt("currentHourha2haha7", currentHourha2haha7);
            currentMinuteha27 = sharedPreferenceshaha27.getInt("currentMinuteha27", currentMinuteha27);




            // 恢复加時時間
            blueThresholdha27 = sharedPreferenceshaha27.getInt("blueThresholdha27", originalblueThresholdhaha2);
            yellowThresholdha27 = sharedPreferenceshaha27.getInt("yellowThresholdha27", originalyellowThresholdhaha2);
            redThresholdha27 = sharedPreferenceshaha27.getInt("redThresholdha27", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha7();
        }

        synchronized (editorhaha2haha8) {
            boolean timerStarted28 = sharedPreferenceshaha28.getBoolean(TIMER_STARTED_KEy2haha8, false);
            if (timerStarted28) {
                starttimeha28 = sharedPreferenceshaha28.getLong(START_TIME_KEy2haha8, 0);
                timeInMillisechaondshaha28 = sharedPreferenceshaha28.getLong(ELAPSED_TIME_KEy2haha8, 0);
                secha28 = (int) (timeInMillisechaondshaha28 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha28, 0);
            }
            peopleha3_28 = sharedPreferenceshaha28.getBoolean("peopleha_key2haha8", false);
            flashingha28 = sharedPreferenceshaha28.getBoolean("flashingha_key2haha8", false);
            flashinghag28 = sharedPreferenceshaha28.getBoolean("flashinghag_key2haha8", false);
            isTimerRunningha28 = sharedPreferenceshaha28.getBoolean("isTimerRunningha28", false);
            currentHourha2haha8 = sharedPreferenceshaha28.getInt("currentHourha2haha8", currentHourha2haha8);
            currentMinuteha28 = sharedPreferenceshaha28.getInt("currentMinuteha28", currentMinuteha28);




            // 恢复加時時間
            blueThresholdha28 = sharedPreferenceshaha28.getInt("blueThresholdha28", originalblueThresholdhaha2);
            yellowThresholdha28 = sharedPreferenceshaha28.getInt("yellowThresholdha28", originalyellowThresholdhaha2);
            redThresholdha28 = sharedPreferenceshaha28.getInt("redThresholdha28", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha8();

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
    private void stopTimer2haha6() {
        handlerhaha1.removeCallbacks(updateTimerThreadha266);
    }
    private void stopTimer2haha7() {
        handlerhaha1.removeCallbacks(updateTimerThreadha27);
    }
    private void stopTimer2haha8() {
        handlerhaha1.removeCallbacks(updateTimerThreadha28);
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

    private void resetsechaondsha266() {
        sechaondsha266 = 0;
        secha266 = 0;
        minutesha266 = 0;
        hoursha266 = 0;
        String timeString = String.format("%02d:%02d", hoursha266, minutesha266);
        btnTimerha2haha6.setText(timeString);
    }

    private void resetsechaondsha27() {
        sechaondsha27 = 0;
        secha27 = 0;
        minutesha27 = 0;
        hoursha27 = 0;
        String timeString = String.format("%02d:%02d",  hoursha27, minutesha27);
        btnTimerha2haha7.setText(timeString);
    }

    private void resetsechaondsha28() {
        sechaondsha28 = 0;
        secha28 = 0;
        minutesha28 = 0;
        hoursha28 = 0;
        String timeString = String.format("%02d:%02d",  hoursha28, minutesha28);
        btnTimerha2haha8.setText(timeString);
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

    private void resetButtonColor2haha6() {
        btnTimerha2haha6.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha7() {
        btnTimerha2haha7.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor2haha8() {
        btnTimerha2haha8.setBackgroundColor(getResources().getColor(R.color.white));
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

    private void showConfirmationDialogYNForButton266() {
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
                stopTimer2haha6();
                resetThresholdsToOriginal266();
                resetsechaondsha266();
                resetButtonColor2haha6();
                btnTimerha2haha6.clearAnimation();
                flashingha266 = false;flashinghag266 = false;
                isTimerRunningha266 = false;

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

    private void showConfirmationDialogYNForButton27() {
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
                stopTimer2haha7();
                resetThresholdsToOriginal27();
                resetsechaondsha27();
                resetButtonColor2haha7();
                btnTimerha2haha7.clearAnimation();
                flashingha27 = false; flashinghag27 = false;
                isTimerRunningha27 = false;

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

    private void showConfirmationDialogYNForButton28() {
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
                stopTimer2haha8();
                resetThresholdsToOriginal28();
                resetsechaondsha28();
                resetButtonColor2haha8();
                btnTimerha2haha8.clearAnimation();
                flashingha28 = false;flashinghag28 = false;
                isTimerRunningha28 = false;

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
                starttimeha1r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currenttime1 = Calendar.getInstance();
                currentHourha1 = currenttime1.get(Calendar.HOUR_OF_DAY);
                currentMinuteha1 = currenttime1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_1 = false;
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
                peopleha3_2 = true;
                starttimeha2r();
                dialog.dismiss();
                Calendar currenttime2 = Calendar.getInstance();
                currentHourha2haha = currenttime2.get(Calendar.HOUR_OF_DAY);
                currentMinuteha2 = currenttime2.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_2 = false;
                starttimeha2r();
                dialog.dismiss();
                flashingha2 = true;
                Calendar currenttime2 = Calendar.getInstance();
                currentHourha2haha = currenttime2.get(Calendar.HOUR_OF_DAY);
                currentMinuteha2 = currenttime2.get(Calendar.MINUTE);
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
                peopleha3_3 = true;
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
                peopleha3_3 = false;
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
                peopleha3_4 = true;
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
                peopleha3_4 = false;
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
                peopleha3_5 = true;
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
                peopleha3_5 = false;
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
                peopleha3_7 = true;
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
                peopleha3_7 = false;
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
                peopleha3_8 = true;
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
                peopleha3_8 = false;
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
                peopleha3_9 = true;
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
                peopleha3_9 = false;
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
                peopleha3_10 = true;
                starttimeha10r();
                dialog.dismiss();

                Calendar currenttime10 = Calendar.getInstance();
                currentHourha10 = currenttime10.get(Calendar.HOUR_OF_DAY);
                currentMinuteha10 = currenttime10.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_10 = false;
                starttimeha10r();
                dialog.dismiss();
                flashingha10 = true;

                Calendar currenttime10 = Calendar.getInstance();
                currentHourha10 = currenttime10.get(Calendar.HOUR_OF_DAY);
                currentMinuteha10 = currenttime10.get(Calendar.MINUTE);
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
                peopleha3_11 = true;
                starttimeha11r();
                dialog.dismiss();

                Calendar currenttime11 = Calendar.getInstance();
                currentHourha11 = currenttime11.get(Calendar.HOUR_OF_DAY);
                currentMinuteha11 = currenttime11.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_11 = false;
                starttimeha11r();
                dialog.dismiss();
                flashingha11 = true;

                Calendar currenttime11 = Calendar.getInstance();
                currentHourha11 = currenttime11.get(Calendar.HOUR_OF_DAY);
                currentMinuteha11 = currenttime11.get(Calendar.MINUTE);
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
                peopleha3_16 = true;
                starttimeha16r();
                dialog.dismiss();
                Calendar currenttime16 = Calendar.getInstance();
                currentHourha16 = currenttime16.get(Calendar.HOUR_OF_DAY);
                currentMinuteha16 = currenttime16.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_16 = false;
                starttimeha16r();
                dialog.dismiss();
                flashingha16 = true;
                Calendar currenttime16 = Calendar.getInstance();
                currentHourha16 = currenttime16.get(Calendar.HOUR_OF_DAY);
                currentMinuteha16 = currenttime16.get(Calendar.MINUTE);
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
                peopleha3_17 = true;
                starttimeha17r();
                dialog.dismiss();

                Calendar currenttime17 = Calendar.getInstance();
                currentHourha17 = currenttime17.get(Calendar.HOUR_OF_DAY);
                currentMinuteha17 = currenttime17.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_17 = false;
                starttimeha17r();
                dialog.dismiss();
                flashingha17 = true;

                Calendar currenttime17 = Calendar.getInstance();
                currentHourha17 = currenttime17.get(Calendar.HOUR_OF_DAY);
                currentMinuteha17 = currenttime17.get(Calendar.MINUTE);
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
                peopleha3_18 = true;
                starttimeha18r();
                dialog.dismiss();

                Calendar currenttime18 = Calendar.getInstance();
                currentHourha18 = currenttime18.get(Calendar.HOUR_OF_DAY);
                currentMinuteha18 = currenttime18.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_18 = false;
                starttimeha18r();
                dialog.dismiss();
                flashingha18 = true;

                Calendar currenttime18 = Calendar.getInstance();
                currentHourha18 = currenttime18.get(Calendar.HOUR_OF_DAY);
                currentMinuteha18 = currenttime18.get(Calendar.MINUTE);
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
                peopleha3_19 = true;
                starttimeha19r();
                dialog.dismiss();

                Calendar currenttime19 = Calendar.getInstance();
                currentHourha19 = currenttime19.get(Calendar.HOUR_OF_DAY);
                currentMinuteha19 = currenttime19.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_19 = false;
                starttimeha19r();
                dialog.dismiss();
                flashingha19 = true;

                Calendar currenttime19 = Calendar.getInstance();
                currentHourha19 = currenttime19.get(Calendar.HOUR_OF_DAY);
                currentMinuteha19 = currenttime19.get(Calendar.MINUTE);
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
                peopleha3_20 = true;
                starttimeha20r();
                dialog.dismiss();

                Calendar currenttime20 = Calendar.getInstance();
                currentHourha2haha0 = currenttime20.get(Calendar.HOUR_OF_DAY);
                currentMinuteha20 = currenttime20.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_20 = false;
                starttimeha20r();
                dialog.dismiss();
                flashingha20 = true;

                Calendar currenttime20 = Calendar.getInstance();
                currentHourha2haha0 = currenttime20.get(Calendar.HOUR_OF_DAY);
                currentMinuteha20 = currenttime20.get(Calendar.MINUTE);
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
                peopleha3_21 = true;
                starttimeha21r();
                dialog.dismiss();

                Calendar currenttime21 = Calendar.getInstance();
                currentHourha2haha1 = currenttime21.get(Calendar.HOUR_OF_DAY);
                currentMinuteha21 = currenttime21.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_21 = false;
                starttimeha21r();
                dialog.dismiss();
                flashingha21 = true;

                Calendar currenttime21 = Calendar.getInstance();
                currentHourha2haha1 = currenttime21.get(Calendar.HOUR_OF_DAY);
                currentMinuteha21 = currenttime21.get(Calendar.MINUTE);
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
                peopleha3_22 = true;
                starttimeha22r();
                dialog.dismiss();

                Calendar currenttime22 = Calendar.getInstance();
                currentHourha2haha2 = currenttime22.get(Calendar.HOUR_OF_DAY);
                currentMinuteha22 = currenttime22.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_22 = false;
                starttimeha22r();
                dialog.dismiss();
                flashingha22= true;

                Calendar currenttime22 = Calendar.getInstance();
                currentHourha2haha2 = currenttime22.get(Calendar.HOUR_OF_DAY);
                currentMinuteha22 = currenttime22.get(Calendar.MINUTE);
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
                peopleha3_23 = true;
                starttimeha23r();
                dialog.dismiss();

                Calendar currenttime23 = Calendar.getInstance();
                currentHourha2haha3 = currenttime23.get(Calendar.HOUR_OF_DAY);
                currentMinuteha23 = currenttime23.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_23 = false;
                starttimeha23r();
                dialog.dismiss();
                flashingha23 = true;

                Calendar currenttime23 = Calendar.getInstance();
                currentHourha2haha3 = currenttime23.get(Calendar.HOUR_OF_DAY);
                currentMinuteha23 = currenttime23.get(Calendar.MINUTE);
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
                peopleha3_24 = true;
                starttimeha24r();
                dialog.dismiss();

                Calendar currenttime24 = Calendar.getInstance();
                currentHourha2haha4 = currenttime24.get(Calendar.HOUR_OF_DAY);
                currentMinuteha24 = currenttime24.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_24 = false;
                starttimeha24r();
                dialog.dismiss();
                flashingha24 = true;

                Calendar currenttime24 = Calendar.getInstance();
                currentHourha2haha4 = currenttime24.get(Calendar.HOUR_OF_DAY);
                currentMinuteha24 = currenttime24.get(Calendar.MINUTE);
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
                peopleha3_25 = true;
                starttimeha25r();
                dialog.dismiss();

                Calendar currenttime25 = Calendar.getInstance();
                currentHourha2haha5 = currenttime25.get(Calendar.HOUR_OF_DAY);
                currentMinuteha25 = currenttime25.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_25 = false;
                starttimeha25r();
                dialog.dismiss();
                flashingha25 = true;

                Calendar currenttime25 = Calendar.getInstance();
                currentHourha2haha5 = currenttime25.get(Calendar.HOUR_OF_DAY);
                currentMinuteha25 = currenttime25.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton266() {
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
                peopleha3_266 = true;
                starttimeha266r();
                dialog.dismiss();

                Calendar currenttime266 = Calendar.getInstance();
                currentHourha2haha6 = currenttime266.get(Calendar.HOUR_OF_DAY);
                currentMinuteha266 = currenttime266.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_266 = false;
                starttimeha266r();
                dialog.dismiss();
                flashingha266 = true;

                Calendar currenttime266 = Calendar.getInstance();
                currentHourha2haha6 = currenttime266.get(Calendar.HOUR_OF_DAY);
                currentMinuteha266 = currenttime266.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton27() {
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
                peopleha3_27 = true;
                starttimeha27r();
                dialog.dismiss();

                Calendar currenttime27 = Calendar.getInstance();
                currentHourha2haha7 = currenttime27.get(Calendar.HOUR_OF_DAY);
                currentMinuteha27 = currenttime27.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_27 = false;
                starttimeha27r();
                dialog.dismiss();
                flashingha27 = true;

                Calendar currenttime27 = Calendar.getInstance();
                currentHourha2haha7 = currenttime27.get(Calendar.HOUR_OF_DAY);
                currentMinuteha27 = currenttime27.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton28() {
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
                peopleha3_28 = true;
                starttimeha28r();
                dialog.dismiss();

                Calendar currenttime28 = Calendar.getInstance();
                currentHourha2haha8 = currenttime28.get(Calendar.HOUR_OF_DAY);
                currentMinuteha28 = currenttime28.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_28 = false;
                starttimeha28r();
                dialog.dismiss();
                flashingha28 = true;

                Calendar currenttime28 = Calendar.getInstance();
                currentHourha2haha8 = currenttime28.get(Calendar.HOUR_OF_DAY);
                currentMinuteha28 = currenttime28.get(Calendar.MINUTE);
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
                peopleha3_66 = true;
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
                peopleha3_66 = false;
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
                peopleha3_12 = true;
                starttimeha201r();
                dialog.dismiss();

                Calendar currenttime12 = Calendar.getInstance();
                currentHourha12 = currenttime12.get(Calendar.HOUR_OF_DAY);
                currentMinuteha12 = currenttime12.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_12 = false;
                starttimeha201r();
                dialog.dismiss();
                flashingha201 = true;

                Calendar currenttime12 = Calendar.getInstance();
                currentHourha12 = currenttime12.get(Calendar.HOUR_OF_DAY);
                currentMinuteha12 = currenttime12.get(Calendar.MINUTE);
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
                peopleha3_13 = true;
                starttimeha202r();
                dialog.dismiss();

                Calendar currenttime13 = Calendar.getInstance();
                currentHourha13 = currenttime13.get(Calendar.HOUR_OF_DAY);
                currentMinuteha13 = currenttime13.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_13 = false;
                starttimeha202r();
                dialog.dismiss();
                flashingha202 = true;

                Calendar currenttime13 = Calendar.getInstance();
                currentHourha13 = currenttime13.get(Calendar.HOUR_OF_DAY);
                currentMinuteha13 = currenttime13.get(Calendar.MINUTE);
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
                peopleha3_14 = true;
                starttimeha203r();
                dialog.dismiss();

                Calendar currenttime14 = Calendar.getInstance();
                currentHourha14 = currenttime14.get(Calendar.HOUR_OF_DAY);
                currentMinuteha14 = currenttime14.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_14 = false;
                starttimeha203r();
                dialog.dismiss();
                flashingha203 = true;

                Calendar currenttime14 = Calendar.getInstance();
                currentHourha14 = currenttime14.get(Calendar.HOUR_OF_DAY);
                currentMinuteha14 = currenttime14.get(Calendar.MINUTE);
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
                peopleha3_15 = true;
                starttimeha204r();
                dialog.dismiss();

                Calendar currenttime15 = Calendar.getInstance();
                currentHourha15 = currenttime15.get(Calendar.HOUR_OF_DAY);
                currentMinuteha15 = currenttime15.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_15 = false;
                starttimeha204r();
                dialog.dismiss();
                flashingha204 = true;

                Calendar currenttime15 = Calendar.getInstance();
                currentHourha15 = currenttime15.get(Calendar.HOUR_OF_DAY);
                currentMinuteha15 = currenttime15.get(Calendar.MINUTE);
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

    private void starttimeha266r() {
        starttimeha266 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha266, 0);
    }

    private void starttimeha27r() {
        starttimeha27 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha27, 0);
    }

    private void starttimeha28r() {
        starttimeha28 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha28, 0);
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

    private void resetThresholdsToOriginal266() {
        yellowThresholdha266 = originalyellowThresholdhaha2;
        redThresholdha266 = originalredThresholdhaha2;
        blueThresholdha266 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal27() {
        yellowThresholdha27 = originalyellowThresholdhaha2;
        redThresholdha27 = originalredThresholdhaha2;
        blueThresholdha27 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal28() {
        yellowThresholdha28 = originalyellowThresholdhaha2;
        redThresholdha28 = originalredThresholdhaha2;
        blueThresholdha28 = originalblueThresholdhaha2;
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

    private Runnable updateTimerThreadha266 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha266 = SystemClock.uptimeMillis() - starttimeha266;
            updatedtimeha266 = timeInMillisechaondshaha266;
            sechaondsha266 = (int) (updatedtimeha266 / 1000);
            minutesha266 = sechaondsha266 / 60;
            hoursha266 = minutesha266 / 60;
            sechaondsha266 = sechaondsha266 % 60;
            minutesha266 = minutesha266 % 60;
            secha266 =hoursha266 * 3600 + minutesha266 * 60 + sechaondsha266;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha6 * 60 * 60 + currentMinuteha266 * 60 + redThresholdha266;
            // 计算小时和分钟
            futureHourha2haha6 = totalSeconds / 3600;
            futureMinuteha266 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha6 >= 24) {
                futureHourha2haha6 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha6, currentMinuteha266);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha6, futureMinuteha266);

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
                btnTimerha2haha6.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha6.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha6();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha27 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha27 = SystemClock.uptimeMillis() - starttimeha27;
            updatedtimeha27 = timeInMillisechaondshaha27;
            sechaondsha27 = (int) (updatedtimeha27 / 1000);
            minutesha27 = sechaondsha27 / 60;
            hoursha27 = minutesha27 / 60;
            sechaondsha27 = sechaondsha27 % 60;
            minutesha27 = minutesha27 % 60;
            secha27 =hoursha27 * 3600 + minutesha27 * 60 + sechaondsha27;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha7 * 60 * 60 + currentMinuteha27 * 60 + redThresholdha27;
            // 计算小时和分钟
            futureHourha2haha7 = totalSeconds / 3600;
            futureMinuteha27 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha7 >= 24) {
                futureHourha2haha7 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha7, currentMinuteha27);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha7, futureMinuteha27);

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
                btnTimerha2haha7.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha7.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha7();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha28 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha28 = SystemClock.uptimeMillis() - starttimeha28;
            updatedtimeha28 = timeInMillisechaondshaha28;
            sechaondsha28 = (int) (updatedtimeha28 / 1000);
            minutesha28 = sechaondsha28 / 60;
            hoursha28 = minutesha28 / 60;
            sechaondsha28 = sechaondsha28 % 60;
            minutesha28 = minutesha28 % 60;
            secha28 =hoursha28 * 3600 + minutesha28 * 60 + sechaondsha28;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha2haha8 * 60 * 60 + currentMinuteha28 * 60 + redThresholdha28;
            // 计算小时和分钟
            futureHourha2haha8 = totalSeconds / 3600;
            futureMinuteha28 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha8 >= 24) {
                futureHourha2haha8 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha8, currentMinuteha28);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha8, futureMinuteha28);

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
                btnTimerha2haha8.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha8.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha8();
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

        dialogTitle.setText("266號加時");

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

    private void showTimeDialogForButton266() {
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
                    addtime266(time1); // Customize the time for buttonh 266


                    if (secha266 >= blueThresholdha266) {
                        flashingha266 = true;
                        updateButtonColorha2haha6();
                    }
                    if (flashinghag266) {
                        flashinghag266 = false;
                        updateButtonColorha2haha6();
                    }
                    break;
                case "60分鐘":
                    addtime266(time2); // Customize the time for buttonh 266

                    if (secha266 >= blueThresholdha266) {
                        flashingha266 = true;
                        updateButtonColorha2haha6();
                    }
                    if (flashinghag266) {
                        flashinghag266 = false;
                        updateButtonColorha2haha6();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton27() {
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
                    addtime27(time1); // Customize the time for buttonh 27


                    if (secha27 >= blueThresholdha27) {
                        flashingha27 = true;
                        updateButtonColorha2haha7();
                    }
                    if (flashinghag27) {
                        flashinghag27 = false;
                        updateButtonColorha2haha7();
                    }
                    break;
                case "60分鐘":
                    addtime27(time2); // Customize the time for buttonh 27


                    if (secha27 >= blueThresholdha27) {
                        flashingha27 = true;
                        updateButtonColorha2haha7();
                    }
                    if (flashinghag27) {
                        flashinghag27 = false;
                        updateButtonColorha2haha7();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton28() {
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
                    addtime28(time1); // Customize the time for buttonh 28

                    if (secha28 >= blueThresholdha28) {
                        flashingha28 = true;
                        updateButtonColorha2haha8();
                    }
                    if (flashinghag28) {
                        flashinghag28 = false;
                        updateButtonColorha2haha8();
                    }
                    break;
                case "60分鐘":
                    addtime28(time2); // Customize the time for buttonh 28

                    if (secha28 >= blueThresholdha28) {
                        flashingha28 = true;
                        updateButtonColorha2haha8();
                    }
                    if (flashinghag28) {
                        flashinghag28 = false;
                        updateButtonColorha2haha8();
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

    private void addtime266(int sechaondshaToAdd) {
        //blueThresholdha266 += sechaondshaToAdd; // Customize for buttonh 266
        yellowThresholdha266 += sechaondshaToAdd; // Customize for buttonh 266
        redThresholdha266 += sechaondshaToAdd; // Customize for buttonh 266


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha6();
    }

    private void addtime27(int sechaondshaToAdd) {
        //blueThresholdha27 += sechaondshaToAdd; // Customize for buttonh 27
        yellowThresholdha27 += sechaondshaToAdd; // Customize for buttonh 27
        redThresholdha27 += sechaondshaToAdd; // Customize for buttonh 27


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha7();
    }

    private void addtime28(int sechaondshaToAdd) {
        //blueThresholdha28 += sechaondshaToAdd; // Customize for buttonh 28
        yellowThresholdha28 += sechaondshaToAdd; // Customize for buttonh 28
        redThresholdha28 += sechaondshaToAdd; // Customize for buttonh 28


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha2haha8();
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

    private void updateButtonColorha2haha6() {
        if (secha266 < 0.01) {
            btnTimerha2haha6.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha266 < blueThresholdha266 && peopleha3_266) {
            btnTimerha2haha6.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha266 < blueThresholdha266 && !peopleha3_266 ) {
            btnTimerha2haha6.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha266 < yellowThresholdha266 && peopleha3_266) {
            btnTimerha2haha6.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha266 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha6.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha6.clearAnimation();
            }


        } else if (secha266 < yellowThresholdha266 && !peopleha3_266) {
            btnTimerha2haha6.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha266 < redThresholdha266) {
            btnTimerha2haha6.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag266 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha6.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha6.clearAnimation();
            }


        } else {
            btnTimerha2haha6.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha6.clearAnimation();
        }
    }

    private void updateButtonColorha2haha7() {
        if (secha27 < 0.01) {
            btnTimerha2haha7.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha27 < blueThresholdha27 && peopleha3_27) {
            btnTimerha2haha7.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha27 < blueThresholdha27 && !peopleha3_27 ) {
            btnTimerha2haha7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha27 < yellowThresholdha27 && peopleha3_27) {
            btnTimerha2haha7.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha27 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha7.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha7.clearAnimation();
            }


        } else if (secha27 < yellowThresholdha27 && !peopleha3_27) {
            btnTimerha2haha7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha27 < redThresholdha27) {
            btnTimerha2haha7.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag27 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha7.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha7.clearAnimation();
            }


        } else {
            btnTimerha2haha7.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha7.clearAnimation();
        }
    }

    private void updateButtonColorha2haha8() {
        if (secha28 < 0.01) {
            btnTimerha2haha8.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha28 < blueThresholdha28 && peopleha3_28) {
            btnTimerha2haha8.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha28 < blueThresholdha28 && !peopleha3_28 ) {
            btnTimerha2haha8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha28 < yellowThresholdha28 && peopleha3_28) {
            btnTimerha2haha8.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha28 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha8.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha8.clearAnimation();
            }


        } else if (secha28 < yellowThresholdha28 && !peopleha3_28) {
            btnTimerha2haha8.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha28 < redThresholdha28) {
            btnTimerha2haha8.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag28 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha8.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha8.clearAnimation();
            }


        } else {
            btnTimerha2haha8.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha8.clearAnimation();
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
}


 */
