package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
@SafeParcelable.Class(creator = "AccountTransferMsgCreator")
/* loaded from: classes.dex */
public final class zzn extends zzbz {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();
    private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzc;
    @SafeParcelable.Indicator
    public final Set<Integer> zza;
    @SafeParcelable.VersionField(id = 1)
    public final int zzb;
    @SafeParcelable.Field(getter = "getAuthenticatorDatas", id = 2)
    private ArrayList<zzt> zzd;
    @SafeParcelable.Field(getter = "getRequestType", id = 3)
    private int zze;
    @SafeParcelable.Field(getter = "getProgress", id = 4)
    private zzr zzf;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        zzc = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzt.class));
        hashMap.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, zzr.class));
    }

    public zzn() {
        this.zza = new HashSet(1);
        this.zzb = 1;
    }

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Indicator Set<Integer> set, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) ArrayList<zzt> arrayList, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) zzr zzrVar) {
        this.zza = set;
        this.zzb = i2;
        this.zzd = arrayList;
        this.zze = i3;
        this.zzf = zzrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList<T> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()));
        }
        this.zzd = arrayList;
        this.zza.add(Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field field, String str, T t) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(safeParcelableFieldId), t.getClass().getCanonicalName()));
        }
        this.zzf = (zzr) t;
        this.zza.add(Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* bridge */ /* synthetic */ Map getFieldMappings() {
        return zzc;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 1) {
            if (safeParcelableFieldId != 2) {
                if (safeParcelableFieldId == 4) {
                    return this.zzf;
                }
                throw new IllegalStateException(a.R(37, "Unknown SafeParcelable id=", field.getSafeParcelableFieldId()));
            }
            return this.zzd;
        }
        return Integer.valueOf(this.zzb);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zza.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set<Integer> set = this.zza;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.zze);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel, 4, this.zzf, i2, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
