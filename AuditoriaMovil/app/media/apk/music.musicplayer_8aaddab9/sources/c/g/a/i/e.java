package c.g.a.i;

import androidx.constraintlayout.widget.ConstraintLayout;
import c.g.a.i.d;
import c.g.a.i.l.b;
import c.g.a.i.l.o;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class e extends k {
    public int u0;
    public int y0;
    public int z0;
    public c.g.a.i.l.b s0 = new c.g.a.i.l.b(this);
    public c.g.a.i.l.e t0 = new c.g.a.i.l.e(this);
    public b.InterfaceC0029b v0 = null;
    public boolean w0 = false;
    public c.g.a.d x0 = new c.g.a.d();
    public int A0 = 0;
    public int B0 = 0;
    public b[] C0 = new b[4];
    public b[] D0 = new b[4];
    public int E0 = 257;
    public boolean F0 = false;
    public boolean G0 = false;
    public WeakReference<c> H0 = null;
    public WeakReference<c> I0 = null;
    public WeakReference<c> J0 = null;
    public WeakReference<c> K0 = null;
    public HashSet<d> L0 = new HashSet<>();
    public b.a M0 = new b.a();

    public static boolean f0(d dVar, b.InterfaceC0029b interfaceC0029b, b.a aVar, int i2) {
        int i3;
        int i4;
        if (interfaceC0029b == null) {
            return false;
        }
        if (dVar.i0 == 8 || (dVar instanceof f) || (dVar instanceof a)) {
            aVar.f1759e = 0;
            aVar.f1760f = 0;
            return false;
        }
        aVar.a = dVar.m();
        aVar.f1756b = dVar.t();
        aVar.f1757c = dVar.u();
        aVar.f1758d = dVar.l();
        aVar.f1763i = false;
        aVar.f1764j = i2;
        d.a aVar2 = aVar.a;
        d.a aVar3 = d.a.MATCH_CONSTRAINT;
        boolean z = aVar2 == aVar3;
        boolean z2 = aVar.f1756b == aVar3;
        boolean z3 = z && dVar.Y > 0.0f;
        boolean z4 = z2 && dVar.Y > 0.0f;
        if (z && dVar.x(0) && dVar.r == 0 && !z3) {
            aVar.a = d.a.WRAP_CONTENT;
            if (z2 && dVar.s == 0) {
                aVar.a = d.a.FIXED;
            }
            z = false;
        }
        if (z2 && dVar.x(1) && dVar.s == 0 && !z4) {
            aVar.f1756b = d.a.WRAP_CONTENT;
            if (z && dVar.r == 0) {
                aVar.f1756b = d.a.FIXED;
            }
            z2 = false;
        }
        if (dVar.E()) {
            aVar.a = d.a.FIXED;
            z = false;
        }
        if (dVar.F()) {
            aVar.f1756b = d.a.FIXED;
            z2 = false;
        }
        if (z3) {
            if (dVar.t[0] == 4) {
                aVar.a = d.a.FIXED;
            } else if (!z2) {
                d.a aVar4 = aVar.f1756b;
                d.a aVar5 = d.a.FIXED;
                if (aVar4 == aVar5) {
                    i4 = aVar.f1758d;
                } else {
                    aVar.a = d.a.WRAP_CONTENT;
                    ((ConstraintLayout.b) interfaceC0029b).b(dVar, aVar);
                    i4 = aVar.f1760f;
                }
                aVar.a = aVar5;
                aVar.f1757c = (int) (dVar.Y * i4);
            }
        }
        if (z4) {
            if (dVar.t[1] == 4) {
                aVar.f1756b = d.a.FIXED;
            } else if (!z) {
                d.a aVar6 = aVar.a;
                d.a aVar7 = d.a.FIXED;
                if (aVar6 == aVar7) {
                    i3 = aVar.f1757c;
                } else {
                    aVar.f1756b = d.a.WRAP_CONTENT;
                    ((ConstraintLayout.b) interfaceC0029b).b(dVar, aVar);
                    i3 = aVar.f1759e;
                }
                aVar.f1756b = aVar7;
                if (dVar.Z == -1) {
                    aVar.f1758d = (int) (i3 / dVar.Y);
                } else {
                    aVar.f1758d = (int) (dVar.Y * i3);
                }
            }
        }
        ((ConstraintLayout.b) interfaceC0029b).b(dVar, aVar);
        dVar.T(aVar.f1759e);
        dVar.O(aVar.f1760f);
        dVar.E = aVar.f1762h;
        dVar.L(aVar.f1761g);
        aVar.f1764j = 0;
        return aVar.f1763i;
    }

    @Override // c.g.a.i.k, c.g.a.i.d
    public void G() {
        this.x0.u();
        this.y0 = 0;
        this.z0 = 0;
        super.G();
    }

    @Override // c.g.a.i.d
    public void U(boolean z, boolean z2) {
        super.U(z, z2);
        int size = this.r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r0.get(i2).U(z, z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:348:0x05d5, code lost:
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:333:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x07ea A[LOOP:14: B:463:0x07e8->B:464:0x07ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08d0  */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // c.g.a.i.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W() {
        /*
            Method dump skipped, instructions count: 2272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.i.e.W():void");
    }

    public void X(d dVar, int i2) {
        if (i2 == 0) {
            int i3 = this.A0 + 1;
            b[] bVarArr = this.D0;
            if (i3 >= bVarArr.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.D0;
            int i4 = this.A0;
            bVarArr2[i4] = new b(dVar, 0, this.w0);
            this.A0 = i4 + 1;
        } else if (i2 == 1) {
            int i5 = this.B0 + 1;
            b[] bVarArr3 = this.C0;
            if (i5 >= bVarArr3.length) {
                this.C0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.C0;
            int i6 = this.B0;
            bVarArr4[i6] = new b(dVar, 1, this.w0);
            this.B0 = i6 + 1;
        }
    }

    public boolean Y(c.g.a.d dVar) {
        boolean z;
        boolean g0 = g0(64);
        d(dVar, g0);
        int size = this.r0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.r0.get(i2);
            boolean[] zArr = dVar2.T;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar2 instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                d dVar3 = this.r0.get(i3);
                if (dVar3 instanceof a) {
                    a aVar = (a) dVar3;
                    for (int i4 = 0; i4 < aVar.s0; i4++) {
                        d dVar4 = aVar.r0[i4];
                        if (aVar.u0 || dVar4.e()) {
                            int i5 = aVar.t0;
                            if (i5 == 0 || i5 == 1) {
                                dVar4.T[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                dVar4.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.L0.clear();
        for (int i6 = 0; i6 < size; i6++) {
            d dVar5 = this.r0.get(i6);
            if (dVar5.c()) {
                if (dVar5 instanceof j) {
                    this.L0.add(dVar5);
                } else {
                    dVar5.d(dVar, g0);
                }
            }
        }
        while (this.L0.size() > 0) {
            int size2 = this.L0.size();
            Iterator<d> it = this.L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j jVar = (j) it.next();
                HashSet<d> hashSet = this.L0;
                int i7 = 0;
                while (true) {
                    if (i7 >= jVar.s0) {
                        z = false;
                        continue;
                        break;
                    } else if (hashSet.contains(jVar.r0[i7])) {
                        z = true;
                        continue;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (z) {
                    jVar.d(dVar, g0);
                    this.L0.remove(jVar);
                    break;
                }
            }
            if (size2 == this.L0.size()) {
                Iterator<d> it2 = this.L0.iterator();
                while (it2.hasNext()) {
                    it2.next().d(dVar, g0);
                }
                this.L0.clear();
            }
        }
        if (c.g.a.d.a) {
            HashSet<d> hashSet2 = new HashSet<>();
            for (int i8 = 0; i8 < size; i8++) {
                d dVar6 = this.r0.get(i8);
                if (!dVar6.c()) {
                    hashSet2.add(dVar6);
                }
            }
            b(this, dVar, hashSet2, m() == d.a.WRAP_CONTENT ? 0 : 1, false);
            Iterator<d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d next = it3.next();
                i.a(this, dVar, next);
                next.d(dVar, g0);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                d dVar7 = this.r0.get(i9);
                if (dVar7 instanceof e) {
                    d.a[] aVarArr = dVar7.U;
                    d.a aVar2 = aVarArr[0];
                    d.a aVar3 = aVarArr[1];
                    d.a aVar4 = d.a.WRAP_CONTENT;
                    if (aVar2 == aVar4) {
                        dVar7.P(d.a.FIXED);
                    }
                    if (aVar3 == aVar4) {
                        dVar7.S(d.a.FIXED);
                    }
                    dVar7.d(dVar, g0);
                    if (aVar2 == aVar4) {
                        dVar7.P(aVar2);
                    }
                    if (aVar3 == aVar4) {
                        dVar7.S(aVar3);
                    }
                } else {
                    i.a(this, dVar, dVar7);
                    if (!dVar7.c()) {
                        dVar7.d(dVar, g0);
                    }
                }
            }
        }
        if (this.A0 > 0) {
            c.e.a.a(this, dVar, null, 0);
        }
        if (this.B0 > 0) {
            c.e.a.a(this, dVar, null, 1);
        }
        return true;
    }

    public void Z(c cVar) {
        WeakReference<c> weakReference = this.K0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.K0.get().c()) {
            this.K0 = new WeakReference<>(cVar);
        }
    }

    public void a0(c cVar) {
        WeakReference<c> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.I0.get().c()) {
            this.I0 = new WeakReference<>(cVar);
        }
    }

    public void b0(c cVar) {
        WeakReference<c> weakReference = this.J0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.J0.get().c()) {
            this.J0 = new WeakReference<>(cVar);
        }
    }

    public void c0(c cVar) {
        WeakReference<c> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || cVar.c() > this.H0.get().c()) {
            this.H0 = new WeakReference<>(cVar);
        }
    }

    public boolean d0(boolean z, int i2) {
        boolean z2;
        d.a aVar;
        c.g.a.i.l.e eVar = this.t0;
        boolean z3 = true;
        boolean z4 = z & true;
        d.a k2 = eVar.a.k(0);
        d.a k3 = eVar.a.k(1);
        int v = eVar.a.v();
        int w = eVar.a.w();
        if (z4 && (k2 == (aVar = d.a.WRAP_CONTENT) || k3 == aVar)) {
            Iterator<o> it = eVar.f1770e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o next = it.next();
                if (next.f1802f == i2 && !next.k()) {
                    z4 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z4 && k2 == d.a.WRAP_CONTENT) {
                    eVar.a.P(d.a.FIXED);
                    e eVar2 = eVar.a;
                    eVar2.T(eVar.d(eVar2, 0));
                    e eVar3 = eVar.a;
                    eVar3.f1743d.f1801e.c(eVar3.u());
                }
            } else if (z4 && k3 == d.a.WRAP_CONTENT) {
                eVar.a.S(d.a.FIXED);
                e eVar4 = eVar.a;
                eVar4.O(eVar.d(eVar4, 1));
                e eVar5 = eVar.a;
                eVar5.f1744e.f1801e.c(eVar5.l());
            }
        }
        if (i2 == 0) {
            e eVar6 = eVar.a;
            d.a[] aVarArr = eVar6.U;
            if (aVarArr[0] == d.a.FIXED || aVarArr[0] == d.a.MATCH_PARENT) {
                int u = eVar6.u() + v;
                eVar.a.f1743d.f1805i.c(u);
                eVar.a.f1743d.f1801e.c(u - v);
                z2 = true;
            }
            z2 = false;
        } else {
            e eVar7 = eVar.a;
            d.a[] aVarArr2 = eVar7.U;
            if (aVarArr2[1] == d.a.FIXED || aVarArr2[1] == d.a.MATCH_PARENT) {
                int l2 = eVar7.l() + w;
                eVar.a.f1744e.f1805i.c(l2);
                eVar.a.f1744e.f1801e.c(l2 - w);
                z2 = true;
            }
            z2 = false;
        }
        eVar.g();
        Iterator<o> it2 = eVar.f1770e.iterator();
        while (it2.hasNext()) {
            o next2 = it2.next();
            if (next2.f1802f == i2 && (next2.f1798b != eVar.a || next2.f1803g)) {
                next2.e();
            }
        }
        Iterator<o> it3 = eVar.f1770e.iterator();
        while (it3.hasNext()) {
            o next3 = it3.next();
            if (next3.f1802f == i2 && (z2 || next3.f1798b != eVar.a)) {
                if (!next3.f1804h.f1782j || !next3.f1805i.f1782j || (!(next3 instanceof c.g.a.i.l.c) && !next3.f1801e.f1782j)) {
                    z3 = false;
                    break;
                }
            }
        }
        eVar.a.P(k2);
        eVar.a.S(k3);
        return z3;
    }

    public void e0() {
        this.t0.f1767b = true;
    }

    public boolean g0(int i2) {
        return (this.E0 & i2) == i2;
    }

    public void h0(int i2) {
        this.E0 = i2;
        c.g.a.d.a = g0(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    @Override // c.g.a.i.d
    public void q(StringBuilder sb) {
        sb.append(this.f1749j + ":{\n");
        sb.append("  actualWidth:" + this.W);
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        Iterator<d> it = this.r0.iterator();
        while (it.hasNext()) {
            it.next().q(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
