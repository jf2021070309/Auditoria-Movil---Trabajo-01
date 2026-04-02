package e.h.d;

import android.support.v4.os.ResultReceiver;
import e.h.d.e0;
import e.h.g.s1;
/* loaded from: classes2.dex */
public class i0 implements Runnable {
    public final /* synthetic */ e0.j a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8127b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f8128c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e0.i f8129d;

    public i0(e0.i iVar, e0.j jVar, String str, ResultReceiver resultReceiver) {
        this.f8129d = iVar;
        this.a = jVar;
        this.f8127b = str;
        this.f8128c = resultReceiver;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (e0.this.f8100n.get(((e0.k) this.a).a()) == null) {
            StringBuilder y = e.a.d.a.a.y("getMediaItem for callback that isn't registered id=");
            y.append(this.f8127b);
            s1.b(y.toString());
            return;
        }
        e0 e0Var = e0.this;
        String str = this.f8127b;
        d0 d0Var = new d0(e0Var, str, this.f8128c);
        e0Var.r(d0Var);
        if (!(d0Var.f8113b || d0Var.f8115d)) {
            throw new IllegalStateException(e.a.d.a.a.k("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}
