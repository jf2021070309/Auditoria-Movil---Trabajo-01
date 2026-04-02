package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import com.kwad.framework.filedownloader.x;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
final class k implements t {
    private a.InterfaceC0227a abu;
    private a.c abv;
    private Queue<MessageSnapshot> abw;
    private boolean abx = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(a.InterfaceC0227a interfaceC0227a, a.c cVar) {
        a(interfaceC0227a, cVar);
    }

    private void a(a.InterfaceC0227a interfaceC0227a, a.c cVar) {
        this.abu = interfaceC0227a;
        this.abv = cVar;
        this.abw = new LinkedBlockingQueue();
    }

    private void aX(int i) {
        if (com.kwad.framework.filedownloader.d.d.bA(i)) {
            if (!this.abw.isEmpty()) {
                MessageSnapshot peek = this.abw.peek();
                com.kwad.framework.filedownloader.f.d.d(this, "the messenger[%s](with id[%d]) has already accomplished all his job, but there still are some messages in parcel queue[%d] queue-top-status[%d]", this, Integer.valueOf(peek.getId()), Integer.valueOf(this.abw.size()), Byte.valueOf(peek.ta()));
            }
            this.abu = null;
        }
    }

    private void o(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify completed %s", this.abu);
        }
        this.abv.tr();
        p(messageSnapshot);
    }

    private void p(MessageSnapshot messageSnapshot) {
        a.InterfaceC0227a interfaceC0227a = this.abu;
        if (interfaceC0227a == null) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "occur this case, it would be the host task of this messenger has been over(paused/warn/completed/error) on the other thread before receiving the snapshot(id[%d], status[%d])", Integer.valueOf(messageSnapshot.getId()), Byte.valueOf(messageSnapshot.ta()));
            }
        } else if (!this.abx && interfaceC0227a.ti().sX() != null) {
            this.abw.offer(messageSnapshot);
            j.tI().a(this);
        } else {
            if ((l.isValid() || this.abu.tp()) && messageSnapshot.ta() == 4) {
                this.abv.tr();
            }
            aX(messageSnapshot.ta());
        }
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void b(a.InterfaceC0227a interfaceC0227a, a.c cVar) {
        if (this.abu != null) {
            throw new IllegalStateException(com.kwad.framework.filedownloader.f.f.b("the messenger is working, can't re-appointment for %s", interfaceC0227a));
        }
        a(interfaceC0227a, cVar);
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void f(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify pending %s", this.abu);
        }
        p(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void g(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify started %s", this.abu);
        }
        p(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void h(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify connected %s", this.abu);
        }
        p(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void i(MessageSnapshot messageSnapshot) {
        a ti = this.abu.ti();
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify progress %s %d %d", ti, Long.valueOf(ti.sY()), Long.valueOf(ti.sZ()));
        }
        if (ti.sU() > 0) {
            p(messageSnapshot);
        } else if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify progress but client not request notify %s", this.abu);
        }
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void j(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify block completed %s %s", this.abu, Thread.currentThread().getName());
        }
        p(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void k(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            a ti = this.abu.ti();
            com.kwad.framework.filedownloader.f.d.c(this, "notify retry %s %d %d %s", this.abu, Integer.valueOf(ti.td()), Integer.valueOf(ti.te()), ti.tc());
        }
        p(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void l(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify warn %s", this.abu);
        }
        this.abv.tr();
        p(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void m(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            a.InterfaceC0227a interfaceC0227a = this.abu;
            com.kwad.framework.filedownloader.f.d.c(this, "notify error %s %s", interfaceC0227a, interfaceC0227a.ti().tc());
        }
        this.abv.tr();
        p(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void n(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify paused %s", this.abu);
        }
        this.abv.tr();
        p(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.t
    public final boolean tL() {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "notify begin %s", this.abu);
        }
        if (this.abu == null) {
            com.kwad.framework.filedownloader.f.d.d(this, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(this.abw.size()));
            return false;
        }
        this.abv.onBegin();
        return true;
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void tM() {
        if (this.abx) {
            return;
        }
        MessageSnapshot poll = this.abw.poll();
        byte ta = poll.ta();
        a.InterfaceC0227a interfaceC0227a = this.abu;
        if (interfaceC0227a == null) {
            return;
        }
        a ti = interfaceC0227a.ti();
        i sX = ti.sX();
        x.a tj = interfaceC0227a.tj();
        aX(ta);
        if (sX == null) {
            return;
        }
        if (ta == 4) {
            try {
                sX.b(ti);
                o(((com.kwad.framework.filedownloader.message.a) poll).vb());
                return;
            } catch (Throwable th) {
                m(tj.g(th));
                return;
            }
        }
        g gVar = sX instanceof g ? (g) sX : null;
        if (ta == -4) {
            sX.d(ti);
        } else if (ta == -3) {
            sX.c(ti);
        } else if (ta == -2) {
            if (gVar == null) {
                sX.c(ti, poll.vc(), poll.vd());
                return;
            }
            poll.vg();
            poll.ve();
        } else if (ta == -1) {
            sX.a(ti, poll.vh());
        } else if (ta == 1) {
            if (gVar == null) {
                sX.a(ti, poll.vc(), poll.vd());
                return;
            }
            poll.vg();
            poll.ve();
        } else if (ta == 2) {
            if (gVar == null) {
                sX.a(ti, poll.getEtag(), poll.uU(), ti.getSmallFileSoFarBytes(), poll.vd());
                return;
            }
            poll.getEtag();
            poll.uU();
            poll.ve();
        } else if (ta == 3) {
            if (gVar != null) {
                poll.vg();
            } else {
                sX.b(ti, poll.vc(), ti.getSmallFileTotalBytes());
            }
        } else if (ta != 5) {
            if (ta != 6) {
                return;
            }
            sX.a(ti);
        } else {
            poll.vh();
            poll.te();
            if (gVar != null) {
                poll.vg();
            } else {
                poll.vc();
            }
        }
    }

    @Override // com.kwad.framework.filedownloader.t
    public final boolean tN() {
        return this.abu.ti().tf();
    }

    @Override // com.kwad.framework.filedownloader.t
    public final boolean tO() {
        return this.abw.peek().ta() == 4;
    }

    @Override // com.kwad.framework.filedownloader.t
    public final void tP() {
        this.abx = true;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        a.InterfaceC0227a interfaceC0227a = this.abu;
        objArr[0] = Integer.valueOf(interfaceC0227a == null ? -1 : interfaceC0227a.ti().getId());
        objArr[1] = super.toString();
        return com.kwad.framework.filedownloader.f.f.b("%d:%s", objArr);
    }
}
