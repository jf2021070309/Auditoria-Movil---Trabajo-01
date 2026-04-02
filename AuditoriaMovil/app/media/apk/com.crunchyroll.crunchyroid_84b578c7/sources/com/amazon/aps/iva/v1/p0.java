package com.amazon.aps.iva.v1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.amazon.aps.iva.z1.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
/* compiled from: AndroidCompositionLocals.android.kt */
/* loaded from: classes.dex */
public final class p0 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration b;
    public final /* synthetic */ com.amazon.aps.iva.z1.a c;

    public p0(Configuration configuration, com.amazon.aps.iva.z1.a aVar) {
        this.b = configuration;
        this.c = aVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        com.amazon.aps.iva.yb0.j.f(configuration, "configuration");
        Configuration configuration2 = this.b;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator<Map.Entry<a.b, WeakReference<a.C0908a>>> it = this.c.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<a.b, WeakReference<a.C0908a>> next = it.next();
            com.amazon.aps.iva.yb0.j.e(next, "it.next()");
            a.C0908a c0908a = next.getValue().get();
            if (c0908a == null || Configuration.needNewResources(updateFrom, c0908a.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.c.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.c.a.clear();
    }
}
