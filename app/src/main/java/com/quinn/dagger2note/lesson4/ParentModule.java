package com.quinn.dagger2note.lesson4;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.LocationManager;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = ChildComponent.class)
public class ParentModule {

    private Context context;

    public ParentModule(Context context) {
        this.context = context;
    }

    @Provides
    SharedPreferences getSp() {
        return context.getSharedPreferences("sp_custom", Context.MODE_PRIVATE);
    }

    @Provides
    LocationManager getLocationManager(){
        return  (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
    }

}
