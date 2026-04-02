package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public class zzat extends zzak {
    public final zzan zzb;

    public zzat(zzan zzanVar, int i2, int i3) {
        super(zzb(AdError.REMOTE_ADS_SERVICE_ERROR, 1));
        this.zzb = zzanVar;
    }

    public zzat(IOException iOException, zzan zzanVar, int i2, int i3) {
        super(iOException, zzb(i2, i3));
        this.zzb = zzanVar;
    }

    public zzat(String str, zzan zzanVar, int i2, int i3) {
        super(str, zzb(AdError.INTERNAL_ERROR_CODE, 1));
        this.zzb = zzanVar;
    }

    @Deprecated
    public zzat(String str, IOException iOException, zzan zzanVar, int i2) {
        this(str, iOException, zzanVar, 2000, 1);
    }

    public zzat(String str, IOException iOException, zzan zzanVar, int i2, int i3) {
        super(str, iOException, zzb(i2, 1));
        this.zzb = zzanVar;
    }

    public static zzat zza(IOException iOException, zzan zzanVar, int i2) {
        String message = iOException.getMessage();
        boolean z = iOException instanceof SocketTimeoutException;
        int i3 = AdError.INTERNAL_ERROR_CODE;
        if (z) {
            i3 = AdError.CACHE_ERROR_CODE;
        } else if (iOException instanceof InterruptedIOException) {
            i3 = 1004;
        } else if (message != null && zzflf.zza(message).matches("cleartext.*not permitted.*")) {
            i3 = 2007;
        }
        return i3 == 2007 ? new zzas(iOException, zzanVar) : new zzat(iOException, zzanVar, i3, i2);
    }

    private static int zzb(int i2, int i3) {
        if (i2 == 2000) {
            if (i3 != 1) {
                return 2000;
            }
            return AdError.INTERNAL_ERROR_CODE;
        }
        return i2;
    }
}
