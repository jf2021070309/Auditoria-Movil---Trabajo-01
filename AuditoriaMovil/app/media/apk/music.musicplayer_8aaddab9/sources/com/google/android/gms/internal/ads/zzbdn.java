package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "AdValueParcelCreator")
/* loaded from: classes.dex */
public final class zzbdn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbdn> CREATOR = new zzbdo();
    @SafeParcelable.Field(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final int zzb;
    @SafeParcelable.Field(id = 3)
    public final String zzc;
    @SafeParcelable.Field(id = 4)
    public final long zzd;

    @SafeParcelable.Constructor
    public zzbdn(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j2) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = str;
        this.zzd = j2;
    }

    public static zzbdn zza(JSONObject jSONObject) throws JSONException {
        return new zzbdn(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(AppLovinEventParameters.REVENUE_CURRENCY), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
