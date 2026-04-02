package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import c.f.a;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzda implements zzck {
    private static final Map<String, zzda> zza = new a();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static zzda zza(Context context, String str) {
        zzda zzdaVar;
        if (zzcc.zza()) {
            throw null;
        }
        synchronized (zzda.class) {
            zzdaVar = zza.get(null);
            if (zzdaVar == null) {
                StrictMode.allowThreadDiskReads();
                throw null;
            }
        }
        return zzdaVar;
    }

    public static synchronized void zzc() {
        synchronized (zzda.class) {
            Map<String, zzda> map = zza;
            Iterator<zzda> it = map.values().iterator();
            if (it.hasNext()) {
                SharedPreferences sharedPreferences = it.next().zzb;
                throw null;
            }
            map.clear();
        }
    }

    @Override // com.google.android.gms.internal.auth.zzck
    public final Object zzb(String str) {
        throw null;
    }
}
