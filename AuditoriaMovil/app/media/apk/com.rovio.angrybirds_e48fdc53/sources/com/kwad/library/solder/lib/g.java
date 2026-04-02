package com.kwad.library.solder.lib;

import android.content.Context;
import com.kwad.library.solder.lib.ext.PluginError;
import java.io.File;
/* loaded from: classes.dex */
public class g extends com.kwad.library.solder.lib.a.a {
    public g(String str) {
        super(str);
    }

    private static void e(File file) {
        if (!file.exists()) {
            throw new PluginError.LoadError("Apk file not exist.", 4001);
        }
        if (file.getAbsolutePath().trim().startsWith("/data/")) {
            return;
        }
        new StringBuilder("Apk file seems to locate in external path (not executable), path = ").append(file.getAbsolutePath());
    }

    @Override // com.kwad.library.solder.lib.a.a
    public void f(Context context, String str) {
        new StringBuilder("start install plugin installPath: ").append(str);
        e(new File(str));
    }
}
