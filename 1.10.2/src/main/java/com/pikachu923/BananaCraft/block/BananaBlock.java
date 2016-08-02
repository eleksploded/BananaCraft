package com.pikachu923.BananaCraft.block;

        import com.pikachu923.BananaCraft.reference.Reference;

        import cpw.mods.fml.relauncher.Side;
        import cpw.mods.fml.relauncher.SideOnly;
        import net.minecraft.client.renderer.texture.IIconRegister;

public class BananaBlock extends BlockWrapper{
    String unlocalName;
    String Texture;
    public BananaBlock(String unlocalName){
        super();
        this.setBlockName(unlocalName);
        Texture = Reference.RESOURCE_PREFIX + unlocalName;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.blockIcon = iconRegister.registerIcon(Texture);
    }

}
