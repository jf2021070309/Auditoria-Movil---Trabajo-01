package com.amazon.aps.iva.w5;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: DataSource.java */
/* loaded from: classes.dex */
public interface f extends com.amazon.aps.iva.q5.o {

    /* compiled from: DataSource.java */
    /* loaded from: classes.dex */
    public interface a {
        f a();
    }

    long b(i iVar) throws IOException;

    void close() throws IOException;

    default Map<String, List<String>> d() {
        return Collections.emptyMap();
    }

    Uri getUri();

    void j(y yVar);
}
