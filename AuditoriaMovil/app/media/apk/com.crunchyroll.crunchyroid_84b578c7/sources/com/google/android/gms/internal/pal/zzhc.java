package com.google.android.gms.internal.pal;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.ShowFirstParty;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzhc extends GoogleApi implements zzgx {
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;
    private static final Api zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzha zzhaVar = new zzha();
        zzb = zzhaVar;
        zzc = new Api("SignalSdk.API", zzhaVar, clientKey);
    }

    public zzhc(Context context) {
        super(context, zzc, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
