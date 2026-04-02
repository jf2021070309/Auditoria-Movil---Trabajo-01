package com.amazon.aps.iva.j6;

import com.amazon.aps.iva.m6.q;
import java.util.Collections;
import java.util.List;
/* compiled from: HlsPlaylist.java */
/* loaded from: classes.dex */
public abstract class f implements q<f> {
    public final String a;
    public final List<String> b;
    public final boolean c;

    public f(String str, List<String> list, boolean z) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
