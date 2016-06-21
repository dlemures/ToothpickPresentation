package com.example.dmolinero.toothpickpresentation;

import toothpick.config.Module;

/**
 * Created by dmolinero on 6/15/16.
 */

        public class AppleConeMachineModule extends Module {

            public AppleConeMachineModule() {
                bind(SyrupDispenser.class).to(AppleSyrupDispenser.class);
            }
        }


