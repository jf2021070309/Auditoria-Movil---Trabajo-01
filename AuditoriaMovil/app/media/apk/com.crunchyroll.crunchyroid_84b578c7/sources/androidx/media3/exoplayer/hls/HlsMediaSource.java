package androidx.media3.exoplayer.hls;

import android.os.Looper;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.c;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.g6.f;
import com.amazon.aps.iva.g6.g;
import com.amazon.aps.iva.h6.d;
import com.amazon.aps.iva.h6.h;
import com.amazon.aps.iva.h6.o;
import com.amazon.aps.iva.j6.b;
import com.amazon.aps.iva.j6.d;
import com.amazon.aps.iva.j6.i;
import com.amazon.aps.iva.o6.a;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.c0;
import com.amazon.aps.iva.q5.m;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.t6.e;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.w5.y;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.List;
/* loaded from: classes.dex */
public final class HlsMediaSource extends a implements i.d {
    public final com.amazon.aps.iva.h6.i h;
    public final b0.g i;
    public final h j;
    public final com.amazon.aps.iva.o6.h k;
    public final f l;
    public final j m;
    public final boolean n;
    public final int o;
    public final boolean p;
    public final i q;
    public final long r;
    public final b0 s;
    public final long t;
    public b0.f u;
    public y v;

    /* loaded from: classes.dex */
    public static final class Factory implements v.a {
        public final h a;
        public g f = new c();
        public final com.amazon.aps.iva.j6.a c = new com.amazon.aps.iva.j6.a();
        public final m d = b.p;
        public final d b = com.amazon.aps.iva.h6.i.a;
        public j g = new com.amazon.aps.iva.t6.i();
        public final com.amazon.aps.iva.o6.h e = new com.amazon.aps.iva.o6.h(0);
        public final int i = 1;
        public final long j = -9223372036854775807L;
        public final boolean h = true;

        public Factory(f.a aVar) {
            this.a = new com.amazon.aps.iva.h6.c(aVar);
        }

        @Override // com.amazon.aps.iva.o6.v.a
        @CanIgnoreReturnValue
        public final v.a a(g gVar) {
            if (gVar != null) {
                this.f = gVar;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        @Override // com.amazon.aps.iva.o6.v.a
        @CanIgnoreReturnValue
        public final void b(e.a aVar) {
            aVar.getClass();
        }

        @Override // com.amazon.aps.iva.o6.v.a
        public final int[] c() {
            return new int[]{2};
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.amazon.aps.iva.j6.c] */
        @Override // com.amazon.aps.iva.o6.v.a
        public final v d(b0 b0Var) {
            b0Var.c.getClass();
            List<p0> list = b0Var.c.f;
            boolean isEmpty = list.isEmpty();
            com.amazon.aps.iva.j6.a aVar = this.c;
            if (!isEmpty) {
                aVar = new com.amazon.aps.iva.j6.c(aVar, list);
            }
            h hVar = this.a;
            d dVar = this.b;
            com.amazon.aps.iva.o6.h hVar2 = this.e;
            com.amazon.aps.iva.g6.f a = this.f.a(b0Var);
            j jVar = this.g;
            this.d.getClass();
            return new HlsMediaSource(b0Var, hVar, dVar, hVar2, a, jVar, new b(this.a, jVar, aVar), this.j, this.h, this.i);
        }

        @Override // com.amazon.aps.iva.o6.v.a
        @CanIgnoreReturnValue
        public final v.a e(j jVar) {
            if (jVar != null) {
                this.g = jVar;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
    }

    static {
        c0.a("media3.exoplayer.hls");
    }

    public HlsMediaSource(b0 b0Var, h hVar, d dVar, com.amazon.aps.iva.o6.h hVar2, com.amazon.aps.iva.g6.f fVar, j jVar, b bVar, long j, boolean z, int i) {
        b0.g gVar = b0Var.c;
        gVar.getClass();
        this.i = gVar;
        this.s = b0Var;
        this.u = b0Var.d;
        this.j = hVar;
        this.h = dVar;
        this.k = hVar2;
        this.l = fVar;
        this.m = jVar;
        this.q = bVar;
        this.r = j;
        this.n = z;
        this.o = i;
        this.p = false;
        this.t = 0L;
    }

    public static d.a u(ImmutableList immutableList, long j) {
        d.a aVar = null;
        for (int i = 0; i < immutableList.size(); i++) {
            d.a aVar2 = (d.a) immutableList.get(i);
            int i2 = (aVar2.f > j ? 1 : (aVar2.f == j ? 0 : -1));
            if (i2 <= 0 && aVar2.m) {
                aVar = aVar2;
            } else if (i2 > 0) {
                break;
            }
        }
        return aVar;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final b0 b() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void c(u uVar) {
        o[] oVarArr;
        o.c[] cVarArr;
        com.amazon.aps.iva.h6.m mVar = (com.amazon.aps.iva.h6.m) uVar;
        mVar.c.j(mVar);
        for (o oVar : mVar.w) {
            if (oVar.E) {
                for (o.c cVar : oVar.w) {
                    cVar.i();
                    com.amazon.aps.iva.g6.d dVar = cVar.h;
                    if (dVar != null) {
                        dVar.e(cVar.e);
                        cVar.h = null;
                        cVar.g = null;
                    }
                }
            }
            oVar.k.e(oVar);
            oVar.s.removeCallbacksAndMessages(null);
            oVar.I = true;
            oVar.t.clear();
        }
        mVar.t = null;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final u h(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        z.a o = o(bVar);
        e.a aVar = new e.a(this.d.c, 0, bVar);
        com.amazon.aps.iva.h6.i iVar = this.h;
        i iVar2 = this.q;
        h hVar = this.j;
        y yVar = this.v;
        com.amazon.aps.iva.g6.f fVar = this.l;
        j jVar = this.m;
        com.amazon.aps.iva.o6.h hVar2 = this.k;
        boolean z = this.n;
        int i = this.o;
        boolean z2 = this.p;
        p1 p1Var = this.g;
        com.amazon.aps.iva.cq.b.D(p1Var);
        return new com.amazon.aps.iva.h6.m(iVar, iVar2, hVar, yVar, fVar, aVar, jVar, o, bVar2, hVar2, z, i, z2, p1Var, this.t);
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void j() throws IOException {
        this.q.l();
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void r(y yVar) {
        this.v = yVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        p1 p1Var = this.g;
        com.amazon.aps.iva.cq.b.D(p1Var);
        com.amazon.aps.iva.g6.f fVar = this.l;
        fVar.a(myLooper, p1Var);
        fVar.g();
        z.a o = o(null);
        this.q.a(this.i.b, o, this);
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void t() {
        this.q.stop();
        this.l.release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
        if (r51.n != (-9223372036854775807L)) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.amazon.aps.iva.j6.d r51) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.v(com.amazon.aps.iva.j6.d):void");
    }
}
