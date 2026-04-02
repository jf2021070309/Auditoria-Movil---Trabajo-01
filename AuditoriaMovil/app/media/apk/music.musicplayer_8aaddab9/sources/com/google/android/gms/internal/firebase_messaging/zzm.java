package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzm {
    public static final Logger zza = Logger.getLogger(zzm.class.getName());

    private zzm() {
    }

    public static void zza(@CheckForNull InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        } catch (IOException e2) {
            try {
                zza.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable) e2);
            } catch (IOException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
