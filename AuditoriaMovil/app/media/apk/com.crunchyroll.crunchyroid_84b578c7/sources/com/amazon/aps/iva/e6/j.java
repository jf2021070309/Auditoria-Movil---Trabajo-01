package com.amazon.aps.iva.e6;

import android.net.Uri;
import com.amazon.aps.iva.e6.k;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: Representation.java */
/* loaded from: classes.dex */
public abstract class j {
    public final v b;
    public final ImmutableList<com.amazon.aps.iva.e6.b> c;
    public final long d;
    public final List<e> e;
    public final List<e> f;
    public final List<e> g;
    public final i h;

    /* compiled from: Representation.java */
    /* loaded from: classes.dex */
    public static class b extends j {
        public final String i;
        public final i j;
        public final com.amazon.aps.iva.p0.e k;

        public b(long j, v vVar, ImmutableList immutableList, k.e eVar, ArrayList arrayList, List list, List list2) {
            super(vVar, immutableList, eVar, arrayList, list, list2);
            i iVar;
            Uri.parse(((com.amazon.aps.iva.e6.b) immutableList.get(0)).a);
            long j2 = eVar.e;
            if (j2 <= 0) {
                iVar = null;
            } else {
                iVar = new i(null, eVar.d, j2);
            }
            this.j = iVar;
            this.i = null;
            this.k = iVar == null ? new com.amazon.aps.iva.p0.e(new i(null, 0L, -1L)) : null;
        }

        @Override // com.amazon.aps.iva.e6.j
        public final String h() {
            return this.i;
        }

        @Override // com.amazon.aps.iva.e6.j
        public final com.amazon.aps.iva.d6.d i() {
            return this.k;
        }

        @Override // com.amazon.aps.iva.e6.j
        public final i m() {
            return this.j;
        }
    }

    public j() {
        throw null;
    }

    public j(v vVar, ImmutableList immutableList, k kVar, ArrayList arrayList, List list, List list2) {
        com.amazon.aps.iva.cq.b.t(!immutableList.isEmpty());
        this.b = vVar;
        this.c = ImmutableList.copyOf((Collection) immutableList);
        this.e = Collections.unmodifiableList(arrayList);
        this.f = list;
        this.g = list2;
        this.h = kVar.a(this);
        this.d = g0.X(kVar.c, 1000000L, kVar.b);
    }

    public abstract String h();

    public abstract com.amazon.aps.iva.d6.d i();

    public abstract i m();

    public final i n() {
        return this.h;
    }

    /* compiled from: Representation.java */
    /* loaded from: classes.dex */
    public static class a extends j implements com.amazon.aps.iva.d6.d {
        public final k.a i;

        public a(long j, v vVar, ImmutableList immutableList, k.a aVar, ArrayList arrayList, List list, List list2) {
            super(vVar, immutableList, aVar, arrayList, list, list2);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.d6.d
        public final long a(long j) {
            return this.i.g(j);
        }

        @Override // com.amazon.aps.iva.d6.d
        public final long b(long j, long j2) {
            return this.i.e(j, j2);
        }

        @Override // com.amazon.aps.iva.d6.d
        public final long c(long j, long j2) {
            return this.i.c(j, j2);
        }

        @Override // com.amazon.aps.iva.d6.d
        public final long d(long j, long j2) {
            k.a aVar = this.i;
            if (aVar.f != null) {
                return -9223372036854775807L;
            }
            long b = aVar.b(j, j2) + aVar.c(j, j2);
            return (aVar.e(b, j) + aVar.g(b)) - aVar.i;
        }

        @Override // com.amazon.aps.iva.d6.d
        public final i e(long j) {
            return this.i.h(j, this);
        }

        @Override // com.amazon.aps.iva.d6.d
        public final long f(long j, long j2) {
            return this.i.f(j, j2);
        }

        @Override // com.amazon.aps.iva.d6.d
        public final long g(long j) {
            return this.i.d(j);
        }

        @Override // com.amazon.aps.iva.e6.j
        public final String h() {
            return null;
        }

        @Override // com.amazon.aps.iva.d6.d
        public final boolean j() {
            return this.i.i();
        }

        @Override // com.amazon.aps.iva.d6.d
        public final long k() {
            return this.i.d;
        }

        @Override // com.amazon.aps.iva.d6.d
        public final long l(long j, long j2) {
            return this.i.b(j, j2);
        }

        @Override // com.amazon.aps.iva.e6.j
        public final i m() {
            return null;
        }

        @Override // com.amazon.aps.iva.e6.j
        public final com.amazon.aps.iva.d6.d i() {
            return this;
        }
    }
}
