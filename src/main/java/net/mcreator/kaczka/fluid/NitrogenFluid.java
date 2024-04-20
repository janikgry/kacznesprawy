
package net.mcreator.kaczka.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.BlockPos;

import net.mcreator.kaczka.init.KaczkaModItems;
import net.mcreator.kaczka.init.KaczkaModFluids;
import net.mcreator.kaczka.init.KaczkaModBlocks;

public abstract class NitrogenFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(KaczkaModFluids.NITROGEN,
			KaczkaModFluids.FLOWING_NITROGEN,
			FluidAttributes.builder(new ResourceLocation("kaczka:blocks/nitrogen_still"), new ResourceLocation("kaczka:blocks/nitrogen_flow"))

	).explosionResistance(100f)

			.bucket(KaczkaModItems.NITROGEN_BUCKET).block(() -> (LiquidBlock) KaczkaModBlocks.NITROGEN.get());

	private NitrogenFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SNOWFLAKE;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(-1);
	}

	public static class Source extends NitrogenFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NitrogenFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
