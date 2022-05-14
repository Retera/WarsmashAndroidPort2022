package net.warsmash.phone.lwjgl3;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.etheller.warsmash.WarsmashGdxGame;
import com.etheller.warsmash.WarsmashGdxMenuScreen;
import com.etheller.warsmash.WarsmashGdxMultiScreenGame;
import com.etheller.warsmash.units.DataTable;
import com.etheller.warsmash.util.StringBundle;
import com.etheller.warsmash.viewer5.AudioContext;
import com.etheller.warsmash.viewer5.AudioDestination;
import com.etheller.warsmash.viewer5.gl.ANGLEInstancedArrays;
import com.etheller.warsmash.viewer5.gl.AudioExtension;
import com.etheller.warsmash.viewer5.gl.Extensions;
import com.etheller.warsmash.viewer5.gl.WireframeExtension;

import org.lwjgl.opengl.GL11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.Consumer;

/** Launches the desktop (LWJGL3) application. */
public class Lwjgl3Launcher {
	public static void main(String[] args) {
		String iniPath = null;
		for (int argIndex = 0; argIndex < args.length; argIndex++) {
			if ((args.length > (argIndex + 1)) && "-ini".equals(args[argIndex])) {
				argIndex++;
				iniPath = args[argIndex];
			}
		}
		loadExtensions();
		final DataTable warsmashIni = loadWarsmashIni(iniPath);

		createApplication(warsmashIni);
	}

	public static DataTable loadWarsmashIni(final String iniPath) {
		final DataTable warsmashIni = new DataTable(StringBundle.EMPTY);
		try (FileInputStream warsmashIniInputStream = new FileInputStream(iniPath != null ? iniPath : "warsmash.ini")) {
			warsmashIni.readTXT(warsmashIniInputStream, true);
		}
		catch (final FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		catch (final IOException e) {
			throw new RuntimeException(e);
		}
		return warsmashIni;
	}

	private static Lwjgl3Application createApplication(DataTable warsmashIni) {
		final WarsmashGdxMultiScreenGame warsmashGdxMultiScreenGame = new WarsmashGdxMultiScreenGame((Consumer<WarsmashGdxMultiScreenGame>) (game) -> {
			final WarsmashGdxMenuScreen menuScreen = new WarsmashGdxMenuScreen(warsmashIni,
					game);
			game.setScreen(menuScreen);
		});
//		if (finalFileToLoad != null) {
//			menuScreen.startMap(finalFileToLoad);
//		}
		Lwjgl3Application application = new Lwjgl3Application(warsmashGdxMultiScreenGame, getDefaultConfiguration());
		return application;
	}

	private static Lwjgl3Application createAIFApplication(DataTable warsmashIni) {
		Lwjgl3Application application = new Lwjgl3Application(new WarsmashGdxGame(warsmashIni), getDefaultConfiguration());
		return application;
	}

	private static Lwjgl3ApplicationConfiguration getDefaultConfiguration() {
		Lwjgl3ApplicationConfiguration configuration = new Lwjgl3ApplicationConfiguration();
		configuration.setTitle("Warsmash3Phone");
		configuration.useVsync(true);
		configuration.setOpenGLEmulation(Lwjgl3ApplicationConfiguration.GLEmulation.GL30, 3, 3);
		//// Limits FPS to the refresh rate of the currently active monitor.
		configuration.setForegroundFPS(Lwjgl3ApplicationConfiguration.getDisplayMode().refreshRate);
		//// If you remove the above line and set Vsync to false, you can get unlimited FPS, which can be
		//// useful for testing performance, but can also be very stressful to some hardware.
		//// You may also need to configure GPU drivers to fully disable Vsync; this can cause screen tearing.
		configuration.setWindowedMode(640, 480);
		configuration.setWindowIcon("libgdx128.png", "libgdx64.png", "libgdx32.png", "libgdx16.png");
		return configuration;
	}


	public static void loadExtensions() {
		Extensions.angleInstancedArrays = new ANGLEInstancedArrays() {
//			@Override
//			public void glVertexAttribDivisorANGLE(final int index, final int divisor) {
//				GL33.glVertexAttribDivisor(index, divisor);
//			}
//
//			@Override
//			public void glDrawElementsInstancedANGLE(final int mode, final int count, final int type,
//													 final int indicesOffset, final int instanceCount) {
//				GL31.glDrawElementsInstanced(mode, count, type, indicesOffset, instanceCount);
//			}
//
//			@Override
//			public void glDrawArraysInstancedANGLE(final int mode, final int first, final int count,
//												   final int instanceCount) {
//				GL31.glDrawArraysInstanced(mode, first, count, instanceCount);
//			}
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
				buffer.play(volume, pitch, 0.0f);
			}

			@Override
			public AudioContext createContext(final boolean world) {
				AudioContext.Listener listener;
					listener = AudioContext.Listener.DO_NOTHING;

				return new AudioContext(listener, new AudioDestination() {
				});
			}
		};
		Extensions.GL_LINE = GL11.GL_LINE;
		Extensions.GL_FILL = GL11.GL_FILL;
	}
}