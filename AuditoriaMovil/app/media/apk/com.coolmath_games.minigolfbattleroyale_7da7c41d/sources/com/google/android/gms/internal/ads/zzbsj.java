package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbsj {
    public static void zza(zzbsk zzbskVar, String str, JSONObject jSONObject) {
        zzbskVar.zzbl(str, jSONObject.toString());
    }

    public static void zzb(zzbsk zzbskVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzbskVar.zza(sb.toString());
    }

    public static void zzc(zzbsk zzbskVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        com.google.android.gms.ads.internal.util.zze.zzd(sb2.length() != 0 ? "Dispatching AFMA event: ".concat(sb2) : new String("Dispatching AFMA event: "));
        zzbskVar.zza(sb.toString());
    }

    public static void zzd(zzbsk zzbskVar, String str, Map map) {
        try {
            zzbskVar.zzd(str, com.google.android.gms.ads.internal.zzt.zzc().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzi("Could not convert parameters to JSON.");
        }
    }
}
