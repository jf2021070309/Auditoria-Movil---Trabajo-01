package com.kwad.components.core.n.b;

import android.content.Context;
import android.os.SystemClock;
import com.kwad.components.offline.api.IOfflineCompo;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.library.solder.lib.ext.b;
import com.kwad.sdk.core.e.c;
/* loaded from: classes.dex */
public abstract class a<T extends IOfflineCompo<?>> {
    private long Dh;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(Context context, boolean z, ClassLoader classLoader) {
        String or = or();
        try {
            IOfflineCompo iOfflineCompo = (IOfflineCompo) classLoader.loadClass(or).newInstance();
            String tag = getTag();
            c.d(tag, "load component instance success: " + iOfflineCompo.getClass().getName() + ", loadFromNet:" + z + ", classLoader:" + classLoader);
            a(context, z, (boolean) iOfflineCompo);
        } catch (Throwable th) {
            String tag2 = getTag();
            c.e(tag2, "loadClass or instance failed: " + or, th);
        }
    }

    private void af(final Context context) {
        if (com.kwad.components.core.a.HT.booleanValue()) {
            c.d(getTag(), "init start disableOffline");
            a(context, false, getClass().getClassLoader());
            return;
        }
        com.kwad.library.solder.lib.c.b oj = oj();
        String tag = getTag();
        c.d(tag, "load component start pluginInfo: " + oj);
        com.kwad.library.solder.a.a.a(context, oj, new b.a() { // from class: com.kwad.components.core.n.b.a.1
            boolean Lw = false;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public void a(com.kwad.library.solder.lib.b.a aVar) {
                super.a((AnonymousClass1) aVar);
                this.Lw = true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public void a(com.kwad.library.solder.lib.b.a aVar, com.kwad.library.b.a aVar2) {
                super.a((AnonymousClass1) aVar, (com.kwad.library.solder.lib.b.a) aVar2);
                c.d(a.this.getTag(), "load component resource success");
                a.this.a(context, this.Lw, aVar2.vY());
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.library.solder.lib.ext.b.C0240b, com.kwad.library.solder.lib.ext.b
            public void a(com.kwad.library.solder.lib.b.a aVar, PluginError pluginError) {
                super.a((AnonymousClass1) aVar, pluginError);
                String tag2 = a.this.getTag();
                c.d(tag2, "load component resource failed error: " + pluginError);
            }
        });
    }

    private com.kwad.library.solder.lib.c.b oj() {
        com.kwad.library.solder.lib.c.b bVar = new com.kwad.library.solder.lib.c.b();
        bVar.agJ = om();
        bVar.IO = true;
        bVar.agN = false;
        bVar.agK = com.kwad.sdk.core.network.idc.a.Bm().dc(oo());
        bVar.version = on();
        bVar.agM = op();
        if (com.kwad.components.core.a.HW.booleanValue()) {
            bVar.agp = oq();
            bVar.agq = true;
        }
        return bVar;
    }

    protected abstract void a(Context context, boolean z, T t);

    protected abstract String getTag();

    public final void init(Context context) {
        if (isEnabled()) {
            this.Dh = SystemClock.elapsedRealtime();
            com.kwad.components.core.n.a.as(ol());
            c.d(getTag(), "init start");
            af(context);
        }
    }

    public abstract boolean isEnabled();

    public final void ok() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.Dh;
        String tag = getTag();
        c.d(tag, "init component success cost: " + elapsedRealtime);
        com.kwad.components.core.n.a.b(ol(), elapsedRealtime);
    }

    public abstract int ol();

    protected abstract String om();

    protected abstract String on();

    protected abstract String oo();

    protected abstract String op();

    protected abstract String oq();

    protected abstract String or();
}
