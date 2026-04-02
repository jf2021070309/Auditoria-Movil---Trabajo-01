package com.google.android.gms.internal.ads;

import c.f.h;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzdmx {
    public static final zzdmx zza = new zzdmx(new zzdmv());
    private final zzbni zzb;
    private final zzbnf zzc;
    private final zzbnv zzd;
    private final zzbns zze;
    private final zzbsg zzf;
    private final h<String, zzbno> zzg;
    private final h<String, zzbnl> zzh;

    private zzdmx(zzdmv zzdmvVar) {
        this.zzb = zzdmvVar.zza;
        this.zzc = zzdmvVar.zzb;
        this.zzd = zzdmvVar.zzc;
        this.zzg = new h<>(zzdmvVar.zzf);
        this.zzh = new h<>(zzdmvVar.zzg);
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
        return this.zzg.getOrDefault(str, null);
    }

    public final zzbnl zzg(String str) {
        return this.zzh.getOrDefault(str, null);
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
        if (this.zzg.f1665g > 0) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList<String> zzi() {
        ArrayList<String> arrayList = new ArrayList<>(this.zzg.f1665g);
        int i2 = 0;
        while (true) {
            h<String, zzbno> hVar = this.zzg;
            if (i2 >= hVar.f1665g) {
                return arrayList;
            }
            arrayList.add(hVar.h(i2));
            i2++;
        }
    }
}
