package e.d.d.m.j.j;

import android.util.Log;
import e.d.d.m.j.j.q;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class d0 implements Thread.UncaughtExceptionHandler {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.d.m.j.p.f f7153b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f7154c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.d.m.j.c f7155d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f7156e = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public interface a {
    }

    public d0(a aVar, e.d.d.m.j.p.f fVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, e.d.d.m.j.c cVar) {
        this.a = aVar;
        this.f7153b = fVar;
        this.f7154c = uncaughtExceptionHandler;
        this.f7155d = cVar;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            e.d.d.m.j.f.a.b("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            e.d.d.m.j.f.a.b("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f7155d.b()) {
            e.d.d.m.j.f.a.a(3);
            return false;
        } else {
            return true;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f7156e.set(true);
        try {
            try {
                if (a(thread, th)) {
                    ((q.a) this.a).a(this.f7153b, thread, th);
                } else {
                    e.d.d.m.j.f.a.a(3);
                }
                e.d.d.m.j.f.a.a(3);
            } catch (Exception e2) {
                e.d.d.m.j.f fVar = e.d.d.m.j.f.a;
                if (fVar.a(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e2);
                }
                fVar.a(3);
            }
            this.f7154c.uncaughtException(thread, th);
            this.f7156e.set(false);
        } catch (Throwable th2) {
            e.d.d.m.j.f.a.a(3);
            this.f7154c.uncaughtException(thread, th);
            this.f7156e.set(false);
            throw th2;
        }
    }
}
