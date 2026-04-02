package com.google.android.gms.internal.cast_tv;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaError;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbe extends zzk {
    final /* synthetic */ c zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbp zzc;

    public zzbe(zzbp zzbpVar, c cVar, String str) {
        this.zzc = zzbpVar;
        this.zza = cVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzl
    public final zzbr zze() {
        int zzT;
        int optInt = this.zza.optInt("requestId");
        zzT = super/*com.google.android.gms.internal.cast_tv.zzfj*/.zzT(this.zzb, this.zza);
        if (zzT == 2) {
            return new zzbr(null);
        }
        return new zzbr(new MediaError.Builder().setType(MediaError.ERROR_TYPE_ERROR).setRequestId(optInt).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC)).build());
    }
}
