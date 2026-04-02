package com.google.android.gms.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.cast.CastRemoteDisplay;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzx extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        CastRemoteDisplay.CastRemoteDisplayOptions castRemoteDisplayOptions = (CastRemoteDisplay.CastRemoteDisplayOptions) obj;
        Bundle bundle = new Bundle();
        bundle.putInt("configuration", castRemoteDisplayOptions.zzc);
        return new com.google.android.gms.internal.cast.zzdq(context, looper, clientSettings, castRemoteDisplayOptions.zza, bundle, castRemoteDisplayOptions.zzb, connectionCallbacks, onConnectionFailedListener);
    }
}
