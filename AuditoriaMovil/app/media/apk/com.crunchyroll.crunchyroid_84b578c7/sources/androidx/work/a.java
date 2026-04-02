package androidx.work;

import com.amazon.aps.iva.k9.j;
import com.amazon.aps.iva.k9.w;
import com.amazon.aps.iva.k9.x;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: Configuration.java */
/* loaded from: classes.dex */
public final class a {
    public final ExecutorService a = a(false);
    public final ExecutorService b = a(true);
    public final w c;
    public final j d;
    public final com.amazon.aps.iva.l9.a e;
    public final int f;
    public final int g;
    public final int h;

    /* compiled from: Configuration.java */
    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0061a {
    }

    /* compiled from: Configuration.java */
    /* loaded from: classes.dex */
    public interface b {
        a a();
    }

    public a(C0061a c0061a) {
        int i = x.a;
        this.c = new w();
        this.d = new j();
        this.e = new com.amazon.aps.iva.l9.a(0);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }

    public static ExecutorService a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new com.amazon.aps.iva.k9.b(z));
    }
}
