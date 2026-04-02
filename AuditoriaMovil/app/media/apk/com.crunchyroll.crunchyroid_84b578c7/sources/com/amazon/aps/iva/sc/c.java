package com.amazon.aps.iva.sc;

import android.content.Context;
import android.net.Uri;
import com.amazon.aps.iva.kc.h;
import com.amazon.aps.iva.mc.a;
import com.amazon.aps.iva.rc.o;
import com.amazon.aps.iva.rc.p;
import com.amazon.aps.iva.rc.s;
import com.amazon.aps.iva.uc.d0;
import java.io.InputStream;
/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: classes.dex */
public final class c implements o<Uri, InputStream> {
    public final Context a;

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.amazon.aps.iva.rc.o
    public final o.a<InputStream> buildLoadData(Uri uri, int i, int i2, h hVar) {
        boolean z;
        Uri uri2 = uri;
        boolean z2 = true;
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Long l = (Long) hVar.c(d0.d);
            if (l == null || l.longValue() != -1) {
                z2 = false;
            }
            if (z2) {
                com.amazon.aps.iva.gd.b bVar = new com.amazon.aps.iva.gd.b(uri2);
                Context context = this.a;
                return new o.a<>(bVar, com.amazon.aps.iva.mc.a.c(context, uri2, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }

    @Override // com.amazon.aps.iva.rc.o
    public final boolean handles(Uri uri) {
        Uri uri2 = uri;
        if (com.amazon.aps.iva.cq.b.X(uri2) && uri2.getPathSegments().contains("video")) {
            return true;
        }
        return false;
    }

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.amazon.aps.iva.rc.p
        public final o<Uri, InputStream> build(s sVar) {
            return new c(this.a);
        }

        @Override // com.amazon.aps.iva.rc.p
        public final void teardown() {
        }
    }
}
