package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import com.kwad.framework.filedownloader.s;
import com.kwad.framework.filedownloader.x;
import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class d implements a.c, x, x.a, x.b {
    private final Object aaP;
    private t aaT;
    private final a aaU;
    private volatile long aaW;
    private final s.b aaY;
    private final s.a aaZ;
    private long aba;
    private long abb;
    private int abc;
    private boolean abd;
    private boolean abe;
    private String abf;
    private volatile byte aaV = 0;
    private Throwable aaX = null;
    private boolean abg = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void aX(String str);

        com.kwad.framework.filedownloader.d.b tv();

        a.InterfaceC0227a tw();

        ArrayList<Object> tx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar, Object obj) {
        this.aaP = obj;
        this.aaU = aVar;
        b bVar = new b();
        this.aaY = bVar;
        this.aaZ = bVar;
        this.aaT = new k(aVar.tw(), this);
    }

    private void b(byte b) {
        this.aaV = b;
        this.aaW = System.currentTimeMillis();
    }

    private void e(MessageSnapshot messageSnapshot) {
        com.kwad.framework.filedownloader.a ti = this.aaU.tw().ti();
        byte ta = messageSnapshot.ta();
        b(ta);
        this.abd = messageSnapshot.tg();
        if (ta == -4) {
            this.aaY.reset();
            int aU = h.tG().aU(ti.getId());
            if (aU + ((aU > 1 || !ti.sW()) ? 0 : h.tG().aU(com.kwad.framework.filedownloader.f.f.r(ti.getUrl(), ti.getTargetFilePath()))) <= 1) {
                byte aZ = n.tR().aZ(ti.getId());
                com.kwad.framework.filedownloader.f.d.d(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(ti.getId()), Integer.valueOf(aZ));
                if (com.kwad.framework.filedownloader.d.d.bB(aZ)) {
                    b((byte) 1);
                    this.abb = messageSnapshot.ve();
                    long vg = messageSnapshot.vg();
                    this.aba = vg;
                    this.aaY.start(vg);
                    this.aaT.f(((MessageSnapshot.a) messageSnapshot).vi());
                    return;
                }
            }
            h.tG().a(this.aaU.tw(), messageSnapshot);
        } else if (ta == -3) {
            this.abg = messageSnapshot.vf();
            this.aba = messageSnapshot.ve();
            this.abb = messageSnapshot.ve();
            h.tG().a(this.aaU.tw(), messageSnapshot);
        } else if (ta == -1) {
            this.aaX = messageSnapshot.vh();
            this.aba = messageSnapshot.vg();
            h.tG().a(this.aaU.tw(), messageSnapshot);
        } else if (ta == 1) {
            this.aba = messageSnapshot.vg();
            this.abb = messageSnapshot.ve();
            this.aaT.f(messageSnapshot);
        } else if (ta == 2) {
            this.abb = messageSnapshot.ve();
            this.abe = messageSnapshot.uU();
            this.abf = messageSnapshot.getEtag();
            String fileName = messageSnapshot.getFileName();
            if (fileName != null) {
                if (ti.getFilename() != null) {
                    com.kwad.framework.filedownloader.f.d.d(this, "already has mFilename[%s], but assign mFilename[%s] again", ti.getFilename(), fileName);
                }
                this.aaU.aX(fileName);
            }
            this.aaY.start(this.aba);
            this.aaT.h(messageSnapshot);
        } else if (ta == 3) {
            this.aba = messageSnapshot.vg();
            this.aaY.G(messageSnapshot.vg());
            this.aaT.i(messageSnapshot);
        } else if (ta != 5) {
            if (ta != 6) {
                return;
            }
            this.aaT.g(messageSnapshot);
        } else {
            this.aba = messageSnapshot.vg();
            this.aaX = messageSnapshot.vh();
            this.abc = messageSnapshot.te();
            this.aaY.reset();
            this.aaT.k(messageSnapshot);
        }
    }

    private int getId() {
        return this.aaU.tw().ti().getId();
    }

    private void prepare() {
        File file;
        com.kwad.framework.filedownloader.a ti = this.aaU.tw().ti();
        if (ti.getPath() == null) {
            ti.aV(com.kwad.framework.filedownloader.f.f.bn(ti.getUrl()));
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "save Path is null to %s", ti.getPath());
            }
        }
        if (ti.sW()) {
            file = new File(ti.getPath());
        } else {
            String bs = com.kwad.framework.filedownloader.f.f.bs(ti.getPath());
            if (bs == null) {
                throw new InvalidParameterException(com.kwad.framework.filedownloader.f.f.b("the provided mPath[%s] is invalid, can't find its directory", ti.getPath()));
            }
            file = new File(bs);
        }
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            throw new IOException(com.kwad.framework.filedownloader.f.f.b("Create parent directory failed, please make sure you have permission to create file or directory on the path: %s", file.getAbsolutePath()));
        }
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final boolean a(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.d.d.r(ta(), messageSnapshot.ta())) {
            e(messageSnapshot);
            return true;
        }
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d", Byte.valueOf(this.aaV), Byte.valueOf(ta()), Integer.valueOf(getId()));
        }
        return false;
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final boolean b(MessageSnapshot messageSnapshot) {
        byte ta = ta();
        byte ta2 = messageSnapshot.ta();
        if (-2 == ta && com.kwad.framework.filedownloader.d.d.bB(ta2)) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "High concurrent cause, callback pending, but has already be paused %d", Integer.valueOf(getId()));
            }
            return true;
        } else if (com.kwad.framework.filedownloader.d.d.s(ta, ta2)) {
            e(messageSnapshot);
            return true;
        } else {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d", Byte.valueOf(this.aaV), Byte.valueOf(ta()), Integer.valueOf(getId()));
            }
            return false;
        }
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final boolean c(MessageSnapshot messageSnapshot) {
        if (com.kwad.framework.filedownloader.d.d.f(this.aaU.tw().ti())) {
            e(messageSnapshot);
            return true;
        }
        return false;
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final boolean d(MessageSnapshot messageSnapshot) {
        if (this.aaU.tw().ti().sW() && messageSnapshot.ta() == -4 && ta() == 2) {
            e(messageSnapshot);
            return true;
        }
        return false;
    }

    @Override // com.kwad.framework.filedownloader.x
    public final void free() {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "free the task %d, when the status is %d", Integer.valueOf(getId()), Byte.valueOf(this.aaV));
        }
        b((byte) 0);
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final MessageSnapshot g(Throwable th) {
        b((byte) -1);
        this.aaX = th;
        return com.kwad.framework.filedownloader.message.f.a(getId(), tA(), th);
    }

    @Override // com.kwad.framework.filedownloader.s.a
    public final int getSpeed() {
        return this.aaZ.getSpeed();
    }

    @Override // com.kwad.framework.filedownloader.x
    public final long getStatusUpdateTime() {
        return this.aaW;
    }

    @Override // com.kwad.framework.filedownloader.x
    public final long getTotalBytes() {
        return this.abb;
    }

    @Override // com.kwad.framework.filedownloader.a.c
    public final void onBegin() {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.e(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(ta()));
        }
    }

    @Override // com.kwad.framework.filedownloader.x
    public final boolean pause() {
        if (com.kwad.framework.filedownloader.d.d.bA(ta())) {
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.c(this, "High concurrent cause, Already is over, can't pause again, %d %d", Byte.valueOf(ta()), Integer.valueOf(this.aaU.tw().ti().getId()));
            }
            return false;
        }
        b((byte) -2);
        a.InterfaceC0227a tw = this.aaU.tw();
        com.kwad.framework.filedownloader.a ti = tw.ti();
        q.tX().b(this);
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.e(this, "the task[%d] has been expired from the launch pool.", Integer.valueOf(getId()));
        }
        r.tZ();
        if (r.ub()) {
            n.tR().aY(ti.getId());
        } else if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "request pause the task[%d] to the download service, but the download service isn't connected yet.", Integer.valueOf(ti.getId()));
        }
        h.tG().b(tw);
        h.tG().a(tw, com.kwad.framework.filedownloader.message.f.e(ti));
        r.tZ().ud().e(tw);
        return true;
    }

    @Override // com.kwad.framework.filedownloader.x
    public final void reset() {
        this.aaX = null;
        this.abf = null;
        this.abe = false;
        this.abc = 0;
        this.abg = false;
        this.abd = false;
        this.aba = 0L;
        this.abb = 0L;
        this.aaY.reset();
        if (com.kwad.framework.filedownloader.d.d.bA(this.aaV)) {
            this.aaT.tP();
            this.aaT = new k(this.aaU.tw(), this);
        } else {
            this.aaT.b(this.aaU.tw(), this);
        }
        b((byte) 0);
    }

    @Override // com.kwad.framework.filedownloader.x.b
    public final void start() {
        if (this.aaV != 10) {
            com.kwad.framework.filedownloader.f.d.d(this, "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d", Integer.valueOf(getId()), Byte.valueOf(this.aaV));
            return;
        }
        a.InterfaceC0227a tw = this.aaU.tw();
        com.kwad.framework.filedownloader.a ti = tw.ti();
        v ud = r.tZ().ud();
        try {
            if (ud.f(tw)) {
                return;
            }
            synchronized (this.aaP) {
                if (this.aaV != 10) {
                    com.kwad.framework.filedownloader.f.d.d(this, "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d", Integer.valueOf(getId()), Byte.valueOf(this.aaV));
                    return;
                }
                b((byte) 11);
                h.tG().b(tw);
                if (com.kwad.framework.filedownloader.f.c.a(ti.getId(), ti.getTargetFilePath(), ti.tb(), true)) {
                    return;
                }
                boolean a2 = n.tR().a(ti.getUrl(), ti.getPath(), ti.sW(), ti.sU(), ti.sV(), ti.td(), ti.tb(), this.aaU.tv(), ti.th());
                if (this.aaV == -2) {
                    com.kwad.framework.filedownloader.f.d.d(this, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", Integer.valueOf(getId()));
                    if (a2) {
                        n.tR().aY(getId());
                    }
                } else if (a2) {
                    ud.e(tw);
                } else if (ud.f(tw)) {
                } else {
                    MessageSnapshot g = g(new RuntimeException("Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
                    if (h.tG().a(tw)) {
                        ud.e(tw);
                        h.tG().b(tw);
                    }
                    h.tG().a(tw, g);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            h.tG().a(tw, g(th));
        }
    }

    @Override // com.kwad.framework.filedownloader.x
    public final long tA() {
        return this.aba;
    }

    @Override // com.kwad.framework.filedownloader.x
    public final byte ta() {
        return this.aaV;
    }

    @Override // com.kwad.framework.filedownloader.x
    public final Throwable tc() {
        return this.aaX;
    }

    @Override // com.kwad.framework.filedownloader.x
    public final int te() {
        return this.abc;
    }

    @Override // com.kwad.framework.filedownloader.x
    public final boolean tg() {
        return this.abd;
    }

    @Override // com.kwad.framework.filedownloader.a.c
    public final void tr() {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.e(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(ta()));
        }
        this.aaY.end(this.aba);
        if (this.aaU.tx() != null) {
            ArrayList arrayList = (ArrayList) this.aaU.tx().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i);
            }
        }
        r.tZ().ud().e(this.aaU.tw());
    }

    @Override // com.kwad.framework.filedownloader.x.a
    public final t ty() {
        return this.aaT;
    }

    @Override // com.kwad.framework.filedownloader.x
    public final void tz() {
        boolean z;
        synchronized (this.aaP) {
            if (this.aaV != 0) {
                com.kwad.framework.filedownloader.f.d.d(this, "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d", Integer.valueOf(getId()), Byte.valueOf(this.aaV));
                return;
            }
            b((byte) 10);
            a.InterfaceC0227a tw = this.aaU.tw();
            com.kwad.framework.filedownloader.a ti = tw.ti();
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.e(this, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]", ti.getUrl(), ti.getPath(), ti.sX(), ti.getTag());
            }
            try {
                prepare();
                z = true;
            } catch (Throwable th) {
                h.tG().b(tw);
                h.tG().a(tw, g(th));
                z = false;
            }
            if (z) {
                q.tX().a(this);
            }
            if (com.kwad.framework.filedownloader.f.d.aeU) {
                com.kwad.framework.filedownloader.f.d.e(this, "the task[%d] has been into the launch pool.", Integer.valueOf(getId()));
            }
        }
    }
}
