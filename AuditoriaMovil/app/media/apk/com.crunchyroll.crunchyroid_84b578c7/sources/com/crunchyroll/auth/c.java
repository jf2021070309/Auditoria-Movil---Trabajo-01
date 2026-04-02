package com.crunchyroll.auth;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.yb0.j;
/* compiled from: AuthActivity.kt */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.ui.a {
    public final boolean b;
    public final boolean c;
    public final com.amazon.aps.iva.vw.a d;
    public final String e;
    public final boolean f;

    /* compiled from: AuthActivity.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static c a(Intent intent) {
            com.amazon.aps.iva.vw.a aVar;
            Object obj;
            boolean booleanExtra = intent.getBooleanExtra("is_billing_flow", false);
            boolean booleanExtra2 = intent.getBooleanExtra("is_token_expired", false);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("experiment", com.amazon.aps.iva.vw.a.class);
                } else {
                    obj = (com.amazon.aps.iva.vw.a) extras.getSerializable("experiment");
                }
                aVar = (com.amazon.aps.iva.vw.a) obj;
            } else {
                aVar = null;
            }
            return new c(booleanExtra, booleanExtra2, aVar, intent.getStringExtra("phone_number_input"), intent.getBooleanExtra("should_open_signup", false));
        }
    }

    public c() {
        this(false, false, null, null, false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b == cVar.b && this.c == cVar.c && j.a(this.d, cVar.d) && j.a(this.e, cVar.e) && this.f == cVar.f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = 1;
        boolean z = this.b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = i2 * 31;
        boolean z2 = this.c;
        int i4 = z2;
        if (z2 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 0;
        com.amazon.aps.iva.vw.a aVar = this.d;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int i7 = (i5 + hashCode) * 31;
        String str = this.e;
        if (str != null) {
            i6 = str.hashCode();
        }
        int i8 = (i7 + i6) * 31;
        boolean z3 = this.f;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        return i8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthFlowInput(isBillingFlow=");
        sb.append(this.b);
        sb.append(", isSessionExpired=");
        sb.append(this.c);
        sb.append(", experiment=");
        sb.append(this.d);
        sb.append(", phoneNumber=");
        sb.append(this.e);
        sb.append(", shouldOpenSignUp=");
        return e.c(sb, this.f, ")");
    }

    public c(boolean z, boolean z2, com.amazon.aps.iva.vw.a aVar, String str, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = aVar;
        this.e = str;
        this.f = z3;
    }

    public /* synthetic */ c(boolean z, boolean z2, com.amazon.aps.iva.vw.a aVar, String str, boolean z3, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : aVar, (i & 8) != 0 ? null : str, (i & 16) != 0 ? false : z3);
    }
}
