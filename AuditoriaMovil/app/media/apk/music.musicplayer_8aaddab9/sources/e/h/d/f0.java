package e.h.d;

import android.os.Bundle;
import android.os.IBinder;
import e.h.d.e0;
import e.h.g.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class f0 implements Runnable {
    public final /* synthetic */ e0.j a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8117b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ IBinder f8118c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f8119d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e0.i f8120e;

    public f0(e0.i iVar, e0.j jVar, String str, IBinder iBinder, Bundle bundle) {
        this.f8120e = iVar;
        this.a = jVar;
        this.f8117b = str;
        this.f8118c = iBinder;
        this.f8119d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        e0.b bVar = e0.this.f8100n.get(((e0.k) this.a).a());
        if (bVar == null) {
            StringBuilder y = e.a.d.a.a.y("addSubscription for callback that isn't registered id=");
            y.append(this.f8117b);
            s1.m(y.toString());
            return;
        }
        e0 e0Var = e0.this;
        String str = this.f8117b;
        IBinder iBinder = this.f8118c;
        Bundle bundle = this.f8119d;
        Objects.requireNonNull(e0Var);
        List<c.i.j.b<IBinder, Bundle>> list = bVar.f8104d.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        Iterator<c.i.j.b<IBinder, Bundle>> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                list.add(new c.i.j.b<>(iBinder, bundle));
                bVar.f8104d.put(str, list);
                c0 c0Var = new c0(e0Var, str, bVar, str, bundle);
                if (bundle == null) {
                    e0Var.p(str, c0Var);
                } else {
                    e0Var.q(str, c0Var);
                }
                if (!c0Var.f8113b && !c0Var.f8115d) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException(e.a.d.a.a.s(e.a.d.a.a.y("onLoadChildren must call detach() or sendResult() before returning for package="), bVar.f8102b, " id=", str));
                }
                return;
            }
            c.i.j.b<IBinder, Bundle> next = it.next();
            if (iBinder == next.a) {
                Bundle bundle2 = next.f2126b;
                if (bundle != bundle2) {
                    z = bundle == null ? false : false;
                }
                if (z) {
                    return;
                }
            }
        }
    }
}
