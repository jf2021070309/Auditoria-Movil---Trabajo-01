package com.me.game.pm_tools;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import java.lang.reflect.Field;
/* loaded from: classes5.dex */
public class b0 {
    private static volatile b0 b;
    private Toast a = null;

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (b0.this.a != null) {
                    b0.this.a.cancel();
                    b0.this.a = null;
                }
                b0.this.a = Toast.makeText(com.me.game.pm_tools.b.d, this.a, this.b);
                b0.d(b0.this.a);
                b0.this.a.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes5.dex */
    public class b implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.m(this.a, this.b);
        }
    }

    /* loaded from: classes5.dex */
    public static class c extends Handler {
        private Handler a;

        public c(Handler handler) {
            this.a = handler;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                this.a.handleMessage(message);
            } catch (Exception unused) {
            }
        }
    }

    private b0() {
    }

    public static b0 c() {
        synchronized (b0.class) {
            if (b == null) {
                b = new b0();
            }
        }
        return b;
    }

    public static void d(Toast toast) {
        try {
            Field declaredField = Toast.class.getDeclaredField("mTN");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(toast);
            Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, new c((Handler) declaredField2.get(obj)));
        } catch (Throwable unused) {
        }
    }

    public void e(Handler handler, int i, int i2) {
        h(handler, com.me.game.pm_tools.b.d.getString(i), i2, 0L);
    }

    public void f(Handler handler, int i, int i2, long j) {
        h(handler, com.me.game.pm_tools.b.d.getString(i), i2, j);
    }

    public void g(Handler handler, String str, int i) {
        h(handler, str, i, 0L);
    }

    public void h(Handler handler, String str, int i, long j) {
        x.c(handler, new b(str, i), j);
    }

    public void i(int i) {
        m(com.me.game.pm_tools.b.d.getString(i), 1);
    }

    public void j(String str) {
        m(str, 1);
    }

    public void k(int i) {
        m(com.me.game.pm_tools.b.d.getString(i), 0);
    }

    public void l(String str) {
        m(str, 0);
    }

    public void m(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        a aVar = new a(str, i);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aVar.run();
        } else {
            com.me.game.pm_tools.b.d.e(aVar);
        }
    }
}
