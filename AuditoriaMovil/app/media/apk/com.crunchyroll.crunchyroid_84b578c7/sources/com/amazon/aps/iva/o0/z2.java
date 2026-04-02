package com.amazon.aps.iva.o0;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class z2 implements Iterable<Object>, com.amazon.aps.iva.zb0.a {
    public int c;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public int[] b = new int[0];
    public Object[] d = new Object[0];
    public ArrayList<c> i = new ArrayList<>();

    public final c b() {
        boolean z;
        if (!this.g) {
            int i = this.c;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ArrayList<c> arrayList = this.i;
                int f0 = com.amazon.aps.iva.ab.x.f0(arrayList, 0, i);
                if (f0 < 0) {
                    c cVar = new c(0);
                    arrayList.add(-(f0 + 1), cVar);
                    return cVar;
                }
                c cVar2 = arrayList.get(f0);
                com.amazon.aps.iva.yb0.j.e(cVar2, "get(location)");
                return cVar2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        e0.c("use active SlotWriter to create an anchor location instead ".toString());
        throw null;
    }

    public final int d(c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "anchor");
        boolean z = true;
        if (!this.g) {
            int i = cVar.a;
            if (i == Integer.MIN_VALUE) {
                z = false;
            }
            if (z) {
                return i;
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        e0.c("Use active SlotWriter to determine anchor location instead".toString());
        throw null;
    }

    public final boolean e(int i, c cVar) {
        boolean z;
        boolean z2;
        if (!this.g) {
            if (i >= 0 && i < this.c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (k(cVar)) {
                    int k = com.amazon.aps.iva.ab.x.k(i, this.b) + i;
                    int i2 = cVar.a;
                    if (i <= i2 && i2 < k) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                }
                return false;
            }
            e0.c("Invalid group index".toString());
            throw null;
        }
        e0.c("Writer is active".toString());
        throw null;
    }

    public final y2 g() {
        if (!this.g) {
            this.f++;
            return new y2(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new z0(0, this.c, this);
    }

    public final b3 j() {
        boolean z;
        if (!this.g) {
            if (this.f <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.g = true;
                this.h++;
                return new b3(this);
            }
            e0.c("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        e0.c("Cannot start a writer when another writer is pending".toString());
        throw null;
    }

    public final boolean k(c cVar) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(cVar, "anchor");
        int i = cVar.a;
        if (i != Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int f0 = com.amazon.aps.iva.ab.x.f0(this.i, i, this.c);
            if (f0 >= 0 && com.amazon.aps.iva.yb0.j.a(this.i.get(f0), cVar)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
