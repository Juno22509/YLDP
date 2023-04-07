
package net.mcreator.yourlordsdampfpunk.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.yourlordsdampfpunk.procedures.SoulBloodMobplayerCollidesBlockProcedure;
import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModFluids;

public class SoulBloodBlock extends LiquidBlock {
	public SoulBloodBlock() {
		super(() -> YourLordsDampfpunkModFluids.SOUL_BLOOD.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 10;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		SoulBloodMobplayerCollidesBlockProcedure.execute(entity);
	}
}
