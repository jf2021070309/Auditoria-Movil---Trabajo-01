package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.SortedSet;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzeu implements zzgg {
    private final SortedSet zza;
    private final zzfm zzb;
    private final String zzc;
    private long zzd;
    private VideoProgressUpdate zze;
    private final zzqu zzf;

    public zzeu(zzfm zzfmVar, SortedSet sortedSet, String str) {
        zzqu zzquVar = new zzqu();
        this.zzd = 0L;
        this.zze = new VideoProgressUpdate(0L, 0L);
        this.zza = sortedSet;
        this.zzf = zzquVar;
        this.zzb = zzfmVar;
        this.zzc = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgg
    public final void zza(VideoProgressUpdate videoProgressUpdate) {
        SortedSet subSet;
        if (videoProgressUpdate != null && videoProgressUpdate.getDuration() >= 0.0f && !videoProgressUpdate.equals(this.zze)) {
            float currentTime = this.zze.getCurrentTime();
            float currentTime2 = videoProgressUpdate.getCurrentTime();
            if (currentTime < currentTime2) {
                subSet = this.zza.subSet(Float.valueOf(currentTime), Float.valueOf(currentTime2));
            } else {
                subSet = this.zza.subSet(Float.valueOf(currentTime2), Float.valueOf(currentTime));
            }
            if (subSet.isEmpty() && !this.zza.contains(Float.valueOf(videoProgressUpdate.getCurrentTime())) && System.currentTimeMillis() - this.zzd < 1000) {
                return;
            }
            this.zzd = System.currentTimeMillis();
            this.zze = videoProgressUpdate;
            this.zzb.zzp(new zzff(zzfd.contentTimeUpdate, zzfe.contentTimeUpdate, this.zzc, com.google.ads.interactivemedia.v3.impl.data.zzbr.create(videoProgressUpdate)));
        }
    }
}
