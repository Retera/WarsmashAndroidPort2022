package com.etheller.warsmash.viewer5.handlers.w3x.environment;

import java.io.IOException;
import java.nio.Buffer;

import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Texture;
import com.etheller.warsmash.datasources.DataSource;
import com.etheller.warsmash.util.ImageUtils;
import com.etheller.warsmash.util.ImageUtils.AnyExtensionImage;

public class GroundTexture {
	public int id;
	private int tileSize;
	public boolean extended;

	public GroundTexture(final String path, final DataSource dataSource, final GL30 gl) throws IOException {
		final AnyExtensionImage imageInfo = ImageUtils.getAnyExtensionImageFixRGB(dataSource, path, "ground texture");
		loadImage(path, gl, imageInfo.getImageData(), imageInfo.isNeedsSRGBFix());
	}

	private void loadImage(final String path, final GL30 gl, final Texture image, final boolean sRGBFix) {
		if (image == null) {
			throw new IllegalStateException("Missing ground texture: " + path);
		}
		final Buffer buffer = ImageUtils.getTextureBuffer(image);
		final int width = image.getWidth();
		final int height = image.getHeight();

		this.tileSize = (int) (height * 0.25);
		this.extended = (width > height);

		this.id = gl.glGenTexture();
		gl.glBindTexture(GL30.GL_TEXTURE_2D_ARRAY, this.id);
		gl.glTexImage3D(GL30.GL_TEXTURE_2D_ARRAY, 0, GL30.GL_RGBA8, this.tileSize, this.tileSize,
				this.extended ? 32 : 16, 0, GL30.GL_RGBA, GL30.GL_UNSIGNED_BYTE, null);
		gl.glTexParameteri(GL30.GL_TEXTURE_2D_ARRAY, GL30.GL_TEXTURE_MIN_FILTER, GL30.GL_LINEAR_MIPMAP_LINEAR);
		gl.glTexParameteri(GL30.GL_TEXTURE_2D_ARRAY, GL30.GL_TEXTURE_WRAP_S, GL30.GL_CLAMP_TO_EDGE);
		gl.glTexParameteri(GL30.GL_TEXTURE_2D_ARRAY, GL30.GL_TEXTURE_WRAP_T, GL30.GL_CLAMP_TO_EDGE);

		gl.glPixelStorei(GL30.GL_UNPACK_ROW_LENGTH, width);
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 4; x++) {
				buffer.position(((y * this.tileSize * width) + (x * this.tileSize)) * 4);
				gl.glTexSubImage3D(GL30.GL_TEXTURE_2D_ARRAY, 0, 0, 0, (y * 4) + x, this.tileSize, this.tileSize, 1,
						GL30.GL_RGBA, GL30.GL_UNSIGNED_BYTE, buffer);

				if (this.extended) {
					buffer.position(((y * this.tileSize * width) + ((x + 4) * this.tileSize)) * 4);
					gl.glTexSubImage3D(GL30.GL_TEXTURE_2D_ARRAY, 0, 0, 0, (y * 4) + x + 16, this.tileSize,
							this.tileSize, 1, GL30.GL_RGBA, GL30.GL_UNSIGNED_BYTE, buffer);
				}
			}
		}
		gl.glPixelStorei(GL30.GL_UNPACK_ROW_LENGTH, 0);
		gl.glGenerateMipmap(GL30.GL_TEXTURE_2D_ARRAY);
	}
}
