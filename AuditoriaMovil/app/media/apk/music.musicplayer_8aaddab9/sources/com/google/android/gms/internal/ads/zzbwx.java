package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbwx {
    public static int zza(AdRequest.ErrorCode errorCode) {
        AdRequest.ErrorCode errorCode2 = AdRequest.ErrorCode.INVALID_REQUEST;
        AdRequest.Gender gender = AdRequest.Gender.UNKNOWN;
        int ordinal = errorCode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return ordinal != 2 ? 0 : 2;
            }
            return 3;
        }
        return 1;
    }

    public static MediationAdRequest zzb(zzbdg zzbdgVar, boolean z) {
        List<String> list = zzbdgVar.zze;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(zzbdgVar.zzb);
        int i2 = zzbdgVar.zzd;
        return new MediationAdRequest(date, i2 != 1 ? i2 != 2 ? AdRequest.Gender.UNKNOWN : AdRequest.Gender.FEMALE : AdRequest.Gender.MALE, hashSet, z, zzbdgVar.zzk);
    }
}
