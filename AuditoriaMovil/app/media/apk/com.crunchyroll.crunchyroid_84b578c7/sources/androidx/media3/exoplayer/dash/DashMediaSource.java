package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.c;
import androidx.media3.exoplayer.dash.d;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.e.i;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.m6.r;
import com.amazon.aps.iva.o6.q;
import com.amazon.aps.iva.o6.u;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.c0;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.p0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t6.e;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.t6.k;
import com.amazon.aps.iva.t6.l;
import com.amazon.aps.iva.t6.m;
import com.amazon.aps.iva.u6.b;
import com.amazon.aps.iva.v1.p;
import com.amazon.aps.iva.w5.f;
import com.amazon.aps.iva.w5.w;
import com.amazon.aps.iva.w5.y;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.common.base.Charsets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class DashMediaSource extends com.amazon.aps.iva.o6.a {
    public static final /* synthetic */ int Q = 0;
    public com.amazon.aps.iva.w5.f A;
    public k B;
    public y C;
    public com.amazon.aps.iva.d6.c D;
    public Handler E;
    public b0.f F;
    public Uri G;
    public final Uri H;
    public com.amazon.aps.iva.e6.c I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long O;
    public int P;
    public final b0 h;
    public final boolean i;
    public final f.a j;
    public final a.InterfaceC0036a k;
    public final com.amazon.aps.iva.o6.h l;
    public final com.amazon.aps.iva.g6.f m;
    public final j n;
    public final com.amazon.aps.iva.d6.b o;
    public final long p;
    public final long q;
    public final z.a r;
    public final m.a<? extends com.amazon.aps.iva.e6.c> s;
    public final e t;
    public final Object u;
    public final SparseArray<androidx.media3.exoplayer.dash.b> v;
    public final p w;
    public final i x;
    public final c y;
    public final l z;

    /* loaded from: classes.dex */
    public static final class Factory implements v.a {
        public final a.InterfaceC0036a a;
        public final f.a b;
        public com.amazon.aps.iva.g6.g c = new com.amazon.aps.iva.g6.c();
        public j e = new com.amazon.aps.iva.t6.i();
        public final long f = NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS;
        public final long g = 5000000;
        public final com.amazon.aps.iva.o6.h d = new com.amazon.aps.iva.o6.h(0);

        public Factory(f.a aVar) {
            this.a = new c.a(aVar);
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.o6.v.a
        @CanIgnoreReturnValue
        public final v.a a(com.amazon.aps.iva.g6.g gVar) {
            if (gVar != null) {
                this.c = gVar;
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
            return new int[]{0};
        }

        @Override // com.amazon.aps.iva.o6.v.a
        public final v d(b0 b0Var) {
            m.a aVar;
            b0Var.c.getClass();
            com.amazon.aps.iva.e6.d dVar = new com.amazon.aps.iva.e6.d();
            List<p0> list = b0Var.c.f;
            if (!list.isEmpty()) {
                aVar = new r(dVar, list);
            } else {
                aVar = dVar;
            }
            return new DashMediaSource(b0Var, this.b, aVar, this.a, this.d, this.c.a(b0Var), this.e, this.f, this.g);
        }

        @Override // com.amazon.aps.iva.o6.v.a
        @CanIgnoreReturnValue
        public final v.a e(j jVar) {
            if (jVar != null) {
                this.e = jVar;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
    }

    /* loaded from: classes.dex */
    public class a implements b.a {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends r0 {
        public final long g;
        public final long h;
        public final long i;
        public final int j;
        public final long k;
        public final long l;
        public final long m;
        public final com.amazon.aps.iva.e6.c n;
        public final b0 o;
        public final b0.f p;

        public b(long j, long j2, long j3, int i, long j4, long j5, long j6, com.amazon.aps.iva.e6.c cVar, b0 b0Var, b0.f fVar) {
            boolean z;
            boolean z2 = cVar.d;
            if (fVar != null) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z2 == z);
            this.g = j;
            this.h = j2;
            this.i = j3;
            this.j = i;
            this.k = j4;
            this.l = j5;
            this.m = j6;
            this.n = cVar;
            this.o = b0Var;
            this.p = fVar;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int c(Object obj) {
            int intValue;
            if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.j) < 0 || intValue >= j()) {
                return -1;
            }
            return intValue;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final r0.b h(int i, r0.b bVar, boolean z) {
            String str;
            com.amazon.aps.iva.cq.b.x(i, j());
            Integer num = null;
            com.amazon.aps.iva.e6.c cVar = this.n;
            if (z) {
                str = cVar.b(i).a;
            } else {
                str = null;
            }
            if (z) {
                num = Integer.valueOf(this.j + i);
            }
            bVar.k(str, num, cVar.e(i), g0.Q(cVar.b(i).b - cVar.b(0).b) - this.k);
            return bVar;
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int j() {
            return this.n.c();
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final Object n(int i) {
            com.amazon.aps.iva.cq.b.x(i, j());
            return Integer.valueOf(this.j + i);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
        @Override // com.amazon.aps.iva.q5.r0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.q5.r0.d p(int r24, com.amazon.aps.iva.q5.r0.d r25, long r26) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.b.p(int, com.amazon.aps.iva.q5.r0$d, long):com.amazon.aps.iva.q5.r0$d");
        }

        @Override // com.amazon.aps.iva.q5.r0
        public final int q() {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public final class c implements d.b {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements m.a<Long> {
        public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.amazon.aps.iva.t6.m.a
        public final Object a(Uri uri, com.amazon.aps.iva.w5.h hVar) throws IOException {
            long j;
            long parseLong;
            String readLine = new BufferedReader(new InputStreamReader(hVar, Charsets.UTF_8)).readLine();
            try {
                Matcher matcher = a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        if ("+".equals(matcher.group(4))) {
                            j = 1;
                        } else {
                            j = -1;
                        }
                        long parseLong2 = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        if (TextUtils.isEmpty(group2)) {
                            parseLong = 0;
                        } else {
                            parseLong = Long.parseLong(group2);
                        }
                        time -= ((((parseLong2 * 60) + parseLong) * 60) * 1000) * j;
                    }
                    return Long.valueOf(time);
                }
                throw h0.b("Couldn't parse timestamp: " + readLine, null);
            } catch (ParseException e) {
                throw h0.b(null, e);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class e implements k.a<m<com.amazon.aps.iva.e6.c>> {
        public e() {
        }

        @Override // com.amazon.aps.iva.t6.k.a
        public final k.b d(m<com.amazon.aps.iva.e6.c> mVar, long j, long j2, IOException iOException, int i) {
            k.b bVar;
            m<com.amazon.aps.iva.e6.c> mVar2 = mVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j3 = mVar2.a;
            w wVar = mVar2.d;
            q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
            long c = dashMediaSource.n.c(new j.c(qVar, iOException, i));
            if (c == -9223372036854775807L) {
                bVar = k.f;
            } else {
                bVar = new k.b(0, c);
            }
            dashMediaSource.r.j(qVar, mVar2.c, iOException, !bVar.a());
            return bVar;
        }

        @Override // com.amazon.aps.iva.t6.k.a
        public final void i(m<com.amazon.aps.iva.e6.c> mVar, long j, long j2, boolean z) {
            DashMediaSource.this.w(mVar, j, j2);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
        @Override // com.amazon.aps.iva.t6.k.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void u(com.amazon.aps.iva.t6.m<com.amazon.aps.iva.e6.c> r18, long r19, long r21) {
            /*
                Method dump skipped, instructions count: 470
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.e.u(com.amazon.aps.iva.t6.k$d, long, long):void");
        }
    }

    /* loaded from: classes.dex */
    public final class f implements l {
        public f() {
        }

        @Override // com.amazon.aps.iva.t6.l
        public final void a() throws IOException {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.B.a();
            com.amazon.aps.iva.d6.c cVar = dashMediaSource.D;
            if (cVar == null) {
                return;
            }
            throw cVar;
        }
    }

    /* loaded from: classes.dex */
    public final class g implements k.a<m<Long>> {
        public g() {
        }

        @Override // com.amazon.aps.iva.t6.k.a
        public final k.b d(m<Long> mVar, long j, long j2, IOException iOException, int i) {
            m<Long> mVar2 = mVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j3 = mVar2.a;
            w wVar = mVar2.d;
            dashMediaSource.r.j(new q(j3, wVar.c, wVar.d, wVar.b), mVar2.c, iOException, true);
            dashMediaSource.n.getClass();
            com.amazon.aps.iva.t5.p.d("Failed to resolve time offset.", iOException);
            dashMediaSource.x(true);
            return k.e;
        }

        @Override // com.amazon.aps.iva.t6.k.a
        public final void i(m<Long> mVar, long j, long j2, boolean z) {
            DashMediaSource.this.w(mVar, j, j2);
        }

        @Override // com.amazon.aps.iva.t6.k.a
        public final void u(m<Long> mVar, long j, long j2) {
            m<Long> mVar2 = mVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j3 = mVar2.a;
            w wVar = mVar2.d;
            q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
            dashMediaSource.n.getClass();
            dashMediaSource.r.f(qVar, mVar2.c);
            dashMediaSource.M = mVar2.f.longValue() - j;
            dashMediaSource.x(true);
        }
    }

    /* loaded from: classes.dex */
    public static final class h implements m.a<Long> {
        @Override // com.amazon.aps.iva.t6.m.a
        public final Object a(Uri uri, com.amazon.aps.iva.w5.h hVar) throws IOException {
            return Long.valueOf(g0.T(new BufferedReader(new InputStreamReader(hVar)).readLine()));
        }
    }

    static {
        c0.a("media3.exoplayer.dash");
    }

    public DashMediaSource(b0 b0Var, f.a aVar, m.a aVar2, a.InterfaceC0036a interfaceC0036a, com.amazon.aps.iva.o6.h hVar, com.amazon.aps.iva.g6.f fVar, j jVar, long j, long j2) {
        this.h = b0Var;
        this.F = b0Var.d;
        b0.g gVar = b0Var.c;
        gVar.getClass();
        Uri uri = gVar.b;
        this.G = uri;
        this.H = uri;
        this.I = null;
        this.j = aVar;
        this.s = aVar2;
        this.k = interfaceC0036a;
        this.m = fVar;
        this.n = jVar;
        this.p = j;
        this.q = j2;
        this.l = hVar;
        this.o = new com.amazon.aps.iva.d6.b();
        this.i = false;
        this.r = o(null);
        this.u = new Object();
        this.v = new SparseArray<>();
        this.y = new c();
        this.O = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.t = new e();
        this.z = new f();
        this.w = new p(this, 3);
        this.x = new i(this, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean u(com.amazon.aps.iva.e6.g r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List<com.amazon.aps.iva.e6.a> r2 = r5.c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            com.amazon.aps.iva.e6.a r2 = (com.amazon.aps.iva.e6.a) r2
            int r2 = r2.b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.u(com.amazon.aps.iva.e6.g):boolean");
    }

    @Override // com.amazon.aps.iva.o6.v
    public final b0 b() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void c(u uVar) {
        com.amazon.aps.iva.q6.h<androidx.media3.exoplayer.dash.a>[] hVarArr;
        com.amazon.aps.iva.o6.g0[] g0VarArr;
        androidx.media3.exoplayer.dash.b bVar = (androidx.media3.exoplayer.dash.b) uVar;
        androidx.media3.exoplayer.dash.d dVar = bVar.n;
        dVar.j = true;
        dVar.e.removeCallbacksAndMessages(null);
        for (com.amazon.aps.iva.q6.h<androidx.media3.exoplayer.dash.a> hVar : bVar.t) {
            hVar.s = bVar;
            com.amazon.aps.iva.o6.g0 g0Var = hVar.n;
            g0Var.i();
            com.amazon.aps.iva.g6.d dVar2 = g0Var.h;
            if (dVar2 != null) {
                dVar2.e(g0Var.e);
                g0Var.h = null;
                g0Var.g = null;
            }
            for (com.amazon.aps.iva.o6.g0 g0Var2 : hVar.o) {
                g0Var2.i();
                com.amazon.aps.iva.g6.d dVar3 = g0Var2.h;
                if (dVar3 != null) {
                    dVar3.e(g0Var2.e);
                    g0Var2.h = null;
                    g0Var2.g = null;
                }
            }
            hVar.j.e(hVar);
        }
        bVar.s = null;
        this.v.remove(bVar.b);
    }

    @Override // com.amazon.aps.iva.o6.v
    public final u h(v.b bVar, com.amazon.aps.iva.t6.b bVar2, long j) {
        int intValue = ((Integer) bVar.a).intValue() - this.P;
        z.a o = o(bVar);
        e.a aVar = new e.a(this.d.c, 0, bVar);
        int i = this.P + intValue;
        com.amazon.aps.iva.e6.c cVar = this.I;
        com.amazon.aps.iva.d6.b bVar3 = this.o;
        a.InterfaceC0036a interfaceC0036a = this.k;
        y yVar = this.C;
        com.amazon.aps.iva.g6.f fVar = this.m;
        j jVar = this.n;
        long j2 = this.M;
        l lVar = this.z;
        com.amazon.aps.iva.o6.h hVar = this.l;
        c cVar2 = this.y;
        p1 p1Var = this.g;
        com.amazon.aps.iva.cq.b.D(p1Var);
        androidx.media3.exoplayer.dash.b bVar4 = new androidx.media3.exoplayer.dash.b(i, cVar, bVar3, intValue, interfaceC0036a, yVar, fVar, aVar, jVar, o, j2, lVar, bVar2, hVar, cVar2, p1Var);
        this.v.put(i, bVar4);
        return bVar4;
    }

    @Override // com.amazon.aps.iva.o6.v
    public final void j() throws IOException {
        this.z.a();
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void r(y yVar) {
        this.C = yVar;
        Looper myLooper = Looper.myLooper();
        p1 p1Var = this.g;
        com.amazon.aps.iva.cq.b.D(p1Var);
        com.amazon.aps.iva.g6.f fVar = this.m;
        fVar.a(myLooper, p1Var);
        fVar.g();
        if (this.i) {
            x(false);
            return;
        }
        this.A = this.j.a();
        this.B = new k("DashMediaSource");
        this.E = g0.m(null);
        y();
    }

    @Override // com.amazon.aps.iva.o6.a
    public final void t() {
        com.amazon.aps.iva.e6.c cVar;
        this.J = false;
        this.A = null;
        k kVar = this.B;
        if (kVar != null) {
            kVar.e(null);
            this.B = null;
        }
        this.K = 0L;
        this.L = 0L;
        if (this.i) {
            cVar = this.I;
        } else {
            cVar = null;
        }
        this.I = cVar;
        this.G = this.H;
        this.D = null;
        Handler handler = this.E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.E = null;
        }
        this.M = -9223372036854775807L;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.v.clear();
        com.amazon.aps.iva.d6.b bVar = this.o;
        bVar.a.clear();
        bVar.b.clear();
        bVar.c.clear();
        this.m.release();
    }

    public final void v() {
        boolean z;
        long j;
        k kVar = this.B;
        a aVar = new a();
        Object obj = com.amazon.aps.iva.u6.b.b;
        synchronized (obj) {
            z = com.amazon.aps.iva.u6.b.c;
        }
        if (z) {
            synchronized (obj) {
                if (com.amazon.aps.iva.u6.b.c) {
                    j = com.amazon.aps.iva.u6.b.d;
                } else {
                    j = -9223372036854775807L;
                }
            }
            this.M = j;
            x(true);
            return;
        }
        if (kVar == null) {
            kVar = new k("SntpClient");
        }
        kVar.f(new b.c(), new b.C0759b(aVar), 1);
    }

    public final void w(m<?> mVar, long j, long j2) {
        long j3 = mVar.a;
        w wVar = mVar.d;
        q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
        this.n.getClass();
        this.r.c(qVar, mVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x019a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r46) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.DashMediaSource.x(boolean):void");
    }

    public final void y() {
        Uri uri;
        this.E.removeCallbacks(this.w);
        if (this.B.c()) {
            return;
        }
        if (this.B.d()) {
            this.J = true;
            return;
        }
        synchronized (this.u) {
            uri = this.G;
        }
        this.J = false;
        m mVar = new m(4, uri, this.A, this.s);
        this.r.l(new q(mVar.a, mVar.b, this.B.f(mVar, this.t, this.n.a(4))), mVar.c);
    }
}
