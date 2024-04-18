package net.mcreator.kaczka.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.kaczka.init.KaczkaModBlocks;

public class GlowingobsidianUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isEmptyBlock(new BlockPos(x, y - 1, z))
				&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(new BlockPos(x, y - 1, z), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(new BlockPos(x, y + 1, z))
				&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(new BlockPos(x, y + 1, z), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(new BlockPos(x + 1, y, z))
				&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(new BlockPos(x + 1, y, z), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(new BlockPos(x - 1, y, z))
				&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(new BlockPos(x - 1, y, z), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(new BlockPos(x, y, z - 1))
				&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(new BlockPos(x, y, z - 1), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
		if (!world.isEmptyBlock(new BlockPos(x, y, z + 1))
				&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == KaczkaModBlocks.GLOWINGOBSIDIAN.get())) {
			world.setBlock(new BlockPos(x, y, z + 1), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
		}
	}
}
