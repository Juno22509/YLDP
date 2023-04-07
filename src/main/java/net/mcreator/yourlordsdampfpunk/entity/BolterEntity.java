
package net.mcreator.yourlordsdampfpunk.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModItems;
import net.mcreator.yourlordsdampfpunk.init.YourLordsDampfpunkModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class BolterEntity extends AbstractArrow implements ItemSupplier {
	public BolterEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(YourLordsDampfpunkModEntities.BOLTER.get(), world);
	}

	public BolterEntity(EntityType<? extends BolterEntity> type, Level world) {
		super(type, world);
	}

	public BolterEntity(EntityType<? extends BolterEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public BolterEntity(EntityType<? extends BolterEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(YourLordsDampfpunkModItems.BOLTER_BULLET.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static BolterEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		BolterEntity entityarrow = new BolterEntity(YourLordsDampfpunkModEntities.BOLTER.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("your_lords_dampfpunk:boltersound")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static BolterEntity shoot(LivingEntity entity, LivingEntity target) {
		BolterEntity entityarrow = new BolterEntity(YourLordsDampfpunkModEntities.BOLTER.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 4f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(true);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("your_lords_dampfpunk:boltersound")), SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
