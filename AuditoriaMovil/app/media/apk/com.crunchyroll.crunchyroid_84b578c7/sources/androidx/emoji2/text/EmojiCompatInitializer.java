package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.k3.m;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements com.amazon.aps.iva.w8.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends d.c {
        public a(Context context) {
            super(new b(context));
            this.b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d.h {
        public final Context a;

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new com.amazon.aps.iva.i4.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new com.amazon.aps.iva.i4.d(this, 0, iVar, threadPoolExecutor));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = m.a;
                m.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (d.c()) {
                    d.a().d();
                }
                m.a.b();
            } catch (Throwable th) {
                int i2 = m.a;
                m.a.b();
                throw th;
            }
        }
    }

    @Override // com.amazon.aps.iva.w8.b
    /* renamed from: b */
    public final Boolean a(Context context) {
        Object obj;
        a aVar = new a(context);
        if (d.k == null) {
            synchronized (d.j) {
                if (d.k == null) {
                    d.k = new d(aVar);
                }
            }
        }
        com.amazon.aps.iva.w8.a c2 = com.amazon.aps.iva.w8.a.c(context);
        c2.getClass();
        synchronized (com.amazon.aps.iva.w8.a.e) {
            try {
                obj = c2.a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c2.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final androidx.lifecycle.g lifecycle = ((o) obj).getLifecycle();
        lifecycle.addObserver(new com.amazon.aps.iva.i5.g() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // com.amazon.aps.iva.i5.g
            public final void onResume(o oVar) {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = com.amazon.aps.iva.i4.c.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(), 500L);
                lifecycle.removeObserver(this);
            }
        });
        return Boolean.TRUE;
    }

    @Override // com.amazon.aps.iva.w8.b
    public final List<Class<? extends com.amazon.aps.iva.w8.b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
