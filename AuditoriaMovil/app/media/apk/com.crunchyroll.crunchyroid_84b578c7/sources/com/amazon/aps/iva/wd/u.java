package com.amazon.aps.iva.wd;

import com.google.android.gms.common.Scopes;
/* compiled from: CreatePasswordScreen.kt */
/* loaded from: classes.dex */
public abstract class u implements com.amazon.aps.iva.ri.c {

    /* compiled from: CreatePasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class a extends u {
        public static final a a = new a();
    }

    /* compiled from: CreatePasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class b extends u {
        public static final b a = new b();
    }

    /* compiled from: CreatePasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class c extends u {
        public final String a;

        public c(String str) {
            com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
            this.a = str;
        }
    }

    /* compiled from: CreatePasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class d extends u {
        public final String a;

        public d(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "password");
            this.a = str;
        }
    }

    /* compiled from: CreatePasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class e extends u {
        public final com.amazon.aps.iva.fs.b a;

        public e(com.amazon.aps.iva.fs.b bVar) {
            this.a = bVar;
        }
    }

    /* compiled from: CreatePasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class f extends u {
        public final com.amazon.aps.iva.fs.b a;

        public f(com.amazon.aps.iva.fs.b bVar) {
            this.a = bVar;
        }
    }
}
