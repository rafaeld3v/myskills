package com.myskills;

import com.facebook.react.ReactActivity;

import android.os.Bundle; // adicionado
import org.devio.rn.splashscreen.SplashScreen; // adicionado

public class MainActivity extends ReactActivity {

  @Override
  protected String getMainComponentName() {
    return "myskills";
  }

		// adicionado
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.show(this);  
        super.onCreate(savedInstanceState);
    }
}