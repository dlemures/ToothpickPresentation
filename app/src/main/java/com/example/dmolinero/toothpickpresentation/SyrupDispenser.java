package com.example.dmolinero.toothpickpresentation;

import javax.inject.Inject;

    public abstract class SyrupDispenser {

        @Inject Pump pump;

        public Syrup dispenseSyrup() {
            return new Syrup();
            pump = new Pump();
            //
        }
    }


