package com.amazon.aps.iva.ab;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.amazon.aps.iva.ee0.u1;
import java.nio.ByteBuffer;
import java.util.Collection;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public abstract class a implements com.amazon.aps.iva.d7.a {
    public static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return b(((ContextWrapper) context).getBaseContext());
    }

    public static int h(com.amazon.aps.iva.ib.a aVar) {
        return (aVar.d() - aVar.a()) - aVar.g();
    }

    public static int i(com.amazon.aps.iva.ib.a aVar) {
        return (aVar.c() - aVar.b()) - aVar.g();
    }

    @Override // com.amazon.aps.iva.d7.a
    public com.amazon.aps.iva.q5.f0 a(com.amazon.aps.iva.d7.b bVar) {
        boolean z;
        ByteBuffer byteBuffer = bVar.d;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.t(z);
        if (bVar.j()) {
            return null;
        }
        return e(bVar, byteBuffer);
    }

    public abstract void c(com.amazon.aps.iva.oc0.b bVar);

    public abstract boolean d(com.amazon.aps.iva.t1.c cVar);

    public abstract com.amazon.aps.iva.q5.f0 e(com.amazon.aps.iva.d7.b bVar, ByteBuffer byteBuffer);

    public abstract void f();

    public abstract Object g(com.amazon.aps.iva.t1.i iVar);

    public abstract void j(com.amazon.aps.iva.oc0.b bVar, com.amazon.aps.iva.oc0.b bVar2);

    public abstract boolean k();

    public abstract com.android.billingclient.api.c l(Activity activity, com.android.billingclient.api.b bVar);

    public abstract u1 m(com.amazon.aps.iva.he0.h hVar);

    public abstract void n(com.android.billingclient.api.e eVar, b bVar);

    public abstract void o(l lVar, c cVar);

    public abstract void p(m mVar, com.amazon.aps.iva.rs.j jVar);

    public abstract com.amazon.aps.iva.ee0.e0 q(com.amazon.aps.iva.he0.h hVar);

    public void r(com.amazon.aps.iva.oc0.b bVar, Collection collection) {
        com.amazon.aps.iva.yb0.j.f(bVar, "member");
        bVar.z0(collection);
    }
}
