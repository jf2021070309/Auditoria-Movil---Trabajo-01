package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final /* synthetic */ class zzbow implements zzbpr {
    public static final zzbpr zza = new zzbow();

    private zzbow() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map map) {
        zzcnn zzcnnVar = (zzcnn) obj;
        zzbpr<zzcml> zzbprVar = zzbpq.zza;
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfS)).booleanValue()) {
            zzcgt.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get("package_name");
        if (TextUtils.isEmpty(str)) {
            zzcgt.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap hashMap = new HashMap();
        Boolean valueOf = Boolean.valueOf(zzcnnVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        hashMap.put(str, valueOf);
        String obj2 = valueOf.toString();
        StringBuilder sb = new StringBuilder(obj2.length() + String.valueOf(str).length() + 13);
        sb.append("/canOpenApp;");
        sb.append(str);
        sb.append(";");
        sb.append(obj2);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        ((zzbsi) zzcnnVar).zze("openableApp", hashMap);
    }
}
