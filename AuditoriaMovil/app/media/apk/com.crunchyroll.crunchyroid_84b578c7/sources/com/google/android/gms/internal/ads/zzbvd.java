package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
@SafeParcelable.Class(creator = "RewardItemParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzbvd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvd> CREATOR = new zzbve();
    @SafeParcelable.Field(id = 2)
    public final String zza;
    @SafeParcelable.Field(id = 3)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzbvd(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        this.zza = str;
        this.zzb = i;
    }

    public static zzbvd zza(a aVar) throws b {
        if (aVar != null && aVar.e() != 0) {
            return new zzbvd(aVar.b(0).optString("rb_type"), aVar.b(0).optInt("rb_amount"));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvd)) {
            zzbvd zzbvdVar = (zzbvd) obj;
            if (Objects.equal(this.zza, zzbvdVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbvdVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
