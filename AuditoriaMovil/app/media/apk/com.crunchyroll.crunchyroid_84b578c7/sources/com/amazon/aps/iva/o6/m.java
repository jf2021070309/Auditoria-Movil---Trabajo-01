package com.amazon.aps.iva.o6;

import android.net.Uri;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.p6.a;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.t6.e;
import com.amazon.aps.iva.w5.f;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: DefaultMediaSourceFactory.java */
/* loaded from: classes.dex */
public final class m implements v.a {
    public final a a;
    public f.a b;
    public a.b c;
    public com.amazon.aps.iva.q5.d d;
    public com.amazon.aps.iva.t6.j e;
    public final long f;
    public final long g;
    public final long h;
    public final float i;
    public final float j;

    /* compiled from: DefaultMediaSourceFactory.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final com.amazon.aps.iva.x6.s a;
        public final HashMap b = new HashMap();
        public final HashSet c = new HashSet();
        public final HashMap d = new HashMap();
        public f.a e;
        public com.amazon.aps.iva.g6.g f;
        public com.amazon.aps.iva.t6.j g;

        public a(com.amazon.aps.iva.x6.s sVar) {
            this.a = sVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.google.common.base.Supplier<com.amazon.aps.iva.o6.v.a> a(int r6) {
            /*
                r5 = this;
                java.util.HashMap r0 = r5.b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                boolean r1 = r0.containsKey(r1)
                if (r1 == 0) goto L17
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r6 = r0.get(r6)
                com.google.common.base.Supplier r6 = (com.google.common.base.Supplier) r6
                return r6
            L17:
                com.amazon.aps.iva.w5.f$a r1 = r5.e
                r1.getClass()
                java.lang.Class<com.amazon.aps.iva.o6.v$a> r2 = com.amazon.aps.iva.o6.v.a.class
                if (r6 == 0) goto L5f
                r3 = 1
                if (r6 == r3) goto L4f
                r4 = 2
                if (r6 == r4) goto L43
                r4 = 3
                if (r6 == r4) goto L33
                r2 = 4
                if (r6 == r2) goto L2d
                goto L6c
            L2d:
                com.amazon.aps.iva.o6.l r2 = new com.amazon.aps.iva.o6.l     // Catch: java.lang.ClassNotFoundException -> L6c
                r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L6c
                goto L6d
            L33:
                java.lang.String r1 = "androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L6c
                java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L6c
                com.amazon.aps.iva.a6.s r2 = new com.amazon.aps.iva.a6.s     // Catch: java.lang.ClassNotFoundException -> L6c
                r2.<init>(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L6c
                goto L6d
            L43:
                java.lang.Class<androidx.media3.exoplayer.hls.HlsMediaSource$Factory> r3 = androidx.media3.exoplayer.hls.HlsMediaSource.Factory.class
                java.lang.Class r2 = r3.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L6c
                com.amazon.aps.iva.o6.k r3 = new com.amazon.aps.iva.o6.k     // Catch: java.lang.ClassNotFoundException -> L6c
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6c
                goto L6a
            L4f:
                java.lang.String r3 = "androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L6c
                java.lang.Class r2 = r3.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L6c
                com.amazon.aps.iva.o6.j r3 = new com.amazon.aps.iva.o6.j     // Catch: java.lang.ClassNotFoundException -> L6c
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6c
                goto L6a
            L5f:
                java.lang.Class<androidx.media3.exoplayer.dash.DashMediaSource$Factory> r3 = androidx.media3.exoplayer.dash.DashMediaSource.Factory.class
                java.lang.Class r2 = r3.asSubclass(r2)     // Catch: java.lang.ClassNotFoundException -> L6c
                com.amazon.aps.iva.o6.i r3 = new com.amazon.aps.iva.o6.i     // Catch: java.lang.ClassNotFoundException -> L6c
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6c
            L6a:
                r2 = r3
                goto L6d
            L6c:
                r2 = 0
            L6d:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                r0.put(r1, r2)
                if (r2 == 0) goto L7f
                java.util.HashSet r0 = r5.c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0.add(r6)
            L7f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.o6.m.a.a(int):com.google.common.base.Supplier");
        }
    }

    public m(f.a aVar, com.amazon.aps.iva.x6.s sVar) {
        this.b = aVar;
        a aVar2 = new a(sVar);
        this.a = aVar2;
        if (aVar != aVar2.e) {
            aVar2.e = aVar;
            aVar2.b.clear();
            aVar2.d.clear();
        }
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -3.4028235E38f;
        this.j = -3.4028235E38f;
    }

    public static v.a f(Class cls, f.a aVar) {
        try {
            return (v.a) cls.getConstructor(f.a.class).newInstance(aVar);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.amazon.aps.iva.o6.v.a
    @CanIgnoreReturnValue
    public final /* bridge */ /* synthetic */ v.a a(com.amazon.aps.iva.g6.g gVar) {
        g(gVar);
        return this;
    }

    @Override // com.amazon.aps.iva.o6.v.a
    @CanIgnoreReturnValue
    public final void b(e.a aVar) {
        aVar.getClass();
        a aVar2 = this.a;
        aVar2.getClass();
        for (v.a aVar3 : aVar2.d.values()) {
            aVar3.b(aVar);
        }
    }

    @Override // com.amazon.aps.iva.o6.v.a
    public final int[] c() {
        a aVar = this.a;
        aVar.a(0);
        aVar.a(1);
        aVar.a(2);
        aVar.a(3);
        aVar.a(4);
        return Ints.toArray(aVar.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.amazon.aps.iva.t6.j] */
    @Override // com.amazon.aps.iva.o6.v.a
    public final v d(com.amazon.aps.iva.q5.b0 b0Var) {
        long j;
        float f;
        float f2;
        long j2;
        long j3;
        e eVar;
        com.amazon.aps.iva.q5.b0 b0Var2 = b0Var;
        b0Var2.c.getClass();
        b0.g gVar = b0Var2.c;
        String scheme = gVar.b.getScheme();
        v.a aVar = null;
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int J = com.amazon.aps.iva.t5.g0.J(gVar.b, gVar.c);
        a aVar2 = this.a;
        HashMap hashMap = aVar2.d;
        v.a aVar3 = (v.a) hashMap.get(Integer.valueOf(J));
        if (aVar3 != null) {
            aVar = aVar3;
        } else {
            Supplier<v.a> a2 = aVar2.a(J);
            if (a2 != null) {
                aVar = a2.get();
                aVar2.getClass();
                com.amazon.aps.iva.g6.g gVar2 = aVar2.f;
                if (gVar2 != null) {
                    aVar.a(gVar2);
                }
                com.amazon.aps.iva.t6.j jVar = aVar2.g;
                if (jVar != null) {
                    aVar.e(jVar);
                }
                hashMap.put(Integer.valueOf(J), aVar);
            }
        }
        com.amazon.aps.iva.cq.b.E(aVar, "No suitable media source factory found for content type: " + J);
        b0.f fVar = b0Var2.d;
        fVar.getClass();
        if (fVar.b == -9223372036854775807L) {
            j = this.f;
        } else {
            j = fVar.b;
        }
        long j4 = j;
        if (fVar.e == -3.4028235E38f) {
            f = this.i;
        } else {
            f = fVar.e;
        }
        float f3 = f;
        if (fVar.f == -3.4028235E38f) {
            f2 = this.j;
        } else {
            f2 = fVar.f;
        }
        float f4 = f2;
        if (fVar.c == -9223372036854775807L) {
            j2 = this.g;
        } else {
            j2 = fVar.c;
        }
        long j5 = j2;
        if (fVar.d == -9223372036854775807L) {
            j3 = this.h;
        } else {
            j3 = fVar.d;
        }
        b0.f fVar2 = new b0.f(j4, j5, j3, f3, f4);
        if (!fVar2.equals(fVar)) {
            b0.b bVar = new b0.b(b0Var2);
            bVar.l = new b0.f.a(fVar2);
            b0Var2 = bVar.a();
        }
        v d = aVar.d(b0Var2);
        ImmutableList<b0.j> immutableList = b0Var2.c.h;
        if (!immutableList.isEmpty()) {
            v[] vVarArr = new v[immutableList.size() + 1];
            int i = 0;
            vVarArr[0] = d;
            while (i < immutableList.size()) {
                f.a aVar4 = this.b;
                aVar4.getClass();
                com.amazon.aps.iva.t6.i iVar = new com.amazon.aps.iva.t6.i();
                ?? r6 = this.e;
                if (r6 != 0) {
                    iVar = r6;
                }
                int i2 = i + 1;
                vVarArr[i2] = new m0(immutableList.get(i), aVar4, iVar);
                i = i2;
            }
            d = new b0(vVarArr);
        }
        v vVar = d;
        b0.d dVar = b0Var2.f;
        long j6 = dVar.b;
        int i3 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
        long j7 = dVar.c;
        if (i3 == 0 && j7 == Long.MIN_VALUE && !dVar.e) {
            eVar = vVar;
        } else {
            eVar = new e(vVar, com.amazon.aps.iva.t5.g0.Q(j6), com.amazon.aps.iva.t5.g0.Q(j7), !dVar.f, dVar.d, dVar.e);
        }
        b0.g gVar3 = b0Var2.c;
        gVar3.getClass();
        b0.a aVar5 = gVar3.e;
        if (aVar5 != null) {
            a.b bVar2 = this.c;
            com.amazon.aps.iva.q5.d dVar2 = this.d;
            if (bVar2 != null && dVar2 != null) {
                com.amazon.aps.iva.sj.b a3 = bVar2.a(aVar5);
                if (a3 == null) {
                    com.amazon.aps.iva.t5.p.g();
                    return eVar;
                }
                Uri uri = aVar5.b;
                com.amazon.aps.iva.w5.i iVar2 = new com.amazon.aps.iva.w5.i(uri);
                Object obj = aVar5.c;
                if (obj == null) {
                    obj = ImmutableList.of((Uri) b0Var2.b, gVar3.b, uri);
                }
                return new com.amazon.aps.iva.p6.b(eVar, iVar2, obj, this, a3, dVar2);
            }
            com.amazon.aps.iva.t5.p.g();
            return eVar;
        }
        return eVar;
    }

    @Override // com.amazon.aps.iva.o6.v.a
    @CanIgnoreReturnValue
    public final /* bridge */ /* synthetic */ v.a e(com.amazon.aps.iva.t6.j jVar) {
        h(jVar);
        return this;
    }

    @CanIgnoreReturnValue
    public final void g(com.amazon.aps.iva.g6.g gVar) {
        if (gVar != null) {
            a aVar = this.a;
            aVar.f = gVar;
            for (v.a aVar2 : aVar.d.values()) {
                aVar2.a(gVar);
            }
            return;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @CanIgnoreReturnValue
    public final void h(com.amazon.aps.iva.t6.j jVar) {
        if (jVar != null) {
            this.e = jVar;
            a aVar = this.a;
            aVar.g = jVar;
            for (v.a aVar2 : aVar.d.values()) {
                aVar2.e(jVar);
            }
            return;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }
}
