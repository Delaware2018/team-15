package edu.dtcc.janemone.b_positive_app;

import android.content.Intent;
import android.content.res.Resources;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class leaderActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    private static ListView leaderList;
    private static String[] names;
    private static String[] dollarDonations;
    private int[] ranks;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Resources res = getResources(); //imports all the item data stored in strings.xml
        leaderList = (ListView) findViewById(R.id.leaderList);

        names = res.getStringArray(R.array.leaderboardNames);
        dollarDonations = res.getStringArray(R.array.donations);

        ranks=new int[names.length];
        for(int i=0; i<names.length; i++){
            ranks[i]=i+1;
        }

        drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        leaderAdapter adapterObj = new leaderAdapter(this, names, dollarDonations, ranks);
        leaderList.setAdapter(adapterObj);


        leaderList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                Intent showDetailActivity=new Intent(getApplicationContext(), randomActivity.class);
                showDetailActivity.putExtra("edu.dtcc.janemone.b_positive_app.RANK", Integer.toString(ranks[i]));
                showDetailActivity.putExtra("edu.dtcc.janemone.b_positive_app.NAME", names[i]);
                startActivity(showDetailActivity);
            }

        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_main) {
            Intent intent = new Intent(this, MainActivity.class);
            drawer.closeDrawers();
            startActivity(intent);
        } else if (id == R.id.nav_video) {
            Intent intent = new Intent(this, Video.class);
            drawer.closeDrawers();
            startActivity(intent);

        } else if (id == R.id.nav_donations) {
            Intent intent = new Intent(this, Donation.class);
            drawer.closeDrawers();
            startActivity(intent);
        } else if (id == R.id.nav_leaderboard) {
            Intent intent = new Intent(this, leaderActivity.class);
            drawer.closeDrawers();
            startActivity(intent);

        } else if (id == R.id.nav_share) {
            Intent intent = new Intent ( this, Share.class);
            drawer.closeDrawers();
            startActivity(intent);
        } else if (id == R.id.nav_aboutus){
            Intent intent = new Intent(this, AboutUs.class);
            drawer.closeDrawers();
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
