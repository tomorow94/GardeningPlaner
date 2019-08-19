package de.gardeningplanner.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import de.gardeningplanner.model.crops.Aubergine;
import de.gardeningplanner.model.crops.Beetroot;
import de.gardeningplanner.model.crops.BushBean;
import de.gardeningplanner.model.crops.Cabbage;
import de.gardeningplanner.model.crops.Carrot;
import de.gardeningplanner.model.crops.Celery;
import de.gardeningplanner.model.crops.Chard;
import de.gardeningplanner.model.crops.ChineseCabbage;
import de.gardeningplanner.model.crops.Crop;
import de.gardeningplanner.model.crops.Cucumber;
import de.gardeningplanner.model.crops.Endive;
import de.gardeningplanner.model.crops.Fennel;
import de.gardeningplanner.model.crops.Garlic;
import de.gardeningplanner.model.crops.Horseradish;
import de.gardeningplanner.model.crops.Kohlrabi;
import de.gardeningplanner.model.crops.LambsLettuce;
import de.gardeningplanner.model.crops.Leek;
import de.gardeningplanner.model.crops.Lettuce;
import de.gardeningplanner.model.crops.Onion;
import de.gardeningplanner.model.crops.Pea;
import de.gardeningplanner.model.crops.Potato;
import de.gardeningplanner.model.crops.Radish;
import de.gardeningplanner.model.crops.Rhubarb;
import de.gardeningplanner.model.crops.RunnerBeans;
import de.gardeningplanner.model.crops.Spinach;
import de.gardeningplanner.model.crops.Strawberry;
import de.gardeningplanner.model.crops.Zucchini;

public class CropList extends ArrayList implements Serializable{
    private ArrayList<Crop> cropArrayList;

    CropList() {
        this.cropArrayList = new ArrayList<>();

        this.cropArrayList.add(new Aubergine());        //0
        this.cropArrayList.add(new BushBean());         //1
        this.cropArrayList.add(new ChineseCabbage());   //2
        this.cropArrayList.add(new Endive());           //3
        this.cropArrayList.add(new Pea());              //4
        this.cropArrayList.add(new Strawberry());       //5
        this.cropArrayList.add(new LambsLettuce());     //6
        this.cropArrayList.add(new Fennel());           //7
        this.cropArrayList.add(new Cucumber());         //8
        this.cropArrayList.add(new Potato());           //9
        this.cropArrayList.add(new Garlic());           //10
        this.cropArrayList.add(new Cabbage());          //11
        this.cropArrayList.add(new Kohlrabi());         //12
        this.cropArrayList.add(new Lettuce());          //13
        this.cropArrayList.add(new Leek());             //14
        this.cropArrayList.add(new Chard());            //15
        this.cropArrayList.add(new Horseradish());      //16
        this.cropArrayList.add(new Carrot());           //17
        this.cropArrayList.add(new Radish());           //18
        this.cropArrayList.add(new Rhubarb());          //19
        this.cropArrayList.add(new Beetroot());         //20
        this.cropArrayList.add(new Celery());           //21
        this.cropArrayList.add(new Spinach());          //22
        this.cropArrayList.add(new RunnerBeans());      //23
        this.cropArrayList.add(new Zucchini());         //24
        this.cropArrayList.add(new Onion());            //25
    }

    public List<Crop> get() {
        return cropArrayList;
    }
}
