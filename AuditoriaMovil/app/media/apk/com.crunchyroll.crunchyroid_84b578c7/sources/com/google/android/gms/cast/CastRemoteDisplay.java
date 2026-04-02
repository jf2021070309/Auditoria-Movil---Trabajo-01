package com.google.android.gms.cast;

import android.content.Context;
import android.view.Display;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class CastRemoteDisplay {
    @Deprecated
    public static final Api<CastRemoteDisplayOptions> API;
    public static final int CONFIGURATION_INTERACTIVE_NONREALTIME = 2;
    public static final int CONFIGURATION_INTERACTIVE_REALTIME = 1;
    public static final int CONFIGURATION_NONINTERACTIVE = 3;
    @Deprecated
    public static final CastRemoteDisplayApi CastRemoteDisplayApi;
    public static final String EXTRA_INT_SESSION_ENDED_STATUS_CODE = "extra_int_session_ended_status_code";
    private static final Api.AbstractClientBuilder zza;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class CastRemoteDisplayOptions implements Api.ApiOptions.HasOptions {
        final CastDevice zza;
        final CastRemoteDisplaySessionCallbacks zzb;
        final int zzc;

        /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
        @Deprecated
        /* loaded from: classes2.dex */
        public static final class Builder {
            final CastDevice zza;
            final CastRemoteDisplaySessionCallbacks zzb;
            int zzc;

            public Builder(CastDevice castDevice, CastRemoteDisplaySessionCallbacks castRemoteDisplaySessionCallbacks) {
                Preconditions.checkNotNull(castDevice, "CastDevice parameter cannot be null");
                this.zza = castDevice;
                this.zzb = castRemoteDisplaySessionCallbacks;
                this.zzc = 2;
            }

            public CastRemoteDisplayOptions build() {
                return new CastRemoteDisplayOptions(this, null);
            }

            public Builder setConfigPreset(@Configuration int i) {
                this.zzc = i;
                return this;
            }
        }

        public /* synthetic */ CastRemoteDisplayOptions(Builder builder, zzy zzyVar) {
            this.zza = builder.zza;
            this.zzb = builder.zzb;
            this.zzc = builder.zzc;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface CastRemoteDisplaySessionCallbacks {
        void onRemoteDisplayEnded(Status status);
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface CastRemoteDisplaySessionResult extends Result {
        Display getPresentationDisplay();
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public @interface Configuration {
    }

    static {
        zzx zzxVar = new zzx();
        zza = zzxVar;
        Api<CastRemoteDisplayOptions> api = new Api<>("CastRemoteDisplay.API", zzxVar, com.google.android.gms.cast.internal.zzak.zzc);
        API = api;
        CastRemoteDisplayApi = new com.google.android.gms.internal.cast.zzdn(api);
    }

    private CastRemoteDisplay() {
    }

    public static CastRemoteDisplayClient getClient(Context context) {
        return new CastRemoteDisplayClient(context);
    }

    @Deprecated
    public static final boolean isRemoteDisplaySdkSupported(Context context) {
        return false;
    }
}
