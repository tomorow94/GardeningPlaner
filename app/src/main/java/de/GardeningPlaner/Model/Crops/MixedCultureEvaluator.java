package de.GardeningPlaner.Model.Crops;

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
        String _crop1 = crop1.getName();
        String _crop2 = crop2.getName();

        if (_crop1.equals(crops[0])){
            if(_crop2.equals(crops[11])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[9])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[1])){
            if(_crop2.equals(crops[2])
                    || _crop2.equals(crops[5])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[9])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[15])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[19])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[21])
                    || _crop2.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[4])
                    || _crop2.equals(crops[7])
                    || _crop2.equals(crops[10])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[23])
                    || _crop2.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[2])){
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[11])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[18])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[3])){
            if(_crop2.equals(crops[7])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (_crop1.equals(crops[4])){
            if(_crop2.equals(crops[2])
                    || _crop2.equals(crops[7])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[22])
                    || _crop2.equals(crops[24])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[9])
                    || _crop2.equals(crops[10])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[23])
                    || _crop2.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[5])){
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[6])
                    || _crop2.equals(crops[10])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[22])
                    || _crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (_crop1.equals(crops[6])){
            if(_crop2.equals(crops[5])
                    || _crop2.equals(crops[7])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[22])
                    || _crop2.equals(crops[23])
                    || _crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (_crop1.equals(crops[7])){
            if(_crop2.equals(crops[3])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[6])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[20])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[23])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[8])){
            if(_crop2.equals(crops[2])
                    || _crop2.equals(crops[7])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[21])
                    || _crop2.equals(crops[23])
                    || _crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[9])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[24])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[9])){
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[16])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[0])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[21])
                    || _crop2.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[10])){
            if(_crop2.equals(crops[5])
                    || _crop2.equals(crops[6])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[23])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[11])){
            if(_crop2.equals(crops[0])
                    || _crop2.equals(crops[1])
                    || _crop2.equals(crops[3])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[5])
                    || _crop2.equals(crops[6])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[19])
                    || _crop2.equals(crops[21])
                    || _crop2.equals(crops[22])
                    || _crop2.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[2])
                    || _crop2.equals(crops[10])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[12])){
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[9])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[21])
                    || _crop2.equals(crops[22])
                    || _crop2.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[11])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[13])){
            if(_crop2.equals(crops[0])
                    || _crop2.equals(crops[1])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[5])
                    || _crop2.equals(crops[7])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[19])
                    || _crop2.equals(crops[23])
                    || _crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (_crop1.equals(crops[14])){
            if(_crop2.equals(crops[3])
                    || _crop2.equals(crops[5])
                    || _crop2.equals(crops[6])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[10])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[21])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[2])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[23])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[15])){
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[20])
                    || _crop2.equals(crops[22])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[16])){
            if(_crop2.equals(crops[9])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (_crop1.equals(crops[17])){
            if(_crop2.equals(crops[2])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[10])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[15])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[21])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[18])){
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[5])
                    || _crop2.equals(crops[6])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[15])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[22])
                    || _crop2.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[2])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[19])){
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
        }

        if (_crop1.equals(crops[20])){
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[5])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[10])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[24])
                    || _crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[9])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[15])
                    || _crop2.equals(crops[22])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[21])){
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[22])
                    || _crop2.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[9])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[21])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[22])){
            if(_crop2.equals(crops[0])
                    || _crop2.equals(crops[1])
                    || _crop2.equals(crops[2])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[5])
                    || _crop2.equals(crops[6])
                    || _crop2.equals(crops[9])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[12])
                    || _crop2.equals(crops[13])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[19])
                    || _crop2.equals(crops[21])
                    || _crop2.equals(crops[23])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[15])
                    || _crop2.equals(crops[20])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[23])){
            if(_crop2.equals(crops[3])
                    || _crop2.equals(crops[6])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[19])
                    || _crop2.equals(crops[21])
                    || _crop2.equals(crops[22])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[7])
                    || _crop2.equals(crops[10])
                    || _crop2.equals(crops[14])
                    || _crop2.equals(crops[25])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[24])){
            if(_crop2.equals(crops[4])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[25])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[8])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        if (_crop1.equals(crops[25])){
            if(_crop2.equals(crops[5])
                    || _crop2.equals(crops[6])
                    || _crop2.equals(crops[8])
                    || _crop2.equals(crops[10])
                    || _crop2.equals(crops[17])
                    || _crop2.equals(crops[20])
                    || _crop2.equals(crops[24])){
                return CropTolerance.SUPPORTIVE;
            }
            if(_crop2.equals(crops[1])
                    || _crop2.equals(crops[4])
                    || _crop2.equals(crops[9])
                    || _crop2.equals(crops[11])
                    || _crop2.equals(crops[18])
                    || _crop2.equals(crops[23])){
                return CropTolerance.OBSTRUCTIVE;
            }
        }

        return CropTolerance.NUTRAL; //default
    }
}
