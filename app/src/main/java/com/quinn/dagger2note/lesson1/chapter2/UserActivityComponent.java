package com.quinn.dagger2note.lesson1.chapter2;

import dagger.Component;

@Component
public interface UserActivityComponent {

    public void inject(UserActivity userActivity);

}
