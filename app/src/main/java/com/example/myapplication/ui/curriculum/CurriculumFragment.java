package com.example.myapplication.ui.curriculum;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
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

import com.example.myapplication.DetailCurriculum;
import com.example.myapplication.EditCompany;
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

        dataModels.add(new CurriculumViewModel("Lucas Aguiar", "Desenvolvedor C#", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Manoel Heitor Silveira", "DBA", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Heloise Sarah Evelyn Oliveira", "Desenvolvedor PHP", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Bento Thales Bryan Barbosa", "Desenvolvedor C#", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Pietra Aparecida Sales", "Desenvolvedor C#", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Marcos Eduardo Bryan Farias", "Desenvolvedor js", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Juan Victor Farias", "Desenvolvedor C#", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Luzia Teresinha Eliane Mendes", "React Native", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Rayssa Jaqueline Bianca Costa", "Desenvolvedor Java", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Miguel Rafael Mourar", "Desenvolvedor C#", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));
        dataModels.add(new CurriculumViewModel("Breno Mateus Gonçalves", "Desenvolvedor .NET", "Lorem ipsum vel auctor curabitur gravida donec vivamus congue dolor, non nec nunc ante lacus placerat duis ante sem et, vivamus consectetur aliquam vestibulum felis class pretium ut."));


        adapter= new CustomAdapter(dataModels, root.getContext());

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {

            CurriculumViewModel dataModel= dataModels.get(position);

            Intent k = new Intent(getContext(), DetailCurriculum.class);
            startActivity(k);

//            Snackbar.make(view, dataModel.getName()+"\n"+dataModel.getCargo()+" API: "+dataModel.getDesc(), Snackbar.LENGTH_LONG)
//                    .setAction("No action", null).show();
        });

        return root;
    }
}