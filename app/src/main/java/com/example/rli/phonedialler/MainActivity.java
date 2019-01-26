package com.example.rli.phonedialler;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;


import com.example.rli.phonedialler.adapters.ViewPagerAdapter;
import com.example.rli.phonedialler.fragments.FragmentContacts;
import com.example.rli.phonedialler.fragments.FragmentFav;
import com.example.rli.phonedialler.fragments.FragmentsCalls;

public class MainActivity extends AppCompatActivity {

    private TableLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        viewPager=findViewById( R.id.viewpager );


        ViewPagerAdapter adapter=new ViewPagerAdapter( getSupportFragmentManager() );

        adapter.addFragment( new FragmentsCalls(), "Calls" );
        adapter.addFragment( new FragmentContacts(), "Contacts" );
        adapter.addFragment( new FragmentFav(), "Fav" );

        viewPager.setAdapter( adapter );




    }
}
