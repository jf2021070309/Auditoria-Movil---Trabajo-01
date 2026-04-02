package com.kwad.library.solder.lib;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.sdk.utils.ad;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements com.kwad.library.solder.lib.a.b {
    private final File afE;
    private final File afF;
    private final com.kwad.library.solder.lib.ext.c afG;
    private final Context mContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, com.kwad.library.solder.lib.ext.c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.afG = cVar;
        this.afE = applicationContext.getDir(cVar.wD(), 0);
        this.afF = applicationContext.getCacheDir();
    }

    private String a(com.kwad.library.solder.lib.a.a aVar) {
        return y(aVar.getId(), aVar.getVersion());
    }

    private static void delete(String str) {
        q.delete(str);
    }

    private boolean i(String str, String str2, boolean z) {
        if (q.fr(str)) {
            if (TextUtils.isEmpty(str2) || TextUtils.equals(str2, ad.fy(str))) {
                return true;
            }
            StringBuilder sb = new StringBuilder("checkSafety md5 fail fileMd5: ");
            sb.append(str2);
            sb.append(", filePath = ");
            sb.append(str);
            delete(str);
            return false;
        }
        return false;
    }

    private String wb() {
        return this.afE.getAbsolutePath();
    }

    private String x(String str, String str2) {
        return wb() + File.separator + str + File.separator + str2;
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final String b(com.kwad.library.solder.lib.a.a aVar) {
        String a = a(aVar);
        if (TextUtils.isEmpty(a)) {
            throw new PluginError.InstallError("Can not get install path.", (int) PluginError.ERROR_INS_INSTALL_PATH);
        }
        StringBuilder sb = new StringBuilder("install pluginId ");
        sb.append(aVar.getId());
        sb.append(", install path:");
        sb.append(a);
        File file = new File(a);
        if (file.exists() && !this.afG.wJ() && i(file.getAbsolutePath(), aVar.wo(), true)) {
            return a;
        }
        String wn = aVar.wn();
        StringBuilder sb2 = new StringBuilder("install pluginId ");
        sb2.append(aVar.getId());
        sb2.append(", source path:");
        sb2.append(wn);
        File file2 = new File(wn);
        if (file2.exists()) {
            new StringBuilder("check plugin md5 pluginId: ").append(aVar.getId());
            if (i(wn, aVar.wo(), true)) {
                if (file2.renameTo(file)) {
                    new StringBuilder("install plugin success pluginId: ").append(aVar.getId());
                    return a;
                }
                try {
                    wa();
                    try {
                        q.f(file2, file);
                        q.R(file2);
                        return a;
                    } catch (Throwable th) {
                        a.e("PluginInstallerImpl", th);
                        throw new PluginError.InstallError(th, 3004);
                    }
                } catch (Throwable th2) {
                    a.e("PluginInstallerImpl", th2);
                    throw new PluginError.InstallError(th2, 3005);
                }
            }
            throw new PluginError.InstallError("check plugin md5 fail", 3003);
        }
        throw new PluginError.InstallError("Plugin file not exist.", 3001);
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final boolean b(String str, String str2, String str3) {
        if (this.afG.wJ()) {
            return false;
        }
        return i(y(str, str2), str3, true);
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final void bA(String str) {
        File file = new File(bB(str));
        if (file.exists()) {
            q.R(file);
        }
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final String bB(String str) {
        return wb() + File.separator + str;
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final File d(String str, boolean z) {
        String md5;
        if (str == null || (md5 = com.kwad.library.solder.lib.d.b.getMD5(str)) == null) {
            return null;
        }
        if (!z) {
            return File.createTempFile(md5 + System.currentTimeMillis(), this.afG.wH(), this.afF);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(md5);
        if (this.afG.wH() != null) {
            sb.append(this.afG.wH());
        }
        File file = new File(this.afF, sb.toString());
        if (file.exists() || file.createNewFile()) {
            return file;
        }
        return null;
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final void u(String str, String str2) {
        File file = new File(x(str, str2));
        if (file.exists()) {
            q.R(file);
        }
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final void wa() {
        if (this.afE.getFreeSpace() < 10000000) {
            throw new IOException("No enough capacity.");
        }
    }

    @Override // com.kwad.library.solder.lib.a.b
    public final String y(String str, String str2) {
        return wb() + File.separator + str + File.separator + str2 + File.separator + this.afG.wI();
    }
}
