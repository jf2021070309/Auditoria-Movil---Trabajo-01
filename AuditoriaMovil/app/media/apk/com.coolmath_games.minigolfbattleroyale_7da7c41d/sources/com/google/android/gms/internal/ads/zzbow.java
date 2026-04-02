package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzbow implements zzbpr {
    static final zzbpr zza = new zzbow();

    private zzbow() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map map) {
        zzcnn zzcnnVar = (zzcnn) obj;
        zzbpr<zzcml> zzbprVar = zzbpq.zza;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfS)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcnnVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String obj2 = valueOf.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + obj2.length());
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(obj2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        ((zzbsi) zzcnnVar).zze("openableApp", hashMap);
    }
}
