package com.kwad.framework.filedownloader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public final class j {
    static int abp = 10;
    static int abq = 5;
    private final Executor abl;
    private final LinkedBlockingQueue<t> abm;
    private final Object abn;
    private final ArrayList<t> abo;
    private final Handler handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {
        private static final j abt = new j((byte) 0);
    }

    /* loaded from: classes.dex */
    static class b implements Handler.Callback {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        private static void a(ArrayList<t> arrayList) {
            Iterator<t> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().tM();
            }
            arrayList.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((t) message.obj).tM();
            } else if (message.what == 2) {
                a((ArrayList) message.obj);
                j.tI().push();
            }
            return true;
        }
    }

    private j() {
        this.abl = com.kwad.framework.filedownloader.f.b.j(5, "BlockCompleted");
        this.abn = new Object();
        this.abo = new ArrayList<>();
        this.handler = new Handler(Looper.getMainLooper(), new b((byte) 0));
        this.abm = new LinkedBlockingQueue<>();
    }

    /* synthetic */ j(byte b2) {
        this();
    }

    private void a(final t tVar, boolean z) {
        if (tVar.tN()) {
            tVar.tM();
        } else if (tVar.tO()) {
            this.abl.execute(new Runnable() { // from class: com.kwad.framework.filedownloader.j.1
                @Override // java.lang.Runnable
                public final void run() {
                    tVar.tM();
                }
            });
        } else {
            if (!tJ() && !this.abm.isEmpty()) {
                synchronized (this.abn) {
                    if (!this.abm.isEmpty()) {
                        Iterator<t> it = this.abm.iterator();
                        while (it.hasNext()) {
                            b(it.next());
                        }
                    }
                    this.abm.clear();
                }
            }
            if (tJ()) {
                c(tVar);
            } else {
                b(tVar);
            }
        }
    }

    private void b(t tVar) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(1, tVar));
    }

    private void c(t tVar) {
        synchronized (this.abn) {
            this.abm.offer(tVar);
        }
        push();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void push() {
        synchronized (this.abn) {
            if (this.abo.isEmpty()) {
                if (this.abm.isEmpty()) {
                    return;
                }
                int i = 0;
                if (tJ()) {
                    int i2 = abp;
                    int min = Math.min(this.abm.size(), abq);
                    while (i < min) {
                        this.abo.add(this.abm.remove());
                        i++;
                    }
                    i = i2;
                } else {
                    this.abm.drainTo(this.abo);
                }
                Handler handler = this.handler;
                handler.sendMessageDelayed(handler.obtainMessage(2, this.abo), i);
            }
        }
    }

    public static j tI() {
        return a.abt;
    }

    private static boolean tJ() {
        return abp > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(t tVar) {
        a(tVar, false);
    }
}
