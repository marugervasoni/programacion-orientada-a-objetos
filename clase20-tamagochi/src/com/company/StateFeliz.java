package com.company;

public class StateFeliz implements StateTamagochi{

//implements methods para que ya me de los override
    @Override
    public StateTamagochi comer() {
        return new StateSediento();
    }

    @Override
    public StateTamagochi beber() {
        return new StateHambriento();
    }

    @Override
    public StateTamagochi recibirMimos() {
        return this;
    }
}
