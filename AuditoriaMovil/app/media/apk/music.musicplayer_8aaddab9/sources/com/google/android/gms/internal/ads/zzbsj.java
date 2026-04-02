package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final /* synthetic */ class zzbsj {
    public static void zza(zzbsk zzbskVar, String str, JSONObject jSONObject) {
        zzbskVar.zzbl(str, jSONObject.toString());
    }

    public static void zzb(zzbsk zzbskVar, String str, String str2) {
        zzbskVar.zza(a.t(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, "(", str2, ");"));
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
        zzcgt.zzd(sb2.length() != 0 ? "Dispatching AFMA event: ".concat(sb2) : new String("Dispatching AFMA event: "));
        zzbskVar.zza(sb.toString());
    }

    public static void zzd(zzbsk zzbskVar, String str, Map map) {
        try {
            zzbskVar.zzd(str, com.google.android.gms.ads.internal.zzt.zzc().zzj(map));
        } catch (JSONException unused) {
            zzcgt.zzi("Could not convert parameters to JSON.");
        }
    }
}
