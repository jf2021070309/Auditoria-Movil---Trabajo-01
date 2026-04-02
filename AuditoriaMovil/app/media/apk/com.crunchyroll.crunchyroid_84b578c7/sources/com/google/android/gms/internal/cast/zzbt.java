package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.AdBreakClipInfo;
import com.google.android.gms.cast.AdBreakInfo;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIController;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzbt extends UIController implements RemoteMediaClient.ProgressListener {
    private final CastSeekBar zza;
    private final long zzb;
    private final com.google.android.gms.cast.framework.media.uicontroller.zza zzc;

    public zzbt(CastSeekBar castSeekBar, long j, com.google.android.gms.cast.framework.media.uicontroller.zza zzaVar) {
        this.zza = castSeekBar;
        this.zzb = j;
        this.zzc = zzaVar;
        castSeekBar.setEnabled(false);
        castSeekBar.zzd(null);
        castSeekBar.zzb = null;
        castSeekBar.postInvalidate();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final RemoteMediaClient getRemoteMediaClient() {
        return super.getRemoteMediaClient();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onMediaStatusUpdated() {
        zzc();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.ProgressListener
    public final void onProgressUpdated(long j, long j2) {
        zzb();
        zza();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionConnected(CastSession castSession) {
        super.onSessionConnected(castSession);
        RemoteMediaClient remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.addProgressListener(this, this.zzb);
        }
        zzc();
    }

    @Override // com.google.android.gms.cast.framework.media.uicontroller.UIController
    public final void onSessionEnded() {
        RemoteMediaClient remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.removeProgressListener(this);
        }
        super.onSessionEnded();
        zzc();
    }

    public final void zza() {
        int i;
        RemoteMediaClient remoteMediaClient = super.getRemoteMediaClient();
        AdBreakClipInfo adBreakClipInfo = null;
        if (remoteMediaClient != null && remoteMediaClient.isPlayingAd()) {
            int approximateAdBreakClipPositionMs = (int) remoteMediaClient.getApproximateAdBreakClipPositionMs();
            MediaStatus mediaStatus = remoteMediaClient.getMediaStatus();
            if (mediaStatus != null) {
                adBreakClipInfo = mediaStatus.getCurrentAdBreakClip();
            }
            if (adBreakClipInfo != null) {
                i = (int) adBreakClipInfo.getDurationInMs();
            } else {
                i = approximateAdBreakClipPositionMs;
            }
            if (approximateAdBreakClipPositionMs < 0) {
                approximateAdBreakClipPositionMs = 0;
            }
            if (i < 0) {
                i = 1;
            }
            CastSeekBar castSeekBar = this.zza;
            if (approximateAdBreakClipPositionMs > i) {
                i = approximateAdBreakClipPositionMs;
            }
            castSeekBar.zzb = new com.google.android.gms.cast.framework.media.widget.zzc(approximateAdBreakClipPositionMs, i);
            castSeekBar.postInvalidate();
            return;
        }
        CastSeekBar castSeekBar2 = this.zza;
        castSeekBar2.zzb = null;
        castSeekBar2.postInvalidate();
    }

    public final void zzb() {
        int zza;
        int zza2;
        RemoteMediaClient remoteMediaClient = super.getRemoteMediaClient();
        boolean z = true;
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && !remoteMediaClient.isPlayingAd()) {
            this.zza.setEnabled(true);
        } else {
            this.zza.setEnabled(false);
        }
        com.google.android.gms.cast.framework.media.widget.zze zzeVar = new com.google.android.gms.cast.framework.media.widget.zze();
        zzeVar.zza = this.zzc.zza();
        zzeVar.zzb = this.zzc.zzb();
        zzeVar.zzc = (int) (-this.zzc.zze());
        RemoteMediaClient remoteMediaClient2 = super.getRemoteMediaClient();
        if (remoteMediaClient2 != null && remoteMediaClient2.hasMediaSession() && remoteMediaClient2.zzw()) {
            zza = this.zzc.zzd();
        } else {
            zza = this.zzc.zza();
        }
        zzeVar.zzd = zza;
        RemoteMediaClient remoteMediaClient3 = super.getRemoteMediaClient();
        if (remoteMediaClient3 != null && remoteMediaClient3.hasMediaSession() && remoteMediaClient3.zzw()) {
            zza2 = this.zzc.zzc();
        } else {
            zza2 = this.zzc.zza();
        }
        zzeVar.zze = zza2;
        RemoteMediaClient remoteMediaClient4 = super.getRemoteMediaClient();
        if (remoteMediaClient4 == null || !remoteMediaClient4.hasMediaSession() || !remoteMediaClient4.zzw()) {
            z = false;
        }
        zzeVar.zzf = z;
        this.zza.zze(zzeVar);
    }

    public final void zzc() {
        MediaInfo mediaInfo;
        int min;
        zzb();
        RemoteMediaClient remoteMediaClient = super.getRemoteMediaClient();
        ArrayList arrayList = null;
        if (remoteMediaClient == null) {
            mediaInfo = null;
        } else {
            mediaInfo = remoteMediaClient.getMediaInfo();
        }
        if (remoteMediaClient != null && remoteMediaClient.hasMediaSession() && !remoteMediaClient.isLoadingNextItem() && mediaInfo != null) {
            CastSeekBar castSeekBar = this.zza;
            List<AdBreakInfo> adBreaks = mediaInfo.getAdBreaks();
            if (adBreaks != null) {
                arrayList = new ArrayList();
                for (AdBreakInfo adBreakInfo : adBreaks) {
                    if (adBreakInfo != null) {
                        long playbackPositionInMs = adBreakInfo.getPlaybackPositionInMs();
                        if (playbackPositionInMs == -1000) {
                            min = this.zzc.zzb();
                        } else {
                            min = Math.min((int) (playbackPositionInMs - this.zzc.zze()), this.zzc.zzb());
                        }
                        if (min >= 0) {
                            arrayList.add(new com.google.android.gms.cast.framework.media.widget.zzb(min, (int) adBreakInfo.getDurationInMs(), adBreakInfo.isExpanded()));
                        }
                    }
                }
            }
            castSeekBar.zzd(arrayList);
        } else {
            this.zza.zzd(null);
        }
        zza();
    }
}
