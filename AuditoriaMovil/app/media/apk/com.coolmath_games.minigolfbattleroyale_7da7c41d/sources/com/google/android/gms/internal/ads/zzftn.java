package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghi;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzftn<KeyFormatProtoT extends zzghi, KeyProtoT extends zzghi> {
    final zzfts<KeyFormatProtoT, KeyProtoT> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftn(zzfts<KeyFormatProtoT, KeyProtoT> zzftsVar) {
        this.zza = zzftsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final KeyProtoT zza(zzgex zzgexVar) throws GeneralSecurityException, zzggm {
        KeyFormatProtoT zzc = this.zza.zzc(zzgexVar);
        this.zza.zzb(zzc);
        return this.zza.zzd(zzc);
    }
}
