package com.kwad.sdk.core.videocache;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.kwad.sdk.utils.ao;
import java.io.File;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g {
    private final c awG;
    private final AtomicInteger awK = new AtomicInteger(0);
    private volatile e awL;
    private final List<b> awM;
    private final b awN;
    private final String url;

    /* loaded from: classes.dex */
    static final class a extends Handler implements b {
        private final List<b> awM;
        private final String url;

        public a(String str, List<b> list) {
            super(Looper.getMainLooper());
            this.url = str;
            this.awM = list;
        }

        @Override // com.kwad.sdk.core.videocache.b
        public final void a(File file, int i) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            for (b bVar : this.awM) {
                bVar.a((File) message.obj, message.arg1);
            }
        }
    }

    public g(String str, c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.awM = copyOnWriteArrayList;
        this.url = ao.fF(str);
        this.awG = (c) ao.checkNotNull(cVar);
        this.awN = new a(str, copyOnWriteArrayList);
    }

    private synchronized void DF() {
        this.awL = this.awL == null ? DH() : this.awL;
    }

    private synchronized void DG() {
        if (this.awK.decrementAndGet() <= 0) {
            this.awL.shutdown();
            this.awL = null;
        }
    }

    private e DH() {
        e eVar = new e(new h(this.url, this.awG.aws, this.awG.awt), new com.kwad.sdk.core.videocache.a.b(this.awG.dK(this.url), this.awG.awr));
        eVar.a(this.awN);
        return eVar;
    }

    public final int DC() {
        return this.awK.get();
    }

    public final void a(d dVar, Socket socket) {
        DF();
        try {
            this.awK.incrementAndGet();
            this.awL.a(dVar, socket);
        } finally {
            DG();
        }
    }

    public final void shutdown() {
        this.awM.clear();
        e eVar = this.awL;
        if (eVar != null) {
            eVar.a((b) null);
            eVar.shutdown();
        }
        this.awL = null;
        this.awK.set(0);
    }
}
