package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.x;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
final class q {
    private final b abE = new b();

    /* loaded from: classes.dex */
    static class a {
        private static final q abF = new q();

        static {
            com.kwad.framework.filedownloader.message.e.vj().a(new aa());
        }
    }

    /* loaded from: classes.dex */
    static class b {
        private ThreadPoolExecutor abG;
        private LinkedBlockingQueue<Runnable> abH;

        b() {
            init();
        }

        private void init() {
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
            this.abH = linkedBlockingQueue;
            this.abG = com.kwad.framework.filedownloader.f.b.a(3, linkedBlockingQueue, "LauncherTask");
        }

        public final void b(x.b bVar) {
            this.abH.remove(bVar);
        }

        public final void c(x.b bVar) {
            this.abG.execute(new c(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        private final x.b abI;
        private boolean abJ = false;

        c(x.b bVar) {
            this.abI = bVar;
        }

        public final boolean equals(Object obj) {
            return super.equals(obj) || obj == this.abI;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.abJ) {
                return;
            }
            this.abI.start();
        }
    }

    q() {
    }

    public static q tX() {
        return a.abF;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(x.b bVar) {
        this.abE.c(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(x.b bVar) {
        this.abE.b(bVar);
    }
}
