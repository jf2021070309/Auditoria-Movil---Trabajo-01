package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_int108;

import android.os.SystemClock;
import android.util.Log;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.j;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_case1.m;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.bykvm_19do.e;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.f;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.g;
import bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.i;
import com.facebook.share.internal.ShareConstants;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {
    private static a e;
    private Thread.UncaughtExceptionHandler a;
    private b c;
    private HashSet<Thread.UncaughtExceptionHandler> b = new HashSet<>();
    private long d = -1;

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_int108.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0064a extends bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.bykvm_19do.bykvm_if122.c {
        final /* synthetic */ String b;

        C0064a(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.a aVar = new bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.a();
                aVar.a(ShareConstants.WEB_DIALOG_PARAM_DATA, this.b);
                aVar.a("userdefine", (Object) 1);
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_for12.a a = e.a().a(bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.CUSTOM_JAVA, aVar);
                if (a != null) {
                    bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_byte12b.a.a().c(a.a());
                }
            } catch (Throwable th) {
            }
        }
    }

    private a() {
        b();
    }

    public static a a() {
        if (e == null) {
            e = new a();
        }
        return e;
    }

    public static void a(String str) {
        if (str == null) {
            return;
        }
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.bykvm_19do.bykvm_if122.a.a().a(new C0064a(str));
    }

    private void a(Thread thread, Throwable th) {
        try {
            Iterator<Thread.UncaughtExceptionHandler> it = this.b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().uncaughtException(thread, th);
                } catch (Throwable th2) {
                }
            }
            this.a.uncaughtException(thread, th);
        } catch (Throwable th3) {
        }
    }

    private void b() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != this) {
            Thread.setDefaultUncaughtExceptionHandler(this);
            if (this.a == null) {
                this.a = defaultUncaughtExceptionHandler;
            } else {
                this.b.add(defaultUncaughtExceptionHandler);
            }
        }
    }

    private void b(Thread thread, Throwable th) {
        List<f> c = i.d().c();
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c cVar = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.JAVA;
        for (f fVar : c) {
            try {
                fVar.a(cVar, m.a(th), thread);
            } catch (Throwable th2) {
                j.b(th2);
            }
        }
    }

    private boolean c(Thread thread, Throwable th) {
        g b = i.d().b();
        if (b != null) {
            try {
                if (!b.a(th, thread)) {
                    return false;
                }
            } catch (Throwable th2) {
            }
        }
        return true;
    }

    public void a(b bVar) {
        this.c = bVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        b bVar;
        if (SystemClock.uptimeMillis() - this.d < 20000) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.d = SystemClock.uptimeMillis();
            boolean c = c(thread, th);
            if (c) {
                bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c cVar = bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.c.JAVA;
                b(thread, th);
                if (c && (bVar = this.c) != null && bVar.a(th)) {
                    this.c.a(currentTimeMillis, thread, th);
                    Log.i("crash_dispatcher", "end dispose " + th);
                }
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
