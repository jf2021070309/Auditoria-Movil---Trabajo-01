package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdmx {
    public static final zzdmx zza = new zzdmx(new zzdmv());
    private final zzbni zzb;
    private final zzbnf zzc;
    private final zzbnv zzd;
    private final zzbns zze;
    private final zzbsg zzf;
    private final SimpleArrayMap<String, zzbno> zzg;
    private final SimpleArrayMap<String, zzbnl> zzh;

    private zzdmx(zzdmv zzdmvVar) {
        this.zzb = zzdmvVar.zza;
        this.zzc = zzdmvVar.zzb;
        this.zzd = zzdmvVar.zzc;
        this.zzg = new SimpleArrayMap<>(zzdmvVar.zzf);
        this.zzh = new SimpleArrayMap<>(zzdmvVar.zzg);
        this.zze = zzdmvVar.zzd;
        this.zzf = zzdmvVar.zze;
    }

    public final zzbni zza() {
        return this.zzb;
    }

    public final zzbnf zzb() {
        return this.zzc;
    }

    public final zzbnv zzc() {
        return this.zzd;
    }

    public final zzbns zzd() {
        return this.zze;
    }

    public final zzbsg zze() {
        return this.zzf;
    }

    public final zzbno zzf(String str) {
        return this.zzg.get(str);
    }

    public final zzbnl zzg(String str) {
        return this.zzh.get(str);
    }

    public final ArrayList<String> zzh() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (this.zzg.size() > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> zzi() {
        ArrayList<String> arrayList = new ArrayList<>(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add(this.zzg.keyAt(i));
        }
        return arrayList;
    }
}
