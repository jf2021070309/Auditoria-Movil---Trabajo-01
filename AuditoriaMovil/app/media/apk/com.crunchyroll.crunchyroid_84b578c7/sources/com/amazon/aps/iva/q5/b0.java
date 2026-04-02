package com.amazon.aps.iva.q5;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: MediaItem.java */
/* loaded from: classes.dex */
public final class b0 implements k {
    public static final b0 h = new b().a();
    public static final String i = com.amazon.aps.iva.t5.g0.L(0);
    public static final String j = com.amazon.aps.iva.t5.g0.L(1);
    public static final String k = com.amazon.aps.iva.t5.g0.L(2);
    public static final String l = com.amazon.aps.iva.t5.g0.L(3);
    public static final String m = com.amazon.aps.iva.t5.g0.L(4);
    public static final String n = com.amazon.aps.iva.t5.g0.L(5);
    public static final z o = new z(0);
    public final String b;
    public final g c;
    public final f d;
    public final d0 e;
    public final d f;
    public final h g;

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class a implements k {
        public static final String d = com.amazon.aps.iva.t5.g0.L(0);
        public static final a0 e = new a0(0);
        public final Uri b;
        public final Object c;

        /* compiled from: MediaItem.java */
        /* renamed from: com.amazon.aps.iva.q5.b0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0635a {
            public final Uri a;
            public Object b;

            public C0635a(Uri uri) {
                this.a = uri;
            }
        }

        public a(C0635a c0635a) {
            this.b = c0635a.a;
            this.c = c0635a.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b.equals(aVar.b) && com.amazon.aps.iva.t5.g0.a(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = this.b.hashCode() * 31;
            Object obj = this.c;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(d, this.b);
            return bundle;
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static class c implements k {
        public static final d g = new d(new a());
        public static final String h = com.amazon.aps.iva.t5.g0.L(0);
        public static final String i = com.amazon.aps.iva.t5.g0.L(1);
        public static final String j = com.amazon.aps.iva.t5.g0.L(2);
        public static final String k = com.amazon.aps.iva.t5.g0.L(3);
        public static final String l = com.amazon.aps.iva.t5.g0.L(4);
        public static final m m = new m(1);
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public c(a aVar) {
            this.b = aVar.a;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.d;
            this.f = aVar.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            long j2 = this.b;
            long j3 = this.c;
            return (((((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0);
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            d dVar = g;
            long j2 = dVar.b;
            long j3 = this.b;
            if (j3 != j2) {
                bundle.putLong(h, j3);
            }
            long j4 = this.c;
            if (j4 != dVar.c) {
                bundle.putLong(i, j4);
            }
            boolean z = dVar.d;
            boolean z2 = this.d;
            if (z2 != z) {
                bundle.putBoolean(j, z2);
            }
            boolean z3 = dVar.e;
            boolean z4 = this.e;
            if (z4 != z3) {
                bundle.putBoolean(k, z4);
            }
            boolean z5 = dVar.f;
            boolean z6 = this.f;
            if (z6 != z5) {
                bundle.putBoolean(l, z6);
            }
            return bundle;
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes.dex */
        public static final class a {
            public long a;
            public long b;
            public boolean c;
            public boolean d;
            public boolean e;

            public a() {
                this.b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.a = dVar.b;
                this.b = dVar.c;
                this.c = dVar.d;
                this.d = dVar.e;
                this.e = dVar.f;
            }
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class d extends c {
        public static final d n = new d(new c.a());
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class g implements k {
        public static final String j = com.amazon.aps.iva.t5.g0.L(0);
        public static final String k = com.amazon.aps.iva.t5.g0.L(1);
        public static final String l = com.amazon.aps.iva.t5.g0.L(2);
        public static final String m = com.amazon.aps.iva.t5.g0.L(3);
        public static final String n = com.amazon.aps.iva.t5.g0.L(4);
        public static final String o = com.amazon.aps.iva.t5.g0.L(5);
        public static final String p = com.amazon.aps.iva.t5.g0.L(6);
        public static final com.amazon.aps.iva.g1.f q = new com.amazon.aps.iva.g1.f(2);
        public final Uri b;
        public final String c;
        public final e d;
        public final a e;
        public final List<p0> f;
        public final String g;
        public final ImmutableList<j> h;
        public final Object i;

        public g(Uri uri, String str, e eVar, a aVar, List<p0> list, String str2, ImmutableList<j> immutableList, Object obj) {
            this.b = uri;
            this.c = str;
            this.d = eVar;
            this.e = aVar;
            this.f = list;
            this.g = str2;
            this.h = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                builder.add((ImmutableList.Builder) j.a.a(immutableList.get(i).a()));
            }
            builder.build();
            this.i = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.b.equals(gVar.b) && com.amazon.aps.iva.t5.g0.a(this.c, gVar.c) && com.amazon.aps.iva.t5.g0.a(this.d, gVar.d) && com.amazon.aps.iva.t5.g0.a(this.e, gVar.e) && this.f.equals(gVar.f) && com.amazon.aps.iva.t5.g0.a(this.g, gVar.g) && this.h.equals(gVar.h) && com.amazon.aps.iva.t5.g0.a(this.i, gVar.i)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = this.b.hashCode() * 31;
            int i = 0;
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode5 + hashCode) * 31;
            e eVar = this.d;
            if (eVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = eVar.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            a aVar = this.e;
            if (aVar == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = aVar.hashCode();
            }
            int hashCode6 = (this.f.hashCode() + ((i3 + hashCode3) * 31)) * 31;
            String str2 = this.g;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode7 = (this.h.hashCode() + ((hashCode6 + hashCode4) * 31)) * 31;
            Object obj = this.i;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode7 + i;
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(j, this.b);
            String str = this.c;
            if (str != null) {
                bundle.putString(k, str);
            }
            e eVar = this.d;
            if (eVar != null) {
                bundle.putBundle(l, eVar.toBundle());
            }
            a aVar = this.e;
            if (aVar != null) {
                bundle.putBundle(m, aVar.toBundle());
            }
            List<p0> list = this.f;
            if (!list.isEmpty()) {
                bundle.putParcelableArrayList(n, com.amazon.aps.iva.t5.c.b(list));
            }
            String str2 = this.g;
            if (str2 != null) {
                bundle.putString(o, str2);
            }
            ImmutableList<j> immutableList = this.h;
            if (!immutableList.isEmpty()) {
                bundle.putParcelableArrayList(p, com.amazon.aps.iva.t5.c.b(immutableList));
            }
            return bundle;
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class h implements k {
        public static final h e = new h(new a());
        public static final String f = com.amazon.aps.iva.t5.g0.L(0);
        public static final String g = com.amazon.aps.iva.t5.g0.L(1);
        public static final String h = com.amazon.aps.iva.t5.g0.L(2);
        public static final com.amazon.aps.iva.q5.e i = new com.amazon.aps.iva.q5.e(2);
        public final Uri b;
        public final String c;
        public final Bundle d;

        /* compiled from: MediaItem.java */
        /* loaded from: classes.dex */
        public static final class a {
            public Uri a;
            public String b;
            public Bundle c;
        }

        public h(a aVar) {
            this.b = aVar.a;
            this.c = aVar.b;
            this.d = aVar.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (com.amazon.aps.iva.t5.g0.a(this.b, hVar.b) && com.amazon.aps.iva.t5.g0.a(this.c, hVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i2 = 0;
            Uri uri = this.b;
            if (uri == null) {
                hashCode = 0;
            } else {
                hashCode = uri.hashCode();
            }
            int i3 = hashCode * 31;
            String str = this.c;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i3 + i2;
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.b;
            if (uri != null) {
                bundle.putParcelable(f, uri);
            }
            String str = this.c;
            if (str != null) {
                bundle.putString(g, str);
            }
            Bundle bundle2 = this.d;
            if (bundle2 != null) {
                bundle.putBundle(h, bundle2);
            }
            return bundle;
        }
    }

    /* compiled from: MediaItem.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static final class i extends j {
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static class j implements k {
        public static final String i = com.amazon.aps.iva.t5.g0.L(0);
        public static final String j = com.amazon.aps.iva.t5.g0.L(1);
        public static final String k = com.amazon.aps.iva.t5.g0.L(2);
        public static final String l = com.amazon.aps.iva.t5.g0.L(3);
        public static final String m = com.amazon.aps.iva.t5.g0.L(4);
        public static final String n = com.amazon.aps.iva.t5.g0.L(5);
        public static final String o = com.amazon.aps.iva.t5.g0.L(6);
        public static final com.amazon.aps.iva.g1.n p = new com.amazon.aps.iva.g1.n(1);
        public final Uri b;
        public final String c;
        public final String d;
        public final int e;
        public final int f;
        public final String g;
        public final String h;

        public j(a aVar) {
            this.b = aVar.a;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.d;
            this.f = aVar.e;
            this.g = aVar.f;
            this.h = aVar.g;
        }

        public final a a() {
            return new a(this);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (this.b.equals(jVar.b) && com.amazon.aps.iva.t5.g0.a(this.c, jVar.c) && com.amazon.aps.iva.t5.g0.a(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f && com.amazon.aps.iva.t5.g0.a(this.g, jVar.g) && com.amazon.aps.iva.t5.g0.a(this.h, jVar.h)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.b.hashCode() * 31;
            int i2 = 0;
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (hashCode4 + hashCode) * 31;
            String str2 = this.d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i4 = (((((i3 + hashCode2) * 31) + this.e) * 31) + this.f) * 31;
            String str3 = this.g;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i5 = (i4 + hashCode3) * 31;
            String str4 = this.h;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return i5 + i2;
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(i, this.b);
            String str = this.c;
            if (str != null) {
                bundle.putString(j, str);
            }
            String str2 = this.d;
            if (str2 != null) {
                bundle.putString(k, str2);
            }
            int i2 = this.e;
            if (i2 != 0) {
                bundle.putInt(l, i2);
            }
            int i3 = this.f;
            if (i3 != 0) {
                bundle.putInt(m, i3);
            }
            String str3 = this.g;
            if (str3 != null) {
                bundle.putString(n, str3);
            }
            String str4 = this.h;
            if (str4 != null) {
                bundle.putString(o, str4);
            }
            return bundle;
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes.dex */
        public static final class a {
            public final Uri a;
            public String b;
            public String c;
            public int d;
            public int e;
            public String f;
            public String g;

            public a(Uri uri) {
                this.a = uri;
            }

            public static i a(a aVar) {
                return new i(aVar);
            }

            public a(j jVar) {
                this.a = jVar.b;
                this.b = jVar.c;
                this.c = jVar.d;
                this.d = jVar.e;
                this.e = jVar.f;
                this.f = jVar.g;
                this.g = jVar.h;
            }
        }
    }

    public b0(String str, d dVar, g gVar, f fVar, d0 d0Var, h hVar) {
        this.b = str;
        this.c = gVar;
        this.d = fVar;
        this.e = d0Var;
        this.f = dVar;
        this.g = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (com.amazon.aps.iva.t5.g0.a(this.b, b0Var.b) && this.f.equals(b0Var.f) && com.amazon.aps.iva.t5.g0.a(this.c, b0Var.c) && com.amazon.aps.iva.t5.g0.a(this.d, b0Var.d) && com.amazon.aps.iva.t5.g0.a(this.e, b0Var.e) && com.amazon.aps.iva.t5.g0.a(this.g, b0Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.b.hashCode() * 31;
        g gVar = this.c;
        if (gVar != null) {
            i2 = gVar.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.f.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.g.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i2) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.amazon.aps.iva.q5.k
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.b;
        if (!str.equals("")) {
            bundle.putString(i, str);
        }
        f fVar = f.g;
        f fVar2 = this.d;
        if (!fVar2.equals(fVar)) {
            bundle.putBundle(j, fVar2.toBundle());
        }
        d0 d0Var = d0.J;
        d0 d0Var2 = this.e;
        if (!d0Var2.equals(d0Var)) {
            bundle.putBundle(k, d0Var2.toBundle());
        }
        d dVar = c.g;
        d dVar2 = this.f;
        if (!dVar2.equals(dVar)) {
            bundle.putBundle(l, dVar2.toBundle());
        }
        h hVar = h.e;
        h hVar2 = this.g;
        if (!hVar2.equals(hVar)) {
            bundle.putBundle(m, hVar2.toBundle());
        }
        return bundle;
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class e implements k {
        public static final String j = com.amazon.aps.iva.t5.g0.L(0);
        public static final String k = com.amazon.aps.iva.t5.g0.L(1);
        public static final String l = com.amazon.aps.iva.t5.g0.L(2);
        public static final String m = com.amazon.aps.iva.t5.g0.L(3);
        public static final String n = com.amazon.aps.iva.t5.g0.L(4);
        public static final String o = com.amazon.aps.iva.t5.g0.L(5);
        public static final String p = com.amazon.aps.iva.t5.g0.L(6);
        public static final String q = com.amazon.aps.iva.t5.g0.L(7);
        public static final p r = new p(1);
        public final UUID b;
        public final Uri c;
        public final ImmutableMap<String, String> d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final ImmutableList<Integer> h;
        public final byte[] i;

        public e(a aVar) {
            boolean z;
            byte[] bArr;
            if (aVar.f && aVar.b == null) {
                z = false;
            } else {
                z = true;
            }
            com.amazon.aps.iva.cq.b.C(z);
            UUID uuid = aVar.a;
            uuid.getClass();
            this.b = uuid;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.d;
            this.g = aVar.f;
            this.f = aVar.e;
            this.h = aVar.g;
            byte[] bArr2 = aVar.h;
            if (bArr2 != null) {
                bArr = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                bArr = null;
            }
            this.i = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.b.equals(eVar.b) && com.amazon.aps.iva.t5.g0.a(this.c, eVar.c) && com.amazon.aps.iva.t5.g0.a(this.d, eVar.d) && this.e == eVar.e && this.g == eVar.g && this.f == eVar.f && this.h.equals(eVar.h) && Arrays.equals(this.i, eVar.i)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int hashCode = this.b.hashCode() * 31;
            Uri uri = this.c;
            if (uri != null) {
                i = uri.hashCode();
            } else {
                i = 0;
            }
            int hashCode2 = this.d.hashCode();
            int hashCode3 = this.h.hashCode();
            return Arrays.hashCode(this.i) + ((hashCode3 + ((((((((hashCode2 + ((hashCode + i) * 31)) * 31) + (this.e ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31)) * 31);
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(j, this.b.toString());
            Uri uri = this.c;
            if (uri != null) {
                bundle.putParcelable(k, uri);
            }
            ImmutableMap<String, String> immutableMap = this.d;
            if (!immutableMap.isEmpty()) {
                Bundle bundle2 = new Bundle();
                for (Map.Entry<String, String> entry : immutableMap.entrySet()) {
                    bundle2.putString(entry.getKey(), entry.getValue());
                }
                bundle.putBundle(l, bundle2);
            }
            boolean z = this.e;
            if (z) {
                bundle.putBoolean(m, z);
            }
            boolean z2 = this.f;
            if (z2) {
                bundle.putBoolean(n, z2);
            }
            boolean z3 = this.g;
            if (z3) {
                bundle.putBoolean(o, z3);
            }
            ImmutableList<Integer> immutableList = this.h;
            if (!immutableList.isEmpty()) {
                bundle.putIntegerArrayList(p, new ArrayList<>(immutableList));
            }
            byte[] bArr = this.i;
            if (bArr != null) {
                bundle.putByteArray(q, bArr);
            }
            return bundle;
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes.dex */
        public static final class a {
            public final UUID a;
            public Uri b;
            public ImmutableMap<String, String> c;
            public boolean d;
            public boolean e;
            public boolean f;
            public ImmutableList<Integer> g;
            public byte[] h;

            public a(UUID uuid) {
                this.a = uuid;
                this.c = ImmutableMap.of();
                this.g = ImmutableList.of();
            }

            public a() {
                this.c = ImmutableMap.of();
                this.g = ImmutableList.of();
            }

            public a(e eVar) {
                this.a = eVar.b;
                this.b = eVar.c;
                this.c = eVar.d;
                this.d = eVar.e;
                this.e = eVar.f;
                this.f = eVar.g;
                this.g = eVar.h;
                this.h = eVar.i;
            }
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class f implements k {
        public static final f g = new f(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        public static final String h = com.amazon.aps.iva.t5.g0.L(0);
        public static final String i = com.amazon.aps.iva.t5.g0.L(1);
        public static final String j = com.amazon.aps.iva.t5.g0.L(2);
        public static final String k = com.amazon.aps.iva.t5.g0.L(3);
        public static final String l = com.amazon.aps.iva.t5.g0.L(4);
        public static final com.amazon.aps.iva.g1.e m = new com.amazon.aps.iva.g1.e(2);
        public final long b;
        public final long c;
        public final long d;
        public final float e;
        public final float f;

        @Deprecated
        public f(long j2, long j3, long j4, float f, float f2) {
            this.b = j2;
            this.c = j3;
            this.d = j4;
            this.e = f;
            this.f = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.b == fVar.b && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i2;
            long j2 = this.b;
            long j3 = this.c;
            long j4 = this.d;
            int i3 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31;
            float f = this.e;
            int i4 = 0;
            if (f != 0.0f) {
                i2 = Float.floatToIntBits(f);
            } else {
                i2 = 0;
            }
            int i5 = (i3 + i2) * 31;
            float f2 = this.f;
            if (f2 != 0.0f) {
                i4 = Float.floatToIntBits(f2);
            }
            return i5 + i4;
        }

        @Override // com.amazon.aps.iva.q5.k
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j2 = this.b;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(h, j2);
            }
            long j3 = this.c;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(i, j3);
            }
            long j4 = this.d;
            if (j4 != -9223372036854775807L) {
                bundle.putLong(j, j4);
            }
            float f = this.e;
            if (f != -3.4028235E38f) {
                bundle.putFloat(k, f);
            }
            float f2 = this.f;
            if (f2 != -3.4028235E38f) {
                bundle.putFloat(l, f2);
            }
            return bundle;
        }

        /* compiled from: MediaItem.java */
        /* loaded from: classes.dex */
        public static final class a {
            public long a;
            public long b;
            public long c;
            public float d;
            public float e;

            public a() {
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                this.c = -9223372036854775807L;
                this.d = -3.4028235E38f;
                this.e = -3.4028235E38f;
            }

            public a(f fVar) {
                this.a = fVar.b;
                this.b = fVar.c;
                this.c = fVar.d;
                this.d = fVar.e;
                this.e = fVar.f;
            }
        }
    }

    /* compiled from: MediaItem.java */
    /* loaded from: classes.dex */
    public static final class b {
        public String a;
        public Uri b;
        public String c;
        public final c.a d;
        public e.a e;
        public List<p0> f;
        public String g;
        public ImmutableList<j> h;
        public a i;
        public Object j;
        public d0 k;
        public f.a l;
        public h m;

        public b() {
            this.d = new c.a();
            this.e = new e.a();
            this.f = Collections.emptyList();
            this.h = ImmutableList.of();
            this.l = new f.a();
            this.m = h.e;
        }

        public final b0 a() {
            boolean z;
            g gVar;
            e.a aVar = this.e;
            if (aVar.b != null && aVar.a == null) {
                z = false;
            } else {
                z = true;
            }
            com.amazon.aps.iva.cq.b.C(z);
            Uri uri = this.b;
            e eVar = null;
            if (uri != null) {
                String str = this.c;
                e.a aVar2 = this.e;
                if (aVar2.a != null) {
                    eVar = new e(aVar2);
                }
                gVar = new g(uri, str, eVar, this.i, this.f, this.g, this.h, this.j);
            } else {
                gVar = null;
            }
            String str2 = this.a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            c.a aVar3 = this.d;
            aVar3.getClass();
            d dVar = new d(aVar3);
            f.a aVar4 = this.l;
            aVar4.getClass();
            f fVar = new f(aVar4.a, aVar4.b, aVar4.c, aVar4.d, aVar4.e);
            d0 d0Var = this.k;
            if (d0Var == null) {
                d0Var = d0.J;
            }
            return new b0(str3, dVar, gVar, fVar, d0Var, this.m);
        }

        public b(b0 b0Var) {
            this();
            e.a aVar;
            d dVar = b0Var.f;
            dVar.getClass();
            this.d = new c.a(dVar);
            this.a = b0Var.b;
            this.k = b0Var.e;
            f fVar = b0Var.d;
            fVar.getClass();
            this.l = new f.a(fVar);
            this.m = b0Var.g;
            g gVar = b0Var.c;
            if (gVar != null) {
                this.g = gVar.g;
                this.c = gVar.c;
                this.b = gVar.b;
                this.f = gVar.f;
                this.h = gVar.h;
                this.j = gVar.i;
                e eVar = gVar.d;
                if (eVar != null) {
                    aVar = new e.a(eVar);
                } else {
                    aVar = new e.a();
                }
                this.e = aVar;
                this.i = gVar.e;
            }
        }
    }
}
