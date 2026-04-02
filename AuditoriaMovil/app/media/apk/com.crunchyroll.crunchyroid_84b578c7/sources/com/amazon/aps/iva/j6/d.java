package com.amazon.aps.iva.j6;

import android.net.Uri;
import com.amazon.aps.iva.q5.r;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: HlsMediaPlaylist.java */
/* loaded from: classes.dex */
public final class d extends f {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final r q;
    public final ImmutableList r;
    public final ImmutableList s;
    public final ImmutableMap t;
    public final long u;
    public final e v;

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes.dex */
    public static final class a extends C0402d {
        public final boolean m;
        public final boolean n;

        public a(String str, c cVar, long j, int i, long j2, r rVar, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, cVar, j, i, j2, rVar, str2, str3, j3, j4, z);
            this.m = z2;
            this.n = z3;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final Uri a;
        public final long b;
        public final int c;

        public b(Uri uri, long j, int i) {
            this.a = uri;
            this.b = j;
            this.c = i;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* renamed from: com.amazon.aps.iva.j6.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0402d implements Comparable<Long> {
        public final String b;
        public final c c;
        public final long d;
        public final int e;
        public final long f;
        public final r g;
        public final String h;
        public final String i;
        public final long j;
        public final long k;
        public final boolean l;

        public C0402d(String str, c cVar, long j, int i, long j2, r rVar, String str2, String str3, long j3, long j4, boolean z) {
            this.b = str;
            this.c = cVar;
            this.d = j;
            this.e = i;
            this.f = j2;
            this.g = rVar;
            this.h = str2;
            this.i = str3;
            this.j = j3;
            this.k = j4;
            this.l = z;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l) {
            Long l2 = l;
            long longValue = l2.longValue();
            long j = this.f;
            if (j > longValue) {
                return 1;
            }
            if (j < l2.longValue()) {
                return -1;
            }
            return 0;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final long a;
        public final boolean b;
        public final long c;
        public final long d;
        public final boolean e;

        public e(long j, boolean z, long j2, long j3, boolean z2) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = j3;
            this.e = z2;
        }
    }

    public d(int i, String str, List<String> list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, r rVar, List<c> list2, List<a> list3, e eVar, Map<Uri, b> map) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = rVar;
        this.r = ImmutableList.copyOf((Collection) list2);
        this.s = ImmutableList.copyOf((Collection) list3);
        this.t = ImmutableMap.copyOf((Map) map);
        if (!list3.isEmpty()) {
            a aVar = (a) Iterables.getLast(list3);
            this.u = aVar.f + aVar.d;
        } else if (!list2.isEmpty()) {
            c cVar = (c) Iterables.getLast(list2);
            this.u = cVar.f + cVar.d;
        } else {
            this.u = 0L;
        }
        long j6 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                j6 = Math.min(this.u, j);
            } else {
                j6 = Math.max(0L, this.u + j);
            }
        }
        this.e = j6;
        this.f = j >= 0;
        this.v = eVar;
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* loaded from: classes.dex */
    public static final class c extends C0402d {
        public final String m;
        public final ImmutableList n;

        public c(String str, String str2, long j, String str3, long j2) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ImmutableList.of());
        }

        public c(String str, c cVar, String str2, long j, int i, long j2, r rVar, String str3, String str4, long j3, long j4, boolean z, List<a> list) {
            super(str, cVar, j, i, j2, rVar, str3, str4, j3, j4, z);
            this.m = str2;
            this.n = ImmutableList.copyOf((Collection) list);
        }
    }

    @Override // com.amazon.aps.iva.m6.q
    public final f a(List list) {
        return this;
    }
}
