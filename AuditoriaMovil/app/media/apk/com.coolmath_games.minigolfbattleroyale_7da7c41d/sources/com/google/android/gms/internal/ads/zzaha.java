package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzaha extends IOException {
    public final boolean zzb;
    public final int zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzaha(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zzb = z;
        this.zzc = i;
    }

    public static zzaha zza(String str, Throwable th) {
        return new zzaha(str, th, true, 0);
    }

    public static zzaha zzb(String str, Throwable th) {
        return new zzaha(str, th, true, 1);
    }

    public static zzaha zzc(String str) {
        return new zzaha(str, null, false, 1);
    }
}
