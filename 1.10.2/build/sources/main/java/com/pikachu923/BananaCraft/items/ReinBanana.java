package com.pikachu923.BananaCraft.items;

import com.pikachu923.BananaCraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by pikac on 6/21/2016.
 */
public class ReinBanana extends ItemWrapper {
    String Texture;
    public ReinBanana(String unlocalName){
        super();
        this.setUnlocalizedName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){
        this.itemIcon = iconRegister.registerIcon(Texture);
    }
}
