package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzckp implements zzbpr<zzcjb> {
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcjb zzcjbVar, Map map) {
        zzcjb zzcjbVar2 = zzcjbVar;
        zzcnh zzh = zzcjbVar2.zzh();
        if (zzh == null) {
            try {
                zzcnh zzcnhVar = new zzcnh(zzcjbVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcjbVar2.zzx(zzcnhVar);
                zzh = zzcnhVar;
            } catch (NullPointerException e2) {
                e = e2;
                zzcgt.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e3) {
                e = e3;
                zzcgt.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i2 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i2 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzcgt.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i2);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            zzcgt.zzd(sb.toString());
        }
        zzh.zzs(parseFloat2, parseFloat, i2, equals, parseFloat3);
    }
}
