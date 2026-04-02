package com.amazon.aps.iva.il;

import com.amazon.aps.iva.dj.g;
import com.amazon.aps.iva.es.z;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.qj.s;
/* compiled from: SkipSegmentAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.il.a {
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.nk.j> a;
    public final com.amazon.aps.iva.xb0.a<w> b;
    public final com.amazon.aps.iva.ds.a c;

    /* compiled from: SkipSegmentAnalytics.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.INTRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.CREDITS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.RECAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public b(com.amazon.aps.iva.ds.a aVar, g.h hVar, g.i iVar) {
        this.a = hVar;
        this.b = iVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.il.a
    public final void a(s sVar) {
        String str;
        com.amazon.aps.iva.yb0.j.f(sVar, "skipEventType");
        w invoke = this.b.invoke();
        float E = n.E(Long.valueOf(this.a.invoke().c));
        int i = a.a[sVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "preview";
                    } else {
                        throw new com.amazon.aps.iva.kb0.h();
                    }
                } else {
                    str = "recap";
                }
            } else {
                str = "credits";
            }
        } else {
            str = "intro";
        }
        this.c.e(new z(invoke, E, str));
    }
}
