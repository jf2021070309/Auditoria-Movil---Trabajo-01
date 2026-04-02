package com.google.android.gms.cast.tv;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.cast_tv.zzdq;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "SenderInfoCreator")
/* loaded from: classes2.dex */
public class SenderInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SenderInfo> CREATOR = new zzp();
    @SafeParcelable.Field(getter = "getSenderId", id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getUserAgent", id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getCastLaunchRequest", id = 3)
    private final CastLaunchRequest zzc;

    public SenderInfo(zzdq zzdqVar) {
        this.zza = zzdqVar.zzc();
        this.zzb = zzdqVar.zze();
        this.zzc = CastLaunchRequest.zza(CastUtils.jsonStringToJsonObject(zzdqVar.zzd()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SenderInfo)) {
            return false;
        }
        SenderInfo senderInfo = (SenderInfo) obj;
        if (Objects.equal(this.zza, senderInfo.zza) && Objects.equal(this.zzb, senderInfo.zzb) && Objects.equal(this.zzc, senderInfo.zzc)) {
            return true;
        }
        return false;
    }

    public CastLaunchRequest getCastLaunchRequest() {
        return this.zzc;
    }

    public String getSenderId() {
        return this.zza;
    }

    public String getUserAgent() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getSenderId(), false);
        SafeParcelWriter.writeString(parcel, 2, getUserAgent(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getCastLaunchRequest(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public SenderInfo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) CastLaunchRequest castLaunchRequest) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = castLaunchRequest;
    }
}
