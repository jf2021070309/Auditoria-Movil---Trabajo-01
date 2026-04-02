package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbzo;
import java.util.Date;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
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
    protected final zzdx zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        protected final zzdw zza;

        public Builder() {
            zzdw zzdwVar = new zzdw();
            this.zza = zzdwVar;
            zzdwVar.zzv("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public Builder addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
            this.zza.zzq(cls, bundle);
            return this;
        }

        public Builder addKeyword(String str) {
            this.zza.zzs(str);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
            this.zza.zzt(cls, bundle);
            if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.zza.zzw("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }

        public AdRequest build() {
            return new AdRequest(this);
        }

        public Builder setAdString(String str) {
            this.zza.zzx(str);
            return this;
        }

        public Builder setContentUrl(String str) {
            boolean z;
            Preconditions.checkNotNull(str, "Content URL must be non-null.");
            Preconditions.checkNotEmpty(str, "Content URL must be non-empty.");
            int length = str.length();
            Object[] objArr = {Integer.valueOf((int) AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length())};
            if (length <= 512) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Content URL must not exceed %d in length.  Provided length was %d.", objArr);
            this.zza.zzz(str);
            return this;
        }

        public Builder setHttpTimeoutMillis(int i) {
            this.zza.zzB(i);
            return this;
        }

        public Builder setNeighboringContentUrls(List<String> list) {
            if (list == null) {
                zzbzo.zzj("neighboring content URLs list should not be null");
                return this;
            }
            this.zza.zzD(list);
            return this;
        }

        public Builder setRequestAgent(String str) {
            this.zza.zzF(str);
            return this;
        }

        @Deprecated
        public final Builder zza(String str) {
            this.zza.zzv(str);
            return this;
        }

        @Deprecated
        public final Builder zzb(Date date) {
            this.zza.zzy(date);
            return this;
        }

        @Deprecated
        public final Builder zzc(int i) {
            this.zza.zzA(i);
            return this;
        }

        @Deprecated
        public final Builder zzd(boolean z) {
            this.zza.zzC(z);
            return this;
        }

        @Deprecated
        public final Builder zze(boolean z) {
            this.zza.zzG(z);
            return this;
        }
    }

    public AdRequest(Builder builder) {
        this.zza = new zzdx(builder.zza, null);
    }

    public String getAdString() {
        return this.zza.zzj();
    }

    public String getContentUrl() {
        return this.zza.zzk();
    }

    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.zza.zzd(cls);
    }

    public Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    public Set<String> getKeywords() {
        return this.zza.zzq();
    }

    public List<String> getNeighboringContentUrls() {
        return this.zza.zzo();
    }

    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.zza.zzf(cls);
    }

    public String getRequestAgent() {
        return this.zza.zzm();
    }

    public boolean isTestDevice(Context context) {
        return this.zza.zzs(context);
    }

    public final zzdx zza() {
        return this.zza;
    }
}
