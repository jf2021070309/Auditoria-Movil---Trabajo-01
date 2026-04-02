package c.i.h;

import android.os.Handler;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class o<T> implements Runnable {
    public Callable<T> a;

    /* renamed from: b  reason: collision with root package name */
    public c.i.j.a<T> f2099b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f2100c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ c.i.j.a a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f2101b;

        public a(o oVar, c.i.j.a aVar, Object obj) {
            this.a = aVar;
            this.f2101b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.a.a(this.f2101b);
        }
    }

    public o(Handler handler, Callable<T> callable, c.i.j.a<T> aVar) {
        this.a = callable;
        this.f2099b = aVar;
        this.f2100c = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        T t;
        try {
            t = this.a.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f2100c.post(new a(this, this.f2099b, t));
    }
}
