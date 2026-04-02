package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "GetItemsInfoRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zze extends AbstractSafeParcelable implements zzw {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getItemIds", id = 3)
    private final List zzc;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) List list) {
        this(new zza(bundle), list);
    }

    public static zze zza(c cVar) {
        ArrayList arrayList = new ArrayList();
        a optJSONArray = cVar.optJSONArray("itemIds");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.e(); i++) {
                arrayList.add(Integer.valueOf(optJSONArray.g(i)));
            }
        }
        return new zze(zza.zzb(cVar), arrayList);
    }

    @Override // com.google.android.gms.cast.RequestData
    public final c getCustomData() {
        return this.zzb.getCustomData();
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.writeIntegerList(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final List zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    public final void zzd(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    private zze(zza zzaVar, List list) {
        this.zzb = zzaVar;
        this.zzc = list;
    }
}
