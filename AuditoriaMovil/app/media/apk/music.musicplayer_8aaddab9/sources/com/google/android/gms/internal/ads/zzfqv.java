package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.lang.Throwable;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class zzfqv<V, X extends Throwable, F, T> extends zzfrt<V> implements Runnable {
    @CheckForNull
    public zzfsm<? extends V> zza;
    @CheckForNull
    public Class<X> zzb;
    @CheckForNull
    public F zzc;

    public zzfqv(zzfsm<? extends V> zzfsmVar, Class<X> cls, F f2) {
        Objects.requireNonNull(zzfsmVar);
        this.zza = zzfsmVar;
        this.zzb = cls;
        Objects.requireNonNull(f2);
        this.zzc = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzfsm<? extends V> r0 = r10.zza
            java.lang.Class<X extends java.lang.Throwable> r1 = r10.zzb
            F r2 = r10.zzc
            r3 = 1
            if (r0 != 0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            if (r1 != 0) goto L10
            r5 = 1
            goto L11
        L10:
            r5 = 0
        L11:
            r4 = r4 | r5
            if (r2 != 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            r3 = r3 | r4
            if (r3 != 0) goto La2
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L21
            goto La2
        L21:
            r3 = 0
            r10.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfte     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            if (r4 == 0) goto L30
            r4 = r0
            com.google.android.gms.internal.ads.zzfte r4 = (com.google.android.gms.internal.ads.zzfte) r4     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            java.lang.Throwable r4 = r4.zzu()     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            goto L31
        L30:
            r4 = r3
        L31:
            if (r4 != 0) goto L77
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzfsd.zzq(r0)     // Catch: java.lang.Throwable -> L38 java.util.concurrent.ExecutionException -> L3a
            goto L78
        L38:
            r4 = move-exception
            goto L77
        L3a:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L76
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r7 = r6.length()
            int r8 = r4.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 35
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Future type "
            java.lang.String r8 = " threw "
            e.a.d.a.a.M(r9, r7, r6, r8, r4)
            java.lang.String r4 = " without a cause"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r5.<init>(r4)
        L76:
            r4 = r5
        L77:
            r5 = r3
        L78:
            if (r4 != 0) goto L7e
            r10.zzp(r5)
            return
        L7e:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L9f
            java.lang.Object r0 = r10.zzb(r2, r4)     // Catch: java.lang.Throwable -> L90
            r10.zzb = r3
            r10.zzc = r3
            r10.zza(r0)
            return
        L90:
            r0 = move-exception
            r10.zzq(r0)     // Catch: java.lang.Throwable -> L99
            r10.zzb = r3
            r10.zzc = r3
            return
        L99:
            r0 = move-exception
            r10.zzb = r3
            r10.zzc = r3
            throw r0
        L9f:
            r10.zzr(r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfqv.run():void");
    }

    public abstract void zza(T t);

    public abstract T zzb(F f2, X x) throws Exception;

    @Override // com.google.android.gms.internal.ads.zzfqw
    @CheckForNull
    public final String zzc() {
        String str;
        zzfsm<? extends V> zzfsmVar = this.zza;
        Class<X> cls = this.zzb;
        F f2 = this.zzc;
        String zzc = super.zzc();
        if (zzfsmVar != null) {
            String obj = zzfsmVar.toString();
            str = a.s(new StringBuilder(obj.length() + 16), "inputFuture=[", obj, "], ");
        } else {
            str = "";
        }
        if (cls == null || f2 == null) {
            if (zzc != null) {
                return zzc.length() != 0 ? str.concat(zzc) : new String(str);
            }
            return null;
        }
        String obj2 = cls.toString();
        String obj3 = f2.toString();
        StringBuilder sb = new StringBuilder(obj3.length() + obj2.length() + str.length() + 29);
        a.M(sb, str, "exceptionType=[", obj2, "], fallback=[");
        return a.r(sb, obj3, "]");
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final void zzd() {
        zzv(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
