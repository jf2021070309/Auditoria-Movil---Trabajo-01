package com.amazon.aps.iva.u2;

import com.amazon.aps.iva.u2.d;
import com.amazon.aps.iva.v2.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ConstraintWidget.java */
/* loaded from: classes.dex */
public class e {
    public float A;
    public int B;
    public float C;
    public final int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d P;
    public final d Q;
    public final d R;
    public final d[] S;
    public final ArrayList<d> T;
    public final boolean[] U;
    public final b[] V;
    public e W;
    public int X;
    public int Y;
    public float Z;
    public int a0;
    public com.amazon.aps.iva.v2.c b;
    public int b0;
    public com.amazon.aps.iva.v2.c c;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public float g0;
    public float h0;
    public Object i0;
    public int j0;
    public String k;
    public String k0;
    public boolean l;
    public int l0;
    public boolean m;
    public int m0;
    public boolean n;
    public final float[] n0;
    public boolean o;
    public final e[] o0;
    public int p;
    public final e[] p0;
    public int q;
    public int q0;
    public int r;
    public int r0;
    public int s;
    public int t;
    public final int[] u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;
    public boolean a = false;
    public com.amazon.aps.iva.v2.l d = null;
    public n e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public final boolean h = true;
    public int i = -1;
    public int j = -1;

    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: ConstraintWidget.java */
    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        new HashMap();
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        d dVar = new d(this, d.b.LEFT);
        this.K = dVar;
        d dVar2 = new d(this, d.b.TOP);
        this.L = dVar2;
        d dVar3 = new d(this, d.b.RIGHT);
        this.M = dVar3;
        d dVar4 = new d(this, d.b.BOTTOM);
        this.N = dVar4;
        d dVar5 = new d(this, d.b.BASELINE);
        this.O = dVar5;
        d dVar6 = new d(this, d.b.CENTER_X);
        this.P = dVar6;
        d dVar7 = new d(this, d.b.CENTER_Y);
        this.Q = dVar7;
        d dVar8 = new d(this, d.b.CENTER);
        this.R = dVar8;
        this.S = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList<d> arrayList = new ArrayList<>();
        this.T = arrayList;
        this.U = new boolean[2];
        b bVar = b.FIXED;
        this.V = new b[]{bVar, bVar};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        this.j0 = 0;
        this.k0 = null;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new float[]{-1.0f, -1.0f};
        this.o0 = new e[]{null, null};
        this.p0 = new e[]{null, null};
        this.q0 = -1;
        this.r0 = -1;
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public static void H(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    public static void I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void p(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f) {
        sb.append(str);
        sb.append(" :  {\n");
        H(i, 0, "      size", sb);
        H(i2, 0, "      min", sb);
        H(i3, Integer.MAX_VALUE, "      max", sb);
        H(i4, 0, "      matchMin", sb);
        H(i5, 0, "      matchDef", sb);
        I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void q(StringBuilder sb, String str, d dVar) {
        if (dVar.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(dVar.f);
        sb.append("'");
        if (dVar.h != Integer.MIN_VALUE || dVar.g != 0) {
            sb.append(",");
            sb.append(dVar.g);
            if (dVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(dVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public final boolean A() {
        if (this.g && this.j0 != 8) {
            return true;
        }
        return false;
    }

    public boolean B() {
        if (!this.l && (!this.K.c || !this.M.c)) {
            return false;
        }
        return true;
    }

    public boolean C() {
        if (!this.m && (!this.L.c || !this.N.c)) {
            return false;
        }
        return true;
    }

    public void D() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        b bVar = b.FIXED;
        b[] bVarArr = this.V;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.i0 = null;
        this.j0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        float[] fArr = this.n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.i = -1;
        this.j = -1;
    }

    public final void E() {
        e eVar = this.W;
        if (eVar != null && (eVar instanceof f)) {
            ((f) eVar).getClass();
        }
        ArrayList<d> arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).j();
        }
    }

    public final void F() {
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        ArrayList<d> arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            d dVar = arrayList.get(i);
            dVar.c = false;
            dVar.b = 0;
        }
    }

    public void G(com.amazon.aps.iva.s2.c cVar) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void J(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        this.l = true;
    }

    public final void K(int i, int i2) {
        if (this.m) {
            return;
        }
        this.L.l(i);
        this.N.l(i2);
        this.c0 = i;
        this.Y = i2 - i;
        if (this.F) {
            this.O.l(i + this.d0);
        }
        this.m = true;
    }

    public final void L(int i) {
        this.Y = i;
        int i2 = this.f0;
        if (i < i2) {
            this.Y = i2;
        }
    }

    public final void M(b bVar) {
        this.V[0] = bVar;
    }

    public final void N(b bVar) {
        this.V[1] = bVar;
    }

    public final void O(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public void P(boolean z, boolean z2) {
        int i;
        int i2;
        com.amazon.aps.iva.v2.l lVar = this.d;
        boolean z3 = z & lVar.g;
        n nVar = this.e;
        boolean z4 = z2 & nVar.g;
        int i3 = lVar.h.g;
        int i4 = nVar.h.g;
        int i5 = lVar.i.g;
        int i6 = nVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.b0 = i3;
        }
        if (z4) {
            this.c0 = i4;
        }
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        b[] bVarArr = this.V;
        if (z3) {
            if (bVarArr[0] == b.FIXED && i8 < (i2 = this.X)) {
                i8 = i2;
            }
            this.X = i8;
            int i10 = this.e0;
            if (i8 < i10) {
                this.X = i10;
            }
        }
        if (z4) {
            if (bVarArr[1] == b.FIXED && i9 < (i = this.Y)) {
                i9 = i;
            }
            this.Y = i9;
            int i11 = this.f0;
            if (i9 < i11) {
                this.Y = i11;
            }
        }
    }

    public void Q(com.amazon.aps.iva.s2.d dVar, boolean z) {
        int i;
        int i2;
        n nVar;
        com.amazon.aps.iva.v2.l lVar;
        dVar.getClass();
        int n = com.amazon.aps.iva.s2.d.n(this.K);
        int n2 = com.amazon.aps.iva.s2.d.n(this.L);
        int n3 = com.amazon.aps.iva.s2.d.n(this.M);
        int n4 = com.amazon.aps.iva.s2.d.n(this.N);
        if (z && (lVar = this.d) != null) {
            com.amazon.aps.iva.v2.f fVar = lVar.h;
            if (fVar.j) {
                com.amazon.aps.iva.v2.f fVar2 = lVar.i;
                if (fVar2.j) {
                    n = fVar.g;
                    n3 = fVar2.g;
                }
            }
        }
        if (z && (nVar = this.e) != null) {
            com.amazon.aps.iva.v2.f fVar3 = nVar.h;
            if (fVar3.j) {
                com.amazon.aps.iva.v2.f fVar4 = nVar.i;
                if (fVar4.j) {
                    n2 = fVar3.g;
                    n4 = fVar4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.b0 = n;
        this.c0 = n2;
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        b[] bVarArr = this.V;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i4 < (i2 = this.X)) {
            i4 = i2;
        }
        if (bVarArr[1] == bVar2 && i5 < (i = this.Y)) {
            i5 = i;
        }
        this.X = i4;
        this.Y = i5;
        int i6 = this.f0;
        if (i5 < i6) {
            this.Y = i6;
        }
        int i7 = this.e0;
        if (i4 < i7) {
            this.X = i7;
        }
        int i8 = this.w;
        if (i8 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i8);
        }
        int i9 = this.z;
        if (i9 > 0 && bVarArr[1] == b.MATCH_CONSTRAINT) {
            this.Y = Math.min(this.Y, i9);
        }
        int i10 = this.X;
        if (i4 != i10) {
            this.i = i10;
        }
        int i11 = this.Y;
        if (i5 != i11) {
            this.j = i11;
        }
    }

    public final void b(f fVar, com.amazon.aps.iva.s2.d dVar, HashSet<e> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            c(dVar, fVar.W(64));
        }
        if (i == 0) {
            HashSet<d> hashSet2 = this.K.a;
            if (hashSet2 != null) {
                Iterator<d> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.b(fVar, dVar, hashSet, i, true);
                }
            }
            HashSet<d> hashSet3 = this.M.a;
            if (hashSet3 != null) {
                Iterator<d> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.b(fVar, dVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSet4 = this.L.a;
        if (hashSet4 != null) {
            Iterator<d> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().d.b(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> hashSet5 = this.N.a;
        if (hashSet5 != null) {
            Iterator<d> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().d.b(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> hashSet6 = this.O.a;
        if (hashSet6 != null) {
            Iterator<d> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().d.b(fVar, dVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
        if (r0.d() > r3.J0.get().d()) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.amazon.aps.iva.s2.d r67, boolean r68) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u2.e.c(com.amazon.aps.iva.s2.d, boolean):void");
    }

    public boolean d() {
        if (this.j0 != 8) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0380 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0431 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04af A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x04fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.amazon.aps.iva.s2.d r29, boolean r30, boolean r31, boolean r32, boolean r33, com.amazon.aps.iva.s2.h r34, com.amazon.aps.iva.s2.h r35, com.amazon.aps.iva.u2.e.b r36, boolean r37, com.amazon.aps.iva.u2.d r38, com.amazon.aps.iva.u2.d r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, int r50, int r51, int r52, int r53, float r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u2.e.e(com.amazon.aps.iva.s2.d, boolean, boolean, boolean, boolean, com.amazon.aps.iva.s2.h, com.amazon.aps.iva.s2.h, com.amazon.aps.iva.u2.e$b, boolean, com.amazon.aps.iva.u2.d, com.amazon.aps.iva.u2.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void f(d.b bVar, e eVar, d.b bVar2, int i) {
        d.b bVar3;
        d.b bVar4;
        boolean z;
        d.b bVar5 = d.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 == bVar5) {
                d.b bVar6 = d.b.LEFT;
                d j = j(bVar6);
                d.b bVar7 = d.b.RIGHT;
                d j2 = j(bVar7);
                d.b bVar8 = d.b.TOP;
                d j3 = j(bVar8);
                d.b bVar9 = d.b.BOTTOM;
                d j4 = j(bVar9);
                boolean z2 = true;
                if ((j != null && j.h()) || (j2 != null && j2.h())) {
                    z = false;
                } else {
                    f(bVar6, eVar, bVar6, 0);
                    f(bVar7, eVar, bVar7, 0);
                    z = true;
                }
                if ((j3 != null && j3.h()) || (j4 != null && j4.h())) {
                    z2 = false;
                } else {
                    f(bVar8, eVar, bVar8, 0);
                    f(bVar9, eVar, bVar9, 0);
                }
                if (z && z2) {
                    j(bVar5).a(eVar.j(bVar5), 0);
                    return;
                } else if (z) {
                    d.b bVar10 = d.b.CENTER_X;
                    j(bVar10).a(eVar.j(bVar10), 0);
                    return;
                } else if (z2) {
                    d.b bVar11 = d.b.CENTER_Y;
                    j(bVar11).a(eVar.j(bVar11), 0);
                    return;
                } else {
                    return;
                }
            }
            d.b bVar12 = d.b.LEFT;
            if (bVar2 != bVar12 && bVar2 != d.b.RIGHT) {
                d.b bVar13 = d.b.TOP;
                if (bVar2 == bVar13 || bVar2 == d.b.BOTTOM) {
                    f(bVar13, eVar, bVar2, 0);
                    f(d.b.BOTTOM, eVar, bVar2, 0);
                    j(bVar5).a(eVar.j(bVar2), 0);
                    return;
                }
                return;
            }
            f(bVar12, eVar, bVar2, 0);
            f(d.b.RIGHT, eVar, bVar2, 0);
            j(bVar5).a(eVar.j(bVar2), 0);
            return;
        }
        d.b bVar14 = d.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = d.b.LEFT) || bVar2 == d.b.RIGHT)) {
            d j5 = j(bVar4);
            d j6 = eVar.j(bVar2);
            d j7 = j(d.b.RIGHT);
            j5.a(j6, 0);
            j7.a(j6, 0);
            j(bVar14).a(j6, 0);
            return;
        }
        d.b bVar15 = d.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = d.b.TOP) || bVar2 == d.b.BOTTOM)) {
            d j8 = eVar.j(bVar2);
            j(bVar3).a(j8, 0);
            j(d.b.BOTTOM).a(j8, 0);
            j(bVar15).a(j8, 0);
        } else if (bVar == bVar14 && bVar2 == bVar14) {
            d.b bVar16 = d.b.LEFT;
            j(bVar16).a(eVar.j(bVar16), 0);
            d.b bVar17 = d.b.RIGHT;
            j(bVar17).a(eVar.j(bVar17), 0);
            j(bVar14).a(eVar.j(bVar2), 0);
        } else if (bVar == bVar15 && bVar2 == bVar15) {
            d.b bVar18 = d.b.TOP;
            j(bVar18).a(eVar.j(bVar18), 0);
            d.b bVar19 = d.b.BOTTOM;
            j(bVar19).a(eVar.j(bVar19), 0);
            j(bVar15).a(eVar.j(bVar2), 0);
        } else {
            d j9 = j(bVar);
            d j10 = eVar.j(bVar2);
            if (j9.i(j10)) {
                d.b bVar20 = d.b.BASELINE;
                if (bVar == bVar20) {
                    d j11 = j(d.b.TOP);
                    d j12 = j(d.b.BOTTOM);
                    if (j11 != null) {
                        j11.j();
                    }
                    if (j12 != null) {
                        j12.j();
                    }
                } else if (bVar != d.b.TOP && bVar != d.b.BOTTOM) {
                    if (bVar == d.b.LEFT || bVar == d.b.RIGHT) {
                        d j13 = j(bVar5);
                        if (j13.f != j10) {
                            j13.j();
                        }
                        d f = j(bVar).f();
                        d j14 = j(bVar14);
                        if (j14.h()) {
                            f.j();
                            j14.j();
                        }
                    }
                } else {
                    d j15 = j(bVar20);
                    if (j15 != null) {
                        j15.j();
                    }
                    d j16 = j(bVar5);
                    if (j16.f != j10) {
                        j16.j();
                    }
                    d f2 = j(bVar).f();
                    d j17 = j(bVar15);
                    if (j17.h()) {
                        f2.j();
                        j17.j();
                    }
                }
                j9.a(j10, i);
            }
        }
    }

    public final void g(d dVar, d dVar2, int i) {
        if (dVar.d == this) {
            f(dVar.e, dVar2.d, dVar2.e, i);
        }
    }

    public final void h(com.amazon.aps.iva.s2.d dVar) {
        dVar.k(this.K);
        dVar.k(this.L);
        dVar.k(this.M);
        dVar.k(this.N);
        if (this.d0 > 0) {
            dVar.k(this.O);
        }
    }

    public final void i() {
        if (this.d == null) {
            this.d = new com.amazon.aps.iva.v2.l(this);
        }
        if (this.e == null) {
            this.e = new n(this);
        }
    }

    public d j(d.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public final b k(int i) {
        b[] bVarArr = this.V;
        if (i == 0) {
            return bVarArr[0];
        }
        if (i == 1) {
            return bVarArr[1];
        }
        return null;
    }

    public final int l() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final e m(int i) {
        d dVar;
        d dVar2;
        if (i == 0) {
            d dVar3 = this.M;
            d dVar4 = dVar3.f;
            if (dVar4 != null && dVar4.f == dVar3) {
                return dVar4.d;
            }
            return null;
        } else if (i == 1 && (dVar2 = (dVar = this.N).f) != null && dVar2.f == dVar) {
            return dVar2.d;
        } else {
            return null;
        }
    }

    public final e n(int i) {
        d dVar;
        d dVar2;
        if (i == 0) {
            d dVar3 = this.K;
            d dVar4 = dVar3.f;
            if (dVar4 != null && dVar4.f == dVar3) {
                return dVar4.d;
            }
            return null;
        } else if (i == 1 && (dVar2 = (dVar = this.L).f) != null && dVar2.f == dVar) {
            return dVar2.d;
        } else {
            return null;
        }
    }

    public void o(StringBuilder sb) {
        sb.append("  " + this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.c0);
        sb.append("\n");
        q(sb, "left", this.K);
        q(sb, "top", this.L);
        q(sb, "right", this.M);
        q(sb, "bottom", this.N);
        q(sb, "baseline", this.O);
        q(sb, "centerX", this.P);
        q(sb, "centerY", this.Q);
        int i = this.X;
        int i2 = this.e0;
        int[] iArr = this.D;
        int i3 = iArr[0];
        int i4 = this.v;
        int i5 = this.s;
        float f = this.x;
        float[] fArr = this.n0;
        float f2 = fArr[0];
        p(sb, "    width", i, i2, i3, i4, i5, f);
        int i6 = this.Y;
        int i7 = this.f0;
        int i8 = iArr[1];
        int i9 = this.y;
        int i10 = this.t;
        float f3 = this.A;
        float f4 = fArr[1];
        p(sb, "    height", i6, i7, i8, i9, i10, f3);
        float f5 = this.Z;
        int i11 = this.a0;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.g0, 0.5f);
        I(sb, "    verticalBias", this.h0, 0.5f);
        H(this.l0, 0, "    horizontalChainStyle", sb);
        H(this.m0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    public final int r() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int s() {
        e eVar = this.W;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).z0 + this.b0;
        }
        return this.b0;
    }

    public final int t() {
        e eVar = this.W;
        if (eVar != null && (eVar instanceof f)) {
            return ((f) eVar).A0 + this.c0;
        }
        return this.c0;
    }

    public String toString() {
        String str = "";
        StringBuilder b2 = defpackage.c.b("");
        if (this.k0 != null) {
            str = defpackage.b.c(new StringBuilder("id: "), this.k0, " ");
        }
        b2.append(str);
        b2.append("(");
        b2.append(this.b0);
        b2.append(", ");
        b2.append(this.c0);
        b2.append(") - (");
        b2.append(this.X);
        b2.append(" x ");
        return defpackage.e.f(b2, this.Y, ")");
    }

    public final boolean u(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.K.f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.M.f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.L.f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.N.f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.O.f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
            return true;
        }
        return false;
    }

    public final boolean v(int i, int i2) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (i == 0) {
            d dVar5 = this.K;
            d dVar6 = dVar5.f;
            if (dVar6 != null && dVar6.c && (dVar4 = (dVar3 = this.M).f) != null && dVar4.c) {
                if ((dVar4.d() - dVar3.e()) - (dVar5.e() + dVar5.f.d()) >= i2) {
                    return true;
                }
                return false;
            }
        } else {
            d dVar7 = this.L;
            d dVar8 = dVar7.f;
            if (dVar8 != null && dVar8.c && (dVar2 = (dVar = this.N).f) != null && dVar2.c) {
                if ((dVar2.d() - dVar.e()) - (dVar7.e() + dVar7.f.d()) >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final void w(d.b bVar, e eVar, d.b bVar2, int i, int i2) {
        j(bVar).b(eVar.j(bVar2), i, i2, true);
    }

    public final boolean x(int i) {
        d dVar;
        d dVar2;
        int i2 = i * 2;
        d[] dVarArr = this.S;
        d dVar3 = dVarArr[i2];
        d dVar4 = dVar3.f;
        if (dVar4 != null && dVar4.f != dVar3 && (dVar2 = (dVar = dVarArr[i2 + 1]).f) != null && dVar2.f == dVar) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        d dVar = this.K;
        d dVar2 = dVar.f;
        if (dVar2 == null || dVar2.f != dVar) {
            d dVar3 = this.M;
            d dVar4 = dVar3.f;
            if (dVar4 != null && dVar4.f == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean z() {
        d dVar = this.L;
        d dVar2 = dVar.f;
        if (dVar2 == null || dVar2.f != dVar) {
            d dVar3 = this.N;
            d dVar4 = dVar3.f;
            if (dVar4 != null && dVar4.f == dVar3) {
                return true;
            }
            return false;
        }
        return true;
    }
}
