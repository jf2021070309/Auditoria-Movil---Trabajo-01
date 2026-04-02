package e.d.d.m.j.j;

import android.os.Bundle;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public class x implements Callable<Void> {
    public final /* synthetic */ long a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f7220b;

    public x(q qVar, long j2) {
        this.f7220b = qVar;
        this.a = j2;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.f7220b.f7202k.a("_ae", bundle);
        return null;
    }
}
