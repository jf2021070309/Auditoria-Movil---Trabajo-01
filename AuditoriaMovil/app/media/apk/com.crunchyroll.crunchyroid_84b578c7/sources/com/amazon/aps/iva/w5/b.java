package com.amazon.aps.iva.w5;

import com.amazon.aps.iva.t5.g0;
import java.util.ArrayList;
/* compiled from: BaseDataSource.java */
/* loaded from: classes.dex */
public abstract class b implements f {
    public final boolean a;
    public final ArrayList<y> b = new ArrayList<>(1);
    public int c;
    public i d;

    public b(boolean z) {
        this.a = z;
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void j(y yVar) {
        yVar.getClass();
        ArrayList<y> arrayList = this.b;
        if (!arrayList.contains(yVar)) {
            arrayList.add(yVar);
            this.c++;
        }
    }

    public final void m(int i) {
        i iVar = this.d;
        int i2 = g0.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            this.b.get(i3).h(iVar, this.a, i);
        }
    }

    public final void n() {
        i iVar = this.d;
        int i = g0.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).d(iVar, this.a);
        }
        this.d = null;
    }

    public final void o(i iVar) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).b();
        }
    }

    public final void p(i iVar) {
        this.d = iVar;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).a(iVar, this.a);
        }
    }
}
