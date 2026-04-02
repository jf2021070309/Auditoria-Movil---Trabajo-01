package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public class ConsentRequestParameters {
    private final boolean zza;
    private final String zzb;
    private final ConsentDebugSettings zzc;

    /* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
    /* loaded from: classes3.dex */
    public static final class Builder {
        private boolean zza;
        private String zzb;
        private ConsentDebugSettings zzc;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(String str) {
            this.zzb = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(ConsentDebugSettings consentDebugSettings) {
            this.zzc = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z) {
            this.zza = z;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.zzc;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.zza;
    }

    @RecentlyNullable
    public final String zza() {
        return this.zzb;
    }
}
