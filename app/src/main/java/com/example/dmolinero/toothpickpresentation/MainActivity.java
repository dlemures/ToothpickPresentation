package com.example.dmolinero.toothpickpresentation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import toothpick.Scope;
import toothpick.Toothpick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SnowConeMachine snowConeMachine = new SnowConeMachine();
        SnowCone snowCone = snowConeMachine.makeSnowCone();
        AppleConeMachineModule a = new AppleConeMachineModule();
        LemonConeMachineModule b = new LemonConeMachineModule();


        Scope lemonScope = Toothpick.openScope("lemon");
        lemonScope.installModules(new LemonConeMachineModule());
        Toothpick.inject(this, lemonScope);

        Scope appleScope = Toothpick.openScope("apple");
        lemonScope.installModules(new AppleConeMachineModule());
        Toothpick.inject(this, appleScope);
    }
}
