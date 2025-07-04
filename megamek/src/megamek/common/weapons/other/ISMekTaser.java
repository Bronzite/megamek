/*
 * MegaMek - Copyright (C) 2004, 2005 Ben Mazur (bmazur@sev.org)
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * for more details.
 */
package megamek.common.weapons.other;

import megamek.common.AmmoType;
import megamek.common.Game;
import megamek.common.SimpleTechLevel;
import megamek.common.ToHitData;
import megamek.common.actions.WeaponAttackAction;
import megamek.common.alphaStrike.AlphaStrikeElement;
import megamek.common.weapons.AmmoWeapon;
import megamek.common.weapons.AttackHandler;
import megamek.common.weapons.MekTaserHandler;
import megamek.server.totalwarfare.TWGameManager;

/**
 * @author Jason Tighe
 */
public class ISMekTaser extends AmmoWeapon {
    private static final long serialVersionUID = 4393086562754363816L;

    public ISMekTaser() {
        super();
        // CHECKSTYLE IGNORE ForbiddenWords FOR 4 LINES
        name = "BattleMech Taser";
        setInternalName("Mek Taser");
        addLookupName("ISMekTaser");
        addLookupName("ISBattleMechTaser");
        heat = 6;
        rackSize = 1;
        damage = 1;
        ammoType = AmmoType.AmmoTypeEnum.TASER;
        shortRange = 1;
        mediumRange = 2;
        longRange = 4;
        extremeRange = 6;
        bv = 40;
        toHitModifier = 1;
        cost = 200000;
        tonnage = 4;
        criticals = 3;
        explosionDamage = 6;
        explosive = true;
        flags = flags.or(F_MEK_WEAPON).or(F_BALLISTIC).or(F_DIRECT_FIRE)
                .or(F_TASER).or(F_TANK_WEAPON);
        rulesRefs = "346, TO";
        techAdvancement.setTechBase(TechBase.IS)
                .setTechRating(TechRating.E)
                .setAvailability(AvailabilityValue.X, AvailabilityValue.X, AvailabilityValue.F, AvailabilityValue.E)
                .setISAdvancement(3065, 3084)
                .setPrototypeFactions(Faction.FS)
                .setProductionFactions(Faction.FS)
                .setStaticTechLevel(SimpleTechLevel.EXPERIMENTAL);
    }

    @Override
    protected AttackHandler getCorrectHandler(ToHitData toHit, WeaponAttackAction waa, Game game,
                                              TWGameManager manager) {
        return new MekTaserHandler(toHit, waa, game, manager);
    }

    @Override
    public double getBattleForceDamage(int range) {
        return (range == AlphaStrikeElement.SHORT_RANGE) ? 0.1 : 0;
    }
}
