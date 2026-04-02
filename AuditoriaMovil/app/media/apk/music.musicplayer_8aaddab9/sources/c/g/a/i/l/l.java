package c.g.a.i.l;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class l {
    public static int a;

    /* renamed from: b  reason: collision with root package name */
    public o f1789b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<o> f1790c = new ArrayList<>();

    public l(o oVar, int i2) {
        this.f1789b = null;
        a++;
        this.f1789b = oVar;
    }

    public final long a(f fVar, long j2) {
        o oVar = fVar.f1776d;
        if (oVar instanceof j) {
            return j2;
        }
        int size = fVar.f1783k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f1783k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1776d != oVar) {
                    j3 = Math.min(j3, a(fVar2, fVar2.f1778f + j2));
                }
            }
        }
        if (fVar == oVar.f1805i) {
            long j4 = j2 - oVar.j();
            return Math.min(Math.min(j3, a(oVar.f1804h, j4)), j4 - oVar.f1804h.f1778f);
        }
        return j3;
    }

    public final long b(f fVar, long j2) {
        o oVar = fVar.f1776d;
        if (oVar instanceof j) {
            return j2;
        }
        int size = fVar.f1783k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f1783k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f1776d != oVar) {
                    j3 = Math.max(j3, b(fVar2, fVar2.f1778f + j2));
                }
            }
        }
        if (fVar == oVar.f1804h) {
            long j4 = j2 + oVar.j();
            return Math.max(Math.max(j3, b(oVar.f1805i, j4)), j4 - oVar.f1805i.f1778f);
        }
        return j3;
    }
}
