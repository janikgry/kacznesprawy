package net.mcreator.kaczka.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.kaczka.init.KaczkaModBlocks;

public class NetherreactorBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), KaczkaModBlocks.GLOWINGOBSIDIAN.get().defaultBlockState(), 3);
	}
}
