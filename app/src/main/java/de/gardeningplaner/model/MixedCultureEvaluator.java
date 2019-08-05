package de.gardeningplaner.model;

import de.gardeningplaner.model.crops.Crop;
import de.gardeningplaner.model.crops.CropTolerance;

public class MixedCultureEvaluator {

    private static final String[] crops = {
            "Aubergine",        //0
            "Buschbohne",       //1
            "Chinakohl",        //2
            "Endivie",          //3
            "Erbse",            //4
            "Erdbeere",         //5
            "Feldsalat",        //6
            "Fenchel",          //7
            "Gurke",            //8
            "Kartoffel",        //9
            "Knoblauch",        //10
            "Kohl",             //11
            "Kohlrabi",         //12
            "Kopfsalat",        //13
            "Lauch",            //14
            "Mangold",          //15
            "Meerrettich",      //16
            "Karrotte",         //17
            "Radieschen",       //18
            "Rhabarber",        //19
            "Rote Bete",        //20
            "Sellerie",         //21
            "Spinat",           //22
            "Stangenbohnen",    //23
            "Zucchini",         //24
            "Zwiebel"           //25
    };

    CropTolerance evaluateTolerance(Crop crop1, Crop crop2){
        String crop1Name = crop1.getName();
        String crop2Name = crop2.getName();

        if (crop1Name.equals(crops[0])){
            if(crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[9])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[1])){
            if(crop2Name.equals(crops[2])
                    || crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[9])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[15])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[19])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[21])
                    || crop2Name.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[7])
                    || crop2Name.equals(crops[10])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[23])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[2])){
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[18])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[3])){
            if(crop2Name.equals(crops[7])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (crop1Name.equals(crops[4])){
            if(crop2Name.equals(crops[2])
                    || crop2Name.equals(crops[7])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[22])
                    || crop2Name.equals(crops[24])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[9])
                    || crop2Name.equals(crops[10])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[23])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[5])){
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[6])
                    || crop2Name.equals(crops[10])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[22])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (crop1Name.equals(crops[6])){
            if(crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[7])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[22])
                    || crop2Name.equals(crops[23])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (crop1Name.equals(crops[7])){
            if(crop2Name.equals(crops[3])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[6])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[20])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[8])){
            if(crop2Name.equals(crops[2])
                    || crop2Name.equals(crops[7])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[21])
                    || crop2Name.equals(crops[23])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[9])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[24])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[9])){
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[16])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[0])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[21])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[10])){
            if(crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[6])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[11])){
            if(crop2Name.equals(crops[0])
                    || crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[3])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[6])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[19])
                    || crop2Name.equals(crops[21])
                    || crop2Name.equals(crops[22])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[2])
                    || crop2Name.equals(crops[10])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[12])){
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[9])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[21])
                    || crop2Name.equals(crops[22])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[11])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[13])){
            if(crop2Name.equals(crops[0])
                    || crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[7])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[19])
                    || crop2Name.equals(crops[23])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (crop1Name.equals(crops[14])){
            if(crop2Name.equals(crops[3])
                    || crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[6])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[10])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[21])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[2])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[15])){
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[22])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[16])){
            if(crop2Name.equals(crops[9])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (crop1Name.equals(crops[17])){
            if(crop2Name.equals(crops[2])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[10])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[15])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[21])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[18])){
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[6])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[15])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[22])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[2])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[19])){
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (crop1Name.equals(crops[20])){
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[10])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[24])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[9])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[15])
                    || crop2Name.equals(crops[22])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[21])){
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[22])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[9])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[21])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[22])){
            if(crop2Name.equals(crops[0])
                    || crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[2])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[6])
                    || crop2Name.equals(crops[9])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[12])
                    || crop2Name.equals(crops[13])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[19])
                    || crop2Name.equals(crops[21])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[15])
                    || crop2Name.equals(crops[20])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[23])){
            if(crop2Name.equals(crops[3])
                    || crop2Name.equals(crops[6])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[19])
                    || crop2Name.equals(crops[21])
                    || crop2Name.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[7])
                    || crop2Name.equals(crops[10])
                    || crop2Name.equals(crops[14])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[24])){
            if(crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[8])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (crop1Name.equals(crops[25])){
            if(crop2Name.equals(crops[5])
                    || crop2Name.equals(crops[6])
                    || crop2Name.equals(crops[8])
                    || crop2Name.equals(crops[10])
                    || crop2Name.equals(crops[17])
                    || crop2Name.equals(crops[20])
                    || crop2Name.equals(crops[24])){
                return CropTolerance.SUPPORTIVE;
            }
            if(crop2Name.equals(crops[1])
                    || crop2Name.equals(crops[4])
                    || crop2Name.equals(crops[9])
                    || crop2Name.equals(crops[11])
                    || crop2Name.equals(crops[18])
                    || crop2Name.equals(crops[23])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        return CropTolerance.NUTRAL; //default
    }
}
