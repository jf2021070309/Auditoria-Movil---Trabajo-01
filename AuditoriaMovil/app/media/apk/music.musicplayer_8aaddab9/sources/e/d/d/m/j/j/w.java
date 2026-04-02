package e.d.d.m.j.j;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public class w implements Callable<Void> {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f7219b;

    public w(q qVar, String str) {
        this.f7219b = qVar;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        q.a(this.f7219b, this.a);
        return null;
    }
}
