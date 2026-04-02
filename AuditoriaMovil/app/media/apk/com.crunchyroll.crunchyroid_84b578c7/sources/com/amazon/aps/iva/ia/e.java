package com.amazon.aps.iva.ia;

import com.amazon.aps.iva.ga.j;
import com.amazon.aps.iva.ga.k;
import com.amazon.aps.iva.j9.i0;
import java.util.List;
import java.util.Locale;
/* compiled from: Layer.java */
/* loaded from: classes.dex */
public final class e {
    public final List<com.amazon.aps.iva.ha.b> a;
    public final com.amazon.aps.iva.z9.h b;
    public final String c;
    public final long d;
    public final a e;
    public final long f;
    public final String g;
    public final List<com.amazon.aps.iva.ha.g> h;
    public final k i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final com.amazon.aps.iva.ga.i q;
    public final j r;
    public final com.amazon.aps.iva.ga.b s;
    public final List<com.amazon.aps.iva.na.a<Float>> t;
    public final b u;
    public final boolean v;
    public final i0 w;
    public final com.amazon.aps.iva.ka.j x;

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<com.amazon.aps.iva.ha.b> list, com.amazon.aps.iva.z9.h hVar, String str, long j, a aVar, long j2, String str2, List<com.amazon.aps.iva.ha.g> list2, k kVar, int i, int i2, int i3, float f, float f2, float f3, float f4, com.amazon.aps.iva.ga.i iVar, j jVar, List<com.amazon.aps.iva.na.a<Float>> list3, b bVar, com.amazon.aps.iva.ga.b bVar2, boolean z, i0 i0Var, com.amazon.aps.iva.ka.j jVar2) {
        this.a = list;
        this.b = hVar;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = kVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = iVar;
        this.r = jVar;
        this.t = list3;
        this.u = bVar;
        this.s = bVar2;
        this.v = z;
        this.w = i0Var;
        this.x = jVar2;
    }

    public final String a(String str) {
        int i;
        StringBuilder b2 = defpackage.c.b(str);
        b2.append(this.c);
        b2.append("\n");
        com.amazon.aps.iva.z9.h hVar = this.b;
        e eVar = (e) hVar.h.d(this.f, null);
        if (eVar != null) {
            b2.append("\t\tParents: ");
            b2.append(eVar.c);
            for (e eVar2 = (e) hVar.h.d(eVar.f, null); eVar2 != null; eVar2 = (e) hVar.h.d(eVar2.f, null)) {
                b2.append("->");
                b2.append(eVar2.c);
            }
            b2.append(str);
            b2.append("\n");
        }
        List<com.amazon.aps.iva.ha.g> list = this.h;
        if (!list.isEmpty()) {
            b2.append(str);
            b2.append("\tMasks: ");
            b2.append(list.size());
            b2.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            b2.append(str);
            b2.append("\tBackground: ");
            b2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List<com.amazon.aps.iva.ha.b> list2 = this.a;
        if (!list2.isEmpty()) {
            b2.append(str);
            b2.append("\tShapes:\n");
            for (com.amazon.aps.iva.ha.b bVar : list2) {
                b2.append(str);
                b2.append("\t\t");
                b2.append(bVar);
                b2.append("\n");
            }
        }
        return b2.toString();
    }

    public final String toString() {
        return a("");
    }
}
