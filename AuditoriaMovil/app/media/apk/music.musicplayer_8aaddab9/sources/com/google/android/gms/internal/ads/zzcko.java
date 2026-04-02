package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import e.a.d.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzcko implements zzbpr<zzcjb> {
    private boolean zza;

    private static int zzb(Context context, Map<String, String> map, String str, int i2) {
        String str2 = map.get(str);
        if (str2 != null) {
            try {
                zzber.zza();
                i2 = zzcgm.zzs(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str2.length() + str.length() + 34);
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                zzcgt.zzi(sb.toString());
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb2 = new StringBuilder(str.length() + 48 + String.valueOf(str2).length());
            a.M(sb2, "Parse pixels for ", str, ", got string ", str2);
            sb2.append(", int ");
            sb2.append(i2);
            sb2.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        return i2;
    }

    private static void zzc(zzcip zzcipVar, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcipVar.zzw(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzcgt.zzi(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcipVar.zzx(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcipVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcipVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcipVar.zzA(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcjb zzcjbVar, Map map) {
        int min;
        int min2;
        int i2;
        String[] split;
        zzcjb zzcjbVar2 = zzcjbVar;
        String str = (String) map.get("action");
        if (str == null) {
            zzcgt.zzi("Action missing from video GMSG.");
            return;
        }
        if (zzcgt.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            zzcgt.zzd(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzcgt.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcjbVar2.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                zzcgt.zzi("Invalid color parameter in background video GMSG.");
            }
        } else if ("playerBackground".equals(str)) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                zzcgt.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcjbVar2.zzw(Color.parseColor(str3));
            } catch (IllegalArgumentException unused2) {
                zzcgt.zzi("Invalid color parameter in playerBackground video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str4 = (String) map.get("mimeTypes");
                if (str4 == null) {
                    zzcgt.zzi("No MIME types specified for decoder properties inspection.");
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "decoderProps");
                    hashMap.put("error", "missingMimeTypes");
                    zzcjbVar2.zze("onVideoEvent", hashMap);
                    return;
                }
                HashMap hashMap2 = new HashMap();
                for (String str5 : str4.split(",")) {
                    hashMap2.put(str5, com.google.android.gms.ads.internal.util.zzck.zza(str5.trim()));
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "decoderProps");
                hashMap3.put("mimeTypes", hashMap2);
                zzcjbVar2.zze("onVideoEvent", hashMap3);
                return;
            }
            zzciq zzf = zzcjbVar2.zzf();
            if (zzf == null) {
                zzcgt.zzi("Could not get underlay container for a video GMSG.");
                return;
            }
            boolean equals = "new".equals(str);
            boolean equals2 = "position".equals(str);
            if (equals || equals2) {
                Context context = zzcjbVar2.getContext();
                int zzb = zzb(context, map, "x", 0);
                int zzb2 = zzb(context, map, "y", 0);
                int zzb3 = zzb(context, map, "w", -1);
                zzbjd<Boolean> zzbjdVar = zzbjl.zzcp;
                if (((Boolean) zzbet.zzc().zzc(zzbjdVar)).booleanValue()) {
                    min = zzb3 == -1 ? zzcjbVar2.zzz() : Math.min(zzb3, zzcjbVar2.zzz());
                } else {
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        StringBuilder w = a.w(110, "Calculate width with original width ", zzb3, ", videoHost.getVideoBoundingWidth() ", zzcjbVar2.zzz());
                        w.append(", x ");
                        w.append(zzb);
                        w.append(".");
                        com.google.android.gms.ads.internal.util.zze.zza(w.toString());
                    }
                    min = Math.min(zzb3, zzcjbVar2.zzz() - zzb);
                }
                int i3 = min;
                int zzb4 = zzb(context, map, "h", -1);
                if (((Boolean) zzbet.zzc().zzc(zzbjdVar)).booleanValue()) {
                    min2 = zzb4 == -1 ? zzcjbVar2.zzy() : Math.min(zzb4, zzcjbVar2.zzy());
                } else {
                    if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                        StringBuilder w2 = a.w(113, "Calculate height with original height ", zzb4, ", videoHost.getVideoBoundingHeight() ", zzcjbVar2.zzy());
                        w2.append(", y ");
                        w2.append(zzb2);
                        w2.append(".");
                        com.google.android.gms.ads.internal.util.zze.zza(w2.toString());
                    }
                    min2 = Math.min(zzb4, zzcjbVar2.zzy() - zzb2);
                }
                int i4 = min2;
                try {
                    i2 = Integer.parseInt((String) map.get("player"));
                } catch (NumberFormatException unused3) {
                    i2 = 0;
                }
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                if (!equals || zzf.zzc() != null) {
                    zzf.zza(zzb, zzb2, i3, i4);
                    return;
                }
                zzf.zzb(zzb, zzb2, i3, i4, i2, parseBoolean, new zzcja((String) map.get("flags")));
                zzcip zzc = zzf.zzc();
                if (zzc != null) {
                    zzc(zzc, map);
                    return;
                }
                return;
            }
            zzcnh zzh = zzcjbVar2.zzh();
            if (zzh != null) {
                if ("timeupdate".equals(str)) {
                    String str6 = (String) map.get("currentTime");
                    if (str6 == null) {
                        zzcgt.zzi("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzh.zzd(Float.parseFloat(str6));
                        return;
                    } catch (NumberFormatException unused4) {
                        zzcgt.zzi(str6.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                        return;
                    }
                } else if ("skip".equals(str)) {
                    zzh.zzr();
                    return;
                }
            }
            zzcip zzc2 = zzf.zzc();
            if (zzc2 == null) {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("event", "no_video_view");
                zzcjbVar2.zze("onVideoEvent", hashMap4);
            } else if ("click".equals(str)) {
                Context context2 = zzcjbVar2.getContext();
                int zzb5 = zzb(context2, map, "x", 0);
                int zzb6 = zzb(context2, map, "y", 0);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb5, zzb6, 0);
                zzc2.zzB(obtain);
                obtain.recycle();
            } else if ("currentTime".equals(str)) {
                String str7 = (String) map.get("time");
                if (str7 == null) {
                    zzcgt.zzi("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    zzc2.zzs((int) (Float.parseFloat(str7) * 1000.0f));
                } catch (NumberFormatException unused5) {
                    zzcgt.zzi(str7.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(str7) : new String("Could not parse time parameter from currentTime video GMSG: "));
                }
            } else if ("hide".equals(str)) {
                zzc2.setVisibility(4);
            } else if ("load".equals(str)) {
                zzc2.zzp();
            } else if ("loadControl".equals(str)) {
                zzc(zzc2, map);
            } else if ("muted".equals(str)) {
                if (Boolean.parseBoolean((String) map.get("muted"))) {
                    zzc2.zzt();
                } else {
                    zzc2.zzu();
                }
            } else if ("pause".equals(str)) {
                zzc2.zzq();
            } else if ("play".equals(str)) {
                zzc2.zzr();
            } else if ("show".equals(str)) {
                zzc2.setVisibility(0);
            } else if ("src".equals(str)) {
                String str8 = (String) map.get("src");
                Integer num = null;
                if (map.containsKey("periodicReportIntervalMs")) {
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                    } catch (NumberFormatException unused6) {
                        String str9 = (String) map.get("periodicReportIntervalMs");
                        String.valueOf(str9).length();
                        zzcgt.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf(str9)));
                    }
                }
                String[] strArr = {str8};
                String str10 = (String) map.get("demuxed");
                if (str10 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str10);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            strArr2[i5] = jSONArray.getString(i5);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused7) {
                        zzcgt.zzi(str10.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(str10) : new String("Malformed demuxed URL list for playback: "));
                        strArr = new String[]{str8};
                    }
                }
                if (num != null) {
                    zzcjbVar2.zzo(num.intValue());
                }
                zzc2.zzn(str8, strArr);
            } else if ("touchMove".equals(str)) {
                Context context3 = zzcjbVar2.getContext();
                zzc2.zzo(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcjbVar2.zzl();
                this.zza = true;
            } else if ("volume".equals(str)) {
                String str11 = (String) map.get("volume");
                if (str11 == null) {
                    zzcgt.zzi("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    zzc2.zzv(Float.parseFloat(str11));
                } catch (NumberFormatException unused8) {
                    zzcgt.zzi(str11.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(str11) : new String("Could not parse volume parameter from volume video GMSG: "));
                }
            } else if ("watermark".equals(str)) {
                zzc2.zzC();
            } else {
                zzcgt.zzi(str.length() != 0 ? "Unknown video action: ".concat(str) : new String("Unknown video action: "));
            }
        }
    }
}
