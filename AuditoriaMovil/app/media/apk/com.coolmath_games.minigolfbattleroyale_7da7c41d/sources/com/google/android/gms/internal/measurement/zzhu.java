package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzhu implements zzhe {
    private static final Map<String, zzhu> zza = new ArrayMap();
    private final SharedPreferences zzb;
    private final SharedPreferences.OnSharedPreferenceChangeListener zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzhu zza(Context context, String str) {
        zzhu zzhuVar;
        if (!zzgw.zza()) {
            synchronized (zzhu.class) {
                zzhuVar = zza.get(null);
                if (zzhuVar == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return zzhuVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzb() {
        synchronized (zzhu.class) {
            Iterator<zzhu> it = zza.values().iterator();
            if (it.hasNext()) {
                zzhu next = it.next();
                SharedPreferences sharedPreferences = next.zzb;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = next.zzc;
                throw null;
            }
            zza.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final Object zze(String str) {
        throw null;
    }
}
