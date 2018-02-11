package com.example.myapplication;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Circle circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /*If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in each nc mountain county


        LatLng alleghany = new LatLng(36.494084, -81.119608);
        mMap.addMarker(new MarkerOptions().position(alleghany).title("Alleghany").snippet("To find out which region you're in, tap the circle below:"));

        LatLng ashe = new LatLng(36.433967, -81.471839);
        mMap.addMarker(new MarkerOptions().position(ashe).title("Ashe").snippet("To find out which region you're in, tap the circle below:"));

        LatLng watauga = new LatLng(36.194182, -81.734942);
        mMap.addMarker(new MarkerOptions().position(watauga).title("Watauga").snippet("To find out which region you're in, tap the circle below:"));

        LatLng avery = new LatLng(36.119841, -81.909826);
        mMap.addMarker(new MarkerOptions().position(avery).title("Avery").snippet("To find out which region you're in, tap the circle below:"));

        LatLng mitchell = new LatLng(36.027776, -82.149605);
        mMap.addMarker(new MarkerOptions().position(mitchell).title("Mitchell").snippet("To find out which region you're in, tap the circle below:"));

        LatLng yancey = new LatLng(35.888897, -82.345189);
        mMap.addMarker(new MarkerOptions().position(yancey).title("Yancey").snippet("To find out which region you're in, tap the circle below:"));

        LatLng mcdowell = new LatLng(35.698440, -82.08429);
        mMap.addMarker(new MarkerOptions().position(mcdowell).title("Mcdowell").snippet("To find out which region you're in, tap the circle below:"));

        LatLng madison = new LatLng(35.797328, -82.684025);
        mMap.addMarker(new MarkerOptions().position(madison).title("Madison").snippet("To find out which region you're in, tap the circle below:"));

        LatLng buncombe = new LatLng(35.593138, -82.475276);
        mMap.addMarker(new MarkerOptions().position(buncombe).title("Buncombe").snippet("To find out which region you're in, tap the circle below:"));

        LatLng haywood = new LatLng(35.624394, -82.993161);
        mMap.addMarker(new MarkerOptions().position(haywood).title("Haywood").snippet("To find out which region you're in, tap the circle below:"));

        LatLng henderson = new LatLng(35.318728, -82.4609534);
        mMap.addMarker(new MarkerOptions().position(henderson).title("Henderson").snippet("To find out which region you're in, tap the circle below:"));

        LatLng transylvania = new LatLng(35.219053, -82.777858);
        mMap.addMarker(new MarkerOptions().position(transylvania).title("Transylvania").snippet("To find out which region you're in, tap the circle below:"));

        LatLng graham = new LatLng(35.322866, -83.807399);
        mMap.addMarker(new MarkerOptions().position(graham).title("Graham").snippet("To find out which region you're in, tap the circle below:"));

        LatLng cherokee = new LatLng(35.477057, -83.320586);
        mMap.addMarker(new MarkerOptions().position(cherokee).title("Cherokee").snippet("To find out which region you're in, tap the circle below:"));

        LatLng clay = new LatLng(35.096400, -83.719914);
        mMap.addMarker(new MarkerOptions().position(clay).title("Clay").snippet("To find out which region you're in, tap the circle below:"));

        LatLng macon = new LatLng(35.196878, -83.37151);
        mMap.addMarker(new MarkerOptions().position(macon).title("Macon").snippet("To find out which region you're in, tap the circle below:"));

        LatLng swain = new LatLng(35.432896, -83.464355);
        mMap.addMarker(new MarkerOptions().position(swain).title("Swain").snippet("To find out which region you're in, tap the circle below:"));

        LatLng jackson = new LatLng(35.373711, -83.22598);
        mMap.addMarker(new MarkerOptions().position(jackson).title("Jackson").snippet("To find out which region you're in, tap the circle below:"));

        // pan the camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ashe));

        // end of map targets



        // start of clickable circles

        //alleghany
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(36.494084, -81.119608)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c1) {
                //System.out.println("______");
            }
        });

        //ashe
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(36.433967, -81.471839)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c2) {
                //System.out.println("______");
            }
        });


        //watauga
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(36.194182, -81.734942)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c3) {
                //System.out.println("______");
            }
        });

        //avery
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(36.119841, -81.909826)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c4) {
                //System.out.println("______");
            }
        });

        //mitchell
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(36.027776, -82.149605)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c5) {
                //System.out.println("______");
            }
        });

        //yancey
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.888897, -82.345189)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c6) {
                //System.out.println("______");
            }
        });

        //mcdowell
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.698440, -82.08429)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c7) {
                //System.out.println("______");
            }
        });

        //madison
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.797328, -82.684025)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c8) {
                //System.out.println("______");
            }
        });

        //buncombe
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.593138, -82.475276)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c9) {
                //System.out.println("______");
            }
        });

        //haywood
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.624394, -82.993161)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c10) {
                //System.out.println("______");
            }
        });

        //henderson
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.318728, -82.4609534)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c11) {
                //System.out.println("______");
            }
        });

        //transylvania
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.219053, -82.777858)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c12) {
                //System.out.println("______");
            }
        });

        //graham
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.322866, -83.807399)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c13) {
                //System.out.println("______");
            }
        });

        //cherokee
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.477057, -83.320586)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c14) {
                //System.out.println("______");
            }
        });

        //clay
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.096400, -83.719914)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c15) {
                //System.out.println("______");
            }
        });

        //macon
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.196878, -83.37151)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c16) {
                //System.out.println("______");
            }
        });

        //swain
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.432896, -83.464355)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c17) {
                //System.out.println("______");
            }
        });

        //jackson
        circle = mMap.addCircle(new CircleOptions().center(new LatLng(35.373711, -83.22598)).radius(7000).fillColor(Color.argb(128, 255, 0, 0)).clickable(true));

        mMap.setOnCircleClickListener(new GoogleMap.OnCircleClickListener() {
            public void onCircleClick(Circle c18) {
                //System.out.println("______");
            }
        });


    }
}
