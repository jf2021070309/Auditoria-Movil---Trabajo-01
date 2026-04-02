package com.kwad.framework.filedownloader.event;
/* loaded from: classes.dex */
public final class DownloadServiceConnectChangedEvent extends b {
    private final ConnectStatus adN;
    private final Class<?> adO;

    /* loaded from: classes.dex */
    public enum ConnectStatus {
        connected,
        disconnected,
        lost
    }

    public DownloadServiceConnectChangedEvent(ConnectStatus connectStatus, Class<?> cls) {
        super("event.service.connect.changed");
        this.adN = connectStatus;
        this.adO = cls;
    }

    public final ConnectStatus uX() {
        return this.adN;
    }
}
