package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.aj;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class b {
    public String a;
    protected Map<String, String> b;
    protected com.fyber.inneractive.sdk.m.d c;
    protected aj d;

    public abstract boolean b();

    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Map<String, String> map, com.fyber.inneractive.sdk.m.d dVar, aj ajVar) {
        this.b = map;
        this.d = ajVar;
        this.c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int a(String str) {
        String str2 = this.b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final String b(String str) {
        return this.b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean c(String str) {
        return "true".equals(this.b.get(str));
    }
}
