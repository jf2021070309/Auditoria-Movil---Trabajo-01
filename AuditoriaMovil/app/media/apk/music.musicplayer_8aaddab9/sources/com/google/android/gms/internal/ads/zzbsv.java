package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbsv implements zzbsn, zzbsk {
    private final zzcml zza;

    public zzbsv(Context context, zzcgz zzcgzVar, zzaas zzaasVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcmw {
        com.google.android.gms.ads.internal.zzt.zzd();
        zzcml zza = zzcmx.zza(context, zzcob.zzb(), "", false, false, null, null, zzcgzVar, null, null, null, zzazb.zza(), null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        zzber.zza();
        if (zzcgm.zzp()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zza(final String str) {
        zzs(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzbso
            private final zzbsv zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzbl(String str, String str2) {
        zzbsj.zzb(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzc(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable(this, format) { // from class: com.google.android.gms.internal.ads.zzbsp
            private final zzbsv zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = format;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zzd(String str, JSONObject jSONObject) {
        zzbsj.zzc(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final void zze(String str, Map map) {
        zzbsj.zzd(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzf(final String str) {
        zzs(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzbsr
            private final zzbsv zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzn(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzg(final String str) {
        zzs(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzbsq
            private final zzbsv zza;
            private final String zzb;

            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzh(zzbsm zzbsmVar) {
        this.zza.zzR().zzz(zzbst.zza(zzbsmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzi() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzj() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final zzbtu zzk() {
        return new zzbtu(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzl(String str, zzbpr<? super zzbtt> zzbprVar) {
        this.zza.zzab(str, new zzbsu(this, zzbprVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtt
    public final void zzm(String str, final zzbpr<? super zzbtt> zzbprVar) {
        this.zza.zzad(str, new Predicate(zzbprVar) { // from class: com.google.android.gms.internal.ads.zzbss
            private final zzbpr zza;

            {
                this.zza = zzbprVar;
            }

            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbpr zzbprVar2;
                zzbpr zzbprVar3 = this.zza;
                zzbpr zzbprVar4 = (zzbpr) obj;
                if (zzbprVar4 instanceof zzbsu) {
                    zzbprVar2 = ((zzbsu) zzbprVar4).zzb;
                    return zzbprVar2.equals(zzbprVar3);
                }
                return false;
            }
        });
    }

    public final /* synthetic */ void zzn(String str) {
        zzcml zzcmlVar = this.zza;
    }

    public final /* synthetic */ void zzo(String str) {
        zzcml zzcmlVar = this.zza;
    }

    public final /* synthetic */ void zzp(String str) {
        zzcml zzcmlVar = this.zza;
    }

    public final /* synthetic */ void zzq(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzr(String str, JSONObject jSONObject) {
        zzbsj.zza(this, str, jSONObject);
    }
}
