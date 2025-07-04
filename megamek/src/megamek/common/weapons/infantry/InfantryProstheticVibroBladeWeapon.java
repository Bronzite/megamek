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
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;

/**
 * @author Dave Nawton
 * @since Sep 7, 2005
 */
public class InfantryProstheticVibroBladeWeapon extends InfantryWeapon {
    private static final long serialVersionUID = -3164871600230559641L;

    public InfantryProstheticVibroBladeWeapon() {
        super();

        name = "Prosthetic Vibro Blade";
        setInternalName(name);
        addLookupName("ProstheticVibroBlade");
        ammoType = AmmoType.AmmoTypeEnum.NA;
        cost = 1000;
        bv = 0.0;
        flags = flags.or(F_NO_FIRES).or(F_INF_POINT_BLANK).or(F_INF_ARCHAIC);
        infantryDamage = 0.14;
        infantryRange = 0;
		// Rating and Dates not available below is compiled from Specific
		// Weapons in IO blended with the rating for the limb itself
        rulesRefs = "84, IO";
        techAdvancement.setTechBase(TechBase.ALL)
                .setIntroLevel(false)
                .setUnofficial(false)
                .setTechRating(TechRating.E)
                .setAvailability(AvailabilityValue.F, AvailabilityValue.E, AvailabilityValue.D, AvailabilityValue.D)
                .setISAdvancement(2398, DATE_NONE, DATE_NONE, DATE_NONE, DATE_NONE)
                .setISApproximate(true, false, false, false, false)
                .setClanAdvancement(2398, DATE_NONE, DATE_NONE, DATE_NONE, DATE_NONE)
                .setClanApproximate(true, false, false, false, false);
    }
}
