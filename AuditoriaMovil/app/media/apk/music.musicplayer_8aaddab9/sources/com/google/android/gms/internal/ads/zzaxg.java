package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzaxg {
    @VisibleForTesting
    public ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    @VisibleForTesting
    public Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        try {
            this.zzb.close();
        } catch (IOException e2) {
            zzcgt.zzg("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            this.zza.close();
            return this.zza.toString();
        } catch (IOException e3) {
            zzcgt.zzg("HashManager: Unable to convert to Base64.", e3);
            return "";
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
