package c.g.a.i;

import c.g.a.i.c;
import c.g.a.i.l.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class d {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public c J;
    public c K;
    public c L;
    public c M;
    public c N;
    public c O;
    public c P;
    public c Q;
    public c[] R;
    public ArrayList<c> S;
    public boolean[] T;
    public a[] U;
    public d V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public int a0;

    /* renamed from: b  reason: collision with root package name */
    public c.g.a.i.l.c f1741b;
    public int b0;

    /* renamed from: c  reason: collision with root package name */
    public c.g.a.i.l.c f1742c;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public Object h0;
    public int i0;

    /* renamed from: j  reason: collision with root package name */
    public String f1749j;
    public String j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1750k;
    public int k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1751l;
    public int l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1752m;
    public float[] m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1753n;
    public d[] n0;
    public int o;
    public d[] o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public int r;
    public int s;
    public int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;

    /* renamed from: d  reason: collision with root package name */
    public c.g.a.i.l.k f1743d = null;

    /* renamed from: e  reason: collision with root package name */
    public m f1744e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f1745f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f1746g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f1747h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f1748i = -1;

    /* loaded from: classes.dex */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public d() {
        new HashMap();
        this.f1750k = false;
        this.f1751l = false;
        this.f1752m = false;
        this.f1753n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        c cVar = new c(this, c.a.LEFT);
        this.J = cVar;
        c cVar2 = new c(this, c.a.TOP);
        this.K = cVar2;
        c cVar3 = new c(this, c.a.RIGHT);
        this.L = cVar3;
        c cVar4 = new c(this, c.a.BOTTOM);
        this.M = cVar4;
        c cVar5 = new c(this, c.a.BASELINE);
        this.N = cVar5;
        this.O = new c(this, c.a.CENTER_X);
        this.P = new c(this, c.a.CENTER_Y);
        c cVar6 = new c(this, c.a.CENTER);
        this.Q = cVar6;
        this.R = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar6};
        ArrayList<c> arrayList = new ArrayList<>();
        this.S = arrayList;
        this.T = new boolean[2];
        a aVar = a.FIXED;
        this.U = new a[]{aVar, aVar};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = null;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = new float[]{-1.0f, -1.0f};
        this.n0 = new d[]{null, null};
        this.o0 = new d[]{null, null};
        this.p0 = -1;
        this.q0 = -1;
        arrayList.add(this.J);
        this.S.add(this.K);
        this.S.add(this.L);
        this.S.add(this.M);
        this.S.add(this.O);
        this.S.add(this.P);
        this.S.add(this.Q);
        this.S.add(this.N);
    }

    public final boolean A(int i2) {
        int i3 = i2 * 2;
        c[] cVarArr = this.R;
        if (cVarArr[i3].f1737f != null && cVarArr[i3].f1737f.f1737f != cVarArr[i3]) {
            int i4 = i3 + 1;
            if (cVarArr[i4].f1737f != null && cVarArr[i4].f1737f.f1737f == cVarArr[i4]) {
                return true;
            }
        }
        return false;
    }

    public boolean B() {
        c cVar = this.J;
        c cVar2 = cVar.f1737f;
        if (cVar2 == null || cVar2.f1737f != cVar) {
            c cVar3 = this.L;
            c cVar4 = cVar3.f1737f;
            return cVar4 != null && cVar4.f1737f == cVar3;
        }
        return true;
    }

    public boolean C() {
        c cVar = this.K;
        c cVar2 = cVar.f1737f;
        if (cVar2 == null || cVar2.f1737f != cVar) {
            c cVar3 = this.M;
            c cVar4 = cVar3.f1737f;
            return cVar4 != null && cVar4.f1737f == cVar3;
        }
        return true;
    }

    public boolean D() {
        return this.f1746g && this.i0 != 8;
    }

    public boolean E() {
        return this.f1750k || (this.J.f1734c && this.L.f1734c);
    }

    public boolean F() {
        return this.f1751l || (this.K.f1734c && this.M.f1734c);
    }

    public void G() {
        this.J.h();
        this.K.h();
        this.L.h();
        this.M.h();
        this.N.h();
        this.O.h();
        this.P.h();
        this.Q.h();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        a[] aVarArr = this.U;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.h0 = null;
        this.i0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        float[] fArr = this.m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Integer.MAX_VALUE;
        this.y = Integer.MAX_VALUE;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f1745f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f1746g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f1747h = -1;
        this.f1748i = -1;
    }

    public void H() {
        this.f1750k = false;
        this.f1751l = false;
        this.f1752m = false;
        this.f1753n = false;
        int size = this.S.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.S.get(i2);
            cVar.f1734c = false;
            cVar.f1733b = 0;
        }
    }

    public void I(c.g.a.c cVar) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    public final void J(StringBuilder sb, String str, float f2, float f3) {
        if (f2 == f3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    public final void K(StringBuilder sb, String str, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i2);
        sb.append(",\n");
    }

    public void L(int i2) {
        this.c0 = i2;
        this.E = i2 > 0;
    }

    public void M(int i2, int i3) {
        if (this.f1750k) {
            return;
        }
        c cVar = this.J;
        cVar.f1733b = i2;
        cVar.f1734c = true;
        c cVar2 = this.L;
        cVar2.f1733b = i3;
        cVar2.f1734c = true;
        this.a0 = i2;
        this.W = i3 - i2;
        this.f1750k = true;
    }

    public void N(int i2, int i3) {
        if (this.f1751l) {
            return;
        }
        c cVar = this.K;
        cVar.f1733b = i2;
        cVar.f1734c = true;
        c cVar2 = this.M;
        cVar2.f1733b = i3;
        cVar2.f1734c = true;
        this.b0 = i2;
        this.X = i3 - i2;
        if (this.E) {
            this.N.j(i2 + this.c0);
        }
        this.f1751l = true;
    }

    public void O(int i2) {
        this.X = i2;
        int i3 = this.e0;
        if (i2 < i3) {
            this.X = i3;
        }
    }

    public void P(a aVar) {
        this.U[0] = aVar;
    }

    public void Q(int i2) {
        if (i2 < 0) {
            this.e0 = 0;
        } else {
            this.e0 = i2;
        }
    }

    public void R(int i2) {
        if (i2 < 0) {
            this.d0 = 0;
        } else {
            this.d0 = i2;
        }
    }

    public void S(a aVar) {
        this.U[1] = aVar;
    }

    public void T(int i2) {
        this.W = i2;
        int i3 = this.d0;
        if (i2 < i3) {
            this.W = i3;
        }
    }

    public void U(boolean z, boolean z2) {
        int i2;
        int i3;
        c.g.a.i.l.k kVar = this.f1743d;
        boolean z3 = z & kVar.f1803g;
        m mVar = this.f1744e;
        boolean z4 = z2 & mVar.f1803g;
        int i4 = kVar.f1804h.f1779g;
        int i5 = mVar.f1804h.f1779g;
        int i6 = kVar.f1805i.f1779g;
        int i7 = mVar.f1805i.f1779g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z3) {
            this.a0 = i4;
        }
        if (z4) {
            this.b0 = i5;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z3) {
            if (this.U[0] == a.FIXED && i9 < (i3 = this.W)) {
                i9 = i3;
            }
            this.W = i9;
            int i11 = this.d0;
            if (i9 < i11) {
                this.W = i11;
            }
        }
        if (z4) {
            if (this.U[1] == a.FIXED && i10 < (i2 = this.X)) {
                i10 = i2;
            }
            this.X = i10;
            int i12 = this.e0;
            if (i10 < i12) {
                this.X = i12;
            }
        }
    }

    public void V(c.g.a.d dVar, boolean z) {
        int i2;
        int i3;
        m mVar;
        c.g.a.i.l.k kVar;
        int o = dVar.o(this.J);
        int o2 = dVar.o(this.K);
        int o3 = dVar.o(this.L);
        int o4 = dVar.o(this.M);
        if (z && (kVar = this.f1743d) != null) {
            c.g.a.i.l.f fVar = kVar.f1804h;
            if (fVar.f1782j) {
                c.g.a.i.l.f fVar2 = kVar.f1805i;
                if (fVar2.f1782j) {
                    o = fVar.f1779g;
                    o3 = fVar2.f1779g;
                }
            }
        }
        if (z && (mVar = this.f1744e) != null) {
            c.g.a.i.l.f fVar3 = mVar.f1804h;
            if (fVar3.f1782j) {
                c.g.a.i.l.f fVar4 = mVar.f1805i;
                if (fVar4.f1782j) {
                    o2 = fVar3.f1779g;
                    o4 = fVar4.f1779g;
                }
            }
        }
        int i4 = o4 - o2;
        if (o3 - o < 0 || i4 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o4 = 0;
            o = 0;
            o2 = 0;
            o3 = 0;
        }
        int i5 = o3 - o;
        int i6 = o4 - o2;
        this.a0 = o;
        this.b0 = o2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        a[] aVarArr = this.U;
        a aVar = aVarArr[0];
        a aVar2 = a.FIXED;
        if (aVar == aVar2 && i5 < (i3 = this.W)) {
            i5 = i3;
        }
        if (aVarArr[1] == aVar2 && i6 < (i2 = this.X)) {
            i6 = i2;
        }
        this.W = i5;
        this.X = i6;
        int i7 = this.e0;
        if (i6 < i7) {
            this.X = i7;
        }
        int i8 = this.d0;
        if (i5 < i8) {
            this.W = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && aVarArr[0] == a.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && this.U[1] == a.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i10);
        }
        int i11 = this.W;
        if (i5 != i11) {
            this.f1747h = i11;
        }
        int i12 = this.X;
        if (i6 != i12) {
            this.f1748i = i12;
        }
    }

    public void b(e eVar, c.g.a.d dVar, HashSet<d> hashSet, int i2, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            i.a(eVar, dVar, this);
            hashSet.remove(this);
            d(dVar, eVar.g0(64));
        }
        if (i2 == 0) {
            HashSet<c> hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator<c> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f1735d.b(eVar, dVar, hashSet, i2, true);
                }
            }
            HashSet<c> hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator<c> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f1735d.b(eVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<c> hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator<c> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f1735d.b(eVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<c> hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator<c> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f1735d.b(eVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<c> hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator<c> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f1735d.b(eVar, dVar, hashSet, i2, true);
            }
        }
    }

    public boolean c() {
        return (this instanceof j) || (this instanceof f);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(c.g.a.d r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 1765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.i.d.d(c.g.a.d, boolean):void");
    }

    public boolean e() {
        return this.i0 != 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x03e5, code lost:
        if ((r3 instanceof c.g.a.i.a) != false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x040e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:362:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(c.g.a.d r37, boolean r38, boolean r39, boolean r40, boolean r41, c.g.a.g r42, c.g.a.g r43, c.g.a.i.d.a r44, boolean r45, c.g.a.i.c r46, c.g.a.i.c r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.a.i.d.f(c.g.a.d, boolean, boolean, boolean, boolean, c.g.a.g, c.g.a.g, c.g.a.i.d$a, boolean, c.g.a.i.c, c.g.a.i.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void g(c.g.a.d dVar) {
        dVar.l(this.J);
        dVar.l(this.K);
        dVar.l(this.L);
        dVar.l(this.M);
        if (this.c0 > 0) {
            dVar.l(this.N);
        }
    }

    public void h() {
        if (this.f1743d == null) {
            this.f1743d = new c.g.a.i.l.k(this);
        }
        if (this.f1744e == null) {
            this.f1744e = new m(this);
        }
    }

    public c i(c.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public int j() {
        return w() + this.X;
    }

    public a k(int i2) {
        if (i2 == 0) {
            return m();
        }
        if (i2 == 1) {
            return t();
        }
        return null;
    }

    public int l() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public a m() {
        return this.U[0];
    }

    public d n(int i2) {
        c cVar;
        c cVar2;
        if (i2 != 0) {
            if (i2 == 1 && (cVar2 = (cVar = this.M).f1737f) != null && cVar2.f1737f == cVar) {
                return cVar2.f1735d;
            }
            return null;
        }
        c cVar3 = this.L;
        c cVar4 = cVar3.f1737f;
        if (cVar4 == null || cVar4.f1737f != cVar3) {
            return null;
        }
        return cVar4.f1735d;
    }

    public d o(int i2) {
        c cVar;
        c cVar2;
        if (i2 != 0) {
            if (i2 == 1 && (cVar2 = (cVar = this.K).f1737f) != null && cVar2.f1737f == cVar) {
                return cVar2.f1735d;
            }
            return null;
        }
        c cVar3 = this.J;
        c cVar4 = cVar3.f1737f;
        if (cVar4 == null || cVar4.f1737f != cVar3) {
            return null;
        }
        return cVar4.f1735d;
    }

    public int p() {
        return v() + this.W;
    }

    public void q(StringBuilder sb) {
        StringBuilder y = e.a.d.a.a.y("  ");
        y.append(this.f1749j);
        y.append(":{\n");
        sb.append(y.toString());
        sb.append("    actualWidth:" + this.W);
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.b0);
        sb.append("\n");
        s(sb, "left", this.J);
        s(sb, "top", this.K);
        s(sb, "right", this.L);
        s(sb, "bottom", this.M);
        s(sb, "baseline", this.N);
        s(sb, "centerX", this.O);
        s(sb, "centerY", this.P);
        int i2 = this.W;
        int i3 = this.d0;
        int i4 = this.C[0];
        int i5 = this.u;
        int i6 = this.r;
        float f2 = this.w;
        float f3 = this.m0[0];
        r(sb, "    width", i2, i3, i4, i5, i6, f2);
        int i7 = this.X;
        int i8 = this.e0;
        int i9 = this.C[1];
        int i10 = this.x;
        int i11 = this.s;
        float f4 = this.z;
        float f5 = this.m0[1];
        r(sb, "    height", i7, i8, i9, i10, i11, f4);
        float f6 = this.Y;
        int i12 = this.Z;
        if (f6 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i12);
            sb.append("");
            sb.append("],\n");
        }
        J(sb, "    horizontalBias", this.f0, 0.5f);
        J(sb, "    verticalBias", this.g0, 0.5f);
        K(sb, "    horizontalChainStyle", this.k0, 0);
        K(sb, "    verticalChainStyle", this.l0, 0);
        sb.append("  }");
    }

    public final void r(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        K(sb, "      size", i2, 0);
        K(sb, "      min", i3, 0);
        K(sb, "      max", i4, Integer.MAX_VALUE);
        K(sb, "      matchMin", i5, 0);
        K(sb, "      matchDef", i6, 0);
        J(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public final void s(StringBuilder sb, String str, c cVar) {
        if (cVar.f1737f == null) {
            return;
        }
        e.a.d.a.a.L(sb, "    ", str, " : [ '");
        sb.append(cVar.f1737f);
        sb.append("'");
        if (cVar.f1739h != Integer.MIN_VALUE || cVar.f1738g != 0) {
            sb.append(",");
            sb.append(cVar.f1738g);
            if (cVar.f1739h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(cVar.f1739h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public a t() {
        return this.U[1];
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("");
        y.append(this.j0 != null ? e.a.d.a.a.r(e.a.d.a.a.y("id: "), this.j0, " ") : "");
        y.append("(");
        y.append(this.a0);
        y.append(", ");
        y.append(this.b0);
        y.append(") - (");
        y.append(this.W);
        y.append(" x ");
        return e.a.d.a.a.p(y, this.X, ")");
    }

    public int u() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public int v() {
        d dVar = this.V;
        return (dVar == null || !(dVar instanceof e)) ? this.a0 : ((e) dVar).y0 + this.a0;
    }

    public int w() {
        d dVar = this.V;
        return (dVar == null || !(dVar instanceof e)) ? this.b0 : ((e) dVar).z0 + this.b0;
    }

    public boolean x(int i2) {
        if (i2 == 0) {
            return (this.J.f1737f != null ? 1 : 0) + (this.L.f1737f != null ? 1 : 0) < 2;
        }
        return ((this.K.f1737f != null ? 1 : 0) + (this.M.f1737f != null ? 1 : 0)) + (this.N.f1737f != null ? 1 : 0) < 2;
    }

    public boolean y(int i2, int i3) {
        c cVar;
        c cVar2;
        if (i2 == 0) {
            c cVar3 = this.J.f1737f;
            if (cVar3 != null && cVar3.f1734c && (cVar2 = this.L.f1737f) != null && cVar2.f1734c) {
                return (cVar2.c() - this.L.d()) - (this.J.d() + this.J.f1737f.c()) >= i3;
            }
        } else {
            c cVar4 = this.K.f1737f;
            if (cVar4 != null && cVar4.f1734c && (cVar = this.M.f1737f) != null && cVar.f1734c) {
                return (cVar.c() - this.M.d()) - (this.K.d() + this.K.f1737f.c()) >= i3;
            }
        }
        return false;
    }

    public void z(c.a aVar, d dVar, c.a aVar2, int i2, int i3) {
        i(aVar).a(dVar.i(aVar2), i2, i3, true);
    }
}
