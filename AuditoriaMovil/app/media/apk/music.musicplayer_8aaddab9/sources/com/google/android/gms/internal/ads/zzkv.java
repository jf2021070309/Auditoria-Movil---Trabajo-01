package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;
/* loaded from: classes.dex */
public final class zzkv {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
