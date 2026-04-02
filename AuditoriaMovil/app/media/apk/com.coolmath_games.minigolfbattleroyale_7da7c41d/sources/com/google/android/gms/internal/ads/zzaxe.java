package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class zzaxe {
    private static MessageDigest zzb;
    protected final Object zza = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] zza(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final MessageDigest zzb() {
        synchronized (this.zza) {
            if (zzb != null) {
                return zzb;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzb = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzb;
        }
    }
}
