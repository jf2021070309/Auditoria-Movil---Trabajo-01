package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class f {
    public c a;
    public long b;
    public ArrayList<g> c;
    public g d;
    public int e;
    public int f;
    public com.ironsource.mediationsdk.utils.b g;
    private int h;

    public f() {
        this.a = new c();
        this.c = new ArrayList<>();
    }

    public f(int i, long j, c cVar, int i2, com.ironsource.mediationsdk.utils.b bVar, int i3) {
        this.c = new ArrayList<>();
        this.h = i;
        this.b = j;
        this.a = cVar;
        this.e = i2;
        this.f = i3;
        this.g = bVar;
    }

    public final g a() {
        Iterator<g> it = this.c.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.d;
    }

    public final g a(String str) {
        Iterator<g> it = this.c.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next.getPlacementName().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
