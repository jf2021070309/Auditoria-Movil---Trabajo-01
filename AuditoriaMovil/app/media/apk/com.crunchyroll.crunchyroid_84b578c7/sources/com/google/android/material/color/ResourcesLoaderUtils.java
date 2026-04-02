package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;
/* loaded from: classes3.dex */
final class ResourcesLoaderUtils {
    private ResourcesLoaderUtils() {
    }

    public static boolean addResourcesLoaderToContext(Context context, Map<Integer, Integer> map) {
        ResourcesLoader create = ColorResourcesLoaderCreator.create(context, map);
        if (create != null) {
            context.getResources().addLoaders(create);
            return true;
        }
        return false;
    }

    public static boolean isColorResource(int i) {
        if (28 <= i && i <= 31) {
            return true;
        }
        return false;
    }
}
