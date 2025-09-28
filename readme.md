1) pahle hum kaise karte the view se. iske bad hum dekhenge ki humne usme kya modification kiya viewbinding me, aur uske bad hum dekhenge ki hume data binding ki jarurat kyu padhi. ye sari chize ek dusre se relatable hai

2) Ex-1 main_activity.xml                                                                                      MainActivity.java

3) <?xml version="1.0" encoding="utf-8"?>                                                                      package com.example.findviewexample;
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"                                       import android.os.Bundle;
    android:orientation="vertical"                                                                             import android.widget.TextView;
    android:padding="20dp"                                                                                     import androidx.appcompat.app.AppCompatActivity;
    android:layout_width="match_parent"                      
    android:layout_height="match_parent">                                                                       public class MainActivity extends AppCompatActivity {

    <TextView                                                                                                        private TextView textOne;
        android:id="@+id/textOne"                                                                                    private TextView textTwo;
        android:layout_width="wrap_content"                                                                          @Override
        android:layout_height="wrap_content"                                                                         protected void onCreate(Bundle savedInstanceState) {
        android:text="First Text"                                                                                          super.onCreate(savedInstanceState);
        android:textSize="20sp"/>                                                                                          setContentView(R.layout.activity_main);
                                                                         
    <TextView                                                                                                                textOne = findViewById(R.id.textOne);
        android:id="@+id/textTwo"                                                                                            textTwo = findViewById(R.id.textTwo);
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"                                                                                 textOne.setText("Hello from findViewById!");
        android:text="Second Text"                                                                                           textTwo.setText("This is the second text view!");
        android:textSize="20sp"                                                                                            }
        android:layout_marginTop="10dp"/>                                                                              }
</LinearLayout>
