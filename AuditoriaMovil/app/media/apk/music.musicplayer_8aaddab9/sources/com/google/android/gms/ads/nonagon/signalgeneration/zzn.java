package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfln;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final /* synthetic */ class zzn implements zzfln {
    public static final zzfln zza = new zzn();

    private zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final Object apply(Object obj) {
        int i2 = zzv.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
