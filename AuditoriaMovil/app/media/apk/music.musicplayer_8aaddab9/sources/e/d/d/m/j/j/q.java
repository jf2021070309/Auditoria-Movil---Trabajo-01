package e.d.d.m.j.j;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e.d.d.m.j.e;
import e.d.d.m.j.j.d0;
import e.d.d.m.j.j.l;
import e.d.d.m.j.l.a0;
import e.d.d.m.j.l.b;
import e.d.d.m.j.l.g;
import e.d.d.m.j.l.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.Thread;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class q {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Context f7193b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f7194c;

    /* renamed from: d  reason: collision with root package name */
    public final a0 f7195d;

    /* renamed from: e  reason: collision with root package name */
    public final m f7196e;

    /* renamed from: f  reason: collision with root package name */
    public final i0 f7197f;

    /* renamed from: g  reason: collision with root package name */
    public final e.d.d.m.j.n.f f7198g;

    /* renamed from: h  reason: collision with root package name */
    public final h f7199h;

    /* renamed from: i  reason: collision with root package name */
    public final e.d.d.m.j.k.c f7200i;

    /* renamed from: j  reason: collision with root package name */
    public final e.d.d.m.j.c f7201j;

    /* renamed from: k  reason: collision with root package name */
    public final e.d.d.m.j.h.a f7202k;

    /* renamed from: l  reason: collision with root package name */
    public final l0 f7203l;

    /* renamed from: m  reason: collision with root package name */
    public d0 f7204m;

    /* renamed from: n  reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f7205n = new TaskCompletionSource<>();
    public final TaskCompletionSource<Boolean> o = new TaskCompletionSource<>();
    public final TaskCompletionSource<Void> p = new TaskCompletionSource<>();

    /* loaded from: classes2.dex */
    public class a implements d0.a {
        public a() {
        }

        public void a(e.d.d.m.j.p.f fVar, Thread thread, Throwable th) {
            q qVar = q.this;
            synchronized (qVar) {
                String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
                e.d.d.m.j.f.a.a(3);
                try {
                    n0.a(qVar.f7196e.c(new s(qVar, System.currentTimeMillis(), th, thread, fVar)));
                } catch (Exception e2) {
                    if (e.d.d.m.j.f.a.a(6)) {
                        Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e2);
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements SuccessContinuation<Boolean, Void> {
        public final /* synthetic */ Task a;

        public b(Task task) {
            this.a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public Task<Void> then(Boolean bool) throws Exception {
            return q.this.f7196e.c(new v(this, bool));
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Callable<Void> {
        public final /* synthetic */ long a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f7207b;

        public c(long j2, String str) {
            this.a = j2;
            this.f7207b = str;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            if (q.this.h()) {
                return null;
            }
            e.d.d.m.j.k.c cVar = q.this.f7200i;
            cVar.f7238c.c(this.a, this.f7207b);
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public final /* synthetic */ long a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Throwable f7209b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Thread f7210c;

        public d(long j2, Throwable th, Thread thread) {
            this.a = j2;
            this.f7209b = th;
            this.f7210c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q.this.h()) {
                return;
            }
            long j2 = this.a / 1000;
            String g2 = q.this.g();
            if (g2 == null) {
                e.d.d.m.j.f.a.d("Tried to write a non-fatal exception while no session was open.");
                return;
            }
            l0 l0Var = q.this.f7203l;
            Throwable th = this.f7209b;
            Thread thread = this.f7210c;
            Objects.requireNonNull(l0Var);
            e.d.d.m.j.f.a.a(2);
            l0Var.d(th, thread, g2, "error", j2, false);
        }
    }

    public q(Context context, m mVar, i0 i0Var, e0 e0Var, e.d.d.m.j.n.f fVar, a0 a0Var, h hVar, e.d.d.m.j.k.h hVar2, e.d.d.m.j.k.c cVar, l0 l0Var, e.d.d.m.j.c cVar2, e.d.d.m.j.h.a aVar) {
        new AtomicBoolean(false);
        this.f7193b = context;
        this.f7196e = mVar;
        this.f7197f = i0Var;
        this.f7194c = e0Var;
        this.f7198g = fVar;
        this.f7195d = a0Var;
        this.f7199h = hVar;
        this.f7200i = cVar;
        this.f7201j = cVar2;
        this.f7202k = aVar;
        this.f7203l = l0Var;
    }

    public static void a(q qVar, String str) {
        Integer num;
        Objects.requireNonNull(qVar);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
        fVar.a(3);
        Locale locale = Locale.US;
        String format = String.format(locale, "Crashlytics Android SDK/%s", "18.2.8");
        i0 i0Var = qVar.f7197f;
        h hVar = qVar.f7199h;
        e.d.d.m.j.l.x xVar = new e.d.d.m.j.l.x(i0Var.f7179e, hVar.f7168e, hVar.f7169f, i0Var.c(), f0.determineFrom(hVar.f7166c).getId(), hVar.f7170g);
        Context context = qVar.f7193b;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        e.d.d.m.j.l.z zVar = new e.d.d.m.j.l.z(str2, str3, l.l(context));
        Context context2 = qVar.f7193b;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        int ordinal = l.a.getValue().ordinal();
        String str4 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long i2 = l.i();
        boolean k2 = l.k(context2);
        int e2 = l.e(context2);
        String str5 = Build.MANUFACTURER;
        String str6 = Build.PRODUCT;
        qVar.f7201j.c(str, format, currentTimeMillis, new e.d.d.m.j.l.w(xVar, zVar, new e.d.d.m.j.l.y(ordinal, str4, availableProcessors, i2, blockCount, k2, e2, str5, str6)));
        qVar.f7200i.a(str);
        l0 l0Var = qVar.f7203l;
        b0 b0Var = l0Var.a;
        Objects.requireNonNull(b0Var);
        Charset charset = e.d.d.m.j.l.a0.a;
        b.C0161b c0161b = new b.C0161b();
        c0161b.a = "18.2.8";
        String str7 = b0Var.f7151e.a;
        Objects.requireNonNull(str7, "Null gmpAppId");
        c0161b.f7362b = str7;
        String c2 = b0Var.f7150d.c();
        Objects.requireNonNull(c2, "Null installationUuid");
        c0161b.f7364d = c2;
        String str8 = b0Var.f7151e.f7168e;
        Objects.requireNonNull(str8, "Null buildVersion");
        c0161b.f7365e = str8;
        String str9 = b0Var.f7151e.f7169f;
        Objects.requireNonNull(str9, "Null displayVersion");
        c0161b.f7366f = str9;
        c0161b.f7363c = 4;
        g.b bVar = new g.b();
        bVar.b(false);
        bVar.f7397c = Long.valueOf(currentTimeMillis);
        Objects.requireNonNull(str, "Null identifier");
        bVar.f7396b = str;
        String str10 = b0.f7148b;
        Objects.requireNonNull(str10, "Null generator");
        bVar.a = str10;
        String str11 = b0Var.f7150d.f7179e;
        Objects.requireNonNull(str11, "Null identifier");
        String str12 = b0Var.f7151e.f7168e;
        Objects.requireNonNull(str12, "Null version");
        String str13 = b0Var.f7151e.f7169f;
        String c3 = b0Var.f7150d.c();
        e.d.d.m.j.e eVar = b0Var.f7151e.f7170g;
        if (eVar.f7143b == null) {
            eVar.f7143b = new e.b(eVar, null);
        }
        String str14 = eVar.f7143b.a;
        e.d.d.m.j.e eVar2 = b0Var.f7151e.f7170g;
        if (eVar2.f7143b == null) {
            eVar2.f7143b = new e.b(eVar2, null);
        }
        bVar.f7400f = new e.d.d.m.j.l.h(str11, str12, str13, null, c3, str14, eVar2.f7143b.f7144b, null);
        Integer num2 = 3;
        Boolean valueOf = Boolean.valueOf(l.l(b0Var.f7149c));
        String str15 = num2 == null ? " platform" : "";
        if (valueOf == null) {
            str15 = e.a.d.a.a.k(str15, " jailbroken");
        }
        if (!str15.isEmpty()) {
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str15));
        }
        bVar.f7402h = new e.d.d.m.j.l.u(num2.intValue(), str2, str3, valueOf.booleanValue(), null);
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str16 = Build.CPU_ABI;
        int i3 = 7;
        if (!TextUtils.isEmpty(str16) && (num = b0.a.get(str16.toLowerCase(locale))) != null) {
            i3 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long i4 = l.i();
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean k3 = l.k(b0Var.f7149c);
        int e3 = l.e(b0Var.f7149c);
        j.b bVar2 = new j.b();
        bVar2.a = Integer.valueOf(i3);
        bVar2.f7420b = str4;
        bVar2.f7421c = Integer.valueOf(availableProcessors2);
        bVar2.f7422d = Long.valueOf(i4);
        bVar2.f7423e = Long.valueOf(blockCount2);
        bVar2.f7424f = Boolean.valueOf(k3);
        bVar2.f7425g = Integer.valueOf(e3);
        bVar2.f7426h = str5;
        bVar2.f7427i = str6;
        bVar.f7403i = bVar2.a();
        bVar.f7405k = 3;
        c0161b.f7367g = bVar.a();
        e.d.d.m.j.l.a0 a2 = c0161b.a();
        e.d.d.m.j.n.e eVar3 = l0Var.f7185b;
        Objects.requireNonNull(eVar3);
        a0.e h2 = a2.h();
        if (h2 == null) {
            fVar.a(3);
            return;
        }
        String g2 = h2.g();
        try {
            e.d.d.m.j.n.e.f(eVar3.f7505g.f(g2, "report"), e.d.d.m.j.n.e.f7501c.f(a2));
            File f2 = eVar3.f7505g.f(g2, "start-time");
            long i5 = h2.i();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(f2), e.d.d.m.j.n.e.a);
            outputStreamWriter.write("");
            f2.setLastModified(i5 * 1000);
            outputStreamWriter.close();
        } catch (IOException unused) {
            e.d.d.m.j.f.a.a(3);
        }
    }

    public static Task b(q qVar) {
        boolean z;
        Task call;
        Objects.requireNonNull(qVar);
        ArrayList arrayList = new ArrayList();
        e.d.d.m.j.n.f fVar = qVar.f7198g;
        for (File file : e.d.d.m.j.n.f.i(fVar.a.listFiles(e.d.d.m.j.j.a.a))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    e.d.d.m.j.f.a.d("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
                    call = Tasks.forResult(null);
                } else {
                    e.d.d.m.j.f.a.a(3);
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new x(qVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                e.d.d.m.j.f fVar2 = e.d.d.m.j.f.a;
                StringBuilder y = e.a.d.a.a.y("Could not parse app exception timestamp from file ");
                y.append(file.getName());
                fVar2.d(y.toString());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r26, e.d.d.m.j.p.f r27) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.d.m.j.j.q.c(boolean, e.d.d.m.j.p.f):void");
    }

    public final void d(long j2) {
        try {
            e.d.d.m.j.n.f fVar = this.f7198g;
            if (fVar.a(".ae" + j2).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e2) {
            if (e.d.d.m.j.f.a.a(5)) {
                Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e2);
            }
        }
    }

    public void e(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, e.d.d.m.j.p.f fVar) {
        this.f7196e.b(new w(this, str));
        d0 d0Var = new d0(new a(), fVar, uncaughtExceptionHandler, this.f7201j);
        this.f7204m = d0Var;
        Thread.setDefaultUncaughtExceptionHandler(d0Var);
    }

    public boolean f(e.d.d.m.j.p.f fVar) {
        this.f7196e.a();
        if (h()) {
            e.d.d.m.j.f.a.d("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        e.d.d.m.j.f fVar2 = e.d.d.m.j.f.a;
        fVar2.a(2);
        try {
            c(true, fVar);
            fVar2.a(2);
            return true;
        } catch (Exception e2) {
            if (e.d.d.m.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e2);
            }
            return false;
        }
    }

    public final String g() {
        SortedSet<String> c2 = this.f7203l.f7185b.c();
        if (c2.isEmpty()) {
            return null;
        }
        return c2.first();
    }

    public boolean h() {
        d0 d0Var = this.f7204m;
        return d0Var != null && d0Var.f7156e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Task<Void> i(Task<e.d.d.m.j.p.j.a> task) {
        Task<Void> task2;
        Task task3;
        e.d.d.m.j.n.e eVar = this.f7203l.f7185b;
        if (!((eVar.f7505g.d().isEmpty() && eVar.f7505g.c().isEmpty() && eVar.f7505g.b().isEmpty()) ? false : true)) {
            e.d.d.m.j.f.a.a(2);
            this.f7205n.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
        fVar.a(2);
        if (this.f7194c.b()) {
            fVar.a(3);
            this.f7205n.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            fVar.a(3);
            fVar.a(2);
            this.f7205n.trySetResult(Boolean.TRUE);
            e0 e0Var = this.f7194c;
            synchronized (e0Var.f7158c) {
                task2 = e0Var.f7159d.getTask();
            }
            Task<TContinuationResult> onSuccessTask = task2.onSuccessTask(new t(this));
            fVar.a(3);
            Task<Boolean> task4 = this.o.getTask();
            ExecutorService executorService = n0.a;
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            Continuation<Boolean, TContinuationResult> continuation = new Continuation() { // from class: e.d.d.m.j.j.f
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task5) {
                    TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                    if (task5.isSuccessful()) {
                        taskCompletionSource2.trySetResult(task5.getResult());
                        return null;
                    }
                    Exception exception = task5.getException();
                    Objects.requireNonNull(exception);
                    taskCompletionSource2.trySetException(exception);
                    return null;
                }
            };
            onSuccessTask.continueWith(continuation);
            task4.continueWith(continuation);
            task3 = taskCompletionSource.getTask();
        }
        return task3.onSuccessTask(new b(task));
    }

    public void j(Thread thread, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        m mVar = this.f7196e;
        mVar.b(new n(mVar, new d(currentTimeMillis, th, thread)));
    }

    public void k(long j2, String str) {
        this.f7196e.b(new c(j2, str));
    }
}
