package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzcaw implements Parcelable.Creator<zzcav> {
    public static final zzcav zza(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j2 = 0;
        long j3 = 0;
        Bundle bundle = null;
        zzbdg zzbdgVar = null;
        zzbdl zzbdlVar = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        zzcgz zzcgzVar = null;
        Bundle bundle2 = null;
        ArrayList<String> arrayList = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        ArrayList<String> arrayList2 = null;
        String str7 = null;
        zzblv zzblvVar = null;
        ArrayList<String> arrayList3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        zzbhg zzbhgVar = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        ArrayList<Integer> arrayList4 = null;
        String str15 = null;
        ArrayList<String> arrayList5 = null;
        ArrayList<String> arrayList6 = null;
        String str16 = null;
        zzbrx zzbrxVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i8 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i9 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 3:
                    zzbdgVar = (zzbdg) SafeParcelReader.createParcelable(parcel, readHeader, zzbdg.CREATOR);
                    break;
                case 4:
                    zzbdlVar = (zzbdl) SafeParcelReader.createParcelable(parcel, readHeader, zzbdl.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel, readHeader, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel, readHeader, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 11:
                    zzcgzVar = (zzcgz) SafeParcelReader.createParcelable(parcel, readHeader, zzcgz.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 13:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 14:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 16:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 17:
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 19:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 20:
                    f2 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 25:
                    j2 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 26:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 27:
                    arrayList2 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 28:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 29:
                    zzblvVar = (zzblv) SafeParcelReader.createParcelable(parcel, readHeader, zzblv.CREATOR);
                    break;
                case 30:
                    arrayList3 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 31:
                    j3 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 33:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 34:
                    f3 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 35:
                    i6 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 36:
                    i7 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 37:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 39:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 40:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 41:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 42:
                    z4 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 43:
                    i8 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 45:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 46:
                    zzbhgVar = (zzbhg) SafeParcelReader.createParcelable(parcel, readHeader, zzbhg.CREATOR);
                    break;
                case 47:
                    z5 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case SyslogConstants.LOG_LPR /* 48 */:
                    bundle5 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 49:
                    str12 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 50:
                    str13 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 51:
                    str14 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 52:
                    z6 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 53:
                    arrayList4 = SafeParcelReader.createIntegerList(parcel, readHeader);
                    break;
                case 54:
                    str15 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    arrayList5 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case SyslogConstants.LOG_NEWS /* 56 */:
                    i9 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 57:
                    z7 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 58:
                    z8 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 59:
                    z9 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 60:
                    arrayList6 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 61:
                    str16 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 63:
                    zzbrxVar = (zzbrx) SafeParcelReader.createParcelable(parcel, readHeader, zzbrx.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzcav(i2, bundle, zzbdgVar, zzbdlVar, str, applicationInfo, packageInfo, str2, str3, str4, zzcgzVar, bundle2, i3, arrayList, bundle3, z, i4, i5, f2, str5, j2, str6, arrayList2, str7, zzblvVar, arrayList3, j3, str8, f3, z2, i6, i7, z3, str9, str10, z4, i8, bundle4, str11, zzbhgVar, z5, bundle5, str12, str13, str14, z6, arrayList4, str15, arrayList5, i9, z7, z8, z9, arrayList6, str16, zzbrxVar, str17, bundle6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzcav createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzcav[] newArray(int i2) {
        return new zzcav[i2];
    }
}
