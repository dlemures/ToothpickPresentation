package com.example.dmolinero.toothpickpresentation;

import toothpick.config.Module;

/**
 * Created by dmolinero on 6/15/16.
 */

        public class LemonConeMachineModule extends Module {

            public LemonConeMachineModule() {
                bind(SyrupDispenser.class).to(LemonSyrupDispenser.class);
            }
        }


