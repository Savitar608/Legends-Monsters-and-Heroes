package com.legends.model;

import com.legends.io.Output;

public class FireSpell extends Spell {
    public FireSpell(String name, int cost, int requiredLevel, int damage, int manaCost) {
        super(name, cost, requiredLevel, damage, manaCost);
    }

    @Override
    public void applyEffect(Monster target, Output output) {
        int currentDefense = target.getDefense();
        int reduction = (int) (currentDefense * 0.1); // Reduce defense by 10%
        target.setDefense(currentDefense - reduction);
        if (output != null) output.println(target.getName() + "'s defense was reduced by " + reduction + "!");
    }

    @Override
    public String getEffectDescription() {
        return "Reduces target's defense";
    }
}
