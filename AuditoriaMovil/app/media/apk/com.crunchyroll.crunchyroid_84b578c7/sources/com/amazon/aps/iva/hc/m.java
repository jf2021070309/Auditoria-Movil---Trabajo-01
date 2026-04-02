package com.amazon.aps.iva.hc;

import android.webkit.WebView;
import com.amazon.aps.iva.b5.c;
import com.amazon.aps.iva.cc0.c;
import com.amazon.aps.iva.f1.i0;
import com.amazon.aps.iva.f1.u;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.j9.h0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.m0.c0;
import com.amazon.aps.iva.m0.d0;
import com.amazon.aps.iva.m0.f0;
import com.amazon.aps.iva.me0.a;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.p4.n;
import com.amazon.aps.iva.r4.f1;
import com.amazon.aps.iva.r4.g1;
import com.amazon.aps.iva.r4.h1;
import com.amazon.aps.iva.r4.i1;
import com.amazon.aps.iva.r4.j1;
import com.amazon.aps.iva.xe0.s;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import okhttp3.Request;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: GlideImage.kt */
/* loaded from: classes.dex */
public final class m implements k, h0, com.amazon.aps.iva.kr.b, com.amazon.aps.iva.v6.m, a.c, com.amazon.aps.iva.ur.d {
    public static i0 c;
    public static u d;
    public static com.amazon.aps.iva.h1.a e;
    public static final String[] b = new String[0];
    public static final m f = new m();
    public static final s g = new s("NO_DECISION");

    public static /* synthetic */ void e(int i) {
        String str;
        int i2;
        if (i != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 18) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static final com.amazon.aps.iva.p4.n f(ArrayList arrayList) {
        com.amazon.aps.iva.p4.n d2;
        n.a aVar = n.a.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.p4.n nVar = (com.amazon.aps.iva.p4.n) it.next();
            if (nVar != null && (d2 = aVar.d(nVar)) != null) {
                aVar = d2;
            }
        }
        return aVar;
    }

    public static float g(float f2, float f3, com.amazon.aps.iva.o0.i iVar) {
        iVar.s(-1528360391);
        e0.b bVar = e0.a;
        long j = ((x) iVar.i(f0.a)).a;
        if (!((c0) iVar.i(d0.a)).i() ? defpackage.i.y(j) >= 0.5d : defpackage.i.y(j) <= 0.5d) {
            f2 = f3;
        }
        iVar.G();
        return f2;
    }

    public static String i() {
        ArrayList J0 = com.amazon.aps.iva.lb0.x.J0(new com.amazon.aps.iva.ec0.c('A', 'Z'), new com.amazon.aps.iva.ec0.c('0', '9'));
        com.amazon.aps.iva.ec0.j jVar = new com.amazon.aps.iva.ec0.j(1, 9);
        ArrayList arrayList = new ArrayList(r.Y(jVar));
        com.amazon.aps.iva.ec0.i it = jVar.iterator();
        while (it.d) {
            it.b();
            c.a aVar = com.amazon.aps.iva.cc0.c.b;
            com.amazon.aps.iva.yb0.j.f(aVar, "random");
            if (!J0.isEmpty()) {
                arrayList.add(Character.valueOf(((Character) J0.get(aVar.e(J0.size()))).charValue()));
            } else {
                throw new NoSuchElementException("Collection is empty.");
            }
        }
        return com.amazon.aps.iva.lb0.x.B0(arrayList, "", null, null, null, 62);
    }

    public static c1 j(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.oc0.e eVar) {
        if (fVar != null) {
            if (eVar != null) {
                Collection<com.amazon.aps.iva.oc0.d> e2 = eVar.e();
                if (e2.size() != 1) {
                    return null;
                }
                for (c1 c1Var : e2.iterator().next().f()) {
                    if (c1Var.getName().equals(fVar)) {
                        return c1Var;
                    }
                }
                return null;
            }
            e(20);
            throw null;
        }
        e(19);
        throw null;
    }

    public static float k(com.amazon.aps.iva.o0.i iVar) {
        iVar.s(621183615);
        e0.b bVar = e0.a;
        float g2 = g(0.38f, 0.38f, iVar);
        iVar.G();
        return g2;
    }

    public static float n(com.amazon.aps.iva.o0.i iVar) {
        iVar.s(629162431);
        e0.b bVar = e0.a;
        float g2 = g(1.0f, 0.87f, iVar);
        iVar.G();
        return g2;
    }

    public static float o(com.amazon.aps.iva.o0.i iVar) {
        iVar.s(1999054879);
        e0.b bVar = e0.a;
        float g2 = g(0.74f, 0.6f, iVar);
        iVar.G();
        return g2;
    }

    public static final void p(com.amazon.aps.iva.p4.l lVar) {
        Object obj;
        Object obj2;
        com.amazon.aps.iva.b5.c cVar;
        com.amazon.aps.iva.b5.c cVar2;
        boolean z;
        Iterator it = lVar.c.iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.p4.i iVar = (com.amazon.aps.iva.p4.i) it.next();
            if (iVar instanceof com.amazon.aps.iva.p4.l) {
                p((com.amazon.aps.iva.p4.l) iVar);
            }
        }
        com.amazon.aps.iva.y4.k kVar = (com.amazon.aps.iva.y4.k) lVar.a().a(null, g1.h);
        if (kVar == null || (obj = kVar.b) == null) {
            obj = c.e.a;
        }
        boolean z2 = obj instanceof c.e;
        ArrayList arrayList = lVar.c;
        boolean z3 = true;
        if (z2) {
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.amazon.aps.iva.y4.k kVar2 = (com.amazon.aps.iva.y4.k) ((com.amazon.aps.iva.p4.i) it2.next()).a().a(null, i1.h);
                    if (kVar2 != null) {
                        cVar2 = kVar2.b;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 instanceof c.C0130c) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                lVar.b(com.amazon.aps.iva.ff0.b.o(lVar.a()));
            }
        }
        com.amazon.aps.iva.y4.r rVar = (com.amazon.aps.iva.y4.r) lVar.a().a(null, h1.h);
        if (rVar == null || (obj2 = rVar.b) == null) {
            obj2 = c.e.a;
        }
        if (obj2 instanceof c.e) {
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    com.amazon.aps.iva.y4.r rVar2 = (com.amazon.aps.iva.y4.r) ((com.amazon.aps.iva.p4.i) it3.next()).a().a(null, j1.h);
                    if (rVar2 != null) {
                        cVar = rVar2.b;
                    } else {
                        cVar = null;
                    }
                    if (cVar instanceof c.C0130c) {
                        break;
                    }
                }
            }
            z3 = false;
            if (z3) {
                lVar.b(com.amazon.aps.iva.ff0.b.q(lVar.a()));
            }
        }
    }

    public static LinkedHashSet t(com.amazon.aps.iva.nd0.f fVar, Collection collection, Collection collection2, com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.ae0.s sVar, com.amazon.aps.iva.qd0.n nVar, boolean z) {
        if (fVar != null) {
            if (collection != null) {
                if (eVar != null) {
                    if (sVar != null) {
                        if (nVar != null) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            nVar.h(fVar, collection, collection2, eVar, new com.amazon.aps.iva.yc0.a(sVar, linkedHashSet, z));
                            return linkedHashSet;
                        }
                        e(17);
                        throw null;
                    }
                    e(16);
                    throw null;
                }
                e(15);
                throw null;
            }
            e(13);
            throw null;
        }
        e(12);
        throw null;
    }

    public static LinkedHashSet v(com.amazon.aps.iva.nd0.f fVar, AbstractCollection abstractCollection, Collection collection, com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.ae0.s sVar, com.amazon.aps.iva.qd0.n nVar) {
        if (fVar != null) {
            if (eVar != null) {
                if (sVar != null) {
                    if (nVar != null) {
                        return t(fVar, abstractCollection, collection, eVar, sVar, nVar, false);
                    }
                    e(5);
                    throw null;
                }
                e(4);
                throw null;
            }
            e(3);
            throw null;
        }
        e(0);
        throw null;
    }

    public static LinkedHashSet w(com.amazon.aps.iva.nd0.f fVar, Collection collection, AbstractCollection abstractCollection, com.amazon.aps.iva.zc0.c cVar, com.amazon.aps.iva.ae0.s sVar, com.amazon.aps.iva.qd0.n nVar) {
        if (fVar != null) {
            if (collection != null) {
                if (cVar != null) {
                    if (sVar != null) {
                        if (nVar != null) {
                            return t(fVar, collection, abstractCollection, cVar, sVar, nVar, true);
                        }
                        e(11);
                        throw null;
                    }
                    e(10);
                    throw null;
                }
                e(9);
                throw null;
            }
            e(7);
            throw null;
        }
        e(6);
        throw null;
    }

    public static final void y(com.amazon.aps.iva.p4.l lVar, f1 f1Var) {
        Iterator it = lVar.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                com.amazon.aps.iva.p4.i iVar = (com.amazon.aps.iva.p4.i) f1Var.invoke((com.amazon.aps.iva.p4.i) next);
                lVar.c.set(i, iVar);
                if (iVar instanceof com.amazon.aps.iva.p4.l) {
                    y((com.amazon.aps.iva.p4.l) iVar, f1Var);
                }
                i = i2;
            } else {
                com.amazon.aps.iva.ee0.f1.S();
                throw null;
            }
        }
    }

    @Override // com.amazon.aps.iva.kr.b
    public void b(Request request, com.amazon.aps.iva.fb0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "span");
    }

    @Override // com.amazon.aps.iva.j9.h0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // com.amazon.aps.iva.j9.h0
    public String[] d() {
        return b;
    }

    @Override // com.amazon.aps.iva.j9.h0
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // com.amazon.aps.iva.me0.a.c
    public Iterable h(Object obj) {
        int i = com.amazon.aps.iva.ud0.b.a;
        Collection<? extends com.amazon.aps.iva.oc0.a> k = ((c1) obj).k();
        ArrayList arrayList = new ArrayList(r.Y(k));
        Iterator<T> it = k.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).a());
        }
        return arrayList;
    }
}
