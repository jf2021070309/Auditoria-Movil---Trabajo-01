package androidx.media3.exoplayer.dash;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import com.amazon.aps.iva.a6.s1;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.d6.g;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.g6.f;
import com.amazon.aps.iva.o0.d2;
import com.amazon.aps.iva.o6.f0;
import com.amazon.aps.iva.o6.h0;
import com.amazon.aps.iva.o6.i0;
import com.amazon.aps.iva.o6.n;
import com.amazon.aps.iva.o6.o0;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q6.h;
import com.amazon.aps.iva.s6.r;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.t6.l;
import com.amazon.aps.iva.w5.y;
import com.google.common.collect.Maps;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: DashMediaPeriod.java */
/* loaded from: classes.dex */
public final class b implements u, i0.a<h<androidx.media3.exoplayer.dash.a>>, h.b<androidx.media3.exoplayer.dash.a> {
    public final int b;
    public final a.InterfaceC0036a c;
    public final y d;
    public final f e;
    public final j f;
    public final com.amazon.aps.iva.d6.b g;
    public final long h;
    public final l i;
    public final com.amazon.aps.iva.t6.b j;
    public final o0 k;
    public final a[] l;
    public final com.amazon.aps.iva.o6.h m;
    public final d n;
    public final z.a p;
    public final e.a q;
    public final p1 r;
    public u.a s;
    public d2 v;
    public com.amazon.aps.iva.e6.c w;
    public int x;
    public List<com.amazon.aps.iva.e6.f> y;
    public static final Pattern z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public h<androidx.media3.exoplayer.dash.a>[] t = new h[0];
    public g[] u = new g[0];
    public final IdentityHashMap<h<androidx.media3.exoplayer.dash.a>, d.c> o = new IdentityHashMap<>();

    /* compiled from: DashMediaPeriod.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.b = i;
            this.a = iArr;
            this.c = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.d = i6;
        }
    }

    public b(int i, com.amazon.aps.iva.e6.c cVar, com.amazon.aps.iva.d6.b bVar, int i2, a.InterfaceC0036a interfaceC0036a, y yVar, f fVar, e.a aVar, j jVar, z.a aVar2, long j, l lVar, com.amazon.aps.iva.t6.b bVar2, com.amazon.aps.iva.o6.h hVar, DashMediaSource.c cVar2, p1 p1Var) {
        String a2;
        int i3;
        int i4;
        boolean z2;
        v[] vVarArr;
        com.amazon.aps.iva.e6.e eVar;
        com.amazon.aps.iva.e6.e eVar2;
        Integer num;
        f fVar2 = fVar;
        this.b = i;
        this.w = cVar;
        this.g = bVar;
        this.x = i2;
        this.c = interfaceC0036a;
        this.d = yVar;
        this.e = fVar2;
        this.q = aVar;
        this.f = jVar;
        this.p = aVar2;
        this.h = j;
        this.i = lVar;
        this.j = bVar2;
        this.m = hVar;
        this.r = p1Var;
        this.n = new d(cVar, cVar2, bVar2);
        int i5 = 0;
        h<androidx.media3.exoplayer.dash.a>[] hVarArr = this.t;
        hVar.getClass();
        this.v = new d2(hVarArr);
        com.amazon.aps.iva.e6.g b = cVar.b(i2);
        List<com.amazon.aps.iva.e6.f> list = b.d;
        this.y = list;
        List<com.amazon.aps.iva.e6.a> list2 = b.c;
        int size = list2.size();
        HashMap newHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            newHashMapWithExpectedSize.put(Long.valueOf(list2.get(i6).a), Integer.valueOf(i6));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        int i7 = 0;
        while (i5 < size) {
            com.amazon.aps.iva.e6.a aVar3 = list2.get(i5);
            List<com.amazon.aps.iva.e6.e> list3 = aVar3.e;
            while (true) {
                if (i7 >= list3.size()) {
                    eVar = null;
                    break;
                }
                eVar = list3.get(i7);
                if ("http://dashif.org/guidelines/trickmode".equals(eVar.a)) {
                    break;
                }
                i7++;
            }
            List<com.amazon.aps.iva.e6.e> list4 = aVar3.f;
            if (eVar == null) {
                int i8 = 0;
                while (true) {
                    if (i8 >= list4.size()) {
                        eVar = null;
                        break;
                    }
                    eVar = list4.get(i8);
                    if ("http://dashif.org/guidelines/trickmode".equals(eVar.a)) {
                        break;
                    }
                    i8++;
                }
            }
            int intValue = (eVar == null || (num = (Integer) newHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(eVar.b)))) == null) ? i5 : num.intValue();
            if (intValue == i5) {
                int i9 = 0;
                while (true) {
                    if (i9 >= list4.size()) {
                        eVar2 = null;
                        break;
                    }
                    com.amazon.aps.iva.e6.e eVar3 = list4.get(i9);
                    if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(eVar3.a)) {
                        eVar2 = eVar3;
                        break;
                    }
                    i9++;
                }
                if (eVar2 != null) {
                    int i10 = g0.a;
                    for (String str : eVar2.b.split(",", -1)) {
                        Integer num2 = (Integer) newHashMapWithExpectedSize.get(Long.valueOf(Long.parseLong(str)));
                        if (num2 != null) {
                            intValue = Math.min(intValue, num2.intValue());
                        }
                    }
                }
            }
            if (intValue != i5) {
                List list5 = (List) sparseArray.get(i5);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i5, list6);
                arrayList.remove(list5);
            }
            i5++;
            i7 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i11 = 0; i11 < size2; i11++) {
            int[] array = Ints.toArray((Collection) arrayList.get(i11));
            iArr[i11] = array;
            Arrays.sort(array);
        }
        boolean[] zArr = new boolean[size2];
        v[][] vVarArr2 = new v[size2];
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            int[] iArr2 = iArr[i13];
            int length = iArr2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    z2 = false;
                    break;
                }
                List<com.amazon.aps.iva.e6.j> list7 = list2.get(iArr2[i14]).c;
                for (int i15 = 0; i15 < list7.size(); i15++) {
                    if (!list7.get(i15).e.isEmpty()) {
                        z2 = true;
                        break;
                    }
                }
                i14++;
            }
            if (z2) {
                zArr[i13] = true;
                i12++;
            }
            int[] iArr3 = iArr[i13];
            int length2 = iArr3.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length2) {
                    vVarArr = new v[0];
                    break;
                }
                int i17 = iArr3[i16];
                com.amazon.aps.iva.e6.a aVar4 = list2.get(i17);
                List<com.amazon.aps.iva.e6.e> list8 = list2.get(i17).d;
                int i18 = 0;
                int[] iArr4 = iArr3;
                while (i18 < list8.size()) {
                    com.amazon.aps.iva.e6.e eVar4 = list8.get(i18);
                    int i19 = length2;
                    List<com.amazon.aps.iva.e6.e> list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(eVar4.a)) {
                        v.a aVar5 = new v.a();
                        aVar5.k = "application/cea-608";
                        aVar5.a = com.amazon.aps.iva.c.b.b(new StringBuilder(), aVar4.a, ":cea608");
                        vVarArr = i(eVar4, z, new v(aVar5));
                        break;
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar4.a)) {
                        v.a aVar6 = new v.a();
                        aVar6.k = "application/cea-708";
                        aVar6.a = com.amazon.aps.iva.c.b.b(new StringBuilder(), aVar4.a, ":cea708");
                        vVarArr = i(eVar4, A, new v(aVar6));
                        break;
                    } else {
                        i18++;
                        length2 = i19;
                        list8 = list9;
                    }
                }
                i16++;
                iArr3 = iArr4;
            }
            vVarArr2[i13] = vVarArr;
            if (vVarArr.length != 0) {
                i12++;
            }
        }
        int size3 = list.size() + i12 + size2;
        s0[] s0VarArr = new s0[size3];
        a[] aVarArr = new a[size3];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            int[] iArr5 = iArr[i20];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i22 = size2;
            int i23 = 0;
            while (i23 < length3) {
                arrayList3.addAll(list2.get(iArr5[i23]).c);
                i23++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            v[] vVarArr3 = new v[size4];
            int i24 = 0;
            while (i24 < size4) {
                int i25 = size4;
                v vVar = ((com.amazon.aps.iva.e6.j) arrayList3.get(i24)).b;
                ArrayList arrayList4 = arrayList3;
                int c = fVar2.c(vVar);
                v.a a3 = vVar.a();
                a3.F = c;
                vVarArr3[i24] = a3.a();
                i24++;
                size4 = i25;
                arrayList3 = arrayList4;
            }
            com.amazon.aps.iva.e6.a aVar7 = list2.get(iArr5[0]);
            long j2 = aVar7.a;
            if (j2 != -1) {
                a2 = Long.toString(j2);
            } else {
                a2 = c0.a("unset:", i20);
            }
            int i26 = i21 + 1;
            if (zArr[i20]) {
                i3 = i26;
                i26++;
            } else {
                i3 = -1;
            }
            List<com.amazon.aps.iva.e6.a> list10 = list2;
            if (vVarArr2[i20].length != 0) {
                int i27 = i26;
                i26++;
                i4 = i27;
            } else {
                i4 = -1;
            }
            s0VarArr[i21] = new s0(a2, vVarArr3);
            aVarArr[i21] = new a(aVar7.b, 0, iArr5, i21, i3, i4, -1);
            int i28 = -1;
            int i29 = i3;
            if (i29 != -1) {
                String f = com.amazon.aps.iva.c80.a.f(a2, ":emsg");
                v.a aVar8 = new v.a();
                aVar8.a = f;
                aVar8.k = "application/x-emsg";
                s0VarArr[i29] = new s0(f, new v(aVar8));
                aVarArr[i29] = new a(5, 1, iArr5, i21, -1, -1, -1);
                i28 = -1;
            }
            if (i4 != i28) {
                s0VarArr[i4] = new s0(com.amazon.aps.iva.c80.a.f(a2, ":cc"), vVarArr2[i20]);
                aVarArr[i4] = new a(3, 1, iArr5, i21, -1, -1, -1);
            }
            i20++;
            size2 = i22;
            fVar2 = fVar;
            i21 = i26;
            iArr = iArr6;
            list2 = list10;
        }
        int i30 = 0;
        while (i30 < list.size()) {
            com.amazon.aps.iva.e6.f fVar3 = list.get(i30);
            v.a aVar9 = new v.a();
            aVar9.a = fVar3.a();
            aVar9.k = "application/x-emsg";
            s0VarArr[i21] = new s0(fVar3.a() + ":" + i30, new v(aVar9));
            aVarArr[i21] = new a(5, 2, new int[0], -1, -1, -1, i30);
            i30++;
            i21++;
        }
        Pair create = Pair.create(new o0(s0VarArr), aVarArr);
        this.k = (o0) create.first;
        this.l = (a[]) create.second;
    }

    public static v[] i(com.amazon.aps.iva.e6.e eVar, Pattern pattern, v vVar) {
        String str = eVar.b;
        if (str == null) {
            return new v[]{vVar};
        }
        int i = g0.a;
        String[] split = str.split(";", -1);
        v[] vVarArr = new v[split.length];
        for (int i2 = 0; i2 < split.length; i2++) {
            Matcher matcher = pattern.matcher(split[i2]);
            if (!matcher.matches()) {
                return new v[]{vVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            v.a aVar = new v.a(vVar);
            aVar.a = vVar.b + ":" + parseInt;
            aVar.C = parseInt;
            aVar.c = matcher.group(2);
            vVarArr[i2] = new v(aVar);
        }
        return vVarArr;
    }

    @Override // com.amazon.aps.iva.o6.i0.a
    public final void a(h<androidx.media3.exoplayer.dash.a> hVar) {
        this.s.a(this);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long b(long j, s1 s1Var) {
        h<androidx.media3.exoplayer.dash.a>[] hVarArr;
        for (h<androidx.media3.exoplayer.dash.a> hVar : this.t) {
            if (hVar.b == 2) {
                return hVar.f.b(j, s1Var);
            }
        }
        return j;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long c() {
        return this.v.c();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long e(long j) {
        h<androidx.media3.exoplayer.dash.a>[] hVarArr;
        com.amazon.aps.iva.q6.a aVar;
        boolean z2;
        boolean x;
        for (h<androidx.media3.exoplayer.dash.a> hVar : this.t) {
            hVar.u = j;
            if (hVar.y()) {
                hVar.t = j;
            } else {
                for (int i = 0; i < hVar.l.size(); i++) {
                    aVar = hVar.l.get(i);
                    int i2 = (aVar.g > j ? 1 : (aVar.g == j ? 0 : -1));
                    if (i2 == 0 && aVar.k == -9223372036854775807L) {
                        break;
                    } else if (i2 > 0) {
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    com.amazon.aps.iva.o6.g0 g0Var = hVar.n;
                    int e = aVar.e(0);
                    synchronized (g0Var) {
                        synchronized (g0Var) {
                            g0Var.s = 0;
                            f0 f0Var = g0Var.a;
                            f0Var.e = f0Var.d;
                        }
                    }
                    int i3 = g0Var.q;
                    if (e >= i3 && e <= g0Var.p + i3) {
                        g0Var.t = Long.MIN_VALUE;
                        g0Var.s = e - i3;
                        x = true;
                    }
                    x = false;
                } else {
                    com.amazon.aps.iva.o6.g0 g0Var2 = hVar.n;
                    if (j < hVar.c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    x = g0Var2.x(j, z2);
                }
                if (x) {
                    com.amazon.aps.iva.o6.g0 g0Var3 = hVar.n;
                    hVar.v = hVar.A(g0Var3.q + g0Var3.s, 0);
                    for (com.amazon.aps.iva.o6.g0 g0Var4 : hVar.o) {
                        g0Var4.x(j, true);
                    }
                } else {
                    hVar.t = j;
                    hVar.x = false;
                    hVar.l.clear();
                    hVar.v = 0;
                    if (hVar.j.d()) {
                        hVar.n.i();
                        for (com.amazon.aps.iva.o6.g0 g0Var5 : hVar.o) {
                            g0Var5.i();
                        }
                        hVar.j.b();
                    } else {
                        hVar.j.c = null;
                        hVar.n.w(false);
                        for (com.amazon.aps.iva.o6.g0 g0Var6 : hVar.o) {
                            g0Var6.w(false);
                        }
                    }
                }
            }
        }
        for (g gVar : this.u) {
            gVar.b(j);
        }
        return j;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final List f(ArrayList arrayList) {
        List<com.amazon.aps.iva.e6.a> list = this.w.b(this.x).c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            a aVar = this.l[this.k.b(rVar.m())];
            if (aVar.c == 0) {
                int length = rVar.length();
                int[] iArr = new int[length];
                for (int i = 0; i < rVar.length(); i++) {
                    iArr[i] = rVar.f(i);
                }
                Arrays.sort(iArr);
                int[] iArr2 = aVar.a;
                int size = list.get(iArr2[0]).c.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr[i4];
                    while (true) {
                        int i6 = i3 + size;
                        if (i5 >= i6) {
                            i2++;
                            size = list.get(iArr2[i2]).c.size();
                            i3 = i6;
                        }
                    }
                    arrayList2.add(new p0(this.x, iArr2[i2], i5 - i3));
                }
            }
        }
        return arrayList2;
    }

    public final int g(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        a[] aVarArr = this.l;
        int i3 = aVarArr[i2].e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && aVarArr[i5].c == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long h(r[] rVarArr, boolean[] zArr, h0[] h0VarArr, boolean[] zArr2, long j) {
        int i;
        s0 s0Var;
        boolean z2;
        int[] iArr;
        int i2;
        s0 s0Var2;
        int[] iArr2;
        boolean z3;
        s0 s0Var3;
        int i3;
        Object[] objArr;
        s0 s0Var4;
        int i4;
        d.c cVar;
        com.amazon.aps.iva.o6.g0[] g0VarArr;
        r[] rVarArr2 = rVarArr;
        int[] iArr3 = new int[rVarArr2.length];
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= rVarArr2.length) {
                break;
            }
            r rVar = rVarArr2[i5];
            if (rVar != null) {
                iArr3[i5] = this.k.b(rVar.m());
            } else {
                iArr3[i5] = -1;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            s0Var = null;
            if (i6 >= rVarArr2.length) {
                break;
            }
            if (rVarArr2[i6] == null || !zArr[i6]) {
                h0 h0Var = h0VarArr[i6];
                if (h0Var instanceof h) {
                    h hVar = (h) h0Var;
                    hVar.s = this;
                    com.amazon.aps.iva.o6.g0 g0Var = hVar.n;
                    g0Var.i();
                    com.amazon.aps.iva.g6.d dVar = g0Var.h;
                    if (dVar != null) {
                        dVar.e(g0Var.e);
                        g0Var.h = null;
                        g0Var.g = null;
                    }
                    for (com.amazon.aps.iva.o6.g0 g0Var2 : hVar.o) {
                        g0Var2.i();
                        com.amazon.aps.iva.g6.d dVar2 = g0Var2.h;
                        if (dVar2 != null) {
                            dVar2.e(g0Var2.e);
                            g0Var2.h = null;
                            g0Var2.g = null;
                        }
                    }
                    hVar.j.e(hVar);
                } else if (h0Var instanceof h.a) {
                    h.a aVar = (h.a) h0Var;
                    h hVar2 = h.this;
                    boolean[] zArr3 = hVar2.e;
                    int i7 = aVar.d;
                    com.amazon.aps.iva.cq.b.C(zArr3[i7]);
                    hVar2.e[i7] = false;
                }
                h0VarArr[i6] = null;
            }
            i6++;
        }
        int i8 = 0;
        while (true) {
            z2 = true;
            boolean z4 = true;
            if (i8 >= rVarArr2.length) {
                break;
            }
            h0 h0Var2 = h0VarArr[i8];
            if ((h0Var2 instanceof n) || (h0Var2 instanceof h.a)) {
                int g = g(i8, iArr3);
                if (g == -1) {
                    z4 = h0VarArr[i8] instanceof n;
                } else {
                    h0 h0Var3 = h0VarArr[i8];
                    if (!(h0Var3 instanceof h.a) || ((h.a) h0Var3).b != h0VarArr[g]) {
                        z4 = false;
                    }
                }
                if (!z4) {
                    h0 h0Var4 = h0VarArr[i8];
                    if (h0Var4 instanceof h.a) {
                        h.a aVar2 = (h.a) h0Var4;
                        h hVar3 = h.this;
                        boolean[] zArr4 = hVar3.e;
                        int i9 = aVar2.d;
                        com.amazon.aps.iva.cq.b.C(zArr4[i9]);
                        hVar3.e[i9] = false;
                    }
                    h0VarArr[i8] = null;
                }
            }
            i8++;
        }
        h0[] h0VarArr2 = h0VarArr;
        int i10 = 0;
        while (i10 < rVarArr2.length) {
            r rVar2 = rVarArr2[i10];
            if (rVar2 == null) {
                i2 = i10;
                s0Var2 = s0Var;
                iArr2 = iArr3;
            } else {
                h0 h0Var5 = h0VarArr2[i10];
                if (h0Var5 == null) {
                    zArr2[i10] = z2;
                    a aVar3 = this.l[iArr3[i10]];
                    int i11 = aVar3.c;
                    if (i11 == 0) {
                        int i12 = aVar3.f;
                        if (i12 != i) {
                            z3 = z2 ? 1 : 0;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            s0Var3 = this.k.a(i12);
                            i3 = z2 ? 1 : 0;
                        } else {
                            s0Var3 = s0Var;
                            i3 = 0;
                        }
                        int i13 = aVar3.g;
                        if (i13 != i) {
                            objArr = z2 ? 1 : 0;
                        } else {
                            objArr = null;
                        }
                        if (objArr != null) {
                            s0Var4 = this.k.a(i13);
                            i3 += s0Var4.b;
                        } else {
                            s0Var4 = s0Var;
                        }
                        v[] vVarArr = new v[i3];
                        int[] iArr4 = new int[i3];
                        if (z3) {
                            vVarArr[0] = s0Var3.e[0];
                            iArr4[0] = 5;
                            i4 = z2 ? 1 : 0;
                        } else {
                            i4 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (objArr != null) {
                            for (int i14 = 0; i14 < s0Var4.b; i14++) {
                                v vVar = s0Var4.e[i14];
                                vVarArr[i4] = vVar;
                                iArr4[i4] = 3;
                                arrayList.add(vVar);
                                i4 += z2 ? 1 : 0;
                            }
                        }
                        if (this.w.d && z3) {
                            d dVar3 = this.n;
                            cVar = new d.c(dVar3.b);
                        } else {
                            cVar = null;
                        }
                        iArr2 = iArr3;
                        i2 = i10;
                        s0Var2 = null;
                        d.c cVar2 = cVar;
                        h<androidx.media3.exoplayer.dash.a> hVar4 = new h<>(aVar3.b, iArr4, vVarArr, this.c.a(this.i, this.w, this.g, this.x, aVar3.a, rVar2, aVar3.b, this.h, z3, arrayList, cVar, this.d, this.r), this, this.j, j, this.e, this.q, this.f, this.p);
                        synchronized (this) {
                            this.o.put(hVar4, cVar2);
                        }
                        h0VarArr[i2] = hVar4;
                        h0VarArr2 = h0VarArr;
                    } else {
                        i2 = i10;
                        s0Var2 = s0Var;
                        iArr2 = iArr3;
                        if (i11 == 2) {
                            h0VarArr2[i2] = new g(this.y.get(aVar3.d), rVar2.m().e[0], this.w.d);
                        }
                    }
                } else {
                    i2 = i10;
                    s0Var2 = s0Var;
                    iArr2 = iArr3;
                    if (h0Var5 instanceof h) {
                        ((androidx.media3.exoplayer.dash.a) ((h) h0Var5).f).g(rVar2);
                    }
                }
            }
            i10 = i2 + 1;
            rVarArr2 = rVarArr;
            s0Var = s0Var2;
            iArr3 = iArr2;
            z2 = true;
            i = -1;
        }
        int[] iArr5 = iArr3;
        int i15 = 0;
        while (i15 < rVarArr.length) {
            if (h0VarArr2[i15] == null && rVarArr[i15] != null) {
                a aVar4 = this.l[iArr5[i15]];
                if (aVar4.c == 1) {
                    iArr = iArr5;
                    int g2 = g(i15, iArr);
                    if (g2 == -1) {
                        h0VarArr2[i15] = new n();
                    } else {
                        h hVar5 = (h) h0VarArr2[g2];
                        int i16 = aVar4.b;
                        int i17 = 0;
                        while (true) {
                            com.amazon.aps.iva.o6.g0[] g0VarArr2 = hVar5.o;
                            if (i17 < g0VarArr2.length) {
                                if (hVar5.c[i17] == i16) {
                                    boolean[] zArr5 = hVar5.e;
                                    com.amazon.aps.iva.cq.b.C(!zArr5[i17]);
                                    zArr5[i17] = true;
                                    g0VarArr2[i17].x(j, true);
                                    h0VarArr2[i15] = new h.a(hVar5, g0VarArr2[i17], i17);
                                    break;
                                }
                                i17++;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    i15++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            } else {
                iArr = iArr5;
            }
            i15++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (h0 h0Var6 : h0VarArr2) {
            if (h0Var6 instanceof h) {
                arrayList2.add((h) h0Var6);
            } else if (h0Var6 instanceof g) {
                arrayList3.add((g) h0Var6);
            }
        }
        h<androidx.media3.exoplayer.dash.a>[] hVarArr = new h[arrayList2.size()];
        this.t = hVarArr;
        arrayList2.toArray(hVarArr);
        g[] gVarArr = new g[arrayList3.size()];
        this.u = gVarArr;
        arrayList3.toArray(gVarArr);
        com.amazon.aps.iva.o6.h hVar6 = this.m;
        h<androidx.media3.exoplayer.dash.a>[] hVarArr2 = this.t;
        hVar6.getClass();
        this.v = new d2(hVarArr2);
        return j;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean isLoading() {
        return this.v.isLoading();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final long j() {
        return -9223372036854775807L;
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void k(u.a aVar, long j) {
        this.s = aVar;
        aVar.d(this);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void n() throws IOException {
        this.i.a();
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final boolean p(long j) {
        return this.v.p(j);
    }

    @Override // com.amazon.aps.iva.o6.u
    public final o0 q() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final long s() {
        return this.v.s();
    }

    @Override // com.amazon.aps.iva.o6.u
    public final void t(long j, boolean z2) {
        h<androidx.media3.exoplayer.dash.a>[] hVarArr;
        long j2;
        for (h<androidx.media3.exoplayer.dash.a> hVar : this.t) {
            if (!hVar.y()) {
                com.amazon.aps.iva.o6.g0 g0Var = hVar.n;
                int i = g0Var.q;
                g0Var.h(z2, true, j);
                com.amazon.aps.iva.o6.g0 g0Var2 = hVar.n;
                int i2 = g0Var2.q;
                if (i2 > i) {
                    synchronized (g0Var2) {
                        if (g0Var2.p == 0) {
                            j2 = Long.MIN_VALUE;
                        } else {
                            j2 = g0Var2.n[g0Var2.r];
                        }
                    }
                    int i3 = 0;
                    while (true) {
                        com.amazon.aps.iva.o6.g0[] g0VarArr = hVar.o;
                        if (i3 >= g0VarArr.length) {
                            break;
                        }
                        g0VarArr[i3].h(z2, hVar.e[i3], j2);
                        i3++;
                    }
                }
                int min = Math.min(hVar.A(i2, 0), hVar.v);
                if (min > 0) {
                    g0.V(0, min, hVar.l);
                    hVar.v -= min;
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.o6.i0
    public final void v(long j) {
        this.v.v(j);
    }
}
