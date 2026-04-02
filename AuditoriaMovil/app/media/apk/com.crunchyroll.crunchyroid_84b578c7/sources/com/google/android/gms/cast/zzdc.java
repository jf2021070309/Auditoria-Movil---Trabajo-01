package com.google.android.gms.cast;

import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzdc extends zzdp {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ c zzc;
    final /* synthetic */ RemoteMediaPlayer zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdc(RemoteMediaPlayer remoteMediaPlayer, GoogleApiClient googleApiClient, int i, int i2, c cVar) {
        super(remoteMediaPlayer, googleApiClient);
        this.zzd = remoteMediaPlayer;
        this.zza = i;
        this.zzb = i2;
        this.zzc = cVar;
    }

    @Override // com.google.android.gms.cast.zzdp
    public final void zza(com.google.android.gms.cast.internal.zzw zzwVar) throws com.google.android.gms.cast.internal.zzao {
        com.google.android.gms.cast.internal.zzaq zzaqVar;
        int zza = RemoteMediaPlayer.zza(this.zzd, this.zza);
        int i = 0;
        if (zza == -1) {
            setResult((zzdc) new zzdo(this, new Status(0)));
            return;
        }
        int i2 = this.zzb;
        if (i2 < 0) {
            setResult((zzdc) new zzdo(this, new Status((int) CastStatusCodes.INVALID_REQUEST, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", Integer.valueOf(this.zzb)))));
        } else if (zza == i2) {
            setResult((zzdc) new zzdo(this, new Status(0)));
        } else {
            MediaStatus mediaStatus = this.zzd.getMediaStatus();
            if (mediaStatus == null) {
                setResult((zzdc) new zzdo(this, new Status((int) CastStatusCodes.INVALID_REQUEST, String.format(Locale.ROOT, "Invalid request: Invalid MediaStatus", new Object[0]))));
                return;
            }
            int i3 = this.zzb;
            if (i3 > zza) {
                i3++;
            }
            MediaQueueItem queueItem = mediaStatus.getQueueItem(i3);
            if (queueItem != null) {
                i = queueItem.getItemId();
            }
            zzaqVar = this.zzd.zzb;
            zzaqVar.zzz(zzb(), new int[]{this.zza}, i, this.zzc);
        }
    }
}
