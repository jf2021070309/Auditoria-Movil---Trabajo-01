package com.google.android.gms.cast.tv.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "QueueItemsInfoResponseDataCreator")
/* loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    @SafeParcelable.Field(getter = "getItems", id = 1)
    private final List zza;
    @SafeParcelable.Field(getter = "getRequestId", id = 2)
    private final long zzb;

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) long j) {
        this.zza = list;
        this.zzb = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        a aVar = new a();
        for (MediaQueueItem mediaQueueItem : this.zza) {
            aVar.put(mediaQueueItem.toJson());
        }
        c cVar = new c();
        try {
            cVar.put(FirebaseAnalytics.Param.ITEMS, aVar);
            cVar.put("requestId", this.zzb);
        } catch (b unused) {
        }
        return cVar;
    }
}
