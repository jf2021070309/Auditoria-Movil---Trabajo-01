package com.kwad.framework.filedownloader;

import android.content.Context;
import android.content.Intent;
import com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent;
import com.kwad.framework.filedownloader.services.e;
import com.kwad.sdk.api.proxy.app.FileDownloadService;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class o implements e.a, u {
    private static Class<?> abB = null;
    private final ArrayList<Runnable> abC = new ArrayList<>();
    private com.kwad.framework.filedownloader.services.e abD;

    private void a(Context context, Runnable runnable) {
        context.startService(new Intent(context, tU()));
    }

    private static Class<?> tU() {
        if (abB == null) {
            abB = FileDownloadService.SharedMainProcessService.class;
        }
        return abB;
    }

    @Override // com.kwad.framework.filedownloader.services.e.a
    public final void a(com.kwad.framework.filedownloader.services.e eVar) {
        this.abD = eVar;
        this.abC.clear();
        for (Runnable runnable : (List) this.abC.clone()) {
            runnable.run();
        }
        f.tE().c(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.connected, tU()));
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean a(String str, String str2, boolean z, int i, int i2, int i3, boolean z2, com.kwad.framework.filedownloader.d.b bVar, boolean z3) {
        if (isConnected()) {
            this.abD.b(str, str2, z, i, i2, i3, z2, bVar, z3);
            return true;
        }
        return com.kwad.framework.filedownloader.f.a.h(str, str2, z);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean aY(int i) {
        return !isConnected() ? com.kwad.framework.filedownloader.f.a.aY(i) : this.abD.aY(i);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final byte aZ(int i) {
        return !isConnected() ? com.kwad.framework.filedownloader.f.a.aZ(i) : this.abD.aZ(i);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final void am(Context context) {
        a(context, null);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean ba(int i) {
        return !isConnected() ? com.kwad.framework.filedownloader.f.a.ba(i) : this.abD.ba(i);
    }

    @Override // com.kwad.framework.filedownloader.u
    public final boolean isConnected() {
        return this.abD != null;
    }

    @Override // com.kwad.framework.filedownloader.services.e.a
    public final void onDisconnected() {
        this.abD = null;
        f.tE().c(new DownloadServiceConnectChangedEvent(DownloadServiceConnectChangedEvent.ConnectStatus.disconnected, tU()));
    }
}
