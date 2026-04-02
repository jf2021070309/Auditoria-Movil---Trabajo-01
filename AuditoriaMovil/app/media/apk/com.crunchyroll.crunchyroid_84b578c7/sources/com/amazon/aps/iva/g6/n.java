package com.amazon.aps.iva.g6;

import com.amazon.aps.iva.t5.g0;
import java.util.UUID;
/* compiled from: FrameworkCryptoConfig.java */
/* loaded from: classes.dex */
public final class n implements com.amazon.aps.iva.z5.b {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    static {
        boolean z;
        if ("Amazon".equals(g0.c)) {
            String str = g0.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                d = z;
            }
        }
        z = false;
        d = z;
    }

    public n(UUID uuid, byte[] bArr, boolean z) {
        this.a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
