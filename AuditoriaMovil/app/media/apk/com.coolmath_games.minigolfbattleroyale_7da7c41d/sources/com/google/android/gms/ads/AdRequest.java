package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzcgt;
import java.util.Date;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public class AdRequest {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    protected final zzbhj zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
    /* loaded from: classes.dex */
    public static class Builder {
        protected final zzbhi zza;

        public Builder() {
            zzbhi zzbhiVar = new zzbhi();
            this.zza = zzbhiVar;
            zzbhiVar.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zza.zzv(cls, bundle);
            return this;
        }

        public Builder addKeyword(String str) {
            this.zza.zzs(str);
            return this;
        }

        @Deprecated
        public Builder addNetworkExtras(NetworkExtras networkExtras) {
            this.zza.zzt(networkExtras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            this.zza.zzu(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zza.zzx("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        @Deprecated
        public Builder setAdInfo(AdInfo adInfo) {
            this.zza.zzJ(adInfo);
            return this;
        }

        public Builder setAdString(String str) {
            this.zza.zzK(str);
            return this;
        }

        public Builder setContentUrl(String str) {
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            Preconditions.checkArgument(str.length() <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
            this.zza.zzz(str);
            return this;
        }

        public Builder setHttpTimeoutMillis(int i) {
            this.zza.zzL(i);
            return this;
        }

        public Builder setLocation(Location location) {
            this.zza.zzC(location);
            return this;
        }

        public Builder setNeighboringContentUrls(List<String> list) {
            if (list == null) {
                zzcgt.zzi("neighboring content URLs list should not be null");
                return this;
            }
            this.zza.zzA(list);
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.zza.zzE(str);
            return this;
        }

        @Deprecated
        public final Builder zza(String str) {
            this.zza.zzw(str);
            return this;
        }

        @Deprecated
        public final Builder zzb(Date date) {
            this.zza.zzy(date);
            return this;
        }

        @Deprecated
        public final Builder zzc(int i) {
            this.zza.zzB(i);
            return this;
        }

        @Deprecated
        public final Builder zzd(boolean z) {
            this.zza.zzF(z);
            return this;
        }

        @Deprecated
        public final Builder zze(boolean z) {
            this.zza.zzI(z);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AdRequest(Builder builder) {
        this.zza = new zzbhj(builder.zza, null);
    }

    public String getContentUrl() {
        return this.zza.zzb();
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zza.zzi(cls);
    }

    public Bundle getCustomTargeting() {
        return this.zza.zzq();
    }

    public Set<String> getKeywords() {
        return this.zza.zze();
    }

    public Location getLocation() {
        return this.zza.zzf();
    }

    public List<String> getNeighboringContentUrls() {
        return this.zza.zzc();
    }

    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zza.zzh(cls);
    }

    public boolean isTestDevice(Context context) {
        return this.zza.zzm(context);
    }

    public zzbhj zza() {
        return this.zza;
    }
}
