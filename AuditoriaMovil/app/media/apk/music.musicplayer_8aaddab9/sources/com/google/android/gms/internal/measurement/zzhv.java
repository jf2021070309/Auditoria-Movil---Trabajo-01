package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import c.f.a;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzhv implements zzhe {
    private static final Map<String, zzhv> zza = new a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static zzhv zza(Context context, String str) {
        zzhv zzhvVar;
        if (zzgw.zza()) {
            throw null;
        }
        synchronized (zzhv.class) {
            zzhvVar = zza.get(null);
            if (zzhvVar == null) {
                StrictMode.allowThreadDiskReads();
                throw null;
            }
        }
        return zzhvVar;
    }

    public static synchronized void zzc() {
        synchronized (zzhv.class) {
            Map<String, zzhv> map = zza;
            Iterator<zzhv> it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = it.next().zzb;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final Object zzb(String str) {
        throw null;
    }
}
