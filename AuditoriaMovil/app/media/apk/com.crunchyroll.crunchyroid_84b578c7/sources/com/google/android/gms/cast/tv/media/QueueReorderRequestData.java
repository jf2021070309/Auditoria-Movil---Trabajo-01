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
@SafeParcelable.Class(creator = "QueueReorderRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class QueueReorderRequestData extends AbstractSafeParcelable implements zzw {
    public static final Parcelable.Creator<QueueReorderRequestData> CREATOR = new zzu();
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getCurrentItemId", id = 3)
    private final Integer zzc;
    @SafeParcelable.Field(getter = "getCurrentTime", id = 4)
    private final Long zzd;
    @SafeParcelable.Field(getter = "getInsertBefore", id = 5)
    private final Integer zze;
    @SafeParcelable.Field(getter = "getItemIds", id = 6)
    private final List zzf;

    @SafeParcelable.Constructor
    public QueueReorderRequestData(@SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) Integer num, @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) Integer num2, @SafeParcelable.Param(id = 6) List list) {
        this(new zza(bundle), num, l, num2, list);
    }

    public static QueueReorderRequestData zza(c cVar) {
        Integer num;
        Integer num2;
        Long l;
        ArrayList arrayList = new ArrayList();
        if (cVar.has("insertBefore")) {
            num = Integer.valueOf(cVar.optInt("insertBefore"));
        } else {
            num = null;
        }
        if (cVar.has("currentItemId")) {
            num2 = Integer.valueOf(cVar.optInt("currentItemId"));
        } else {
            num2 = null;
        }
        if (cVar.has("currentTime")) {
            l = Long.valueOf(CastUtils.secToMillisec(cVar.optLong("currentTime")));
        } else {
            l = null;
        }
        a optJSONArray = cVar.optJSONArray("itemIds");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.e(); i++) {
                arrayList.add(Integer.valueOf(optJSONArray.g(i)));
            }
        }
        return new QueueReorderRequestData(zza.zzb(cVar), num2, l, num, arrayList);
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

    public Integer getInsertBefore() {
        return this.zze;
    }

    public List<Integer> getItemIds() {
        return this.zzf;
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
        SafeParcelWriter.writeIntegerObject(parcel, 5, getInsertBefore(), false);
        SafeParcelWriter.writeIntegerList(parcel, 6, getItemIds(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    private QueueReorderRequestData(zza zzaVar, Integer num, Long l, Integer num2, List list) {
        this.zzb = zzaVar;
        this.zzc = num;
        this.zzd = l;
        this.zze = num2;
        this.zzf = list;
    }
}
