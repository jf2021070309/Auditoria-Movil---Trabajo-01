package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzha implements zzhe {
    private final ContentResolver zzc;
    private final Uri zzd;
    private volatile Map<String, String> zzg;
    private static final Map<Uri, zzha> zzb = new ArrayMap();
    public static final String[] zza = {SDKConstants.PARAM_KEY, "value"};
    private final ContentObserver zze = new zzgz(this, null);
    private final Object zzf = new Object();
    private final List<zzhb> zzh = new ArrayList();

    private zzha(ContentResolver contentResolver, Uri uri) {
        if (contentResolver == null) {
            throw null;
        }
        if (uri == null) {
            throw null;
        }
        this.zzc = contentResolver;
        this.zzd = uri;
        contentResolver.registerContentObserver(uri, false, this.zze);
    }

    public static zzha zza(ContentResolver contentResolver, Uri uri) {
        zzha zzhaVar;
        synchronized (zzha.class) {
            zzhaVar = zzb.get(uri);
            if (zzhaVar == null) {
                try {
                    zzha zzhaVar2 = new zzha(contentResolver, uri);
                    try {
                        zzb.put(uri, zzhaVar2);
                    } catch (SecurityException unused) {
                    }
                    zzhaVar = zzhaVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzhaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zzd() {
        synchronized (zzha.class) {
            for (zzha zzhaVar : zzb.values()) {
                zzhaVar.zzc.unregisterContentObserver(zzhaVar.zze);
            }
            zzb.clear();
        }
    }

    public final Map<String, String> zzb() {
        Map<String, String> map;
        Map<String, String> map2 = this.zzg;
        if (map2 == null) {
            synchronized (this.zzf) {
                map2 = this.zzg;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) zzhc.zza(new zzhd(this) { // from class: com.google.android.gms.internal.measurement.zzgy
                            private final zzha zza;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zza = this;
                            }

                            @Override // com.google.android.gms.internal.measurement.zzhd
                            public final Object zza() {
                                return this.zza.zzf();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.zzg = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    public final void zzc() {
        synchronized (this.zzf) {
            this.zzg = null;
            zzht.zzc();
        }
        synchronized (this) {
            for (zzhb zzhbVar : this.zzh) {
                zzhbVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhe
    public final /* bridge */ /* synthetic */ Object zze(String str) {
        return zzb().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Map zzf() {
        Map hashMap;
        Cursor query = this.zzc.query(this.zzd, zza, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new ArrayMap(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }
}
