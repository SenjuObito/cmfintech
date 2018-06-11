package com.example.obito.activity;

import android.os.Bundle;
import android.view.View;

import com.example.obito.R;
import com.example.obito.fragment.MeFragment;
import com.example.obito.fragment.NewsFragment;
import com.example.obito.fragment.OrderFragment;
import com.example.obito.views.BottomBar;

public class MainActivity extends BaseActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(NewsFragment.class,
                        "新闻",
                        R.mipmap.news_grey,
                        R.mipmap.news_blue)
                .addItem(OrderFragment.class,
                        "订阅",
                        R.mipmap.order_grey,
                        R.mipmap.order_blue)
                .addItem(MeFragment.class,
                        "我",
                        R.mipmap.me_grey,
                        R.mipmap.me_blue)
                .build();
    }

    @Override
    public void onClick(View view) {

    }
}