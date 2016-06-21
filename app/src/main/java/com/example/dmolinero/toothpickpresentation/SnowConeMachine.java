package com.example.dmolinero.toothpickpresentation;

import javax.inject.Inject;

import toothpick.Scope;
import toothpick.Toothpick;

        public class SnowConeMachine {
            @Inject IceMachine iceMachine;
            @Inject SyrupDispenser syrupDispenser;

            public SnowConeMachine() {
                Scope scope = Toothpick.openScope("TP demo");
                Toothpick.inject(this, scope);
            }

            public SnowCone makeSnowCone() {
                SnowCone snowCone = new SnowCone();
                snowCone.addIce(iceMachine.makeIce());
                snowCone.addSyrup(syrupDispenser.dispenseSyrup());
                return snowCone;
            }
        }



