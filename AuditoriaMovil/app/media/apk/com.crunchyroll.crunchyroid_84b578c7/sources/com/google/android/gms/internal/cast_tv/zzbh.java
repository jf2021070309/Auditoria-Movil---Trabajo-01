package com.google.android.gms.internal.cast_tv;

import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.internal.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbh extends zzk {
    final /* synthetic */ com.google.android.gms.cast.tv.media.zzz zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbp zzc;

    public zzbh(zzbp zzbpVar, com.google.android.gms.cast.tv.media.zzz zzzVar, String str) {
        this.zzc = zzbpVar;
        this.zza = zzzVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzl
    public final zzbr zze() {
        MediaLoadRequestData mediaLoadRequestData;
        MediaLoadRequestData mediaLoadRequestData2;
        zzo zzoVar;
        MediaLoadRequestData mediaLoadRequestData3;
        Logger logger;
        try {
            zzbp zzbpVar = this.zzc;
            mediaLoadRequestData = zzbpVar.zzi;
            if (mediaLoadRequestData == null) {
                logger = zzbp.zze;
                logger.e("There is no previous resolved load request, PLAY_AGAIN will fail", new Object[0]);
                return new zzbr(new MediaError.Builder().setType(MediaError.ERROR_TYPE_LOAD_FAILED).setRequestId(this.zza.getRequestId()).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.LOAD_FAILED)).setReason(MediaError.ERROR_REASON_GENERIC_LOAD_ERROR).build());
            }
            mediaLoadRequestData2 = zzbpVar.zzi;
            mediaLoadRequestData2.setRequestId(this.zza.getRequestId());
            zzbp zzbpVar2 = this.zzc;
            zzoVar = zzbpVar2.zzf;
            String str = this.zzb;
            mediaLoadRequestData3 = zzbpVar2.zzi;
            zzoVar.zzk(str, mediaLoadRequestData3, null);
            return new zzbr(null);
        } catch (RemoteException unused) {
            return new zzbr(new MediaError.Builder().setType(MediaError.ERROR_TYPE_LOAD_FAILED).setRequestId(this.zza.getRequestId()).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.LOAD_FAILED)).setReason(MediaError.ERROR_REASON_GENERIC_LOAD_ERROR).build());
        }
    }
}
