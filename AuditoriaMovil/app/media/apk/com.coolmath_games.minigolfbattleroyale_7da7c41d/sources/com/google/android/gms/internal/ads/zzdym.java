package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzdym extends Exception {
    private final int zza;

    public zzdym(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdym(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdym(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
