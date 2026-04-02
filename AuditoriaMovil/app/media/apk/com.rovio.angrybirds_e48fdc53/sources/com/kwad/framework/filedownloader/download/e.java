package com.kwad.framework.filedownloader.download;

import android.os.SystemClock;
import java.io.IOException;
/* loaded from: classes.dex */
public final class e {
    private final String Tv;
    private final com.kwad.framework.filedownloader.b.a acD;
    private final boolean acL;
    private final int aco;
    private final long acw;
    long acx;
    private final long acy;
    private final c adD;
    private final com.kwad.framework.filedownloader.a.b adE;
    private com.kwad.framework.filedownloader.e.a adF;
    private volatile long adG;
    private volatile long adH;
    private final f adl;
    private final int adn;
    private final long contentLength;
    private volatile boolean kW;

    /* loaded from: classes.dex */
    public static class a {
        String Tv;
        Integer acu;
        com.kwad.framework.filedownloader.download.a acv;
        com.kwad.framework.filedownloader.a.b adE;
        c adI;
        Boolean adi;
        f adl;
        Integer adp;

        public final a a(c cVar) {
            this.adI = cVar;
            return this;
        }

        public final a aY(boolean z) {
            this.adi = Boolean.valueOf(z);
            return this;
        }

        public final a b(f fVar) {
            this.adl = fVar;
            return this;
        }

        public final a bh(String str) {
            this.Tv = str;
            return this;
        }

        public final a bq(int i) {
            this.adp = Integer.valueOf(i);
            return this;
        }

        public final a br(int i) {
            this.acu = Integer.valueOf(i);
            return this;
        }

        public final a c(com.kwad.framework.filedownloader.download.a aVar) {
            this.acv = aVar;
            return this;
        }

        public final a d(com.kwad.framework.filedownloader.a.b bVar) {
            this.adE = bVar;
            return this;
        }

        public final e uW() {
            com.kwad.framework.filedownloader.a.b bVar;
            com.kwad.framework.filedownloader.download.a aVar;
            Integer num;
            if (this.adi == null || (bVar = this.adE) == null || (aVar = this.acv) == null || this.adl == null || this.Tv == null || (num = this.acu) == null || this.adp == null) {
                throw new IllegalArgumentException();
            }
            return new e(bVar, aVar, this.adI, num.intValue(), this.adp.intValue(), this.adi.booleanValue(), this.adl, this.Tv, (byte) 0);
        }
    }

    private e(com.kwad.framework.filedownloader.a.b bVar, com.kwad.framework.filedownloader.download.a aVar, c cVar, int i, int i2, boolean z, f fVar, String str) {
        this.adG = 0L;
        this.adH = 0L;
        this.adl = fVar;
        this.Tv = str;
        this.adE = bVar;
        this.acL = z;
        this.adD = cVar;
        this.adn = i2;
        this.aco = i;
        this.acD = b.us().uu();
        this.acw = aVar.acw;
        this.acy = aVar.acy;
        this.acx = aVar.acx;
        this.contentLength = aVar.contentLength;
    }

    /* synthetic */ e(com.kwad.framework.filedownloader.a.b bVar, com.kwad.framework.filedownloader.download.a aVar, c cVar, int i, int i2, boolean z, f fVar, String str, byte b) {
        this(bVar, aVar, cVar, i, i2, z, fVar, str);
    }

    private void sync() {
        boolean z;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.adF.vM();
            z = true;
        } catch (IOException e) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e);
            }
            z = false;
        }
        if (z) {
            if (this.adD != null) {
                this.acD.a(this.aco, this.adn, this.acx);
            } else {
                this.adl.uE();
            }
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.aco), Integer.valueOf(this.adn), Long.valueOf(this.acx), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    private void uV() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (com.kwad.framework.filedownloader.f.f.g(this.acx - this.adG, elapsedRealtime - this.adH)) {
            sync();
            this.adG = this.acx;
            this.adH = elapsedRealtime;
        }
    }

    public final void pause() {
        this.kW = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x011c, code lost:
        if (r10 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
        sync();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
        com.kwad.sdk.crash.utils.b.closeQuietly(r9);
        com.kwad.sdk.crash.utils.b.closeQuietly(r10);
        r6 = r16.acx - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
        if (r2 == (-1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
        if (r2 != r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0172, code lost:
        throw new com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException(com.kwad.framework.filedownloader.f.f.b("fetched length[%d] != content length[%d], range[%d, %d) offset[%d] fetch begin offset", java.lang.Long.valueOf(r6), java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r16.acw), java.lang.Long.valueOf(r16.acy), java.lang.Long.valueOf(r16.acx), java.lang.Long.valueOf(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0173, code lost:
        r16.adl.a(r16.adD, r16.acw, r16.acy);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017e, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.e.run():void");
    }
}
