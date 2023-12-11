package com.example.hotspringtest;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnHoliday);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建一个 Intent 来启动 HomePageActivity
                Intent intent = new Intent(MainActivity.this, HomePageHoliday.class);
                startActivity(intent);
            }
        }); //當按下平日鍵就會跳轉到PrivateRoomHolidday畫面
        Button button3 = findViewById(R.id.btnWeekday);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建一个 Intent 来启动 HomePageActivity
                Intent intent = new Intent(MainActivity.this, HomePage.class);
                startActivity(intent);
            }
        }); //當按下平日就會跳轉到PrivateRoom畫面

        Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 清空內存並重置應用狀態
                resetApplication();
            }
        });


    }


    private void resetApplication() {
        // 創建一個確認對話框
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_reset, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);



        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 在這裡執行清空內存和重置應用狀態的操作

                // 1. 停止計時器服務
                Intent timerServiceIntentS1 = new Intent(MainActivity.this, TimerServiceS1.class);
                stopService(timerServiceIntentS1);
                Intent timerServiceIntentS2 = new Intent(MainActivity.this, TimerServiceS2.class);
                stopService(timerServiceIntentS2);

                // 2. 清空SharedPreferences
                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();

                // 3. 可以進一步執行其他需要的操作，例如清空某些變數或數據等

                // 4. 重新啟動應用
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish(); // 結束當前 Activity
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 如果用戶選擇取消，關閉對話框
                dialog.dismiss();

            }
        });

        dialog.show();

    }


}