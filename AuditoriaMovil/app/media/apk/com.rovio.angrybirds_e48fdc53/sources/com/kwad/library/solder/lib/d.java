package com.kwad.library.solder.lib;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.sdk.utils.ag;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements com.kwad.library.solder.lib.a.c {
    private final ConcurrentHashMap<String, com.kwad.library.solder.lib.a.a> afH = new ConcurrentHashMap<>();
    private final Context mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private static void a(com.kwad.library.solder.lib.a.e eVar, com.kwad.library.solder.lib.a.a aVar) {
        new StringBuilder("onLoadSuccess state = ").append(eVar.getState());
        eVar.bI(5);
        eVar.wp().wg().b(eVar, aVar);
    }

    private synchronized void a(String str, com.kwad.library.solder.lib.a.a aVar) {
        if (aVar != null) {
            if (aVar.isLoaded()) {
                this.afH.put(str, aVar);
            }
        }
    }

    private static void b(com.kwad.library.solder.lib.a.e eVar) {
        new StringBuilder("onCanceled state = ").append(eVar.getState());
        eVar.bI(0);
        eVar.wp().wg().l(eVar);
    }

    private static void b(com.kwad.library.solder.lib.a.e eVar, PluginError pluginError) {
        new StringBuilder("onError state = ").append(eVar.getState());
        eVar.bI(6);
        eVar.j(pluginError);
        eVar.wp().wg().c(eVar, pluginError);
    }

    private com.kwad.library.solder.lib.a.a e(com.kwad.library.solder.lib.a.e eVar) {
        com.kwad.library.solder.lib.a.a a = eVar.bK(eVar.ww()).a(eVar.wB());
        String wn = a.wn();
        File file = new File(wn);
        StringBuilder sb = new StringBuilder("install pluginId: ");
        sb.append(eVar.wt());
        sb.append(", path: ");
        sb.append(wn);
        com.kwad.library.solder.lib.a.d wp = eVar.wp();
        if (file.exists()) {
            String wt = eVar.wt();
            String version = eVar.getVersion();
            com.kwad.library.solder.lib.a.a bC = bC(wt);
            if (bC != null) {
                new StringBuilder("the current plugin has been loaded, id = ").append(version);
                return bC;
            }
            a.bF(wt);
            a.bE(version);
            if (wp.wf().b(wt, version, eVar.wA())) {
                String y = wp.wf().y(wt, version);
                if (q.fq(y)) {
                    new StringBuilder("The current version has been installed before pluginId: ").append(wt);
                    a.bG(y);
                    a.h(this.mContext, y);
                    a(wt, a);
                    return a;
                }
            }
            new StringBuilder("plugin is not install start install pluginId: ").append(wt);
            String b = wp.wf().b(a);
            a.bG(b);
            a.h(this.mContext, b);
            a(wt, a);
            if (wn.endsWith(wp.wc().wH())) {
                q.delete(wn);
            }
            return a;
        }
        throw new PluginError.LoadError("Apk file not exist.", 3001);
    }

    private static void f(com.kwad.library.solder.lib.a.e eVar) {
        new StringBuilder("onPreLoad state = ").append(eVar.getState());
    }

    @Override // com.kwad.library.solder.lib.a.c
    public final synchronized com.kwad.library.solder.lib.a.a bC(String str) {
        com.kwad.library.solder.lib.a.a aVar = this.afH.get(str);
        if (aVar != null) {
            if (!aVar.isLoaded()) {
                return null;
            }
        }
        return aVar;
    }

    @Override // com.kwad.library.solder.lib.a.c
    public final void d(com.kwad.library.solder.lib.a.e eVar) {
        new StringBuilder("start load pluginId: ").append(eVar.wt());
        eVar.bH("Load");
        f(eVar);
        if (eVar.isCanceled()) {
            b(eVar);
            return;
        }
        com.kwad.library.solder.lib.a.a aVar = this.afH.get(eVar.wt());
        if (aVar != null && aVar.isLoaded()) {
            eVar.c(aVar);
            StringBuilder sb = new StringBuilder("load plugin success pluginId: ");
            sb.append(eVar.wt());
            sb.append(", path = ");
            sb.append(aVar.wn());
            a(eVar, aVar);
            return;
        }
        com.kwad.library.solder.lib.c.b wB = eVar.wB();
        if (wB == null) {
            b(eVar, new PluginError.LoadError("not pluginInfo", (int) PluginError.ERROR_UPD_REQUEST));
            return;
        }
        List<com.kwad.library.solder.lib.c.a> wC = eVar.wC();
        com.kwad.library.solder.lib.c.a aVar2 = null;
        if (wC != null && !wC.isEmpty()) {
            for (com.kwad.library.solder.lib.c.a aVar3 : wC) {
                if (eVar.getVersion().equals(aVar3.version)) {
                    aVar2 = aVar3;
                } else {
                    eVar.wp().wf().u(eVar.wt(), aVar3.version);
                }
            }
        }
        if (aVar2 != null) {
            String y = eVar.wp().wf().y(aVar2.agJ, aVar2.version);
            new StringBuilder("-------本地已存在--------").append(y);
            eVar.bI(y);
            eVar.bJ(y);
            eVar.bI(2);
            eVar.bE(aVar2.version);
        } else if (!ag.isWifiConnected(this.mContext) && (wB.agN || (wB.agO && eVar.wv() > 0))) {
            b(eVar, new PluginError.NotWifiDownloadError("It can be downloaded only on WiFi", (int) PluginError.ERROR_UPD_NOT_WIFI_DOWNLOAD));
            return;
        } else {
            try {
                eVar.wp().we().i(eVar);
            } catch (Throwable th) {
                b(eVar, new PluginError.UpdateError(th, (int) PluginError.ERROR_UPD_REQUEST));
                return;
            }
        }
        if (eVar.getState() == 2 || eVar.getState() == 3 || eVar.getState() == 4) {
            String ww = eVar.ww();
            StringBuilder sb2 = new StringBuilder("-------更新成功或者获取到本地成功------------pluginId: ");
            sb2.append(eVar.wt());
            sb2.append(", path: ");
            sb2.append(ww);
            if (TextUtils.isEmpty(ww)) {
                b(eVar, new PluginError.LoadError("path not found", (int) PluginError.ERROR_UPD_FILE_NOT_FOUND));
                return;
            } else if (eVar.isCanceled()) {
                b(eVar);
                return;
            } else {
                try {
                    com.kwad.library.solder.lib.a.a e = e(eVar);
                    eVar.c(e);
                    StringBuilder sb3 = new StringBuilder("load plugin success pluginId: ");
                    sb3.append(eVar.wt());
                    sb3.append(", path: ");
                    sb3.append(ww);
                    a(eVar, e);
                    return;
                } catch (PluginError.InstallError e2) {
                    e = e2;
                } catch (PluginError.LoadError e3) {
                    e = e3;
                } catch (Throwable th2) {
                    a.e("PluginLoaderImpl", "load plugin failed, path = " + ww, th2);
                    b(eVar, new PluginError.InstallError("load or install plugin failed:" + th2.getMessage(), 4004));
                    return;
                }
            }
        } else {
            e = new PluginError.InstallError("state exception", 2002);
        }
        b(eVar, e);
    }
}
