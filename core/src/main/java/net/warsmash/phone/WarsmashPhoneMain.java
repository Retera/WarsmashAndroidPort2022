package net.warsmash.phone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.etheller.warsmash.datasources.DataSource;
import com.etheller.warsmash.datasources.MpqDataSourceDescriptor;
import com.etheller.warsmash.units.DataTable;
import com.etheller.warsmash.util.DataSourceFileHandle;
import com.etheller.warsmash.util.ImageUtils;
import com.etheller.warsmash.util.StringBundle;

import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class WarsmashPhoneMain extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture image;
	private DataTable dataTable;
	private BitmapFont font;


	public WarsmashPhoneMain() {
	}

    @Override
	public void create() {
		batch = new SpriteBatch();
		MpqDataSourceDescriptor mpqDataSourceDescriptor = new MpqDataSourceDescriptor("WarSmash.mpq");
		DataSource dataSource = mpqDataSourceDescriptor.createDataSource();
		image = new Texture(new DataSourceFileHandle(dataSource, "Textures\\Footman.png"));
		font = new BitmapFont();
		dataTable = loadWarsmashIni();

//		ImageUtils.getAnyExtensionTexture()
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0.15f, 0.15f, 0.2f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(image, 140, 210);
		font.draw(batch, "TEXT:" + dataTable.get("DataSources").getFieldValue("Count"), 16, 16);
		batch.end();
	}

	@Override
	public void dispose() {
		batch.dispose();
		image.dispose();
	}

	public static DataTable loadWarsmashIni() {
		final DataTable warsmashIni = new DataTable(StringBundle.EMPTY);
		try (InputStream warsmashIniInputStream = Gdx.files.internal("warsmash.ini").read()) {
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
}