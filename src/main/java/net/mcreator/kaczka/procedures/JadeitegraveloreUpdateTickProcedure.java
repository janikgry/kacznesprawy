package net.mcreator.kaczka.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.kaczka.init.KaczkaModParticleTypes;
import net.mcreator.kaczka.init.KaczkaModBlocks;

public class JadeitegraveloreUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (KaczkaModParticleTypes.JADEITEPARTICLE.get()), x, y, z, 10, 3, 3, 3, 1);
			world.setBlock(new BlockPos(x, y, z), KaczkaModBlocks.JADEITEBLOCK.get().defaultBlockState(), 3);
		}
	}
}
