package com.habisofttech.ceronne.gestion;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.habisofttech.ceronne.gestion.adapters.ViewPagerAdapter;
import com.habisofttech.ceronne.gestion.fragments.CategorieFragment;
import com.habisofttech.ceronne.gestion.fragments.DepenseFragment;
import com.habisofttech.ceronne.gestion.models.Categorie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    public static ArrayList<Categorie> categories = new ArrayList<Categorie>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        //setSupportActionBar(toolbar);

        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);
    }

    public void setupViewPager(){

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new DepenseFragment(),getString(R.string.depense));
        viewPagerAdapter.addFragment(new CategorieFragment(),getString(R.string.categorie));
        viewPager.setAdapter(viewPagerAdapter);

    }
}
