package com.quinn.dagger2note.lesson1.chapter1;

import dagger.Component;

@Component
public interface UserActivityComponent {

    void inject (UserActivity factoryActivity);

    Folder get();
}
