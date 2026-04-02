package com.google.android.gms.cast.tv;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "CastReceiverOptionsCreator")
/* loaded from: classes2.dex */
public class CastReceiverOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CastReceiverOptions> CREATOR = new zzo();
    @SafeParcelable.Field(getter = "getVersionCode", id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getStatusText", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getCustomNamespaces", id = 3)
    private final List zzc;
    @SafeParcelable.Field(getter = "getCastAppId", id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "isStreamTransferSupported", id = 5)
    private final boolean zze;
    private final LaunchRequestChecker zzf;

    /* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private String zzb;
        private int zzc;
        private String zzd;
        private List zza = new ArrayList();
        private LaunchRequestChecker zze = new LaunchRequestChecker() { // from class: com.google.android.gms.cast.tv.zzm
            @Override // com.google.android.gms.cast.tv.CastReceiverOptions.LaunchRequestChecker
            public final Task checkLaunchRequestSupported(CastLaunchRequest castLaunchRequest) {
                return Tasks.forResult(Boolean.TRUE);
            }
        };

        public Builder(Context context) {
            String str;
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                str = applicationInfo.name;
            } else {
                str = null;
            }
            this.zzb = str;
        }

        public CastReceiverOptions build() {
            return new CastReceiverOptions(this.zzc, this.zzb, this.zza, this.zzd, this.zze);
        }

        @ShowFirstParty
        @KeepForSdk
        public Builder setCastAppId(String str) {
            this.zzd = str;
            return this;
        }

        public Builder setCustomNamespaces(List<String> list) {
            Preconditions.checkNotNull(list);
            this.zza = list;
            return this;
        }

        public Builder setLaunchRequestChecker(LaunchRequestChecker launchRequestChecker) {
            Preconditions.checkNotNull(launchRequestChecker);
            this.zze = launchRequestChecker;
            return this;
        }

        public Builder setStatusText(String str) {
            this.zzb = str;
            return this;
        }

        public Builder setVersionCode(int i) {
            this.zzc = i;
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
    /* loaded from: classes2.dex */
    public interface LaunchRequestChecker {
        Task<Boolean> checkLaunchRequestSupported(CastLaunchRequest castLaunchRequest);
    }

    public List<String> getCustomNamespaces() {
        return this.zzc;
    }

    public LaunchRequestChecker getLaunchRequestChecker() {
        return this.zzf;
    }

    public String getStatusText() {
        return this.zzb;
    }

    public int getVersionCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getVersionCode());
        SafeParcelWriter.writeString(parcel, 2, getStatusText(), false);
        SafeParcelWriter.writeStringList(parcel, 3, getCustomNamespaces(), false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() {
        return this.zzd;
    }

    public final boolean zzb() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    public CastReceiverOptions(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) boolean z) {
        this(i, str, list, str2, z, new LaunchRequestChecker() { // from class: com.google.android.gms.cast.tv.zzl
            @Override // com.google.android.gms.cast.tv.CastReceiverOptions.LaunchRequestChecker
            public final Task checkLaunchRequestSupported(CastLaunchRequest castLaunchRequest) {
                return Tasks.forResult(Boolean.TRUE);
            }
        });
    }

    private CastReceiverOptions(int i, String str, List list, String str2, boolean z, LaunchRequestChecker launchRequestChecker) {
        this.zza = i;
        this.zzb = str;
        this.zzc = list;
        this.zzd = str2;
        this.zze = z;
        this.zzf = launchRequestChecker;
    }
}
