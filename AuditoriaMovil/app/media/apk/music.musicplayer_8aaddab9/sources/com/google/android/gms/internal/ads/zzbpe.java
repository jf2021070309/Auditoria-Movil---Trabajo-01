package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbpe implements zzbpr<zzcml> {
    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        zzcml zzcmlVar2 = zzcmlVar;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzy = com.google.android.gms.ads.internal.util.zzs.zzy((WindowManager) zzcmlVar2.getContext().getSystemService("window"));
        int i2 = zzy.widthPixels;
        int i3 = zzy.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcmlVar2).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i2));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i3));
        zzcmlVar2.zze("locationReady", hashMap);
        zzcgt.zzi("GET LOCATION COMPILED");
    }
}
