package com.google.ads.interactivemedia.pal;

import com.google.ads.interactivemedia.pal.ConsentSettings;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
final class zzd extends ConsentSettings {
    private final Boolean zza;
    private final Boolean zzb;
    private final Boolean zzc;

    public /* synthetic */ zzd(Boolean bool, Boolean bool2, Boolean bool3, zzc zzcVar) {
        this.zza = bool;
        this.zzb = bool2;
        this.zzc = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConsentSettings) {
            ConsentSettings consentSettings = (ConsentSettings) obj;
            Boolean bool = this.zza;
            if (bool != null ? bool.equals(consentSettings.zzc()) : consentSettings.zzc() == null) {
                if (this.zzb.equals(consentSettings.zza()) && this.zzc.equals(consentSettings.zzb())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Boolean bool = this.zza;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings
    public final ConsentSettings.Builder toBuilder() {
        return new zzb(this, null);
    }

    public final String toString() {
        Boolean bool = this.zza;
        Boolean bool2 = this.zzb;
        Boolean bool3 = this.zzc;
        return "ConsentSettings{enableCookiesFor3pServerSideAdInsertion=" + bool + ", allowStorage=" + bool2 + ", directedForChildOrUnknownAge=" + bool3 + "}";
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings
    public final Boolean zza() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings
    public final Boolean zzb() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.pal.ConsentSettings
    public final Boolean zzc() {
        return this.zza;
    }
}
