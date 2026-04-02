package com.amazon.aps.iva.js;

import com.google.common.net.HttpHeaders;
/* compiled from: CtaTypeProperty.kt */
/* loaded from: classes2.dex */
public abstract class f extends com.amazon.aps.iva.is.c {

    /* compiled from: CtaTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f {
        public static final a a = new a();

        public a() {
            super("In Grace");
        }
    }

    /* compiled from: CtaTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f {
        public static final b a = new b();

        public b() {
            super("Renew");
        }
    }

    /* compiled from: CtaTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class c extends f {
        public static final c a = new c();

        public c() {
            super(HttpHeaders.UPGRADE);
        }
    }

    /* compiled from: CtaTypeProperty.kt */
    /* loaded from: classes2.dex */
    public static final class d extends f {
        public static final d a = new d();

        public d() {
            super("Upsell");
        }
    }

    public f(String str) {
        super("ctaType", str);
    }
}
