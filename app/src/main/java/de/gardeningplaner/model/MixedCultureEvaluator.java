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
            if(crop2.equals(crops[11])
                    || crop2.equals(crops[13])
                    || crop2.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2.equals(crops[9])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1.equals(crops[1])){
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
        }

        if (crop1.equals(crops[2])){
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
        }

        if (crop1.equals(crops[3]) && (crop2.equals(crops[7])
                || crop2.equals(crops[11])
                || crop2.equals(crops[14])
                || crop2.equals(crops[23]))) {
            return CropTolerance.SUPPORTIVE;
        }

        if (crop1.equals(crops[4])){
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
        }

        if (crop1.equals(crops[5]) && (crop2.equals(crops[1])
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

        if (crop1.equals(crops[6]) && (crop2.equals(crops[5])
                || crop2.equals(crops[7])
                || crop2.equals(crops[11])
                || crop2.equals(crops[12])
                || crop2.equals(crops[14])
                || crop2.equals(crops[18])
                || crop2.equals(crops[22])
                || crop2.equals(crops[23])
                || crop2.equals(crops[25]))) {
            return CropTolerance.SUPPORTIVE;
        }

        if (crop1.equals(crops[7])){
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
        }

        if (crop1.equals(crops[8])){
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
        }

        if (crop1.equals(crops[9])){
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
        }

        if (crop1.equals(crops[10])){
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
        }

        if (crop1.equals(crops[11])){
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
        }

        if (crop1.equals(crops[12])){
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
        }

        if (crop1.equals(crops[13]) && (crop2.equals(crops[0])
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
                || crop2.equals(crops[25]))) {
            return CropTolerance.SUPPORTIVE;
        }

        if (crop1.equals(crops[14])){
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
        }

        if (crop1.equals(crops[15])){
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
        }

        if (crop1.equals(crops[16]) && crop2.equals(crops[9])) {
            return CropTolerance.SUPPORTIVE;
        }

        if (crop1.equals(crops[17])){
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
        }

        if (crop1.equals(crops[18])){
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
        }

        if (crop1.equals(crops[19]) && (crop2.equals(crops[1])
                || crop2.equals(crops[11])
                || crop2.equals(crops[13])
                || crop2.equals(crops[22]))) {
            return CropTolerance.SUPPORTIVE;
        }

        if (crop1.equals(crops[20])){
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
        }

        if (crop1.equals(crops[21])){
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
        }

        if (crop1.equals(crops[22])){
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
        }

        if (crop1.equals(crops[23])){
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
        }

        if (crop1.equals(crops[24])){
            if(crop2.equals(crops[4])
                    || crop2.equals(crops[20])
                    || crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2.equals(crops[8])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1.equals(crops[25])){
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
        }

        return CropTolerance.NUTRAL; //default
    }
}
