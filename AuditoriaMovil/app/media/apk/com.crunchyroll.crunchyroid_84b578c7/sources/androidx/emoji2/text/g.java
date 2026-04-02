package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.d;
import com.amazon.aps.iva.m3.k;
import com.amazon.aps.iva.m3.l;
import com.amazon.aps.iva.q.j1;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public final class g extends d.c {
    public static final a d = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class b implements d.h {
        public final Context a;
        public final com.amazon.aps.iva.m3.e b;
        public final a c;
        public final Object d;
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public d.i h;

        public b(Context context, com.amazon.aps.iva.m3.e eVar) {
            a aVar = g.d;
            this.d = new Object();
            if (context != null) {
                this.a = context.getApplicationContext();
                this.b = eVar;
                this.c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        @Override // androidx.emoji2.text.d.h
        public final void a(d.i iVar) {
            synchronized (this.d) {
                this.h = iVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.d) {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            }
        }

        public final void c() {
            synchronized (this.d) {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new com.amazon.aps.iva.i4.a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new j1(this, 1));
            }
        }

        public final l d() {
            try {
                a aVar = this.c;
                Context context = this.a;
                com.amazon.aps.iva.m3.e eVar = this.b;
                aVar.getClass();
                k a = com.amazon.aps.iva.m3.d.a(context, eVar);
                int i = a.a;
                if (i == 0) {
                    l[] lVarArr = a.b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(com.amazon.aps.iva.c80.a.d("fetchFonts failed (", i, ")"));
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }
    }

    public g(Context context, com.amazon.aps.iva.m3.e eVar) {
        super(new b(context, eVar));
    }
}
