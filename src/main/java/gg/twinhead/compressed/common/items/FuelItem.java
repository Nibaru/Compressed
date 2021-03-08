package gg.twinhead.compressed.common.items;

import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class FuelItem extends BlockItem{
  private int burnTime;
  public FuelItem(Block block, Properties properties, int burnTime){
    super(block, properties);
    this.burnTime = burnTime;
  }
  @Override
  public int getBurnTime(ItemStack ItemStack){
    return burnTime;
  }
}
