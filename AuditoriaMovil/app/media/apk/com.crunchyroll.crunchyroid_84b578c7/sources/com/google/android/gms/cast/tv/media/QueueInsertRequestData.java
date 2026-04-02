package com.google.android.gms.cast.tv.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "QueueInsertRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class QueueInsertRequestData extends AbstractSafeParcelable implements zzw {
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getInsertBefore", id = 3)
    private final Integer zzd;
    @SafeParcelable.Field(getter = "getCurrentItemIndex", id = 4)
    private final Integer zze;
    @SafeParcelable.Field(getter = "getCurrentItemId", id = 5)
    private final Integer zzf;
    @SafeParcelable.Field(getter = "getCurrentTime", id = 6)
    private final Long zzg;
    @SafeParcelable.Field(getter = "getItems", id = 7)
    private final List zzh;
    private static final Logger zzc = new Logger("QueueInsReqData");
    public static final Parcelable.Creator<QueueInsertRequestData> CREATOR = new zzq();

    @SafeParcelable.Constructor
    public QueueInsertRequestData(@SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) Integer num, @SafeParcelable.Param(id = 4) Integer num2, @SafeParcelable.Param(id = 5) Integer num3, @SafeParcelable.Param(id = 6) Long l, @SafeParcelable.Param(id = 7) List list) {
        this(new zza(bundle), num, num2, num3, l, list);
    }

    public static QueueInsertRequestData zza(c cVar) {
        Integer num;
        Integer num2;
        Integer num3;
        Long l;
        ArrayList arrayList = new ArrayList();
        if (cVar.has("insertBefore")) {
            num = Integer.valueOf(cVar.optInt("insertBefore"));
        } else {
            num = null;
        }
        if (cVar.has("currentItemIndex")) {
            num2 = Integer.valueOf(cVar.optInt("currentItemIndex"));
        } else {
            num2 = null;
        }
        if (cVar.has("currentItemId")) {
            num3 = Integer.valueOf(cVar.optInt("currentItemId"));
        } else {
            num3 = null;
        }
        if (cVar.has("currentTime")) {
            l = Long.valueOf(CastUtils.secToMillisec(cVar.optLong("currentTime")));
        } else {
            l = null;
        }
        a optJSONArray = cVar.optJSONArray(FirebaseAnalytics.Param.ITEMS);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.e(); i++) {
                try {
                    arrayList.add(new MediaQueueItem(optJSONArray.j(i)));
                } catch (b e) {
                    zzc.w("Malformed MediaQueueItem, ignoring this one", e);
                }
            }
        }
        return new QueueInsertRequestData(zza.zzb(cVar), num, num2, num3, l, arrayList);
    }

    public Integer getCurrentItemId() {
        return this.zzf;
    }

    public Integer getCurrentItemIndex() {
        return this.zze;
    }

    public Long getCurrentTime() {
        return this.zzg;
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    public Integer getInsertBefore() {
        return this.zzd;
    }

    public List<MediaQueueItem> getItems() {
        return this.zzh;
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
        SafeParcelWriter.writeIntegerObject(parcel, 3, getInsertBefore(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 4, getCurrentItemIndex(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, getCurrentItemId(), false);
        SafeParcelWriter.writeLongObject(parcel, 6, getCurrentTime(), false);
        SafeParcelWriter.writeTypedList(parcel, 7, getItems(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    private QueueInsertRequestData(zza zzaVar, Integer num, Integer num2, Integer num3, Long l, List list) {
        this.zzb = zzaVar;
        this.zzd = num;
        this.zze = num2;
        this.zzf = num3;
        this.zzg = l;
        this.zzh = list;
    }
}
