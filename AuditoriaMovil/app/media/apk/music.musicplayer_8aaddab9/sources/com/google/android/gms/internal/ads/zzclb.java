package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzclb implements zzbpr<zzcjb> {
    private static final Integer zzb(Map<String, String> map, String str) {
        if (map.containsKey(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(map.get(str)));
            } catch (NumberFormatException unused) {
                String str2 = map.get(str);
                StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
                sb.append("Precache invalid numeric parameter '");
                sb.append(str);
                sb.append("': ");
                sb.append(str2);
                zzcgt.zzi(sb.toString());
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcjb zzcjbVar, Map map) {
        zzcla zzclaVar;
        zzcks zzb;
        zzcjb zzcjbVar2 = zzcjbVar;
        if (zzcgt.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            zzcgt.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzckt zzy = com.google.android.gms.ads.internal.zzt.zzy();
        if (map.containsKey("abort")) {
            if (zzy.zza(zzcjbVar2)) {
                return;
            }
            zzcgt.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb2 = zzb(map, "periodicReportIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb4 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcja zzcjaVar = new zzcja((String) map.get("flags"));
        boolean z = zzcjaVar.zzn;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        strArr2[i2] = jSONArray.getString(i2);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    zzcgt.zzi(str2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(str2) : new String("Malformed demuxed URL list for precache: "));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator<zzcks> it = zzy.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzb = null;
                        break;
                    }
                    zzcks next = it.next();
                    if (next.zza == zzcjbVar2 && str.equals(next.zzd())) {
                        zzb = next;
                        break;
                    }
                }
            } else {
                zzb = zzy.zzb(zzcjbVar2);
            }
            if (zzb != null) {
                zzcgt.zzi("Precache task is already running.");
                return;
            } else if (zzcjbVar2.zzk() == null) {
                zzcgt.zzi("Precache requires a dependency provider.");
                return;
            } else {
                Integer zzb5 = zzb(map, "player");
                if (zzb5 == null) {
                    zzb5 = 0;
                }
                if (zzb2 != null) {
                    zzcjbVar2.zzo(zzb2.intValue());
                }
                if (zzb3 != null) {
                    zzcjbVar2.zzB(zzb3.intValue());
                }
                if (zzb4 != null) {
                    zzcjbVar2.zzC(zzb4.intValue());
                }
                int intValue = zzb5.intValue();
                zzckm zzckmVar = zzcjbVar2.zzk().zzc;
                if (intValue > 0) {
                    int zzQ = zzcis.zzQ();
                    zzclaVar = zzQ < zzcjaVar.zzh ? new zzclj(zzcjbVar2, zzcjaVar) : zzQ < zzcjaVar.zzb ? new zzclg(zzcjbVar2, zzcjaVar) : new zzcle(zzcjbVar2);
                } else {
                    zzclaVar = new zzcld(zzcjbVar2);
                }
                new zzcks(zzcjbVar2, zzclaVar, str, strArr).zzc();
            }
        } else {
            zzcks zzb6 = zzy.zzb(zzcjbVar2);
            if (zzb6 == null) {
                zzcgt.zzi("Precache must specify a source.");
                return;
            }
            zzclaVar = zzb6.zzb;
        }
        Integer zzb7 = zzb(map, "minBufferMs");
        if (zzb7 != null) {
            zzclaVar.zzh(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "maxBufferMs");
        if (zzb8 != null) {
            zzclaVar.zzg(zzb8.intValue());
        }
        Integer zzb9 = zzb(map, "bufferForPlaybackMs");
        if (zzb9 != null) {
            zzclaVar.zzi(zzb9.intValue());
        }
        Integer zzb10 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb10 != null) {
            zzclaVar.zzl(zzb10.intValue());
        }
    }
}
