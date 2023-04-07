
package net.mcreator.yourlordsdampfpunk.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModItems;
import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModFluids;
import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModFluidTypes;
import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModBlocks;

public abstract class SoulBloodFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> YourLordsDampfpunkModFluidTypes.SOUL_BLOOD_TYPE.get(), () -> YourLordsDampfpunkModFluids.SOUL_BLOOD.get(),
			() -> YourLordsDampfpunkModFluids.FLOWING_SOUL_BLOOD.get()).explosionResistance(100f).bucket(() -> YourLordsDampfpunkModItems.SOUL_BLOOD_BUCKET.get()).block(() -> (LiquidBlock) YourLordsDampfpunkModBlocks.SOUL_BLOOD.get());

	private SoulBloodFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.DRIPPING_WATER;
	}

	public static class Source extends SoulBloodFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SoulBloodFluid {
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
