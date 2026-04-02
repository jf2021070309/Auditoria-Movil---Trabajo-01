package com.kwad.framework.filedownloader.download;

import com.kwad.framework.filedownloader.a.c;
import com.kwad.framework.filedownloader.f.c;
import com.kwad.framework.filedownloader.services.c;
import java.io.File;
/* loaded from: classes.dex */
public final class b {
    private c.a acA;
    private c.b acB;
    private c.e acC;
    private volatile com.kwad.framework.filedownloader.b.a acD;
    private c.d acE;
    private com.kwad.framework.filedownloader.services.c acz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        private static final b acF = new b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:37:0x00bf
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static void a(com.kwad.framework.filedownloader.b.a.InterfaceC0228a r25) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.b.a(com.kwad.framework.filedownloader.b.a$a):void");
    }

    private com.kwad.framework.filedownloader.services.c uA() {
        com.kwad.framework.filedownloader.services.c cVar = this.acz;
        if (cVar != null) {
            return cVar;
        }
        synchronized (this) {
            if (this.acz == null) {
                this.acz = new com.kwad.framework.filedownloader.services.c();
            }
        }
        return this.acz;
    }

    public static b us() {
        return a.acF;
    }

    private c.a ux() {
        c.a aVar = this.acA;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            if (this.acA == null) {
                this.acA = uA().vy();
            }
        }
        return this.acA;
    }

    private c.b uy() {
        c.b bVar = this.acB;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            if (this.acB == null) {
                this.acB = uA().vx();
            }
        }
        return this.acB;
    }

    private c.e uz() {
        c.e eVar = this.acC;
        if (eVar != null) {
            return eVar;
        }
        synchronized (this) {
            if (this.acC == null) {
                this.acC = uA().vw();
            }
        }
        return this.acC;
    }

    public final int a(int i, String str, String str2, long j) {
        return ux().H(j);
    }

    public final void a(c.b bVar) {
        synchronized (this) {
            this.acz = new com.kwad.framework.filedownloader.services.c(bVar);
            this.acB = null;
            this.acC = null;
            this.acD = null;
            this.acE = null;
        }
    }

    public final com.kwad.framework.filedownloader.e.a b(File file) {
        return uz().c(file);
    }

    public final void b(c.b bVar) {
        synchronized (this) {
            this.acz = new com.kwad.framework.filedownloader.services.c(bVar);
        }
    }

    public final com.kwad.framework.filedownloader.a.b bd(String str) {
        try {
            return uy().ba(str);
        } catch (Throwable th) {
            c.b bVar = new c.b();
            this.acB = bVar;
            return bVar.ba(str);
        }
    }

    public final c.d ut() {
        c.d dVar = this.acE;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            if (this.acE == null) {
                this.acE = uA().vz();
            }
        }
        return this.acE;
    }

    public final synchronized com.kwad.framework.filedownloader.b.a uu() {
        if (this.acD != null) {
            return this.acD;
        }
        this.acD = uA().vv();
        a(this.acD.uk());
        return this.acD;
    }

    public final int uv() {
        return uA().uv();
    }

    public final boolean uw() {
        uz();
        return true;
    }
}
