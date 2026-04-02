package com.amazon.aps.iva.js;

import com.google.android.gms.common.Scopes;
/* compiled from: PhoneEmailSwitchSelectedTabProperty.kt */
/* loaded from: classes2.dex */
public abstract class x extends com.amazon.aps.iva.is.c {
    private final String value;

    /* compiled from: PhoneEmailSwitchSelectedTabProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends x {
        public static final a a = new a();

        public a() {
            super(Scopes.EMAIL);
        }
    }

    /* compiled from: PhoneEmailSwitchSelectedTabProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends x {
        public static final b a = new b();

        public b() {
            super("phone");
        }
    }

    public x(String str) {
        super("tabSelected", str);
        this.value = str;
    }
}
