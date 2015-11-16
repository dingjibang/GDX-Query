package com.rpsg.gdxQuery.gQuery;

import com.badlogic.gdx.graphics.Texture;
import com.rpsg.gdxQuery.$;
import com.rpsg.gdxQuery.GdxQuery;

public interface IGQuery {
    default GdxQuery $(String fileName) {
        return $.image(fileName);
    };

    default GdxQuery $(Texture texture) {
        return $.image(texture);
    }

    default GdxQuery $(GdxQuery... gdxQueries) {
        return $.add(gdxQueries);
    }
}
