package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import c.f.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzdmh extends zzcxg {
    private final Executor zzc;
    private final zzdmm zzd;
    private final zzdmu zze;
    private final zzdnl zzf;
    private final zzdmr zzg;
    private final zzdmx zzh;
    private final zzgku<zzdqm> zzi;
    private final zzgku<zzdqk> zzj;
    private final zzgku<zzdqr> zzk;
    private final zzgku<zzdqi> zzl;
    private final zzgku<zzdqp> zzm;
    private zzdog zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private final zzcei zzr;
    private final zzaas zzs;
    private final zzcgz zzt;
    private final Context zzu;
    private final zzdmj zzv;
    private final zzell zzw;
    private final Map<String, Boolean> zzx;
    private final List<zzawe> zzy;
    private final zzawf zzz;

    public zzdmh(zzcxf zzcxfVar, Executor executor, zzdmm zzdmmVar, zzdmu zzdmuVar, zzdnl zzdnlVar, zzdmr zzdmrVar, zzdmx zzdmxVar, zzgku<zzdqm> zzgkuVar, zzgku<zzdqk> zzgkuVar2, zzgku<zzdqr> zzgkuVar3, zzgku<zzdqi> zzgkuVar4, zzgku<zzdqp> zzgkuVar5, zzcei zzceiVar, zzaas zzaasVar, zzcgz zzcgzVar, Context context, zzdmj zzdmjVar, zzell zzellVar, zzawf zzawfVar) {
        super(zzcxfVar);
        this.zzc = executor;
        this.zzd = zzdmmVar;
        this.zze = zzdmuVar;
        this.zzf = zzdnlVar;
        this.zzg = zzdmrVar;
        this.zzh = zzdmxVar;
        this.zzi = zzgkuVar;
        this.zzj = zzgkuVar2;
        this.zzk = zzgkuVar3;
        this.zzl = zzgkuVar4;
        this.zzm = zzgkuVar5;
        this.zzr = zzceiVar;
        this.zzs = zzaasVar;
        this.zzt = zzcgzVar;
        this.zzu = context;
        this.zzv = zzdmjVar;
        this.zzw = zzellVar;
        this.zzx = new HashMap();
        this.zzy = new ArrayList();
        this.zzz = zzawfVar;
    }

    public static boolean zzC(View view) {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgS)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        long zzA = com.google.android.gms.ads.internal.util.zzs.zzA(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzA >= ((Integer) zzbet.zzc().zzc(zzbjl.zzgT)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzQ */
    public final synchronized void zzN(zzdog zzdogVar) {
        Iterator<String> keys;
        View view;
        zzaao zzb;
        if (this.zzo) {
            return;
        }
        this.zzn = zzdogVar;
        this.zzf.zza(zzdogVar);
        this.zze.zzd(zzdogVar.zzbx(), zzdogVar.zzk(), zzdogVar.zzl(), zzdogVar, zzdogVar);
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbK)).booleanValue() && (zzb = this.zzs.zzb()) != null) {
            zzb.zzn(zzdogVar.zzbx());
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbg)).booleanValue()) {
            zzezz zzezzVar = this.zzb;
            if (zzezzVar.zzah && (keys = zzezzVar.zzag.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference<View> weakReference = this.zzn.zzj().get(next);
                    this.zzx.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = weakReference.get()) != null) {
                        zzawe zzaweVar = new zzawe(this.zzu, view);
                        this.zzy.add(zzaweVar);
                        zzaweVar.zza(new zzdmg(this, next));
                    }
                }
            }
        }
        if (zzdogVar.zzh() != null) {
            zzdogVar.zzh().zza(this.zzr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzR */
    public final void zzM(zzdog zzdogVar) {
        this.zze.zze(zzdogVar.zzbx(), zzdogVar.zzj());
        if (zzdogVar.zzbt() != null) {
            zzdogVar.zzbt().setClickable(false);
            zzdogVar.zzbt().removeAllViews();
        }
        if (zzdogVar.zzh() != null) {
            zzdogVar.zzh().zzb(this.zzr);
        }
        this.zzn = null;
    }

    public final synchronized void zzA() {
        zzdog zzdogVar = this.zzn;
        if (zzdogVar == null) {
            zzcgt.zzd("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = zzdogVar instanceof zzdnf;
        this.zzc.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzdmf
            private final zzdmh zza;
            private final boolean zzb;

            {
                this.zza = this;
                this.zzb = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL(this.zzb);
            }
        });
    }

    public final synchronized boolean zzB() {
        return this.zze.zzk();
    }

    public final boolean zzD() {
        return this.zzg.zzc();
    }

    public final String zzE() {
        return this.zzg.zzf();
    }

    public final void zzF(String str, boolean z) {
        String str2;
        zzbzl zzbzlVar;
        zzbzm zzbzmVar;
        if (!this.zzg.zzd() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcml zzT = this.zzd.zzT();
        zzcml zzR = this.zzd.zzR();
        if (zzT == null && zzR == null) {
            return;
        }
        if (zzT != null) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzT = zzR;
        }
        String str3 = str2;
        if (!com.google.android.gms.ads.internal.zzt.zzr().zza(this.zzu)) {
            zzcgt.zzi("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzcgz zzcgzVar = this.zzt;
        int i2 = zzcgzVar.zzb;
        int i3 = zzcgzVar.zzc;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        String sb2 = sb.toString();
        if (zzR != null) {
            zzbzlVar = zzbzl.VIDEO;
            zzbzmVar = zzbzm.DEFINED_BY_JAVASCRIPT;
        } else {
            zzbzlVar = zzbzl.NATIVE_DISPLAY;
            zzbzmVar = this.zzd.zzv() == 3 ? zzbzm.UNSPECIFIED : zzbzm.ONE_PIXEL;
        }
        IObjectWrapper zze = com.google.android.gms.ads.internal.zzt.zzr().zze(sb2, zzT.zzG(), "", "javascript", str3, str, zzbzmVar, zzbzlVar, this.zzb.zzai);
        if (zze == null) {
            zzcgt.zzi("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.zzd.zzp(zze);
        zzT.zzak(zze);
        if (zzR != null) {
            com.google.android.gms.ads.internal.zzt.zzr().zzh(zze, zzR.zzH());
            this.zzq = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzr().zzf(zze);
            zzT.zze("onSdkLoaded", new a());
        }
    }

    public final boolean zzG() {
        return this.zzg.zzd();
    }

    public final void zzH(View view) {
        IObjectWrapper zzU = this.zzd.zzU();
        zzcml zzT = this.zzd.zzT();
        if (!this.zzg.zzd() || zzU == null || zzT == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzr().zzh(zzU, view);
    }

    public final void zzI(View view) {
        IObjectWrapper zzU = this.zzd.zzU();
        if (!this.zzg.zzd() || zzU == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzr().zzi(zzU, view);
    }

    public final zzdmj zzJ() {
        return this.zzv;
    }

    public final synchronized void zzK(zzbgw zzbgwVar) {
        this.zzw.zza(zzbgwVar);
    }

    public final /* synthetic */ void zzL(boolean z) {
        this.zze.zzi(this.zzn.zzbx(), this.zzn.zzj(), this.zzn.zzk(), z);
    }

    public final /* synthetic */ void zzO() {
        this.zze.zzA();
        this.zzd.zzZ();
    }

    public final /* bridge */ /* synthetic */ void zzP() {
        try {
            int zzv = this.zzd.zzv();
            if (zzv == 1) {
                if (this.zzh.zza() != null) {
                    zzF("Google", true);
                    this.zzh.zza().zze(this.zzi.zzb());
                }
            } else if (zzv == 2) {
                if (this.zzh.zzb() != null) {
                    zzF("Google", true);
                    this.zzh.zzb().zze(this.zzj.zzb());
                }
            } else if (zzv == 3) {
                if (this.zzh.zzf(this.zzd.zzQ()) != null) {
                    if (this.zzd.zzR() != null) {
                        zzF("Google", true);
                    }
                    this.zzh.zzf(this.zzd.zzQ()).zze(this.zzm.zzb());
                }
            } else if (zzv == 6) {
                if (this.zzh.zzc() != null) {
                    zzF("Google", true);
                    this.zzh.zzc().zze(this.zzk.zzb());
                }
            } else if (zzv != 7) {
                zzcgt.zzf("Wrong native template id!");
            } else if (this.zzh.zze() != null) {
                this.zzh.zze().zze(this.zzl.zzb());
            }
        } catch (RemoteException e2) {
            zzcgt.zzg("RemoteException when notifyAdLoad is called", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final void zzS() {
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdma
            private final zzdmh zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
        if (this.zzd.zzv() != 7) {
            Executor executor = this.zzc;
            zzdmu zzdmuVar = this.zze;
            zzdmuVar.getClass();
            executor.execute(zzdmb.zza(zzdmuVar));
        }
        super.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcxg
    public final synchronized void zzT() {
        this.zzo = true;
        this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdmc
            private final zzdmh zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO();
            }
        });
        super.zzT();
    }

    public final synchronized void zzc(String str) {
        this.zze.zzg(str);
    }

    public final synchronized void zze() {
        if (this.zzp) {
            return;
        }
        this.zze.zzq();
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zze.zzh(bundle);
    }

    public final synchronized boolean zzg(Bundle bundle) {
        if (this.zzp) {
            return true;
        }
        boolean zzz = this.zze.zzz(bundle);
        this.zzp = zzz;
        return zzz;
    }

    public final synchronized void zzh(Bundle bundle) {
        this.zze.zzn(bundle);
    }

    public final synchronized void zzj(final zzdog zzdogVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbe)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, zzdogVar) { // from class: com.google.android.gms.internal.ads.zzdmd
                private final zzdmh zza;
                private final zzdog zzb;

                {
                    this.zza = this;
                    this.zzb = zzdogVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzN(this.zzb);
                }
            });
        } else {
            zzN(zzdogVar);
        }
    }

    public final synchronized void zzk(final zzdog zzdogVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbe)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(this, zzdogVar) { // from class: com.google.android.gms.internal.ads.zzdme
                private final zzdmh zza;
                private final zzdog zzb;

                {
                    this.zza = this;
                    this.zzb = zzdogVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzM(this.zzb);
                }
            });
        } else {
            zzM(zzdogVar);
        }
    }

    public final synchronized void zzp(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.zzf.zzb(this.zzn);
        this.zze.zzf(view, view2, map, map2, z);
        if (this.zzq && this.zzd.zzR() != null) {
            this.zzd.zzR().zze("onSdkAdUserInteractionClick", new a());
        }
    }

    public final synchronized void zzq(View view, MotionEvent motionEvent, View view2) {
        this.zze.zzm(view, motionEvent, view2);
    }

    public final synchronized void zzr(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.zzp) {
            return;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbg)).booleanValue() && this.zzb.zzah) {
            for (String str : this.zzx.keySet()) {
                if (!this.zzx.get(str).booleanValue()) {
                    return;
                }
            }
        }
        if (z) {
            this.zzf.zzc(this.zzn);
            this.zze.zzx(view, map, map2);
            this.zzp = true;
            return;
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzcq)).booleanValue() && map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null && zzC(view2)) {
                    this.zzf.zzc(this.zzn);
                    this.zze.zzx(view, map, map2);
                    this.zzp = true;
                    return;
                }
            }
        }
    }

    public final synchronized JSONObject zzs(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.zze.zzo(view, map, map2);
    }

    public final synchronized JSONObject zzt(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.zze.zzp(view, map, map2);
    }

    public final synchronized void zzu(View view) {
        this.zze.zzr(view);
    }

    public final synchronized void zzv(zzbob zzbobVar) {
        this.zze.zzs(zzbobVar);
    }

    public final synchronized void zzw() {
        this.zze.zzt();
    }

    public final synchronized void zzx(zzbgm zzbgmVar) {
        this.zze.zzu(zzbgmVar);
    }

    public final synchronized void zzy(zzbgi zzbgiVar) {
        this.zze.zzv(zzbgiVar);
    }

    public final synchronized void zzz() {
        this.zze.zzj();
    }
}
