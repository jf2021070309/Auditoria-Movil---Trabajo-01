package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.ShowFirstParty;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzor extends GoogleApi implements zzok {
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzoo zzooVar = new zzoo();
        zzb = zzooVar;
        zzc = new Api("SignalSdk.API", zzooVar, clientKey);
    }

    public zzor(Context context) {
        super(context, zzc, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
