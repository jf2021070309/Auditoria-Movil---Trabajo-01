package com.amazon.aps.iva.v2;

import java.util.ArrayList;
/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public final class m {
    public final p a;
    public final ArrayList<p> b = new ArrayList<>();

    public m(p pVar) {
        this.a = null;
        this.a = pVar;
    }

    public static long a(f fVar, long j) {
        p pVar = fVar.d;
        if (pVar instanceof k) {
            return j;
        }
        ArrayList arrayList = fVar.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != pVar) {
                    j2 = Math.min(j2, a(fVar2, fVar2.f + j));
                }
            }
        }
        if (fVar == pVar.i) {
            long j3 = pVar.j();
            f fVar3 = pVar.h;
            long j4 = j - j3;
            return Math.min(Math.min(j2, a(fVar3, j4)), j4 - fVar3.f);
        }
        return j2;
    }

    public static long b(f fVar, long j) {
        p pVar = fVar.d;
        if (pVar instanceof k) {
            return j;
        }
        ArrayList arrayList = fVar.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.d != pVar) {
                    j2 = Math.max(j2, b(fVar2, fVar2.f + j));
                }
            }
        }
        if (fVar == pVar.h) {
            long j3 = pVar.j();
            f fVar3 = pVar.i;
            long j4 = j + j3;
            return Math.max(Math.max(j2, b(fVar3, j4)), j4 - fVar3.f);
        }
        return j2;
    }
}
