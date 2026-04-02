package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbhn implements InitializationStatus {
    private final zzbhs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhn(zzbhs zzbhsVar) {
        this.zza = zzbhsVar;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map getAdapterStatusMap() {
        zzbhs zzbhsVar = this.zza;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new zzbho(zzbhsVar));
        return hashMap;
    }
}
