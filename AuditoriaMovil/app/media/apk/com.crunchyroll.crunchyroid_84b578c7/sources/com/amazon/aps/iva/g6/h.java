package com.amazon.aps.iva.g6;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
/* compiled from: DrmUtil.java */
/* loaded from: classes.dex */
public final class h {
    public static boolean a(Throwable th) {
        return th instanceof DeniedByServerException;
    }

    public static boolean b(Throwable th) {
        return th instanceof NotProvisionedException;
    }
}
