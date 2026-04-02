package com.google.android.gms.internal.cast_tv;

import android.content.Intent;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.tv.media.MediaResumeSessionRequestData;
import com.google.android.gms.cast.tv.media.StoreSessionResponseData;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbl extends zzq {
    final /* synthetic */ zzbp zza;

    public /* synthetic */ zzbl(zzbp zzbpVar, zzbk zzbkVar) {
        this.zza = zzbpVar;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final MediaStatus zze() {
        return zzbp.zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final MediaStatus zzf() {
        MediaStatus zzU;
        zzU = this.zza.zzU();
        return zzU;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzg(int i) {
        this.zza.zzO(i);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzh(MediaLoadRequestData mediaLoadRequestData) {
        MediaInfo mediaInfo;
        long j;
        int zzL;
        this.zza.zzi = mediaLoadRequestData;
        if (mediaLoadRequestData != null) {
            mediaInfo = mediaLoadRequestData.getMediaInfo();
        } else {
            mediaInfo = null;
        }
        if (mediaLoadRequestData != null) {
            j = mediaLoadRequestData.getRequestId();
        } else {
            j = 0;
        }
        MediaStatus.Builder mediaInfo2 = new MediaStatus.Builder().setMediaInfo(mediaInfo);
        zzL = this.zza.zzL();
        this.zza.zzP(mediaInfo2.setMediaSessionId(zzL).setPlayerState(5).build().toJson(), j);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzi(String str, MediaError mediaError) {
        this.zza.zzW(str, mediaError);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzj(com.google.android.gms.cast.tv.media.zzm zzmVar) {
        try {
            c zza = zzmVar.zza();
            zza.put("type", "QUEUE_CHANGE");
            this.zza.zzI(null, zza);
        } catch (b unused) {
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzk(String str, String str2, zzeq zzeqVar) {
        this.zza.zzR(str, str2, zzeqVar);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzl(String str, com.google.android.gms.cast.tv.media.zzo zzoVar) {
        try {
            c zza = zzoVar.zza();
            zza.put("type", "QUEUE_ITEM_IDS");
            this.zza.zzI(str, zza);
        } catch (b unused) {
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzm(String str, com.google.android.gms.cast.tv.media.zzr zzrVar) {
        try {
            c zza = zzrVar.zza();
            zza.put("type", "QUEUE_ITEMS");
            this.zza.zzI(str, zza);
        } catch (b unused) {
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzn(String str, StoreSessionResponseData storeSessionResponseData) {
        if (storeSessionResponseData == null) {
            return;
        }
        try {
            c zza = storeSessionResponseData.zza();
            zza.putOpt("type", "SESSION_STATE");
            this.zza.zzI(str, zza);
        } catch (b unused) {
        }
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final void zzo(MediaSession.Token token) {
        zzbp zzbpVar = this.zza;
        MediaSessionCompat.Token token2 = null;
        if (token != null) {
            token2 = new MediaSessionCompat.Token(token, null, null);
        }
        zzbpVar.zzS(token2);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzr
    public final boolean zzp(Intent intent) {
        zzbp zzbpVar = this.zza;
        if (intent == null) {
            return false;
        }
        int i = zzbq.zza;
        String stringExtra = intent.getStringExtra("android.cast.extra.SENDER_ID");
        try {
            MediaLoadRequestData zza = zzbq.zza(intent);
            if (zza != null) {
                c json = zza.toJson();
                json.putOpt("type", "LOAD");
                zzbpVar.zzR(stringExtra, json.toString(), null);
            } else {
                MediaResumeSessionRequestData zzb = zzbq.zzb(intent);
                if (zzb == null) {
                    return false;
                }
                c zzb2 = zzb.zzb();
                zzb2.putOpt("type", "RESUME_SESSION");
                zzbpVar.zzR(stringExtra, zzb2.toString(), null);
            }
            return true;
        } catch (b unused) {
            return false;
        }
    }
}
