
package com.chopstickphoenix.basketballjumpextreme;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class basketballJumpExtreme extends Game {
	// used by all screens
	public SpriteBatch batcher;
	public static InterfaceAdvertising InterfaceAdvertising;
	public static InterfaceShareGeneral interfaceShareGeneral;
	public static InterfaceSwarm interfaceSwarm;
	
	public basketballJumpExtreme (InterfaceAdvertising InterfaceAdvertising, InterfaceShareGeneral interfaceShareGeneral, InterfaceSwarm interfaceSwarm){
		this.InterfaceAdvertising = InterfaceAdvertising;
		this.interfaceShareGeneral = interfaceShareGeneral;
		this.interfaceSwarm = interfaceSwarm;
	}
	
	@Override
	public void create () {
		
		batcher = new SpriteBatch();
		Settings.load();
		Assets.load();
		//actionResolver.showOrLoadInterstital();
		setScreen(new SplashScreen(this));
	}
	
	@Override
	public void render() {
		super.render();
	}
}
