package c.c0.d0.t;

import androidx.work.impl.WorkDatabase;
/* loaded from: classes.dex */
public class f {
    public final WorkDatabase a;

    public f(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public final int a(String str) {
        this.a.c();
        try {
            Long a = ((c.c0.d0.s.f) this.a.m()).a(str);
            int i2 = 0;
            int intValue = a != null ? a.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i2 = intValue + 1;
            }
            ((c.c0.d0.s.f) this.a.m()).b(new c.c0.d0.s.d(str, i2));
            this.a.k();
            return intValue;
        } finally {
            this.a.g();
        }
    }

    public int b(int i2, int i3) {
        synchronized (f.class) {
            int a = a("next_job_scheduler_id");
            if (a >= i2 && a <= i3) {
                i2 = a;
            }
            ((c.c0.d0.s.f) this.a.m()).b(new c.c0.d0.s.d("next_job_scheduler_id", i2 + 1));
        }
        return i2;
    }
}
