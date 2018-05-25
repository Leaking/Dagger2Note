package com.quinn.dagger2note.lesson3;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

@Module
public class ParentModule {

    private Context context;

    public ParentModule(Context context) {
        this.context = context;
    }

    @Provides
    SharedPreferences get() {
        return context.getSharedPreferences("sp_custom", Context.MODE_PRIVATE);
    }

}
