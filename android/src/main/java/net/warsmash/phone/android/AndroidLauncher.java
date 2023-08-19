package net.warsmash.phone.android;

import android.os.Bundle;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.etheller.warsmash.WarsmashGdxGame;
import com.etheller.warsmash.WarsmashGdxMenuScreen;
import com.etheller.warsmash.WarsmashGdxMultiScreenGame;
import com.etheller.warsmash.WarsmashTestGame;
import com.etheller.warsmash.WarsmashTestGame2;
import com.etheller.warsmash.WarsmashTestGameAttributes;
import com.etheller.warsmash.units.DataTable;
import com.etheller.warsmash.util.StringBundle;
import com.etheller.warsmash.viewer5.AudioContext;
import com.etheller.warsmash.viewer5.AudioDestination;
import com.etheller.warsmash.viewer5.gl.ANGLEInstancedArrays;
import com.etheller.warsmash.viewer5.gl.AudioExtension;
import com.etheller.warsmash.viewer5.gl.Extensions;
import com.etheller.warsmash.viewer5.gl.WireframeExtension;

import net.warsmash.phone.WarsmashPhoneMain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.Consumer;

/** Launches the Android application. */
public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration configuration = new AndroidApplicationConfiguration();
		configuration.useGL30 = true;
//		DataTable dataTable = loadWarsmashIni();
		loadExtensions();
		final WarsmashGdxMultiScreenGame warsmashGdxMultiScreenGame = new WarsmashGdxMultiScreenGame((Consumer<WarsmashGdxMultiScreenGame>) (game) -> {
			final WarsmashGdxMenuScreen menuScreen = new WarsmashGdxMenuScreen(null,
					game);
			game.setScreen(menuScreen);
		});
		initialize(warsmashGdxMultiScreenGame, configuration);
	}

	public static void loadExtensions() {
		Extensions.angleInstancedArrays = new ANGLEInstancedArrays() {
			@Override
			public void glVertexAttribDivisorANGLE(final int index, final int divisor) {
				Gdx.gl30.glVertexAttribDivisor(index, divisor);
			}

			@Override
			public void glDrawElementsInstancedANGLE(final int mode, final int count, final int type,
													 final int indicesOffset, final int instanceCount) {
				Gdx.gl30.glDrawElementsInstanced(mode, count, type, indicesOffset, instanceCount);
			}

			@Override
			public void glDrawArraysInstancedANGLE(final int mode, final int first, final int count,
												   final int instanceCount) {
				Gdx.gl30.glDrawArraysInstanced(mode, first, count, instanceCount);
			}
		};
		Extensions.wireframeExtension = new WireframeExtension() {
			@Override
			public void glPolygonMode(final int face, final int mode) {
			}
		};
		Extensions.audio = new AudioExtension() {

			@Override
			public float getDuration(final Sound sound) {
				if (sound == null) {
					return 1;
				}
				return 2.0f;
			}

			@Override
			public void play(final Sound buffer, final float volume, final float pitch, final float x, final float y,
							 final float z, final boolean is3dSound, final float maxDistance, final float refDistance,
							 final boolean looping) {
				if(looping) {
					buffer.loop(volume, pitch, 0.0f);
				} else {
					buffer.play(volume, pitch, 0.0f);
				}
			}

			@Override
			public AudioContext createContext(final boolean world) {
				AudioContext.Listener listener;
				listener = AudioContext.Listener.DO_NOTHING;

				return new AudioContext(listener, new AudioDestination() {
				});
			}
		};
		Extensions.GL_LINE = 0;
		Extensions.GL_FILL = 0;
	}
}