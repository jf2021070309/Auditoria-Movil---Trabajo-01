package com.amazon.aps.iva.js;

import com.google.android.gms.common.Scopes;
/* compiled from: CredentialTypeProperty.kt */
/* loaded from: classes2.dex */
public abstract class e extends com.amazon.aps.iva.is.c {
    private final String value;

    /* compiled from: CredentialTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends e {
        public static final a a = new a();

        public a() {
            super(Scopes.EMAIL);
        }
    }

    /* compiled from: CredentialTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends e {
        public static final b a = new b();

        public b() {
            super("phone");
        }
    }

    public e(String str) {
        super("credentialType", str);
        this.value = str;
    }
}
