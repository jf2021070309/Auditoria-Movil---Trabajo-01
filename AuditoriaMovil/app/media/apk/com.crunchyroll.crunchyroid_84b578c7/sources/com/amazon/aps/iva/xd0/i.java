package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.lb0.b0;
import java.util.Collection;
import java.util.Set;
/* compiled from: MemberScope.kt */
/* loaded from: classes4.dex */
public interface i extends l {
    public static final a a = a.a;

    /* compiled from: MemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C0852a b = C0852a.h;

        /* compiled from: MemberScope.kt */
        /* renamed from: com.amazon.aps.iva.xd0.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0852a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Boolean> {
            public static final C0852a h = new C0852a();

            public C0852a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final Boolean invoke(com.amazon.aps.iva.nd0.f fVar) {
                com.amazon.aps.iva.yb0.j.f(fVar, "it");
                return Boolean.TRUE;
            }
        }
    }

    /* compiled from: MemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class b extends j {
        public static final b b = new b();

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Set<com.amazon.aps.iva.nd0.f> a() {
            return b0.b;
        }

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Set<com.amazon.aps.iva.nd0.f> d() {
            return b0.b;
        }

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Set<com.amazon.aps.iva.nd0.f> f() {
            return b0.b;
        }
    }

    Set<com.amazon.aps.iva.nd0.f> a();

    Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar);

    Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar);

    Set<com.amazon.aps.iva.nd0.f> d();

    Set<com.amazon.aps.iva.nd0.f> f();
}
