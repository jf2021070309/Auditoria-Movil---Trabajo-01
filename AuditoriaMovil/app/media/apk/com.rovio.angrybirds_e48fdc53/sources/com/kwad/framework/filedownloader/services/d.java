package com.kwad.framework.filedownloader.services;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.kwad.framework.filedownloader.c.b;
import com.kwad.framework.filedownloader.message.MessageSnapshot;
import com.kwad.framework.filedownloader.message.e;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class d extends b.a implements e.b, i {
    private final RemoteCallbackList<com.kwad.framework.filedownloader.c.a> aeF = new RemoteCallbackList<>();
    private final g aeG;
    private final WeakReference<FileDownloadServiceProxy> aeH;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(WeakReference<FileDownloadServiceProxy> weakReference, g gVar) {
        this.aeH = weakReference;
        this.aeG = gVar;
        com.kwad.framework.filedownloader.message.e.vj().a(this);
    }

    private synchronized int v(MessageSnapshot messageSnapshot) {
        int beginBroadcast;
        RemoteCallbackList<com.kwad.framework.filedownloader.c.a> remoteCallbackList;
        beginBroadcast = this.aeF.beginBroadcast();
        for (int i = 0; i < beginBroadcast; i++) {
            try {
                this.aeF.getBroadcastItem(i).q(messageSnapshot);
            } catch (RemoteException e) {
                com.kwad.framework.filedownloader.f.d.a(this, e, "callback error", new Object[0]);
                remoteCallbackList = this.aeF;
            }
        }
        remoteCallbackList = this.aeF;
        remoteCallbackList.finishBroadcast();
        return beginBroadcast;
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void a(com.kwad.framework.filedownloader.c.a aVar) {
        this.aeF.register(aVar);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean aY(int i) {
        return this.aeG.aY(i);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final byte aZ(int i) {
        return this.aeG.aZ(i);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void b(com.kwad.framework.filedownloader.c.a aVar) {
        this.aeF.unregister(aVar);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void b(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, com.kwad.framework.filedownloader.d.b bVar, boolean z3) {
        this.aeG.b(str, str2, z, i, i2, i3, z2, bVar, z3);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean ba(int i) {
        return this.aeG.ba(i);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean bs(int i) {
        return this.aeG.bs(i);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final long bt(int i) {
        return this.aeG.bE(i);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final long bu(int i) {
        return this.aeG.bu(i);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean isIdle() {
        return this.aeG.isIdle();
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final boolean n(String str, String str2) {
        return this.aeG.p(str, str2);
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final void onDestroy() {
        com.kwad.framework.filedownloader.message.e.vj().a(null);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void pauseAllTasks() {
        this.aeG.vI();
    }

    @Override // com.kwad.framework.filedownloader.message.e.b
    public final void r(MessageSnapshot messageSnapshot) {
        v(messageSnapshot);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void startForeground(int i, Notification notification) {
        WeakReference<FileDownloadServiceProxy> weakReference = this.aeH;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.aeH.get().context.startForeground(i, notification);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void stopForeground(boolean z) {
        WeakReference<FileDownloadServiceProxy> weakReference = this.aeH;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.aeH.get().context.stopForeground(z);
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void uZ() {
        this.aeG.uZ();
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final void vG() {
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final IBinder vH() {
        return this;
    }
}
