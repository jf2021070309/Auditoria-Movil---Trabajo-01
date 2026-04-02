package com.google.android.gms.cast.tv;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "CastLaunchRequestCreator")
/* loaded from: classes2.dex */
public class CastLaunchRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CastLaunchRequest> CREATOR = new zza();
    @SafeParcelable.Field(getter = "getCredentialsData", id = 1)
    private final CredentialsData zza;

    @SafeParcelable.Constructor
    public CastLaunchRequest(@SafeParcelable.Param(id = 1) CredentialsData credentialsData) {
        this.zza = credentialsData;
    }

    public static CastLaunchRequest zza(c cVar) {
        if (cVar == null) {
            return new CastLaunchRequest(null);
        }
        return new CastLaunchRequest(CredentialsData.fromJson(cVar.optJSONObject("credentialsData")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CastLaunchRequest)) {
            return false;
        }
        return Objects.equal(this.zza, ((CastLaunchRequest) obj).zza);
    }

    public CredentialsData getCredentialsData() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getCredentialsData(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
