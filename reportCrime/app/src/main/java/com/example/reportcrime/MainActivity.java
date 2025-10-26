package com.example.reportcrime;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.drawer_layout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize DrawerLayout and NavigationView
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Set up ActionBarDrawerToggle for hamburger menu
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Hamburger menu button to open drawer
        ImageButton hamburgerMenu = findViewById(R.id.hamburger_menu);
        hamburgerMenu.setOnClickListener(v -> {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START);
            } else {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        // Phone icon - dial emergency number
        ImageButton phoneIcon = findViewById(R.id.phone_icon);
        phoneIcon.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:999"));
            startActivity(intent);
        });

        // Bell icon - placeholder for notifications
        ImageButton bellIcon = findViewById(R.id.bell_icon);
        bellIcon.setOnClickListener(v -> {
            Toast.makeText(this, "Notifications clicked", Toast.LENGTH_SHORT).show();
            // Implement notification logic here
        });

        // SearchView for stations - placeholder functionality
        SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Handle search submission, e.g., filter stations or navigate to Search_Stations
                Intent intent = new Intent(MainActivity.this, Search_Stations.class);
                intent.putExtra("search_query", query);
                startActivity(intent);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Handle text change if needed
                return false;
            }
        });

        // Note: Since the grid_cards is empty in the XML, no card click listeners are added here.
        // If you add card views to the GridLayout, include their onClick listeners accordingly.
        // For example, if you add a card for Search Station:
        // findViewById(R.id.card_search_station).setOnClickListener(v -> {
        //     Intent intent = new Intent(MainActivity.this, Search_Stations.class);
        //     startActivity(intent);
        // });

        // Footer is minimal in this XML, so no additional button listeners.
        // If you expand the footer with buttons, add their onClick listeners here.
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here
        int id = item.getItemId();
        if (id == R.id.main_content) {
            // Already on home
        } else if (id == R.id.card_report_crime) {
            Intent intent = new Intent(MainActivity.this, ReportCrimeActivity.class);
            startActivity(intent);
        } else if (id == R.id.card_report_crime) {
            Intent intent = new Intent(MainActivity.this, ReportCrimeActivity.class);
            startActivity(intent);
        } else if (id == R.id.card_lost_found) {
            Intent intent = new Intent(MainActivity.this, lost_and_found.class);
            startActivity(intent);
        } else if (id == R.id.card_missing_persons) {
            Intent intent = new Intent(MainActivity.this, MissingPersonsActivity.class);
            startActivity(intent);
        } else if (id == R.id.card_search_station) {
            Intent intent = new Intent(MainActivity.this, Search_Stations.class);
            startActivity(intent);
        } else if (id == R.id.card_laws) {
            Intent intent = new Intent(MainActivity.this, ConstitutionalLawsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_settings) {
            // Open settings
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_logout) {
            // Handle logout
            Toast.makeText(this, "Logout clicked", Toast.LENGTH_SHORT).show();
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
