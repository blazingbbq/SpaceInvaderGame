package com.blazingbbq.stringprinting;

public class CharacterO extends NewCharacter{
	
	public CharacterO(float x, float y, float r, float g, float b, float size){
		init(x, y, r, g, b, size);
		this.character = 'O';
	}
	
	public void render(){
		//Building Blocks
		//1
		block2x6(0, 1);
		//2
		block6x2(1, 0);
		//3
		block2x6(6, 1);
		//4
		block6x2(1, 6);
	}
	
}
