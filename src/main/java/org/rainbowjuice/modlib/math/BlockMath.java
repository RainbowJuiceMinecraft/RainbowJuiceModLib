package org.rainbowjuice.modlib.math;

import net.minecraft.util.math.Direction;

public class BlockMath {
    public int getRotation(double headYaw, Direction direction){
        if(direction == Direction.EAST || direction == Direction.NORTH){
            return ModMath.getSectorLayOn(22.5f, (float) Math.abs(headYaw)%90);
        }else{
            return ModMath.getSectorLayOn(22.5f, (float) (90-Math.abs(headYaw)%90));
        }
    }
}
