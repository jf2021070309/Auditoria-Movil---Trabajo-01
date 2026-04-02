package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzbx;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public class ConsentDebugSettings {
    private final boolean zza;
    private final int zzb;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public static class Builder {
        private final Context zzb;
        private boolean zzd;
        private final List<String> zza = new ArrayList();
        private int zzc = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.zzb = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.zza.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            Context context = this.zzb;
            List<String> list = this.zza;
            boolean z = true;
            if (!zzbx.zzb() && !list.contains(zzbx.zza(context)) && !this.zzd) {
                z = false;
            }
            return new ConsentDebugSettings(z, this, null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i) {
            this.zzc = i;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z) {
            this.zzd = z;
            return this;
        }
    }

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z, Builder builder, zza zzaVar) {
        this.zza = z;
        this.zzb = builder.zzc;
    }

    public int getDebugGeography() {
        return this.zzb;
    }

    public boolean isTestDevice() {
        return this.zza;
    }
}
