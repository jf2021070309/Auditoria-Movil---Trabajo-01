package e.d.d.m.j.p;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e.d.d.m.j.j.e0;
import e.d.d.m.j.j.f0;
import e.d.d.m.j.j.i0;
import e.d.d.m.j.j.l;
import e.d.d.m.j.j.m0;
import e.d.d.m.j.j.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class e implements f {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.d.m.j.p.j.f f7516b;

    /* renamed from: c  reason: collision with root package name */
    public final g f7517c;

    /* renamed from: d  reason: collision with root package name */
    public final m0 f7518d;

    /* renamed from: e  reason: collision with root package name */
    public final a f7519e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.d.m.j.p.k.a f7520f;

    /* renamed from: g  reason: collision with root package name */
    public final e0 f7521g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<e.d.d.m.j.p.j.d> f7522h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<e.d.d.m.j.p.j.a>> f7523i;

    public e(Context context, e.d.d.m.j.p.j.f fVar, m0 m0Var, g gVar, a aVar, e.d.d.m.j.p.k.a aVar2, e0 e0Var) {
        AtomicReference<e.d.d.m.j.p.j.d> atomicReference = new AtomicReference<>();
        this.f7522h = atomicReference;
        this.f7523i = new AtomicReference<>(new TaskCompletionSource());
        this.a = context;
        this.f7516b = fVar;
        this.f7518d = m0Var;
        this.f7517c = gVar;
        this.f7519e = aVar;
        this.f7520f = aVar2;
        this.f7521g = e0Var;
        JSONObject jSONObject = new JSONObject();
        atomicReference.set(new e.d.d.m.j.p.j.e(b.c(m0Var, 3600L, jSONObject), null, new e.d.d.m.j.p.j.c(jSONObject.optInt("max_custom_exception_events", 8), 4), b.b(jSONObject), 0, 3600));
    }

    public static e a(Context context, String str, i0 i0Var, e.d.d.m.j.m.b bVar, String str2, String str3, e.d.d.m.j.n.f fVar, e0 e0Var) {
        String d2 = i0Var.d();
        m0 m0Var = new m0();
        g gVar = new g(m0Var);
        a aVar = new a(fVar);
        Locale locale = Locale.US;
        e.d.d.m.j.p.k.a aVar2 = new e.d.d.m.j.p.k.a(String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar);
        String format = String.format(locale, "%s/%s", i0Var.e(Build.MANUFACTURER), i0Var.e(Build.MODEL));
        String e2 = i0Var.e(Build.VERSION.INCREMENTAL);
        String e3 = i0Var.e(Build.VERSION.RELEASE);
        String[] strArr = {l.f(context), str, str3, str2};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            String str4 = strArr[i2];
            if (str4 != null) {
                arrayList.add(str4.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String sb2 = sb.toString();
        return new e(context, new e.d.d.m.j.p.j.f(str, format, e2, e3, i0Var, sb2.length() > 0 ? l.m(sb2) : null, str3, str2, f0.determineFrom(d2).getId()), m0Var, gVar, aVar, aVar2, e0Var);
    }

    public Task<e.d.d.m.j.p.j.a> b() {
        return this.f7523i.get().getTask();
    }

    public final e.d.d.m.j.p.j.e c(c cVar) {
        e.d.d.m.j.p.j.e eVar = null;
        try {
            if (!c.SKIP_CACHE_LOOKUP.equals(cVar)) {
                JSONObject a = this.f7519e.a();
                if (a != null) {
                    e.d.d.m.j.p.j.e a2 = this.f7517c.a(a);
                    if (a2 != null) {
                        e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
                        a.toString();
                        fVar.a(3);
                        Objects.requireNonNull(this.f7518d);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!c.IGNORE_CACHE_EXPIRATION.equals(cVar)) {
                            if (a2.f7527d < currentTimeMillis) {
                                fVar.a(2);
                            }
                        }
                        try {
                            fVar.a(2);
                            eVar = a2;
                        } catch (Exception e2) {
                            e = e2;
                            eVar = a2;
                            if (e.d.d.m.j.f.a.a(6)) {
                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            }
                            return eVar;
                        }
                    } else if (e.d.d.m.j.f.a.a(6)) {
                        Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
                    }
                } else {
                    e.d.d.m.j.f.a.a(3);
                }
            }
        } catch (Exception e3) {
            e = e3;
        }
        return eVar;
    }

    public e.d.d.m.j.p.j.d d() {
        return this.f7522h.get();
    }

    public Task<Void> e(Executor executor) {
        Task<Void> task;
        e.d.d.m.j.p.j.e c2;
        c cVar = c.USE_CACHE;
        if (!(!l.h(this.a).getString("existing_instance_identifier", "").equals(this.f7516b.f7532f)) && (c2 = c(cVar)) != null) {
            this.f7522h.set(c2);
            this.f7523i.get().trySetResult(c2.a);
            return Tasks.forResult(null);
        }
        e.d.d.m.j.p.j.e c3 = c(c.IGNORE_CACHE_EXPIRATION);
        if (c3 != null) {
            this.f7522h.set(c3);
            this.f7523i.get().trySetResult(c3.a);
        }
        e0 e0Var = this.f7521g;
        Task<Void> task2 = e0Var.f7163h.getTask();
        synchronized (e0Var.f7158c) {
            task = e0Var.f7159d.getTask();
        }
        ExecutorService executorService = n0.a;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<Void, TContinuationResult> continuation = new Continuation() { // from class: e.d.d.m.j.j.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (task3.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task3.getResult());
                    return null;
                }
                Exception exception = task3.getException();
                Objects.requireNonNull(exception);
                taskCompletionSource2.trySetException(exception);
                return null;
            }
        };
        task2.continueWith(executor, continuation);
        task.continueWith(executor, continuation);
        return taskCompletionSource.getTask().onSuccessTask(executor, new d(this));
    }
}
