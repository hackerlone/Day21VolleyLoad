package com.example.lenovo.day21volleylistviewapplicationpulldownpullup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.example.lenovo.day21volleylistviewapplicationpulldownpullup.View.PullDownView;

public class MainActivity extends AppCompatActivity {
    private RequestQueue requestQueue;
    private PullDownView pullDownView;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
