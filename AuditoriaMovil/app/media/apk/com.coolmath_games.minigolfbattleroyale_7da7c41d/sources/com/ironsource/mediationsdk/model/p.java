package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class p {
    public ArrayList<Placement> a;
    public c b;
    public int c;
    public boolean d;
    public int e;
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;
    public Placement k;
    public com.ironsource.mediationsdk.utils.b l;

    public p() {
        this.a = new ArrayList<>();
        this.b = new c();
    }

    public p(int i, boolean z, int i2, int i3, int i4, c cVar, com.ironsource.mediationsdk.utils.b bVar, int i5) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.h = i3;
        this.b = cVar;
        this.i = i4;
        this.l = bVar;
        this.j = i5;
    }

    public final Placement a() {
        Iterator<Placement> it = this.a.iterator();
        while (it.hasNext()) {
            Placement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.k;
    }
}
