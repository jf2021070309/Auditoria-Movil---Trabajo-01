package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.config.p;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class l implements p.a {
    Context a;
    private b b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        static l a = new l((byte) 0);
    }

    /* synthetic */ l(byte b2) {
        this();
    }

    /* loaded from: classes.dex */
    private static class b implements Serializable {
        static final long serialVersionUID = 2;
        String a;
        boolean b;
        boolean c;

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    private l() {
        this.b = new b((byte) 0);
    }

    @Override // com.fyber.inneractive.sdk.config.p.a
    public final synchronized void a(String str, boolean z, boolean z2) {
        this.b.a = str;
        this.b.b = z;
        this.b.c = z2;
    }

    public static String a() {
        if (a.a.b != null) {
            return a.a.b.a;
        }
        return null;
    }

    public static boolean b() {
        if (a.a.b != null) {
            return a.a.b.c;
        }
        return false;
    }

    public static boolean c() {
        if (a.a.b != null) {
            return a.a.b.b;
        }
        return false;
    }
}
