package com.kwad.framework.filedownloader.services;

import com.kwad.framework.filedownloader.a.c;
import com.kwad.framework.filedownloader.e.b;
import com.kwad.framework.filedownloader.f.c;
/* loaded from: classes.dex */
public final class c {
    private final b aex;

    /* loaded from: classes.dex */
    public interface a {
        c.b uy();
    }

    /* loaded from: classes.dex */
    public static class b {
        c.e aeA;
        c.b aeB;
        a aeC;
        c.a aeD;
        c.d aeE;
        c.InterfaceC0233c aey;
        Integer aez;

        public final b a(c.b bVar) {
            this.aeB = bVar;
            return this;
        }

        public final b a(a aVar) {
            this.aeC = aVar;
            return this;
        }

        public final b bC(int i) {
            this.aez = Integer.MAX_VALUE;
            return this;
        }

        public final String toString() {
            return com.kwad.framework.filedownloader.f.f.b("component: database[%s], maxNetworkCount[%s], outputStream[%s], connection[%s], connectionCountAdapter[%s]", this.aey, this.aez, this.aeA, this.aeB, this.aeD);
        }
    }

    public c() {
        this.aex = null;
    }

    public c(b bVar) {
        this.aex = bVar;
    }

    private static c.d vA() {
        return new com.kwad.framework.filedownloader.services.b();
    }

    private static int vB() {
        return com.kwad.framework.filedownloader.f.e.vR().aeZ;
    }

    private static com.kwad.framework.filedownloader.b.a vC() {
        return new com.kwad.framework.filedownloader.b.c();
    }

    private static c.e vD() {
        return new b.a();
    }

    private static c.b vE() {
        return new c.b();
    }

    private static c.a vF() {
        return new com.kwad.framework.filedownloader.a.a();
    }

    public final int uv() {
        Integer num;
        b bVar = this.aex;
        if (bVar != null && (num = bVar.aez) != null) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "initial FileDownloader manager with the customize maxNetworkThreadCount: %d", num);
            }
            return com.kwad.framework.filedownloader.f.e.bG(num.intValue());
        }
        return vB();
    }

    public final com.kwad.framework.filedownloader.b.a vv() {
        b bVar = this.aex;
        if (bVar == null || bVar.aey == null) {
            return vC();
        }
        com.kwad.framework.filedownloader.b.a vQ = this.aex.aey.vQ();
        if (vQ != null) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "initial FileDownloader manager with the customize database: %s", vQ);
            }
            return vQ;
        }
        return vC();
    }

    public final c.e vw() {
        c.e eVar;
        b bVar = this.aex;
        if (bVar != null && (eVar = bVar.aeA) != null) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "initial FileDownloader manager with the customize output stream: %s", eVar);
            }
            return eVar;
        }
        return vD();
    }

    public final c.b vx() {
        c.b uy;
        b bVar = this.aex;
        if (bVar == null) {
            return vE();
        }
        a aVar = bVar.aeC;
        return (aVar == null || (uy = aVar.uy()) == null) ? vE() : uy;
    }

    public final c.a vy() {
        c.a aVar;
        b bVar = this.aex;
        if (bVar != null && (aVar = bVar.aeD) != null) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "initial FileDownloader manager with the customize connection count adapter: %s", aVar);
            }
            return aVar;
        }
        return vF();
    }

    public final c.d vz() {
        c.d dVar;
        b bVar = this.aex;
        if (bVar != null && (dVar = bVar.aeE) != null) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "initial FileDownloader manager with the customize id generator: %s", dVar);
            }
            return dVar;
        }
        return vA();
    }
}
