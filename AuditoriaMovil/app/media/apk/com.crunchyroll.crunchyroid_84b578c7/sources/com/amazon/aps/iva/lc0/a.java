package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.g0;
import java.util.ServiceLoader;
/* compiled from: BuiltInsLoader.kt */
/* loaded from: classes4.dex */
public interface a {
    public static final C0475a a = C0475a.a;

    /* compiled from: BuiltInsLoader.kt */
    /* renamed from: com.amazon.aps.iva.lc0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0475a {
        public static final /* synthetic */ C0475a a = new C0475a();
        public static final com.amazon.aps.iva.kb0.e<a> b = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, C0476a.h);

        /* compiled from: BuiltInsLoader.kt */
        /* renamed from: com.amazon.aps.iva.lc0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0476a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a> {
            public static final C0476a h = new C0476a();

            public C0476a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final a invoke() {
                ServiceLoader load = ServiceLoader.load(a.class, a.class.getClassLoader());
                com.amazon.aps.iva.yb0.j.e(load, "implementations");
                a aVar = (a) x.u0(load);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }
    }

    g0 a(com.amazon.aps.iva.de0.l lVar, c0 c0Var, Iterable<? extends com.amazon.aps.iva.qc0.b> iterable, com.amazon.aps.iva.qc0.c cVar, com.amazon.aps.iva.qc0.a aVar, boolean z);
}
