package com.google.android.gms.internal.ads;

import java.io.Closeable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfkv implements Closeable {
    public static zzflh zza() {
        return new zzflh();
    }

    public static zzflh zzb(final int i, zzflg zzflgVar) {
        return new zzflh(new zzfpg() { // from class: com.google.android.gms.internal.ads.zzfkt
            @Override // com.google.android.gms.internal.ads.zzfpg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i);
                return valueOf;
            }
        }, new zzfpg() { // from class: com.google.android.gms.internal.ads.zzfku
            @Override // com.google.android.gms.internal.ads.zzfpg
            public final Object zza() {
                return zzfkv.zze();
            }
        }, zzflgVar);
    }

    public static zzflh zzc(zzfpg<Integer> zzfpgVar, zzfpg<Integer> zzfpgVar2, zzflg zzflgVar) {
        return new zzflh(zzfpgVar, zzfpgVar2, zzflgVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
