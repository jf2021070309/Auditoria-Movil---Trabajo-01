package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzbov implements zzbpr {
    static final zzbpr zza = new zzbov();

    private zzbov() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map map) {
        zzcnn zzcnnVar = (zzcnn) obj;
        zzbpr<zzcml> zzbprVar = zzbpq.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzcnnVar.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str2, valueOf);
            String obj2 = valueOf.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + obj2.length());
            sb.append("/canOpenURLs;");
            sb.append(str2);
            sb.append(";");
            sb.append(obj2);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        ((zzbsi) zzcnnVar).zze("openableURLs", hashMap);
    }
}
