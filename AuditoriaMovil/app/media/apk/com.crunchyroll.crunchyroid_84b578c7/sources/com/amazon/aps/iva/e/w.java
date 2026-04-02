package com.amazon.aps.iva.e;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.g1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.h2.h0;
import com.amazon.aps.iva.j9.a;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.o0.w1;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.q4.c;
import com.amazon.aps.iva.se0.d2;
import com.amazon.aps.iva.se0.e2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.ve0.e0;
import com.amazon.aps.iva.xw.f0;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomList;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomLists;
import com.ellation.crunchyroll.model.Channel;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.ellation.crunchyroll.model.categories.Category;
import com.ellation.crunchyroll.model.categories.CategoryLocalization;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfh;
import com.google.android.gms.internal.play_billing.zzfj;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
/* loaded from: classes.dex */
public class w implements com.amazon.aps.iva.l70.d, com.amazon.aps.iva.vs.a {
    public static com.amazon.aps.iva.jd.e a;
    public static com.amazon.aps.iva.kn.a b;
    public static final w c = new w();
    public static final w d = new w();
    public static com.amazon.aps.iva.xb0.l e;

    public static final float A(com.amazon.aps.iva.c2.y yVar, int i, boolean z, boolean z2) {
        int max;
        int r;
        boolean z3 = false;
        if ((z && !z2) || (!z && z2)) {
            max = i;
        } else {
            max = Math.max(i - 1, 0);
        }
        if (yVar.a(max) == yVar.n(i)) {
            z3 = true;
        }
        com.amazon.aps.iva.c2.f fVar = yVar.b;
        fVar.c(i);
        int length = fVar.a.a.length();
        ArrayList arrayList = fVar.h;
        if (i == length) {
            r = f1.B(arrayList);
        } else {
            r = com.amazon.aps.iva.ff0.b.r(i, arrayList);
        }
        com.amazon.aps.iva.c2.i iVar = (com.amazon.aps.iva.c2.i) arrayList.get(r);
        return iVar.a.l(iVar.b(i), z3);
    }

    public static final com.amazon.aps.iva.oh.a B(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "<this>");
        return new com.amazon.aps.iva.oh.a(f1.J(new com.amazon.aps.iva.nz.a(panel.getId(), f0.a(panel))), w(panel));
    }

    public static final androidx.compose.ui.node.k C(androidx.compose.ui.node.k kVar) {
        androidx.compose.ui.node.e eVar;
        com.amazon.aps.iva.yb0.j.f(kVar, "<this>");
        androidx.compose.ui.node.e eVar2 = kVar.i.i;
        while (true) {
            androidx.compose.ui.node.e v = eVar2.v();
            androidx.compose.ui.node.e eVar3 = null;
            if (v != null) {
                eVar = v.d;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                androidx.compose.ui.node.e v2 = eVar2.v();
                if (v2 != null) {
                    eVar3 = v2.d;
                }
                com.amazon.aps.iva.yb0.j.c(eVar3);
                androidx.compose.ui.node.e v3 = eVar2.v();
                com.amazon.aps.iva.yb0.j.c(v3);
                eVar2 = v3.d;
                com.amazon.aps.iva.yb0.j.c(eVar2);
            } else {
                androidx.compose.ui.node.k p1 = eVar2.z.c.p1();
                com.amazon.aps.iva.yb0.j.c(p1);
                return p1;
            }
        }
    }

    public static final g0 D(com.amazon.aps.iva.i5.f0 f0Var) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "<this>");
        g0 g0Var = (g0) f0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (g0Var != null) {
            return g0Var;
        }
        e2 a2 = com.amazon.aps.iva.se0.i.a();
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        Object tagIfAbsent = f0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new com.amazon.aps.iva.i5.e(a2.plus(com.amazon.aps.iva.xe0.k.a.C())));
        com.amazon.aps.iva.yb0.j.e(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (g0) tagIfAbsent;
    }

    public static final void E(com.amazon.aps.iva.u1.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "<this>");
        com.amazon.aps.iva.u1.i.d(xVar, 2).y1();
    }

    public static final void F(com.amazon.aps.iva.u1.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "<this>");
        com.amazon.aps.iva.u1.i.e(xVar).D();
    }

    public static boolean G(String str) {
        a.b bVar = com.amazon.aps.iva.j9.f0.a;
        Set<com.amazon.aps.iva.j9.v> unmodifiableSet = Collections.unmodifiableSet(com.amazon.aps.iva.j9.a.c);
        HashSet hashSet = new HashSet();
        for (com.amazon.aps.iva.j9.v vVar : unmodifiableSet) {
            if (vVar.a().equals(str)) {
                hashSet.add(vVar);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((com.amazon.aps.iva.j9.v) it.next()).isSupported()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature ".concat(str));
    }

    public static final boolean H(long j) {
        if (((int) (j & 4294967295L)) != 0) {
            return true;
        }
        return false;
    }

    public static final com.amazon.aps.iva.q4.d I(c.b... bVarArr) {
        com.amazon.aps.iva.yb0.j.f(bVarArr, "pairs");
        ArrayList arrayList = new ArrayList(bVarArr.length);
        for (c.b bVar : bVarArr) {
            arrayList.add(new com.amazon.aps.iva.kb0.j(bVar.a, bVar.b));
        }
        Object[] array = arrayList.toArray(new com.amazon.aps.iva.kb0.j[0]);
        com.amazon.aps.iva.yb0.j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        com.amazon.aps.iva.kb0.j[] jVarArr = (com.amazon.aps.iva.kb0.j[]) array;
        return new com.amazon.aps.iva.q4.d(i0.V((com.amazon.aps.iva.kb0.j[]) Arrays.copyOf(jVarArr, jVarArr.length)));
    }

    public static final w1 J(int i) {
        int i2 = com.amazon.aps.iva.o0.b.a;
        return new w1(i);
    }

    public static final com.amazon.aps.iva.p4.n K(com.amazon.aps.iva.p4.n nVar, float f) {
        com.amazon.aps.iva.yb0.j.f(nVar, "$this$padding");
        com.amazon.aps.iva.y4.l T = T(f);
        return nVar.d(new com.amazon.aps.iva.y4.m(T, T, T, T, 9));
    }

    public static final com.amazon.aps.iva.p4.n L(com.amazon.aps.iva.p4.n nVar, float f, float f2) {
        com.amazon.aps.iva.yb0.j.f(nVar, "$this$padding");
        return nVar.d(new com.amazon.aps.iva.y4.m(T(f), T(f2), T(f), T(f2), 9));
    }

    public static com.amazon.aps.iva.p4.n M(float f) {
        return new com.amazon.aps.iva.y4.m(T(0), T(f), T(0), T(0), 9);
    }

    public static final void N(com.amazon.aps.iva.ij.n nVar, com.amazon.aps.iva.pj.a aVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(aVar, "event");
        nVar.i().b(nVar.k(), aVar);
    }

    public static final com.amazon.aps.iva.y70.a O(com.amazon.aps.iva.yb0.n nVar) {
        return new com.amazon.aps.iva.y70.a(new com.amazon.aps.iva.y70.b(nVar), new com.amazon.aps.iva.y70.c(nVar));
    }

    public static final void P(Rect rect, int i, int i2, int i3, int i4, boolean z) {
        com.amazon.aps.iva.yb0.j.f(rect, "<this>");
        if (z) {
            rect.set(i3, i2, i, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
    }

    public static final void Q(String str, char[] cArr, int i, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(cArr, FirebaseAnalytics.Param.DESTINATION);
        str.getChars(i2, i3, cArr, i);
    }

    public static final com.amazon.aps.iva.l10.a R(Category category) {
        String str;
        String str2;
        String description;
        String title;
        com.amazon.aps.iva.yb0.j.f(category, "<this>");
        String tenantCategoryId = category.getTenantCategoryId();
        CategoryLocalization localization = category.getLocalization();
        if (localization == null || (title = localization.getTitle()) == null) {
            str = "";
        } else {
            str = title;
        }
        CategoryLocalization localization2 = category.getLocalization();
        if (localization2 == null || (description = localization2.getDescription()) == null) {
            str2 = "";
        } else {
            str2 = description;
        }
        return new com.amazon.aps.iva.l10.a(tenantCategoryId, str, str2, category.getIcons(), category.getBackgrounds());
    }

    public static final String S(BigInteger bigInteger) {
        long longValue = bigInteger.longValue();
        com.amazon.aps.iva.ab.x.x(16);
        String l = Long.toString(longValue, 16);
        com.amazon.aps.iva.yb0.j.e(l, "toString(this, checkRadix(radix))");
        return l;
    }

    public static final com.amazon.aps.iva.y4.l T(float f) {
        return new com.amazon.aps.iva.y4.l(f, 2);
    }

    public static final com.amazon.aps.iva.yu.x U(CustomLists customLists, List list) {
        String listId;
        com.amazon.aps.iva.yb0.j.f(customLists, "<this>");
        com.amazon.aps.iva.yb0.j.f(list, "emptyItems");
        List<CustomList> items = customLists.getItems();
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(items));
        int i = 0;
        for (Object obj : items) {
            int i2 = i + 1;
            if (i >= 0) {
                CustomList customList = (CustomList) obj;
                com.amazon.aps.iva.nv.a aVar = (com.amazon.aps.iva.nv.a) com.amazon.aps.iva.lb0.x.w0(i, list);
                if (aVar == null || (listId = aVar.c) == null) {
                    listId = customList.getListId();
                }
                String str = listId;
                com.amazon.aps.iva.yb0.j.f(customList, "<this>");
                com.amazon.aps.iva.yb0.j.f(str, "adapterId");
                arrayList.add(new com.amazon.aps.iva.nv.e(str, customList.getListId(), customList.getTitle(), customList.getTotal(), customList.getModifiedAt()));
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        return new com.amazon.aps.iva.yu.x(arrayList, customLists.getMetadata().getMaxPrivate());
    }

    public static zzfb V(int i, int i2, com.android.billingclient.api.c cVar) {
        zzfa zzv = zzfb.zzv();
        zzfh zzv2 = zzfj.zzv();
        zzv2.zzj(cVar.a);
        zzv2.zzi(cVar.b);
        zzv2.zzk(i);
        zzv.zzi(zzv2);
        zzv.zzk(i2);
        return (zzfb) zzv.zzc();
    }

    public static zzff W(int i) {
        zzfe zzv = zzff.zzv();
        zzv.zzj(i);
        return (zzff) zzv.zzc();
    }

    public static h0 d(int i) {
        com.amazon.aps.iva.h2.y yVar = com.amazon.aps.iva.h2.y.g;
        com.amazon.aps.iva.yb0.j.f(yVar, "weight");
        return new h0(i, yVar, 0, new com.amazon.aps.iva.h2.x(new com.amazon.aps.iva.h2.w[0]), 0);
    }

    public static final long e(int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = com.amazon.aps.iva.o2.h.c;
        return j;
    }

    public static boolean f(String str) {
        if (str != null && !str.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public static final Object[] g(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        com.amazon.aps.iva.lb0.m.H(objArr, objArr2, 0, 0, i, 6);
        com.amazon.aps.iva.lb0.m.F(objArr, i + 2, objArr2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean h(com.amazon.aps.iva.nk.j jVar) {
        if (jVar.h.m != com.amazon.aps.iva.qj.m.COMPLETE) {
            return true;
        }
        return false;
    }

    public static final Object[] i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        com.amazon.aps.iva.lb0.m.H(objArr, objArr2, 0, 0, i, 6);
        com.amazon.aps.iva.lb0.m.F(objArr, i, objArr2, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] j(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        com.amazon.aps.iva.lb0.m.H(objArr, objArr2, 0, 0, i, 6);
        com.amazon.aps.iva.lb0.m.F(objArr, i, objArr2, i + 1, objArr.length);
        return objArr2;
    }

    public static final float k(List list, Resources resources) {
        float f = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return f;
    }

    public static final ArrayList l(List list, ArrayList arrayList) {
        String tenantCategoryId;
        List list2 = list;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                Category category = (Category) obj;
                com.amazon.aps.iva.m10.e eVar = (com.amazon.aps.iva.m10.e) com.amazon.aps.iva.lb0.x.w0(i, arrayList);
                if (eVar == null || (tenantCategoryId = eVar.getAdapterId()) == null) {
                    tenantCategoryId = category.getTenantCategoryId();
                }
                arrayList2.add(new com.amazon.aps.iva.m10.b(tenantCategoryId, category.getTenantCategoryId(), R(category)));
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
        return arrayList2;
    }

    public static final com.amazon.aps.iva.q4.d m(c.b... bVarArr) {
        return I((c.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static void n(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        Object[] spans;
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final void o(com.crunchyroll.auth.c cVar, Intent intent) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        intent.putExtra("is_billing_flow", cVar.b);
        intent.putExtra("is_token_expired", cVar.c);
        intent.putExtra("experiment", cVar.d);
        intent.putExtra("phone_number_input", cVar.e);
        intent.putExtra("should_open_signup", cVar.f);
    }

    public static float p(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        if (f > f3) {
            return f3;
        }
        return f;
    }

    public static int q(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    public static final Object r(com.amazon.aps.iva.ob0.d dVar, e0 e0Var, com.amazon.aps.iva.xb0.q qVar, com.amazon.aps.iva.ve0.g gVar, com.amazon.aps.iva.ve0.f[] fVarArr) {
        com.amazon.aps.iva.we0.k kVar = new com.amazon.aps.iva.we0.k(null, e0Var, qVar, gVar, fVarArr);
        d2 d2Var = new d2(dVar.getContext(), dVar, 1);
        Object u = com.amazon.aps.iva.ab.t.u(d2Var, d2Var, kVar);
        if (u == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return u;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    public static final int s(long j, long j2) {
        boolean H = H(j);
        if (H != H(j2)) {
            if (H) {
                return -1;
            }
            return 1;
        }
        return (int) Math.signum(Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32)));
    }

    public static final com.amazon.aps.iva.hg.g u(com.amazon.aps.iva.hg.g gVar, com.amazon.aps.iva.hg.g gVar2) {
        if (gVar != null && gVar2 != null) {
            return com.amazon.aps.iva.hg.g.a(gVar, com.amazon.aps.iva.lb0.x.L0(gVar2.d, gVar.d), i0.W(gVar.e, gVar2.e), 3);
        } else if (gVar == null) {
            return gVar2;
        } else {
            return gVar;
        }
    }

    public static com.amazon.aps.iva.ks.e v(String str, String str2, String str3, com.amazon.aps.iva.x50.t tVar) {
        com.amazon.aps.iva.yb0.j.f(str, "channelId");
        com.amazon.aps.iva.yb0.j.f(str2, "contentId");
        com.amazon.aps.iva.yb0.j.f(str3, "contentTitle");
        com.amazon.aps.iva.yb0.j.f(tVar, "contentType");
        com.amazon.aps.iva.xb0.l lVar = e;
        if (lVar != null) {
            Channel channel = (Channel) lVar.invoke(str);
            return new com.amazon.aps.iva.ks.e((channel == null || (r11 = channel.getName()) == null) ? "" : "", com.amazon.aps.iva.us.s.e(str2, tVar), str2, "", str3, null, null, null, 480);
        }
        com.amazon.aps.iva.yb0.j.m("getChannelById");
        throw null;
    }

    public static com.amazon.aps.iva.ks.e w(Panel panel) {
        String str;
        String str2;
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        com.amazon.aps.iva.xb0.l lVar = e;
        if (lVar != null) {
            String a2 = com.amazon.aps.iva.us.s.a(panel.getChannelId(), lVar);
            com.amazon.aps.iva.js.p e2 = com.amazon.aps.iva.us.s.e(panel.getId(), panel.getResourceType());
            String id = panel.getId();
            String c2 = com.amazon.aps.iva.us.s.c(panel);
            String seasonTitle = panel.getEpisodeMetadata().getSeasonTitle();
            if (seasonTitle == null) {
                str = "";
            } else {
                str = seasonTitle;
            }
            if (com.amazon.aps.iva.us.s.e(panel.getId(), panel.getResourceType()) != com.amazon.aps.iva.js.p.EPISODE) {
                str2 = "";
            } else {
                str2 = panel.getTitle();
            }
            String episodeNumber = panel.getEpisodeMetadata().getEpisodeNumber();
            if (episodeNumber == null) {
                episodeNumber = "";
            }
            return new com.amazon.aps.iva.ks.e(a2, e2, id, "", c2, str, str2, episodeNumber, 256);
        }
        com.amazon.aps.iva.yb0.j.m("getChannelById");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r2.equals("crunchyroll.google.fanpack.monthly") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        return com.crunchyroll.crunchyroid.R.drawable.ic_upsell_tiers_mega_fan;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r2.equals("crunchyroll.google.fanpack.annually") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int x(java.lang.String r2) {
        /*
            java.lang.String r0 = "crPlusSku"
            com.amazon.aps.iva.yb0.j.f(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1666493765: goto L2e;
                case -1574954394: goto L22;
                case -447375682: goto L19;
                case 1568935424: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3a
        Ld:
            java.lang.String r0 = "crunchyroll.google.superfanpack.monthly"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3a
            r2 = 2131231547(0x7f08033b, float:1.8079178E38)
            goto L39
        L19:
            java.lang.String r0 = "crunchyroll.google.fanpack.annually"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3a
            goto L36
        L22:
            java.lang.String r0 = "crunchyroll.google.premium.monthly"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3a
            r2 = 2131231545(0x7f080339, float:1.8079174E38)
            goto L39
        L2e:
            java.lang.String r0 = "crunchyroll.google.fanpack.monthly"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3a
        L36:
            r2 = 2131231546(0x7f08033a, float:1.8079176E38)
        L39:
            return r2
        L3a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported argument: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e.w.x(java.lang.String):int");
    }

    public static final File y(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), com.amazon.aps.iva.yb0.j.k(str, "datastore/"));
    }

    public static final List z(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        List<PlayableAsset> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (PlayableAsset playableAsset : list2) {
            arrayList.add(playableAsset.getId());
        }
        ArrayList arrayList2 = new ArrayList();
        for (PlayableAsset playableAsset2 : list2) {
            List<PlayableAssetVersion> versions = playableAsset2.getVersions();
            ArrayList arrayList3 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(versions));
            for (PlayableAssetVersion playableAssetVersion : versions) {
                arrayList3.add(playableAssetVersion.getAssetId());
            }
            com.amazon.aps.iva.lb0.t.d0(arrayList2, arrayList3);
        }
        return com.amazon.aps.iva.lb0.x.n0(com.amazon.aps.iva.lb0.x.L0(arrayList2, arrayList));
    }

    @Override // com.amazon.aps.iva.l70.d
    public boolean a(String str) {
        if ((!com.amazon.aps.iva.oe0.m.b0(str)) && !com.amazon.aps.iva.yb0.j.a(str, "+")) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.vs.a
    public com.amazon.aps.iva.ks.e b(PlayableAsset playableAsset) {
        com.amazon.aps.iva.ks.e eVar;
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        if (playableAsset instanceof Movie) {
            Movie movie = (Movie) playableAsset;
            com.amazon.aps.iva.xb0.l lVar = e;
            if (lVar != null) {
                eVar = new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.d(movie, lVar), com.amazon.aps.iva.js.p.MOVIE, movie.getId(), "", movie.getTitle(), null, null, null, 480);
            } else {
                com.amazon.aps.iva.yb0.j.m("getChannelById");
                throw null;
            }
        } else if (playableAsset instanceof Episode) {
            Episode episode = (Episode) playableAsset;
            com.amazon.aps.iva.xb0.l lVar2 = e;
            if (lVar2 != null) {
                eVar = new com.amazon.aps.iva.ks.e(com.amazon.aps.iva.us.s.d(episode, lVar2), com.amazon.aps.iva.js.p.EPISODE, episode.getId(), "", episode.getSeriesTitle(), episode.getSeasonTitle(), episode.getTitle(), episode.getEpisodeNumberLegacy(), 256);
            } else {
                com.amazon.aps.iva.yb0.j.m("getChannelById");
                throw null;
            }
        } else {
            throw new IllegalArgumentException("Cannot create ContentMediaProperty for asset of type ".concat(playableAsset.getClass().getSimpleName()));
        }
        return eVar;
    }

    @Override // com.amazon.aps.iva.vs.a
    public com.amazon.aps.iva.ks.e c(String str, String str2, com.amazon.aps.iva.js.p pVar) {
        com.amazon.aps.iva.yb0.j.f(str, "mediaId");
        com.amazon.aps.iva.yb0.j.f(str2, "mediaTitle");
        com.amazon.aps.iva.yb0.j.f(pVar, "mediaType");
        return new com.amazon.aps.iva.ks.e(null, pVar, str, "", str2, null, null, null, 481);
    }

    public j1 t(y0 y0Var, com.amazon.aps.iva.ee0.x xVar, g1 g1Var, com.amazon.aps.iva.ee0.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(xVar, "typeAttr");
        com.amazon.aps.iva.yb0.j.f(g1Var, "typeParameterUpperBoundEraser");
        com.amazon.aps.iva.yb0.j.f(e0Var, "erasedUpperBound");
        return new l1(e0Var, v1.OUT_VARIANCE);
    }
}
