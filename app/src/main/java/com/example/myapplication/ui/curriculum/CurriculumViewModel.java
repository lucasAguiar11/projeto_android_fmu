package com.example.myapplication.ui.curriculum;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CurriculumViewModel extends ViewModel {

    String name;
    String cargo;
    String desc;

    public CurriculumViewModel(String name, String cargo, String desc) {
        this.name=name;
        this.cargo=cargo;
        this.desc=desc;
    }
    public String getName() {
        return name;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDesc() {
        return desc;
    }
}