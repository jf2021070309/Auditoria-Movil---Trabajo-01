package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.c.b;
import com.amazon.aps.iva.k.q;
import com.google.common.util.concurrent.ListenableFuture;
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
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public abstract class zzrg<V> extends zzsf implements ListenableFuture<V> {
    static final boolean zza;
    private static final Logger zzb;
    private static final zza zzc;
    private static final Object zzd;
    private volatile zzd listeners;
    private volatile Object value;
    private volatile zzk waiters;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
    public abstract class zza {
        public /* synthetic */ zza(zzrf zzrfVar) {
        }

        public abstract zzd zza(zzrg zzrgVar, zzd zzdVar);

        public abstract zzk zzb(zzrg zzrgVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzrg zzrgVar, zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzrg zzrgVar, Object obj, Object obj2);

        public abstract boolean zzg(zzrg zzrgVar, zzk zzkVar, zzk zzkVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
    public final class zzb {
        static final zzb zza;
        static final zzb zzb;
        final boolean zzc;
        final Throwable zzd;

        static {
            if (zzrg.zza) {
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
    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
    public final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.cast.zzrg.zzc.1
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
    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
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

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<zzrg, zzk> zzc;
        final AtomicReferenceFieldUpdater<zzrg, zzd> zzd;
        final AtomicReferenceFieldUpdater<zzrg, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final zzd zza(zzrg zzrgVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzrgVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final zzk zzb(zzrg zzrgVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzrgVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final boolean zze(zzrg zzrgVar, zzd zzdVar, zzd zzdVar2) {
            return zzrh.zza(this.zzd, zzrgVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final boolean zzf(zzrg zzrgVar, Object obj, Object obj2) {
            return zzrh.zza(this.zze, zzrgVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final boolean zzg(zzrg zzrgVar, zzk zzkVar, zzk zzkVar2) {
            return zzrh.zza(this.zzc, zzrgVar, zzkVar, zzkVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
    public final class zzf<V> implements Runnable {
        final zzrg<V> zza;
        final ListenableFuture<? extends V> zzb;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
    final class zzg extends zza {
        public /* synthetic */ zzg(zzri zzriVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final zzd zza(zzrg zzrgVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzrgVar) {
                zzdVar2 = zzrgVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzrgVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final zzk zzb(zzrg zzrgVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzrgVar) {
                zzkVar2 = zzrgVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzrgVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final boolean zze(zzrg zzrgVar, zzd zzdVar, zzd zzdVar2) {
            synchronized (zzrgVar) {
                if (zzrgVar.listeners == zzdVar) {
                    zzrgVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final boolean zzf(zzrg zzrgVar, Object obj, Object obj2) {
            synchronized (zzrgVar) {
                if (zzrgVar.value == obj) {
                    zzrgVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final boolean zzg(zzrg zzrgVar, zzk zzkVar, zzk zzkVar2) {
            synchronized (zzrgVar) {
                if (zzrgVar.waiters == zzkVar) {
                    zzrgVar.waiters = zzkVar2;
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
    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
    public interface zzh<V> extends ListenableFuture<V> {
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
    abstract class zzi<V> extends zzrg<V> implements zzh<V> {
    }

    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
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
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.cast.zzrg.zzj.1
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
                zzc = unsafe.objectFieldOffset(zzrg.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzrg.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzrg.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            } catch (RuntimeException e3) {
                throw e3;
            }
        }

        public /* synthetic */ zzj(zzrk zzrkVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final zzd zza(zzrg zzrgVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzrgVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzrgVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final zzk zzb(zzrg zzrgVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzrgVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzrgVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final void zzc(zzk zzkVar, zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final boolean zze(zzrg zzrgVar, zzd zzdVar, zzd zzdVar2) {
            return zzrj.zza(zza, zzrgVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final boolean zzf(zzrg zzrgVar, Object obj, Object obj2) {
            return zzrj.zza(zza, zzrgVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.cast.zzrg.zza
        public final boolean zzg(zzrg zzrgVar, zzk zzkVar, zzk zzkVar2) {
            return zzrj.zza(zza, zzrgVar, zzc, zzkVar, zzkVar2);
        }

        private zzj() {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
    /* loaded from: classes3.dex */
    public final class zzk {
        static final zzk zza = new zzk(false);
        volatile zzk next;
        volatile Thread thread;

        public zzk() {
            zzrg.zzc.zzd(this, Thread.currentThread());
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
        zza = z;
        zzb = Logger.getLogger(zzrg.class.getName());
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th = null;
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzrg.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzrg.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzrg.class, Object.class, "value"));
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zzgVar = new zzg(null);
            }
        }
        zzc = zzgVar;
        if (th != null) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzd = new Object();
    }

    private static Object zzn(ListenableFuture listenableFuture) {
        Throwable zzf2;
        if (listenableFuture instanceof zzh) {
            Object obj = ((zzrg) listenableFuture).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if ((listenableFuture instanceof zzsf) && (zzf2 = ((zzsf) listenableFuture).zzf()) != null) {
            return new zzc(zzf2);
        } else {
            boolean isCancelled = listenableFuture.isCancelled();
            if ((!zza) & isCancelled) {
                zzb zzbVar2 = zzb.zzb;
                zzbVar2.getClass();
                return zzbVar2;
            }
            try {
                Object zzo = zzo(listenableFuture);
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture))));
                }
                if (zzo == null) {
                    return zzd;
                }
                return zzo;
            } catch (Error e) {
                e = e;
                return new zzc(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(listenableFuture)), e2));
                }
                return new zzb(false, e2);
            } catch (RuntimeException e3) {
                e = e3;
                return new zzc(e);
            } catch (ExecutionException e4) {
                if (isCancelled) {
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(listenableFuture)), e4));
                }
                return new zzc(e4.getCause());
            }
        }
    }

    private static Object zzo(Future future) throws ExecutionException {
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

    private final void zzp(StringBuilder sb) {
        try {
            Object zzo = zzo(this);
            sb.append("SUCCESS, result=[");
            if (zzo == null) {
                sb.append("null");
            } else if (zzo == this) {
                sb.append("this future");
            } else {
                sb.append(zzo.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzo)));
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

    private final void zzq(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzr(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzfb.zza(zze());
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
            zzp(sb);
        }
    }

    private final void zzr(StringBuilder sb, Object obj) {
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

    private static void zzs(zzrg zzrgVar, boolean z) {
        zzd zzdVar;
        zzd zzdVar2 = null;
        while (true) {
            for (zzk zzb2 = zzc.zzb(zzrgVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzrgVar.zzj();
            zzd zzdVar3 = zzdVar2;
            zzd zza2 = zzc.zza(zzrgVar, zzd.zza);
            zzd zzdVar4 = zzdVar3;
            while (zza2 != null) {
                zzd zzdVar5 = zza2.next;
                zza2.next = zzdVar4;
                zzdVar4 = zza2;
                zza2 = zzdVar5;
            }
            while (zzdVar4 != null) {
                Runnable runnable = zzdVar4.zzb;
                zzdVar = zzdVar4.next;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzrgVar = zzfVar.zza;
                    if (zzrgVar.value == zzfVar) {
                        if (zzc.zzf(zzrgVar, zzfVar, zzn(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar4.zzc;
                    executor.getClass();
                    zzt(runnable, executor);
                }
                zzdVar4 = zzdVar;
            }
            return;
            zzdVar2 = zzdVar;
        }
    }

    private static void zzt(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            zzb.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", b.a("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    private final void zzu(zzk zzkVar) {
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
                    } else if (!zzc.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzv(Object obj) throws ExecutionException {
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

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzez.zzc(runnable, "Runnable was null.");
        zzez.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzc.zze(this, zzdVar, zzdVar2)) {
                    return;
                }
                zzdVar = this.listeners;
            } while (zzdVar != zzd.zza);
            zzt(runnable, executor);
        }
        zzt(runnable, executor);
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
            boolean r1 = r0 instanceof com.google.android.gms.internal.cast.zzrg.zzf
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
            boolean r1 = com.google.android.gms.internal.cast.zzrg.zza
            if (r1 == 0) goto L1f
            com.google.android.gms.internal.cast.zzrg$zzb r1 = new com.google.android.gms.internal.cast.zzrg$zzb
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r1.<init>(r8, r4)
            goto L29
        L1f:
            if (r8 == 0) goto L24
            com.google.android.gms.internal.cast.zzrg$zzb r1 = com.google.android.gms.internal.cast.zzrg.zzb.zza
            goto L26
        L24:
            com.google.android.gms.internal.cast.zzrg$zzb r1 = com.google.android.gms.internal.cast.zzrg.zzb.zzb
        L26:
            r1.getClass()
        L29:
            r4 = r7
            r5 = r2
        L2b:
            com.google.android.gms.internal.cast.zzrg$zza r6 = com.google.android.gms.internal.cast.zzrg.zzc
            boolean r6 = r6.zzf(r4, r0, r1)
            if (r6 == 0) goto L58
            zzs(r4, r8)
            boolean r4 = r0 instanceof com.google.android.gms.internal.cast.zzrg.zzf
            if (r4 == 0) goto L56
            com.google.android.gms.internal.cast.zzrg$zzf r0 = (com.google.android.gms.internal.cast.zzrg.zzf) r0
            com.google.common.util.concurrent.ListenableFuture<? extends V> r0 = r0.zzb
            boolean r4 = r0 instanceof com.google.android.gms.internal.cast.zzrg.zzh
            if (r4 == 0) goto L53
            r4 = r0
            com.google.android.gms.internal.cast.zzrg r4 = (com.google.android.gms.internal.cast.zzrg) r4
            java.lang.Object r0 = r4.value
            if (r0 != 0) goto L4b
            r5 = r3
            goto L4c
        L4b:
            r5 = r2
        L4c:
            boolean r6 = r0 instanceof com.google.android.gms.internal.cast.zzrg.zzf
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
            boolean r6 = r0 instanceof com.google.android.gms.internal.cast.zzrg.zzf
            if (r6 != 0) goto L2b
            r2 = r5
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.zzrg.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzv(obj2);
            }
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzc;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzu(zzkVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzv(obj);
                    }
                    zzkVar = this.waiters;
                } while (zzkVar != zzk.zza);
                Object obj3 = this.value;
                obj3.getClass();
                return zzv(obj3);
            }
            Object obj32 = this.value;
            obj32.getClass();
            return zzv(obj32);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        Object obj = this.value;
        boolean z2 = obj instanceof zzf;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        return z & (!z2);
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
            zzp(sb);
        } else {
            zzq(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public String zze() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cast.zzsf
    public final Throwable zzf() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    public final boolean zzk(Object obj) {
        if (obj == null) {
            obj = zzd;
        }
        if (!zzc.zzf(this, null, obj)) {
            return false;
        }
        zzs(this, false);
        return true;
    }

    public final boolean zzl(Throwable th) {
        if (!zzc.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzs(this, false);
        return true;
    }

    public final boolean zzm() {
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
                return zzv(obj);
            }
            long j2 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    while (true) {
                        zza zzaVar = zzc;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzv(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzu(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzu(zzkVar2);
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
                return zzv(obj3);
            }
            while (nanos > j2) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzv(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                    j2 = 0;
                } else {
                    throw new InterruptedException();
                }
            }
            String zzrgVar = toString();
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
            throw new TimeoutException(q.b(str, " for ", zzrgVar));
        }
        throw new InterruptedException();
    }

    public void zzj() {
    }
}
