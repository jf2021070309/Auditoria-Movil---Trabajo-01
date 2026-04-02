package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.event.DownloadServiceConnectChangedEvent;
/* loaded from: classes.dex */
public abstract class e extends com.kwad.framework.filedownloader.event.c {
    private DownloadServiceConnectChangedEvent.ConnectStatus abh;

    @Override // com.kwad.framework.filedownloader.event.c
    public final boolean a(com.kwad.framework.filedownloader.event.b bVar) {
        if (bVar instanceof DownloadServiceConnectChangedEvent) {
            DownloadServiceConnectChangedEvent.ConnectStatus uX = ((DownloadServiceConnectChangedEvent) bVar).uX();
            this.abh = uX;
            if (uX == DownloadServiceConnectChangedEvent.ConnectStatus.connected) {
                tB();
                return false;
            }
            tC();
            return false;
        }
        return false;
    }

    public abstract void tB();

    public abstract void tC();

    public final DownloadServiceConnectChangedEvent.ConnectStatus tD() {
        return this.abh;
    }
}
