package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzalm<T> {
    private final zzaku zza;
    private final zzalg zzb;
    private final zzalk<T> zzc;
    private final CopyOnWriteArraySet<zzall<T>> zzd;
    private final ArrayDeque<Runnable> zze;
    private final ArrayDeque<Runnable> zzf;
    private boolean zzg;

    public zzalm(Looper looper, zzaku zzakuVar, zzalk<T> zzalkVar) {
        this(new CopyOnWriteArraySet(), looper, zzakuVar, zzalkVar);
    }

    public final zzalm<T> zza(Looper looper, zzalk<T> zzalkVar) {
        return new zzalm<>(this.zzd, looper, this.zza, zzalkVar);
    }

    public final void zzc(T t) {
        Iterator<zzall<T>> it = this.zzd.iterator();
        while (it.hasNext()) {
            zzall<T> next = it.next();
            if (next.zza.equals(t)) {
                next.zza(this.zzc);
                this.zzd.remove(next);
            }
        }
    }

    public final void zzd(final int i, final zzalj<T> zzaljVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable(copyOnWriteArraySet, i, zzaljVar) { // from class: com.google.android.gms.internal.ads.zzali
            private final CopyOnWriteArraySet zza;
            private final int zzb;
            private final zzalj zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = copyOnWriteArraySet;
                this.zzb = i;
                this.zzc = zzaljVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = this.zza;
                int i2 = this.zzb;
                zzalj zzaljVar2 = this.zzc;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((zzall) it.next()).zzb(i2, zzaljVar2);
                }
            }
        });
    }

    public final void zze() {
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zza(0)) {
            zzalg zzalgVar = this.zzb;
            zzalgVar.zze(zzalgVar.zzb(0));
        }
        boolean isEmpty = this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (!isEmpty) {
            return;
        }
        while (!this.zze.isEmpty()) {
            this.zze.peekFirst().run();
            this.zze.removeFirst();
        }
    }

    public final void zzf() {
        Iterator<zzall<T>> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zza(this.zzc);
        }
        this.zzd.clear();
        this.zzg = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ boolean zzg(Message message) {
        Iterator<zzall<T>> it = this.zzd.iterator();
        while (it.hasNext()) {
            it.next().zzc(this.zzc);
            if (this.zzb.zza(0)) {
                return true;
            }
        }
        return true;
    }

    private zzalm(CopyOnWriteArraySet<zzall<T>> copyOnWriteArraySet, Looper looper, zzaku zzakuVar, zzalk<T> zzalkVar) {
        this.zza = zzakuVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzalkVar;
        this.zze = new ArrayDeque<>();
        this.zzf = new ArrayDeque<>();
        this.zzb = zzakuVar.zza(looper, new Handler.Callback(this) { // from class: com.google.android.gms.internal.ads.zzalh
            private final zzalm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                this.zza.zzg(message);
                return true;
            }
        });
    }

    public final void zzb(T t) {
        if (this.zzg) {
            return;
        }
        if (t != null) {
            this.zzd.add(new zzall<>(t));
            return;
        }
        throw null;
    }
}
