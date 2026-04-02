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
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
@SafeParcelable.Class(creator = "QueueUpdateRequestDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class QueueUpdateRequestData extends AbstractSafeParcelable implements zzw {
    @SafeParcelable.Field(id = 2)
    Bundle zza;
    zza zzb;
    @SafeParcelable.Field(getter = "getCurrentItemId", id = 3)
    private final Integer zzd;
    @SafeParcelable.Field(getter = "getCurrentTime", id = 4)
    private final Long zze;
    @SafeParcelable.Field(getter = "getJump", id = 5)
    private final Integer zzf;
    @SafeParcelable.Field(getter = "getItems", id = 6)
    private final List zzg;
    @SafeParcelable.Field(getter = "getRepeatMode", id = 7)
    private final Integer zzh;
    @SafeParcelable.Field(getter = "getShuffle", id = 8)
    private final Boolean zzi;
    private static final Logger zzc = new Logger("QueueUpdateReqData");
    public static final Parcelable.Creator<QueueUpdateRequestData> CREATOR = new zzv();

    @SafeParcelable.Constructor
    public QueueUpdateRequestData(@SafeParcelable.Param(id = 2) Bundle bundle, @SafeParcelable.Param(id = 3) Integer num, @SafeParcelable.Param(id = 4) Long l, @SafeParcelable.Param(id = 5) Integer num2, @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 7) Integer num3, @SafeParcelable.Param(id = 8) Boolean bool) {
        this(new zza(bundle), num, l, num2, list, num3, bool);
    }

    public static QueueUpdateRequestData zza(c cVar) {
        Integer num;
        Long l;
        Integer num2;
        ArrayList arrayList;
        Integer num3;
        Boolean bool = null;
        if (cVar.has("currentItemId")) {
            num = Integer.valueOf(cVar.optInt("currentItemId"));
        } else {
            num = null;
        }
        if (cVar.has("currentTime")) {
            l = Long.valueOf(CastUtils.secToMillisec(cVar.optLong("currentTime")));
        } else {
            l = null;
        }
        if (cVar.has("jump")) {
            num2 = Integer.valueOf(cVar.optInt("jump"));
        } else {
            num2 = null;
        }
        a optJSONArray = cVar.optJSONArray(FirebaseAnalytics.Param.ITEMS);
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < optJSONArray.e(); i++) {
                try {
                    arrayList2.add(new MediaQueueItem(optJSONArray.j(i)));
                } catch (b e) {
                    zzc.w("Malformed MediaQueueItem, ignoring this one", e);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (cVar.has("repeatMode")) {
            num3 = MediaCommon.mediaRepeatModeFromString(cVar.optString("repeatMode"));
        } else {
            num3 = null;
        }
        if (cVar.has("shuffle")) {
            bool = Boolean.valueOf(cVar.optBoolean("shuffle"));
        }
        return new QueueUpdateRequestData(zza.zzb(cVar), num, l, num2, arrayList, num3, bool);
    }

    public Integer getCurrentItemId() {
        return this.zzd;
    }

    public Long getCurrentTime() {
        return this.zze;
    }

    @Override // com.google.android.gms.cast.RequestData
    public c getCustomData() {
        return this.zzb.getCustomData();
    }

    public List<MediaQueueItem> getItems() {
        return this.zzg;
    }

    public Integer getJump() {
        return this.zzf;
    }

    public Integer getRepeatMode() {
        return this.zzh;
    }

    @Override // com.google.android.gms.cast.RequestData
    public final long getRequestId() {
        return this.zzb.getRequestId();
    }

    public Boolean getShuffle() {
        return this.zzi;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.zza = this.zzb.zza();
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.zza, false);
        SafeParcelWriter.writeIntegerObject(parcel, 3, getCurrentItemId(), false);
        SafeParcelWriter.writeLongObject(parcel, 4, getCurrentTime(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, getJump(), false);
        SafeParcelWriter.writeTypedList(parcel, 6, getItems(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 7, getRepeatMode(), false);
        SafeParcelWriter.writeBooleanObject(parcel, 8, getShuffle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final void zzb(com.google.android.gms.internal.cast_tv.zzl zzlVar) {
        this.zzb.zzd(zzlVar);
    }

    @Override // com.google.android.gms.cast.tv.media.zzw
    public final com.google.android.gms.internal.cast_tv.zzl zzc() {
        return this.zzb.zzc();
    }

    private QueueUpdateRequestData(zza zzaVar, Integer num, Long l, Integer num2, List list, Integer num3, Boolean bool) {
        this.zzb = zzaVar;
        this.zzd = num;
        this.zze = l;
        this.zzf = num2;
        this.zzg = list;
        this.zzh = num3;
        this.zzi = bool;
    }
}
