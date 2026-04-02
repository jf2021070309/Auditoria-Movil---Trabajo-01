package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* loaded from: classes.dex */
public final class zzr extends zzbz {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    private static final a<String, FastJsonResponse.Field<?, ?>> zzb;
    @SafeParcelable.VersionField(id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getRegisteredAccountTypes", id = 2)
    private List<String> zzc;
    @SafeParcelable.Field(getter = "getInProgressAccountTypes", id = 3)
    private List<String> zzd;
    @SafeParcelable.Field(getter = "getSuccessAccountTypes", id = 4)
    private List<String> zze;
    @SafeParcelable.Field(getter = "getFailedAccountTypes", id = 5)
    private List<String> zzf;
    @SafeParcelable.Field(getter = "getEscrowedAccountTypes", id = 6)
    private List<String> zzg;

    static {
        a<String, FastJsonResponse.Field<?, ?>> aVar = new a<>();
        zzb = aVar;
        aVar.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        aVar.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        aVar.put("success", FastJsonResponse.Field.forStrings("success", 4));
        aVar.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        aVar.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzr() {
        this.zza = 1;
    }

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) List<String> list, @SafeParcelable.Param(id = 3) List<String> list2, @SafeParcelable.Param(id = 4) List<String> list3, @SafeParcelable.Param(id = 5) List<String> list4, @SafeParcelable.Param(id = 6) List<String> list5) {
        this.zza = i2;
        this.zzc = list;
        this.zzd = list2;
        this.zze = list3;
        this.zzf = list4;
        this.zzg = list5;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map<String, FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zzb;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.zza);
            case 2:
                return this.zzc;
            case 3:
                return this.zzd;
            case 4:
                return this.zze;
            case 5:
                return this.zzf;
            case 6:
                return this.zzg;
            default:
                throw new IllegalStateException(e.a.d.a.a.R(37, "Unknown SafeParcelable id=", field.getSafeParcelableFieldId()));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field<?, ?> field, String str, ArrayList<String> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzc = arrayList;
        } else if (safeParcelableFieldId == 3) {
            this.zzd = arrayList;
        } else if (safeParcelableFieldId == 4) {
            this.zze = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.zzf = arrayList;
        } else if (safeParcelableFieldId != 6) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(safeParcelableFieldId)));
        } else {
            this.zzg = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeStringList(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzd, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.zze, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
