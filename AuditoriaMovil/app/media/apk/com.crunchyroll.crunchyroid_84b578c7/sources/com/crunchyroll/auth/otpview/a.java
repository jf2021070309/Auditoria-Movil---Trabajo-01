package com.crunchyroll.auth.otpview;

import com.amazon.aps.iva.yb0.j;
/* compiled from: OtpTextLayoutState.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: OtpTextLayoutState.kt */
    /* renamed from: com.crunchyroll.auth.otpview.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0951a extends a {
        public final String a;

        public C0951a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0951a) && j.a(this.a, ((C0951a) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Filled(otpText="), this.a, ")");
        }
    }

    /* compiled from: OtpTextLayoutState.kt */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public static final b a = new b();
    }
}
