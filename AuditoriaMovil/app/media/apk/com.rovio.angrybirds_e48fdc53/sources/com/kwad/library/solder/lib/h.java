package com.kwad.library.solder.lib;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.library.solder.lib.ext.PluginError;
import com.kwad.sdk.utils.ad;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class h extends g {
    public h(String str) {
        super(str);
    }

    private Set<File> a(Context context, File file, File file2) {
        String[] list;
        new StringBuilder("install plugin so libs, destDir = ").append(file2);
        HashSet hashSet = new HashSet();
        if (file2.exists() && (list = file2.list()) != null && list.length > 0) {
            for (String str : list) {
                hashSet.add(new File(file2.getAbsolutePath() + File.separator + str));
            }
            return hashSet;
        }
        File file3 = new File(file2.getParentFile(), this.afG.wG());
        q.X(file3);
        for (String str2 : com.kwad.library.solder.lib.d.c.b(file, file3)) {
            new StringBuilder("extractSoLib, soName = ").append(str2);
            File a = com.kwad.library.solder.lib.d.c.a(file3, str2, file2);
            if (a != null) {
                hashSet.add(a);
            }
        }
        q.R(file3);
        return hashSet;
    }

    private void c(Set<File> set) {
        if (this.agf == null || this.agf.agP.size() <= 0 || set == null) {
            return;
        }
        HashMap<String, String> hashMap = this.agf.agP;
        for (File file : set) {
            String ab = ad.ab(file);
            String str = hashMap.get(file.getName());
            if (str != null && !TextUtils.equals(ab, str)) {
                d(set);
                throw new PluginError.LoadError(new Exception(file.getName() + " Md5 check error,find " + ab + ",except " + str), 4008);
            }
        }
    }

    private static void d(Set<File> set) {
        for (File file : set) {
            q.R(file);
        }
    }

    private File f(File file) {
        File file2 = new File(file.getParentFile(), this.afG.wF());
        q.X(file2);
        return file2;
    }

    @Override // com.kwad.library.solder.lib.g, com.kwad.library.solder.lib.a.a
    public void f(Context context, String str) {
        super.f(context, str);
        new StringBuilder("start install so plugin so pluginId:").append(getId());
        File file = new File(str);
        try {
            this.afZ = f(file);
            try {
                try {
                    c(a(context, file, this.afZ));
                    ClassLoader classLoader = (this.agf == null || this.agf.agS == null) ? getClass().getClassLoader() : this.agf.agS;
                    synchronized (Runtime.getRuntime()) {
                        com.kwad.library.solder.lib.ext.d.c(classLoader, this.afZ);
                    }
                } catch (PluginError.LoadError e) {
                    q.R(file);
                    throw e;
                }
            } catch (IOException e2) {
                throw new PluginError.LoadError(e2, 4004);
            }
        } catch (IOException e3) {
            throw new PluginError.LoadError(e3, 4003);
        }
    }
}
