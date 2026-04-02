package com.google.android.gms.cast.tv.cac;

import android.os.RemoteException;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.media.UserActionRequestData;
import com.google.android.gms.internal.cast_tv.zzdu;
import com.google.android.gms.internal.cast_tv.zzeq;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzi extends com.google.android.gms.internal.cast_tv.zzh {
    final /* synthetic */ zzj zza;

    public /* synthetic */ zzi(zzj zzjVar, zzh zzhVar) {
        this.zza = zzjVar;
    }

    private final void zzf(String str, c cVar) {
        Logger logger;
        com.google.android.gms.internal.cast_tv.zzf zzfVar;
        try {
            zzfVar = this.zza.zzc;
            zzfVar.zzd(str, cVar.toString());
        } catch (RemoteException e) {
            logger = this.zza.zza;
            logger.e("Failed to call sendOutboundMessage: ".concat(String.valueOf(e.getMessage())), new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzi
    public final void zzb(String str, String str2, zzeq zzeqVar) {
        Logger logger;
        Logger logger2;
        Logger logger3;
        com.google.android.gms.internal.cast_tv.zzf zzfVar;
        try {
            c cVar = new c(str2);
            long optLong = cVar.optLong("requestId");
            String optString = cVar.optString("type");
            if (!"USER_ACTION".equals(optString)) {
                logger2 = this.zza.zza;
                logger2.w("Unsupported type: ".concat(String.valueOf(optString)), new Object[0]);
                zzc(str, new MediaError.Builder().setType(MediaError.ERROR_TYPE_ERROR).setRequestId(optLong).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC)).setReason(MediaError.ERROR_REASON_NOT_SUPPORTED).build());
                zzdu.zzc(zzeqVar, 3);
                return;
            }
            UserActionRequestData zza = UserActionRequestData.zza(cVar);
            try {
                zzfVar = this.zza.zzc;
                zzfVar.zzc(str, zza, zzeqVar);
            } catch (RemoteException e) {
                logger3 = this.zza.zza;
                logger3.e("Failed to call handleUserAction: ".concat(String.valueOf(e.getMessage())), new Object[0]);
                zzc(str, new MediaError.Builder().setType(MediaError.ERROR_TYPE_ERROR).setRequestId(optLong).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC)).setReason(MediaError.ERROR_REASON_APP_ERROR).build());
                zzdu.zzc(zzeqVar, 3);
            }
        } catch (b e2) {
            logger = this.zza.zza;
            logger.w("Failed to parse cast message: ".concat(String.valueOf(str2)), e2);
            zzdu.zzc(zzeqVar, 4);
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzi
    public final void zzc(String str, MediaError mediaError) {
        c cVar = new c();
        try {
            cVar.put("type", MediaError.ERROR_TYPE_ERROR);
            cVar.put("requestId", mediaError.getRequestId());
            String reason = mediaError.getReason();
            if (TextUtils.isEmpty(reason)) {
                reason = MediaError.ERROR_REASON_APP_ERROR;
            }
            cVar.put("code", reason);
            zzf(str, cVar);
        } catch (b unused) {
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzi
    public final void zzd(String str, long j) {
        c cVar = new c();
        try {
            cVar.put("type", "SUCCESS");
            cVar.put("requestId", j);
            zzf(str, cVar);
        } catch (b unused) {
        }
    }
}
