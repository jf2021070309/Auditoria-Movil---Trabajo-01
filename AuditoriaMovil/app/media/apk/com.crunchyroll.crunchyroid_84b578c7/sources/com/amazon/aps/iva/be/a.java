package com.amazon.aps.iva.be;

import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: AuthDestinations.kt */
/* loaded from: classes.dex */
public abstract class a implements com.amazon.aps.iva.vi.a {

    /* compiled from: AuthDestinations.kt */
    /* renamed from: com.amazon.aps.iva.be.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0142a extends a {
        public static final C0142a a = new C0142a();

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return "changed_numbers";
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class b extends a {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return "create_password";
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class c extends a {
        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return null;
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class d extends a {
        public static final d a = new d();

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return "enter_password";
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class e extends a {
        public final String a;
        public final String b;

        public e(String str) {
            com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
            this.a = str;
            this.b = "forgot_password";
        }

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return this.b;
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class f extends a {
        public static final f a = new f();

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return "having_trouble";
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class g extends a {
        public static final g a = new g();

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return "home";
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class h extends a {
        public static final h a = new h();

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return "log_in";
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class i extends a {
        public final com.amazon.aps.iva.ee.a a;
        public final String b = "otp";

        public i(com.amazon.aps.iva.ee.a aVar) {
            this.a = aVar;
        }

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return this.b;
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class j extends a {
        public final com.amazon.aps.iva.fs.b a;
        public final String b;

        public j(com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "analyticsClickedView");
            this.a = bVar;
            this.b = "privacy_policy";
        }

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return this.b;
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class k extends a {
        public static final k a = new k();

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return FirebaseAnalytics.Event.SIGN_UP;
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class l extends a {
        public final com.amazon.aps.iva.fs.b a;
        public final String b;

        public l(com.amazon.aps.iva.fs.b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "analyticsClickedView");
            this.a = bVar;
            this.b = "terms_of_service";
        }

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return this.b;
        }
    }

    /* compiled from: AuthDestinations.kt */
    /* loaded from: classes.dex */
    public static final class m extends a {
        public static final m a = new m();

        @Override // com.amazon.aps.iva.vi.a
        public final String a() {
            return "verify_number";
        }
    }
}
