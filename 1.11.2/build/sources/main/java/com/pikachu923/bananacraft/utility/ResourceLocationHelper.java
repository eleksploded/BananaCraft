package com.pikachu923.bananacraft.utility;

import com.pikachu923.bananacraft.reference.Reference;

import net.minecraft.util.ResourceLocation;

public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(Reference.LOWERCASE_MOD_ID, path);
    }
}