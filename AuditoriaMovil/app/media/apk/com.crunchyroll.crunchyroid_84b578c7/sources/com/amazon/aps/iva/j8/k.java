package com.amazon.aps.iva.j8;

import androidx.recyclerview.widget.n;
/* compiled from: PagedStorageDiffHelper.java */
/* loaded from: classes.dex */
public final class k extends n.b {
    public final /* synthetic */ j a;
    public final /* synthetic */ int b;
    public final /* synthetic */ j c;
    public final /* synthetic */ n.e d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public k(j jVar, int i, j jVar2, n.e eVar, int i2, int i3) {
        this.a = jVar;
        this.b = i;
        this.c = jVar2;
        this.d = eVar;
        this.e = i2;
        this.f = i3;
    }

    @Override // androidx.recyclerview.widget.n.b
    public final boolean areContentsTheSame(int i, int i2) {
        Object obj = this.a.get(i + this.b);
        j jVar = this.c;
        Object obj2 = jVar.get(i2 + jVar.b);
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return this.d.areContentsTheSame(obj, obj2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.b
    public final boolean areItemsTheSame(int i, int i2) {
        Object obj = this.a.get(i + this.b);
        j jVar = this.c;
        Object obj2 = jVar.get(i2 + jVar.b);
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return this.d.areItemsTheSame(obj, obj2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.b
    public final Object getChangePayload(int i, int i2) {
        Object obj = this.a.get(i + this.b);
        j jVar = this.c;
        Object obj2 = jVar.get(i2 + jVar.b);
        if (obj != null && obj2 != null) {
            return this.d.getChangePayload(obj, obj2);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n.b
    public final int getNewListSize() {
        return this.f;
    }

    @Override // androidx.recyclerview.widget.n.b
    public final int getOldListSize() {
        return this.e;
    }
}
