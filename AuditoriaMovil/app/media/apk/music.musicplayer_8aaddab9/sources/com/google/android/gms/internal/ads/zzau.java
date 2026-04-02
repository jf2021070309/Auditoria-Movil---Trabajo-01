package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import e.a.d.a.a;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzau extends zzat {
    public final String zzc;
    public final Map<String, List<String>> zzd;
    public final byte[] zze;

    public zzau(int i2, String str, IOException iOException, Map<String, List<String>> map, zzan zzanVar, byte[] bArr) {
        super(a.R(26, "Response code: ", i2), iOException, zzanVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzc = str;
        this.zzd = map;
        this.zze = bArr;
    }
}
