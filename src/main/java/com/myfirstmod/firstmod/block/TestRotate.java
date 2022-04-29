package com.myfirstmod.firstmod.block;


import net.minecraft.util.datafix.fixes.ChunkPalettedStorageFix.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

public class TestRotate extends Block {
	
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
	public static final BooleanProperty LIT = BooleanProperty.create("lit");

	public TestRotate(Properties properties) {
		super(properties.lightLevel(state -> {
			return state.getValue(LIT) ? 15 : 0;
		}));

		// this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH));
	}
	
	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(FACING, LIT);
		super.createBlockStateDefinition(builder);
	}
	

}
