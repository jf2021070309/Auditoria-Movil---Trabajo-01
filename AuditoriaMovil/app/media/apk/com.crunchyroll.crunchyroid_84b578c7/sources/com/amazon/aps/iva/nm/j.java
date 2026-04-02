package com.amazon.aps.iva.nm;
/* compiled from: ProfilesRoute.kt */
/* loaded from: classes2.dex */
public abstract class j {
    public final String a;

    /* compiled from: ProfilesRoute.kt */
    /* loaded from: classes2.dex */
    public static final class a extends j {
        public static final a b = new a();

        public a() {
            super("profile_activation_route");
        }
    }

    /* compiled from: ProfilesRoute.kt */
    /* loaded from: classes2.dex */
    public static final class b extends j {
        public static final b b = new b();

        public b() {
            super("switch_profile_route");
        }
    }

    /* compiled from: ProfilesRoute.kt */
    /* loaded from: classes2.dex */
    public static final class c extends j {
        public static final c b = new c();

        public c() {
            super("who_is_watching_route");
        }
    }

    public j(String str) {
        this.a = str;
    }
}
