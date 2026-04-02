package com.kwad.library.solder.lib;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.kwad.library.solder.lib.a.f;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.sdk.utils.ad;
import com.kwad.sdk.utils.q;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements com.kwad.library.solder.lib.a.f {
    private f.a afT;
    private final Context mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private static void a(com.kwad.library.solder.lib.a.e eVar) {
        new StringBuilder("onPreUpdate state = ").append(eVar.getState());
        eVar.wp().wg().m(eVar);
    }

    private static void a(com.kwad.library.solder.lib.a.e eVar, PluginError.UpdateError updateError) {
        new StringBuilder("onError state = ").append(eVar.getState());
        eVar.bI(1);
        eVar.j(updateError);
        eVar.wp().wg().c(eVar, updateError);
    }

    private void a(com.kwad.library.solder.lib.a.e eVar, File file) {
        long currentTimeMillis = System.currentTimeMillis();
        Log.d("PluginUpdaterImpl", "start download pluginId: " + eVar.wt());
        f.a aVar = this.afT;
        if (aVar == null) {
            throw new PluginError.UpdateError("update ", (int) PluginError.ERROR_UPD_NO_DOWNLOADER);
        }
        aVar.a(eVar, file);
        Log.i("PluginUpdaterImpl", "finish download pluginId: " + eVar.wt() + " cost:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    private static void b(com.kwad.library.solder.lib.a.e eVar) {
        new StringBuilder("onCanceled state = ").append(eVar.getState());
        eVar.bI(0);
        eVar.wp().wg().l(eVar);
    }

    private static void j(com.kwad.library.solder.lib.a.e eVar) {
        new StringBuilder("onPostUpdate state = ").append(eVar.getState());
        eVar.wp().wg().n(eVar);
    }

    @Override // com.kwad.library.solder.lib.a.f
    public final com.kwad.library.solder.lib.a.f a(f.a aVar) {
        this.afT = aVar;
        return this;
    }

    @Override // com.kwad.library.solder.lib.a.f
    public final void i(com.kwad.library.solder.lib.a.e eVar) {
        new StringBuilder("start update pluginId: ").append(eVar.wt());
        eVar.bH("Update");
        a(eVar);
        if (eVar.wu()) {
            eVar.wp().wf().bA(eVar.wt());
        }
        if (eVar.isCanceled()) {
            b(eVar);
            return;
        }
        try {
            eVar.wp().wf().wa();
            if (eVar.wy()) {
                try {
                    File d = eVar.wp().wf().d(eVar.wz(), false);
                    if (eVar.isCanceled()) {
                        b(eVar);
                        return;
                    }
                    try {
                        q.a(this.mContext, eVar.wz(), d);
                        eVar.bI(d.getAbsolutePath());
                        eVar.bI(3);
                        j(eVar);
                        return;
                    } catch (Throwable th) {
                        a.e("PluginUpdaterImpl", th);
                        a(eVar, new PluginError.UpdateError(th, (int) PluginError.ERROR_UPD_EXTRACT));
                        return;
                    }
                } catch (Throwable th2) {
                    new StringBuilder("Can not get temp file, error = ").append(th2.getLocalizedMessage());
                    a(eVar, new PluginError.UpdateError(th2, 2003));
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("requestPlugin use online plugin resource version:");
            sb.append(eVar.wt());
            sb.append(", url: ");
            sb.append(eVar.getDownloadUrl());
            try {
                File d2 = eVar.wp().wf().d(eVar.getDownloadUrl(), eVar.wp().wc().wK());
                if (eVar.wA() != null && d2.exists() && TextUtils.equals(ad.ab(d2), eVar.wA())) {
                    eVar.bI(d2.getAbsolutePath());
                    eVar.bI(4);
                    j(eVar);
                    return;
                }
                try {
                    a(eVar, d2);
                    eVar.bI(d2.getAbsolutePath());
                    eVar.bI(4);
                    j(eVar);
                } catch (PluginError.CancelError e) {
                    b(eVar);
                } catch (PluginError.UpdateError e2) {
                    a.e("PluginUpdaterImpl", "Download plugin fail, error = " + e2.getLocalizedMessage());
                    eVar.j(e2);
                    a(eVar, e2);
                }
            } catch (Throwable th3) {
                a.e("PluginUpdaterImpl", "Can not get temp file, error = " + th3.getLocalizedMessage());
                a(eVar, new PluginError.UpdateError(th3, 2003));
            }
        } catch (Throwable th4) {
            a.e("PluginUpdaterImpl", th4);
            a(eVar, new PluginError.UpdateError(th4, (int) PluginError.ERROR_UPD_CAPACITY));
        }
    }
}
