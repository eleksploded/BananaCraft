package com.pikachu923.BananaCraft.block;

import java.util.Collection;
import java.util.List;

import com.google.common.collect.ImmutableMap;
import com.pikachu923.BananaCraft.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockWrapper extends Block implements IBlockState
{

	public BlockWrapper(Material material){
		super(material);
		this.setCreativeTab(Reference.CreativeTab);
		setHardness(3.0F);
		setResistance(5.0F);
	}
	
	public BlockWrapper(){
		this(Material.ROCK);
		this.setCreativeTab(Reference.CreativeTab);
		setHardness(3.0F);
		setResistance(5.0F);
	}

	    @Override
	    public String getUnlocalizedName()
	    {
	        return String.format("tile.%s%s", Reference.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }

	    @Override
	    @net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	    }

	    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }

		@Override
		public boolean onBlockEventReceived(World worldIn, BlockPos pos,
				int id, int param) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void neighborChanged(World worldIn, BlockPos pos,
				Block p_189546_3_) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Material getMaterial() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isFullBlock() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean func_189884_a(Entity p_189884_1_) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int getLightOpacity() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getLightOpacity(IBlockAccess world, BlockPos pos) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getLightValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getLightValue(IBlockAccess world, BlockPos pos) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isTranslucent() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean useNeighborBrightness() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public MapColor getMapColor() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IBlockState withRotation(Rotation rot) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IBlockState withMirror(Mirror mirrorIn) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isFullCube() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public EnumBlockRenderType getRenderType() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getPackedLightmapCoords(IBlockAccess source, BlockPos pos) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public float getAmbientOcclusionLightValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isBlockNormalCube() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isNormalCube() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean canProvidePower() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int getWeakPower(IBlockAccess blockAccess, BlockPos pos,
				EnumFacing side) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean hasComparatorInputOverride() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int getComparatorInputOverride(World worldIn, BlockPos pos) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public float getBlockHardness(World worldIn, BlockPos pos) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public float getPlayerRelativeBlockHardness(EntityPlayer player,
				World worldIn, BlockPos pos) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getStrongPower(IBlockAccess blockAccess, BlockPos pos,
				EnumFacing side) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public EnumPushReaction getMobilityFlag() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IBlockState getActualState(IBlockAccess blockAccess, BlockPos pos) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public AxisAlignedBB getSelectedBoundingBox(World worldIn, BlockPos pos) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean shouldSideBeRendered(IBlockAccess blockAccess,
				BlockPos pos, EnumFacing facing) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isOpaqueCube() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void addCollisionBoxToList(World worldIn, BlockPos pos,
				AxisAlignedBB p_185908_3_, List<AxisAlignedBB> p_185908_4_,
				Entity p_185908_5_) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public AxisAlignedBB getBoundingBox(IBlockAccess blockAccess,
				BlockPos pos) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RayTraceResult collisionRayTrace(World worldIn, BlockPos pos,
				Vec3d start, Vec3d end) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isFullyOpaque() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockAccess world, BlockPos pos,
				EnumFacing side) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isSideSolid(IBlockAccess world, BlockPos pos,
				EnumFacing side) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Collection<IProperty<?>> getPropertyNames() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T extends Comparable<T>> T getValue(IProperty<T> property) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T extends Comparable<T>, V extends T> IBlockState withProperty(
				IProperty<T> property, V value) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T extends Comparable<T>> IBlockState cycleProperty(
				IProperty<T> property) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ImmutableMap<IProperty<?>, Comparable<?>> getProperties() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Block getBlock() {
			// TODO Auto-generated method stub
			return null;
		}
}
