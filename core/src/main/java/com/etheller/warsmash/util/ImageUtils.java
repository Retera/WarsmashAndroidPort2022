package com.etheller.warsmash.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.TextureData;
import com.etheller.warsmash.datasources.DataSource;
import com.etheller.warsmash.viewer5.handlers.tga.TgaFile;

/**
 * Uses AWT stuff
 */
public final class ImageUtils {
    private static final int BYTES_PER_PIXEL = 4;
    public static final String DEFAULT_ICON_PATH = "ReplaceableTextures\\CommandButtons\\BTNTemp.png";

    public static Texture getAnyExtensionTexture(final DataSource dataSource, final String path) {
        Texture image;
        try {
            final AnyExtensionImage imageInfo = getAnyExtensionImageFixRGB(dataSource, path, "texture");
            image = imageInfo.getImageData();
            if (image != null) {
                return image;
            }
        } catch (final IOException e) {
            return null;
        }
        return null;
    }

    public static AnyExtensionImage getAnyExtensionImageFixRGB(final DataSource dataSource, final String path,
                                                               final String errorType) throws IOException {
        final String tgaPath = path.substring(0, path.length() - 4) + ".png";
        if (dataSource.has(tgaPath)) {
            return new AnyExtensionImage(false, new Texture(new DataSourceFileHandle(dataSource, tgaPath)));
        } else {
            throw new IllegalStateException("Missing " + errorType + ": " + path);
        }
    }

    public static final class AnyExtensionImage {
        private final Texture imageData;

        public AnyExtensionImage(final boolean needsSRGBFix, final Texture imageData) {
            this.imageData = imageData;
        }

        public Texture getImageData() {
            return this.imageData;
        }

        public Texture getRGBCorrectImageData() {
            return getImageData();
        }

        public boolean isNeedsSRGBFix() {
            return false;
        }
    }

    public static Buffer getTextureBuffer(final Texture image) {

        final int imageWidth = image.getWidth();
        final int imageHeight = image.getHeight();
        TextureData textureData = image.getTextureData();
        if(!textureData.isPrepared()) {
            textureData.prepare();;
        }
        Pixmap pixmap = textureData.consumePixmap();

        final ByteBuffer buffer = ByteBuffer.allocateDirect(imageWidth * imageHeight * BYTES_PER_PIXEL)
                .order(ByteOrder.nativeOrder());
        // 4
        // for
        // RGBA,
        // 3
        // for
        // RGB

        for (int y = 0; y < imageHeight; y++) {
            for (int x = 0; x < imageWidth; x++) {
                final int pixel = pixmap.getPixel(x, y);
                buffer.put((byte) ((pixel >> 24) & 0xFF)); // Red component
                buffer.put((byte) ((pixel >> 16) & 0xFF)); // Green component
                buffer.put((byte) ((pixel >> 8) & 0xFF)); // Blue component
                buffer.put((byte) ((pixel >> 0) & 0xFF)); // Alpha component.
                // Only for RGBA
            }
        }

        buffer.flip();
        return buffer;
    }


    private ImageUtils() {
    }

    public static int getARGBFromRGBA(int x) {
        return ((x & 0xFF) << 24) | ((x & 0xFF000000) >> 8) | ((x & 0xFF0000) >> 8)  | ((x & 0xFF00) >> 8);
    }
}
