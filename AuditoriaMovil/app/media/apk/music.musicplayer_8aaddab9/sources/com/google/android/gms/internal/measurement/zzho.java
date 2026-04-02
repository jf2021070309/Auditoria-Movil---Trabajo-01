package com.google.android.gms.internal.measurement;

import android.util.Log;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzho extends zzhu<Boolean> {
    public zzho(zzhr zzhrVar, String str, Boolean bool, boolean z) {
        super(zzhrVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* bridge */ /* synthetic */ Boolean zza(Object obj) {
        if (zzgv.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzgv.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String zzc = super.zzc();
        String str = (String) obj;
        Log.e("PhenotypeFlag", a.t(new StringBuilder(str.length() + String.valueOf(zzc).length() + 28), "Invalid boolean value for ", zzc, ": ", str));
        return null;
    }
}
