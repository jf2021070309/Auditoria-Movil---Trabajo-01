package com.amazon.aps.iva.g6;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: MediaDrmCallbackException.java */
/* loaded from: classes.dex */
public final class u extends IOException {
    public final Uri b;
    public final Map<String, List<String>> c;
    public final long d;

    public u(com.amazon.aps.iva.w5.i iVar, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
