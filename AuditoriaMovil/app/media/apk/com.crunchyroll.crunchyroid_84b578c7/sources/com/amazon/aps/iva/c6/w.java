package com.amazon.aps.iva.c6;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Handler;
import com.amazon.aps.iva.a6.g1;
import com.amazon.aps.iva.a6.i1;
import com.amazon.aps.iva.a6.o1;
import com.amazon.aps.iva.a6.q1;
import com.amazon.aps.iva.a6.u0;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.c6.j;
import com.amazon.aps.iva.c6.k;
import com.amazon.aps.iva.k6.s;
import com.amazon.aps.iva.q5.k0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: MediaCodecAudioRenderer.java */
/* loaded from: classes.dex */
public final class w extends com.amazon.aps.iva.k6.o implements u0 {
    public final Context a1;
    public final j.a b1;
    public final k c1;
    public int d1;
    public boolean e1;
    public com.amazon.aps.iva.q5.v f1;
    public com.amazon.aps.iva.q5.v g1;
    public long h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public o1.a l1;

    /* compiled from: MediaCodecAudioRenderer.java */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(k kVar, Object obj) {
            kVar.l((AudioDeviceInfo) obj);
        }
    }

    /* compiled from: MediaCodecAudioRenderer.java */
    /* loaded from: classes.dex */
    public final class b implements k.c {
        public b() {
        }

        public final void a(Exception exc) {
            com.amazon.aps.iva.t5.p.d("Audio sink error", exc);
            j.a aVar = w.this.b1;
            Handler handler = aVar.a;
            if (handler != null) {
                handler.post(new f(0, aVar, exc));
            }
        }
    }

    public w(Context context, com.amazon.aps.iva.k6.j jVar, com.amazon.aps.iva.k6.q qVar, Handler handler, j jVar2, s sVar) {
        super(1, jVar, qVar, 44100.0f);
        this.a1 = context.getApplicationContext();
        this.c1 = sVar;
        this.b1 = new j.a(handler, jVar2);
        sVar.r = new b();
    }

    public static ImmutableList D0(com.amazon.aps.iva.k6.q qVar, com.amazon.aps.iva.q5.v vVar, boolean z, k kVar) throws s.b {
        List<com.amazon.aps.iva.k6.n> a2;
        com.amazon.aps.iva.k6.n nVar;
        if (vVar.m == null) {
            return ImmutableList.of();
        }
        if (kVar.c(vVar)) {
            List<com.amazon.aps.iva.k6.n> e = com.amazon.aps.iva.k6.s.e("audio/raw", false, false);
            if (e.isEmpty()) {
                nVar = null;
            } else {
                nVar = e.get(0);
            }
            if (nVar != null) {
                return ImmutableList.of(nVar);
            }
        }
        Pattern pattern = com.amazon.aps.iva.k6.s.a;
        List<com.amazon.aps.iva.k6.n> a3 = qVar.a(vVar.m, z, false);
        String b2 = com.amazon.aps.iva.k6.s.b(vVar);
        if (b2 == null) {
            a2 = ImmutableList.of();
        } else {
            a2 = qVar.a(b2, z, false);
        }
        return ImmutableList.builder().addAll((Iterable) a3).addAll((Iterable) a2).build();
    }

    @Override // com.amazon.aps.iva.k6.o, com.amazon.aps.iva.a6.e
    public final void C() {
        j.a aVar = this.b1;
        this.k1 = true;
        this.f1 = null;
        try {
            this.c1.flush();
            try {
                super.C();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.C();
                throw th;
            } finally {
            }
        }
    }

    public final int C0(com.amazon.aps.iva.q5.v vVar, com.amazon.aps.iva.k6.n nVar) {
        int i;
        if ("OMX.google.raw.decoder".equals(nVar.a) && (i = g0.a) < 24 && (i != 23 || !g0.O(this.a1))) {
            return -1;
        }
        return vVar.n;
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void D(boolean z, boolean z2) throws com.amazon.aps.iva.a6.l {
        com.amazon.aps.iva.a6.f fVar = new com.amazon.aps.iva.a6.f();
        this.V0 = fVar;
        j.a aVar = this.b1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new i1(1, aVar, fVar));
        }
        q1 q1Var = this.e;
        q1Var.getClass();
        boolean z3 = q1Var.a;
        k kVar = this.c1;
        if (z3) {
            kVar.w();
        } else {
            kVar.o();
        }
        p1 p1Var = this.g;
        p1Var.getClass();
        kVar.t(p1Var);
    }

    @Override // com.amazon.aps.iva.k6.o, com.amazon.aps.iva.a6.e
    public final void E(long j, boolean z) throws com.amazon.aps.iva.a6.l {
        super.E(j, z);
        this.c1.flush();
        this.h1 = j;
        this.i1 = true;
        this.j1 = true;
    }

    public final void E0() {
        long u = this.c1.u(d());
        if (u != Long.MIN_VALUE) {
            if (!this.j1) {
                u = Math.max(this.h1, u);
            }
            this.h1 = u;
            this.j1 = false;
        }
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void F() {
        this.c1.release();
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void G() {
        k kVar = this.c1;
        try {
            O();
            q0();
            com.amazon.aps.iva.g6.d.g(this.E, null);
            this.E = null;
        } finally {
            if (this.k1) {
                this.k1 = false;
                kVar.reset();
            }
        }
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void H() {
        this.c1.b();
    }

    @Override // com.amazon.aps.iva.a6.e
    public final void I() {
        E0();
        this.c1.pause();
    }

    @Override // com.amazon.aps.iva.k6.o
    public final com.amazon.aps.iva.a6.g M(com.amazon.aps.iva.k6.n nVar, com.amazon.aps.iva.q5.v vVar, com.amazon.aps.iva.q5.v vVar2) {
        boolean z;
        com.amazon.aps.iva.a6.g b2 = nVar.b(vVar, vVar2);
        int i = 0;
        if (this.E == null && x0(vVar2)) {
            z = true;
        } else {
            z = false;
        }
        int i2 = b2.e;
        if (z) {
            i2 |= 32768;
        }
        if (C0(vVar2, nVar) > this.d1) {
            i2 |= 64;
        }
        int i3 = i2;
        String str = nVar.a;
        if (i3 == 0) {
            i = b2.d;
        }
        return new com.amazon.aps.iva.a6.g(str, vVar, vVar2, i, i3);
    }

    @Override // com.amazon.aps.iva.k6.o
    public final float W(float f, com.amazon.aps.iva.q5.v[] vVarArr) {
        int i = -1;
        for (com.amazon.aps.iva.q5.v vVar : vVarArr) {
            int i2 = vVar.A;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * i;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final ArrayList X(com.amazon.aps.iva.k6.q qVar, com.amazon.aps.iva.q5.v vVar, boolean z) throws s.b {
        ImmutableList D0 = D0(qVar, vVar, z, this.c1);
        Pattern pattern = com.amazon.aps.iva.k6.s.a;
        ArrayList arrayList = new ArrayList(D0);
        Collections.sort(arrayList, new com.amazon.aps.iva.k6.r(new com.amazon.aps.iva.g1.m(vVar)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010d  */
    @Override // com.amazon.aps.iva.k6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.k6.l.a Y(com.amazon.aps.iva.k6.n r12, com.amazon.aps.iva.q5.v r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.w.Y(com.amazon.aps.iva.k6.n, com.amazon.aps.iva.q5.v, android.media.MediaCrypto, float):com.amazon.aps.iva.k6.l$a");
    }

    @Override // com.amazon.aps.iva.a6.e, com.amazon.aps.iva.a6.o1
    public final boolean d() {
        if (this.R0 && this.c1.d()) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void d0(Exception exc) {
        com.amazon.aps.iva.t5.p.d("Audio codec error", exc);
        j.a aVar = this.b1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new g1(1, aVar, exc));
        }
    }

    @Override // com.amazon.aps.iva.a6.u0
    public final k0 e() {
        return this.c1.e();
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void e0(final String str, final long j, final long j2) {
        final j.a aVar = this.b1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.amazon.aps.iva.c6.e
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j3 = j;
                    long j4 = j2;
                    j jVar = j.a.this.b;
                    int i = g0.a;
                    jVar.o(j3, j4, str2);
                }
            });
        }
    }

    @Override // com.amazon.aps.iva.a6.u0
    public final void f(k0 k0Var) {
        this.c1.f(k0Var);
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void f0(String str) {
        j.a aVar = this.b1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new com.amazon.aps.iva.k.t(2, aVar, str));
        }
    }

    @Override // com.amazon.aps.iva.k6.o, com.amazon.aps.iva.a6.o1
    public final boolean g() {
        if (!this.c1.m() && !super.g()) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final com.amazon.aps.iva.a6.g g0(com.amazon.aps.iva.u1.g0 g0Var) throws com.amazon.aps.iva.a6.l {
        com.amazon.aps.iva.q5.v vVar = (com.amazon.aps.iva.q5.v) g0Var.c;
        vVar.getClass();
        this.f1 = vVar;
        final com.amazon.aps.iva.a6.g g0 = super.g0(g0Var);
        final com.amazon.aps.iva.q5.v vVar2 = this.f1;
        final j.a aVar = this.b1;
        Handler handler = aVar.a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.amazon.aps.iva.c6.g
                @Override // java.lang.Runnable
                public final void run() {
                    j.a aVar2 = j.a.this;
                    aVar2.getClass();
                    int i = g0.a;
                    j jVar = aVar2.b;
                    jVar.getClass();
                    jVar.k(vVar2, g0);
                }
            });
        }
        return g0;
    }

    @Override // com.amazon.aps.iva.a6.o1, com.amazon.aps.iva.a6.p1
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void h0(com.amazon.aps.iva.q5.v vVar, MediaFormat mediaFormat) throws com.amazon.aps.iva.a6.l {
        int i;
        int i2;
        com.amazon.aps.iva.q5.v vVar2 = this.g1;
        int[] iArr = null;
        if (vVar2 != null) {
            vVar = vVar2;
        } else if (this.K != null) {
            if ("audio/raw".equals(vVar.m)) {
                i = vVar.B;
            } else if (g0.a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = g0.z(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = 2;
            }
            v.a aVar = new v.a();
            aVar.k = "audio/raw";
            aVar.z = i;
            aVar.A = vVar.C;
            aVar.B = vVar.D;
            aVar.x = mediaFormat.getInteger("channel-count");
            aVar.y = mediaFormat.getInteger("sample-rate");
            com.amazon.aps.iva.q5.v vVar3 = new com.amazon.aps.iva.q5.v(aVar);
            if (this.e1 && vVar3.z == 6 && (i2 = vVar.z) < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            }
            vVar = vVar3;
        }
        try {
            this.c1.r(vVar, iArr);
        } catch (k.a e) {
            throw b(5001, e.b, e, false);
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void i0(long j) {
        this.c1.getClass();
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void k0() {
        this.c1.v();
    }

    @Override // com.amazon.aps.iva.a6.e, com.amazon.aps.iva.a6.l1.b
    public final void l(int i, Object obj) throws com.amazon.aps.iva.a6.l {
        k kVar = this.c1;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    switch (i) {
                        case 9:
                            kVar.y(((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            kVar.n(((Integer) obj).intValue());
                            return;
                        case 11:
                            this.l1 = (o1.a) obj;
                            return;
                        case 12:
                            if (g0.a >= 23) {
                                a.a(kVar, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                kVar.x((com.amazon.aps.iva.q5.h) obj);
                return;
            }
            kVar.p((com.amazon.aps.iva.q5.f) obj);
            return;
        }
        kVar.j(((Float) obj).floatValue());
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void l0(com.amazon.aps.iva.z5.f fVar) {
        if (this.i1 && !fVar.j()) {
            if (Math.abs(fVar.f - this.h1) > 500000) {
                this.h1 = fVar.f;
            }
            this.i1 = false;
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final boolean o0(long j, long j2, com.amazon.aps.iva.k6.l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.amazon.aps.iva.q5.v vVar) throws com.amazon.aps.iva.a6.l {
        byteBuffer.getClass();
        if (this.g1 != null && (i2 & 2) != 0) {
            lVar.getClass();
            lVar.m(i, false);
            return true;
        }
        k kVar = this.c1;
        if (z) {
            if (lVar != null) {
                lVar.m(i, false);
            }
            this.V0.f += i3;
            kVar.v();
            return true;
        }
        try {
            if (!kVar.q(byteBuffer, j3, i3)) {
                return false;
            }
            if (lVar != null) {
                lVar.m(i, false);
            }
            this.V0.e += i3;
            return true;
        } catch (k.b e) {
            throw b(5001, this.f1, e, e.c);
        } catch (k.e e2) {
            throw b(5002, vVar, e2, e2.c);
        }
    }

    @Override // com.amazon.aps.iva.k6.o
    public final void r0() throws com.amazon.aps.iva.a6.l {
        try {
            this.c1.s();
        } catch (k.e e) {
            throw b(5002, e.d, e, e.c);
        }
    }

    @Override // com.amazon.aps.iva.a6.u0
    public final long t() {
        if (this.h == 2) {
            E0();
        }
        return this.h1;
    }

    @Override // com.amazon.aps.iva.k6.o
    public final boolean x0(com.amazon.aps.iva.q5.v vVar) {
        return this.c1.c(vVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (r4 != null) goto L26;
     */
    @Override // com.amazon.aps.iva.k6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y0(com.amazon.aps.iva.k6.q r12, com.amazon.aps.iva.q5.v r13) throws com.amazon.aps.iva.k6.s.b {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.w.y0(com.amazon.aps.iva.k6.q, com.amazon.aps.iva.q5.v):int");
    }

    @Override // com.amazon.aps.iva.a6.e, com.amazon.aps.iva.a6.o1
    public final u0 A() {
        return this;
    }
}
