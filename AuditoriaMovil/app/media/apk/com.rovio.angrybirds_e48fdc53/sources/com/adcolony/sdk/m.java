package com.adcolony.sdk;

import android.os.StatFs;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class m {
    private String a;
    private String b;
    private String c;
    private String d;
    private File e;
    private File f;
    private File g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        au.d.b("Configuring storage");
        af a = a.a();
        this.a = c() + "/adc3/";
        this.b = this.a + "media/";
        this.e = new File(this.b);
        if (!this.e.isDirectory()) {
            this.e.delete();
            this.e.mkdirs();
        }
        if (!this.e.isDirectory()) {
            a.a(true);
            return false;
        } else if (a(this.b) < 2.097152E7d) {
            au.e.b("Not enough memory available at media path, disabling AdColony.");
            a.a(true);
            return false;
        } else {
            this.c = c() + "/adc3/data/";
            this.f = new File(this.c);
            if (!this.f.isDirectory()) {
                this.f.delete();
            }
            this.f.mkdirs();
            this.d = this.a + "tmp/";
            this.g = new File(this.d);
            if (!this.g.isDirectory()) {
                this.g.delete();
                this.g.mkdirs();
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (this.e == null || this.f == null || this.g == null) {
            return false;
        }
        if (!this.e.isDirectory()) {
            this.e.delete();
        }
        if (!this.f.isDirectory()) {
            this.f.delete();
        }
        if (!this.g.isDirectory()) {
            this.g.delete();
        }
        this.e.mkdirs();
        this.f.mkdirs();
        this.g.mkdirs();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return !a.d() ? "" : a.c().getFilesDir().getAbsolutePath();
    }

    double a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (RuntimeException e) {
            return PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.a;
    }
}
