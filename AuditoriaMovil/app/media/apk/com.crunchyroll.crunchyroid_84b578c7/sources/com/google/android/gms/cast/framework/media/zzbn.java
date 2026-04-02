package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzbn implements com.google.android.gms.cast.internal.zzan {
    final /* synthetic */ RemoteMediaClient zza;

    public /* synthetic */ zzbn(RemoteMediaClient remoteMediaClient, zzbm zzbmVar) {
        this.zza = remoteMediaClient;
    }

    private final void zzn() {
        RemoteMediaClient.ParseAdsInfoCallback parseAdsInfoCallback;
        MediaStatus mediaStatus;
        RemoteMediaClient.ParseAdsInfoCallback parseAdsInfoCallback2;
        RemoteMediaClient.ParseAdsInfoCallback parseAdsInfoCallback3;
        RemoteMediaClient remoteMediaClient = this.zza;
        parseAdsInfoCallback = remoteMediaClient.zzm;
        if (parseAdsInfoCallback != null && (mediaStatus = remoteMediaClient.getMediaStatus()) != null) {
            RemoteMediaClient remoteMediaClient2 = this.zza;
            MediaStatus.Writer writer = mediaStatus.getWriter();
            parseAdsInfoCallback2 = remoteMediaClient2.zzm;
            writer.setIsPlayingAd(parseAdsInfoCallback2.parseIsPlayingAdFromMediaStatus(mediaStatus));
            parseAdsInfoCallback3 = this.zza.zzm;
            List<AdBreakInfo> parseAdBreaksFromMediaStatus = parseAdsInfoCallback3.parseAdBreaksFromMediaStatus(mediaStatus);
            MediaInfo mediaInfo = this.zza.getMediaInfo();
            if (mediaInfo != null) {
                mediaInfo.getWriter().setAdBreaks(parseAdBreaksFromMediaStatus);
            }
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zza() {
        List<RemoteMediaClient.Listener> list;
        List<RemoteMediaClient.Callback> list2;
        list = this.zza.zzi;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onAdBreakStatusUpdated();
        }
        list2 = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list2) {
            callback.onAdBreakStatusUpdated();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzb(MediaError mediaError) {
        List<RemoteMediaClient.Callback> list;
        list = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list) {
            callback.onMediaError(mediaError);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzc() {
        List<RemoteMediaClient.Listener> list;
        List<RemoteMediaClient.Callback> list2;
        zzn();
        list = this.zza.zzi;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onMetadataUpdated();
        }
        list2 = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list2) {
            callback.onMetadataUpdated();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzd() {
        List<RemoteMediaClient.Listener> list;
        List<RemoteMediaClient.Callback> list2;
        list = this.zza.zzi;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onPreloadStatusUpdated();
        }
        list2 = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list2) {
            callback.onPreloadStatusUpdated();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zze(int[] iArr) {
        List<RemoteMediaClient.Callback> list;
        list = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list) {
            callback.zzb(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzf(int[] iArr, int i) {
        List<RemoteMediaClient.Callback> list;
        list = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list) {
            callback.zzc(iArr, i);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzg(MediaQueueItem[] mediaQueueItemArr) {
        List<RemoteMediaClient.Callback> list;
        list = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list) {
            callback.zzd(mediaQueueItemArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzh(int[] iArr) {
        List<RemoteMediaClient.Callback> list;
        list = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list) {
            callback.zze(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzi(List list, List list2, int i) {
        List<RemoteMediaClient.Callback> list3;
        list3 = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list3) {
            callback.zzf(list, list2, i);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzj(int[] iArr) {
        List<RemoteMediaClient.Callback> list;
        list = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list) {
            callback.zzg(iArr);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzk() {
        List<RemoteMediaClient.Listener> list;
        List<RemoteMediaClient.Callback> list2;
        list = this.zza.zzi;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onQueueStatusUpdated();
        }
        list2 = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list2) {
            callback.onQueueStatusUpdated();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzl() {
        List<RemoteMediaClient.Callback> list;
        list = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list) {
            callback.zzh();
        }
    }

    @Override // com.google.android.gms.cast.internal.zzan
    public final void zzm() {
        List<RemoteMediaClient.Listener> list;
        List<RemoteMediaClient.Callback> list2;
        zzn();
        RemoteMediaClient.zzo(this.zza);
        list = this.zza.zzi;
        for (RemoteMediaClient.Listener listener : list) {
            listener.onStatusUpdated();
        }
        list2 = this.zza.zzj;
        for (RemoteMediaClient.Callback callback : list2) {
            callback.onStatusUpdated();
        }
    }
}
