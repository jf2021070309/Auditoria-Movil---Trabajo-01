package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.CuePoint;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamManager;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzgj extends zzep implements StreamManager {
    private final String zza;
    private List zzb;

    public zzgj(String str, zzfm zzfmVar, StreamDisplayContainer streamDisplayContainer, zzgm zzgmVar, zzdj zzdjVar, zzge zzgeVar, zzex zzexVar, Context context, String str2, boolean z) {
        super(str, zzfmVar, zzgmVar, streamDisplayContainer, zzdjVar, zzgeVar, zzexVar, context, z);
        this.zzb = new ArrayList();
        this.zza = str2;
        zzgmVar.zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep, com.google.ads.interactivemedia.v3.api.BaseManager
    public final void destroy() {
        super.destroy();
        zzn(zzfe.contentComplete);
        zzl();
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final double getContentTimeForStreamTime(double d) {
        double d2 = d;
        for (CuePoint cuePoint : this.zzb) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return 0.0d;
            }
            if (d >= cuePoint.getEndTime()) {
                d2 -= cuePoint.getEndTime() - cuePoint.getStartTime();
            } else if (d < cuePoint.getEndTime() && d > cuePoint.getStartTime()) {
                d2 -= d - cuePoint.getStartTime();
            }
        }
        return d2;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final long getContentTimeMsForStreamTimeMs(long j) {
        long j2 = j;
        for (CuePoint cuePoint : this.zzb) {
            if (cuePoint.getStartTimeMs() > cuePoint.getEndTimeMs()) {
                return 0L;
            }
            if (j >= cuePoint.getEndTimeMs()) {
                j2 -= cuePoint.getEndTimeMs() - cuePoint.getStartTimeMs();
            } else if (j < cuePoint.getEndTimeMs() && j > cuePoint.getStartTimeMs()) {
                j2 -= j - cuePoint.getStartTimeMs();
            }
        }
        return j2;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final List<CuePoint> getCuePoints() {
        return Collections.unmodifiableList(this.zzb);
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final CuePoint getPreviousCuePointForStreamTime(double d) {
        CuePoint cuePoint = null;
        for (CuePoint cuePoint2 : this.zzb) {
            if (cuePoint2.getStartTime() < d) {
                cuePoint = cuePoint2;
            }
        }
        return cuePoint;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final CuePoint getPreviousCuePointForStreamTimeMs(long j) {
        CuePoint cuePoint = null;
        for (CuePoint cuePoint2 : this.zzb) {
            if (cuePoint2.getStartTimeMs() < j) {
                cuePoint = cuePoint2;
            }
        }
        return cuePoint;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final String getStreamId() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final double getStreamTimeForContentTime(double d) {
        double d2 = d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        for (CuePoint cuePoint : this.zzb) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return 0.0d;
            }
            d3 += cuePoint.getStartTime() - d4;
            if (d3 > d) {
                return d2;
            }
            d2 += cuePoint.getEndTime() - cuePoint.getStartTime();
            d4 = cuePoint.getEndTime();
        }
        return d2;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final long getStreamTimeMsForContentTimeMs(long j) {
        long j2 = j;
        long j3 = 0;
        long j4 = 0;
        for (CuePoint cuePoint : this.zzb) {
            if (cuePoint.getStartTimeMs() > cuePoint.getEndTimeMs()) {
                return 0L;
            }
            j3 += cuePoint.getStartTimeMs() - j4;
            if (j3 > j) {
                return j2;
            }
            j2 += cuePoint.getEndTimeMs() - cuePoint.getStartTimeMs();
            j4 = cuePoint.getEndTimeMs();
        }
        return j2;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final boolean isCustomPlaybackUsed() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final void replaceAdTagParameters(Map<String, String> map) {
        if (map == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("adTagParameters", map);
        zzm(zzfd.adsManager, zzfe.replaceAdTagParameters, hashMap);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep, com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzb(zzfj zzfjVar) {
        zzgm zzgmVar = (zzgm) zzc();
        AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = zzfjVar.zza.ordinal();
        if (ordinal != 3) {
            if (ordinal != 4) {
                if (ordinal != 14) {
                    if (ordinal != 15) {
                        switch (ordinal) {
                            case ConnectionResult.API_DISABLED /* 23 */:
                                zzgmVar.zze();
                                break;
                            case 24:
                                zzgmVar.zzb();
                                break;
                            case 25:
                                zzgmVar.zzj();
                                break;
                            case 26:
                                zzgmVar.zzi();
                                break;
                        }
                    } else {
                        zzgmVar.zzm(zzfjVar.zzb);
                    }
                } else {
                    zzgmVar.zzl(Math.round(zzfjVar.zzg * 1000.0d));
                }
            } else {
                this.zzb = zzfjVar.zzd;
            }
        } else {
            zzgmVar.zzn();
        }
        super.zzb(zzfjVar);
    }
}
