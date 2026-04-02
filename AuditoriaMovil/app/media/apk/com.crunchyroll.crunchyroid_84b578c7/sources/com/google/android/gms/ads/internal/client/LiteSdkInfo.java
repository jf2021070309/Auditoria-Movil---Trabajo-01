package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbnt;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class LiteSdkInfo extends zzck {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzbnt getAdapterCreator() {
        return new zzbnq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public zzen getLiteSdkVersion() {
        return new zzen(231004600, 231004000, "22.1.0");
    }
}
