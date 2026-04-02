package e.d.d.m.j.j;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e.d.d.m.j.j.c0;
import e.d.d.m.j.l.a0;
import e.d.d.m.j.l.k;
import e.d.d.m.j.l.l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class l0 {
    public final b0 a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.d.m.j.n.e f7185b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.d.m.j.o.c f7186c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.d.m.j.k.c f7187d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.d.m.j.k.h f7188e;

    public l0(b0 b0Var, e.d.d.m.j.n.e eVar, e.d.d.m.j.o.c cVar, e.d.d.m.j.k.c cVar2, e.d.d.m.j.k.h hVar) {
        this.a = b0Var;
        this.f7185b = eVar;
        this.f7186c = cVar;
        this.f7187d = cVar2;
        this.f7188e = hVar;
    }

    public static l0 b(Context context, i0 i0Var, e.d.d.m.j.n.f fVar, h hVar, e.d.d.m.j.k.c cVar, e.d.d.m.j.k.h hVar2, e.d.d.m.j.q.d dVar, e.d.d.m.j.p.f fVar2) {
        b0 b0Var = new b0(context, i0Var, hVar, dVar);
        e.d.d.m.j.n.e eVar = new e.d.d.m.j.n.e(fVar, fVar2);
        e.d.d.m.j.l.d0.g gVar = e.d.d.m.j.o.c.a;
        e.d.b.b.j.v.b(context);
        e.d.b.b.g c2 = e.d.b.b.j.v.a().c(new e.d.b.b.i.c(e.d.d.m.j.o.c.f7512b, e.d.d.m.j.o.c.f7513c));
        e.d.b.b.b bVar = new e.d.b.b.b("json");
        e.d.b.b.e<e.d.d.m.j.l.a0, byte[]> eVar2 = e.d.d.m.j.o.c.f7514d;
        return new l0(b0Var, eVar, new e.d.d.m.j.o.c(((e.d.b.b.j.s) c2).a("FIREBASE_CRASHLYTICS_REPORT", e.d.d.m.j.l.a0.class, bVar, eVar2), eVar2), cVar, hVar2);
    }

    public static List<a0.c> c(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            Objects.requireNonNull(key, "Null key");
            String value = entry.getValue();
            Objects.requireNonNull(value, "Null value");
            arrayList.add(new e.d.d.m.j.l.d(key, value, null));
        }
        Collections.sort(arrayList, new Comparator() { // from class: e.d.d.m.j.j.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((a0.c) obj).a().compareTo(((a0.c) obj2).a());
            }
        });
        return arrayList;
    }

    public final a0.e.d a(a0.e.d dVar, e.d.d.m.j.k.c cVar, e.d.d.m.j.k.h hVar) {
        a0.e.d.b f2 = dVar.f();
        String b2 = cVar.f7238c.b();
        if (b2 != null) {
            ((k.b) f2).f7435e = new e.d.d.m.j.l.t(b2, null);
        } else {
            e.d.d.m.j.f.a.a(2);
        }
        List<a0.c> c2 = c(hVar.a.a());
        List<a0.c> c3 = c(hVar.f7255b.a());
        if (!((ArrayList) c2).isEmpty() || !((ArrayList) c3).isEmpty()) {
            l.b bVar = (l.b) dVar.a().f();
            bVar.f7440b = new e.d.d.m.j.l.b0<>(c2);
            bVar.f7441c = new e.d.d.m.j.l.b0<>(c3);
            f2.b(bVar.a());
        }
        return f2.a();
    }

    public final void d(Throwable th, Thread thread, String str, String str2, long j2, boolean z) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        boolean equals = str2.equals(AppMeasurement.CRASH_ORIGIN);
        b0 b0Var = this.a;
        int i2 = b0Var.f7149c.getResources().getConfiguration().orientation;
        e.d.d.m.j.q.e eVar = new e.d.d.m.j.q.e(th, b0Var.f7152f);
        k.b bVar = new k.b();
        bVar.e(str2);
        bVar.a = Long.valueOf(j2);
        String str3 = b0Var.f7151e.f7167d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) b0Var.f7149c.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (it.hasNext()) {
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str3)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        Boolean valueOf = runningAppProcessInfo != null ? Boolean.valueOf(runningAppProcessInfo.importance != 100) : null;
        Integer valueOf2 = Integer.valueOf(i2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b0Var.f(thread, eVar.f7539c, 4));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(b0Var.f(key, b0Var.f7152f.a(entry.getValue()), 0));
                }
            }
        }
        e.d.d.m.j.l.m mVar = new e.d.d.m.j.l.m(new e.d.d.m.j.l.b0(arrayList), b0Var.c(eVar, 4, 8, 0), null, b0Var.e(), b0Var.a(), null);
        String str4 = valueOf2 == null ? " uiOrientation" : "";
        if (!str4.isEmpty()) {
            throw new IllegalStateException(e.a.d.a.a.k("Missing required properties:", str4));
        }
        bVar.b(new e.d.d.m.j.l.l(mVar, null, null, valueOf, valueOf2.intValue(), null));
        bVar.c(b0Var.b(i2));
        this.f7185b.d(a(bVar.a(), this.f7187d, this.f7188e), str, equals);
    }

    public Task<Void> e(Executor executor) {
        List<File> b2 = this.f7185b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) b2).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                arrayList.add(new i(e.d.d.m.j.n.e.f7501c.e(e.d.d.m.j.n.e.e(file)), file.getName(), file));
            } catch (IOException e2) {
                e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
                fVar.e("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            final c0 c0Var = (c0) it2.next();
            e.d.d.m.j.o.c cVar = this.f7186c;
            Objects.requireNonNull(cVar);
            e.d.d.m.j.l.a0 a = c0Var.a();
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            ((e.d.b.b.j.t) cVar.f7515e).a(new e.d.b.b.a(null, a, e.d.b.b.d.HIGHEST), new e.d.b.b.h() { // from class: e.d.d.m.j.o.b
                @Override // e.d.b.b.h
                public final void a(Exception exc) {
                    TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                    c0 c0Var2 = c0Var;
                    if (exc != null) {
                        taskCompletionSource2.trySetException(exc);
                    } else {
                        taskCompletionSource2.trySetResult(c0Var2);
                    }
                }
            });
            arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new Continuation() { // from class: e.d.d.m.j.j.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    boolean z;
                    Objects.requireNonNull(l0.this);
                    if (task.isSuccessful()) {
                        c0 c0Var2 = (c0) task.getResult();
                        e.d.d.m.j.f fVar2 = e.d.d.m.j.f.a;
                        c0Var2.c();
                        fVar2.a(3);
                        File b3 = c0Var2.b();
                        if (b3.delete()) {
                            b3.getPath();
                            fVar2.a(3);
                        } else {
                            StringBuilder y = e.a.d.a.a.y("Crashlytics could not delete report file: ");
                            y.append(b3.getPath());
                            fVar2.d(y.toString());
                        }
                        z = true;
                    } else {
                        e.d.d.m.j.f fVar3 = e.d.d.m.j.f.a;
                        Exception exception = task.getException();
                        if (fVar3.a(5)) {
                            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", exception);
                        }
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            }));
        }
        return Tasks.whenAll(arrayList2);
    }
}
