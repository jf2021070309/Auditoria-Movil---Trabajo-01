package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzckp implements zzbpr<zzcjb> {
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcjb zzcjbVar, Map map) {
        zzcjb zzcjbVar2 = zzcjbVar;
        zzcnh zzh = zzcjbVar2.zzh();
        if (zzh == null) {
            try {
                zzcnh zzcnhVar = new zzcnh(zzcjbVar2, Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcjbVar2.zzx(zzcnhVar);
                zzh = zzcnhVar;
            } catch (NullPointerException e) {
                e = e;
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get(IronSourceConstants.EVENTS_DURATION));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + IronSourceConstants.USING_CACHE_FOR_INIT_EVENT);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
        zzh.zzs(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
