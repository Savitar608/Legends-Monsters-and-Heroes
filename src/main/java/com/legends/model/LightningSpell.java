package com.legends.model;

import com.legends.io.Output;

public class LightningSpell extends Spell {
    public LightningSpell(String name, int cost, int requiredLevel, int damage, int manaCost) {
        super(name, cost, requiredLevel, damage, manaCost);
    }

    @Override
    public void applyEffect(Monster target, Output output) {
        int currentDodge = target.getDodgeChance();
        int reduction = (int) (currentDodge * 0.1); // Reduce dodge chance by 10%
        target.setDodgeChance(currentDodge - reduction);
        if (output != null) output.println(target.getName() + "'s dodge chance was reduced by " + reduction + "!");
    }

    @Override
    public String getEffectDescription() {
        return "Reduces target's dodge chance";
    }
}
