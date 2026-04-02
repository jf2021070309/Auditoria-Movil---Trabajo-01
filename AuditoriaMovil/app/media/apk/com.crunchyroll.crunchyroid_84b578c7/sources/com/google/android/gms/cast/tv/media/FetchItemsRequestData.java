package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "FetchItemsRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class FetchItemsRequestData extends AbstractSafeParcelable implements zzw {
    public static final Parcelable.Creator<FetchItemsRequestData> CREATOR = new zzd();
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getItemId", id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getNextCount", id = 4)
    private final Integer zzd;
    @SafeParcelable.Field(getter = "getPrevCount", id = 5)
    private final Integer zze;

    @SafeParcelable.Constructor
    public FetchItemsRequestData(@SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) Integer num, @SafeParcelable.Param(id = 5) Integer num2) {
        this(new zza(bundle), i, num, num2);
    }

    public static FetchItemsRequestData zza(c cVar) throws com.google.android.gms.internal.cast_tv.zzv {
        Integer num;
        if (cVar.has("itemId")) {
            int optInt = cVar.optInt("itemId");
            Integer num2 = null;
            if (cVar.has("prevCount")) {
                num = Integer.valueOf(cVar.optInt("prevCount"));
            } else {
                num = null;
            }
            if (cVar.has("nextCount")) {
                num2 = Integer.valueOf(cVar.optInt("nextCount"));
            }
            if (num != null && num.intValue() > 0 && num2 != null && num2.intValue() > 0) {
                throw new com.google.android.gms.internal.cast_tv.zzv("Invalid FetchItemsRequestData message: exactly one of prevCount and nextCount should be set");
            }
            return new FetchItemsRequestData(zza.zzb(cVar), optInt, num2, num);
        }
        throw new com.google.android.gms.internal.cast_tv.zzv("Invalid FetchItemsRequestData message: missing field itemId");
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    public int getItemId() {
        return this.zzc;
    }

    public Integer getNextCount() {
        return this.zzd;
    }

    public Integer getPrevCount() {
        return this.zze;
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, getItemId());
        SafeParcelWriter.writeIntegerObject(parcel, 4, getNextCount(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, getPrevCount(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    private FetchItemsRequestData(zza zzaVar, int i, Integer num, Integer num2) {
        this.zzb = zzaVar;
        this.zzc = i;
        this.zzd = num;
        this.zze = num2;
    }
}
