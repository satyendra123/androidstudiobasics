1) pahle hum kaise karte the view se. iske bad hum dekhenge ki humne usme kya modification kiya viewbinding me, aur uske bad hum dekhenge ki hume data binding ki jarurat kyu padhi. ye sari chize ek dusre se relatable hai

2) Ex-1 main_activity.xml                                                                       MainActivity.java

3) <?xml version="1.0" encoding="utf-8"?>                                                       package com.example.findviewexample;
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"                        import android.os.Bundle;
    android:orientation="vertical"                                                              import android.widget.TextView;
    android:padding="20dp"                                                                      import androidx.appcompat.app.AppCompatActivity;
    android:layout_width="match_parent"                      
    android:layout_height="match_parent">                                                          public class MainActivity extends AppCompatActivity {

    <TextView                                                                                          private TextView textOne;
        android:id="@+id/textOne"                                                                      private TextView textTwo;
        android:layout_width="wrap_content"                                                            @Override
        android:layout_height="wrap_content"                                                           protected void onCreate(Bundle savedInstanceState) {
        android:text="First Text"                                                                           super.onCreate(savedInstanceState);
        android:textSize="20sp"/>                                                                           setContentView(R.layout.activity_main);
                                                                         
    <TextView                                                                                               textOne = findViewById(R.id.textOne);
        android:id="@+id/textTwo"                                                                           textTwo = findViewById(R.id.textTwo);
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"                                                                textOne.setText("Hello from findViewById!");
        android:text="Second Text"                                                                          textTwo.setText("This is the second text view!");
        android:textSize="20sp"                                                                           }
        android:layout_marginTop="10dp"/>                                                             }
</LinearLayout>

Note- so isme hum .xml file banate hai usme text me id dete hai. aur MainActivity.java file me ek object banate hai textview ka aur xml me se findViewById() iske madad se bind kar dete hai xml ki id ko find karke. aur so jab bhi hum change karte hai run time me apne text ko to humara xml bhi change hoga. so ye purana concept tha. isme problem ye hota tha ki har view ke liye hume MainActivity me variable banana padta tha aur usko .xml ki id ke sath reference dena padta tha. so ye tarika sahi nahi tha aur bhut sara variables banane ki wajah se humara app bhi slow ho jata tha. isme ek problem aur tha jaise ki man lo ki humare pass 3 .xml file hai aur usme bhi humara Edittext hai to itne sare id ko unique name dekar differentiate karna bhut difficult tha so is chiz ko viewbinding ke dwara solve kiya gaya.

Ex-2 modified version using viewBinding
view binding- so view binding me jaise hi hum .xml file banate hai thik usi samay ek binding class ban jata hai andar hi andar jise ki hum dekh nahi sakte hai ise hum kewal MainActivity file ke andar hi access kar sakte hai. view binding ke liye hume buildFeatures{viewBining true} karna padta hai build.gradle file ke andar.


 <?xml version="1.0" encoding="utf-8"?>                                                       package com.example.findviewexample;
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"                        import android.os.Bundle;
    android:orientation="vertical"                                                              import android.widget.TextView;
    android:padding="20dp"                                                                      import androidx.appcompat.app.AppCompatActivity;
    android:layout_width="match_parent"                      
    android:layout_height="match_parent">                                                          public class MainActivity extends AppCompatActivity {

    <TextView                                                                                          ActivityMainBinding mainxml[;
        android:id="@+id/textOne"                                                                      
        android:layout_width="wrap_content"                                                            @Override
        android:layout_height="wrap_content"                                                           protected void onCreate(Bundle savedInstanceState) {
        android:text="First Text"                                                                           super.onCreate(savedInstanceState
        android:textSize="20sp"/>                                                                           mainxml = ActivityMainBinding.inflate(getLayoutInflate())
                                                                                                            setContentView(mainxml.getRoot())
    <TextView                                                                                               
        android:id="@+id/textTwo"                                                                           mainxml.t1.setText("Hello from findViewById!");
        android:layout_width="wrap_content"                                                                 mainxml.t2.setText("This is the second text view!");
        android:layout_height="wrap_content"                                                              }  
        android:text="Second Text"                                                                     }   
        android:textSize="20sp"                                                                          
        android:layout_marginTop="10dp"/>                                                            
</LinearLayout>
