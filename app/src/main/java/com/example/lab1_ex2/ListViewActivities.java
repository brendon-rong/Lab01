package com.example.lab1_ex2;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A fragment representing a list of Items.
 */
public class ListViewActivities extends Fragment {

    String[] activity = new String[]{"AIActivity","VRActivity"};
    ListView listView;

    public ListViewActivities() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list_view_activities, container, false);

        final ListView listView = view.findViewById(R.id.listView);

        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                String item = (String) listView.getItemAtPosition(position);
                String tag = "poop";
                Log.d(tag, item + " selected");

                if(item.equalsIgnoreCase("AIActivity")){

                }
            }
        });
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, activity);

        listView.setAdapter(adapter);
        return view;
    }
}
