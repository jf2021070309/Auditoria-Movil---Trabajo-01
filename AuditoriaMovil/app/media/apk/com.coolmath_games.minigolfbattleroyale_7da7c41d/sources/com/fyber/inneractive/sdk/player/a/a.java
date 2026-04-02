package com.fyber.inneractive.sdk.player.a;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class a {
    File a;
    String b;
    boolean c;
    String d;
    final String g;
    public Object e = new Object();
    Map<String, String> f = new HashMap();
    volatile boolean h = false;

    private a(String str, String str2, File file, boolean z, String str3) {
        this.a = file;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.g = str;
    }

    public static a a(String str, String str2, File file, boolean z, String str3) {
        return new a(str, str2, file, z, str3);
    }

    public final File a() {
        File file;
        synchronized (this.e) {
            file = this.a;
        }
        return file;
    }

    public final boolean b() {
        File file = this.a;
        return file != null && file.exists();
    }

    public final void a(Map<String, String> map) {
        this.f.putAll(map);
    }

    public final String a(String str) {
        return this.f.get(str);
    }
}
