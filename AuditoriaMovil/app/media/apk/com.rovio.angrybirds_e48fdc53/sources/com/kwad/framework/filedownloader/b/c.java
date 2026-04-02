package com.kwad.framework.filedownloader.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.kwad.framework.filedownloader.b.a;
import com.kwad.framework.filedownloader.f.f;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class c implements a {
    private volatile Thread ace;
    private Handler handler;
    private volatile List<Integer> acc = new CopyOnWriteArrayList();
    private AtomicInteger acd = new AtomicInteger();
    private final b abZ = new b();
    private final d aca = new d();
    private final long acb = com.kwad.framework.filedownloader.f.e.vR().aeW;

    public c() {
        HandlerThread handlerThread = new HandlerThread(f.bt("RemitHandoverToDB"), 10);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: com.kwad.framework.filedownloader.b.c.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    if (c.this.ace != null) {
                        LockSupport.unpark(c.this.ace);
                        c.a(c.this, (Thread) null);
                    }
                    return false;
                }
                try {
                    c.this.acd.set(i);
                    c.this.bk(i);
                    c.this.acc.add(Integer.valueOf(i));
                    return false;
                } finally {
                    c.this.acd.set(0);
                    if (c.this.ace != null) {
                        LockSupport.unpark(c.this.ace);
                        c.a(c.this, (Thread) null);
                    }
                }
            }
        });
    }

    static /* synthetic */ Thread a(c cVar, Thread thread) {
        cVar.ace = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bk(int i) {
        this.aca.b(this.abZ.bf(i));
        List<com.kwad.framework.filedownloader.d.a> bg = this.abZ.bg(i);
        this.aca.bh(i);
        for (com.kwad.framework.filedownloader.d.a aVar : bg) {
            this.aca.a(aVar);
        }
    }

    private boolean bl(int i) {
        return !this.acc.contains(Integer.valueOf(i));
    }

    private void bm(int i) {
        this.handler.removeMessages(i);
        if (this.acd.get() != i) {
            bk(i);
            return;
        }
        this.ace = Thread.currentThread();
        this.handler.sendEmptyMessage(0);
        LockSupport.park();
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, int i2, long j) {
        this.abZ.a(i, i2, j);
        if (bl(i)) {
            return;
        }
        this.aca.a(i, i2, j);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, long j, String str, String str2) {
        this.abZ.a(i, j, str, str2);
        if (bl(i)) {
            return;
        }
        this.aca.a(i, j, str, str2);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, String str, long j, long j2, int i2) {
        this.abZ.a(i, str, j, j2, i2);
        if (bl(i)) {
            return;
        }
        this.aca.a(i, str, j, j2, i2);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, Throwable th) {
        this.abZ.a(i, th);
        if (bl(i)) {
            return;
        }
        this.aca.a(i, th);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i, Throwable th, long j) {
        this.abZ.a(i, th, j);
        if (bl(i)) {
            bm(i);
        }
        this.aca.a(i, th, j);
        this.acc.remove(Integer.valueOf(i));
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(com.kwad.framework.filedownloader.d.a aVar) {
        this.abZ.a(aVar);
        if (bl(aVar.getId())) {
            return;
        }
        this.aca.a(aVar);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(com.kwad.framework.filedownloader.d.c cVar) {
        this.abZ.b(cVar);
        if (bl(cVar.getId())) {
            return;
        }
        this.aca.b(cVar);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void be(int i) {
        this.handler.sendEmptyMessageDelayed(i, this.acb);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.d.c bf(int i) {
        return this.abZ.bf(i);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final List<com.kwad.framework.filedownloader.d.a> bg(int i) {
        return this.abZ.bg(i);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bh(int i) {
        this.abZ.bh(i);
        if (bl(i)) {
            return;
        }
        this.aca.bh(i);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final boolean bi(int i) {
        this.aca.bi(i);
        return this.abZ.bi(i);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bj(int i) {
        this.abZ.bj(i);
        if (bl(i)) {
            return;
        }
        this.aca.bj(i);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void c(int i, long j) {
        this.abZ.c(i, j);
        if (bl(i)) {
            return;
        }
        this.aca.c(i, j);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void clear() {
        this.abZ.clear();
        this.aca.clear();
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void d(int i, long j) {
        this.abZ.d(i, j);
        if (bl(i)) {
            this.handler.removeMessages(i);
            if (this.acd.get() == i) {
                this.ace = Thread.currentThread();
                this.handler.sendEmptyMessage(0);
                LockSupport.park();
            }
            this.acc.remove(Integer.valueOf(i));
        }
        this.aca.d(i, j);
        this.acc.remove(Integer.valueOf(i));
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void e(int i, long j) {
        this.abZ.e(i, j);
        if (bl(i)) {
            bm(i);
        }
        this.aca.e(i, j);
        this.acc.remove(Integer.valueOf(i));
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void q(int i, int i2) {
        this.abZ.q(i, i2);
        if (bl(i)) {
            return;
        }
        this.aca.q(i, i2);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final a.InterfaceC0228a uk() {
        return this.aca.a(this.abZ.abW, this.abZ.abX);
    }
}
