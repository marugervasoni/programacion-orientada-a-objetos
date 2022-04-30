package com.company;

public class StateTriste implements StateTamagochi{
    @Override
    public StateTamagochi comer() {
        return this;
    }

    @Override
    public StateTamagochi beber() {
        return this;
    }

    @Override
    public StateTamagochi recibirMimos() {
        return new StateFeliz();
    }
}
