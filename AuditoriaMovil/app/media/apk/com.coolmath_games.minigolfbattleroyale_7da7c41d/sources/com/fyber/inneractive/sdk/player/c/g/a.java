package com.fyber.inneractive.sdk.player.c.g;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import com.fyber.inneractive.sdk.player.c.b.b;
import com.fyber.inneractive.sdk.player.c.d.d;
import com.fyber.inneractive.sdk.player.c.d.l;
import com.fyber.inneractive.sdk.player.c.d.m;
import com.fyber.inneractive.sdk.player.c.d.n;
import com.fyber.inneractive.sdk.player.c.g.b;
import com.fyber.inneractive.sdk.player.c.g.c;
import com.fyber.inneractive.sdk.player.c.g.d;
import com.fyber.inneractive.sdk.player.c.j.r;
import com.fyber.inneractive.sdk.player.c.j.s;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.EOFException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
final class a implements d.c, com.fyber.inneractive.sdk.player.c.d.h, com.fyber.inneractive.sdk.player.c.g.c, s.a<C0061a> {
    private final com.fyber.inneractive.sdk.player.c.j.b A;
    private boolean C;
    private int D;
    private int G;
    final b.a a;
    final d.a b;
    final String c;
    final b e;
    c.a j;
    m k;
    boolean l;
    boolean m;
    boolean n;
    i o;
    long p;
    boolean[] q;
    boolean[] r;
    boolean s;
    long t;
    boolean u;
    boolean v;
    private final Uri w;
    private final com.fyber.inneractive.sdk.player.c.j.g x;
    private final int y;
    private final Handler z;
    final s d = new s("Loader:ExtractorMediaPeriod");
    final com.fyber.inneractive.sdk.player.c.k.d f = new com.fyber.inneractive.sdk.player.c.k.d();
    private final Runnable B = new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.g.a.1
        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.v || aVar.m || aVar.k == null || !aVar.l) {
                return;
            }
            int size = aVar.i.size();
            for (int i = 0; i < size; i++) {
                if (aVar.i.valueAt(i).b.c() == null) {
                    return;
                }
            }
            aVar.f.b();
            h[] hVarArr = new h[size];
            aVar.r = new boolean[size];
            aVar.q = new boolean[size];
            aVar.p = aVar.k.b();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 >= size) {
                    aVar.o = new i(hVarArr);
                    aVar.m = true;
                    aVar.b.a(new g(aVar.p, aVar.k.b_()));
                    aVar.j.a((com.fyber.inneractive.sdk.player.c.g.c) aVar);
                    return;
                }
                com.fyber.inneractive.sdk.player.c.h c2 = aVar.i.valueAt(i2).b.c();
                hVarArr[i2] = new h(c2);
                String str = c2.f;
                if (!com.fyber.inneractive.sdk.player.c.k.h.b(str) && !com.fyber.inneractive.sdk.player.c.k.h.a(str)) {
                    z = false;
                }
                aVar.r[i2] = z;
                aVar.s = z | aVar.s;
                i2++;
            }
        }
    };
    final Runnable g = new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.g.a.2
        @Override // java.lang.Runnable
        public final void run() {
            if (a.this.v) {
                return;
            }
            a.this.j.a((c.a) a.this);
        }
    };
    final Handler h = new Handler();
    private long F = -9223372036854775807L;
    final SparseArray<com.fyber.inneractive.sdk.player.c.d.d> i = new SparseArray<>();
    private long E = -1;

    @Override // com.fyber.inneractive.sdk.player.c.j.s.a
    public final /* synthetic */ int a(C0061a c0061a, final IOException iOException) {
        m mVar;
        C0061a c0061a2 = c0061a;
        a2(c0061a2);
        Handler handler = this.z;
        if (handler != null && this.a != null) {
            handler.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.g.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.a.a(iOException);
                }
            });
        }
        if ((iOException instanceof j) || (iOException instanceof r.e) || ((iOException instanceof r.c) && iOException.getCause() != null && ((iOException.getCause() instanceof MalformedURLException) || (iOException.getCause() instanceof UnknownHostException)))) {
            return 3;
        }
        boolean z = l() > this.G;
        if (this.E == -1 && ((mVar = this.k) == null || mVar.b() == -9223372036854775807L)) {
            this.t = 0L;
            this.n = this.m;
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                this.i.valueAt(i).a(!this.m || this.q[i]);
            }
            c0061a2.a(0L, 0L);
        }
        this.G = l();
        return z ? 1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.s.a
    public final /* synthetic */ void a(C0061a c0061a) {
        a2(c0061a);
        this.u = true;
        if (this.p == -9223372036854775807L) {
            long m = m();
            this.p = m == Long.MIN_VALUE ? 0L : m + WorkRequest.MIN_BACKOFF_MILLIS;
            this.b.a(new g(this.p, this.k.b_()));
        }
        this.j.a((c.a) this);
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.s.a
    public final /* synthetic */ void a(C0061a c0061a, boolean z) {
        a2(c0061a);
        if (z || this.D <= 0) {
            return;
        }
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            this.i.valueAt(i).a(this.q[i]);
        }
        this.j.a((c.a) this);
    }

    public a(Uri uri, com.fyber.inneractive.sdk.player.c.j.g gVar, com.fyber.inneractive.sdk.player.c.d.f[] fVarArr, int i, Handler handler, b.a aVar, d.a aVar2, com.fyber.inneractive.sdk.player.c.j.b bVar, String str) {
        this.w = uri;
        this.x = gVar;
        this.y = i;
        this.z = handler;
        this.a = aVar;
        this.b = aVar2;
        this.A = bVar;
        this.c = str;
        this.e = new b(fVarArr, this);
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.c
    public final void a(c.a aVar) {
        this.j = aVar;
        this.f.a();
        k();
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.c
    public final void c() throws IOException {
        i();
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.c
    public final i d() {
        return this.o;
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.c
    public final long a(com.fyber.inneractive.sdk.player.c.i.e[] eVarArr, boolean[] zArr, e[] eVarArr2, boolean[] zArr2, long j) {
        com.fyber.inneractive.sdk.player.c.k.a.b(this.m);
        for (int i = 0; i < eVarArr.length; i++) {
            if (eVarArr2[i] != null && (eVarArr[i] == null || !zArr[i])) {
                int i2 = ((c) eVarArr2[i]).a;
                com.fyber.inneractive.sdk.player.c.k.a.b(this.q[i2]);
                this.D--;
                this.q[i2] = false;
                this.i.valueAt(i2).a();
                eVarArr2[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (eVarArr2[i3] == null && eVarArr[i3] != null) {
                com.fyber.inneractive.sdk.player.c.i.e eVar = eVarArr[i3];
                com.fyber.inneractive.sdk.player.c.k.a.b(eVar.b() == 1);
                com.fyber.inneractive.sdk.player.c.k.a.b(eVar.b(0) == 0);
                int a = this.o.a(eVar.a());
                com.fyber.inneractive.sdk.player.c.k.a.b(!this.q[a]);
                this.D++;
                this.q[a] = true;
                eVarArr2[i3] = new c(a);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.C) {
            int size = this.i.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.q[i4]) {
                    this.i.valueAt(i4).a();
                }
            }
        }
        if (this.D == 0) {
            this.n = false;
            if (this.d.a()) {
                this.d.b();
            }
        } else if (!this.C ? j != 0 : z) {
            j = a(j);
            for (int i5 = 0; i5 < eVarArr2.length; i5++) {
                if (eVarArr2[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.C = true;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.c
    public final boolean e() {
        if (this.u) {
            return false;
        }
        if (this.m && this.D == 0) {
            return false;
        }
        boolean a = this.f.a();
        if (this.d.a()) {
            return a;
        }
        k();
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.c
    public final long f() {
        if (this.D == 0) {
            return Long.MIN_VALUE;
        }
        return h();
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.c
    public final long g() {
        if (this.n) {
            this.n = false;
            return this.t;
        }
        return -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.c
    public final long h() {
        long m;
        if (this.u) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.F;
        }
        if (this.s) {
            m = LongCompanionObject.MAX_VALUE;
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                if (this.r[i]) {
                    m = Math.min(m, this.i.valueAt(i).b.d());
                }
            }
        } else {
            m = m();
        }
        return m == Long.MIN_VALUE ? this.t : m;
    }

    @Override // com.fyber.inneractive.sdk.player.c.g.c
    public final long a(long j) {
        if (!this.k.b_()) {
            j = 0;
        }
        this.t = j;
        int size = this.i.size();
        boolean z = !j();
        for (int i = 0; z && i < size; i++) {
            if (this.q[i]) {
                z = this.i.valueAt(i).a(j, false);
            }
        }
        if (!z) {
            this.F = j;
            this.u = false;
            if (this.d.a()) {
                this.d.b();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.i.valueAt(i2).a(this.q[i2]);
                }
            }
        }
        this.n = false;
        return j;
    }

    final void i() throws IOException {
        s sVar = this.d;
        if (sVar.c != null) {
            throw sVar.c;
        }
        if (sVar.b != null) {
            s.b<? extends s.c> bVar = sVar.b;
            int i = sVar.b.a;
            if (bVar.b != null && bVar.c > i) {
                throw bVar.b;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.h
    public final n a(int i) {
        com.fyber.inneractive.sdk.player.c.d.d dVar = this.i.get(i);
        if (dVar == null) {
            com.fyber.inneractive.sdk.player.c.d.d dVar2 = new com.fyber.inneractive.sdk.player.c.d.d(this.A);
            dVar2.h = this;
            this.i.put(i, dVar2);
            return dVar2;
        }
        return dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.h
    public final void b() {
        this.l = true;
        this.h.post(this.B);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.h
    public final void a(m mVar) {
        this.k = mVar;
        this.h.post(this.B);
    }

    @Override // com.fyber.inneractive.sdk.player.c.d.d.c
    public final void a() {
        this.h.post(this.B);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(C0061a c0061a) {
        if (this.E == -1) {
            this.E = c0061a.a;
        }
    }

    private void k() {
        m mVar;
        C0061a c0061a = new C0061a(this.w, this.x, this.e, this.f);
        if (this.m) {
            com.fyber.inneractive.sdk.player.c.k.a.b(j());
            long j = this.p;
            if (j != -9223372036854775807L && this.F >= j) {
                this.u = true;
                this.F = -9223372036854775807L;
                return;
            }
            c0061a.a(this.k.a(this.F), this.F);
            this.F = -9223372036854775807L;
        }
        this.G = l();
        int i = this.y;
        if (i == -1) {
            i = (this.m && this.E == -1 && ((mVar = this.k) == null || mVar.b() == -9223372036854775807L)) ? 6 : 3;
        }
        int i2 = i;
        s sVar = this.d;
        Looper myLooper = Looper.myLooper();
        com.fyber.inneractive.sdk.player.c.k.a.b(myLooper != null);
        new s.b(myLooper, c0061a, this, i2, SystemClock.elapsedRealtime()).a(0L);
    }

    private int l() {
        int size = this.i.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.i.valueAt(i2).b.a();
        }
        return i;
    }

    private long m() {
        int size = this.i.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.i.valueAt(i).b.d());
        }
        return j;
    }

    final boolean j() {
        return this.F != -9223372036854775807L;
    }

    /* loaded from: classes.dex */
    private final class c implements e {
        final int a;

        public c(int i) {
            this.a = i;
        }

        @Override // com.fyber.inneractive.sdk.player.c.g.e
        public final boolean a() {
            a aVar = a.this;
            int i = this.a;
            if (aVar.u) {
                return true;
            }
            return (aVar.j() || aVar.i.valueAt(i).b.b()) ? false : true;
        }

        @Override // com.fyber.inneractive.sdk.player.c.g.e
        public final void b() throws IOException {
            a.this.i();
        }

        @Override // com.fyber.inneractive.sdk.player.c.g.e
        public final int a(com.fyber.inneractive.sdk.player.c.i iVar, com.fyber.inneractive.sdk.player.c.b.d dVar, boolean z) {
            int i;
            a aVar = a.this;
            int i2 = this.a;
            if (aVar.n || aVar.j()) {
                return -3;
            }
            com.fyber.inneractive.sdk.player.c.d.d valueAt = aVar.i.valueAt(i2);
            boolean z2 = aVar.u;
            long j = aVar.t;
            int a = valueAt.b.a(iVar, dVar, z, z2, valueAt.g, valueAt.d);
            if (a == -5) {
                valueAt.g = iVar.a;
                return -5;
            } else if (a == -4) {
                if (!dVar.c()) {
                    if (dVar.d < j) {
                        dVar.a |= Integer.MIN_VALUE;
                    }
                    if (dVar.e()) {
                        d.a aVar2 = valueAt.d;
                        long j2 = aVar2.b;
                        valueAt.e.a(1);
                        valueAt.a(j2, valueAt.e.a, 1);
                        long j3 = j2 + 1;
                        byte b = valueAt.e.a[0];
                        boolean z3 = (b & ByteCompanionObject.MIN_VALUE) != 0;
                        int i3 = b & ByteCompanionObject.MAX_VALUE;
                        if (dVar.b.a == null) {
                            dVar.b.a = new byte[16];
                        }
                        valueAt.a(j3, dVar.b.a, i3);
                        long j4 = j3 + i3;
                        if (z3) {
                            valueAt.e.a(2);
                            valueAt.a(j4, valueAt.e.a, 2);
                            j4 += 2;
                            i = valueAt.e.e();
                        } else {
                            i = 1;
                        }
                        int[] iArr = dVar.b.d;
                        if (iArr == null || iArr.length < i) {
                            iArr = new int[i];
                        }
                        int[] iArr2 = dVar.b.e;
                        if (iArr2 == null || iArr2.length < i) {
                            iArr2 = new int[i];
                        }
                        if (z3) {
                            int i4 = i * 6;
                            valueAt.e.a(i4);
                            valueAt.a(j4, valueAt.e.a, i4);
                            j4 += i4;
                            valueAt.e.c(0);
                            for (int i5 = 0; i5 < i; i5++) {
                                iArr[i5] = valueAt.e.e();
                                iArr2[i5] = valueAt.e.n();
                            }
                        } else {
                            iArr[0] = 0;
                            iArr2[0] = aVar2.a - ((int) (j4 - aVar2.b));
                        }
                        com.fyber.inneractive.sdk.player.c.b.b bVar = dVar.b;
                        byte[] bArr = aVar2.d;
                        byte[] bArr2 = dVar.b.a;
                        bVar.f = i;
                        bVar.d = iArr;
                        bVar.e = iArr2;
                        bVar.b = bArr;
                        bVar.a = bArr2;
                        bVar.c = 1;
                        bVar.g = 0;
                        bVar.h = 0;
                        if (t.a >= 16) {
                            bVar.i.numSubSamples = bVar.f;
                            bVar.i.numBytesOfClearData = bVar.d;
                            bVar.i.numBytesOfEncryptedData = bVar.e;
                            bVar.i.key = bVar.b;
                            bVar.i.iv = bVar.a;
                            bVar.i.mode = bVar.c;
                            if (t.a >= 24) {
                                b.a aVar3 = bVar.j;
                                aVar3.b.set(bVar.g, bVar.h);
                                aVar3.a.setPattern(aVar3.b);
                            }
                        }
                        int i6 = (int) (j4 - aVar2.b);
                        aVar2.b += i6;
                        aVar2.a -= i6;
                    }
                    int i7 = valueAt.d.a;
                    if (dVar.c == null) {
                        dVar.c = dVar.b(i7);
                    } else {
                        int capacity = dVar.c.capacity();
                        int position = dVar.c.position();
                        int i8 = i7 + position;
                        if (capacity < i8) {
                            ByteBuffer b2 = dVar.b(i8);
                            if (position > 0) {
                                dVar.c.position(0);
                                dVar.c.limit(position);
                                b2.put(dVar.c);
                            }
                            dVar.c = b2;
                        }
                    }
                    long j5 = valueAt.d.b;
                    ByteBuffer byteBuffer = dVar.c;
                    int i9 = valueAt.d.a;
                    while (i9 > 0) {
                        valueAt.a(j5);
                        int i10 = (int) (j5 - valueAt.f);
                        int min = Math.min(i9, valueAt.a - i10);
                        com.fyber.inneractive.sdk.player.c.j.a peek = valueAt.c.peek();
                        byteBuffer.put(peek.a, peek.b + i10, min);
                        j5 += min;
                        i9 -= min;
                    }
                    valueAt.a(valueAt.d.c);
                }
                return -4;
            } else {
                if (a == -3) {
                    return -3;
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.fyber.inneractive.sdk.player.c.g.e
        public final void a(long j) {
            a aVar = a.this;
            com.fyber.inneractive.sdk.player.c.d.d valueAt = aVar.i.valueAt(this.a);
            if (!aVar.u || j <= valueAt.b.d()) {
                valueAt.a(j, true);
                return;
            }
            long e = valueAt.b.e();
            if (e != -1) {
                valueAt.a(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.fyber.inneractive.sdk.player.c.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0061a implements s.c {
        private final Uri c;
        private final com.fyber.inneractive.sdk.player.c.j.g d;
        private final b e;
        private final com.fyber.inneractive.sdk.player.c.k.d f;
        private volatile boolean h;
        private long j;
        private final l g = new l();
        private boolean i = true;
        long a = -1;

        public C0061a(Uri uri, com.fyber.inneractive.sdk.player.c.j.g gVar, b bVar, com.fyber.inneractive.sdk.player.c.k.d dVar) {
            this.c = (Uri) com.fyber.inneractive.sdk.player.c.k.a.a(uri);
            this.d = (com.fyber.inneractive.sdk.player.c.j.g) com.fyber.inneractive.sdk.player.c.k.a.a(gVar);
            this.e = (b) com.fyber.inneractive.sdk.player.c.k.a.a(bVar);
            this.f = dVar;
        }

        public final void a(long j, long j2) {
            this.g.a = j;
            this.j = j2;
            this.i = true;
        }

        @Override // com.fyber.inneractive.sdk.player.c.j.s.c
        public final void a() {
            this.h = true;
        }

        @Override // com.fyber.inneractive.sdk.player.c.j.s.c
        public final boolean b() {
            return this.h;
        }

        @Override // com.fyber.inneractive.sdk.player.c.j.s.c
        public final void c() throws IOException, InterruptedException {
            int i = 0;
            while (i == 0 && !this.h) {
                com.fyber.inneractive.sdk.player.c.d.b bVar = null;
                try {
                    long j = this.g.a;
                    long a = this.d.a(new com.fyber.inneractive.sdk.player.c.j.i(this.c, j, a.this.c));
                    this.a = a;
                    if (a != -1) {
                        this.a = a + j;
                    }
                    com.fyber.inneractive.sdk.player.c.d.b bVar2 = new com.fyber.inneractive.sdk.player.c.d.b(this.d, j, this.a);
                    try {
                        com.fyber.inneractive.sdk.player.c.d.f a2 = this.e.a(bVar2, this.d.a());
                        if (this.i) {
                            a2.a(j, this.j);
                            this.i = false;
                        }
                        while (i == 0 && !this.h) {
                            this.f.c();
                            i = a2.a(bVar2, this.g);
                            if (bVar2.c() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED + j) {
                                j = bVar2.c();
                                this.f.b();
                                a.this.h.post(a.this.g);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.g.a = bVar2.c();
                        }
                        t.a(this.d);
                    } catch (Throwable th) {
                        th = th;
                        bVar = bVar2;
                        if (i != 1 && bVar != null) {
                            this.g.a = bVar.c();
                        }
                        t.a(this.d);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {
        com.fyber.inneractive.sdk.player.c.d.f a;
        private final com.fyber.inneractive.sdk.player.c.d.f[] b;
        private final com.fyber.inneractive.sdk.player.c.d.h c;

        public b(com.fyber.inneractive.sdk.player.c.d.f[] fVarArr, com.fyber.inneractive.sdk.player.c.d.h hVar) {
            this.b = fVarArr;
            this.c = hVar;
        }

        public final com.fyber.inneractive.sdk.player.c.d.f a(com.fyber.inneractive.sdk.player.c.d.g gVar, Uri uri) throws IOException, InterruptedException {
            com.fyber.inneractive.sdk.player.c.d.f fVar = this.a;
            if (fVar != null) {
                return fVar;
            }
            com.fyber.inneractive.sdk.player.c.d.f[] fVarArr = this.b;
            int length = fVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.fyber.inneractive.sdk.player.c.d.f fVar2 = fVarArr[i];
                try {
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    gVar.a();
                    throw th;
                }
                if (fVar2.a(gVar)) {
                    this.a = fVar2;
                    gVar.a();
                    break;
                }
                continue;
                gVar.a();
                i++;
            }
            com.fyber.inneractive.sdk.player.c.d.f fVar3 = this.a;
            if (fVar3 == null) {
                throw new j("None of the available extractors (" + t.a(this.b) + ") could read the stream.", uri);
            }
            fVar3.a(this.c);
            return this.a;
        }
    }
}
