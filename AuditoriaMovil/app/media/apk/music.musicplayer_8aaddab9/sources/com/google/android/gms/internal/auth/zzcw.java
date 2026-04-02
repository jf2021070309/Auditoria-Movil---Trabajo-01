package com.google.android.gms.internal.auth;

import android.util.Base64;
import android.util.Log;
import e.a.d.a.a;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzcw extends zzcz {
    public final /* synthetic */ zzhl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzcx zzcxVar, String str, Object obj, boolean z, zzhl zzhlVar, byte[] bArr) {
        super(zzcxVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhlVar;
    }

    @Override // com.google.android.gms.internal.auth.zzcz
    public final Object zza(Object obj) {
        try {
            return zzhi.zzl(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            Log.e("PhenotypeFlag", a.t(new StringBuilder(String.valueOf(zzc).length() + 27 + str.length()), "Invalid byte[] value for ", zzc, ": ", str));
            return null;
        }
    }
}
