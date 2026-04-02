package com.amazon.aps.iva.mf;
/* compiled from: ConnectionChangeListener.kt */
/* loaded from: classes.dex */
public interface a {
    void onConnectionLost();

    void onConnectionRefresh(boolean z);

    void onConnectionRestored();

    void onConnectionUpdated(boolean z);
}
