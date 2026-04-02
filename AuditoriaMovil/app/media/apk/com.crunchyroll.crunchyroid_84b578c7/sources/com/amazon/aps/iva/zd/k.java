package com.amazon.aps.iva.zd;

import com.google.android.gms.common.Scopes;
/* compiled from: EnterPasswordScreen.kt */
/* loaded from: classes.dex */
public abstract class k implements com.amazon.aps.iva.ri.c {

    /* compiled from: EnterPasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class a extends k {
        public static final a a = new a();
    }

    /* compiled from: EnterPasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class b extends k {
        public static final b a = new b();
    }

    /* compiled from: EnterPasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class c extends k {
        public final String a;

        public c(String str) {
            com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
            this.a = str;
        }
    }

    /* compiled from: EnterPasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class d extends k {
        public static final d a = new d();
    }

    /* compiled from: EnterPasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class e extends k {
        public static final e a = new e();
    }

    /* compiled from: EnterPasswordScreen.kt */
    /* loaded from: classes.dex */
    public static final class f extends k {
        public final String a;

        public f(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "password");
            this.a = str;
        }
    }
}
