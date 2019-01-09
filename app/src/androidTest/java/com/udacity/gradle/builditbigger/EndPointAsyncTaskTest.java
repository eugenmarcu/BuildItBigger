package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import com.example.android.javajokelib.JavaJoke;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    private String joke;

    @Test
    public void testForJokes() {
        //Make sure to deploy server locally before running tests
        EndPointAsyncTask endPointAsyncTask = new EndPointAsyncTask(new EndPointAsyncTask.OnRequestFinish() {
            @Override
            public void onFinish(String s) {

            }
        });
        endPointAsyncTask.execute();
        try {
            Thread.sleep(10000);
            joke = endPointAsyncTask.get();
            assertNotNull(JavaJoke.getJoke(), joke);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
