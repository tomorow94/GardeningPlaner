package de.gardeningplanner.model;

import org.apache.commons.collections4.map.MultiKeyMap;

import de.gardeningplanner.model.crops.Aubergine;
import de.gardeningplanner.model.crops.Beetroot;
import de.gardeningplanner.model.crops.BushBean;
import de.gardeningplanner.model.crops.Cabbage;
import de.gardeningplanner.model.crops.Carrot;
import de.gardeningplanner.model.crops.Celery;
import de.gardeningplanner.model.crops.Chard;
import de.gardeningplanner.model.crops.ChineseCabbage;
import de.gardeningplanner.model.crops.Crop;
import de.gardeningplanner.model.crops.CropTolerance;
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
import de.gardeningplanner.model.crops.Spinach;
import de.gardeningplanner.model.crops.Strawberry;
import de.gardeningplanner.model.crops.Zucchini;

public class MixedCultureEvaluator {

    private Object[] crops;

    private MultiKeyMap toleranceMap = new MultiKeyMap();


    public MixedCultureEvaluator(){

        crops = new CropList().get().toArray();
        toleranceMap.put(new Aubergine(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Cabbage(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Aubergine(), new Carrot(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new Aubergine(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Lettuce(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Aubergine(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Spinach(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Aubergine(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Aubergine(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Beetroot(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new BushBean(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Beetroot(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Carrot(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Beetroot(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Chard(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new Beetroot(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Cucumber(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Beetroot(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Fennel(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Beetroot(), new Garlic(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Beetroot(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Kohlrabi(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Beetroot(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Leek(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new Beetroot(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Onion(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Beetroot(), new Pea(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Beetroot(), new Potato(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new Beetroot(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Beetroot(), new Spinach(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new Beetroot(), new Strawberry(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new Beetroot(), new Zucchini(), CropTolerance.SUPPORTIVE);

        toleranceMap.put(new BushBean(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new BushBean(), new Beetroot(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new BushBean(), new Cabbage(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new BushBean(), new Celery(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Chard(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new ChineseCabbage(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Cucumber(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new BushBean(), new Fennel(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new BushBean(), new Garlic(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new BushBean(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new BushBean(), new Kohlrabi(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new BushBean(), new Leek(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new BushBean(), new Lettuce(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Onion(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new BushBean(), new Pea(), CropTolerance.OBSTRUCTIVE);
        toleranceMap.put(new BushBean(), new Potato(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Radish(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Rhubarb(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Spinach(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Strawberry(), CropTolerance.SUPPORTIVE);
        toleranceMap.put(new BushBean(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Cabbage(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cabbage(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Carrot(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Carrot(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Celery(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Celery(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Chard(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Chard(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new ChineseCabbage(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new ChineseCabbage(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Cucumber(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Cucumber(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Endive(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Endive(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Fennel(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Fennel(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Garlic(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Garlic(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Horseradish(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Horseradish(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Kohlrabi(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Kohlrabi(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new LambsLettuce(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new LambsLettuce(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Leek(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Leek(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Lettuce(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Lettuce(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Onion(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Onion(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Pea(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Pea(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Potato(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Potato(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Radish(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Radish(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Rhubarb(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Rhubarb(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Spinach(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Spinach(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Strawberry(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Strawberry(), new Zucchini(), CropTolerance.NEUTRAL);

        toleranceMap.put(new Zucchini(), new Aubergine(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Beetroot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new BushBean(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Cabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Carrot(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Celery(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Chard(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new ChineseCabbage(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Cucumber(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Endive(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Fennel(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Garlic(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Horseradish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Kohlrabi(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new LambsLettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Leek(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Lettuce(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Onion(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Pea(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Potato(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Radish(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Rhubarb(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Spinach(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Strawberry(), CropTolerance.NEUTRAL);
        toleranceMap.put(new Zucchini(), new Zucchini(), CropTolerance.NEUTRAL);
    }

    public CropTolerance evaluateTolerance(Crop crop1, Crop crop2){

        if (crop1.equals(crops[0])){
            return evaluateAubergine(crop2);
        }

        if (crop1.equals(crops[1])){
            return evaluateBushBean(crop2);
        }

        if (crop1.equals(crops[2])){
            return evaluateChineseCabbage(crop2);
        }

        if (crop1.equals(crops[3])){
            return evaluateEndive(crop2);
        }

        if (crop1.equals(crops[4])){
            return evaluatePea(crop2);
        }

        if (crop1.equals(crops[5])){
            return evaluateStrawberry(crop2);
        }

        if (crop1.equals(crops[6])){
            return evaluateLambsLettuce(crop2);
        }

        if (crop1.equals(crops[7])){
            return evaluateFennel(crop2);
        }

        if (crop1.equals(crops[8])){
            return evaluateCucumber(crop2);
        }

        if (crop1.equals(crops[9])){
            return evaluatePotato(crop2);
        }

        if (crop1.equals(crops[10])){
            return evaluateGarlic(crop2);
        }

        if (crop1.equals(crops[11])){
            return evaluateCabbage(crop2);
        }

        if (crop1.equals(crops[12])){
            return evaluateKohlrabi(crop2);
        }

        if (crop1.equals(crops[13])){
            return evaluateLettuce(crop2);
        }

        if (crop1.equals(crops[14])){
            return evaluateLeek(crop2);
        }

        if (crop1.equals(crops[15])){
            return evaluateChard(crop2);
        }

        if (crop1.equals(crops[16])){
            return evaluateHorseradish(crop2);
        }

        if (crop1.equals(crops[17])){
            return evaluateCarrot(crop2);
        }

        if (crop1.equals(crops[18])){
            return evaluateRadish(crop2);
        }

        if (crop1.equals(crops[19])){
            return evaluateRhubarb(crop2);
        }

        if (crop1.equals(crops[20])){
            return evaluateBeetroot(crop2);
        }

        if (crop1.equals(crops[21])){
            return evaluateCelery(crop2);
        }

        if (crop1.equals(crops[22])){
            return evaluateSpinach(crop2);
        }

        if (crop1.equals(crops[23])){
            return evaluateRunnerBeans(crop2);
        }

        if (crop1.equals(crops[24])){
            return evaluateZucchini(crop2);
        }

        if (crop1.equals(crops[25])){
            return evaluateOnion(crop2);
        }

        return CropTolerance.NEUTRAL; //default
    }

    private CropTolerance evaluateAubergine(Crop crop2) {
        if(crop2.equals(crops[11])
                || crop2.equals(crops[13])
                || crop2.equals(crops[22])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[9])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateBeetroot(Crop crop2) {
        if(crop2.equals(crops[1])
                || crop2.equals(crops[4])
                || crop2.equals(crops[5])
                || crop2.equals(crops[8])
                || crop2.equals(crops[10])
                || crop2.equals(crops[12])
                || crop2.equals(crops[24])
                || crop2.equals(crops[25])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[9])
                || crop2.equals(crops[14])
                || crop2.equals(crops[15])
                || crop2.equals(crops[22])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateBushBean(Crop crop2) {
        if(crop2.equals(crops[2])
                || crop2.equals(crops[5])
                || crop2.equals(crops[8])
                || crop2.equals(crops[9])
                || crop2.equals(crops[11])
                || crop2.equals(crops[12])
                || crop2.equals(crops[13])
                || crop2.equals(crops[15])
                || crop2.equals(crops[18])
                || crop2.equals(crops[19])
                || crop2.equals(crops[20])
                || crop2.equals(crops[21])
                || crop2.equals(crops[22])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[4])
                || crop2.equals(crops[7])
                || crop2.equals(crops[10])
                || crop2.equals(crops[14])
                || crop2.equals(crops[23])
                || crop2.equals(crops[25])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateCabbage(Crop crop2) {
        if(crop2.equals(crops[0])
                || crop2.equals(crops[1])
                || crop2.equals(crops[3])
                || crop2.equals(crops[4])
                || crop2.equals(crops[5])
                || crop2.equals(crops[6])
                || crop2.equals(crops[8])
                || crop2.equals(crops[13])
                || crop2.equals(crops[14])
                || crop2.equals(crops[18])
                || crop2.equals(crops[19])
                || crop2.equals(crops[21])
                || crop2.equals(crops[22])
                || crop2.equals(crops[23])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[2])
                || crop2.equals(crops[10])
                || crop2.equals(crops[11])
                || crop2.equals(crops[12])
                || crop2.equals(crops[25])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateCarrot(Crop crop2) {
        if(crop2.equals(crops[2])
                || crop2.equals(crops[4])
                || crop2.equals(crops[10])
                || crop2.equals(crops[14])
                || crop2.equals(crops[15])
                || crop2.equals(crops[18])
                || crop2.equals(crops[25])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[21])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateChard(Crop crop2) {
        if(crop2.equals(crops[1])
                || crop2.equals(crops[11])
                || crop2.equals(crops[17])
                || crop2.equals(crops[18])
                || crop2.equals(crops[25])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[20])
                || crop2.equals(crops[22])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateChineseCabbage(Crop crop2) {
        if(crop2.equals(crops[1])
                || crop2.equals(crops[4])
                || crop2.equals(crops[17])
                || crop2.equals(crops[22])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[11])
                || crop2.equals(crops[14])
                || crop2.equals(crops[18])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateCelery(Crop crop2) {
        if(crop2.equals(crops[1])
                || crop2.equals(crops[8])
                || crop2.equals(crops[11])
                || crop2.equals(crops[12])
                || crop2.equals(crops[14])
                || crop2.equals(crops[22])
                || crop2.equals(crops[23])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[9])
                || crop2.equals(crops[17])
                || crop2.equals(crops[21])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateCucumber(Crop crop2) {
        if(crop2.equals(crops[2])
                || crop2.equals(crops[7])
                || crop2.equals(crops[11])
                || crop2.equals(crops[13])
                || crop2.equals(crops[14])
                || crop2.equals(crops[20])
                || crop2.equals(crops[21])
                || crop2.equals(crops[23])
                || crop2.equals(crops[25])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[9])
                || crop2.equals(crops[18])
                || crop2.equals(crops[24])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateEndive(Crop crop2) {
        if (crop2.equals(crops[7])
                || crop2.equals(crops[11])
                || crop2.equals(crops[14])
                || crop2.equals(crops[23])) {
            return CropTolerance.SUPPORTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateFennel(Crop crop2) {
        if(crop2.equals(crops[3])
                || crop2.equals(crops[4])
                || crop2.equals(crops[6])
                || crop2.equals(crops[8])
                || crop2.equals(crops[13])
                || crop2.equals(crops[20])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[1])
                || crop2.equals(crops[23])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateGarlic(Crop crop2) {
        if(crop2.equals(crops[5])
                || crop2.equals(crops[6])
                || crop2.equals(crops[8])
                || crop2.equals(crops[14])
                || crop2.equals(crops[17])
                || crop2.equals(crops[20])
                || crop2.equals(crops[25])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[1])
                || crop2.equals(crops[4])
                || crop2.equals(crops[11])
                || crop2.equals(crops[23])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateHorseradish(Crop crop2) {
        if (crop2.equals(crops[9])){
            return CropTolerance.SUPPORTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateKohlrabi(Crop crop2) {
        if(crop2.equals(crops[1])
                || crop2.equals(crops[4])
                || crop2.equals(crops[9])
                || crop2.equals(crops[13])
                || crop2.equals(crops[14])
                || crop2.equals(crops[18])
                || crop2.equals(crops[20])
                || crop2.equals(crops[21])
                || crop2.equals(crops[22])
                || crop2.equals(crops[23])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[11])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateLambsLettuce(Crop crop2) {
        if ((crop2.equals(crops[5])
                || crop2.equals(crops[7])
                || crop2.equals(crops[11])
                || crop2.equals(crops[12])
                || crop2.equals(crops[14])
                || crop2.equals(crops[18])
                || crop2.equals(crops[22])
                || crop2.equals(crops[23])
                || crop2.equals(crops[25]))){
            return CropTolerance.SUPPORTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateLeek(Crop crop2) {
        if(crop2.equals(crops[3])
                || crop2.equals(crops[5])
                || crop2.equals(crops[6])
                || crop2.equals(crops[8])
                || crop2.equals(crops[10])
                || crop2.equals(crops[12])
                || crop2.equals(crops[17])
                || crop2.equals(crops[21])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[1])
                || crop2.equals(crops[2])
                || crop2.equals(crops[4])
                || crop2.equals(crops[20])
                || crop2.equals(crops[23])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateLettuce(Crop crop2) {
        if ((crop2.equals(crops[0])
                || crop2.equals(crops[1])
                || crop2.equals(crops[4])
                || crop2.equals(crops[5])
                || crop2.equals(crops[7])
                || crop2.equals(crops[8])
                || crop2.equals(crops[11])
                || crop2.equals(crops[12])
                || crop2.equals(crops[14])
                || crop2.equals(crops[17])
                || crop2.equals(crops[18])
                || crop2.equals(crops[19])
                || crop2.equals(crops[23])
                || crop2.equals(crops[25]))){
            return CropTolerance.SUPPORTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateOnion(Crop crop2) {
        if(crop2.equals(crops[5])
                || crop2.equals(crops[6])
                || crop2.equals(crops[8])
                || crop2.equals(crops[10])
                || crop2.equals(crops[17])
                || crop2.equals(crops[20])
                || crop2.equals(crops[24])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[1])
                || crop2.equals(crops[4])
                || crop2.equals(crops[9])
                || crop2.equals(crops[11])
                || crop2.equals(crops[18])
                || crop2.equals(crops[23])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluatePea(Crop crop2) {
        if(crop2.equals(crops[2])
                || crop2.equals(crops[7])
                || crop2.equals(crops[11])
                || crop2.equals(crops[12])
                || crop2.equals(crops[13])
                || crop2.equals(crops[17])
                || crop2.equals(crops[18])
                || crop2.equals(crops[20])
                || crop2.equals(crops[22])
                || crop2.equals(crops[24])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[1])
                || crop2.equals(crops[9])
                || crop2.equals(crops[10])
                || crop2.equals(crops[14])
                || crop2.equals(crops[23])
                || crop2.equals(crops[25])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluatePotato(Crop crop2) {
        if(crop2.equals(crops[1])
                || crop2.equals(crops[12])
                || crop2.equals(crops[16])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[0])
                || crop2.equals(crops[4])
                || crop2.equals(crops[8])
                || crop2.equals(crops[17])
                || crop2.equals(crops[20])
                || crop2.equals(crops[21])
                || crop2.equals(crops[25])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateRadish(Crop crop2) {
        if(crop2.equals(crops[1])
                || crop2.equals(crops[4])
                || crop2.equals(crops[5])
                || crop2.equals(crops[6])
                || crop2.equals(crops[11])
                || crop2.equals(crops[12])
                || crop2.equals(crops[13])
                || crop2.equals(crops[15])
                || crop2.equals(crops[17])
                || crop2.equals(crops[22])
                || crop2.equals(crops[23])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[2])
                || crop2.equals(crops[8])
                || crop2.equals(crops[25])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateRhubarb(Crop crop2) {
        if ((crop2.equals(crops[1])
                || crop2.equals(crops[11])
                || crop2.equals(crops[13])
                || crop2.equals(crops[22]))) {
            return CropTolerance.SUPPORTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateRunnerBeans(Crop crop2) {
        if(crop2.equals(crops[3])
                || crop2.equals(crops[6])
                || crop2.equals(crops[8])
                || crop2.equals(crops[18])
                || crop2.equals(crops[19])
                || crop2.equals(crops[21])
                || crop2.equals(crops[22])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[1])
                || crop2.equals(crops[4])
                || crop2.equals(crops[7])
                || crop2.equals(crops[10])
                || crop2.equals(crops[14])
                || crop2.equals(crops[25])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateSpinach(Crop crop2) {
        if(crop2.equals(crops[0])
                || crop2.equals(crops[1])
                || crop2.equals(crops[2])
                || crop2.equals(crops[4])
                || crop2.equals(crops[5])
                || crop2.equals(crops[6])
                || crop2.equals(crops[9])
                || crop2.equals(crops[11])
                || crop2.equals(crops[12])
                || crop2.equals(crops[13])
                || crop2.equals(crops[18])
                || crop2.equals(crops[19])
                || crop2.equals(crops[21])
                || crop2.equals(crops[23])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[15])
                || crop2.equals(crops[20])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateStrawberry(Crop crop2) {
        if ((crop2.equals(crops[1])
                || crop2.equals(crops[6])
                || crop2.equals(crops[10])
                || crop2.equals(crops[11])
                || crop2.equals(crops[13])
                || crop2.equals(crops[14])
                || crop2.equals(crops[18])
                || crop2.equals(crops[20])
                || crop2.equals(crops[22])
                || crop2.equals(crops[25]))) {
            return CropTolerance.SUPPORTIVE;
        }
        return CropTolerance.NEUTRAL;
    }

    private CropTolerance evaluateZucchini(Crop crop2) {
        if(crop2.equals(crops[4])
                || crop2.equals(crops[20])
                || crop2.equals(crops[25])){
            return CropTolerance.SUPPORTIVE;
        }
        if(crop2.equals(crops[8])){
            return CropTolerance.OBSTRUCTIVE;
        }
        return CropTolerance.NEUTRAL;
    }
}