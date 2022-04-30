package com.company;

public class StateSediento implements StateTamagochi{
    @Override
    public StateTamagochi comer() {
        return new StateTriste();
    }

    @Override
    public StateTamagochi beber() {
        return new StateFeliz();
    }

    @Override
    public StateTamagochi recibirMimos() {
        return this;
    }
}
