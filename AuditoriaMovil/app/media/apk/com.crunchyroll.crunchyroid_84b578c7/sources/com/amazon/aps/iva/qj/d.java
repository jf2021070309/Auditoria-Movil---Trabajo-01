package com.amazon.aps.iva.qj;

import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: PlaybackSource.kt */
/* loaded from: classes.dex */
public enum d {
    LOCAL(ImagesContract.LOCAL),
    NETWORK("network");
    
    private final String type;

    d(String str) {
        this.type = str;
    }
}
