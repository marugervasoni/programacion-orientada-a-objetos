package com.company;

public class StateHambriento implements StateTamagochi{
    @Override
    public StateTamagochi comer() {
        return new StateFeliz(); //devuelvo el nuevo estado
    }

    @Override
    public StateTamagochi beber() {
        return new StateTriste();
    }

    @Override
    public StateTamagochi recibirMimos() {
        //return new StateHambriento(); --> esto no me sirve si se cuenta la cantidad de veces que se pasa por este estado

        return this; //me retorno a mi mismo, todo el objeto (no hay cambios)

    }
}
