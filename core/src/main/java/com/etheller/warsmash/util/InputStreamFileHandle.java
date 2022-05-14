package com.etheller.warsmash.util;

import com.badlogic.gdx.files.FileHandle;
import com.etheller.warsmash.datasources.DataSource;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamFileHandle extends FileHandle {
	private final InputStream dataSource;

	public InputStreamFileHandle(final InputStream dataSource, final String path) {
		super(path);
		this.dataSource = dataSource;
	}

	@Override
	public String path() {
		return file().getPath();
	}

	@Override
	public InputStream read() {
		return dataSource;
	}
}
