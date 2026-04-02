package com.amazon.aps.iva.g3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.amazon.aps.iva.f3.d;
import com.google.android.gms.cast.MediaError;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class o {

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        boolean a(T t);

        int b(T t);
    }

    public o() {
        new ConcurrentHashMap();
    }

    public static <T> T d(T[] tArr, int i, a<T> aVar) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = MediaError.DetailedErrorCode.MANIFEST_UNKNOWN;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = Math.abs(aVar.b(t2) - i2) * 2;
            if (aVar.a(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, com.amazon.aps.iva.m3.l[] lVarArr, int i) {
        throw null;
    }

    public Typeface c(Context context, Resources resources, int i, String str, int i2) {
        File d = p.d(context);
        if (d == null) {
            return null;
        }
        try {
            if (!p.b(d, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(d.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d.delete();
        }
    }

    public com.amazon.aps.iva.m3.l e(int i, com.amazon.aps.iva.m3.l[] lVarArr) {
        return (com.amazon.aps.iva.m3.l) d(lVarArr, i, new n());
    }
}
