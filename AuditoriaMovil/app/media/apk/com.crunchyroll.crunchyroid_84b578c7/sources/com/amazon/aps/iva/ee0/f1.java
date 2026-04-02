package com.amazon.aps.iva.ee0;

import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.xa0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.model.WatchHistoryPanel;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItem;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItems;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.ellation.crunchyroll.api.etp.subscription.model.BenefitKt;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.cast.MediaError;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
/* compiled from: TypeParameterErasureOptions.kt */
/* loaded from: classes4.dex */
public class f1 implements com.amazon.aps.iva.qp.c, com.amazon.aps.iva.ae0.s, com.amazon.aps.iva.vo.e {
    public static com.amazon.aps.iva.kf.f b;
    public static final f1 c = new f1();

    public f1(com.amazon.aps.iva.px.a aVar) {
    }

    public static final com.amazon.aps.iva.e60.a A(com.amazon.aps.iva.b60.s sVar) {
        com.amazon.aps.iva.b60.k kVar;
        com.amazon.aps.iva.yb0.j.f(sVar, "<this>");
        if (sVar instanceof com.amazon.aps.iva.b60.k) {
            kVar = (com.amazon.aps.iva.b60.k) sVar;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            return null;
        }
        return kVar.h;
    }

    public static final int B(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        return list.size() - 1;
    }

    public static final com.amazon.aps.iva.xe0.q C(Object obj) {
        if (obj != com.amazon.aps.iva.b50.w.h) {
            return (com.amazon.aps.iva.xe0.q) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final int D(List list) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(list, "benefits");
        List<Benefit> list2 = list;
        boolean z3 = list2 instanceof Collection;
        boolean z4 = true;
        if (!z3 || !list2.isEmpty()) {
            for (Benefit benefit : list2) {
                if (BenefitKt.isUltimateFan(benefit)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return R.string.cr_plus_superfanpack_monthly_title;
        }
        if (!z3 || !list2.isEmpty()) {
            for (Benefit benefit2 : list2) {
                if (BenefitKt.isFan(benefit2)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            return R.string.cr_plus_fanpack_monthly_title;
        }
        if (!z3 || !list2.isEmpty()) {
            for (Benefit benefit3 : list2) {
                if (BenefitKt.isPremium(benefit3)) {
                    break;
                }
            }
        }
        z4 = false;
        if (z4) {
            return R.string.cr_plus_premium_monthly_title;
        }
        return R.string.membership_card_free_user_title;
    }

    public static final Method E(Class cls, com.amazon.aps.iva.oc0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            com.amazon.aps.iva.yb0.j.e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new com.amazon.aps.iva.wb0.a("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    public static final boolean F(com.amazon.aps.iva.oc0.g0 g0Var, com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        if (g0Var instanceof com.amazon.aps.iva.oc0.i0) {
            return ((com.amazon.aps.iva.oc0.i0) g0Var).b(cVar);
        }
        return O(g0Var, cVar).isEmpty();
    }

    public static final boolean G(com.amazon.aps.iva.p1.y yVar, long j) {
        long j2 = yVar.c;
        float c2 = com.amazon.aps.iva.e1.c.c(j2);
        float d = com.amazon.aps.iva.e1.c.d(j2);
        int i = (int) (j >> 32);
        int b2 = com.amazon.aps.iva.o2.j.b(j);
        if (c2 >= 0.0f && c2 <= i && d >= 0.0f && d <= b2) {
            return false;
        }
        return true;
    }

    public static final boolean H(com.amazon.aps.iva.p1.y yVar, long j, long j2) {
        boolean z;
        if (yVar.i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return G(yVar, j);
        }
        long j3 = yVar.c;
        float c2 = com.amazon.aps.iva.e1.c.c(j3);
        float d = com.amazon.aps.iva.e1.c.d(j3);
        float d2 = com.amazon.aps.iva.e1.g.d(j2) + ((int) (j >> 32));
        float f = -com.amazon.aps.iva.e1.g.b(j2);
        float b2 = com.amazon.aps.iva.e1.g.b(j2) + com.amazon.aps.iva.o2.j.b(j);
        if (c2 >= (-com.amazon.aps.iva.e1.g.d(j2)) && c2 <= d2 && d >= f && d <= b2) {
            return false;
        }
        return true;
    }

    public static Object I(com.amazon.aps.iva.ga0.c cVar, Callable callable) {
        if (cVar != null) {
            return cVar;
        }
        try {
            return callable.call();
        } catch (Exception e) {
            throw new RuntimeException("lazyGet: factory threw an exception", e);
        }
    }

    public static final List J(Object obj) {
        List singletonList = Collections.singletonList(obj);
        com.amazon.aps.iva.yb0.j.e(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final List K(Object... objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "elements");
        if (objArr.length > 0) {
            return com.amazon.aps.iva.lb0.m.B(objArr);
        }
        return com.amazon.aps.iva.lb0.z.b;
    }

    public static final List L(Object obj) {
        if (obj != null) {
            return J(obj);
        }
        return com.amazon.aps.iva.lb0.z.b;
    }

    public static final ArrayList M(Object... objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new com.amazon.aps.iva.lb0.j(objArr, true));
    }

    public static final List N(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return J(list.get(0));
            }
            return list;
        }
        return com.amazon.aps.iva.lb0.z.b;
    }

    public static final ArrayList O(com.amazon.aps.iva.oc0.g0 g0Var, com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        r(g0Var, cVar, arrayList);
        return arrayList;
    }

    public static final long P(com.amazon.aps.iva.p1.y yVar, boolean z) {
        long e = com.amazon.aps.iva.e1.c.e(yVar.c, yVar.g);
        if (!z && yVar.b()) {
            int i = com.amazon.aps.iva.e1.c.e;
            return com.amazon.aps.iva.e1.c.b;
        }
        return e;
    }

    public static com.amazon.aps.iva.nd0.f Q(com.amazon.aps.iva.nd0.f fVar, String str, String str2, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        boolean z5 = false;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!fVar.c) {
            String c2 = fVar.c();
            com.amazon.aps.iva.yb0.j.e(c2, "methodName.identifier");
            if (com.amazon.aps.iva.oe0.m.h0(c2, str, false) && c2.length() != str.length()) {
                char charAt = c2.charAt(str.length());
                if ('a' <= charAt && charAt < '{') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (str2 != null) {
                        return com.amazon.aps.iva.nd0.f.h(str2.concat(com.amazon.aps.iva.oe0.q.y0(str, c2)));
                    }
                    if (z) {
                        String y0 = com.amazon.aps.iva.oe0.q.y0(str, c2);
                        if (y0.length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3 && com.amazon.aps.iva.ab.x.X(y0, 0)) {
                            if (y0.length() != 1 && com.amazon.aps.iva.ab.x.X(y0, 1)) {
                                com.amazon.aps.iva.ec0.i it = com.amazon.aps.iva.oe0.q.m0(y0).iterator();
                                while (true) {
                                    if (it.d) {
                                        obj = it.next();
                                        if (!com.amazon.aps.iva.ab.x.X(y0, ((Number) obj).intValue())) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                Integer num = (Integer) obj;
                                if (num != null) {
                                    int intValue = num.intValue() - 1;
                                    String substring = y0.substring(0, intValue);
                                    com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    String n0 = com.amazon.aps.iva.ab.x.n0(substring);
                                    String substring2 = y0.substring(intValue);
                                    com.amazon.aps.iva.yb0.j.e(substring2, "this as java.lang.String).substring(startIndex)");
                                    y0 = n0.concat(substring2);
                                } else {
                                    y0 = com.amazon.aps.iva.ab.x.n0(y0);
                                }
                            } else {
                                if (y0.length() == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (!z4) {
                                    char charAt2 = y0.charAt(0);
                                    if ('A' <= charAt2 && charAt2 < '[') {
                                        z5 = true;
                                    }
                                    if (z5) {
                                        char lowerCase = Character.toLowerCase(charAt2);
                                        String substring3 = y0.substring(1);
                                        com.amazon.aps.iva.yb0.j.e(substring3, "this as java.lang.String).substring(startIndex)");
                                        y0 = lowerCase + substring3;
                                    }
                                }
                            }
                        }
                        if (com.amazon.aps.iva.nd0.f.i(y0)) {
                            return com.amazon.aps.iva.nd0.f.h(y0);
                        }
                    } else {
                        return fVar;
                    }
                }
            }
        }
        return null;
    }

    public static final void R() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void S() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final Class T(e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        Class U = U(e0Var.I0().k());
        if (U == null) {
            return null;
        }
        if (!s1.g(e0Var)) {
            return U;
        }
        m0 f = com.amazon.aps.iva.qd0.k.f(e0Var);
        if (f == null || s1.g(f) || com.amazon.aps.iva.lc0.k.H(f)) {
            return null;
        }
        return U;
    }

    public static final Class U(com.amazon.aps.iva.oc0.k kVar) {
        if ((kVar instanceof com.amazon.aps.iva.oc0.e) && com.amazon.aps.iva.qd0.k.b(kVar)) {
            com.amazon.aps.iva.oc0.e eVar = (com.amazon.aps.iva.oc0.e) kVar;
            Class<?> j = com.amazon.aps.iva.ic0.v0.j(eVar);
            if (j == null) {
                throw new com.amazon.aps.iva.wb0.a("Class object for the class " + eVar.getName() + " cannot be found (classId=" + com.amazon.aps.iva.ud0.b.f((com.amazon.aps.iva.oc0.h) kVar) + ')');
            }
            return j;
        }
        return null;
    }

    public static final com.amazon.aps.iva.mt.p V(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "<this>");
        return new com.amazon.aps.iva.mt.p(panel.getTitle(), panel.getEpisodeMetadata().getEpisode(), panel.getEpisodeMetadata().getSeasonNumber());
    }

    public static final com.amazon.aps.iva.mt.p W(PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "<this>");
        if (playableAsset instanceof Episode) {
            String title = playableAsset.getTitle();
            Episode episode = (Episode) playableAsset;
            return new com.amazon.aps.iva.mt.p(title, episode.getEpisodeNumber(), episode.getSeasonNumber());
        }
        return new com.amazon.aps.iva.mt.p(playableAsset.getTitle(), null, null);
    }

    public static final ArrayList X(List list, List list2, com.amazon.aps.iva.r10.j0 j0Var) {
        String id;
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        com.amazon.aps.iva.yb0.j.f(list2, "loadingItems");
        com.amazon.aps.iva.yb0.j.f(j0Var, "selectionMode");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            com.amazon.aps.iva.r10.l lVar = null;
            if (i >= 0) {
                WatchHistoryPanel watchHistoryPanel = (WatchHistoryPanel) obj;
                Panel panel = watchHistoryPanel.getPanel();
                if (panel != null) {
                    com.amazon.aps.iva.r10.m mVar = (com.amazon.aps.iva.r10.m) com.amazon.aps.iva.lb0.x.w0(i, list2);
                    if (mVar == null || (id = mVar.a) == null) {
                        id = panel.getId();
                    }
                    lVar = new com.amazon.aps.iva.r10.l(panel, watchHistoryPanel.getFullyWatched(), j0Var, id, watchHistoryPanel.getPlayhead());
                }
                if (lVar != null) {
                    arrayList.add(lVar);
                }
                i = i2;
            } else {
                S();
                throw null;
            }
        }
        return arrayList;
    }

    public static final long e(float f, float f2) {
        long floatToIntBits = (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = com.amazon.aps.iva.o2.f.c;
        return floatToIntBits;
    }

    public static final long f(float f, float f2) {
        long floatToIntBits = (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        int i = com.amazon.aps.iva.o2.g.d;
        return floatToIntBits;
    }

    public static final int g(int i, com.amazon.aps.iva.p0.f fVar) {
        int i2 = fVar.d - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = fVar.b;
            int i5 = ((com.amazon.aps.iva.f0.d) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((com.amazon.aps.iva.f0.d) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final com.amazon.aps.iva.cv.w h(CustomListItems customListItems, ArrayList arrayList) {
        com.amazon.aps.iva.dv.a mVar;
        List<CustomListItem> items = customListItems.getItems();
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(items));
        boolean z = false;
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i >= 0) {
                CustomListItem customListItem = (CustomListItem) obj;
                String str = ((com.amazon.aps.iva.dv.f) arrayList.get(i)).e;
                if (customListItem.getPanel() != null) {
                    String id = customListItem.getId();
                    String listId = customListItem.getListId();
                    Panel panel = customListItem.getPanel();
                    com.amazon.aps.iva.yb0.j.c(panel);
                    mVar = new com.amazon.aps.iva.dv.g(str, id, listId, panel);
                } else {
                    mVar = new com.amazon.aps.iva.dv.m(str, customListItem.getId(), customListItem.getListId());
                }
                arrayList2.add(mVar);
                i = i2;
            } else {
                S();
                throw null;
            }
        }
        int total = customListItems.getTotal();
        int max = customListItems.getMetadata().getMax();
        if (customListItems.getTotal() < customListItems.getMetadata().getMax()) {
            z = true;
        }
        return new com.amazon.aps.iva.cv.w(z, total, max, arrayList2);
    }

    public static final void i(View view, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.xa0.h hVar;
        com.amazon.aps.iva.yb0.j.f(view, "$this$applyInsetter");
        com.amazon.aps.iva.yb0.j.f(lVar, "build");
        com.amazon.aps.iva.xa0.f fVar = new com.amazon.aps.iva.xa0.f();
        lVar.invoke(fVar);
        a.C0849a c0849a = fVar.a;
        c0849a.getClass();
        int i = c0849a.c;
        com.amazon.aps.iva.xa0.a aVar = new com.amazon.aps.iva.xa0.a(c0849a.a, c0849a.b, i, c0849a.d);
        Object tag = view.getTag(R.id.insetter_initial_state);
        if (!(tag instanceof com.amazon.aps.iva.xa0.i)) {
            tag = null;
        }
        com.amazon.aps.iva.xa0.i iVar = (com.amazon.aps.iva.xa0.i) tag;
        if (iVar == null) {
            com.amazon.aps.iva.xa0.h hVar2 = new com.amazon.aps.iva.xa0.h(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                hVar = new com.amazon.aps.iva.xa0.h(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            } else {
                hVar = com.amazon.aps.iva.xa0.h.e;
            }
            iVar = new com.amazon.aps.iva.xa0.i(hVar2, hVar);
            view.setTag(R.id.insetter_initial_state, iVar);
        }
        com.amazon.aps.iva.xa0.c cVar = new com.amazon.aps.iva.xa0.c(aVar, iVar);
        WeakHashMap<View, com.amazon.aps.iva.p3.r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        g0.i.u(view, cVar);
        if (i != 0) {
            com.amazon.aps.iva.p3.g0.p(view, new com.amazon.aps.iva.xa0.d(aVar, view));
        }
        view.addOnAttachStateChangeListener(new com.amazon.aps.iva.xa0.b());
        if (g0.g.b(view)) {
            g0.h.c(view);
        }
    }

    public static final ArrayList j(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new com.amazon.aps.iva.lb0.j(objArr, true));
    }

    public static int k(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        com.amazon.aps.iva.yb0.j.f(arrayList, "<this>");
        int size2 = arrayList.size();
        int i = 0;
        if (size >= 0) {
            if (size <= size2) {
                int i2 = size - 1;
                while (i <= i2) {
                    int i3 = (i + i2) >>> 1;
                    int t = t((Comparable) arrayList.get(i3), comparable);
                    if (t < 0) {
                        i = i3 + 1;
                    } else if (t > 0) {
                        i2 = i3 - 1;
                    } else {
                        return i3;
                    }
                }
                return -(i + 1);
            }
            throw new IndexOutOfBoundsException(com.amazon.aps.iva.q.n.a("toIndex (", size, ") is greater than size (", size2, ")."));
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.n.a("fromIndex (", 0, ") is greater than toIndex (", size, ")."));
    }

    public static final com.amazon.aps.iva.mb0.a l(com.amazon.aps.iva.mb0.a aVar) {
        if (aVar.f == null) {
            aVar.j();
            aVar.e = true;
            if (aVar.d <= 0) {
                return com.amazon.aps.iva.mb0.a.h;
            }
            return aVar;
        }
        throw new IllegalStateException();
    }

    public static final com.amazon.aps.iva.xe0.y m(com.amazon.aps.iva.xb0.l lVar, Object obj, com.amazon.aps.iva.xe0.y yVar) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (yVar != null && yVar.getCause() != th) {
                com.amazon.aps.iva.aq.k.f(yVar, th);
            } else {
                return new com.amazon.aps.iva.xe0.y("Exception in undelivered element handler for " + obj, th);
            }
        }
        return yVar;
    }

    public static final void n(com.amazon.aps.iva.ue0.s sVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = com.amazon.aps.iva.e.z.h("Channel was consumed, consumer had failed", th);
            }
        }
        sVar.a(cancellationException);
    }

    public static final boolean o(com.amazon.aps.iva.p1.y yVar) {
        com.amazon.aps.iva.yb0.j.f(yVar, "<this>");
        if (!yVar.h && yVar.d) {
            return true;
        }
        return false;
    }

    public static final boolean p(com.amazon.aps.iva.p1.y yVar) {
        com.amazon.aps.iva.yb0.j.f(yVar, "<this>");
        if (yVar.h && !yVar.d) {
            return true;
        }
        return false;
    }

    public static final Object q(Object obj, com.amazon.aps.iva.oc0.b bVar) {
        Class T;
        if ((bVar instanceof com.amazon.aps.iva.oc0.n0) && com.amazon.aps.iva.qd0.k.d((com.amazon.aps.iva.oc0.d1) bVar)) {
            return obj;
        }
        e0 z = z(bVar);
        if (z != null && (T = T(z)) != null) {
            return E(T, bVar).invoke(obj, new Object[0]);
        }
        return obj;
    }

    public static final void r(com.amazon.aps.iva.oc0.g0 g0Var, com.amazon.aps.iva.nd0.c cVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        if (g0Var instanceof com.amazon.aps.iva.oc0.i0) {
            ((com.amazon.aps.iva.oc0.i0) g0Var).a(cVar, arrayList);
        } else {
            arrayList.addAll(g0Var.c(cVar));
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.amazon.aps.iva.nb0.a] */
    public static final com.amazon.aps.iva.nb0.a s(final com.amazon.aps.iva.xb0.l... lVarArr) {
        boolean z;
        if (lVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Comparator() { // from class: com.amazon.aps.iva.nb0.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    l[] lVarArr2 = lVarArr;
                    j.f(lVarArr2, "$selectors");
                    for (l lVar : lVarArr2) {
                        int t = f1.t((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
                        if (t != 0) {
                            return t;
                        }
                    }
                    return 0;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final int t(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        if (r0 != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.jc0.f u(com.amazon.aps.iva.jc0.f r5, com.amazon.aps.iva.oc0.v r6, boolean r7) {
        /*
            java.lang.String r0 = "descriptor"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            boolean r0 = com.amazon.aps.iva.qd0.k.a(r6)
            r1 = 1
            if (r0 != 0) goto L72
            java.util.List r0 = r6.f()
            java.lang.String r2 = "descriptor.valueParameters"
            com.amazon.aps.iva.yb0.j.e(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L26
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L26
            goto L47
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            com.amazon.aps.iva.oc0.c1 r2 = (com.amazon.aps.iva.oc0.c1) r2
            com.amazon.aps.iva.ee0.e0 r2 = r2.getType()
            java.lang.String r4 = "it.type"
            com.amazon.aps.iva.yb0.j.e(r2, r4)
            boolean r2 = com.amazon.aps.iva.qd0.k.c(r2)
            if (r2 == 0) goto L2a
            r0 = r1
            goto L48
        L47:
            r0 = r3
        L48:
            if (r0 != 0) goto L72
            com.amazon.aps.iva.ee0.e0 r0 = r6.getReturnType()
            if (r0 == 0) goto L58
            boolean r0 = com.amazon.aps.iva.qd0.k.c(r0)
            if (r0 != r1) goto L58
            r0 = r1
            goto L59
        L58:
            r0 = r3
        L59:
            if (r0 != 0) goto L72
            boolean r0 = r5 instanceof com.amazon.aps.iva.jc0.e
            if (r0 != 0) goto L71
            com.amazon.aps.iva.ee0.e0 r0 = z(r6)
            if (r0 == 0) goto L6d
            boolean r0 = com.amazon.aps.iva.qd0.k.c(r0)
            if (r0 != r1) goto L6d
            r0 = r1
            goto L6e
        L6d:
            r0 = r3
        L6e:
            if (r0 == 0) goto L71
            goto L72
        L71:
            r1 = r3
        L72:
            if (r1 == 0) goto L7a
            com.amazon.aps.iva.jc0.h r0 = new com.amazon.aps.iva.jc0.h
            r0.<init>(r5, r6, r7)
            r5 = r0
        L7a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ee0.f1.u(com.amazon.aps.iva.jc0.f, com.amazon.aps.iva.oc0.v, boolean):com.amazon.aps.iva.jc0.f");
    }

    public static final com.amazon.aps.iva.uc0.e v(Annotation[] annotationArr, com.amazon.aps.iva.nd0.c cVar) {
        Annotation annotation;
        com.amazon.aps.iva.yb0.j.f(annotationArr, "<this>");
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                annotation = annotationArr[i];
                if (com.amazon.aps.iva.yb0.j.a(com.amazon.aps.iva.uc0.d.a(com.amazon.aps.iva.ab.t.o(com.amazon.aps.iva.ab.t.n(annotation))).b(), cVar)) {
                    break;
                }
                i++;
            } else {
                annotation = null;
                break;
            }
        }
        if (annotation == null) {
            return null;
        }
        return new com.amazon.aps.iva.uc0.e(annotation);
    }

    public static String w() {
        StringBuilder b2;
        Random random = new Random();
        String str = "";
        for (int i = 0; i < 36; i++) {
            int nextInt = random.nextInt(16);
            char charAt = "xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".charAt(i);
            if (charAt == 'x') {
                b2 = defpackage.c.b(str);
            } else if (charAt == 'y') {
                b2 = defpackage.c.b(str);
                nextInt = (nextInt & 3) | 8;
            } else {
                str = str + charAt;
            }
            b2.append(Integer.toHexString(nextInt));
            str = b2.toString();
        }
        return str;
    }

    public static final ArrayList x(Annotation[] annotationArr) {
        com.amazon.aps.iva.yb0.j.f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new com.amazon.aps.iva.uc0.e(annotation));
        }
        return arrayList;
    }

    public static HashMap y() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        com.amazon.aps.iva.a0.r.e(arrayList, "BB", "BM", "BS", "CA");
        com.amazon.aps.iva.a0.r.e(arrayList, "DM", "DO", "GD", "GU");
        com.amazon.aps.iva.a0.r.e(arrayList, "JM", "KN", "KY", "LC");
        com.amazon.aps.iva.a0.r.e(arrayList, "MP", "MS", "PR", "SX");
        com.amazon.aps.iva.a0.r.e(arrayList, "TC", "TT", "VC", "VG");
        ArrayList b2 = com.amazon.aps.iva.r4.x.b(arrayList, "VI", 1, hashMap, arrayList, 2);
        b2.add("RU");
        b2.add("KZ");
        hashMap.put(7, b2);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("EG");
        hashMap.put(36, com.amazon.aps.iva.j0.j0.g(34, hashMap, com.amazon.aps.iva.j0.j0.g(33, hashMap, com.amazon.aps.iva.j0.j0.g(32, hashMap, com.amazon.aps.iva.j0.j0.g(31, hashMap, com.amazon.aps.iva.j0.j0.g(30, hashMap, com.amazon.aps.iva.j0.j0.g(27, hashMap, com.amazon.aps.iva.j0.j0.g(20, hashMap, arrayList2, 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"));
        ArrayList arrayList3 = new ArrayList(2);
        arrayList3.add("IT");
        arrayList3.add("VA");
        hashMap.put(43, com.amazon.aps.iva.j0.j0.g(41, hashMap, com.amazon.aps.iva.j0.j0.g(40, hashMap, com.amazon.aps.iva.j0.j0.g(39, hashMap, arrayList3, 1, "RO"), 1, "CH"), 1, "AT"));
        ArrayList arrayList4 = new ArrayList(4);
        arrayList4.add("GB");
        arrayList4.add("GG");
        arrayList4.add("IM");
        arrayList4.add("JE");
        hashMap.put(44, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("DK");
        hashMap.put(46, com.amazon.aps.iva.j0.j0.g(45, hashMap, arrayList5, 1, "SE"));
        ArrayList arrayList6 = new ArrayList(2);
        arrayList6.add("NO");
        arrayList6.add("SJ");
        hashMap.put(60, com.amazon.aps.iva.j0.j0.g(58, hashMap, com.amazon.aps.iva.j0.j0.g(57, hashMap, com.amazon.aps.iva.j0.j0.g(56, hashMap, com.amazon.aps.iva.j0.j0.g(55, hashMap, com.amazon.aps.iva.j0.j0.g(54, hashMap, com.amazon.aps.iva.j0.j0.g(53, hashMap, com.amazon.aps.iva.j0.j0.g(52, hashMap, com.amazon.aps.iva.j0.j0.g(51, hashMap, com.amazon.aps.iva.j0.j0.g(49, hashMap, com.amazon.aps.iva.j0.j0.g(48, hashMap, com.amazon.aps.iva.j0.j0.g(47, hashMap, arrayList6, 1, "PL"), 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"));
        ArrayList arrayList7 = new ArrayList(3);
        arrayList7.add("AU");
        arrayList7.add("CC");
        ArrayList b3 = com.amazon.aps.iva.r4.x.b(arrayList7, "CX", 61, hashMap, arrayList7, 1);
        ArrayList b4 = com.amazon.aps.iva.r4.x.b(b3, "ID", 62, hashMap, b3, 1);
        ArrayList b5 = com.amazon.aps.iva.r4.x.b(b4, "PH", 63, hashMap, b4, 1);
        ArrayList b6 = com.amazon.aps.iva.r4.x.b(b5, "NZ", 64, hashMap, b5, 1);
        ArrayList b7 = com.amazon.aps.iva.r4.x.b(b6, "SG", 65, hashMap, b6, 1);
        ArrayList b8 = com.amazon.aps.iva.r4.x.b(b7, "TH", 66, hashMap, b7, 1);
        ArrayList b9 = com.amazon.aps.iva.r4.x.b(b8, "JP", 81, hashMap, b8, 1);
        ArrayList b10 = com.amazon.aps.iva.r4.x.b(b9, "KR", 82, hashMap, b9, 1);
        ArrayList b11 = com.amazon.aps.iva.r4.x.b(b10, "VN", 84, hashMap, b10, 1);
        ArrayList b12 = com.amazon.aps.iva.r4.x.b(b11, "CN", 86, hashMap, b11, 1);
        ArrayList b13 = com.amazon.aps.iva.r4.x.b(b12, "TR", 90, hashMap, b12, 1);
        ArrayList b14 = com.amazon.aps.iva.r4.x.b(b13, "IN", 91, hashMap, b13, 1);
        ArrayList b15 = com.amazon.aps.iva.r4.x.b(b14, "PK", 92, hashMap, b14, 1);
        ArrayList b16 = com.amazon.aps.iva.r4.x.b(b15, "AF", 93, hashMap, b15, 1);
        ArrayList b17 = com.amazon.aps.iva.r4.x.b(b16, "LK", 94, hashMap, b16, 1);
        ArrayList b18 = com.amazon.aps.iva.r4.x.b(b17, "MM", 95, hashMap, b17, 1);
        ArrayList b19 = com.amazon.aps.iva.r4.x.b(b18, "IR", 98, hashMap, b18, 1);
        ArrayList b20 = com.amazon.aps.iva.r4.x.b(b19, "SS", 211, hashMap, b19, 2);
        b20.add(RequestConfiguration.MAX_AD_CONTENT_RATING_MA);
        b20.add("EH");
        hashMap.put(212, b20);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("DZ");
        hashMap.put(261, com.amazon.aps.iva.j0.j0.g(260, hashMap, com.amazon.aps.iva.j0.j0.g(258, hashMap, com.amazon.aps.iva.j0.j0.g(257, hashMap, com.amazon.aps.iva.j0.j0.g(256, hashMap, com.amazon.aps.iva.j0.j0.g(255, hashMap, com.amazon.aps.iva.j0.j0.g(254, hashMap, com.amazon.aps.iva.j0.j0.g(253, hashMap, com.amazon.aps.iva.j0.j0.g(252, hashMap, com.amazon.aps.iva.j0.j0.g(251, hashMap, com.amazon.aps.iva.j0.j0.g(250, hashMap, com.amazon.aps.iva.j0.j0.g(249, hashMap, com.amazon.aps.iva.j0.j0.g(248, hashMap, com.amazon.aps.iva.j0.j0.g(247, hashMap, com.amazon.aps.iva.j0.j0.g(246, hashMap, com.amazon.aps.iva.j0.j0.g(245, hashMap, com.amazon.aps.iva.j0.j0.g(244, hashMap, com.amazon.aps.iva.j0.j0.g(243, hashMap, com.amazon.aps.iva.j0.j0.g(242, hashMap, com.amazon.aps.iva.j0.j0.g(241, hashMap, com.amazon.aps.iva.j0.j0.g(240, hashMap, com.amazon.aps.iva.j0.j0.g(239, hashMap, com.amazon.aps.iva.j0.j0.g(238, hashMap, com.amazon.aps.iva.j0.j0.g(237, hashMap, com.amazon.aps.iva.j0.j0.g(236, hashMap, com.amazon.aps.iva.j0.j0.g(235, hashMap, com.amazon.aps.iva.j0.j0.g(234, hashMap, com.amazon.aps.iva.j0.j0.g(233, hashMap, com.amazon.aps.iva.j0.j0.g(232, hashMap, com.amazon.aps.iva.j0.j0.g(231, hashMap, com.amazon.aps.iva.j0.j0.g(230, hashMap, com.amazon.aps.iva.j0.j0.g(229, hashMap, com.amazon.aps.iva.j0.j0.g(228, hashMap, com.amazon.aps.iva.j0.j0.g(227, hashMap, com.amazon.aps.iva.j0.j0.g(226, hashMap, com.amazon.aps.iva.j0.j0.g(225, hashMap, com.amazon.aps.iva.j0.j0.g(224, hashMap, com.amazon.aps.iva.j0.j0.g(223, hashMap, com.amazon.aps.iva.j0.j0.g(222, hashMap, com.amazon.aps.iva.j0.j0.g(221, hashMap, com.amazon.aps.iva.j0.j0.g(220, hashMap, com.amazon.aps.iva.j0.j0.g(218, hashMap, com.amazon.aps.iva.j0.j0.g(216, hashMap, com.amazon.aps.iva.j0.j0.g(213, hashMap, arrayList8, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"));
        ArrayList arrayList9 = new ArrayList(2);
        arrayList9.add("RE");
        arrayList9.add("YT");
        hashMap.put(269, com.amazon.aps.iva.j0.j0.g(268, hashMap, com.amazon.aps.iva.j0.j0.g(267, hashMap, com.amazon.aps.iva.j0.j0.g(266, hashMap, com.amazon.aps.iva.j0.j0.g(265, hashMap, com.amazon.aps.iva.j0.j0.g(264, hashMap, com.amazon.aps.iva.j0.j0.g(263, hashMap, com.amazon.aps.iva.j0.j0.g(262, hashMap, arrayList9, 1, "ZW"), 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"));
        ArrayList arrayList10 = new ArrayList(2);
        arrayList10.add("SH");
        arrayList10.add("TA");
        hashMap.put(357, com.amazon.aps.iva.j0.j0.g(356, hashMap, com.amazon.aps.iva.j0.j0.g(355, hashMap, com.amazon.aps.iva.j0.j0.g(354, hashMap, com.amazon.aps.iva.j0.j0.g(353, hashMap, com.amazon.aps.iva.j0.j0.g(352, hashMap, com.amazon.aps.iva.j0.j0.g(351, hashMap, com.amazon.aps.iva.j0.j0.g(350, hashMap, com.amazon.aps.iva.j0.j0.g(299, hashMap, com.amazon.aps.iva.j0.j0.g(298, hashMap, com.amazon.aps.iva.j0.j0.g(297, hashMap, com.amazon.aps.iva.j0.j0.g(291, hashMap, com.amazon.aps.iva.j0.j0.g(290, hashMap, arrayList10, 1, "ER"), 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"));
        ArrayList arrayList11 = new ArrayList(2);
        arrayList11.add("FI");
        arrayList11.add("AX");
        hashMap.put(509, com.amazon.aps.iva.j0.j0.g(508, hashMap, com.amazon.aps.iva.j0.j0.g(507, hashMap, com.amazon.aps.iva.j0.j0.g(506, hashMap, com.amazon.aps.iva.j0.j0.g(505, hashMap, com.amazon.aps.iva.j0.j0.g(504, hashMap, com.amazon.aps.iva.j0.j0.g(503, hashMap, com.amazon.aps.iva.j0.j0.g(502, hashMap, com.amazon.aps.iva.j0.j0.g(501, hashMap, com.amazon.aps.iva.j0.j0.g(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, hashMap, com.amazon.aps.iva.j0.j0.g(MediaError.DetailedErrorCode.DASH_INVALID_SEGMENT_INFO, hashMap, com.amazon.aps.iva.j0.j0.g(421, hashMap, com.amazon.aps.iva.j0.j0.g(MediaError.DetailedErrorCode.DASH_MANIFEST_UNKNOWN, hashMap, com.amazon.aps.iva.j0.j0.g(389, hashMap, com.amazon.aps.iva.j0.j0.g(387, hashMap, com.amazon.aps.iva.j0.j0.g(386, hashMap, com.amazon.aps.iva.j0.j0.g(385, hashMap, com.amazon.aps.iva.j0.j0.g(383, hashMap, com.amazon.aps.iva.j0.j0.g(382, hashMap, com.amazon.aps.iva.j0.j0.g(381, hashMap, com.amazon.aps.iva.j0.j0.g(380, hashMap, com.amazon.aps.iva.j0.j0.g(378, hashMap, com.amazon.aps.iva.j0.j0.g(377, hashMap, com.amazon.aps.iva.j0.j0.g(376, hashMap, com.amazon.aps.iva.j0.j0.g(375, hashMap, com.amazon.aps.iva.j0.j0.g(374, hashMap, com.amazon.aps.iva.j0.j0.g(373, hashMap, com.amazon.aps.iva.j0.j0.g(372, hashMap, com.amazon.aps.iva.j0.j0.g(371, hashMap, com.amazon.aps.iva.j0.j0.g(370, hashMap, com.amazon.aps.iva.j0.j0.g(359, hashMap, com.amazon.aps.iva.j0.j0.g(358, hashMap, arrayList11, 1, "BG"), 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"));
        ArrayList arrayList12 = new ArrayList(3);
        arrayList12.add("GP");
        arrayList12.add("BL");
        ArrayList b21 = com.amazon.aps.iva.r4.x.b(arrayList12, "MF", 590, hashMap, arrayList12, 1);
        ArrayList b22 = com.amazon.aps.iva.r4.x.b(b21, "BO", 591, hashMap, b21, 1);
        ArrayList b23 = com.amazon.aps.iva.r4.x.b(b22, "GY", 592, hashMap, b22, 1);
        ArrayList b24 = com.amazon.aps.iva.r4.x.b(b23, "EC", 593, hashMap, b23, 1);
        ArrayList b25 = com.amazon.aps.iva.r4.x.b(b24, "GF", 594, hashMap, b24, 1);
        ArrayList b26 = com.amazon.aps.iva.r4.x.b(b25, "PY", 595, hashMap, b25, 1);
        ArrayList b27 = com.amazon.aps.iva.r4.x.b(b26, "MQ", 596, hashMap, b26, 1);
        ArrayList b28 = com.amazon.aps.iva.r4.x.b(b27, "SR", 597, hashMap, b27, 1);
        ArrayList b29 = com.amazon.aps.iva.r4.x.b(b28, "UY", 598, hashMap, b28, 2);
        b29.add("CW");
        b29.add("BQ");
        hashMap.put(599, b29);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("TL");
        hashMap.put(998, com.amazon.aps.iva.j0.j0.g(996, hashMap, com.amazon.aps.iva.j0.j0.g(995, hashMap, com.amazon.aps.iva.j0.j0.g(994, hashMap, com.amazon.aps.iva.j0.j0.g(993, hashMap, com.amazon.aps.iva.j0.j0.g(992, hashMap, com.amazon.aps.iva.j0.j0.g(979, hashMap, com.amazon.aps.iva.j0.j0.g(977, hashMap, com.amazon.aps.iva.j0.j0.g(976, hashMap, com.amazon.aps.iva.j0.j0.g(975, hashMap, com.amazon.aps.iva.j0.j0.g(974, hashMap, com.amazon.aps.iva.j0.j0.g(973, hashMap, com.amazon.aps.iva.j0.j0.g(972, hashMap, com.amazon.aps.iva.j0.j0.g(971, hashMap, com.amazon.aps.iva.j0.j0.g(970, hashMap, com.amazon.aps.iva.j0.j0.g(968, hashMap, com.amazon.aps.iva.j0.j0.g(967, hashMap, com.amazon.aps.iva.j0.j0.g(966, hashMap, com.amazon.aps.iva.j0.j0.g(965, hashMap, com.amazon.aps.iva.j0.j0.g(964, hashMap, com.amazon.aps.iva.j0.j0.g(963, hashMap, com.amazon.aps.iva.j0.j0.g(962, hashMap, com.amazon.aps.iva.j0.j0.g(961, hashMap, com.amazon.aps.iva.j0.j0.g(960, hashMap, com.amazon.aps.iva.j0.j0.g(888, hashMap, com.amazon.aps.iva.j0.j0.g(886, hashMap, com.amazon.aps.iva.j0.j0.g(883, hashMap, com.amazon.aps.iva.j0.j0.g(882, hashMap, com.amazon.aps.iva.j0.j0.g(881, hashMap, com.amazon.aps.iva.j0.j0.g(880, hashMap, com.amazon.aps.iva.j0.j0.g(878, hashMap, com.amazon.aps.iva.j0.j0.g(870, hashMap, com.amazon.aps.iva.j0.j0.g(856, hashMap, com.amazon.aps.iva.j0.j0.g(855, hashMap, com.amazon.aps.iva.j0.j0.g(853, hashMap, com.amazon.aps.iva.j0.j0.g(852, hashMap, com.amazon.aps.iva.j0.j0.g(850, hashMap, com.amazon.aps.iva.j0.j0.g(808, hashMap, com.amazon.aps.iva.j0.j0.g(800, hashMap, com.amazon.aps.iva.j0.j0.g(692, hashMap, com.amazon.aps.iva.j0.j0.g(691, hashMap, com.amazon.aps.iva.j0.j0.g(690, hashMap, com.amazon.aps.iva.j0.j0.g(689, hashMap, com.amazon.aps.iva.j0.j0.g(688, hashMap, com.amazon.aps.iva.j0.j0.g(687, hashMap, com.amazon.aps.iva.j0.j0.g(686, hashMap, com.amazon.aps.iva.j0.j0.g(685, hashMap, com.amazon.aps.iva.j0.j0.g(683, hashMap, com.amazon.aps.iva.j0.j0.g(682, hashMap, com.amazon.aps.iva.j0.j0.g(681, hashMap, com.amazon.aps.iva.j0.j0.g(680, hashMap, com.amazon.aps.iva.j0.j0.g(679, hashMap, com.amazon.aps.iva.j0.j0.g(678, hashMap, com.amazon.aps.iva.j0.j0.g(677, hashMap, com.amazon.aps.iva.j0.j0.g(676, hashMap, com.amazon.aps.iva.j0.j0.g(675, hashMap, com.amazon.aps.iva.j0.j0.g(674, hashMap, com.amazon.aps.iva.j0.j0.g(673, hashMap, com.amazon.aps.iva.j0.j0.g(672, hashMap, com.amazon.aps.iva.j0.j0.g(670, hashMap, arrayList13, 1, "NF"), 1, "BN"), 1, "NR"), 1, RequestConfiguration.MAX_AD_CONTENT_RATING_PG), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, ExpandedProductParsedResult.POUND), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, ExpandedProductParsedResult.KILOGRAM), 1, "UZ"));
        return hashMap;
    }

    public static final e0 z(com.amazon.aps.iva.oc0.b bVar) {
        com.amazon.aps.iva.oc0.e eVar;
        com.amazon.aps.iva.oc0.q0 M = bVar.M();
        com.amazon.aps.iva.oc0.q0 J = bVar.J();
        if (M != null) {
            return M.getType();
        }
        if (J != null) {
            if (bVar instanceof com.amazon.aps.iva.oc0.j) {
                return J.getType();
            }
            com.amazon.aps.iva.oc0.k d = bVar.d();
            if (d instanceof com.amazon.aps.iva.oc0.e) {
                eVar = (com.amazon.aps.iva.oc0.e) d;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return eVar.m();
            }
        }
        return null;
    }

    @Override // com.amazon.aps.iva.ae0.s
    public void a(com.amazon.aps.iva.oc0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + bVar);
    }

    @Override // com.amazon.aps.iva.ae0.s
    public void b(com.amazon.aps.iva.rc0.b bVar, ArrayList arrayList) {
        com.amazon.aps.iva.yb0.j.f(bVar, "descriptor");
        throw new IllegalStateException("Incomplete hierarchy for class " + bVar.getName() + ", unresolved classes " + arrayList);
    }

    @Override // com.amazon.aps.iva.qp.c
    public com.amazon.aps.iva.qp.f c(byte[] bArr) {
        com.amazon.aps.iva.yb0.j.f(bArr, "data");
        return com.amazon.aps.iva.qp.f.SUCCESS;
    }

    @Override // com.amazon.aps.iva.vo.e
    public Object d(String str, com.amazon.aps.iva.ob0.d dVar) {
        return new com.amazon.aps.iva.vo.c(com.amazon.aps.iva.lb0.z.b, 6);
    }
}
