package org.rainbowjuice.modlib.block;

import net.minecraft.state.property.IntProperty;

public interface BlockRotatable {
    IntProperty rotation = IntProperty.of("rotation", 0, 3);

}
