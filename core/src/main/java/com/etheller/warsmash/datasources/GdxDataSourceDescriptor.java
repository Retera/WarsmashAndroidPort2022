package com.etheller.warsmash.datasources;

public class GdxDataSourceDescriptor implements DataSourceDescriptor {

    @Override
    public DataSource createDataSource() {
        return new GdxDataSource();
    }

    @Override
    public String getDisplayName() {
        return "GDX";
    }
}
