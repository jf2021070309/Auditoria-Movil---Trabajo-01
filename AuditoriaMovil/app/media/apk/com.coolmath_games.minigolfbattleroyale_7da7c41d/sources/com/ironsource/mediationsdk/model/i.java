package com.ironsource.mediationsdk.model;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class i {
    public ArrayList<InterstitialPlacement> a;
    public c b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public String g;
    public String h;
    public com.ironsource.mediationsdk.utils.b i;
    public InterstitialPlacement j;

    public i() {
        this.a = new ArrayList<>();
        this.b = new c();
    }

    public i(int i, boolean z, int i2, c cVar, com.ironsource.mediationsdk.utils.b bVar, int i3) {
        this.a = new ArrayList<>();
        this.c = i;
        this.d = z;
        this.e = i2;
        this.b = cVar;
        this.i = bVar;
        this.f = i3;
    }

    public final InterstitialPlacement a() {
        Iterator<InterstitialPlacement> it = this.a.iterator();
        while (it.hasNext()) {
            InterstitialPlacement next = it.next();
            if (next.isDefault()) {
                return next;
            }
        }
        return this.j;
    }
}
