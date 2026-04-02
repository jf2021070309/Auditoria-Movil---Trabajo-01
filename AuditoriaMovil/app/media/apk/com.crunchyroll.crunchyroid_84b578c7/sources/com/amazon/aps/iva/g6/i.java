package com.amazon.aps.iva.g6;

import android.media.MediaDrm;
import com.amazon.aps.iva.t5.g0;
/* compiled from: DrmUtil.java */
/* loaded from: classes.dex */
public final class i {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return g0.u(g0.v(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
