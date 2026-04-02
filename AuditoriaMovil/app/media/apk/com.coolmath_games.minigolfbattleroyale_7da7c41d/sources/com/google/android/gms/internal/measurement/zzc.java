package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzc {
    final zzf zza;
    zzg zzb;
    final zzab zzc;
    private final zzz zzd;

    public zzc() {
        zzf zzfVar = new zzf();
        this.zza = zzfVar;
        this.zzb = zzfVar.zzb.zzc();
        this.zzc = new zzab();
        this.zzd = new zzz();
        zzf zzfVar2 = this.zza;
        zzfVar2.zzd.zza("internal.registerCallback", new Callable(this) { // from class: com.google.android.gms.internal.measurement.zza
            private final zzc zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzg();
            }
        });
        zzf zzfVar3 = this.zza;
        zzfVar3.zzd.zza("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.zzb
            private final zzc zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(this.zza.zzc);
            }
        });
    }

    public final void zza(String str, Callable<? extends zzai> callable) {
        this.zza.zzd.zza(str, callable);
    }

    public final boolean zzb(zzaa zzaaVar) throws zzd {
        try {
            this.zzc.zzb(zzaaVar);
            this.zza.zzc.zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.zzd.zzb(this.zzb.zzc(), this.zzc);
            if (zzc()) {
                return true;
            }
            return zzd();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean zzc() {
        return !this.zzc.zzc().equals(this.zzc.zza());
    }

    public final boolean zzd() {
        return !this.zzc.zzf().isEmpty();
    }

    public final zzab zze() {
        return this.zzc;
    }

    public final void zzf(zzgo zzgoVar) throws zzd {
        zzai zzaiVar;
        try {
            this.zzb = this.zza.zzb.zzc();
            if (this.zza.zza(this.zzb, (zzgt[]) zzgoVar.zza().toArray(new zzgt[0])) instanceof zzag) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zzgm zzgmVar : zzgoVar.zzb().zza()) {
                List<zzgt> zzb = zzgmVar.zzb();
                String zza = zzgmVar.zza();
                Iterator<zzgt> it = zzb.iterator();
                while (it.hasNext()) {
                    zzap zza2 = this.zza.zza(this.zzb, it.next());
                    if (zza2 instanceof zzam) {
                        zzg zzgVar = this.zzb;
                        if (zzgVar.zzd(zza)) {
                            zzap zzh = zzgVar.zzh(zza);
                            if (zzh instanceof zzai) {
                                zzaiVar = (zzai) zzh;
                            } else {
                                String valueOf = String.valueOf(zza);
                                throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                            }
                        } else {
                            zzaiVar = null;
                        }
                        if (zzaiVar != null) {
                            zzaiVar.zza(this.zzb, Collections.singletonList(zza2));
                        } else {
                            String valueOf2 = String.valueOf(zza);
                            throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                }
            }
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzai zzg() throws Exception {
        return new zzu(this.zzd);
    }
}
