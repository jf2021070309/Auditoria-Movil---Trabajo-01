package com.amazon.aps.iva.j6;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.amazon.aps.iva.j6.d;
import com.amazon.aps.iva.j6.e;
import com.amazon.aps.iva.j6.g;
import com.amazon.aps.iva.j6.i;
import com.amazon.aps.iva.o6.q;
import com.amazon.aps.iva.o6.z;
import com.amazon.aps.iva.q5.h0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t6.j;
import com.amazon.aps.iva.t6.k;
import com.amazon.aps.iva.t6.m;
import com.amazon.aps.iva.w5.r;
import com.amazon.aps.iva.w5.w;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: DefaultHlsPlaylistTracker.java */
/* loaded from: classes.dex */
public final class b implements i, k.a<m<f>> {
    public static final com.amazon.aps.iva.q5.m p = new com.amazon.aps.iva.q5.m(5);
    public final com.amazon.aps.iva.h6.h b;
    public final h c;
    public final j d;
    public z.a g;
    public k h;
    public Handler i;
    public i.d j;
    public e k;
    public Uri l;
    public d m;
    public boolean n;
    public final CopyOnWriteArrayList<i.a> f = new CopyOnWriteArrayList<>();
    public final HashMap<Uri, C0401b> e = new HashMap<>();
    public long o = -9223372036854775807L;

    /* compiled from: DefaultHlsPlaylistTracker.java */
    /* loaded from: classes.dex */
    public class a implements i.a {
        public a() {
        }

        @Override // com.amazon.aps.iva.j6.i.a
        public final boolean a(Uri uri, j.c cVar, boolean z) {
            HashMap<Uri, C0401b> hashMap;
            C0401b c0401b;
            b bVar = b.this;
            if (bVar.m == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                e eVar = bVar.k;
                int i = g0.a;
                List<e.b> list = eVar.e;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int size = list.size();
                    hashMap = bVar.e;
                    if (i2 >= size) {
                        break;
                    }
                    C0401b c0401b2 = hashMap.get(list.get(i2).a);
                    if (c0401b2 != null && elapsedRealtime < c0401b2.i) {
                        i3++;
                    }
                    i2++;
                }
                j.b b = bVar.d.b(new j.a(1, 0, bVar.k.e.size(), i3), cVar);
                if (b != null && b.a == 2 && (c0401b = hashMap.get(uri)) != null) {
                    C0401b.a(c0401b, b.b);
                }
            }
            return false;
        }

        @Override // com.amazon.aps.iva.j6.i.a
        public final void d() {
            b.this.f.remove(this);
        }
    }

    /* compiled from: DefaultHlsPlaylistTracker.java */
    /* renamed from: com.amazon.aps.iva.j6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0401b implements k.a<m<f>> {
        public final Uri b;
        public final k c = new k("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final com.amazon.aps.iva.w5.f d;
        public d e;
        public long f;
        public long g;
        public long h;
        public long i;
        public boolean j;
        public IOException k;

        public C0401b(Uri uri) {
            this.b = uri;
            this.d = b.this.b.a();
        }

        public static boolean a(C0401b c0401b, long j) {
            boolean z;
            c0401b.i = SystemClock.elapsedRealtime() + j;
            b bVar = b.this;
            if (!c0401b.b.equals(bVar.l)) {
                return false;
            }
            List<e.b> list = bVar.k.e;
            int size = list.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = 0;
            while (true) {
                if (i < size) {
                    C0401b c0401b2 = bVar.e.get(list.get(i).a);
                    c0401b2.getClass();
                    if (elapsedRealtime > c0401b2.i) {
                        Uri uri = c0401b2.b;
                        bVar.l = uri;
                        c0401b2.c(bVar.o(uri));
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return false;
            }
            return true;
        }

        public final void b(Uri uri) {
            b bVar = b.this;
            m mVar = new m(4, uri, this.d, bVar.c.b(bVar.k, this.e));
            j jVar = bVar.d;
            int i = mVar.c;
            bVar.g.l(new q(mVar.a, mVar.b, this.c.f(mVar, this, jVar.a(i))), i);
        }

        public final void c(Uri uri) {
            this.i = 0L;
            if (!this.j) {
                k kVar = this.c;
                if (!kVar.d() && !kVar.c()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = this.h;
                    if (elapsedRealtime < j) {
                        this.j = true;
                        b.this.i.postDelayed(new com.amazon.aps.iva.n4.d(5, this, uri), j - elapsedRealtime);
                        return;
                    }
                    b(uri);
                }
            }
        }

        @Override // com.amazon.aps.iva.t6.k.a
        public final k.b d(m<f> mVar, long j, long j2, IOException iOException, int i) {
            boolean z;
            int i2;
            m<f> mVar2 = mVar;
            long j3 = mVar2.a;
            w wVar = mVar2.d;
            Uri uri = wVar.c;
            q qVar = new q(j3, uri, wVar.d, wVar.b);
            if (uri.getQueryParameter("_HLS_msn") != null) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = iOException instanceof g.a;
            k.b bVar = k.e;
            Uri uri2 = this.b;
            b bVar2 = b.this;
            int i3 = mVar2.c;
            if (z || z2) {
                if (iOException instanceof r) {
                    i2 = ((r) iOException).f;
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                if (z2 || i2 == 400 || i2 == 503) {
                    this.h = SystemClock.elapsedRealtime();
                    c(uri2);
                    z.a aVar = bVar2.g;
                    int i4 = g0.a;
                    aVar.j(qVar, i3, iOException, true);
                    return bVar;
                }
            }
            j.c cVar = new j.c(qVar, iOException, i);
            Iterator<i.a> it = bVar2.f.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                z3 |= !it.next().a(uri2, cVar, false);
            }
            j jVar = bVar2.d;
            if (z3) {
                long c = jVar.c(cVar);
                if (c != -9223372036854775807L) {
                    bVar = new k.b(0, c);
                } else {
                    bVar = k.f;
                }
            }
            boolean z4 = !bVar.a();
            bVar2.g.j(qVar, i3, iOException, z4);
            if (z4) {
                jVar.getClass();
            }
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0233  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0257  */
        /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void e(com.amazon.aps.iva.j6.d r65, com.amazon.aps.iva.o6.q r66) {
            /*
                Method dump skipped, instructions count: 722
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.j6.b.C0401b.e(com.amazon.aps.iva.j6.d, com.amazon.aps.iva.o6.q):void");
        }

        @Override // com.amazon.aps.iva.t6.k.a
        public final void i(m<f> mVar, long j, long j2, boolean z) {
            m<f> mVar2 = mVar;
            long j3 = mVar2.a;
            w wVar = mVar2.d;
            q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
            b bVar = b.this;
            bVar.d.getClass();
            bVar.g.c(qVar, 4);
        }

        @Override // com.amazon.aps.iva.t6.k.a
        public final void u(m<f> mVar, long j, long j2) {
            m<f> mVar2 = mVar;
            f fVar = mVar2.f;
            long j3 = mVar2.a;
            w wVar = mVar2.d;
            q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
            if (fVar instanceof d) {
                e((d) fVar, qVar);
                b.this.g.f(qVar, 4);
            } else {
                h0 b = h0.b("Loaded playlist has unexpected type.", null);
                this.k = b;
                b.this.g.j(qVar, 4, b, true);
            }
            b.this.d.getClass();
        }
    }

    public b(com.amazon.aps.iva.h6.h hVar, j jVar, h hVar2) {
        this.b = hVar;
        this.c = hVar2;
        this.d = jVar;
    }

    @Override // com.amazon.aps.iva.j6.i
    public final void a(Uri uri, z.a aVar, i.d dVar) {
        boolean z;
        this.i = g0.m(null);
        this.g = aVar;
        this.j = dVar;
        m mVar = new m(4, uri, this.b.a(), this.c.a());
        if (this.h == null) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        k kVar = new k("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.h = kVar;
        j jVar = this.d;
        int i = mVar.c;
        aVar.l(new q(mVar.a, mVar.b, kVar.f(mVar, this, jVar.a(i))), i);
    }

    @Override // com.amazon.aps.iva.j6.i
    public final void b(Uri uri) throws IOException {
        C0401b c0401b = this.e.get(uri);
        c0401b.c.a();
        IOException iOException = c0401b.k;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override // com.amazon.aps.iva.j6.i
    public final long c() {
        return this.o;
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final k.b d(m<f> mVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        m<f> mVar2 = mVar;
        long j3 = mVar2.a;
        w wVar = mVar2.d;
        q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
        long c = this.d.c(new j.c(qVar, iOException, i));
        if (c == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        this.g.j(qVar, mVar2.c, iOException, z);
        if (z) {
            return k.f;
        }
        return new k.b(0, c);
    }

    @Override // com.amazon.aps.iva.j6.i
    public final e e() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.j6.i
    public final void f(Uri uri) {
        C0401b c0401b = this.e.get(uri);
        c0401b.c(c0401b.b);
    }

    @Override // com.amazon.aps.iva.j6.i
    public final boolean g(Uri uri) {
        int i;
        C0401b c0401b = this.e.get(uri);
        if (c0401b.e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max((long) NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, g0.e0(c0401b.e.u));
        d dVar = c0401b.e;
        if (!dVar.o && (i = dVar.d) != 2 && i != 1 && c0401b.f + max <= elapsedRealtime) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.j6.i
    public final boolean h() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void i(m<f> mVar, long j, long j2, boolean z) {
        m<f> mVar2 = mVar;
        long j3 = mVar2.a;
        w wVar = mVar2.d;
        q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
        this.d.getClass();
        this.g.c(qVar, 4);
    }

    @Override // com.amazon.aps.iva.j6.i
    public final void j(i.a aVar) {
        this.f.remove(aVar);
    }

    @Override // com.amazon.aps.iva.j6.i
    public final boolean k(Uri uri, long j) {
        C0401b c0401b = this.e.get(uri);
        if (c0401b != null) {
            return !C0401b.a(c0401b, j);
        }
        return false;
    }

    @Override // com.amazon.aps.iva.j6.i
    public final void l() throws IOException {
        k kVar = this.h;
        if (kVar != null) {
            kVar.a();
        }
        Uri uri = this.l;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // com.amazon.aps.iva.j6.i
    public final d m(Uri uri, boolean z) {
        d dVar;
        HashMap<Uri, C0401b> hashMap = this.e;
        d dVar2 = hashMap.get(uri).e;
        if (dVar2 != null && z && !uri.equals(this.l)) {
            List<e.b> list = this.k.e;
            boolean z2 = false;
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    break;
                } else if (uri.equals(list.get(i).a)) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z2 && ((dVar = this.m) == null || !dVar.o)) {
                this.l = uri;
                C0401b c0401b = hashMap.get(uri);
                d dVar3 = c0401b.e;
                if (dVar3 != null && dVar3.o) {
                    this.m = dVar3;
                    ((HlsMediaSource) this.j).v(dVar3);
                } else {
                    c0401b.c(o(uri));
                }
            }
        }
        return dVar2;
    }

    @Override // com.amazon.aps.iva.j6.i
    public final void n(i.a aVar) {
        aVar.getClass();
        this.f.add(aVar);
    }

    public final Uri o(Uri uri) {
        d.b bVar;
        d dVar = this.m;
        if (dVar != null && dVar.v.e && (bVar = (d.b) dVar.t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bVar.b));
            int i = bVar.c;
            if (i != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
            }
            return buildUpon.build();
        }
        return uri;
    }

    @Override // com.amazon.aps.iva.j6.i
    public final void stop() {
        this.l = null;
        this.m = null;
        this.k = null;
        this.o = -9223372036854775807L;
        this.h.e(null);
        this.h = null;
        HashMap<Uri, C0401b> hashMap = this.e;
        for (C0401b c0401b : hashMap.values()) {
            c0401b.c.e(null);
        }
        this.i.removeCallbacksAndMessages(null);
        this.i = null;
        hashMap.clear();
    }

    @Override // com.amazon.aps.iva.t6.k.a
    public final void u(m<f> mVar, long j, long j2) {
        e eVar;
        m<f> mVar2 = mVar;
        f fVar = mVar2.f;
        boolean z = fVar instanceof d;
        if (z) {
            String str = fVar.a;
            e eVar2 = e.n;
            Uri parse = Uri.parse(str);
            v.a aVar = new v.a();
            aVar.a = "0";
            aVar.j = "application/x-mpegURL";
            eVar = new e("", Collections.emptyList(), Collections.singletonList(new e.b(parse, new v(aVar), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            eVar = (e) fVar;
        }
        this.k = eVar;
        this.l = eVar.e.get(0).a;
        this.f.add(new a());
        List<Uri> list = eVar.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.e.put(uri, new C0401b(uri));
        }
        long j3 = mVar2.a;
        w wVar = mVar2.d;
        q qVar = new q(j3, wVar.c, wVar.d, wVar.b);
        C0401b c0401b = this.e.get(this.l);
        if (z) {
            c0401b.e((d) fVar, qVar);
        } else {
            c0401b.c(c0401b.b);
        }
        this.d.getClass();
        this.g.f(qVar, 4);
    }
}
