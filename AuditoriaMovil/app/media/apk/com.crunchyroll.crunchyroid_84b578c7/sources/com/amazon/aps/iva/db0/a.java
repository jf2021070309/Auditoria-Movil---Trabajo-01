package com.amazon.aps.iva.db0;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ClassPathResourceMetadataLoader.java */
/* loaded from: classes4.dex */
public final class a implements com.amazon.aps.iva.ab0.a {
    public static final Logger b = Logger.getLogger(a.class.getName());

    @Override // com.amazon.aps.iva.ab0.a
    public final InputStream b(String str) {
        InputStream resourceAsStream = a.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            b.log(Level.WARNING, String.format("File %s not found", str));
        }
        return resourceAsStream;
    }
}
