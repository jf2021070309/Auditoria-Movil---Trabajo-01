package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class z extends e implements v {
    private final ArrayList<a.InterfaceC0227a> abP = new ArrayList<>();

    @Override // com.kwad.framework.filedownloader.v
    public final boolean d(a.InterfaceC0227a interfaceC0227a) {
        return !this.abP.isEmpty() && this.abP.contains(interfaceC0227a);
    }

    @Override // com.kwad.framework.filedownloader.v
    public final void e(a.InterfaceC0227a interfaceC0227a) {
        if (this.abP.isEmpty()) {
            return;
        }
        synchronized (this.abP) {
            this.abP.remove(interfaceC0227a);
        }
    }

    @Override // com.kwad.framework.filedownloader.v
    public final boolean f(a.InterfaceC0227a interfaceC0227a) {
        r.tZ();
        if (!r.ub()) {
            synchronized (this.abP) {
                r.tZ();
                if (!r.ub()) {
                    if (com.kwad.framework.filedownloader.f.d.aeU) {
                        com.kwad.framework.filedownloader.f.d.c(this, "Waiting for connecting with the downloader service... %d", Integer.valueOf(interfaceC0227a.ti().getId()));
                    }
                    n.tR().am(com.kwad.framework.filedownloader.f.c.vP());
                    if (!this.abP.contains(interfaceC0227a)) {
                        interfaceC0227a.free();
                        this.abP.add(interfaceC0227a);
                    }
                    return true;
                }
            }
        }
        e(interfaceC0227a);
        return false;
    }

    @Override // com.kwad.framework.filedownloader.e
    public final void tB() {
        w uc = r.tZ().uc();
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "The downloader service is connected.", new Object[0]);
        }
        synchronized (this.abP) {
            this.abP.clear();
            ArrayList arrayList = new ArrayList(uc.ug());
            for (a.InterfaceC0227a interfaceC0227a : (List) this.abP.clone()) {
                int tk = interfaceC0227a.tk();
                if (uc.bc(tk)) {
                    interfaceC0227a.ti().sR().tq();
                    if (!arrayList.contains(Integer.valueOf(tk))) {
                        arrayList.add(Integer.valueOf(tk));
                    }
                } else {
                    interfaceC0227a.to();
                }
            }
            uc.m(arrayList);
        }
    }

    @Override // com.kwad.framework.filedownloader.e
    public final void tC() {
        if (tD() != DownloadServiceConnectChangedEvent.ConnectStatus.lost) {
            if (h.tG().size() > 0) {
                com.kwad.framework.filedownloader.f.d.d(this, "file download service has be unbound but the size of active tasks are not empty %d ", Integer.valueOf(h.tG().size()));
                return;
            }
            return;
        }
        w uc = r.tZ().uc();
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "lost the connection to the file download service, and current active task size is %d", Integer.valueOf(h.tG().size()));
        }
        if (h.tG().size() > 0) {
            synchronized (this.abP) {
                h.tG().l(this.abP);
                Iterator<a.InterfaceC0227a> it = this.abP.iterator();
                while (it.hasNext()) {
                    it.next().free();
                }
                uc.uf();
            }
            r.tZ().ua();
        }
    }
}
