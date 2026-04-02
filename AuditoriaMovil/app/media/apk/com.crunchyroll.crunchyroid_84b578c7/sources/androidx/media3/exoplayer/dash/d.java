package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.dash.DashMediaSource;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.o;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x6.f0;
import java.io.IOException;
import java.util.TreeMap;
/* compiled from: PlayerEmsgHandler.java */
/* loaded from: classes.dex */
public final class d implements Handler.Callback {
    public final com.amazon.aps.iva.t6.b b;
    public final b c;
    public com.amazon.aps.iva.e6.c g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final TreeMap<Long, Long> f = new TreeMap<>();
    public final Handler e = g0.m(this);
    public final com.amazon.aps.iva.f7.b d = new com.amazon.aps.iva.f7.b();

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: PlayerEmsgHandler.java */
    /* loaded from: classes.dex */
    public final class c implements f0 {
        public final com.amazon.aps.iva.o6.g0 a;
        public final com.amazon.aps.iva.u1.g0 b = new com.amazon.aps.iva.u1.g0();
        public final com.amazon.aps.iva.d7.b c = new com.amazon.aps.iva.d7.b();
        public long d = -9223372036854775807L;

        public c(com.amazon.aps.iva.t6.b bVar) {
            this.a = new com.amazon.aps.iva.o6.g0(bVar, null, null);
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final void c(v vVar) {
            this.a.c(vVar);
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final void d(long j, int i, int i2, int i3, f0.a aVar) {
            long g;
            long j2;
            this.a.d(j, i, i2, i3, aVar);
            while (true) {
                boolean z = false;
                if (!this.a.r(false)) {
                    break;
                }
                com.amazon.aps.iva.d7.b bVar = this.c;
                bVar.k();
                if (this.a.v(this.b, bVar, 0, false) == -4) {
                    bVar.n();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    long j3 = bVar.f;
                    com.amazon.aps.iva.q5.f0 a = d.this.d.a(bVar);
                    if (a != null) {
                        com.amazon.aps.iva.f7.a aVar2 = (com.amazon.aps.iva.f7.a) a.b[0];
                        String str = aVar2.b;
                        String str2 = aVar2.c;
                        if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                            z = true;
                        }
                        if (z) {
                            try {
                                j2 = g0.T(g0.p(aVar2.f));
                            } catch (h0 unused) {
                                j2 = -9223372036854775807L;
                            }
                            if (j2 != -9223372036854775807L) {
                                a aVar3 = new a(j3, j2);
                                Handler handler = d.this.e;
                                handler.sendMessage(handler.obtainMessage(1, aVar3));
                            }
                        }
                    }
                }
            }
            com.amazon.aps.iva.o6.g0 g0Var = this.a;
            com.amazon.aps.iva.o6.f0 f0Var = g0Var.a;
            synchronized (g0Var) {
                int i4 = g0Var.s;
                if (i4 == 0) {
                    g = -1;
                } else {
                    g = g0Var.g(i4);
                }
            }
            f0Var.b(g);
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final int e(o oVar, int i, boolean z) throws IOException {
            return this.a.b(oVar, i, z);
        }

        @Override // com.amazon.aps.iva.x6.f0
        public final void f(int i, com.amazon.aps.iva.t5.v vVar) {
            this.a.a(i, vVar);
        }
    }

    public d(com.amazon.aps.iva.e6.c cVar, DashMediaSource.c cVar2, com.amazon.aps.iva.t6.b bVar) {
        this.g = cVar;
        this.c = cVar2;
        this.b = bVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        long j = aVar.a;
        TreeMap<Long, Long> treeMap = this.f;
        long j2 = aVar.b;
        Long l = treeMap.get(Long.valueOf(j2));
        if (l == null) {
            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            treeMap.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
