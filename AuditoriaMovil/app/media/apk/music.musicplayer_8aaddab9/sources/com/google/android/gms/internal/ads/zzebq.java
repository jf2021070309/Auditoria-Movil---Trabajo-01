package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzebq extends zzcba {
    private final Context zza;
    private final Executor zzb;
    private final zzcbu zzc;
    private final zzcrz zzd;
    @GuardedBy("this")
    private final ArrayDeque<zzebn> zze;
    private final zzcbv zzf;
    private final zzebv zzg;

    /* JADX WARN: Multi-variable type inference failed */
    public zzebq(Context context, Context context2, Executor executor, zzcbv zzcbvVar, zzcrz zzcrzVar, zzcbu zzcbuVar, ArrayDeque<zzebn> arrayDeque, zzebv zzebvVar) {
        zzbjl.zza(context);
        this.zza = context;
        this.zzb = context2;
        this.zzf = executor;
        this.zzc = zzcrzVar;
        this.zzd = zzcbvVar;
        this.zze = zzcbuVar;
        this.zzg = arrayDeque;
    }

    private static zzfsm<JSONObject> zzl(zzcbj zzcbjVar, zzfes zzfesVar, final zzesq zzesqVar) {
        zzfrk zzfrkVar = new zzfrk(zzesqVar) { // from class: com.google.android.gms.internal.ads.zzebe
            private final zzesq zza;

            {
                this.zza = zzesqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zza().zza(com.google.android.gms.ads.internal.zzt.zzc().zzl((Bundle) obj));
            }
        };
        return zzfesVar.zze(zzfem.GMS_SIGNALS, zzfsd.zza(zzcbjVar.zza)).zzc(zzfrkVar).zzb(zzebf.zza).zzi();
    }

    private static zzfsm<zzcbm> zzm(zzfsm<JSONObject> zzfsmVar, zzfes zzfesVar, zzbug zzbugVar) {
        return zzfesVar.zze(zzfem.BUILD_URL, zzfsmVar).zzc(zzbugVar.zza("AFMA_getAdDictionary", zzbud.zza, zzebg.zza)).zzi();
    }

    private final void zzn(zzfsm<InputStream> zzfsmVar, zzcbf zzcbfVar) {
        zzfsd.zzp(zzfsd.zzi(zzfsmVar, new zzfrk(this) { // from class: com.google.android.gms.internal.ads.zzebk
            private final zzebq zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return zzfsd.zza(zzfbl.zza((InputStream) obj));
            }
        }, zzchg.zza), new zzebm(this, zzcbfVar), zzchg.zzf);
    }

    private final synchronized void zzo() {
        int intValue = zzbld.zzc.zze().intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final synchronized void zzp(zzebn zzebnVar) {
        zzo();
        this.zze.addLast(zzebnVar);
    }

    private final synchronized zzebn zzq(String str) {
        Iterator<zzebn> it = this.zze.iterator();
        while (it.hasNext()) {
            zzebn next = it.next();
            if (next.zzc.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    private final synchronized zzebn zzr(String str) {
        Iterator<zzebn> it = this.zze.iterator();
        while (it.hasNext()) {
            zzebn next = it.next();
            if (next.zzd.equals(str)) {
                it.remove();
                return next;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzfsm<java.io.InputStream> zzb(com.google.android.gms.internal.ads.zzcbj r12, int r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebq.zzb(com.google.android.gms.internal.ads.zzcbj, int):com.google.android.gms.internal.ads.zzfsm");
    }

    public final zzfsm<InputStream> zzc(final zzcbj zzcbjVar, int i2) {
        if (zzbld.zza.zze().booleanValue()) {
            zzfcj zzfcjVar = zzcbjVar.zzi;
            if (zzfcjVar == null) {
                return zzfsd.zzc(new Exception("Pool configuration missing from request."));
            }
            if (zzfcjVar.zzc == 0 || zzfcjVar.zzd == 0) {
                return zzfsd.zzc(new Exception("Caching is disabled."));
            }
            zzbug zza = com.google.android.gms.ads.internal.zzt.zzp().zza(this.zza, zzcgz.zza());
            zzesq zzA = this.zzd.zzA(zzcbjVar, i2);
            zzfes zzc = zzA.zzc();
            final zzfsm<JSONObject> zzl = zzl(zzcbjVar, zzc, zzA);
            final zzfsm<zzcbm> zzm = zzm(zzl, zzc, zza);
            return zzc.zzf(zzfem.GET_URL_AND_CACHE_KEY, zzl, zzm).zza(new Callable(this, zzm, zzl, zzcbjVar) { // from class: com.google.android.gms.internal.ads.zzebi
                private final zzebq zza;
                private final zzfsm zzb;
                private final zzfsm zzc;
                private final zzcbj zzd;

                {
                    this.zza = this;
                    this.zzb = zzm;
                    this.zzc = zzl;
                    this.zzd = zzcbjVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzj(this.zzb, this.zzc, this.zzd);
                }
            }).zzi();
        }
        return zzfsd.zzc(new Exception("Split request is disabled."));
    }

    public final zzfsm<InputStream> zzd(String str) {
        if (zzbld.zza.zze().booleanValue()) {
            zzebl zzeblVar = new zzebl(this);
            if ((zzbld.zzd.zze().booleanValue() ? zzq(str) : zzr(str)) == null) {
                String valueOf = String.valueOf(str);
                return zzfsd.zzc(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
            }
            return zzfsd.zza(zzeblVar);
        }
        return zzfsd.zzc(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zze(zzcbj zzcbjVar, zzcbf zzcbfVar) {
        zzfsm<InputStream> zzb = zzb(zzcbjVar, Binder.getCallingUid());
        zzn(zzb, zzcbfVar);
        zzb.zze(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzebh
            private final zzebq zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzf(zzcbj zzcbjVar, zzcbf zzcbfVar) {
        zzn(zzi(zzcbjVar, Binder.getCallingUid()), zzcbfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzg(zzcbj zzcbjVar, zzcbf zzcbfVar) {
        zzn(zzc(zzcbjVar, Binder.getCallingUid()), zzcbfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzh(String str, zzcbf zzcbfVar) {
        zzn(zzd(str), zzcbfVar);
    }

    public final zzfsm<InputStream> zzi(zzcbj zzcbjVar, int i2) {
        zzbug zza = com.google.android.gms.ads.internal.zzt.zzp().zza(this.zza, zzcgz.zza());
        if (zzbli.zza.zze().booleanValue()) {
            zzesq zzA = this.zzd.zzA(zzcbjVar, i2);
            final zzesb<JSONObject> zzb = zzA.zzb();
            return zzA.zzc().zze(zzfem.GET_SIGNALS, zzfsd.zza(zzcbjVar.zza)).zzc(new zzfrk(zzb) { // from class: com.google.android.gms.internal.ads.zzebj
                private final zzesb zza;

                {
                    this.zza = zzb;
                }

                @Override // com.google.android.gms.internal.ads.zzfrk
                public final zzfsm zza(Object obj) {
                    return this.zza.zza(com.google.android.gms.ads.internal.zzt.zzc().zzl((Bundle) obj));
                }
            }).zzj(zzfem.JS_SIGNALS).zzc(zza.zza("google.afma.request.getSignals", zzbud.zza, zzbud.zzb)).zzi();
        }
        return zzfsd.zzc(new Exception("Signal collection disabled."));
    }

    public final /* synthetic */ InputStream zzj(zzfsm zzfsmVar, zzfsm zzfsmVar2, zzcbj zzcbjVar) throws Exception {
        String zzi = ((zzcbm) zzfsmVar.get()).zzi();
        String str = zzcbjVar.zzh;
        zzp(new zzebn((zzcbm) zzfsmVar.get(), (JSONObject) zzfsmVar2.get(), str, zzi));
        return new ByteArrayInputStream(zzi.getBytes(zzfll.zzc));
    }

    public final /* synthetic */ void zzk() {
        zzchj.zza(this.zzc.zza(), "persistFlags");
    }
}
