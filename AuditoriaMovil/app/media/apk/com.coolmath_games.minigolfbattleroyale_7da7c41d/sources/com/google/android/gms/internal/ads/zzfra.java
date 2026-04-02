package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfra<I, O, F, T> extends zzfrt<O> implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    @CheckForNull
    zzfsm<? extends I> zza;
    @CheckForNull
    F zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfra(zzfsm<? extends I> zzfsmVar, F f) {
        if (zzfsmVar == null) {
            throw null;
        }
        this.zza = zzfsmVar;
        if (f == null) {
            throw null;
        }
        this.zzb = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        zzfsm<? extends I> zzfsmVar = this.zza;
        F f = this.zzb;
        if ((isCancelled() | (zzfsmVar == null)) || (f == null)) {
            return;
        }
        this.zza = null;
        if (zzfsmVar.isCancelled()) {
            zzr(zzfsmVar);
            return;
        }
        try {
            try {
                Object zzb = zzb(f, zzfsd.zzq(zzfsmVar));
                this.zzb = null;
                zza((zzfra<I, O, F, T>) zzb);
            } catch (Throwable th) {
                try {
                    zzq(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzq(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zzq(e2);
        } catch (ExecutionException e3) {
            zzq(e3.getCause());
        }
    }

    abstract void zza(T t);

    abstract T zzb(F f, I i) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    public final String zzc() {
        String str;
        zzfsm<? extends I> zzfsmVar = this.zza;
        F f = this.zzb;
        String zzc2 = super.zzc();
        if (zzfsmVar != null) {
            String obj = zzfsmVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f == null) {
            if (zzc2 != null) {
                return zzc2.length() != 0 ? str.concat(zzc2) : new String(str);
            }
            return null;
        }
        String obj2 = f.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 11 + obj2.length());
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(obj2);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    protected final void zzd() {
        zzv(this.zza);
        this.zza = null;
        this.zzb = null;
    }
}
