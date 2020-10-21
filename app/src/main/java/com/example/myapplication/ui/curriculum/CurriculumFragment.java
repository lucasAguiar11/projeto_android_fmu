package com.example.myapplication.ui.curriculum;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import static android.R.*;
import static android.R.layout.simple_list_item_1;

public class CurriculumFragment extends Fragment {

    ArrayList<CurriculumViewModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.fragment_curriculum, container, false);

        listView=(ListView)root.findViewById(R.id.list);


        dataModels= new ArrayList<>();

        dataModels.add(new CurriculumViewModel("Apple Pie", "Android 1.0", "1","September 23, 2008"));
        dataModels.add(new CurriculumViewModel("Banana Bread", "Android 1.1", "2","February 9, 2009"));
        dataModels.add(new CurriculumViewModel("Cupcake", "Android 1.5", "3","April 27, 2009"));
        dataModels.add(new CurriculumViewModel("Donut","Android 1.6","4","September 15, 2009"));
        dataModels.add(new CurriculumViewModel("Eclair", "Android 2.0", "5","October 26, 2009"));
        dataModels.add(new CurriculumViewModel("Froyo", "Android 2.2", "8","May 20, 2010"));
        dataModels.add(new CurriculumViewModel("Gingerbread", "Android 2.3", "9","December 6, 2010"));
        dataModels.add(new CurriculumViewModel("Honeycomb","Android 3.0","11","February 22, 2011"));
        dataModels.add(new CurriculumViewModel("Ice Cream Sandwich", "Android 4.0", "14","October 18, 2011"));
        dataModels.add(new CurriculumViewModel("Jelly Bean", "Android 4.2", "16","July 9, 2012"));
        dataModels.add(new CurriculumViewModel("Kitkat", "Android 4.4", "19","October 31, 2013"));
        dataModels.add(new CurriculumViewModel("Lollipop","Android 5.0","21","November 12, 2014"));
        dataModels.add(new CurriculumViewModel("Marshmallow", "Android 6.0", "23","October 5, 2015"));

        adapter= new CustomAdapter(dataModels, root.getContext());

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                CurriculumViewModel dataModel= dataModels.get(position);

                Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getType()+" API: "+dataModel.getVersion_number(), Snackbar.LENGTH_LONG)
                        .setAction("No action", null).show();
            }
        });

        return root;
    }
}