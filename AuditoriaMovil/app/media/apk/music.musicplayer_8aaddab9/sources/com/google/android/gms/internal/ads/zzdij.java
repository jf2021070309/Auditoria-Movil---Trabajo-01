package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzdij extends zzdgm<zzawd> implements zzawd {
    @GuardedBy("this")
    private final Map<View, zzawe> zzb;
    private final Context zzc;
    private final zzezz zzd;

    public zzdij(Context context, Set<zzdih<zzawd>> set, zzezz zzezzVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzezzVar;
    }

    public final synchronized void zza(View view) {
        zzawe zzaweVar = this.zzb.get(view);
        if (zzaweVar == null) {
            zzaweVar = new zzawe(this.zzc, view);
            zzaweVar.zza(this);
            this.zzb.put(view, zzaweVar);
        }
        if (this.zzd.zzT) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzaT)).booleanValue()) {
                zzaweVar.zze(((Long) zzbet.zzc().zzc(zzbjl.zzaS)).longValue());
                return;
            }
        }
        zzaweVar.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            this.zzb.get(view).zzb(this);
            this.zzb.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawd
    public final synchronized void zzc(final zzawc zzawcVar) {
        zzk(new zzdgl(zzawcVar) { // from class: com.google.android.gms.internal.ads.zzdii
            private final zzawc zza;

            {
                this.zza = zzawcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgl
            public final void zza(Object obj) {
                ((zzawd) obj).zzc(this.zza);
            }
        });
    }
}
