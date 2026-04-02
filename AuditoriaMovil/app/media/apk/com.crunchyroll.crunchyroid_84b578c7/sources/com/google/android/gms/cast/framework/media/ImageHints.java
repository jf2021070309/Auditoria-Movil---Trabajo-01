package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
@SafeParcelable.Class(creator = "ImageHintsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public class ImageHints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ImageHints> CREATOR = new zzh();
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zza;
    @SafeParcelable.Field(getter = "getWidthInPixels", id = 3)
    private final int zzb;
    @SafeParcelable.Field(getter = "getHeightInPixels", id = 4)
    private final int zzc;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ImageHints(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public int getHeightInPixels() {
        return this.zzc;
    }

    public int getType() {
        return this.zza;
    }

    public int getWidthInPixels() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getType());
        SafeParcelWriter.writeInt(parcel, 3, getWidthInPixels());
        SafeParcelWriter.writeInt(parcel, 4, getHeightInPixels());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
