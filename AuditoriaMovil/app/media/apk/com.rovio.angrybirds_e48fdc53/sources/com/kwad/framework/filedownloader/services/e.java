package com.kwad.framework.filedownloader.services;

import android.app.Notification;
import android.os.IBinder;
import com.kwad.framework.filedownloader.c.b;
import com.kwad.framework.filedownloader.n;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class e extends b.a implements i {
    private final g aeG;
    private final WeakReference<FileDownloadServiceProxy> aeH;

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);

        void onDisconnected();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(WeakReference<FileDownloadServiceProxy> weakReference, g gVar) {
        this.aeH = weakReference;
        this.aeG = gVar;
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void a(com.kwad.framework.filedownloader.c.a aVar) {
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
        n.tS().onDisconnected();
    }

    @Override // com.kwad.framework.filedownloader.c.b
    public final void pauseAllTasks() {
        this.aeG.vI();
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
        n.tS().a(this);
    }

    @Override // com.kwad.framework.filedownloader.services.i
    public final IBinder vH() {
        return null;
    }
}
