package e.d.b.e.a.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes2.dex */
public final class h1 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("ExtractorSessionStoreView");

    /* renamed from: b  reason: collision with root package name */
    public final z f6810b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<e3> f6811c;

    /* renamed from: d  reason: collision with root package name */
    public final t0 f6812d;

    /* renamed from: e  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<Executor> f6813e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Integer, e1> f6814f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final ReentrantLock f6815g = new ReentrantLock();

    public h1(z zVar, e.d.b.e.a.c.b0<e3> b0Var, t0 t0Var, e.d.b.e.a.c.b0<Executor> b0Var2) {
        this.f6810b = zVar;
        this.f6811c = b0Var;
        this.f6812d = t0Var;
        this.f6813e = b0Var2;
    }

    public static String c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new p0("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    public final <T> T a(g1<T> g1Var) {
        try {
            this.f6815g.lock();
            return g1Var.a();
        } finally {
            this.f6815g.unlock();
        }
    }

    public final e1 b(int i2) {
        Map<Integer, e1> map = this.f6814f;
        Integer valueOf = Integer.valueOf(i2);
        e1 e1Var = map.get(valueOf);
        if (e1Var != null) {
            return e1Var;
        }
        throw new p0(String.format("Could not find session %d while trying to get it", valueOf), i2);
    }
}
