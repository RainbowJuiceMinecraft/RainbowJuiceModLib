package org.rainbowjuice.modlib.math;

import net.minecraft.state.property.IntProperty;

public class ModMath {
    public boolean isInRange(double x, float range1, float range2, boolean including){
        if(including){
            if (range1<range2){
                return x >= range1 && x <= range2;
            }else{
                return x >= range1 || x <= range2;
            }
        }else{
            if (range1<range2){
                return x > range1 && x < range2;
            }else{
                return x > range1 || x < range2;
            }
        }
    }

    public static int getSectorLayOn(float step, float number){
        return (int)(number/step);
    }
}
