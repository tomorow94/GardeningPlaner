package de.gardeningplaner.model;

import java.util.HashSet;
import java.util.Set;

import de.gardeningplaner.model.crops.Aubergine;
import de.gardeningplaner.model.crops.Beetroot;
import de.gardeningplaner.model.crops.BushBean;
import de.gardeningplaner.model.crops.Cabbage;
import de.gardeningplaner.model.crops.Carrot;
import de.gardeningplaner.model.crops.Celery;
import de.gardeningplaner.model.crops.Chard;
import de.gardeningplaner.model.crops.ChineseCabbage;
import de.gardeningplaner.model.crops.Crop;
import de.gardeningplaner.model.crops.Cucumber;
import de.gardeningplaner.model.crops.Endive;
import de.gardeningplaner.model.crops.Fennel;
import de.gardeningplaner.model.crops.Garlic;
import de.gardeningplaner.model.crops.Horseradish;
import de.gardeningplaner.model.crops.Kohlrabi;
import de.gardeningplaner.model.crops.LambsLettuce;
import de.gardeningplaner.model.crops.Leek;
import de.gardeningplaner.model.crops.Lettuce;
import de.gardeningplaner.model.crops.Onion;
import de.gardeningplaner.model.crops.Pea;
import de.gardeningplaner.model.crops.Potato;
import de.gardeningplaner.model.crops.Radish;
import de.gardeningplaner.model.crops.Rhubarb;
import de.gardeningplaner.model.crops.RunnerBeans;
import de.gardeningplaner.model.crops.Spinach;
import de.gardeningplaner.model.crops.Strawberry;
import de.gardeningplaner.model.crops.Zucchini;

public class CropSelection {
    private HashSet<Crop> cropsHashSet;

    public CropSelection() {
        this.cropsHashSet = new HashSet<>();
        this.cropsHashSet.add(new Aubergine());
        this.cropsHashSet.add(new BushBean());
        this.cropsHashSet.add(new ChineseCabbage());
        this.cropsHashSet.add(new Endive());
        this.cropsHashSet.add(new Pea());
        this.cropsHashSet.add(new Strawberry());
        this.cropsHashSet.add(new LambsLettuce());
        this.cropsHashSet.add(new Fennel());
        this.cropsHashSet.add(new Cucumber());
        this.cropsHashSet.add(new Potato());
        this.cropsHashSet.add(new Garlic());
        this.cropsHashSet.add(new Cabbage());
        this.cropsHashSet.add(new Kohlrabi());
        this.cropsHashSet.add(new Lettuce());
        this.cropsHashSet.add(new Leek());
        this.cropsHashSet.add(new Chard());
        this.cropsHashSet.add(new Horseradish());
        this.cropsHashSet.add(new Carrot());
        this.cropsHashSet.add(new Radish());
        this.cropsHashSet.add(new Rhubarb());
        this.cropsHashSet.add(new Beetroot());
        this.cropsHashSet.add(new Celery());
        this.cropsHashSet.add(new Spinach());
        this.cropsHashSet.add(new RunnerBeans());
        this.cropsHashSet.add(new Zucchini());
        this.cropsHashSet.add(new Onion());
    }

    public Set<Crop> getCropsHashSet() {
        return cropsHashSet;
    }
}
