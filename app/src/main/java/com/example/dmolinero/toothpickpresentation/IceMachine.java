package com.example.dmolinero.toothpickpresentation;

import javax.inject.Inject;
import javax.inject.Singleton;

        @Singleton
        public class IceMachine {

            @Inject
            public IceMachine() {
            }

            public Ice makeIce() {
                return new Ice();
                //
            }
        }


