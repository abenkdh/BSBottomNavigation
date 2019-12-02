package uc.benkkstudio.bsbottomnavigationsample;

import androidx.appcompat.app.AppCompatActivity;
import uc.benkkstudio.bsbottomnavigation.BSBottomNavigation;
import uc.benkkstudio.bsbottomnavigation.NavigationClickListner;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final BSBottomNavigation bsBottomNavigation = findViewById(R.id.space);
        bsBottomNavigation.addButton("HOME", R.drawable.ic_nav_home);
        bsBottomNavigation.addButton("CATEGORY", R.drawable.ic_nav_home);
        bsBottomNavigation.addButton("POPULAR", R.drawable.ic_nav_home);
        bsBottomNavigation.addButton("HISTORY", R.drawable.ic_nav_home);
        bsBottomNavigation.showIconOnly();
        bsBottomNavigation.setSelectedItem(-1);
        bsBottomNavigation.setButtonClickListener(new NavigationClickListner() {
            @Override
            public void onCentreButtonClick() {

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                switch (itemIndex) {
                    case 0:
                        Toast.makeText(MainActivity.this, itemName, Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, itemName, Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, itemName, Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, itemName, Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }


}
