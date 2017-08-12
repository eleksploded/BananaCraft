package net.minecraft.client.model;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelVindicator extends ModelIllager
{
    public ModelVindicator(float scaleFactor)
    {
        this(scaleFactor, 0.0F, 64, 64);
    }

    public ModelVindicator(float scaleFactor, float p_i47223_2_, int textureWidthIn, int textureHeightIn)
    {
        super(scaleFactor, p_i47223_2_, textureWidthIn, textureHeightIn);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        EntityVindicator entityvindicator = (EntityVindicator)entityIn;

        if (entityvindicator.isAggressive())
        {
            this.rightArm.render(scale);
            this.leftArm.render(scale);
        }
        else
        {
            this.arms.render(scale);
        }
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
        float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
        this.rightArm.rotateAngleZ = 0.0F;
        this.leftArm.rotateAngleZ = 0.0F;
        this.rightArm.rotateAngleY = 0.15707964F;
        this.leftArm.rotateAngleY = -0.15707964F;

        if (((EntityLivingBase)entityIn).getPrimaryHand() == EnumHandSide.RIGHT)
        {
            this.rightArm.rotateAngleX = -1.8849558F + MathHelper.cos(ageInTicks * 0.09F) * 0.15F;
            this.leftArm.rotateAngleX = -0.0F + MathHelper.cos(ageInTicks * 0.19F) * 0.5F;
            this.rightArm.rotateAngleX += f * 2.2F - f1 * 0.4F;
            this.leftArm.rotateAngleX += f * 1.2F - f1 * 0.4F;
        }
        else
        {
            this.rightArm.rotateAngleX = -0.0F + MathHelper.cos(ageInTicks * 0.19F) * 0.5F;
            this.leftArm.rotateAngleX = -1.8849558F + MathHelper.cos(ageInTicks * 0.09F) * 0.15F;
            this.rightArm.rotateAngleX += f * 1.2F - f1 * 0.4F;
            this.leftArm.rotateAngleX += f * 2.2F - f1 * 0.4F;
        }

        this.rightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.leftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.rightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.leftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    }
}