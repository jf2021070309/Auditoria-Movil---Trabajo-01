package com.amazon.aps.iva.z90;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.z90.f;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: SntpService.kt */
/* loaded from: classes4.dex */
public final class j implements i {
    public final AtomicReference<a> a = new AtomicReference<>(a.IDLE);
    public final AtomicLong b = new AtomicLong(0);
    public final ExecutorService c = Executors.newSingleThreadExecutor(k.a);
    public final f d;
    public final com.amazon.aps.iva.x90.a e;
    public final g f;
    public final com.amazon.aps.iva.x90.e g;
    public final List<String> h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;

    /* compiled from: SntpService.kt */
    /* loaded from: classes4.dex */
    public enum a {
        IDLE,
        SYNCING,
        STOPPED
    }

    /* compiled from: SntpService.kt */
    /* loaded from: classes4.dex */
    public static final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[LOOP:0: B:3:0x000d->B:51:0x010d, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0111 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 274
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.z90.j.b.run():void");
        }
    }

    public j(f fVar, x xVar, h hVar, com.amazon.aps.iva.x90.e eVar, List list, long j, long j2, long j3, long j4) {
        this.d = fVar;
        this.e = xVar;
        this.f = hVar;
        this.g = eVar;
        this.h = list;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = j4;
    }

    @Override // com.amazon.aps.iva.z90.i
    public final com.amazon.aps.iva.x90.d a() {
        boolean z;
        c();
        g gVar = this.f;
        f.b bVar = gVar.get();
        boolean z2 = false;
        if (this.a.get() == a.IDLE && bVar != null) {
            long j = bVar.a - bVar.b;
            com.amazon.aps.iva.x90.a aVar = bVar.d;
            if (Math.abs(j - (aVar.a() - aVar.c())) < 1000) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = true;
            }
        }
        if (z2) {
            gVar.clear();
            bVar = null;
        }
        AtomicLong atomicLong = this.b;
        com.amazon.aps.iva.x90.a aVar2 = this.e;
        long j2 = this.j;
        if (bVar == null) {
            if (aVar2.c() - atomicLong.get() >= j2) {
                b();
            }
            return null;
        }
        com.amazon.aps.iva.x90.a aVar3 = bVar.d;
        long c = aVar3.c();
        long j3 = bVar.b;
        long j4 = c - j3;
        if (j4 >= this.k && aVar2.c() - atomicLong.get() >= j2) {
            b();
        }
        return new com.amazon.aps.iva.x90.d(Long.valueOf(j4), (aVar3.c() - j3) + bVar.a + bVar.c);
    }

    @Override // com.amazon.aps.iva.z90.i
    public final void b() {
        c();
        if (this.a.get() != a.SYNCING) {
            this.c.submit(new b());
        }
    }

    public final void c() {
        if (this.a.get() != a.STOPPED) {
            return;
        }
        throw new IllegalStateException("Service already shutdown");
    }

    @Override // com.amazon.aps.iva.z90.i
    public final void shutdown() {
        c();
        this.a.set(a.STOPPED);
        this.c.shutdown();
    }
}
