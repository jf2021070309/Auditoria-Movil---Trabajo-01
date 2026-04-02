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
@SafeParcelable.Class(creator = "QueueChangeResponseDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();
    @SafeParcelable.Field(getter = "getChangeType", id = 2)
    private final int zza;
    @SafeParcelable.Field(getter = "getItemIds", id = 3)
    private final List zzb;
    @SafeParcelable.Field(getter = "getInsertBefore", id = 4)
    private final Integer zzc;

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) List list, @SafeParcelable.Param(id = 4) Integer num) {
        this.zza = i;
        this.zzb = list;
        this.zzc = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeIntegerList(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeIntegerObject(parcel, 4, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final c zza() {
        String str;
        c cVar = new c();
        try {
            int i = this.zza;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                str = null;
                            } else {
                                str = "NO_CHANGE";
                            }
                        } else {
                            str = "UPDATE";
                        }
                    } else {
                        str = "ITEMS_CHANGE";
                    }
                } else {
                    str = "REMOVE";
                }
            } else {
                str = "INSERT";
            }
            cVar.putOpt("changeType", str);
            cVar.putOpt("insertBefore", this.zzc);
            cVar.putOpt("itemIds", zzaj.zzb(this.zzb));
        } catch (b unused) {
        }
        return cVar;
    }
}
