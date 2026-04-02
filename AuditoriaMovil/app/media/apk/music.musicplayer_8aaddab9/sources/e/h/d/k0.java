package e.h.d;

import android.os.Bundle;
import android.os.IBinder;
import e.h.d.e0;
import e.h.g.s1;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class k0 implements Runnable {
    public final /* synthetic */ e0.j a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f8138b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ IBinder f8139c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e0.i f8140d;

    public k0(e0.i iVar, e0.j jVar, String str, IBinder iBinder) {
        this.f8140d = iVar;
        this.a = jVar;
        this.f8138b = str;
        this.f8139c = iBinder;
    }

    @Override // java.lang.Runnable
    public void run() {
        e0.b bVar = e0.this.f8100n.get(((e0.k) this.a).a());
        if (bVar == null) {
            StringBuilder y = e.a.d.a.a.y("removeSubscription for callback that isn't registered id=");
            y.append(this.f8138b);
            s1.m(y.toString());
            return;
        }
        e0 e0Var = e0.this;
        String str = this.f8138b;
        IBinder iBinder = this.f8139c;
        Objects.requireNonNull(e0Var);
        boolean z = false;
        if (iBinder != null) {
            List<c.i.j.b<IBinder, Bundle>> list = bVar.f8104d.get(str);
            if (list != null) {
                for (c.i.j.b<IBinder, Bundle> bVar2 : list) {
                    if (iBinder == bVar2.a) {
                        list.remove(bVar2);
                        z = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.f8104d.remove(str);
                }
            }
        } else if (bVar.f8104d.remove(str) != null) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder y2 = e.a.d.a.a.y("removeSubscription called for ");
        y2.append(this.f8138b);
        y2.append(" which is not subscribed");
        s1.m(y2.toString());
    }
}
