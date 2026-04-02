package com.amazon.aps.iva.ka;

import android.graphics.Color;
import android.graphics.PointF;
import com.amazon.aps.iva.la.c;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: JsonUtils.java */
/* loaded from: classes.dex */
public final class s {
    public static final c.a a = c.a.a("x", "y");

    /* compiled from: JsonUtils.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.b.values().length];
            a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static int a(com.amazon.aps.iva.la.c cVar) throws IOException {
        cVar.a();
        int n = (int) (cVar.n() * 255.0d);
        int n2 = (int) (cVar.n() * 255.0d);
        int n3 = (int) (cVar.n() * 255.0d);
        while (cVar.k()) {
            cVar.A();
        }
        cVar.f();
        return Color.argb(255, n, n2, n3);
    }

    public static PointF b(com.amazon.aps.iva.la.c cVar, float f) throws IOException {
        int i = a.a[cVar.t().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    cVar.c();
                    float f2 = 0.0f;
                    float f3 = 0.0f;
                    while (cVar.k()) {
                        int x = cVar.x(a);
                        if (x != 0) {
                            if (x != 1) {
                                cVar.y();
                                cVar.A();
                            } else {
                                f3 = d(cVar);
                            }
                        } else {
                            f2 = d(cVar);
                        }
                    }
                    cVar.h();
                    return new PointF(f2 * f, f3 * f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + cVar.t());
            }
            cVar.a();
            float n = (float) cVar.n();
            float n2 = (float) cVar.n();
            while (cVar.t() != c.b.END_ARRAY) {
                cVar.A();
            }
            cVar.f();
            return new PointF(n * f, n2 * f);
        }
        float n3 = (float) cVar.n();
        float n4 = (float) cVar.n();
        while (cVar.k()) {
            cVar.A();
        }
        return new PointF(n3 * f, n4 * f);
    }

    public static ArrayList c(com.amazon.aps.iva.la.c cVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.a();
        while (cVar.t() == c.b.BEGIN_ARRAY) {
            cVar.a();
            arrayList.add(b(cVar, f));
            cVar.f();
        }
        cVar.f();
        return arrayList;
    }

    public static float d(com.amazon.aps.iva.la.c cVar) throws IOException {
        c.b t = cVar.t();
        int i = a.a[t.ordinal()];
        if (i != 1) {
            if (i == 2) {
                cVar.a();
                float n = (float) cVar.n();
                while (cVar.k()) {
                    cVar.A();
                }
                cVar.f();
                return n;
            }
            throw new IllegalArgumentException("Unknown value for token of type " + t);
        }
        return (float) cVar.n();
    }
}
