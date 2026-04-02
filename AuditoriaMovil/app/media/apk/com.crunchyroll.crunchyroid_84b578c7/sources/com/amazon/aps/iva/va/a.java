package com.amazon.aps.iva.va;

import com.amazon.aps.iva.util.LogUtils;
import com.amazon.aps.iva.wa.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;
/* compiled from: ApsIvaConfigFetcherFactory.java */
/* loaded from: classes.dex */
public final class a {
    public static final String c;
    public static a d;
    public final String a = String.format("%s/%s/%s", c, "v1", "apsIvaConfig.json");
    public f b;

    static {
        Properties properties = new Properties();
        String str = null;
        try {
            ClassLoader classLoader = a.class.getClassLoader();
            Objects.requireNonNull(classLoader);
            InputStream resourceAsStream = classLoader.getResourceAsStream("aps-configuration.properties");
            properties.load(resourceAsStream);
            str = properties.getProperty("apsIvaCloudFrontUrl");
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException e) {
            LogUtils.e("b", String.format("ApsIvaConfig: IO Error while reading default configs: %s", e));
        }
        c = str;
    }
}
