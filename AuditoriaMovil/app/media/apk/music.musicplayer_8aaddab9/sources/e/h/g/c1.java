package e.h.g;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
/* loaded from: classes2.dex */
public abstract class c1 extends v1 {

    /* renamed from: c  reason: collision with root package name */
    public Activity f8253c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8254d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8255e;

    /* renamed from: f  reason: collision with root package name */
    public int f8256f;

    public c1(String str, Activity activity, boolean z, boolean z2, int i2) {
        super(str);
        this.f8253c = activity;
        this.f8255e = z;
        this.f8254d = z2;
        this.f8256f = i2;
    }

    @Override // e.h.g.v1
    public final void b(Message message) {
        final Object obj = message.obj;
        Activity activity = this.f8253c;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        final Object i2 = i(obj);
        if (!this.f8254d || activity.isFinishing()) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: e.h.g.w
            @Override // java.lang.Runnable
            public final void run() {
                c1.this.j(obj, i2);
            }
        });
    }

    @Override // e.h.g.v1
    public void d() {
        super.d();
        this.f8253c = null;
    }

    public void h(final Object obj) {
        Activity activity = this.f8253c;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (this.f8255e) {
            activity.runOnUiThread(new Runnable() { // from class: e.h.g.v
                @Override // java.lang.Runnable
                public final void run() {
                    c1 c1Var = c1.this;
                    Object obj2 = obj;
                    c1Var.k(obj2);
                    c1Var.l(obj2);
                }
            });
        } else {
            l(obj);
        }
    }

    public abstract Object i(Object obj);

    public abstract void j(Object obj, Object obj2);

    public abstract void k(Object obj);

    public final void l(Object obj) {
        Message c2 = c(0, obj);
        int i2 = this.f8256f;
        if (i2 == 0) {
            c2.sendToTarget();
        } else if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            a(0);
            c2.sendToTarget();
        } else {
            Handler handler = this.a;
            if (handler != null) {
                handler.sendMessageAtFrontOfQueue(c2);
            }
        }
    }
}
