package de.gardeningplaner.model;

import java.util.ArrayList;

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

public class CropList extends ArrayList{
    private ArrayList<Crop> cropArrayList;

    public CropList() {
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

    public ArrayList<Crop> getCropArrayList() {
        return cropArrayList;
    }
}
