package com.amazon.aps.iva.v2;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.u2.e;
import java.util.ArrayList;
/* compiled from: BasicMeasure.java */
/* loaded from: classes.dex */
public final class b {
    public final ArrayList<com.amazon.aps.iva.u2.e> a = new ArrayList<>();
    public final a b = new a();
    public final com.amazon.aps.iva.u2.f c;

    /* compiled from: BasicMeasure.java */
    /* loaded from: classes.dex */
    public static class a {
        public e.b a;
        public e.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* compiled from: BasicMeasure.java */
    /* renamed from: com.amazon.aps.iva.v2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0780b {
    }

    public b(com.amazon.aps.iva.u2.f fVar) {
        this.c = fVar;
    }

    public final boolean a(int i, com.amazon.aps.iva.u2.e eVar, InterfaceC0780b interfaceC0780b) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        e.b[] bVarArr = eVar.V;
        e.b bVar = bVarArr[0];
        a aVar = this.b;
        aVar.a = bVar;
        boolean z5 = true;
        aVar.b = bVarArr[1];
        aVar.c = eVar.r();
        aVar.d = eVar.l();
        aVar.i = false;
        aVar.j = i;
        e.b bVar2 = aVar.a;
        e.b bVar3 = e.b.MATCH_CONSTRAINT;
        if (bVar2 == bVar3) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.b == bVar3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && eVar.Z > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && eVar.Z > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        int[] iArr = eVar.u;
        if (z3 && iArr[0] == 4) {
            aVar.a = e.b.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            aVar.b = e.b.FIXED;
        }
        ((ConstraintLayout.c) interfaceC0780b).b(eVar, aVar);
        eVar.O(aVar.e);
        eVar.L(aVar.f);
        eVar.F = aVar.h;
        int i2 = aVar.g;
        eVar.d0 = i2;
        if (i2 <= 0) {
            z5 = false;
        }
        eVar.F = z5;
        aVar.j = 0;
        return aVar.i;
    }

    public final void b(com.amazon.aps.iva.u2.f fVar, int i, int i2, int i3) {
        int i4 = fVar.e0;
        int i5 = fVar.f0;
        fVar.e0 = 0;
        fVar.f0 = 0;
        fVar.O(i2);
        fVar.L(i3);
        if (i4 < 0) {
            fVar.e0 = 0;
        } else {
            fVar.e0 = i4;
        }
        if (i5 < 0) {
            fVar.f0 = 0;
        } else {
            fVar.f0 = i5;
        }
        com.amazon.aps.iva.u2.f fVar2 = this.c;
        fVar2.v0 = i;
        fVar2.R();
    }

    public final void c(com.amazon.aps.iva.u2.f fVar) {
        ArrayList<com.amazon.aps.iva.u2.e> arrayList = this.a;
        arrayList.clear();
        int size = fVar.s0.size();
        for (int i = 0; i < size; i++) {
            com.amazon.aps.iva.u2.e eVar = fVar.s0.get(i);
            e.b[] bVarArr = eVar.V;
            e.b bVar = bVarArr[0];
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 || bVarArr[1] == bVar2) {
                arrayList.add(eVar);
            }
        }
        fVar.u0.b = true;
    }
}
