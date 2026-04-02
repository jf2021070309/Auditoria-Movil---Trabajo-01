package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.v;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.g;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.h;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.c;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a {
    private v a;
    private g b;
    private int c;

    /* loaded from: classes.dex */
    public static final class b {
        int a;
        int b;
        int c;
        boolean d = true;

        public b() {
            new ArrayList();
            this.a = 10000;
            this.b = 10000;
            this.c = 10000;
        }

        private static int a(String str, long j, TimeUnit timeUnit) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException(str + " < 0");
            } else if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                } else if (millis != 0 || i <= 0) {
                    return (int) millis;
                } else {
                    throw new IllegalArgumentException(str + " too small.");
                }
            } else {
                throw new NullPointerException("unit == null");
            }
        }

        public b a(long j, TimeUnit timeUnit) {
            this.a = a("timeout", j, timeUnit);
            return this;
        }

        public b a(boolean z) {
            this.d = z;
            return this;
        }

        public a a() {
            return new a(this);
        }

        public b b(long j, TimeUnit timeUnit) {
            this.b = a("timeout", j, timeUnit);
            return this;
        }

        public b c(long j, TimeUnit timeUnit) {
            this.c = a("timeout", j, timeUnit);
            return this;
        }
    }

    private a(b bVar) {
        v.b b2 = new v.b().a(bVar.a, TimeUnit.MILLISECONDS).c(bVar.c, TimeUnit.MILLISECONDS).b(bVar.b, TimeUnit.MILLISECONDS);
        if (bVar.d) {
            g gVar = new g();
            this.b = gVar;
            b2.a(gVar);
        }
        this.a = b2.a();
    }

    public static void d() {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_int108.b.a(b.EnumC0029b.DEBUG);
    }

    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.a a() {
        return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.a(this.a);
    }

    public void a(Context context, boolean z) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.a.a(context);
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.a.d(true);
        if (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do.a.c(context) || (!bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do.a.b(context) && z)) {
            h.a().a(this.c, context).d();
            h.a().a(this.c, context).f();
        }
        if (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do.a.b(context)) {
            h.a().a(this.c, context).d();
            h.a().a(this.c, context).f();
        }
    }

    public void a(Context context, boolean z, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12.b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
        int e = bVar.e();
        this.c = e;
        g gVar = this.b;
        if (gVar != null) {
            gVar.a(e);
        }
        h.a().a(this.c).a(z);
        h.a().a(this.c).a(bVar);
        h.a().a(this.c).a(context, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_19do.bykvm_19do.a.b(context));
    }

    public v b() {
        return this.a;
    }

    public c c() {
        return new c(this.a);
    }
}
