package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class zzfra<I, O, F, T> extends zzfrt<O> implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    @CheckForNull
    public zzfsm<? extends I> zza;
    @CheckForNull
    public F zzb;

    public zzfra(zzfsm<? extends I> zzfsmVar, F f2) {
        Objects.requireNonNull(zzfsmVar);
        this.zza = zzfsmVar;
        Objects.requireNonNull(f2);
        this.zzb = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzfsm<? extends I> zzfsmVar = this.zza;
        F f2 = this.zzb;
        if ((isCancelled() | (zzfsmVar == null)) || (f2 == null)) {
            return;
        }
        this.zza = null;
        if (zzfsmVar.isCancelled()) {
            zzr(zzfsmVar);
            return;
        }
        try {
            try {
                Object zzb = zzb(f2, zzfsd.zzq(zzfsmVar));
                this.zzb = null;
                zza((zzfra<I, O, F, T>) zzb);
            } catch (Throwable th) {
                try {
                    zzq(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e2) {
            zzq(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e3) {
            zzq(e3);
        } catch (ExecutionException e4) {
            zzq(e4.getCause());
        }
    }

    public abstract void zza(T t);

    public abstract T zzb(F f2, I i2) throws Exception;

    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    public final String zzc() {
        String str;
        zzfsm<? extends I> zzfsmVar = this.zza;
        F f2 = this.zzb;
        String zzc2 = super.zzc();
        if (zzfsmVar != null) {
            String obj = zzfsmVar.toString();
            str = a.s(new StringBuilder(obj.length() + 16), "inputFuture=[", obj, "], ");
        } else {
            str = "";
        }
        if (f2 != null) {
            String obj2 = f2.toString();
            return a.t(new StringBuilder(obj2.length() + str.length() + 11), str, "function=[", obj2, "]");
        } else if (zzc2 != null) {
            return zzc2.length() != 0 ? str.concat(zzc2) : new String(str);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zzd() {
        zzv(this.zza);
        this.zza = null;
        this.zzb = null;
    }
}
