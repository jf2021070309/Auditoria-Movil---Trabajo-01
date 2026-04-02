package com.amazon.aps.iva.j1;

import java.util.ArrayList;
/* compiled from: VectorCompose.kt */
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.o0.a<i> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar) {
        super(cVar);
        com.amazon.aps.iva.yb0.j.f(cVar, "root");
    }

    public static c j(i iVar) {
        if (iVar instanceof c) {
            return (c) iVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void a(int i, int i2, int i3) {
        c j = j((i) this.c);
        ArrayList arrayList = j.c;
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                arrayList.remove(i);
                arrayList.add(i2, (i) arrayList.get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                arrayList.remove(i);
                arrayList.add(i2 - 1, (i) arrayList.get(i));
                i4++;
            }
        }
        j.c();
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void b(int i, int i2) {
        j((i) this.c).e(i, i2);
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void c(int i, Object obj) {
        i iVar = (i) obj;
        com.amazon.aps.iva.yb0.j.f(iVar, "instance");
        c j = j((i) this.c);
        j.getClass();
        ArrayList arrayList = j.c;
        if (i < arrayList.size()) {
            arrayList.set(i, iVar);
        } else {
            arrayList.add(iVar);
        }
        iVar.d(j.g);
        j.c();
    }

    @Override // com.amazon.aps.iva.o0.d
    public final void f(int i, Object obj) {
        com.amazon.aps.iva.yb0.j.f((i) obj, "instance");
    }

    @Override // com.amazon.aps.iva.o0.a
    public final void i() {
        c j = j((i) this.a);
        j.e(0, j.c.size());
    }
}
