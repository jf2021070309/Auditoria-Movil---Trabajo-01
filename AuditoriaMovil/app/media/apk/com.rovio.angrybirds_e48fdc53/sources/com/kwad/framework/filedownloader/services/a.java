package com.kwad.framework.filedownloader.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.kwad.framework.filedownloader.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a<CALLBACK extends Binder, INTERFACE extends IInterface> implements ServiceConnection, u {
    private final Class<?> adO;
    private volatile INTERFACE aeu;
    private final HashMap<String, Object> aev = new HashMap<>();
    private final List<Context> aew = new ArrayList();
    private final ArrayList<Runnable> abC = new ArrayList<>();
    private final CALLBACK aet = tW();

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Class<?> cls) {
        this.adO = cls;
    }

    private void a(Context context, Runnable runnable) {
        if (com.kwad.framework.filedownloader.f.f.ap(context)) {
            throw new IllegalStateException("Fatal-Exception: You can't bind the FileDownloadService in :filedownloader process.\n It's the invalid operation and is likely to cause unexpected problems.\n Maybe you want to use non-separate process mode for FileDownloader, More detail about non-separate mode, please move to wiki manually: https://github.com/lingochamp/FileDownloader/wiki/filedownloader.properties");
        }
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "bindStartByContext %s", context.getClass().getSimpleName());
        }
        Intent intent = new Intent(context, this.adO);
        if (!this.aew.contains(context)) {
            this.aew.add(context);
        }
        context.bindService(intent, this, 1);
        context.startService(intent);
    }

    private void aZ(boolean z) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "release connect resources %s", this.aeu);
        }
        this.aeu = null;
        com.kwad.framework.filedownloader.f.tE().c(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.lost, this.adO));
    }

    protected abstract void a(INTERFACE r1, CALLBACK callback);

    @Override // com.kwad.framework.filedownloader.u
    public final void am(Context context) {
        a(context, (Runnable) null);
    }

    protected abstract INTERFACE b(IBinder iBinder);

    @Override // com.kwad.framework.filedownloader.u
    public final boolean isConnected() {
        return vu() != null;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.aeu = b(iBinder);
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "onServiceConnected %s %s", componentName, this.aeu);
        }
        try {
            a((a<CALLBACK, INTERFACE>) this.aeu, (INTERFACE) this.aet);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        this.abC.clear();
        for (Runnable runnable : (List) this.abC.clone()) {
            runnable.run();
        }
        com.kwad.framework.filedownloader.f.tE().c(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, this.adO));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(this, "onServiceDisconnected %s %s", componentName, this.aeu);
        }
        aZ(true);
    }

    protected abstract CALLBACK tW();

    /* JADX INFO: Access modifiers changed from: protected */
    public final INTERFACE vu() {
        return this.aeu;
    }
}
