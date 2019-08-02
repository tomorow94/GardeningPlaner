package de.GardeningPlaner.Model.Crops;

public abstract class Crop {
    private RootLevel rootLevel;
    private int extend;
    private NutriendNeeds nutrition;
    private String name;

    protected Crop(RootLevel rootLevel, int extend, NutriendNeeds nutrition, String name) {
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

    public NutriendNeeds getNutrition() {
        return nutrition;
    }

    public String getName() {
        return name;
    }
}
