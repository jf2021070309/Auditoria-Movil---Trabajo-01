package com.google.android.gms.cast.tv.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.tv.internal.zzaj;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "QueueIdsResponseDataCreator")
/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field(getter = "getItemIds", id = 1)
    private final List zza;
    @SafeParcelable.Field(getter = "getRequestId", id = 2)
    private final long zzb;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) long j) {
        this.zza = list;
        this.zzb = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        c cVar = new c();
        try {
            cVar.putOpt("itemIds", zzaj.zzb(this.zza));
            cVar.put("requestId", this.zzb);
        } catch (b unused) {
        }
        return cVar;
    }
}
