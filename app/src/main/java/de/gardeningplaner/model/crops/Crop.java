package de.gardeningplaner.model.crops;

public abstract class Crop {
    private RootLevel rootLevel;
    private int extend;
    private NutrientNeeds nutrition;
    private String name;

    protected Crop(RootLevel rootLevel, int extend, NutrientNeeds nutrition, String name) {
        this.rootLevel = rootLevel;
        this.extend = extend;
        this.nutrition = nutrition;
        this.name = name;
    }

    public RootLevel getRootLevel() {
        return rootLevel;
    }

    public int getExtend() {
        return extend;
    }

    public NutrientNeeds getNutrientNeeds() {
        return nutrition;
    }

    public String getName() {
        return name;
    }
}
