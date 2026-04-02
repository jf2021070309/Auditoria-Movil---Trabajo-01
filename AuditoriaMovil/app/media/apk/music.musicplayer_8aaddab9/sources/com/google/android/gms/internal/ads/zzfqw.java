package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class zzfqw<V> extends zzfte implements zzfsm<V> {
    private static final boolean zzaN;
    private static final Logger zzaQ;
    private static final zza zzaR;
    private static final Object zzaS;
    @CheckForNull
    private volatile zzd listeners;
    @CheckForNull
    private volatile Object value;
    @CheckForNull
    private volatile zzl waiters;

    /* loaded from: classes.dex */
    public abstract class zza {
        public /* synthetic */ zza(zze zzeVar) {
        }

        public abstract void zza(zzl zzlVar, Thread thread);

        public abstract void zzb(zzl zzlVar, @CheckForNull zzl zzlVar2);

        public abstract boolean zzc(zzfqw<?> zzfqwVar, @CheckForNull zzl zzlVar, @CheckForNull zzl zzlVar2);

        public abstract boolean zzd(zzfqw<?> zzfqwVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        public abstract boolean zze(zzfqw<?> zzfqwVar, @CheckForNull Object obj, Object obj2);
    }

    /* loaded from: classes.dex */
    public final class zzb {
        @CheckForNull
        public static final zzb zza;
        @CheckForNull
        public static final zzb zzb;
        public final boolean zzc;
        @CheckForNull
        public final Throwable zzd;

        static {
            if (zzfqw.zzaN) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, null);
            zza = new zzb(true, null);
        }

        public zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* loaded from: classes.dex */
    public final class zzc {
        public static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzfqw.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable zzb;

        public zzc(Throwable th) {
            Objects.requireNonNull(th);
            this.zzb = th;
        }
    }

    /* loaded from: classes.dex */
    public final class zzd {
        public static final zzd zza = new zzd();
        @CheckForNull
        public zzd next;
        @CheckForNull
        public final Runnable zzb;
        @CheckForNull
        public final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* loaded from: classes.dex */
    public final class zzf extends zza {
        public final AtomicReferenceFieldUpdater<zzl, Thread> zza;
        public final AtomicReferenceFieldUpdater<zzl, zzl> zzb;
        public final AtomicReferenceFieldUpdater<zzfqw, zzl> zzc;
        public final AtomicReferenceFieldUpdater<zzfqw, zzd> zzd;
        public final AtomicReferenceFieldUpdater<zzfqw, Object> zze;

        public zzf(AtomicReferenceFieldUpdater<zzl, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<zzl, zzl> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<zzfqw, zzl> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<zzfqw, zzd> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<zzfqw, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final void zza(zzl zzlVar, Thread thread) {
            this.zza.lazySet(zzlVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final void zzb(zzl zzlVar, @CheckForNull zzl zzlVar2) {
            this.zzb.lazySet(zzlVar, zzlVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final boolean zzc(zzfqw<?> zzfqwVar, @CheckForNull zzl zzlVar, @CheckForNull zzl zzlVar2) {
            return this.zzc.compareAndSet(zzfqwVar, zzlVar, zzlVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final boolean zzd(zzfqw<?> zzfqwVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return this.zzd.compareAndSet(zzfqwVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final boolean zze(zzfqw<?> zzfqwVar, @CheckForNull Object obj, Object obj2) {
            return this.zze.compareAndSet(zzfqwVar, obj, obj2);
        }
    }

    /* loaded from: classes.dex */
    public final class zzg<V> implements Runnable {
        public final zzfqw<V> zza;
        public final zzfsm<? extends V> zzb;

        public zzg(zzfqw<V> zzfqwVar, zzfsm<? extends V> zzfsmVar) {
            this.zza = zzfqwVar;
            this.zzb = zzfsmVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzfqw) this.zza).value != this) {
                return;
            }
            if (zzfqw.zzaR.zze(this.zza, this, zzfqw.zzb(this.zzb))) {
                zzfqw.zzx(this.zza);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class zzh extends zza {
        private zzh() {
            super(null);
        }

        public /* synthetic */ zzh(zze zzeVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final void zza(zzl zzlVar, Thread thread) {
            zzlVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final void zzb(zzl zzlVar, @CheckForNull zzl zzlVar2) {
            zzlVar.next = zzlVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final boolean zzc(zzfqw<?> zzfqwVar, @CheckForNull zzl zzlVar, @CheckForNull zzl zzlVar2) {
            synchronized (zzfqwVar) {
                if (((zzfqw) zzfqwVar).waiters == zzlVar) {
                    ((zzfqw) zzfqwVar).waiters = zzlVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final boolean zzd(zzfqw<?> zzfqwVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfqwVar) {
                if (((zzfqw) zzfqwVar).listeners == zzdVar) {
                    ((zzfqw) zzfqwVar).listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final boolean zze(zzfqw<?> zzfqwVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzfqwVar) {
                if (((zzfqw) zzfqwVar).value == obj) {
                    ((zzfqw) zzfqwVar).value = obj2;
                    return true;
                }
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface zzi<V> extends zzfsm<V> {
    }

    /* loaded from: classes.dex */
    public abstract class zzj<V> extends zzfqw<V> implements zzi<V> {
    }

    /* loaded from: classes.dex */
    public final class zzk extends zza {
        public static final Unsafe zza;
        public static final long zzb;
        public static final long zzc;
        public static final long zzd;
        public static final long zze;
        public static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e2) {
                    throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzfqw.zzk.1
                    public static final Unsafe zza() throws Exception {
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

                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        return zza();
                    }
                });
            }
            try {
                zzc = unsafe.objectFieldOffset(zzfqw.class.getDeclaredField("waiters"));
                zzb = unsafe.objectFieldOffset(zzfqw.class.getDeclaredField("listeners"));
                zzd = unsafe.objectFieldOffset(zzfqw.class.getDeclaredField("value"));
                zze = unsafe.objectFieldOffset(zzl.class.getDeclaredField("thread"));
                zzf = unsafe.objectFieldOffset(zzl.class.getDeclaredField("next"));
                zza = unsafe;
            } catch (Exception e3) {
                zzfmk.zza(e3);
                throw new RuntimeException(e3);
            }
        }

        private zzk() {
            super(null);
        }

        public /* synthetic */ zzk(zze zzeVar) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final void zza(zzl zzlVar, Thread thread) {
            zza.putObject(zzlVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final void zzb(zzl zzlVar, @CheckForNull zzl zzlVar2) {
            zza.putObject(zzlVar, zzf, zzlVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final boolean zzc(zzfqw<?> zzfqwVar, @CheckForNull zzl zzlVar, @CheckForNull zzl zzlVar2) {
            return zza.compareAndSwapObject(zzfqwVar, zzc, zzlVar, zzlVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final boolean zzd(zzfqw<?> zzfqwVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zza.compareAndSwapObject(zzfqwVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzfqw.zza
        public final boolean zze(zzfqw<?> zzfqwVar, @CheckForNull Object obj, Object obj2) {
            return zza.compareAndSwapObject(zzfqwVar, zzd, obj, obj2);
        }
    }

    /* loaded from: classes.dex */
    public final class zzl {
        public static final zzl zza = new zzl(false);
        @CheckForNull
        public volatile zzl next;
        @CheckForNull
        public volatile Thread thread;

        public zzl() {
            zzfqw.zzaR.zza(this, Thread.currentThread());
        }

        public zzl(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzhVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzaN = z;
        zzaQ = Logger.getLogger(zzfqw.class.getName());
        try {
            zzhVar = new zzk(null);
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th2 = th3;
                zzhVar = new zzf(AtomicReferenceFieldUpdater.newUpdater(zzl.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzl.class, zzl.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzfqw.class, zzl.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzfqw.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzfqw.class, Object.class, "value"));
                th = null;
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                zzhVar = new zzh(null);
            }
        }
        zzaR = zzhVar;
        if (th != null) {
            Logger logger = zzaQ;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzaS = new Object();
    }

    private final void zzA(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    private static void zzB(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = zzaQ;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a.t(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final V zzC(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        } else {
            if (obj == zzaS) {
                return null;
            }
            return obj;
        }
    }

    private final void zza(zzl zzlVar) {
        zzlVar.thread = null;
        while (true) {
            zzl zzlVar2 = this.waiters;
            if (zzlVar2 != zzl.zza) {
                zzl zzlVar3 = null;
                while (zzlVar2 != null) {
                    zzl zzlVar4 = zzlVar2.next;
                    if (zzlVar2.thread != null) {
                        zzlVar3 = zzlVar2;
                    } else if (zzlVar3 != null) {
                        zzlVar3.next = zzlVar4;
                        if (zzlVar3.thread == null) {
                            break;
                        }
                    } else if (!zzaR.zzc(this, zzlVar2, zzlVar4)) {
                        break;
                    }
                    zzlVar2 = zzlVar4;
                }
                return;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object zzb(zzfsm<?> zzfsmVar) {
        Throwable zzu;
        if (zzfsmVar instanceof zzi) {
            Object obj = ((zzfqw) zzfsmVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if (!(zzfsmVar instanceof zzfte) || (zzu = ((zzfte) zzfsmVar).zzu()) == null) {
            boolean isCancelled = zzfsmVar.isCancelled();
            if ((!zzaN) && isCancelled) {
                zzb zzbVar2 = zzb.zzb;
                zzbVar2.getClass();
                return zzbVar2;
            }
            try {
                Object zzw = zzw(zzfsmVar);
                if (!isCancelled) {
                    return zzw == null ? zzaS : zzw;
                }
                String valueOf = String.valueOf(zzfsmVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new zzb(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e2) {
                if (isCancelled) {
                    return new zzb(false, e2);
                }
                String valueOf2 = String.valueOf(zzfsmVar);
                valueOf2.length();
                return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(valueOf2), e2));
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    String valueOf3 = String.valueOf(zzfsmVar);
                    valueOf3.length();
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(valueOf3), e3));
                }
                return new zzc(e3.getCause());
            } catch (Throwable th2) {
                return new zzc(th2);
            }
        } else {
            return new zzc(zzu);
        }
    }

    private static <V> V zzw(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
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
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.zzfqw$zza] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.zzfqw<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzfqw] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.zzfqw<V>, com.google.android.gms.internal.ads.zzfqw] */
    public static void zzx(zzfqw<?> zzfqwVar) {
        zzd zzdVar;
        zzd zzdVar2;
        zzd zzdVar3 = null;
        while (true) {
            zzl zzlVar = ((zzfqw) zzfqwVar).waiters;
            if (zzaR.zzc((zzfqw) zzfqwVar, zzlVar, zzl.zza)) {
                while (zzlVar != null) {
                    Thread thread = zzlVar.thread;
                    if (thread != null) {
                        zzlVar.thread = null;
                        LockSupport.unpark(thread);
                    }
                    zzlVar = zzlVar.next;
                }
                ((zzfqw) zzfqwVar).zzd();
                do {
                    zzdVar = ((zzfqw) zzfqwVar).listeners;
                } while (!zzaR.zzd((zzfqw) zzfqwVar, zzdVar, zzd.zza));
                while (true) {
                    zzdVar2 = zzdVar3;
                    zzdVar3 = zzdVar;
                    if (zzdVar3 == null) {
                        break;
                    }
                    zzdVar = zzdVar3.next;
                    zzdVar3.next = zzdVar2;
                }
                while (zzdVar2 != null) {
                    zzdVar3 = zzdVar2.next;
                    Runnable runnable = zzdVar2.zzb;
                    runnable.getClass();
                    if (runnable instanceof zzg) {
                        zzg zzgVar = (zzg) runnable;
                        zzfqwVar = zzgVar.zza;
                        if (((zzfqw) zzfqwVar).value == zzgVar) {
                            if (zzaR.zze(zzfqwVar, zzgVar, zzb(zzgVar.zzb))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = zzdVar2.zzc;
                        executor.getClass();
                        zzB(runnable, executor);
                    }
                    zzdVar2 = zzdVar3;
                }
                return;
            }
        }
    }

    private final void zzy(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzg) {
            sb.append(", setFuture=[");
            zzA(sb, ((zzg) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzfmi.zzb(zzc());
            } catch (RuntimeException | StackOverflowError e2) {
                String valueOf = String.valueOf(e2.getClass());
                valueOf.length();
                concat = "Exception thrown from implementation: ".concat(valueOf);
            }
            if (concat != null) {
                a.L(sb, ", info=[", concat, "]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzz(sb);
        }
    }

    private final void zzz(StringBuilder sb) {
        try {
            Object zzw = zzw(this);
            sb.append("SUCCESS, result=[");
            if (zzw == null) {
                sb.append("null");
            } else if (zzw == this) {
                sb.append("this future");
            } else {
                sb.append(zzw.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzw)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof zzg)) {
            if (zzaN) {
                zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
            } else {
                zzbVar = z ? zzb.zza : zzb.zzb;
                zzbVar.getClass();
            }
            boolean z2 = false;
            zzfqw<V> zzfqwVar = this;
            while (true) {
                if (zzaR.zze(zzfqwVar, obj, zzbVar)) {
                    if (z) {
                        zzfqwVar.zzn();
                    }
                    zzx(zzfqwVar);
                    if (!(obj instanceof zzg)) {
                        break;
                    }
                    zzfsm<? extends V> zzfsmVar = ((zzg) obj).zzb;
                    if (!(zzfsmVar instanceof zzi)) {
                        zzfsmVar.cancel(z);
                        break;
                    }
                    zzfqwVar = (zzfqw) zzfsmVar;
                    obj = zzfqwVar.value;
                    if (!(obj == null) && !(obj instanceof zzg)) {
                        break;
                    }
                    z2 = true;
                } else {
                    obj = zzfqwVar.value;
                    if (!(obj instanceof zzg)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzg))) {
            return (V) zzC(obj2);
        }
        zzl zzlVar = this.waiters;
        if (zzlVar == zzl.zza) {
            Object obj3 = this.value;
            obj3.getClass();
            return (V) zzC(obj3);
        }
        zzl zzlVar2 = new zzl();
        do {
            zza zzaVar = zzaR;
            zzaVar.zzb(zzlVar2, zzlVar);
            if (zzaVar.zzc(this, zzlVar, zzlVar2)) {
                do {
                    LockSupport.park(this);
                    if (Thread.interrupted()) {
                        zza(zzlVar2);
                        throw new InterruptedException();
                    }
                    obj = this.value;
                } while (!((obj != null) & (!(obj instanceof zzg))));
                return (V) zzC(obj);
            }
            zzlVar = this.waiters;
        } while (zzlVar != zzl.zza);
        Object obj32 = this.value;
        obj32.getClass();
        return (V) zzC(obj32);
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z = true;
        if ((obj != null) && (!(obj instanceof zzg))) {
            return (V) zzC(obj);
        }
        long j3 = 0;
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            zzl zzlVar = this.waiters;
            if (zzlVar != zzl.zza) {
                zzl zzlVar2 = new zzl();
                while (true) {
                    zza zzaVar = zzaR;
                    zzaVar.zzb(zzlVar2, zzlVar);
                    if (zzaVar.zzc(this, zzlVar, zzlVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                zza(zzlVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof zzg))) {
                                return (V) zzC(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        zza(zzlVar2);
                        j3 = 0;
                    } else {
                        zzlVar = this.waiters;
                        if (zzlVar == zzl.zza) {
                            break;
                        }
                    }
                }
            }
            Object obj3 = this.value;
            obj3.getClass();
            return (V) zzC(obj3);
        }
        while (nanos > j3) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof zzg))) {
                return (V) zzC(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
            j3 = 0;
        }
        String zzfqwVar = toString();
        String timeUnit2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = timeUnit2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        a.K(sb, "Waited ", j2, " ");
        sb.append(lowerCase2);
        String sb2 = sb.toString();
        if (nanos + 1000 < 0) {
            String concat = sb2.concat(" (plus ");
            long j4 = -nanos;
            long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(convert);
            if (convert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (convert > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                a.K(sb3, valueOf, convert, " ");
                sb3.append(lowerCase);
                String sb4 = sb3.toString();
                if (z) {
                    sb4 = sb4.concat(",");
                }
                concat = String.valueOf(sb4).concat(" ");
            }
            if (z) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb5 = new StringBuilder(valueOf2.length() + 33);
                sb5.append(valueOf2);
                sb5.append(nanos2);
                sb5.append(" nanoseconds ");
                concat = sb5.toString();
            }
            sb2 = String.valueOf(concat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(a.s(new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(zzfqwVar).length()), sb2, " for ", zzfqwVar));
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zzg)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzz(sb);
        } else {
            zzy(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @CheckForNull
    public String zzc() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    public void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzfsm
    public void zze(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzflx.zzc(runnable, "Runnable was null.");
        zzflx.zzc(executor, "Executor was null.");
        if (isDone() || (zzdVar = this.listeners) == zzd.zza) {
            zzB(runnable, executor);
        }
        zzd zzdVar2 = new zzd(runnable, executor);
        do {
            zzdVar2.next = zzdVar;
            if (zzaR.zzd(this, zzdVar, zzdVar2)) {
                return;
            }
            zzdVar = this.listeners;
        } while (zzdVar != zzd.zza);
        zzB(runnable, executor);
    }

    public void zzn() {
    }

    public final boolean zzo() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    public boolean zzp(V v) {
        if (v == null) {
            v = (V) zzaS;
        }
        if (zzaR.zze(this, null, v)) {
            zzx(this);
            return true;
        }
        return false;
    }

    public boolean zzq(Throwable th) {
        Objects.requireNonNull(th);
        if (zzaR.zze(this, null, new zzc(th))) {
            zzx(this);
            return true;
        }
        return false;
    }

    public final boolean zzr(zzfsm<? extends V> zzfsmVar) {
        zzc zzcVar;
        Objects.requireNonNull(zzfsmVar);
        Object obj = this.value;
        if (obj == null) {
            if (zzfsmVar.isDone()) {
                if (zzaR.zze(this, null, zzb(zzfsmVar))) {
                    zzx(this);
                    return true;
                }
                return false;
            }
            zzg zzgVar = new zzg(this, zzfsmVar);
            if (zzaR.zze(this, null, zzgVar)) {
                try {
                    zzfsmVar.zze(zzgVar, zzfrr.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Throwable unused) {
                        zzcVar = zzc.zza;
                    }
                    zzaR.zze(this, zzgVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfsmVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfte
    @CheckForNull
    public final Throwable zzu() {
        if (this instanceof zzi) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    public final void zzv(@CheckForNull Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzo());
        }
    }
}
