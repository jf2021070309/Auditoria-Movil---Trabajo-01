package com.ss.android.downloadlib;
/* loaded from: classes3.dex */
public class bn {
    private static volatile bn dr = null;
    private com.ss.android.download.api.config.bn ge = null;

    private bn() {
    }

    public static bn dr() {
        if (dr == null) {
            synchronized (bn.class) {
                if (dr == null) {
                    dr = new bn();
                }
            }
        }
        return dr;
    }

    public com.ss.android.download.api.config.bn ge() {
        return this.ge;
    }
}
