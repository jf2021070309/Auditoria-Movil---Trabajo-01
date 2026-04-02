package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "QueueRemoveRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class QueueRemoveRequestData extends AbstractSafeParcelable implements zzw {
    public static final Parcelable.Creator<QueueRemoveRequestData> CREATOR = new zzt();
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getCurrentItemId", id = 3)
    private final Integer zzc;
    @SafeParcelable.Field(getter = "getCurrentTime", id = 4)
    private final Long zzd;
    @SafeParcelable.Field(getter = "getItemIds", id = 5)
    private final List zze;

    @SafeParcelable.Constructor
    public QueueRemoveRequestData(@SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) Integer num, @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) List list) {
        this(new zza(bundle), num, l, list);
    }

    public static QueueRemoveRequestData zza(c cVar) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        Long l = null;
        if (cVar.has("currentItemId")) {
            num = Integer.valueOf(cVar.optInt("currentItemId"));
        } else {
            num = null;
        }
        if (cVar.has("currentTime")) {
            l = Long.valueOf(CastUtils.secToMillisec(cVar.optLong("currentTime")));
        }
        a optJSONArray = cVar.optJSONArray("itemIds");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.e(); i++) {
                arrayList.add(Integer.valueOf(optJSONArray.g(i)));
            }
        }
        return new QueueRemoveRequestData(zza.zzb(cVar), num, l, arrayList);
    }

    public Integer getCurrentItemId() {
        return this.zzc;
    }

    public Long getCurrentTime() {
        return this.zzd;
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    public List<Integer> getItemIds() {
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
        SafeParcelWriter.writeIntegerObject(parcel, 3, getCurrentItemId(), false);
        SafeParcelWriter.writeLongObject(parcel, 4, getCurrentTime(), false);
        SafeParcelWriter.writeIntegerList(parcel, 5, getItemIds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    private QueueRemoveRequestData(zza zzaVar, Integer num, Long l, List list) {
        this.zzb = zzaVar;
        this.zzc = num;
        this.zzd = l;
        this.zze = list;
    }
}
