package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeqy implements zzery<zzeqz> {
    final String zza;
    private final zzfsn zzb;
    private final ScheduledExecutorService zzc;
    private final zzeke zzd;
    private final Context zze;
    private final zzfar zzf;
    private final zzejz zzg;
    private final zzdtf zzh;

    public zzeqy(zzfsn zzfsnVar, ScheduledExecutorService scheduledExecutorService, String str, zzeke zzekeVar, Context context, zzfar zzfarVar, zzejz zzejzVar, zzdtf zzdtfVar) {
        this.zzb = zzfsnVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzekeVar;
        this.zze = context;
        this.zzf = zzfarVar;
        this.zzg = zzejzVar;
        this.zzh = zzdtfVar;
    }

    private final zzfsm<JSONObject> zze(String str, List<Bundle> list, Bundle bundle, boolean z, boolean z2) throws RemoteException {
        zzbxn zzbxnVar;
        zzbxn zzc;
        zzchl zzchlVar = new zzchl();
        if (z2) {
            this.zzg.zza(str);
            zzc = this.zzg.zzb(str);
        } else {
            try {
                zzc = this.zzh.zzc(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Couldn't create RTB adapter : ", e);
                zzbxnVar = null;
            }
        }
        zzbxnVar = zzc;
        if (zzbxnVar == null) {
            throw null;
        }
        zzekh zzekhVar = new zzekh(str, zzbxnVar, zzchlVar);
        if (z) {
            zzbxnVar.zze(ObjectWrapper.wrap(this.zze), this.zza, bundle, list.get(0), this.zzf.zze, zzekhVar);
        } else {
            zzekhVar.zzb();
        }
        return zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeqz> zza() {
        return zzfsd.zze(new zzfrj(this) { // from class: com.google.android.gms.internal.ads.zzeqs
            private final zzeqy zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfrj
            public final zzfsm zza() {
                return this.zza.zzd();
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzb(String str, zzeki zzekiVar, Bundle bundle) throws Exception {
        return zze(str, Collections.singletonList(zzekiVar.zzd), bundle, zzekiVar.zzb, zzekiVar.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzc(String str, List list, Bundle bundle) throws Exception {
        return zze(str, list, bundle, true, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ zzfsm zzd() {
        Map<String, List<Bundle>> zzc = this.zzd.zzc(this.zza, this.zzf.zzf);
        final ArrayList arrayList = new ArrayList();
        Iterator<E> it = ((zzfon) zzc).entrySet().iterator();
        while (true) {
            final Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            final String str = (String) entry.getKey();
            final List list = (List) entry.getValue();
            Bundle bundle2 = this.zzf.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(zzfsd.zzf((zzfru) zzfsd.zzh(zzfru.zzw(zzfsd.zze(new zzfrj(this, str, list, bundle) { // from class: com.google.android.gms.internal.ads.zzeqt
                private final zzeqy zza;
                private final String zzb;
                private final List zzc;
                private final Bundle zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = str;
                    this.zzc = list;
                    this.zzd = bundle;
                }

                @Override // com.google.android.gms.internal.ads.zzfrj
                public final zzfsm zza() {
                    return this.zza.zzc(this.zzb, this.zzc, this.zzd);
                }
            }, this.zzb)), ((Long) zzbet.zzc().zzc(zzbjl.zzaX)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Throwable.class, new zzfln(str) { // from class: com.google.android.gms.internal.ads.zzequ
                private final String zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = str;
                }

                @Override // com.google.android.gms.internal.ads.zzfln
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    String valueOf = String.valueOf(this.zza);
                    com.google.android.gms.ads.internal.util.zze.zzf(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.zzb));
        }
        for (Map.Entry entry2 : ((zzfon) this.zzd.zzb()).entrySet()) {
            final zzeki zzekiVar = (zzeki) entry2.getValue();
            final String str2 = zzekiVar.zza;
            Bundle bundle3 = this.zzf.zzd.zzm;
            final Bundle bundle4 = bundle3 != null ? bundle3.getBundle(str2) : null;
            arrayList.add(zzfsd.zzf((zzfru) zzfsd.zzh(zzfru.zzw(zzfsd.zze(new zzfrj(this, str2, zzekiVar, bundle4) { // from class: com.google.android.gms.internal.ads.zzeqv
                private final zzeqy zza;
                private final String zzb;
                private final zzeki zzc;
                private final Bundle zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = str2;
                    this.zzc = zzekiVar;
                    this.zzd = bundle4;
                }

                @Override // com.google.android.gms.internal.ads.zzfrj
                public final zzfsm zza() {
                    return this.zza.zzb(this.zzb, this.zzc, this.zzd);
                }
            }, this.zzb)), ((Long) zzbet.zzc().zzc(zzbjl.zzaX)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Throwable.class, new zzfln(str2) { // from class: com.google.android.gms.internal.ads.zzeqw
                private final String zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = str2;
                }

                @Override // com.google.android.gms.internal.ads.zzfln
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    String valueOf = String.valueOf(this.zza);
                    com.google.android.gms.ads.internal.util.zze.zzf(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.zzb));
        }
        return zzfsd.zzo(arrayList).zza(new Callable(arrayList) { // from class: com.google.android.gms.internal.ads.zzeqx
            private final List zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = arrayList;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfsm> list2 = this.zza;
                JSONArray jSONArray = new JSONArray();
                for (zzfsm zzfsmVar : list2) {
                    if (((JSONObject) zzfsmVar.get()) != null) {
                        jSONArray.put(zzfsmVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzeqz(jSONArray.toString());
            }
        }, this.zzb);
    }
}
