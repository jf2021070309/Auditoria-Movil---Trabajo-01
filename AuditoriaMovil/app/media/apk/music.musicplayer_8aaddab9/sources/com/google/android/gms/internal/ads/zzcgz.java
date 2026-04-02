package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzcgz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcgz> CREATOR = new zzcha();
    @SafeParcelable.Field(id = 2)
    public String zza;
    @SafeParcelable.Field(id = 3)
    public int zzb;
    @SafeParcelable.Field(id = 4)
    public int zzc;
    @SafeParcelable.Field(id = 5)
    public boolean zzd;
    @SafeParcelable.Field(id = 6)
    public boolean zze;

    public zzcgz(int i2, int i3, boolean z, boolean z2) {
        this(213806000, i3, true, false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzcgz(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L5
            java.lang.String r11 = "0"
            goto L7
        L5:
            java.lang.String r11 = "1"
        L7:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r0 = r11.length()
            int r0 = r0 + 36
            r12.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r12.append(r0)
            r12.append(r8)
            java.lang.String r0 = "."
            r12.append(r0)
            r12.append(r9)
            java.lang.String r2 = e.a.d.a.a.r(r12, r0, r11)
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgz.<init>(int, int, boolean, boolean, boolean):void");
    }

    @SafeParcelable.Constructor
    public zzcgz(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
        this.zze = z2;
    }

    public static zzcgz zza() {
        return new zzcgz((int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, (int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
