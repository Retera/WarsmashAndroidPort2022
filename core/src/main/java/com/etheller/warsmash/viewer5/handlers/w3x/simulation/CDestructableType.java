package com.etheller.warsmash.viewer5.handlers.w3x.simulation;

import java.awt.image.BufferedImage;
import java.util.EnumSet;

import com.badlogic.gdx.graphics.Pixmap;
import com.etheller.warsmash.viewer5.handlers.w3x.simulation.combat.CTargetType;

public class CDestructableType {

	private final String name;
	private final float maxLife;
	private final EnumSet<CTargetType> targetedAs;
	private final String armorType;
	private final int buildTime;
	private final Pixmap pathingPixelMap;
	private final Pixmap pathingDeathPixelMap;

	public CDestructableType(final String name, final float maxLife, final EnumSet<CTargetType> targetedAs,
							 final String armorType, final int buildTime, final Pixmap pathingPixelMap,
							 final Pixmap pathingDeathPixelMap) {
		this.name = name;
		this.maxLife = maxLife;
		this.targetedAs = targetedAs;
		this.armorType = armorType;
		this.buildTime = buildTime;
		this.pathingPixelMap = pathingPixelMap;
		this.pathingDeathPixelMap = pathingDeathPixelMap;
	}

	public String getName() {
		return this.name;
	}

	public float getMaxLife() {
		return this.maxLife;
	}

	public EnumSet<CTargetType> getTargetedAs() {
		return this.targetedAs;
	}

	public String getArmorType() {
		return this.armorType;
	}

	public int getBuildTime() {
		return this.buildTime;
	}

	public Pixmap getPathingPixelMap() {
		return this.pathingPixelMap;
	}

	public Pixmap getPathingDeathPixelMap() {
		return this.pathingDeathPixelMap;
	}
}
