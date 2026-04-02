package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@SafeParcelable.Class(creator = "VastAdsRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class VastAdsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VastAdsRequest> CREATOR = new zzdt();
    @SafeParcelable.Field(getter = "getAdTagUrl", id = 2)
    private final String zza;
    @SafeParcelable.Field(getter = "getAdsResponse", id = 3)
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes2.dex */
    public static class Builder {
        private String zza;
        private String zzb;

        public VastAdsRequest build() {
            return new VastAdsRequest(this.zza, this.zzb);
        }

        public Builder setAdTagUrl(String str) {
            this.zza = str;
            return this;
        }

        public Builder setAdsResponse(String str) {
            this.zzb = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public VastAdsRequest(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static VastAdsRequest fromJson(c cVar) {
        if (cVar == null) {
            return null;
        }
        return new VastAdsRequest(CastUtils.optStringOrNull(cVar, "adTagUrl"), CastUtils.optStringOrNull(cVar, "adsResponse"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastAdsRequest)) {
            return false;
        }
        VastAdsRequest vastAdsRequest = (VastAdsRequest) obj;
        if (CastUtils.zze(this.zza, vastAdsRequest.zza) && CastUtils.zze(this.zzb, vastAdsRequest.zzb)) {
            return true;
        }
        return false;
    }

    public String getAdTagUrl() {
        return this.zza;
    }

    public String getAdsResponse() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, getAdTagUrl(), false);
        SafeParcelWriter.writeString(parcel, 3, getAdsResponse(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        c cVar = new c();
        try {
            String str = this.zza;
            if (str != null) {
                cVar.put("adTagUrl", str);
            }
            String str2 = this.zzb;
            if (str2 != null) {
                cVar.put("adsResponse", str2);
            }
        } catch (b unused) {
        }
        return cVar;
    }
}
