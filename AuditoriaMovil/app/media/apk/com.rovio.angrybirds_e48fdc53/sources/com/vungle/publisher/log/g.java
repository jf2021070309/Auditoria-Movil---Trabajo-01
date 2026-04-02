package com.vungle.publisher.log;

import android.content.Context;
import android.os.Build;
import com.vungle.publisher.env.AndroidDevice;
import com.vungle.publisher.env.o;
import com.vungle.publisher.sv;
import com.vungle.publisher.vc;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class g {
    private static String j = "VungleSDKLog";
    public java.util.logging.Logger a;
    public java.util.logging.Logger b;
    public java.util.logging.Logger c;
    @Inject
    Context d;
    @Inject
    d e;
    @Inject
    a f;
    @Inject
    AndroidDevice g;
    @Inject
    sv h;
    @Inject
    o i;

    public void a() {
        this.a = java.util.logging.Logger.getLogger("SDK Initialization");
        this.a.addHandler(a(this.d));
        this.b = java.util.logging.Logger.getLogger("Ad Lifecycle");
        this.b.addHandler(a(this.d));
        this.c = java.util.logging.Logger.getLogger("Vungle Network");
        this.c.addHandler(a(this.d));
    }

    public FileHandler a(Context context) {
        try {
            FileHandler fileHandler = new FileHandler(new File(context.getCacheDir(), j).getAbsolutePath(), 1048576, 20);
            try {
                fileHandler.setFormatter(this.e);
                return fileHandler;
            } catch (IOException e) {
                return fileHandler;
            }
        } catch (IOException e2) {
            return null;
        }
    }

    public void a(boolean z) {
        File[] listFiles;
        if (z && !this.g.j()) {
            java.util.logging.Logger.getLogger("global").setLevel(Level.ALL);
            return;
        }
        java.util.logging.Logger.getLogger("global").setLevel(Level.OFF);
        for (File file : this.d.getCacheDir().listFiles()) {
            if (file.getName().startsWith(j) && !file.getName().endsWith(".csv")) {
                file.delete();
            }
        }
    }

    public void a(vc vcVar) {
        if (Build.VERSION.SDK_INT >= 16) {
            if (this.h.b()) {
                return;
            }
        } else if (!"WIFI".equals(this.h.a()) || !this.i.i()) {
            return;
        }
        try {
            String absolutePath = this.d.getCacheDir().getAbsolutePath();
            File cacheDir = this.d.getCacheDir();
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(cacheDir.list()));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith(j) && !str.endsWith(".lck") && !str.endsWith(".csv") && !hashSet.contains(str + ".lck")) {
                    File file = new File(absolutePath + File.separator + str);
                    File file2 = new File(file.getAbsolutePath() + ".csv");
                    if (file.exists() && file.renameTo(file2)) {
                        vcVar.a(file2.getAbsolutePath(), this.f.a(file2));
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}
