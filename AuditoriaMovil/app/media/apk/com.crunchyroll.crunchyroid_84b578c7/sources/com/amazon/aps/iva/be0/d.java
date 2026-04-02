package com.amazon.aps.iva.be0;

import com.amazon.aps.iva.yb0.j;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: BuiltInsResourceLoader.kt */
/* loaded from: classes4.dex */
public final class d {
    public static InputStream a(String str) {
        j.f(str, "path");
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
