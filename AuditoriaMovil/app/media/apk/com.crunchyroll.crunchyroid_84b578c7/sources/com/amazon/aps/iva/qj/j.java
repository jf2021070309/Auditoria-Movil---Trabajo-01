package com.amazon.aps.iva.qj;
/* compiled from: StreamProtocol.kt */
/* loaded from: classes.dex */
public enum j {
    DASH("dash"),
    HLS("hls"),
    MP4("mp4");
    
    private final String protocolName;

    j(String str) {
        this.protocolName = str;
    }
}
