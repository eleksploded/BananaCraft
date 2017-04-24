package com.pikachu923.BananaCraft.init;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {
	private WorldGenerator gen_BananaOre;
	private WorldGenerator gen_BananaStone;
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	    switch (world.provider.dimensionId) {
	    case 0: //Overworld
	    	    this.gen_BananaOre = new WorldGenMinable(Tier1Blocks.BananaOre, 8);
	    	    this.gen_BananaStone = new WorldGenMinable(Tier1Blocks.BananaStone, 24);
	    	    this.runGenerator(this.gen_BananaOre, world, random, chunkX, chunkZ, 20, 0, 64);
	    	    this.runGenerator(this.gen_BananaStone, world, random, chunkX, chunkZ, 20, 0, 64);
	        break;
	    case -1: //Nether

	        break;
	    case 1: //End

	        break;
	    }
	}
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight >256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, x, y, z);
	    }
	}


}
