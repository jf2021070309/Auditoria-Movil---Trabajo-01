package com.amazon.aps.iva.mc;

import android.content.ContentResolver;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.List;
/* compiled from: ThumbnailStreamOpener.java */
/* loaded from: classes.dex */
public final class c {
    public final b a;
    public final com.amazon.aps.iva.oc.b b;
    public final ContentResolver c;
    public final List<ImageHeaderParser> d;

    static {
        new com.amazon.aps.iva.u0.b(6);
    }

    public c(List<ImageHeaderParser> list, b bVar, com.amazon.aps.iva.oc.b bVar2, ContentResolver contentResolver) {
        this.a = bVar;
        this.b = bVar2;
        this.c = contentResolver;
        this.d = list;
    }
}
