package com.etheller.warsmash.datasources;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class GdxDataSource implements DataSource {
    @Override
    public InputStream getResourceAsStream(String filepath) throws IOException {
        filepath = filepath.toLowerCase(Locale.US).replace('\\', '/');
        FileHandle internal = Gdx.files.internal(filepath);
        if (!internal.exists()) {
            System.err.println("GdxDataSource: Not found: " + filepath);
            return null;
        }
        return internal.read();
    }

    @Override
    public File getFile(String filepath) throws IOException {
        filepath = filepath.toLowerCase(Locale.US).replace('\\', '/');
        return Gdx.files.external(filepath).file();
    }

    @Override
    public File getDirectory(String filepath) throws IOException {
        filepath = filepath.toLowerCase(Locale.US).replace('\\', '/');
        return Gdx.files.external(filepath).file();
    }

    @Override
    public ByteBuffer read(String path) throws IOException {
        path = path.toLowerCase(Locale.US).replace('\\', '/');
        FileHandle internal = Gdx.files.internal(path);
        if (!internal.exists()) {
            System.err.println("GdxDataSource: Not found: " + path);
            return null;
        }
        return ByteBuffer.wrap(internal.readBytes());
    }

    @Override
    public boolean has(String filepath) {
        filepath = filepath.toLowerCase(Locale.US).replace('\\', '/');
        return Gdx.files.internal(filepath).exists();
    }

    @Override
    public Collection<String> getListfile() {
        List<String> listfileContents = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(Gdx.files.internal("listfile.txt").reader())) {
            String line;
            while ((line = reader.readLine()) != null) {
                listfileContents.add(line);
            }
            return listfileContents;
        } catch (IOException e) {
            throw new RuntimeException("No listfile.txt", e);
        }
    }

    @Override
    public void close() throws IOException {

    }
}
