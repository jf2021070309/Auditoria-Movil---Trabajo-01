package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.c.b;
import com.amazon.aps.iva.k.q;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzub<V> extends zzwb implements zzvq<V> {
    static final boolean zzb;
    private static final Logger zzba;
    private static final zza zzbb;
    private static final Object zzd;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public abstract class zza {
        public /* synthetic */ zza(zzua zzuaVar) {
        }

        public abstract zzd zza(zzub zzubVar, zzd zzdVar);

        public abstract zzk zzb(zzub zzubVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzub zzubVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzub zzubVar, Object obj, Object obj2);

        public abstract boolean zzg(zzub zzubVar, zzk zzkVar, zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzub.zzb) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, null);
            zza = new zzb(true, null);
        }

        public zzb(boolean z, Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.ads.interactivemedia.v3.internal.zzub.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public final class zzd {
        static final zzd zza = new zzd();
        zzd next;
        final Runnable zzb;
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzub, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzub, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzub, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzd zza(zzub zzubVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzubVar, zzdVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzk zzb(zzub zzubVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzubVar, zzkVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zze(zzub zzubVar, zzd zzdVar, zzd zzdVar2) {
            return zzuc.zza(this.zzd, zzubVar, zzdVar, zzdVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzf(zzub zzubVar, Object obj, Object obj2) {
            return zzuc.zza(this.zze, zzubVar, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzg(zzub zzubVar, zzk zzkVar, zzk zzkVar2) {
            return zzuc.zza(this.zzc, zzubVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public final class zzf<V> implements Runnable {
        final zzub<V> zza;
        final zzvq<? extends V> zzb;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    final class zzg extends zza {
        public /* synthetic */ zzg(zzud zzudVar) {
            super(null);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzd zza(zzub zzubVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzubVar) {
                zzdVar2 = zzubVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzubVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzk zzb(zzub zzubVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzubVar) {
                zzkVar2 = zzubVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzubVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zze(zzub zzubVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzubVar) {
                if (zzubVar.listeners == zzdVar) {
                    zzubVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzf(zzub zzubVar, Object obj, Object obj2) {
            synchronized (zzubVar) {
                if (zzubVar.value == obj) {
                    zzubVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzg(zzub zzubVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzubVar) {
                if (zzubVar.waiters == zzkVar) {
                    zzubVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }

        private zzg() {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public interface zzh<V> extends zzvq<V> {
    }

    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    abstract class zzi<V> extends zzub<V> implements zzh<V> {
    }

    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.ads.interactivemedia.v3.internal.zzub.zzj.1
                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        Field[] declaredFields;
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzub.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzub.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzub.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        }

        public /* synthetic */ zzj(zzuf zzufVar) {
            super(null);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzd zza(zzub zzubVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzubVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzubVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final zzk zzb(zzub zzubVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzubVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzubVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zze(zzub zzubVar, zzd zzdVar, zzd zzdVar2) {
            return zzue.zza(zza, zzubVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzf(zzub zzubVar, Object obj, Object obj2) {
            return zzue.zza(zza, zzubVar, zzd, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.zzub.zza
        public final boolean zzg(zzub zzubVar, zzk zzkVar, zzk zzkVar2) {
            return zzue.zza(zza, zzubVar, zzc, zzkVar, zzkVar2);
        }

        private zzj() {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
    /* loaded from: classes2.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        public zzk() {
            zzub.zzbb.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzb = z;
        zzba = Logger.getLogger(zzub.class.getName());
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th = null;
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzub.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzub.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzub.class, Object.class, "value"));
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zzgVar = new zzg(null);
            }
        }
        zzbb = zzgVar;
        if (th != null) {
            Logger logger = zzba;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzd = new Object();
    }

    private static Object zzp(zzvq zzvqVar) {
        Throwable zzi2;
        if (zzvqVar instanceof zzh) {
            Object obj = ((zzub) zzvqVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if ((zzvqVar instanceof zzwb) && (zzi2 = ((zzwb) zzvqVar).zzi()) != null) {
            return new zzc(zzi2);
        } else {
            boolean isCancelled = zzvqVar.isCancelled();
            if ((!zzb) & isCancelled) {
                zzb zzbVar2 = zzb.zzb;
                zzbVar2.getClass();
                return zzbVar2;
            }
            try {
                Object zzq = zzq(zzvqVar);
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzvqVar))));
                }
                if (zzq == null) {
                    return zzd;
                }
                return zzq;
            } catch (Error e) {
                e = e;
                return new zzc(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzvqVar)), e2));
                }
                return new zzb(false, e2);
            } catch (RuntimeException e3) {
                e = e3;
                return new zzc(e);
            } catch (ExecutionException e4) {
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzvqVar)), e4));
                }
                return new zzc(e4.getCause());
            }
        }
    }

    private static Object zzq(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzr(StringBuilder sb) {
        try {
            Object zzq = zzq(this);
            sb.append("SUCCESS, result=[");
            if (zzq == null) {
                sb.append("null");
            } else if (zzq == this) {
                sb.append("this future");
            } else {
                sb.append(zzq.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzq)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private final void zzs(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzt(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzro.zza(zza());
            } catch (RuntimeException | StackOverflowError e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null) {
                sb.append(", info=[");
                sb.append(concat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzr(sb);
        }
    }

    private final void zzt(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void zzu(zzub zzubVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzbb.zzb(zzubVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzubVar.zzn();
            }
            zzubVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzbb.zza(zzubVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzubVar = zzfVar.zza;
                    if (zzubVar.value == zzfVar) {
                        if (zzbb.zzf(zzubVar, zzfVar, zzp(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    zzv(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    private static void zzv(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            zzba.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", b.a("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    private final void zzw(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzbb.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzx(Object obj) throws ExecutionException {
        if (!(obj instanceof zzb)) {
            if (!(obj instanceof zzc)) {
                if (obj == zzd) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((zzc) obj).zzb);
        }
        Throwable th = ((zzb) obj).zzd;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.value
            boolean r1 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zzub.zzf
            r2 = 0
            r3 = 1
            if (r0 != 0) goto La
            r4 = r3
            goto Lb
        La:
            r4 = r2
        Lb:
            r1 = r1 | r4
            if (r1 == 0) goto L5f
            boolean r1 = com.google.ads.interactivemedia.v3.internal.zzub.zzb
            if (r1 == 0) goto L1f
            com.google.ads.interactivemedia.v3.internal.zzub$zzb r1 = new com.google.ads.interactivemedia.v3.internal.zzub$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.ads.interactivemedia.v3.internal.zzub$zzb r1 = com.google.ads.interactivemedia.v3.internal.zzub.zzb.zza
            goto L26
        L24:
            com.google.ads.interactivemedia.v3.internal.zzub$zzb r1 = com.google.ads.interactivemedia.v3.internal.zzub.zzb.zzb
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.ads.interactivemedia.v3.internal.zzub$zza r6 = com.google.ads.interactivemedia.v3.internal.zzub.zzbb
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzu(r4, r8)
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zzub.zzf
            if (r4 == 0) goto L56
            com.google.ads.interactivemedia.v3.internal.zzub$zzf r0 = (com.google.ads.interactivemedia.v3.internal.zzub.zzf) r0
            com.google.ads.interactivemedia.v3.internal.zzvq<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zzub.zzh
            if (r4 == 0) goto L53
            r4 = r0
            com.google.ads.interactivemedia.v3.internal.zzub r4 = (com.google.ads.interactivemedia.v3.internal.zzub) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zzub.zzf
            r5 = r5 | r6
            if (r5 == 0) goto L56
            r5 = r3
            goto L2b
        L53:
            r0.cancel(r8)
        L56:
            r2 = r3
            goto L5f
        L58:
            java.lang.Object r0 = r4.value
            boolean r6 = r0 instanceof com.google.ads.interactivemedia.v3.internal.zzub.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzub.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzx(obj2);
            }
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzbb;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzw(zzkVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzx(obj);
                    }
                    zzkVar = this.waiters;
                } while (zzkVar != zzk.zza);
                Object obj3 = this.value;
                obj3.getClass();
                return zzx(obj3);
            }
            Object obj32 = this.value;
            obj32.getClass();
            return zzx(obj32);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        boolean z = true;
        boolean z2 = !(obj instanceof zzf);
        if (obj == null) {
            z = false;
        }
        return z & z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.value instanceof zzb) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzr(sb);
        } else {
            zzs(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public String zza() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    public void zzb() {
    }

    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzd;
        }
        if (!zzbb.zzf(this, null, obj)) {
            return false;
        }
        zzu(this, false);
        return true;
    }

    public boolean zzd(Throwable th) {
        th.getClass();
        if (!zzbb.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzu(this, false);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwb
    public final Throwable zzi() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzvq
    public final void zzm(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzrm.zzc(runnable, "Runnable was null.");
        zzrm.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzbb.zze(this, zzdVar, zzdVar2)) {
                    return;
                }
                zzdVar = this.listeners;
            } while (zzdVar != zzd.zza);
            zzv(runnable, executor);
        }
        zzv(runnable, executor);
    }

    public void zzn() {
    }

    public final boolean zzo() {
        Object obj = this.value;
        if ((obj instanceof zzb) && ((zzb) obj).zzc) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzx(obj);
            }
            long j2 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    while (true) {
                        zza zzaVar = zzbb;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzx(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzw(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzw(zzkVar2);
                            j2 = 0;
                        } else {
                            zzkVar = this.waiters;
                            if (zzkVar == zzk.zza) {
                                break;
                            }
                        }
                    }
                }
                Object obj3 = this.value;
                obj3.getClass();
                return zzx(obj3);
            }
            while (nanos > j2) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzx(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                    j2 = 0;
                } else {
                    throw new InterruptedException();
                }
            }
            String zzubVar = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(q.b(str, " for ", zzubVar));
        }
        throw new InterruptedException();
    }
}
