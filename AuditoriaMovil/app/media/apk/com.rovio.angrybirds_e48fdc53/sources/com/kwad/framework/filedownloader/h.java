package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class h {
    private final ArrayList<a.InterfaceC0227a> abj;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        private static final h abk = new h((byte) 0);
    }

    private h() {
        this.abj = new ArrayList<>();
    }

    /* synthetic */ h(byte b) {
        this();
    }

    public static h tG() {
        return a.abk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(a.InterfaceC0227a interfaceC0227a) {
        return this.abj.isEmpty() || !this.abj.contains(interfaceC0227a);
    }

    public final boolean a(a.InterfaceC0227a interfaceC0227a, MessageSnapshot messageSnapshot) {
        boolean remove;
        byte ta = messageSnapshot.ta();
        synchronized (this.abj) {
            remove = this.abj.remove(interfaceC0227a);
        }
        if (com.kwad.framework.filedownloader.f.d.aeU && this.abj.size() == 0) {
            com.kwad.framework.filedownloader.f.d.e(this, "remove %s left %d %d", interfaceC0227a, Byte.valueOf(ta), Integer.valueOf(this.abj.size()));
        }
        if (remove) {
            t ty = interfaceC0227a.tj().ty();
            if (ta == -4) {
                ty.l(messageSnapshot);
            } else if (ta == -3) {
                ty.j(com.kwad.framework.filedownloader.message.f.t(messageSnapshot));
            } else if (ta == -2) {
                ty.n(messageSnapshot);
            } else if (ta == -1) {
                ty.m(messageSnapshot);
            }
        } else {
            com.kwad.framework.filedownloader.f.d.a(this, "remove error, not exist: %s %d", interfaceC0227a, Byte.valueOf(ta));
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int aU(int i) {
        int i2;
        synchronized (this.abj) {
            Iterator<a.InterfaceC0227a> it = this.abj.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (it.next().aT(i)) {
                    i2++;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<a.InterfaceC0227a> aV(int i) {
        byte ta;
        ArrayList arrayList = new ArrayList();
        synchronized (this.abj) {
            Iterator<a.InterfaceC0227a> it = this.abj.iterator();
            while (it.hasNext()) {
                a.InterfaceC0227a next = it.next();
                if (next.aT(i) && !next.isOver() && (ta = next.ti().ta()) != 0 && ta != 10) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<a.InterfaceC0227a> aW(int i) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.abj) {
            Iterator<a.InterfaceC0227a> it = this.abj.iterator();
            while (it.hasNext()) {
                a.InterfaceC0227a next = it.next();
                if (next.aT(i) && !next.isOver()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(a.InterfaceC0227a interfaceC0227a) {
        if (!interfaceC0227a.ti().sT()) {
            interfaceC0227a.tl();
        }
        if (interfaceC0227a.tj().ty().tL()) {
            c(interfaceC0227a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(a.InterfaceC0227a interfaceC0227a) {
        if (interfaceC0227a.tm()) {
            return;
        }
        synchronized (this.abj) {
            if (this.abj.contains(interfaceC0227a)) {
                com.kwad.framework.filedownloader.f.d.d(this, "already has %s", interfaceC0227a);
            } else {
                interfaceC0227a.tn();
                this.abj.add(interfaceC0227a);
                if (com.kwad.framework.filedownloader.f.d.aeU) {
                    com.kwad.framework.filedownloader.f.d.e(this, "add list in all %s %d %d", interfaceC0227a, Byte.valueOf(interfaceC0227a.ti().ta()), Integer.valueOf(this.abj.size()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(List<a.InterfaceC0227a> list) {
        synchronized (this.abj) {
            Iterator<a.InterfaceC0227a> it = this.abj.iterator();
            while (it.hasNext()) {
                a.InterfaceC0227a next = it.next();
                if (!list.contains(next)) {
                    list.add(next);
                }
            }
            this.abj.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int size() {
        return this.abj.size();
    }
}
