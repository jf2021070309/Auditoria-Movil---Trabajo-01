package com.flurry.sdk;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class ht {
    private static final String b = ht.class.getSimpleName();
    boolean a;
    private final hu c;
    private final File d;
    private String e;

    public ht() {
        this(ka.a().a);
    }

    public ht(Context context) {
        this.c = new hu();
        this.d = context.getFileStreamPath(".flurryinstallreceiver.");
        ko.a(3, b, "Referrer file name if it exists:  " + this.d);
    }

    public final synchronized Map<String, List<String>> a() {
        c();
        return hu.a(this.e);
    }

    private void c() {
        if (!this.a) {
            this.a = true;
            ko.a(4, b, "Loading referrer info from file: " + this.d.getAbsolutePath());
            String c = lz.c(this.d);
            ko.a(b, "Referrer file contents: " + c);
            b(c);
        }
    }

    private void b(String str) {
        if (str != null) {
            this.e = str;
        }
    }

    public final synchronized String b() {
        c();
        return this.e;
    }

    public final synchronized void a(String str) {
        this.a = true;
        b(str);
        lz.a(this.d, this.e);
    }
}
