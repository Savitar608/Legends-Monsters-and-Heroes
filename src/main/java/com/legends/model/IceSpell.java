package com.legends.model;

import com.legends.io.Output;

public class IceSpell extends Spell {
    public IceSpell(String name, int cost, int requiredLevel, int damage, int manaCost) {
        super(name, cost, requiredLevel, damage, manaCost);
    }

    @Override
    public void applyEffect(Monster target, Output output) {
        int currentDamage = target.getDamage();
        int reduction = (int) (currentDamage * 0.1); // Reduce damage by 10%
        target.setDamage(currentDamage - reduction);
        if (output != null) output.println(target.getName() + "'s damage was reduced by " + reduction + "!");
    }

    @Override
    public String getEffectDescription() {
        return "Reduces target's damage";
    }
}
