package com.daas.igenesys;

import org.geotools.data.DataStore;
import org.geotools.data.shapefile.ShapefileDataStore;
import org.geotools.data.shapefile.ShapefileDataStoreFactory;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class ShapeFileProcessor
{
    public static void main( String[] args ) throws IOException {
        String shapeFileZipPath = "/Users/mghildiy/work/experiments/shapefile-processor/src/main/resources/shapefile-test/slope_updated.shp";
        File file = new File(shapeFileZipPath);
        Map<String, Serializable> map = new HashMap();
        map.put("url", file.toURI().toURL());

        ShapefileDataStoreFactory dataStoreFactory = new ShapefileDataStoreFactory();
        ShapefileDataStore dataStore = (ShapefileDataStore) dataStoreFactory.createDataStore(map);
        System.out.println(dataStore);
    }
}
