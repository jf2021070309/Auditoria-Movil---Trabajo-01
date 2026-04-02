package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzfln;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzn implements zzfln {
    static final zzfln zza = new zzn();

    private zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzfln
    public final Object apply(Object obj) {
        int i = zzv.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
