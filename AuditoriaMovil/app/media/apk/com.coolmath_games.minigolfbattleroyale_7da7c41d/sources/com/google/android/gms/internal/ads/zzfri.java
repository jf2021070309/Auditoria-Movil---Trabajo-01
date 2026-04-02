package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfqw;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfri<OutputT> extends zzfqw.zzj<OutputT> {
    private static final zzfre zzaO;
    private static final Logger zzaP = Logger.getLogger(zzfri.class.getName());
    private volatile int remaining;
    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzfre zzfrhVar;
        Throwable th;
        try {
            zzfrhVar = new zzfrg(AtomicReferenceFieldUpdater.newUpdater(zzfri.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfri.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzfrhVar = new zzfrh(null);
            th = th2;
        }
        zzaO = zzfrhVar;
        if (th != null) {
            zzaP.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfri(int i) {
        this.remaining = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Throwable> zzG() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzw(newSetFromMap);
            zzaO.zza(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            set2.getClass();
            return set2;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzH() {
        return zzaO.zzb(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzI() {
        this.seenExceptions = null;
    }

    abstract void zzw(Set<Throwable> set);
}
