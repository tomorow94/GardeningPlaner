package de.gardeningplaner.model;

import de.gardeningplaner.model.crops.Crop;
import de.gardeningplaner.model.crops.CropTolerance;

public class MixedCultureEvaluator {

    private Object[] crops;

    public MixedCultureEvaluator(){
        crops = new CropList().get().toArray();
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

        return CropTolerance.NUTRAL; //default
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
    }

    private CropTolerance evaluateEndive(Crop crop2) {
        if (crop2.equals(crops[7])
                || crop2.equals(crops[11])
                || crop2.equals(crops[14])
                || crop2.equals(crops[23])) {
            return CropTolerance.SUPPORTIVE;
        }
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
    }

    private CropTolerance evaluateHorseradish(Crop crop2) {
        if (crop2.equals(crops[9])){
            return CropTolerance.SUPPORTIVE;
        }
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
    }

    private CropTolerance evaluateRhubarb(Crop crop2) {
        if ((crop2.equals(crops[1])
                || crop2.equals(crops[11])
                || crop2.equals(crops[13])
                || crop2.equals(crops[22]))) {
            return CropTolerance.SUPPORTIVE;
        }
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
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
        return CropTolerance.NUTRAL;
    }
}