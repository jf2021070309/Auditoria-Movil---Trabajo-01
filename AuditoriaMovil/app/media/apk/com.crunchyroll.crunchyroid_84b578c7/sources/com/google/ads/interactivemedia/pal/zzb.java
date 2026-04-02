package com.google.ads.interactivemedia.pal;

import com.google.ads.interactivemedia.pal.ConsentSettings;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
final class zzb extends ConsentSettings.Builder {
    private Boolean zza;
    private Boolean zzb;
    private Boolean zzc;

    public zzb() {
    }

    public /* synthetic */ zzb(ConsentSettings consentSettings, zza zzaVar) {
        this.zza = consentSettings.zzc();
        this.zzb = consentSettings.zza();
        this.zzc = consentSettings.zzb();
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings.Builder
    public final ConsentSettings.Builder allowStorage(Boolean bool) {
        if (bool != null) {
            this.zzb = bool;
            return this;
        }
        throw new NullPointerException("Null allowStorage");
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings.Builder
    public final ConsentSettings build() {
        Boolean bool;
        Boolean bool2 = this.zzb;
        if (bool2 != null && (bool = this.zzc) != null) {
            return new zzd(this.zza, bool2, bool, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zzb == null) {
            sb.append(" allowStorage");
        }
        if (this.zzc == null) {
            sb.append(" directedForChildOrUnknownAge");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings.Builder
    public final ConsentSettings.Builder directedForChildOrUnknownAge(Boolean bool) {
        if (bool != null) {
            this.zzc = bool;
            return this;
        }
        throw new NullPointerException("Null directedForChildOrUnknownAge");
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings.Builder
    public final ConsentSettings.Builder enableCookiesFor3pServerSideAdInsertion(Boolean bool) {
        this.zza = bool;
        return this;
    }
}
