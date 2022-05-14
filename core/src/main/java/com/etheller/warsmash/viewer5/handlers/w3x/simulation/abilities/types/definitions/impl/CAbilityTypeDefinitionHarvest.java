package com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilities.types.definitions.impl;

import java.util.EnumSet;
import java.util.List;

import com.etheller.warsmash.units.manager.MutableObjectData.MutableGameObject;
import com.etheller.warsmash.util.War3ID;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilities.types.CAbilityType;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilities.types.definitions.CAbilityTypeDefinition;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilities.types.impl.CAbilityTypeHarvest;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.abilities.types.impl.CAbilityTypeHarvestLevelData;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.combat.CTargetType;

public class CAbilityTypeDefinitionHarvest extends AbstractCAbilityTypeDefinition<CAbilityTypeHarvestLevelData>
		implements CAbilityTypeDefinition {
	protected static final War3ID DAMAGE_TO_TREE = War3ID.fromString("Har1");
	protected static final War3ID LUMBER_CAPACITY = War3ID.fromString("Har2");
	protected static final War3ID GOLD_CAPACITY = War3ID.fromString("Har3");

	@Override
	protected CAbilityTypeHarvestLevelData createLevelData(final MutableGameObject abilityEditorData, final int level) {
		final String targetsAllowedAtLevelString = abilityEditorData.getFieldAsString(TARGETS_ALLOWED, level);
		final EnumSet<CTargetType> targetsAllowedAtLevel = CTargetType.parseTargetTypeSet(targetsAllowedAtLevelString);
		final int damageToTree = abilityEditorData.getFieldAsInteger(DAMAGE_TO_TREE, level);
		final int goldCapacity = abilityEditorData.getFieldAsInteger(GOLD_CAPACITY, level);
		final int lumberCapacity = abilityEditorData.getFieldAsInteger(LUMBER_CAPACITY, level);
		final float castRange = abilityEditorData.getFieldAsFloat(CAST_RANGE, level);
		final float duration = abilityEditorData.getFieldAsFloat(DURATION, level);
		return new CAbilityTypeHarvestLevelData(targetsAllowedAtLevel, damageToTree, goldCapacity, lumberCapacity,
				castRange, duration);
	}

	@Override
	protected CAbilityType<?> innerCreateAbilityType(final War3ID alias, final MutableGameObject abilityEditorData,
			final List<CAbilityTypeHarvestLevelData> levelData) {
		return new CAbilityTypeHarvest(alias, abilityEditorData.getCode(), levelData);
	}

}
