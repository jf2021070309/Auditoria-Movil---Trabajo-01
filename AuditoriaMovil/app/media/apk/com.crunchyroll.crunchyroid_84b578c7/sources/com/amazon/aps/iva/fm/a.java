package com.amazon.aps.iva.fm;

import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AssetUrlProvider.kt */
/* loaded from: classes2.dex */
public interface a {
    public static final C0253a a = C0253a.a;

    /* compiled from: AssetUrlProvider.kt */
    /* renamed from: com.amazon.aps.iva.fm.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0253a {
        public static final /* synthetic */ C0253a a = new C0253a();
        public static final m b = com.amazon.aps.iva.kb0.f.b(C0254a.h);

        /* compiled from: AssetUrlProvider.kt */
        /* renamed from: com.amazon.aps.iva.fm.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0254a extends l implements com.amazon.aps.iva.xb0.a<b> {
            public static final C0254a h = new C0254a();

            public C0254a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final b invoke() {
                f fVar = g.e;
                if (fVar != null) {
                    return new b(com.amazon.aps.iva.c80.a.f(fVar.c(), "/assets"));
                }
                j.m("dependencies");
                throw null;
            }
        }

        public static a a() {
            return (a) b.getValue();
        }
    }

    String a(String str, long j, i iVar, int i);

    String b(String str, float f, float f2, i iVar, int i);

    String c(String str, float f, i iVar, int i);
}
