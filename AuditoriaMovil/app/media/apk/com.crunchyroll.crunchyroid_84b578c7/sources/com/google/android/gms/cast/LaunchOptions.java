package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "LaunchOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LaunchOptions> CREATOR = new zzbw();
    @SafeParcelable.Field(getter = "getRelaunchIfRunning", id = 2)
    private boolean zza;
    @SafeParcelable.Field(getter = "getLanguage", id = 3)
    private String zzb;
    @SafeParcelable.Field(getter = "getAndroidReceiverCompatible", id = 4)
    private boolean zzc;
    @SafeParcelable.Field(getter = "getCredentialsData", id = 5)
    private CredentialsData zzd;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static final class Builder {
        private final LaunchOptions zza;

        public Builder() {
            this.zza = new LaunchOptions();
        }

        public LaunchOptions build() {
            return this.zza;
        }

        public Builder setAndroidReceiverCompatible(boolean z) {
            this.zza.zzb(z);
            return this;
        }

        public Builder setCredentialsData(CredentialsData credentialsData) {
            this.zza.zzd = credentialsData;
            return this;
        }

        public Builder setLocale(Locale locale) {
            this.zza.setLanguage(CastUtils.zzb(locale));
            return this;
        }

        public Builder setRelaunchIfRunning(boolean z) {
            this.zza.setRelaunchIfRunning(z);
            return this;
        }

        public Builder(LaunchOptions launchOptions) {
            this.zza = new LaunchOptions(launchOptions.getRelaunchIfRunning(), launchOptions.getLanguage(), launchOptions.getAndroidReceiverCompatible(), launchOptions.getCredentialsData());
        }
    }

    public LaunchOptions() {
        this(false, CastUtils.zzb(Locale.getDefault()), false, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        if (this.zza == launchOptions.zza && CastUtils.zze(this.zzb, launchOptions.zzb) && this.zzc == launchOptions.zzc && CastUtils.zze(this.zzd, launchOptions.zzd)) {
            return true;
        }
        return false;
    }

    public boolean getAndroidReceiverCompatible() {
        return this.zzc;
    }

    public CredentialsData getCredentialsData() {
        return this.zzd;
    }

    public String getLanguage() {
        return this.zzb;
    }

    public boolean getRelaunchIfRunning() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), this.zzb, Boolean.valueOf(this.zzc), this.zzd);
    }

    public void setLanguage(String str) {
        this.zzb = str;
    }

    public void setRelaunchIfRunning(boolean z) {
        this.zza = z;
    }

    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.zza), this.zzb, Boolean.valueOf(this.zzc));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, getRelaunchIfRunning());
        SafeParcelWriter.writeString(parcel, 3, getLanguage(), false);
        SafeParcelWriter.writeBoolean(parcel, 4, getAndroidReceiverCompatible());
        SafeParcelWriter.writeParcelable(parcel, 5, getCredentialsData(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(boolean z) {
        this.zzc = z;
    }

    @SafeParcelable.Constructor
    public LaunchOptions(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) boolean z2, @SafeParcelable.Param(id = 5) CredentialsData credentialsData) {
        this.zza = z;
        this.zzb = str;
        this.zzc = z2;
        this.zzd = credentialsData;
    }
}
