package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class zzfrd<InputT, OutputT> extends zzfri<OutputT> {
    private static final Logger zza = Logger.getLogger(zzfrd.class.getName());
    @CheckForNull
    private zzfoe<? extends zzfsm<? extends InputT>> zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzfrd(zzfoe<? extends zzfsm<? extends InputT>> zzfoeVar, boolean z, boolean z2) {
        super(zzfoeVar.size());
        this.zzb = zzfoeVar;
        this.zzc = z;
        this.zzd = z2;
    }

    private final void zzJ(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zzq(th) && zzM(zzG(), th)) {
            zzK(th);
        } else if (th instanceof Error) {
            zzK(th);
        }
    }

    private static void zzK(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzL(int i2, Future<? extends InputT> future) {
        try {
            zzz(i2, zzfsd.zzq(future));
        } catch (ExecutionException e2) {
            zzJ(e2.getCause());
        } catch (Throwable th) {
            zzJ(th);
        }
    }

    private static boolean zzM(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public static /* synthetic */ zzfoe zza(zzfrd zzfrdVar, zzfoe zzfoeVar) {
        zzfrdVar.zzb = null;
        return null;
    }

    public static /* synthetic */ void zzy(zzfrd zzfrdVar, zzfoe zzfoeVar) {
        int zzH = zzfrdVar.zzH();
        int i2 = 0;
        zzflx.zzb(zzH >= 0, "Less than 0 remaining futures");
        if (zzH == 0) {
            if (zzfoeVar != null) {
                zzfql it = zzfoeVar.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzfrdVar.zzL(i2, future);
                    }
                    i2++;
                }
            }
            zzfrdVar.zzI();
            zzfrdVar.zzA();
            zzfrdVar.zzB(2);
        }
    }

    public abstract void zzA();

    public void zzB(int i2) {
        this.zzb = null;
    }

    public final void zzb() {
        zzfoe<? extends zzfsm<? extends InputT>> zzfoeVar = this.zzb;
        zzfoeVar.getClass();
        if (zzfoeVar.isEmpty()) {
            zzA();
        } else if (!this.zzc) {
            zzfrc zzfrcVar = new zzfrc(this, this.zzd ? this.zzb : null);
            zzfql<? extends zzfsm<? extends InputT>> it = this.zzb.iterator();
            while (it.hasNext()) {
                it.next().zze(zzfrcVar, zzfrr.INSTANCE);
            }
        } else {
            zzfql<? extends zzfsm<? extends InputT>> it2 = this.zzb.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                zzfsm<? extends InputT> next = it2.next();
                next.zze(new zzfrb(this, next, i2), zzfrr.INSTANCE);
                i2++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    public final String zzc() {
        zzfoe<? extends zzfsm<? extends InputT>> zzfoeVar = this.zzb;
        return zzfoeVar != null ? "futures=".concat(zzfoeVar.toString()) : super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zzd() {
        zzfoe<? extends zzfsm<? extends InputT>> zzfoeVar = this.zzb;
        zzB(1);
        if ((zzfoeVar != null) && isCancelled()) {
            boolean zzo = zzo();
            zzfql<? extends zzfsm<? extends InputT>> it = zzfoeVar.iterator();
            while (it.hasNext()) {
                it.next().cancel(zzo);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfri
    public final void zzw(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable zzu = zzu();
        zzu.getClass();
        zzM(set, zzu);
    }

    public abstract void zzz(int i2, InputT inputt);
}
