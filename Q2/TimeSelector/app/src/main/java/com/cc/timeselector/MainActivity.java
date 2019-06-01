package com.cc.timeselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    XCDropDownListView dropDownListViewStartDay;
    XCDropDownListView dropDownListViewStartHour;
    XCDropDownListView dropDownListViewStartMinute;

    XCDropDownListView getDropDownListViewClosingDay;
    XCDropDownListView getDropDownListViewClosingHour;
    XCDropDownListView getDropDownListViewClosingMinute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dropDownListViewStartDay = (XCDropDownListView) findViewById(R.id.drop_down_list_view1);
        dropDownListViewStartHour = (XCDropDownListView) findViewById(R.id.drop_down_list_view2);
        dropDownListViewStartMinute = (XCDropDownListView) findViewById(R.id.drop_down_list_view3);

        getDropDownListViewClosingDay = (XCDropDownListView) findViewById(R.id.drop_down_list_view4);
        getDropDownListViewClosingHour = (XCDropDownListView) findViewById(R.id.drop_down_list_view5);
        getDropDownListViewClosingMinute = (XCDropDownListView) findViewById(R.id.drop_down_list_view6);



        ArrayList<String> listDay = new ArrayList<String>();
        ArrayList<String> listHour = new ArrayList<String>();
        ArrayList<String> listMinute = new ArrayList<String>();

        listDay.add("am");
        listDay.add("pm");
        dropDownListViewStartDay.setItemsData(listDay);
        getDropDownListViewClosingDay.setItemsData(listDay);

        for (int i = 0; i < 12; i++) {
            listHour.add("i");
        }
        dropDownListViewStartHour.setItemsData(listHour);
        getDropDownListViewClosingHour.setItemsData(listHour);

        for (int i = 0; i < 60; i++) {
            listMinute.add("i");
        }
        dropDownListViewStartMinute.setItemsData(listMinute);
        getDropDownListViewClosingMinute.setItemsData(listMinute);

    }
}

