package com.kwad.framework.filedownloader;

import android.text.TextUtils;
import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.d;
import com.kwad.framework.filedownloader.x;
import java.io.File;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c implements com.kwad.framework.filedownloader.a, a.InterfaceC0227a, d.a {
    private ArrayList<Object> aaA;
    private String aaB;
    private String aaC;
    private boolean aaD;
    private com.kwad.framework.filedownloader.d.b aaE;
    private i aaF;
    private Object aaG;
    private final Object aaP;
    private final x aax;
    private final x.a aay;
    private int aaz;
    private final String mUrl;
    private int aaH = 0;
    private boolean aaI = false;
    private boolean aaJ = false;
    private int aaK = 100;
    private int aaL = 10;
    private boolean aaM = false;
    volatile int aaN = 0;
    private boolean aaO = false;
    private final Object aaQ = new Object();
    private volatile boolean aaR = false;

    /* loaded from: classes.dex */
    static final class a implements a.b {
        private final c aaS;

        private a(c cVar) {
            this.aaS = cVar;
            c.a(cVar, true);
        }

        /* synthetic */ a(c cVar, byte b) {
            this(cVar);
        }

        @Override // com.kwad.framework.filedownloader.a.b
        public final int tq() {
            int id = this.aaS.getId();
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "add the task[%d] to the queue", Integer.valueOf(id));
            }
            h.tG().c(this.aaS);
            return id;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str) {
        this.mUrl = str;
        Object obj = new Object();
        this.aaP = obj;
        d dVar = new d(this, obj);
        this.aax = dVar;
        this.aay = dVar;
    }

    static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.aaO = true;
        return true;
    }

    private boolean ts() {
        return this.aax.ta() != 0;
    }

    private int tt() {
        if (!ts()) {
            if (!sT()) {
                tl();
            }
            this.aax.tz();
            return getId();
        } else if (isRunning()) {
            throw new IllegalStateException(com.kwad.framework.filedownloader.f.f.b("This task is running %d, if you want to start the same task, please create a new one by FileDownloader.create", Integer.valueOf(getId())));
        } else {
            throw new IllegalStateException("This task is dirty to restart, If you want to reuse this task, please invoke #reuse method manually and retry to restart again." + this.aax.toString());
        }
    }

    private void tu() {
        if (this.aaE == null) {
            synchronized (this.aaQ) {
                if (this.aaE == null) {
                    this.aaE = new com.kwad.framework.filedownloader.d.b();
                }
            }
        }
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a a(i iVar) {
        this.aaF = iVar;
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "setListener %s", iVar);
        }
        return this;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a aS(int i) {
        this.aaH = 3;
        return this;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a aT(boolean z) {
        this.aaM = true;
        return this;
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final boolean aT(int i) {
        return getId() == i;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a aU(boolean z) {
        this.aaI = true;
        return this;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a aV(String str) {
        return b(str, false);
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a aV(boolean z) {
        this.aaJ = z;
        return this;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a aW(String str) {
        if (this.aaE == null) {
            synchronized (this.aaQ) {
                if (this.aaE == null) {
                    return this;
                }
            }
        }
        this.aaE.bi(str);
        return this;
    }

    @Override // com.kwad.framework.filedownloader.d.a
    public final void aX(String str) {
        this.aaC = str;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a b(String str, boolean z) {
        this.aaB = str;
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "setPath %s", str);
        }
        this.aaD = z;
        this.aaC = z ? null : new File(str).getName();
        return this;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean cancel() {
        return pause();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a e(Object obj) {
        this.aaG = obj;
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "setTag %s", obj);
        }
        return this;
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final void free() {
        this.aax.free();
        if (h.tG().a(this)) {
            this.aaR = false;
        }
    }

    @Override // com.kwad.framework.filedownloader.a
    public final String getFilename() {
        return this.aaC;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int getId() {
        int i = this.aaz;
        if (i != 0) {
            return i;
        }
        if (TextUtils.isEmpty(this.aaB) || TextUtils.isEmpty(this.mUrl)) {
            return 0;
        }
        int g = com.kwad.framework.filedownloader.f.f.g(this.mUrl, this.aaB, this.aaD);
        this.aaz = g;
        return g;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final String getPath() {
        return this.aaB;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int getSmallFileSoFarBytes() {
        if (this.aax.tA() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.aax.tA();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int getSmallFileTotalBytes() {
        if (this.aax.getTotalBytes() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) this.aax.getTotalBytes();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int getSpeed() {
        return this.aax.getSpeed();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final long getStatusUpdateTime() {
        return this.aax.getStatusUpdateTime();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final Object getTag() {
        return this.aaG;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final String getTargetFilePath() {
        return com.kwad.framework.filedownloader.f.f.a(getPath(), sW(), getFilename());
    }

    @Override // com.kwad.framework.filedownloader.a
    public final String getUrl() {
        return this.mUrl;
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final boolean isOver() {
        return com.kwad.framework.filedownloader.d.d.bA(ta());
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean isRunning() {
        if (r.tZ().ud().d(this)) {
            return true;
        }
        return com.kwad.framework.filedownloader.d.d.bB(ta());
    }

    @Override // com.kwad.framework.filedownloader.a
    public final com.kwad.framework.filedownloader.a m(String str, String str2) {
        tu();
        this.aaE.o(str, str2);
        return this;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean pause() {
        boolean pause;
        synchronized (this.aaP) {
            pause = this.aax.pause();
        }
        return pause;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final a.b sR() {
        return new a(this, (byte) 0);
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean sS() {
        if (isRunning()) {
            com.kwad.framework.filedownloader.f.d.d(this, "This task[%d] is running, if you want start the same task, please create a new one by FileDownloader#create", Integer.valueOf(getId()));
            return false;
        }
        this.aaN = 0;
        this.aaO = false;
        this.aaR = false;
        this.aax.reset();
        return true;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean sT() {
        return this.aaN != 0;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int sU() {
        return this.aaK;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int sV() {
        return this.aaL;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean sW() {
        return this.aaD;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final i sX() {
        return this.aaF;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final long sY() {
        return this.aax.tA();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final long sZ() {
        return this.aax.getTotalBytes();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int start() {
        if (this.aaO) {
            throw new IllegalStateException("If you start the task manually, it means this task doesn't belong to a queue, so you must not invoke BaseDownloadTask#ready() or InQueueTask#enqueue() before you start() this method. For detail: If this task doesn't belong to a queue, what is just an isolated task, you just need to invoke BaseDownloadTask#start() to start this task, that's all. In other words, If this task doesn't belong to a queue, you must not invoke BaseDownloadTask#ready() method or InQueueTask#enqueue() method before invoke BaseDownloadTask#start(), If you do that and if there is the same listener object to start a queue in another thread, this task may be assembled by the queue, in that case, when you invoke BaseDownloadTask#start() manually to start this task or this task is started by the queue, there is an exception buried in there, because this task object is started two times without declare BaseDownloadTask#reuse() : 1. you invoke BaseDownloadTask#start() manually;  2. the queue start this task automatically.");
        }
        return tt();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final byte ta() {
        return this.aax.ta();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean tb() {
        return this.aaM;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final Throwable tc() {
        return this.aax.tc();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int td() {
        return this.aaH;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final int te() {
        return this.aax.te();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean tf() {
        return this.aaI;
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean tg() {
        return this.aax.tg();
    }

    @Override // com.kwad.framework.filedownloader.a
    public final boolean th() {
        return this.aaJ;
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final com.kwad.framework.filedownloader.a ti() {
        return this;
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final x.a tj() {
        return this.aay;
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final int tk() {
        return this.aaN;
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final void tl() {
        this.aaN = sX() != null ? sX().hashCode() : hashCode();
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final boolean tm() {
        return this.aaR;
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final void tn() {
        this.aaR = true;
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final void to() {
        tt();
    }

    public final String toString() {
        return com.kwad.framework.filedownloader.f.f.b("%d@%s", Integer.valueOf(getId()), super.toString());
    }

    @Override // com.kwad.framework.filedownloader.a.InterfaceC0227a
    public final boolean tp() {
        ArrayList<Object> arrayList = this.aaA;
        return arrayList != null && arrayList.size() > 0;
    }

    @Override // com.kwad.framework.filedownloader.d.a
    public final com.kwad.framework.filedownloader.d.b tv() {
        return this.aaE;
    }

    @Override // com.kwad.framework.filedownloader.d.a
    public final a.InterfaceC0227a tw() {
        return this;
    }

    @Override // com.kwad.framework.filedownloader.d.a
    public final ArrayList<Object> tx() {
        return this.aaA;
    }
}
