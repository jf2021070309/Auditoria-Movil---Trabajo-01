package com.amazon.aps.iva.s6;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.amazon.aps.iva.a6.p1;
import com.amazon.aps.iva.o6.o0;
import com.amazon.aps.iva.q5.s0;
import com.amazon.aps.iva.q5.t0;
import com.amazon.aps.iva.q5.u0;
import com.amazon.aps.iva.s6.a;
import com.amazon.aps.iva.s6.r;
import com.amazon.aps.iva.s6.t;
import com.amazon.aps.iva.s6.w;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: DefaultTrackSelector.java */
/* loaded from: classes.dex */
public final class g extends t implements p1.a {
    public static final Ordering<Integer> k = Ordering.from(new com.amazon.aps.iva.d6.a(1));
    public static final Ordering<Integer> l = Ordering.from(new com.amazon.aps.iva.s6.d(0));
    public final Object d;
    public final Context e;
    public final r.b f;
    public final boolean g;
    public c h;
    public final e i;
    public com.amazon.aps.iva.q5.f j;

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC0697g<a> implements Comparable<a> {
        public final int f;
        public final boolean g;
        public final String h;
        public final c i;
        public final boolean j;
        public final int k;
        public final int l;
        public final int m;
        public final boolean n;
        public final int o;
        public final int p;
        public final boolean q;
        public final int r;
        public final int s;
        public final int t;
        public final int u;
        public final boolean v;
        public final boolean w;

        public a(int i, s0 s0Var, int i2, c cVar, int i3, boolean z, com.amazon.aps.iva.s6.f fVar) {
            super(i, i2, s0Var);
            int i4;
            int i5;
            boolean z2;
            boolean z3;
            boolean z4;
            int i6;
            boolean z5;
            boolean z6;
            boolean z7;
            this.i = cVar;
            this.h = g.v0(this.e.d);
            int i7 = 0;
            this.j = g.t0(i3, false);
            int i8 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i8 < cVar.o.size()) {
                    i5 = g.j0(this.e, cVar.o.get(i8), false);
                    if (i5 > 0) {
                        break;
                    }
                    i8++;
                } else {
                    i5 = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.l = i8;
            this.k = i5;
            this.m = g.Y(this.e.f, cVar.p);
            com.amazon.aps.iva.q5.v vVar = this.e;
            int i9 = vVar.f;
            if (i9 != 0 && (i9 & 1) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.n = z2;
            if ((vVar.e & 1) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.q = z3;
            int i10 = vVar.z;
            this.r = i10;
            this.s = vVar.A;
            int i11 = vVar.i;
            this.t = i11;
            if ((i11 == -1 || i11 <= cVar.r) && ((i10 == -1 || i10 <= cVar.q) && fVar.apply(vVar))) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.g = z4;
            String[] E = g0.E();
            int i12 = 0;
            while (true) {
                if (i12 < E.length) {
                    i6 = g.j0(this.e, E[i12], false);
                    if (i6 > 0) {
                        break;
                    }
                    i12++;
                } else {
                    i6 = 0;
                    i12 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.o = i12;
            this.p = i6;
            int i13 = 0;
            while (true) {
                ImmutableList<String> immutableList = cVar.s;
                if (i13 < immutableList.size()) {
                    String str = this.e.m;
                    if (str != null && str.equals(immutableList.get(i13))) {
                        i4 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            this.u = i4;
            if (p1.i(i3) == 128) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.v = z5;
            if (p1.q(i3) == 64) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.w = z6;
            c cVar2 = this.i;
            if (g.t0(i3, cVar2.G0) && ((z7 = this.g) || cVar2.A0)) {
                i7 = (!g.t0(i3, false) || !z7 || this.e.i == -1 || cVar2.y || cVar2.x || (!cVar2.I0 && z)) ? 1 : 2;
            }
            this.f = i7;
        }

        @Override // com.amazon.aps.iva.s6.g.AbstractC0697g
        public final int a() {
            return this.f;
        }

        @Override // com.amazon.aps.iva.s6.g.AbstractC0697g
        public final boolean b(a aVar) {
            int i;
            String str;
            int i2;
            a aVar2 = aVar;
            c cVar = this.i;
            boolean z = cVar.D0;
            com.amazon.aps.iva.q5.v vVar = aVar2.e;
            com.amazon.aps.iva.q5.v vVar2 = this.e;
            if ((z || ((i2 = vVar2.z) != -1 && i2 == vVar.z)) && ((cVar.B0 || ((str = vVar2.m) != null && TextUtils.equals(str, vVar.m))) && (cVar.C0 || ((i = vVar2.A) != -1 && i == vVar.A)))) {
                if (!cVar.E0) {
                    if (this.v != aVar2.v || this.w != aVar2.w) {
                    }
                }
                return true;
            }
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public final int compareTo(a aVar) {
            Object reverse;
            Ordering<Integer> ordering;
            boolean z = this.j;
            boolean z2 = this.g;
            if (z2 && z) {
                reverse = g.k;
            } else {
                reverse = g.k.reverse();
            }
            ComparisonChain compare = ComparisonChain.start().compareFalseFirst(z, aVar.j).compare(Integer.valueOf(this.l), Integer.valueOf(aVar.l), Ordering.natural().reverse()).compare(this.k, aVar.k).compare(this.m, aVar.m).compareFalseFirst(this.q, aVar.q).compareFalseFirst(this.n, aVar.n).compare(Integer.valueOf(this.o), Integer.valueOf(aVar.o), Ordering.natural().reverse()).compare(this.p, aVar.p).compareFalseFirst(z2, aVar.g).compare(Integer.valueOf(this.u), Integer.valueOf(aVar.u), Ordering.natural().reverse());
            int i = this.t;
            Integer valueOf = Integer.valueOf(i);
            int i2 = aVar.t;
            Integer valueOf2 = Integer.valueOf(i2);
            if (this.i.x) {
                ordering = g.k.reverse();
            } else {
                ordering = g.l;
            }
            ComparisonChain compare2 = compare.compare(valueOf, valueOf2, ordering).compareFalseFirst(this.v, aVar.v).compareFalseFirst(this.w, aVar.w).compare(Integer.valueOf(this.r), Integer.valueOf(aVar.r), reverse).compare(Integer.valueOf(this.s), Integer.valueOf(aVar.s), reverse);
            Integer valueOf3 = Integer.valueOf(i);
            Integer valueOf4 = Integer.valueOf(i2);
            if (!g0.a(this.h, aVar.h)) {
                reverse = g.l;
            }
            return compare2.compare(valueOf3, valueOf4, reverse).result();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {
        public final boolean b;
        public final boolean c;

        public b(int i, com.amazon.aps.iva.q5.v vVar) {
            this.b = (vVar.e & 1) != 0;
            this.c = g.t0(i, false);
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            return ComparisonChain.start().compareFalseFirst(this.c, bVar2.c).compareFalseFirst(this.b, bVar2.b).result();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class d implements com.amazon.aps.iva.q5.k {
        public static final String e = g0.L(0);
        public static final String f = g0.L(1);
        public static final String g = g0.L(2);
        public final int b;
        public final int[] c;
        public final int d;

        static {
            new com.amazon.aps.iva.q5.p(4);
        }

        public d(int i, int i2, int[] iArr) {
            this.b = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.c = copyOf;
            this.d = i2;
            Arrays.sort(copyOf);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b == dVar.b && Arrays.equals(this.c, dVar.c) && this.d == dVar.d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((Arrays.hashCode(this.c) + (this.b * 31)) * 31) + this.d;
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(e, this.b);
            bundle.putIntArray(f, this.c);
            bundle.putInt(g, this.d);
            return bundle;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static class e {
        public final Spatializer a;
        public final boolean b;
        public Handler c;
        public o d;

        public e(Spatializer spatializer) {
            int immersiveAudioLevel;
            boolean z;
            this.a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            if (immersiveAudioLevel != 0) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
        }

        public final boolean a(com.amazon.aps.iva.q5.f fVar, com.amazon.aps.iva.q5.v vVar) {
            boolean canBeSpatialized;
            boolean equals = "audio/eac3-joc".equals(vVar.m);
            int i = vVar.z;
            if (equals && i == 16) {
                i = 12;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(g0.q(i));
            int i2 = vVar.A;
            if (i2 != -1) {
                channelMask.setSampleRate(i2);
            }
            canBeSpatialized = this.a.canBeSpatialized(fVar.a().a, channelMask.build());
            return canBeSpatialized;
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC0697g<f> implements Comparable<f> {
        public final int f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final boolean n;

        public f(int i, s0 s0Var, int i2, c cVar, int i3, String str) {
            super(i, i2, s0Var);
            boolean z;
            boolean z2;
            ImmutableList<String> immutableList;
            int i4;
            boolean z3;
            boolean z4;
            boolean z5;
            int i5 = 0;
            this.g = g.t0(i3, false);
            int i6 = this.e.e & (~cVar.v);
            if ((i6 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.h = z;
            if ((i6 & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.i = z2;
            ImmutableList<String> immutableList2 = cVar.t;
            if (immutableList2.isEmpty()) {
                immutableList = ImmutableList.of("");
            } else {
                immutableList = immutableList2;
            }
            int i7 = 0;
            while (true) {
                if (i7 < immutableList.size()) {
                    i4 = g.j0(this.e, immutableList.get(i7), cVar.w);
                    if (i4 > 0) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                }
            }
            this.j = i7;
            this.k = i4;
            int Y = g.Y(this.e.f, cVar.u);
            this.l = Y;
            if ((this.e.f & 1088) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.n = z3;
            if (g.v0(str) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int j0 = g.j0(this.e, str, z4);
            this.m = j0;
            if (i4 <= 0 && ((!immutableList2.isEmpty() || Y <= 0) && !this.h && (!this.i || j0 <= 0))) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (g.t0(i3, cVar.G0) && z5) {
                i5 = 1;
            }
            this.f = i5;
        }

        @Override // com.amazon.aps.iva.s6.g.AbstractC0697g
        public final int a() {
            return this.f;
        }

        @Override // com.amazon.aps.iva.s6.g.AbstractC0697g
        public final /* bridge */ /* synthetic */ boolean b(f fVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public final int compareTo(f fVar) {
            Ordering reverse;
            ComparisonChain compare = ComparisonChain.start().compareFalseFirst(this.g, fVar.g).compare(Integer.valueOf(this.j), Integer.valueOf(fVar.j), Ordering.natural().reverse());
            int i = fVar.k;
            int i2 = this.k;
            ComparisonChain compare2 = compare.compare(i2, i);
            int i3 = fVar.l;
            int i4 = this.l;
            ComparisonChain compareFalseFirst = compare2.compare(i4, i3).compareFalseFirst(this.h, fVar.h);
            Boolean valueOf = Boolean.valueOf(this.i);
            Boolean valueOf2 = Boolean.valueOf(fVar.i);
            if (i2 == 0) {
                reverse = Ordering.natural();
            } else {
                reverse = Ordering.natural().reverse();
            }
            ComparisonChain compare3 = compareFalseFirst.compare(valueOf, valueOf2, reverse).compare(this.m, fVar.m);
            if (i4 == 0) {
                compare3 = compare3.compareTrueFirst(this.n, fVar.n);
            }
            return compare3.result();
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* renamed from: com.amazon.aps.iva.s6.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0697g<T extends AbstractC0697g<T>> {
        public final int b;
        public final s0 c;
        public final int d;
        public final com.amazon.aps.iva.q5.v e;

        /* compiled from: DefaultTrackSelector.java */
        /* renamed from: com.amazon.aps.iva.s6.g$g$a */
        /* loaded from: classes.dex */
        public interface a<T extends AbstractC0697g<T>> {
            ImmutableList a(int i, s0 s0Var, int[] iArr);
        }

        public AbstractC0697g(int i, int i2, s0 s0Var) {
            this.b = i;
            this.c = s0Var;
            this.d = i2;
            this.e = s0Var.e[i2];
        }

        public abstract int a();

        public abstract boolean b(T t);
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC0697g<h> {
        public final boolean f;
        public final c g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final int m;
        public final boolean n;
        public final boolean o;
        public final int p;
        public final boolean q;
        public final boolean r;
        public final int s;

        /* JADX WARN: Removed duplicated region for block: B:105:0x00c6 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public h(int r5, com.amazon.aps.iva.q5.s0 r6, int r7, com.amazon.aps.iva.s6.g.c r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s6.g.h.<init>(int, com.amazon.aps.iva.q5.s0, int, com.amazon.aps.iva.s6.g$c, int, int, boolean):void");
        }

        public static int c(h hVar, h hVar2) {
            Object reverse;
            Ordering<Integer> ordering;
            if (hVar.f && hVar.i) {
                reverse = g.k;
            } else {
                reverse = g.k.reverse();
            }
            ComparisonChain start = ComparisonChain.start();
            int i = hVar.j;
            Integer valueOf = Integer.valueOf(i);
            Integer valueOf2 = Integer.valueOf(hVar2.j);
            if (hVar.g.x) {
                ordering = g.k.reverse();
            } else {
                ordering = g.l;
            }
            return start.compare(valueOf, valueOf2, ordering).compare(Integer.valueOf(hVar.k), Integer.valueOf(hVar2.k), reverse).compare(Integer.valueOf(i), Integer.valueOf(hVar2.j), reverse).result();
        }

        public static int f(h hVar, h hVar2) {
            ComparisonChain compare = ComparisonChain.start().compareFalseFirst(hVar.i, hVar2.i).compare(hVar.m, hVar2.m).compareFalseFirst(hVar.n, hVar2.n).compareFalseFirst(hVar.f, hVar2.f).compareFalseFirst(hVar.h, hVar2.h).compare(Integer.valueOf(hVar.l), Integer.valueOf(hVar2.l), Ordering.natural().reverse());
            boolean z = hVar.q;
            ComparisonChain compareFalseFirst = compare.compareFalseFirst(z, hVar2.q);
            boolean z2 = hVar.r;
            ComparisonChain compareFalseFirst2 = compareFalseFirst.compareFalseFirst(z2, hVar2.r);
            if (z && z2) {
                compareFalseFirst2 = compareFalseFirst2.compare(hVar.s, hVar2.s);
            }
            return compareFalseFirst2.result();
        }

        @Override // com.amazon.aps.iva.s6.g.AbstractC0697g
        public final int a() {
            return this.p;
        }

        @Override // com.amazon.aps.iva.s6.g.AbstractC0697g
        public final boolean b(h hVar) {
            h hVar2 = hVar;
            if (this.o || g0.a(this.e.m, hVar2.e.m)) {
                if (!this.g.z0) {
                    if (this.q != hVar2.q || this.r != hVar2.r) {
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(Context context, a.b bVar) {
        this(new c.a(context).r(), bVar, context);
        c cVar = c.M0;
    }

    public static int Y(int i, int i2) {
        if (i != 0 && i == i2) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i & i2);
    }

    public static int a0(String str) {
        if (str == null) {
            return 0;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    public static void f0(o0 o0Var, c cVar, HashMap hashMap) {
        for (int i = 0; i < o0Var.b; i++) {
            t0 t0Var = cVar.z.get(o0Var.a(i));
            if (t0Var != null) {
                s0 s0Var = t0Var.b;
                t0 t0Var2 = (t0) hashMap.get(Integer.valueOf(s0Var.d));
                if (t0Var2 == null || (t0Var2.c.isEmpty() && !t0Var.c.isEmpty())) {
                    hashMap.put(Integer.valueOf(s0Var.d), t0Var);
                }
            }
        }
    }

    public static int j0(com.amazon.aps.iva.q5.v vVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.d)) {
            return 4;
        }
        String v0 = v0(str);
        String v02 = v0(vVar.d);
        if (v02 != null && v0 != null) {
            if (!v02.startsWith(v0) && !v0.startsWith(v02)) {
                int i = g0.a;
                if (!v02.split("-", 2)[0].equals(v0.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z || v02 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean t0(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4 && (!z || i2 != 3)) {
            return false;
        }
        return true;
    }

    public static String v0(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair w0(int i, t.a aVar, int[][][] iArr, AbstractC0697g.a aVar2, Comparator comparator) {
        o0 o0Var;
        RandomAccess randomAccess;
        boolean z;
        t.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < aVar3.a) {
            if (i == aVar3.b[i2]) {
                o0 o0Var2 = aVar3.c[i2];
                for (int i3 = 0; i3 < o0Var2.b; i3++) {
                    s0 a2 = o0Var2.a(i3);
                    ImmutableList a3 = aVar2.a(i2, a2, iArr[i2][i3]);
                    boolean[] zArr = new boolean[a2.b];
                    int i4 = 0;
                    while (true) {
                        int i5 = a2.b;
                        if (i4 < i5) {
                            AbstractC0697g abstractC0697g = (AbstractC0697g) a3.get(i4);
                            int a4 = abstractC0697g.a();
                            if (!zArr[i4] && a4 != 0) {
                                if (a4 == 1) {
                                    randomAccess = ImmutableList.of(abstractC0697g);
                                    o0Var = o0Var2;
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(abstractC0697g);
                                    int i6 = i4 + 1;
                                    while (i6 < i5) {
                                        AbstractC0697g abstractC0697g2 = (AbstractC0697g) a3.get(i6);
                                        o0 o0Var3 = o0Var2;
                                        if (abstractC0697g2.a() == 2 && abstractC0697g.b(abstractC0697g2)) {
                                            arrayList2.add(abstractC0697g2);
                                            z = true;
                                            zArr[i6] = true;
                                        } else {
                                            z = true;
                                        }
                                        i6++;
                                        o0Var2 = o0Var3;
                                    }
                                    o0Var = o0Var2;
                                    randomAccess = arrayList2;
                                }
                                arrayList.add(randomAccess);
                            } else {
                                o0Var = o0Var2;
                            }
                            i4++;
                            o0Var2 = o0Var;
                        }
                    }
                }
            }
            i2++;
            aVar3 = aVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((AbstractC0697g) list.get(i7)).d;
        }
        AbstractC0697g abstractC0697g3 = (AbstractC0697g) list.get(0);
        return Pair.create(new r.a(0, abstractC0697g3.c, iArr2), Integer.valueOf(abstractC0697g3.b));
    }

    @Override // com.amazon.aps.iva.s6.w
    public final u0 I() {
        c cVar;
        synchronized (this.d) {
            cVar = this.h;
        }
        return cVar;
    }

    @Override // com.amazon.aps.iva.s6.w
    public final void T(com.amazon.aps.iva.q5.f fVar) {
        boolean z;
        synchronized (this.d) {
            if (!this.j.equals(fVar)) {
                z = true;
            } else {
                z = false;
            }
            this.j = fVar;
        }
        if (z) {
            u0();
        }
    }

    @Override // com.amazon.aps.iva.s6.w
    public final void U(u0 u0Var) {
        c cVar;
        if (u0Var instanceof c) {
            x0((c) u0Var);
        }
        synchronized (this.d) {
            cVar = this.h;
        }
        c.a aVar = new c.a(cVar);
        aVar.e(u0Var);
        x0(new c(aVar));
    }

    @Override // com.amazon.aps.iva.s6.w
    public final void release() {
        e eVar;
        o oVar;
        synchronized (this.d) {
            try {
                if (g0.a >= 32 && (eVar = this.i) != null && (oVar = eVar.d) != null && eVar.c != null) {
                    eVar.a.removeOnSpatializerStateChangedListener(oVar);
                    eVar.c.removeCallbacksAndMessages(null);
                    eVar.c = null;
                    eVar.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.release();
    }

    public final void u0() {
        boolean z;
        w.a aVar;
        e eVar;
        synchronized (this.d) {
            if (this.h.F0 && !this.g && g0.a >= 32 && (eVar = this.i) != null && eVar.b) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z && (aVar = this.b) != null) {
            aVar.b();
        }
    }

    public final void x0(c cVar) {
        boolean z;
        cVar.getClass();
        synchronized (this.d) {
            if (!this.h.equals(cVar)) {
                z = true;
            } else {
                z = false;
            }
            this.h = cVar;
        }
        if (z) {
            if (cVar.F0 && this.e == null) {
                com.amazon.aps.iva.t5.p.g();
            }
            w.a aVar = this.b;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    /* compiled from: DefaultTrackSelector.java */
    /* loaded from: classes.dex */
    public static final class c extends u0 {
        public static final c M0 = new a().r();
        public static final String N0 = g0.L(1000);
        public static final String O0 = g0.L(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
        public static final String P0 = g0.L(1002);
        public static final String Q0 = g0.L(1003);
        public static final String R0 = g0.L(1004);
        public static final String S0 = g0.L(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
        public static final String T0 = g0.L(1006);
        public static final String U0 = g0.L(1007);
        public static final String V0 = g0.L(1008);
        public static final String W0 = g0.L(1009);
        public static final String X0 = g0.L(1010);
        public static final String Y0 = g0.L(1011);
        public static final String Z0 = g0.L(1012);
        public static final String a1 = g0.L(1013);
        public static final String b1 = g0.L(1014);
        public static final String c1 = g0.L(1015);
        public static final String d1 = g0.L(1016);
        public static final String e1 = g0.L(1017);
        public final boolean A0;
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        public final boolean E0;
        public final boolean F0;
        public final boolean G0;
        public final boolean H0;
        public final boolean I0;
        public final boolean J0;
        public final SparseArray<Map<o0, d>> K0;
        public final SparseBooleanArray L0;
        public final boolean w0;
        public final boolean x0;
        public final boolean y0;
        public final boolean z0;

        public c(a aVar) {
            super(aVar);
            this.w0 = aVar.A;
            this.x0 = aVar.B;
            this.y0 = aVar.C;
            this.z0 = aVar.D;
            this.A0 = aVar.E;
            this.B0 = aVar.F;
            this.C0 = aVar.G;
            this.D0 = aVar.H;
            this.E0 = aVar.I;
            this.F0 = aVar.J;
            this.G0 = aVar.K;
            this.H0 = aVar.L;
            this.I0 = aVar.M;
            this.J0 = aVar.N;
            this.K0 = aVar.O;
            this.L0 = aVar.P;
        }

        @Override // com.amazon.aps.iva.q5.u0
        public final u0.a a() {
            return new a(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x00f9 A[LOOP:0: B:55:0x00a2->B:72:0x00f9, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x009f A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
        @Override // com.amazon.aps.iva.q5.u0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s6.g.c.equals(java.lang.Object):boolean");
        }

        @Override // com.amazon.aps.iva.q5.u0
        public final int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.w0 ? 1 : 0)) * 31) + (this.x0 ? 1 : 0)) * 31) + (this.y0 ? 1 : 0)) * 31) + (this.z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0)) * 31) + (this.E0 ? 1 : 0)) * 31) + (this.F0 ? 1 : 0)) * 31) + (this.G0 ? 1 : 0)) * 31) + (this.H0 ? 1 : 0)) * 31) + (this.I0 ? 1 : 0)) * 31) + (this.J0 ? 1 : 0);
        }

        @Override // com.amazon.aps.iva.q5.u0, com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(N0, this.w0);
            bundle.putBoolean(O0, this.x0);
            bundle.putBoolean(P0, this.y0);
            bundle.putBoolean(b1, this.z0);
            bundle.putBoolean(Q0, this.A0);
            bundle.putBoolean(R0, this.B0);
            bundle.putBoolean(S0, this.C0);
            bundle.putBoolean(T0, this.D0);
            bundle.putBoolean(c1, this.E0);
            bundle.putBoolean(d1, this.F0);
            bundle.putBoolean(U0, this.G0);
            bundle.putBoolean(V0, this.H0);
            bundle.putBoolean(W0, this.I0);
            bundle.putBoolean(e1, this.J0);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = new SparseArray();
            int i = 0;
            while (true) {
                SparseArray<Map<o0, d>> sparseArray2 = this.K0;
                if (i >= sparseArray2.size()) {
                    break;
                }
                int keyAt = sparseArray2.keyAt(i);
                for (Map.Entry<o0, d> entry : sparseArray2.valueAt(i).entrySet()) {
                    d value = entry.getValue();
                    if (value != null) {
                        sparseArray.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                bundle.putIntArray(X0, Ints.toArray(arrayList));
                bundle.putParcelableArrayList(Y0, com.amazon.aps.iva.t5.c.b(arrayList2));
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    sparseArray3.put(sparseArray.keyAt(i2), ((com.amazon.aps.iva.q5.k) sparseArray.valueAt(i2)).toBundle());
                }
                bundle.putSparseParcelableArray(Z0, sparseArray3);
                i++;
            }
            SparseBooleanArray sparseBooleanArray = this.L0;
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
                iArr[i3] = sparseBooleanArray.keyAt(i3);
            }
            bundle.putIntArray(a1, iArr);
            return bundle;
        }

        /* compiled from: DefaultTrackSelector.java */
        /* loaded from: classes.dex */
        public static final class a extends u0.a {
            public boolean A;
            public boolean B;
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public boolean N;
            public final SparseArray<Map<o0, d>> O;
            public final SparseBooleanArray P;

            @Deprecated
            public a() {
                this.O = new SparseArray<>();
                this.P = new SparseBooleanArray();
                s();
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final void a(t0 t0Var) {
                this.y.put(t0Var.b, t0Var);
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            public final u0 b() {
                return new c(this);
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a c() {
                super.c();
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a d(int i) {
                super.d(i);
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a g() {
                this.u = -3;
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a h(int i) {
                this.d = i;
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a i(int i, int i2) {
                this.a = i;
                this.b = i2;
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a j(int i, int i2) {
                this.e = i;
                this.f = i2;
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a k(t0 t0Var) {
                super.k(t0Var);
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a l(String str) {
                super.l(str);
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a m(Context context) {
                super.m(context);
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a n(String[] strArr) {
                super.n(strArr);
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a o(int i, boolean z) {
                super.o(i, z);
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final u0.a p(int i, int i2) {
                super.p(i, i2);
                return this;
            }

            @Override // com.amazon.aps.iva.q5.u0.a
            @CanIgnoreReturnValue
            public final void q(Context context) {
                super.q(context);
            }

            public final c r() {
                return new c(this);
            }

            public final void s() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
                this.N = false;
            }

            public a(Context context) {
                super(context);
                this.O = new SparseArray<>();
                this.P = new SparseBooleanArray();
                s();
            }

            public a(c cVar) {
                super(cVar);
                this.A = cVar.w0;
                this.B = cVar.x0;
                this.C = cVar.y0;
                this.D = cVar.z0;
                this.E = cVar.A0;
                this.F = cVar.B0;
                this.G = cVar.C0;
                this.H = cVar.D0;
                this.I = cVar.E0;
                this.J = cVar.F0;
                this.K = cVar.G0;
                this.L = cVar.H0;
                this.M = cVar.I0;
                this.N = cVar.J0;
                SparseArray<Map<o0, d>> sparseArray = new SparseArray<>();
                int i = 0;
                while (true) {
                    SparseArray<Map<o0, d>> sparseArray2 = cVar.K0;
                    if (i < sparseArray2.size()) {
                        sparseArray.put(sparseArray2.keyAt(i), new HashMap(sparseArray2.valueAt(i)));
                        i++;
                    } else {
                        this.O = sparseArray;
                        this.P = cVar.L0.clone();
                        return;
                    }
                }
            }
        }
    }

    public g(u0 u0Var, r.b bVar, Context context) {
        c r;
        Spatializer spatializer;
        this.d = new Object();
        e eVar = null;
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = bVar;
        if (u0Var instanceof c) {
            this.h = (c) u0Var;
        } else {
            if (context == null) {
                r = c.M0;
            } else {
                c cVar = c.M0;
                r = new c.a(context).r();
            }
            r.getClass();
            c.a aVar = new c.a(r);
            aVar.e(u0Var);
            this.h = new c(aVar);
        }
        this.j = com.amazon.aps.iva.q5.f.h;
        boolean z = context != null && g0.O(context);
        this.g = z;
        if (!z && context != null && g0.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                eVar = new e(spatializer);
            }
            this.i = eVar;
        }
        if (this.h.F0 && context == null) {
            com.amazon.aps.iva.t5.p.g();
        }
    }

    @Override // com.amazon.aps.iva.s6.w
    public final p1.a K() {
        return this;
    }
}
