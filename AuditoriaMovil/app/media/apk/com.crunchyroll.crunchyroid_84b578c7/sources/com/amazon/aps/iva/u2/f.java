package com.amazon.aps.iva.u2;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.u2.e;
import com.amazon.aps.iva.v2.b;
import com.amazon.aps.iva.v2.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ConstraintWidgetContainer.java */
/* loaded from: classes.dex */
public final class f extends m {
    public int A0;
    public int v0;
    public int z0;
    public final com.amazon.aps.iva.v2.b t0 = new com.amazon.aps.iva.v2.b(this);
    public final com.amazon.aps.iva.v2.e u0 = new com.amazon.aps.iva.v2.e(this);
    public b.InterfaceC0780b w0 = null;
    public boolean x0 = false;
    public final com.amazon.aps.iva.s2.d y0 = new com.amazon.aps.iva.s2.d();
    public int B0 = 0;
    public int C0 = 0;
    public c[] D0 = new c[4];
    public c[] E0 = new c[4];
    public int F0 = 257;
    public boolean G0 = false;
    public boolean H0 = false;
    public WeakReference<d> I0 = null;
    public WeakReference<d> J0 = null;
    public WeakReference<d> K0 = null;
    public WeakReference<d> L0 = null;
    public final HashSet<e> M0 = new HashSet<>();
    public final b.a N0 = new b.a();

    public static void V(e eVar, b.InterfaceC0780b interfaceC0780b, b.a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        if (interfaceC0780b == null) {
            return;
        }
        if (eVar.j0 != 8 && !(eVar instanceof h) && !(eVar instanceof a)) {
            e.b[] bVarArr = eVar.V;
            aVar.a = bVarArr[0];
            boolean z5 = true;
            aVar.b = bVarArr[1];
            aVar.c = eVar.r();
            aVar.d = eVar.l();
            aVar.i = false;
            aVar.j = 0;
            e.b bVar = aVar.a;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2) {
                z = true;
            } else {
                z = false;
            }
            if (aVar.b == bVar2) {
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
            if (z && eVar.u(0) && eVar.s == 0 && !z3) {
                aVar.a = e.b.WRAP_CONTENT;
                if (z2 && eVar.t == 0) {
                    aVar.a = e.b.FIXED;
                }
                z = false;
            }
            if (z2 && eVar.u(1) && eVar.t == 0 && !z4) {
                aVar.b = e.b.WRAP_CONTENT;
                if (z && eVar.s == 0) {
                    aVar.b = e.b.FIXED;
                }
                z2 = false;
            }
            if (eVar.B()) {
                aVar.a = e.b.FIXED;
                z = false;
            }
            if (eVar.C()) {
                aVar.b = e.b.FIXED;
                z2 = false;
            }
            int[] iArr = eVar.u;
            if (z3) {
                if (iArr[0] == 4) {
                    aVar.a = e.b.FIXED;
                } else if (!z2) {
                    e.b bVar3 = aVar.b;
                    e.b bVar4 = e.b.FIXED;
                    if (bVar3 == bVar4) {
                        i2 = aVar.d;
                    } else {
                        aVar.a = e.b.WRAP_CONTENT;
                        ((ConstraintLayout.c) interfaceC0780b).b(eVar, aVar);
                        i2 = aVar.f;
                    }
                    aVar.a = bVar4;
                    aVar.c = (int) (eVar.Z * i2);
                }
            }
            if (z4) {
                if (iArr[1] == 4) {
                    aVar.b = e.b.FIXED;
                } else if (!z) {
                    e.b bVar5 = aVar.a;
                    e.b bVar6 = e.b.FIXED;
                    if (bVar5 == bVar6) {
                        i = aVar.c;
                    } else {
                        aVar.b = e.b.WRAP_CONTENT;
                        ((ConstraintLayout.c) interfaceC0780b).b(eVar, aVar);
                        i = aVar.e;
                    }
                    aVar.b = bVar6;
                    if (eVar.a0 == -1) {
                        aVar.d = (int) (i / eVar.Z);
                    } else {
                        aVar.d = (int) (eVar.Z * i);
                    }
                }
            }
            ((ConstraintLayout.c) interfaceC0780b).b(eVar, aVar);
            eVar.O(aVar.e);
            eVar.L(aVar.f);
            eVar.F = aVar.h;
            int i3 = aVar.g;
            eVar.d0 = i3;
            if (i3 <= 0) {
                z5 = false;
            }
            eVar.F = z5;
            aVar.j = 0;
            return;
        }
        aVar.e = 0;
        aVar.f = 0;
    }

    @Override // com.amazon.aps.iva.u2.m, com.amazon.aps.iva.u2.e
    public final void D() {
        this.y0.s();
        this.z0 = 0;
        this.A0 = 0;
        super.D();
    }

    @Override // com.amazon.aps.iva.u2.e
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.s0.size();
        for (int i = 0; i < size; i++) {
            this.s0.get(i).P(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:352:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x061c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0696 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0820 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x082c A[LOOP:14: B:494:0x082a->B:495:0x082c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x090b  */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v16 */
    @Override // com.amazon.aps.iva.u2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 2327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u2.f.R():void");
    }

    public final void S(int i, e eVar) {
        if (i == 0) {
            int i2 = this.B0 + 1;
            c[] cVarArr = this.E0;
            if (i2 >= cVarArr.length) {
                this.E0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.E0;
            int i3 = this.B0;
            cVarArr2[i3] = new c(eVar, 0, this.x0);
            this.B0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.C0 + 1;
            c[] cVarArr3 = this.D0;
            if (i4 >= cVarArr3.length) {
                this.D0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.D0;
            int i5 = this.C0;
            cVarArr4[i5] = new c(eVar, 1, this.x0);
            this.C0 = i5 + 1;
        }
    }

    public final void T(com.amazon.aps.iva.s2.d dVar) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean W = W(64);
        c(dVar, W);
        int size = this.s0.size();
        boolean z5 = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.s0.get(i2);
            boolean[] zArr = eVar.U;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.s0.get(i3);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i4 = 0; i4 < aVar.t0; i4++) {
                        e eVar3 = aVar.s0[i4];
                        if (aVar.v0 || eVar3.d()) {
                            int i5 = aVar.u0;
                            if (i5 != 0 && i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    eVar3.U[1] = true;
                                }
                            } else {
                                eVar3.U[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<e> hashSet = this.M0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar4 = this.s0.get(i6);
            eVar4.getClass();
            if (!(eVar4 instanceof l) && !(eVar4 instanceof h)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                if (eVar4 instanceof l) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.c(dVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<e> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                l lVar = (l) it.next();
                int i7 = 0;
                while (true) {
                    if (i7 < lVar.t0) {
                        if (hashSet.contains(lVar.s0[i7])) {
                            z3 = true;
                            continue;
                            break;
                        }
                        i7++;
                    } else {
                        z3 = false;
                        continue;
                        break;
                    }
                }
                if (z3) {
                    lVar.c(dVar, W);
                    hashSet.remove(lVar);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<e> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().c(dVar, W);
                }
                hashSet.clear();
            }
        }
        if (com.amazon.aps.iva.s2.d.p) {
            HashSet<e> hashSet2 = new HashSet<>();
            for (int i8 = 0; i8 < size; i8++) {
                e eVar5 = this.s0.get(i8);
                eVar5.getClass();
                if (!(eVar5 instanceof l) && !(eVar5 instanceof h)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    hashSet2.add(eVar5);
                }
            }
            if (this.V[0] == e.b.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            b(this, dVar, hashSet2, i, false);
            Iterator<e> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                k.a(this, dVar, next);
                next.c(dVar, W);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                e eVar6 = this.s0.get(i9);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.V;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.M(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.N(e.b.FIXED);
                    }
                    eVar6.c(dVar, W);
                    if (bVar == bVar3) {
                        eVar6.M(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.N(bVar2);
                    }
                } else {
                    k.a(this, dVar, eVar6);
                    if (!(eVar6 instanceof l) && !(eVar6 instanceof h)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        eVar6.c(dVar, W);
                    }
                }
            }
        }
        if (this.B0 > 0) {
            b.a(this, dVar, null, 0);
        }
        if (this.C0 > 0) {
            b.a(this, dVar, null, 1);
        }
    }

    public final boolean U(int i, boolean z) {
        boolean z2;
        e.b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        com.amazon.aps.iva.v2.e eVar = this.u0;
        f fVar = eVar.a;
        e.b k = fVar.k(0);
        e.b k2 = fVar.k(1);
        int s = fVar.s();
        int t = fVar.t();
        ArrayList<p> arrayList = eVar.e;
        if (z4 && (k == (bVar = e.b.WRAP_CONTENT) || k2 == bVar)) {
            Iterator<p> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p next = it.next();
                if (next.f == i && !next.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && k == e.b.WRAP_CONTENT) {
                    fVar.M(e.b.FIXED);
                    fVar.O(eVar.d(fVar, 0));
                    fVar.d.e.d(fVar.r());
                }
            } else if (z4 && k2 == e.b.WRAP_CONTENT) {
                fVar.N(e.b.FIXED);
                fVar.L(eVar.d(fVar, 1));
                fVar.e.e.d(fVar.l());
            }
        }
        e.b[] bVarArr = fVar.V;
        if (i == 0) {
            e.b bVar2 = bVarArr[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int r = fVar.r() + s;
                fVar.d.i.d(r);
                fVar.d.e.d(r - s);
                z2 = true;
            }
            z2 = false;
        } else {
            e.b bVar3 = bVarArr[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int l = fVar.l() + t;
                fVar.e.i.d(l);
                fVar.e.e.d(l - t);
                z2 = true;
            }
            z2 = false;
        }
        eVar.g();
        Iterator<p> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (next2.f == i && (next2.b != fVar || next2.g)) {
                next2.e();
            }
        }
        Iterator<p> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p next3 = it3.next();
            if (next3.f == i && (z2 || next3.b != fVar)) {
                if (!next3.h.j || !next3.i.j || (!(next3 instanceof com.amazon.aps.iva.v2.c) && !next3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        fVar.M(k);
        fVar.N(k2);
        return z3;
    }

    public final boolean W(int i) {
        if ((this.F0 & i) == i) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.u2.e
    public final void o(StringBuilder sb) {
        sb.append(this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.Y);
        sb.append("\n");
        Iterator<e> it = this.s0.iterator();
        while (it.hasNext()) {
            it.next().o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
