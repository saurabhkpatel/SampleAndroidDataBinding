package com.saurabhpatel.sampledatabinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.ObservableField;

public class User extends BaseObservable {

    public ObservableField<String> nameObservableField = new ObservableField<>();
    public ObservableField<String> f2 = new ObservableField<>();
    public ObservableField<String> f3 = new ObservableField<>();
    public ObservableField<String> f4 = new ObservableField<>();
    public ObservableField<String> f5 = new ObservableField<>();
    private String name;
    private String email;
    private String f1;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        nameObservableField.set(name);
        this.name = name;
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Bindable
    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }

    public void setF2(String f2) {
        this.f2.set(f2);
        //this.f3.set(f2);
        //this.f4.set(f2);
        //this.f5.set(f2);
    }

    public void globalChange() {
        notifyChange();
    }
}
