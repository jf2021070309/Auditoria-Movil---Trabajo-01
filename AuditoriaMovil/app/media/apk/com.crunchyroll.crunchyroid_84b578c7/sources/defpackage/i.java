package defpackage;

import android.os.Bundle;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.b0.j0;
import com.amazon.aps.iva.cq.b;
import com.amazon.aps.iva.d0.d1;
import com.amazon.aps.iva.de0.k;
import com.amazon.aps.iva.dq.c;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e0.i0;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f0.p;
import com.amazon.aps.iva.g1.g;
import com.amazon.aps.iva.g1.u;
import com.amazon.aps.iva.kj.e;
import com.amazon.aps.iva.lo.f;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j2;
import com.amazon.aps.iva.o0.x0;
import com.amazon.aps.iva.p1.y;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.qj.o;
import com.amazon.aps.iva.qj.r;
import com.amazon.aps.iva.qj.s;
import com.amazon.aps.iva.qj.t;
import com.amazon.aps.iva.ve0.g0;
import com.amazon.aps.iva.x0.d;
import com.amazon.aps.iva.x0.m;
import com.amazon.aps.iva.x0.n;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.api.etp.playback.model.SkipEvent;
import com.ellation.crunchyroll.api.etp.playback.model.SkipEvents;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
/* compiled from: String.kt */
/* renamed from: i  reason: default package */
/* loaded from: classes.dex */
public final class i implements j0, k, f {
    public static final i b = new i();
    public static final i c = new i();
    public static final i d = new i();
    public static a e;
    public static com.amazon.aps.iva.vx.k f;

    public static final Object A(Object[] objArr, n nVar, a aVar, com.amazon.aps.iva.o0.i iVar, int i) {
        Object e2;
        j.f(objArr, "inputs");
        j.f(aVar, "init");
        iVar.s(441892779);
        if ((i & 2) != 0) {
            nVar = m.a;
            j.d(nVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        }
        e0.b bVar = e0.a;
        iVar.s(1059366469);
        int S = b.S(iVar);
        x.x(36);
        String num = Integer.toString(S, 36);
        j.e(num, "toString(this, checkRadix(radix))");
        iVar.G();
        j.d(nVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        com.amazon.aps.iva.x0.i iVar2 = (com.amazon.aps.iva.x0.i) iVar.i(com.amazon.aps.iva.x0.k.a);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        iVar.s(-568225417);
        boolean z = false;
        for (Object obj : copyOf) {
            z |= iVar.H(obj);
        }
        Object t = iVar.t();
        if (z || t == i.a.a) {
            if (iVar2 != null && (e2 = iVar2.e(num)) != null) {
                t = nVar.b.invoke(e2);
            } else {
                t = null;
            }
            if (t == null) {
                t = aVar.invoke();
            }
            iVar.n(t);
        }
        iVar.G();
        if (iVar2 != null) {
            x0.b(iVar2, num, new d(iVar2, num, b.h0(nVar, iVar), b.h0(t, iVar)), iVar);
        }
        e0.b bVar2 = e0.a;
        iVar.G();
        return t;
    }

    public static final void B(long j, a aVar) {
        long nanoTime = System.nanoTime() - j;
        int i = 1;
        boolean z = false;
        while (i <= 3 && !z) {
            if (System.nanoTime() - nanoTime >= j) {
                try {
                    z = ((Boolean) aVar.invoke()).booleanValue();
                    nanoTime = System.nanoTime();
                    i++;
                } catch (Exception e2) {
                    l1.z(c.a, "Internal operation failed", e2, 4);
                    return;
                }
            }
        }
    }

    public static final void C(g0 g0Var, l lVar) {
        j.f(g0Var, "<this>");
        j.f(lVar, "block");
        g0Var.setValue(lVar.invoke(g0Var.getValue()));
    }

    public static final String D(Object obj) {
        String simpleName;
        j.f(obj, "obj");
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(simpleName);
        sb.append('@');
        String format = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        j.e(format, "format(format, *args)");
        sb.append(format);
        return sb.toString();
    }

    public static final String E(int i, com.amazon.aps.iva.o0.i iVar) {
        e0.b bVar = e0.a;
        String string = z.N(iVar).getString(i);
        j.e(string, "resources.getString(id)");
        return string;
    }

    public static final String F(int i, Object[] objArr, com.amazon.aps.iva.o0.i iVar) {
        e0.b bVar = e0.a;
        String string = z.N(iVar).getString(i, Arrays.copyOf(objArr, objArr.length));
        j.e(string, "resources.getString(id, *formatArgs)");
        return string;
    }

    public static final int G(long j) {
        float[] fArr = g.a;
        return (int) (com.amazon.aps.iva.f1.x.a(j, g.c) >>> 32);
    }

    public static final long H(long j, d1 d1Var) {
        j.f(d1Var, "orientation");
        if (d1Var == d1.Horizontal) {
            return com.amazon.aps.iva.o2.b.a(com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.h(j), com.amazon.aps.iva.o2.a.i(j), com.amazon.aps.iva.o2.a.g(j));
        }
        return com.amazon.aps.iva.o2.b.a(com.amazon.aps.iva.o2.a.i(j), com.amazon.aps.iva.o2.a.g(j), com.amazon.aps.iva.o2.a.j(j), com.amazon.aps.iva.o2.a.h(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.gson.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.gson.JsonArray] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.gson.JsonNull, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.gson.JsonObject] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.google.gson.JsonArray] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.google.gson.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.google.gson.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.google.gson.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.google.gson.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.google.gson.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.google.gson.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.google.gson.JsonPrimitive] */
    /* JADX WARN: Type inference failed for: r0v29 */
    public static final JsonElement I(Object obj) {
        if (j.a(obj, com.amazon.aps.iva.dq.a.a)) {
            JsonNull jsonNull = JsonNull.INSTANCE;
            j.e(jsonNull, "INSTANCE");
            return jsonNull;
        } else if (obj == null) {
            JsonNull jsonNull2 = JsonNull.INSTANCE;
            j.e(jsonNull2, "INSTANCE");
            return jsonNull2;
        } else {
            ?? r0 = JsonNull.INSTANCE;
            if (j.a(obj, r0)) {
                j.e(r0, "INSTANCE");
            } else if (obj instanceof Boolean) {
                r0 = new JsonPrimitive((Boolean) obj);
            } else if (obj instanceof Integer) {
                r0 = new JsonPrimitive((Number) obj);
            } else if (obj instanceof Long) {
                r0 = new JsonPrimitive((Number) obj);
            } else if (obj instanceof Float) {
                r0 = new JsonPrimitive((Number) obj);
            } else if (obj instanceof Double) {
                r0 = new JsonPrimitive((Number) obj);
            } else if (obj instanceof String) {
                r0 = new JsonPrimitive((String) obj);
            } else if (obj instanceof Date) {
                r0 = new JsonPrimitive(Long.valueOf(((Date) obj).getTime()));
            } else if (obj instanceof Iterable) {
                r0 = new JsonArray();
                for (Object obj2 : (Iterable) obj) {
                    r0.add(I(obj2));
                }
            } else if (obj instanceof Map) {
                r0 = new JsonObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    r0.add(String.valueOf(entry.getKey()), I(entry.getValue()));
                }
            } else if (obj instanceof JsonObject) {
                return (JsonElement) obj;
            } else {
                if (obj instanceof JsonArray) {
                    return (JsonElement) obj;
                }
                if (obj instanceof JsonPrimitive) {
                    return (JsonElement) obj;
                }
                if (obj instanceof com.amazon.aps.iva.if0.c) {
                    com.amazon.aps.iva.if0.c cVar = (com.amazon.aps.iva.if0.c) obj;
                    r0 = new JsonObject();
                    Iterator<String> keys = cVar.keys();
                    j.e(keys, "keys()");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        r0.add(next, I(cVar.get(next)));
                    }
                } else if (obj instanceof com.amazon.aps.iva.if0.a) {
                    com.amazon.aps.iva.if0.a aVar = (com.amazon.aps.iva.if0.a) obj;
                    r0 = new JsonArray();
                    int e2 = aVar.e();
                    for (int i = 0; i < e2; i++) {
                        r0.add(I(aVar.get(i)));
                    }
                } else {
                    r0 = new JsonPrimitive(obj.toString());
                }
            }
            return r0;
        }
    }

    public static final o J(e eVar) {
        boolean z;
        boolean z2;
        Integer num;
        String str;
        String str2;
        String str3;
        Long l;
        long j;
        String str4;
        t tVar;
        boolean z3;
        r rVar;
        r rVar2;
        r rVar3;
        String str5 = eVar.a;
        String str6 = eVar.c;
        String str7 = eVar.b;
        String tVar2 = eVar.e.toString();
        Boolean bool = eVar.l;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean bool2 = eVar.m;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        Boolean bool3 = eVar.n;
        Boolean bool4 = eVar.o;
        List<String> list = eVar.p;
        String str8 = eVar.f;
        String str9 = eVar.g;
        String str10 = eVar.d;
        String str11 = eVar.j;
        String str12 = eVar.h;
        r rVar4 = null;
        String str13 = eVar.i;
        if (str13 != null) {
            num = com.amazon.aps.iva.oe0.l.W(str13);
        } else {
            num = null;
        }
        List<Image> list2 = eVar.r;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Image image = (Image) it.next();
            arrayList.add(new com.amazon.aps.iva.qj.a(image.getUrl(), image.getWidth(), image.getHeight()));
            it = it;
            bool3 = bool3;
            z2 = z2;
        }
        boolean z4 = z2;
        Boolean bool5 = bool3;
        Object obj = eVar.t;
        Long l2 = eVar.q;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = eVar.u;
        SkipEvents skipEvents = eVar.v;
        if (skipEvents != null) {
            SkipEvent intro = skipEvents.getIntro();
            if (intro != null) {
                l = l2;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                j = j2;
                rVar = new r(timeUnit.toMillis(com.amazon.aps.iva.ob0.f.d(intro.getEndSeconds())), timeUnit.toMillis(com.amazon.aps.iva.ob0.f.d(intro.getStartSeconds())), s.INTRO);
            } else {
                l = l2;
                j = j2;
                rVar = null;
            }
            SkipEvent credits = skipEvents.getCredits();
            if (credits != null) {
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                str2 = str12;
                str3 = str11;
                rVar2 = new r(timeUnit2.toMillis(com.amazon.aps.iva.ob0.f.d(credits.getEndSeconds())), timeUnit2.toMillis(com.amazon.aps.iva.ob0.f.d(credits.getStartSeconds())), s.CREDITS);
            } else {
                str2 = str12;
                str3 = str11;
                rVar2 = null;
            }
            SkipEvent preview = skipEvents.getPreview();
            if (preview != null) {
                TimeUnit timeUnit3 = TimeUnit.SECONDS;
                str4 = str9;
                str = str10;
                rVar3 = new r(timeUnit3.toMillis(com.amazon.aps.iva.ob0.f.d(preview.getEndSeconds())), timeUnit3.toMillis(com.amazon.aps.iva.ob0.f.d(preview.getStartSeconds())), s.PREVIEW);
            } else {
                str4 = str9;
                str = str10;
                rVar3 = null;
            }
            SkipEvent recap = skipEvents.getRecap();
            if (recap != null) {
                TimeUnit timeUnit4 = TimeUnit.SECONDS;
                rVar4 = new r(timeUnit4.toMillis(com.amazon.aps.iva.ob0.f.d(recap.getEndSeconds())), timeUnit4.toMillis(com.amazon.aps.iva.ob0.f.d(recap.getStartSeconds())), s.RECAP);
            }
            tVar = new t(rVar, rVar2, rVar4, rVar3);
        } else {
            str = str10;
            str2 = str12;
            str3 = str11;
            l = l2;
            j = j2;
            str4 = str9;
            tVar = null;
        }
        String str14 = eVar.s;
        List<PlayableAssetVersion> list3 = eVar.w;
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
        for (PlayableAssetVersion playableAssetVersion : list3) {
            arrayList2.add(new com.amazon.aps.iva.qj.l(playableAssetVersion.getAssetId(), playableAssetVersion.isPremiumOnly(), playableAssetVersion.getAudioLocale(), playableAssetVersion.getOriginal(), 17));
        }
        String str15 = eVar.x;
        String str16 = eVar.y;
        Boolean bool6 = eVar.k;
        if (bool6 != null) {
            z3 = bool6.booleanValue();
        } else {
            z3 = false;
        }
        return new o(str5, str7, str6, tVar2, str8, str4, str, str2, num, str3, z3, z, z4, bool5, bool4, list, currentTimeMillis, j, l, arrayList, null, obj, str14, arrayList2, tVar, null, str15, str16, null, 1254293504, 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(com.crunchyroll.appwidgets.continuewatching.c r19, android.content.Context r20, com.amazon.aps.iva.ob0.d r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i.K(com.crunchyroll.appwidgets.continuewatching.c, android.content.Context, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r10, float r11, float r12, float r13, com.amazon.aps.iva.g1.c r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i.b(float, float, float, float, com.amazon.aps.iva.g1.c):long");
    }

    public static final long d(int i) {
        long j = i << 32;
        int i2 = com.amazon.aps.iva.f1.x.h;
        return j;
    }

    public static final long e(long j) {
        long j2 = (j & 4294967295L) << 32;
        int i = com.amazon.aps.iva.f1.x.h;
        return j2;
    }

    public static final long f(float f2, float f3) {
        long floatToIntBits = (Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32);
        int i = com.amazon.aps.iva.e1.a.c;
        return floatToIntBits;
    }

    public static final long g(float f2, float f3) {
        long floatToIntBits = (Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32);
        int i = com.amazon.aps.iva.o2.o.c;
        return floatToIntBits;
    }

    public static final void h(p pVar, Object obj, int i, Object obj2, com.amazon.aps.iva.o0.i iVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        com.amazon.aps.iva.o0.j g = iVar.g(1439843069);
        if ((i2 & 14) == 0) {
            if (g.H(pVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (g.H(obj)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 896) == 0) {
            if (g.c(i)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 7168) == 0) {
            if (g.H(obj2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) == 1170 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            ((com.amazon.aps.iva.x0.e) obj).f(obj2, com.amazon.aps.iva.v0.b.b(g, 980966366, new com.amazon.aps.iva.f0.n(pVar, i, obj2, i3)), g, 568);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new com.amazon.aps.iva.f0.o(pVar, obj, i, obj2, i2);
        }
    }

    public static final ArrayList i(Bundle bundle) {
        com.amazon.aps.iva.o2.g gVar;
        com.amazon.aps.iva.o2.g[] gVarArr = new com.amazon.aps.iva.o2.g[2];
        int i = bundle.getInt("appWidgetMinHeight", 0);
        int i2 = bundle.getInt("appWidgetMaxWidth", 0);
        com.amazon.aps.iva.o2.g gVar2 = null;
        if (i != 0 && i2 != 0) {
            gVar = new com.amazon.aps.iva.o2.g(f1.f(i2, i));
        } else {
            gVar = null;
        }
        gVarArr[0] = gVar;
        int i3 = bundle.getInt("appWidgetMaxHeight", 0);
        int i4 = bundle.getInt("appWidgetMinWidth", 0);
        if (i3 != 0 && i4 != 0) {
            gVar2 = new com.amazon.aps.iva.o2.g(f1.f(i4, i3));
        }
        gVarArr[1] = gVar2;
        return com.amazon.aps.iva.lb0.o.O(gVarArr);
    }

    public static final com.amazon.aps.iva.a1.f j(com.amazon.aps.iva.a1.f fVar, float f2) {
        boolean z;
        j.f(fVar, "<this>");
        if (f2 == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return androidx.compose.ui.graphics.a.b(fVar, 0.0f, 0.0f, f2, null, true, 126971);
        }
        return fVar;
    }

    public static void k(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public static final com.amazon.aps.iva.z.r m(double d2) {
        if (d2 < 0.0d) {
            return new com.amazon.aps.iva.z.r(0.0d, Math.sqrt(Math.abs(d2)));
        }
        return new com.amazon.aps.iva.z.r(Math.sqrt(d2), 0.0d);
    }

    public static final int n(float f2) {
        double floor;
        if (f2 >= 0.0f) {
            floor = Math.ceil(f2);
        } else {
            floor = Math.floor(f2);
        }
        return ((int) floor) * (-1);
    }

    public static final long o(long j, long j2) {
        boolean z;
        float f2;
        boolean z2;
        float f3;
        long a = com.amazon.aps.iva.f1.x.a(j, com.amazon.aps.iva.f1.x.f(j2));
        float d2 = com.amazon.aps.iva.f1.x.d(j2);
        float d3 = com.amazon.aps.iva.f1.x.d(a);
        float f4 = 1.0f - d3;
        float f5 = (d2 * f4) + d3;
        float h = com.amazon.aps.iva.f1.x.h(a);
        float h2 = com.amazon.aps.iva.f1.x.h(j2);
        float f6 = 0.0f;
        int i = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
        boolean z3 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = (((h2 * d2) * f4) + (h * d3)) / f5;
        }
        float g = com.amazon.aps.iva.f1.x.g(a);
        float g2 = com.amazon.aps.iva.f1.x.g(j2);
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f3 = 0.0f;
        } else {
            f3 = (((g2 * d2) * f4) + (g * d3)) / f5;
        }
        float e2 = com.amazon.aps.iva.f1.x.e(a);
        float e3 = com.amazon.aps.iva.f1.x.e(j2);
        if (i != 0) {
            z3 = false;
        }
        if (!z3) {
            f6 = (((e3 * d2) * f4) + (e2 * d3)) / f5;
        }
        return b(f2, f3, f6, f5, com.amazon.aps.iva.f1.x.f(j2));
    }

    public static long p(long j, d1 d1Var) {
        int i;
        int g;
        int j2;
        int h;
        j.f(d1Var, "orientation");
        d1 d1Var2 = d1.Horizontal;
        if (d1Var == d1Var2) {
            i = com.amazon.aps.iva.o2.a.j(j);
        } else {
            i = com.amazon.aps.iva.o2.a.i(j);
        }
        if (d1Var == d1Var2) {
            g = com.amazon.aps.iva.o2.a.h(j);
        } else {
            g = com.amazon.aps.iva.o2.a.g(j);
        }
        if (d1Var == d1Var2) {
            j2 = com.amazon.aps.iva.o2.a.i(j);
        } else {
            j2 = com.amazon.aps.iva.o2.a.j(j);
        }
        if (d1Var == d1Var2) {
            h = com.amazon.aps.iva.o2.a.g(j);
        } else {
            h = com.amazon.aps.iva.o2.a.h(j);
        }
        return com.amazon.aps.iva.o2.b.a(i, g, j2, h);
    }

    public static long q(long j, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = com.amazon.aps.iva.o2.a.j(j);
        }
        if ((i3 & 2) != 0) {
            i2 = com.amazon.aps.iva.o2.a.h(j);
        }
        int i5 = 0;
        if ((i3 & 4) != 0) {
            i4 = com.amazon.aps.iva.o2.a.i(j);
        } else {
            i4 = 0;
        }
        if ((i3 & 8) != 0) {
            i5 = com.amazon.aps.iva.o2.a.g(j);
        }
        return com.amazon.aps.iva.o2.b.a(i, i2, i4, i5);
    }

    public static /* synthetic */ com.amazon.aps.iva.es.j s(com.amazon.aps.iva.ls.a aVar, float f2, com.amazon.aps.iva.ks.e eVar, com.amazon.aps.iva.ks.g gVar, com.amazon.aps.iva.js.i iVar, com.amazon.aps.iva.is.a[] aVarArr, int i) {
        com.amazon.aps.iva.ks.e eVar2;
        com.amazon.aps.iva.ks.g gVar2;
        com.amazon.aps.iva.js.i iVar2;
        i iVar3 = d;
        if ((i & 4) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if ((i & 8) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i & 16) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        return iVar3.r(aVar, f2, eVar2, gVar2, iVar2, aVarArr);
    }

    public static com.amazon.aps.iva.ks.r t(i iVar, float f2, com.amazon.aps.iva.ks.e eVar, com.amazon.aps.iva.ks.g gVar, com.amazon.aps.iva.ks.a aVar, com.amazon.aps.iva.js.i iVar2, int i) {
        com.amazon.aps.iva.ks.e eVar2;
        com.amazon.aps.iva.ks.g gVar2;
        com.amazon.aps.iva.ks.a aVar2;
        com.amazon.aps.iva.js.i iVar3;
        if ((i & 4) != 0) {
            eVar2 = null;
        } else {
            eVar2 = eVar;
        }
        if ((i & 8) != 0) {
            gVar2 = null;
        } else {
            gVar2 = gVar;
        }
        if ((i & 16) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i & 32) != 0) {
            iVar3 = null;
        } else {
            iVar3 = iVar2;
        }
        iVar.getClass();
        a aVar3 = e;
        if (aVar3 != null) {
            return new com.amazon.aps.iva.ks.r(((Boolean) aVar3.invoke()).booleanValue(), f2, eVar2, null, gVar2, aVar2, iVar3);
        }
        j.m("isUserAuthenticated");
        throw null;
    }

    public static final String u(int i) {
        return c0.a("appWidget-", i);
    }

    public static com.amazon.aps.iva.vx.k v() {
        com.amazon.aps.iva.vx.k kVar = f;
        if (kVar != null) {
            return kVar;
        }
        j.m("dependencies");
        throw null;
    }

    public static final String w(Request request) {
        String method = request.method();
        HttpUrl url = request.url();
        RequestBody body = request.body();
        if (body != null && !j.a(body, Util.EMPTY_REQUEST)) {
            long contentLength = body.contentLength();
            MediaType contentType = body.contentType();
            return method + "•" + url + "•" + contentLength + "•" + contentType;
        }
        return method + "•" + url;
    }

    public static final long x(long j, long j2, float f2) {
        com.amazon.aps.iva.g1.l lVar = g.t;
        long a = com.amazon.aps.iva.f1.x.a(j, lVar);
        long a2 = com.amazon.aps.iva.f1.x.a(j2, lVar);
        float d2 = com.amazon.aps.iva.f1.x.d(a);
        float h = com.amazon.aps.iva.f1.x.h(a);
        float g = com.amazon.aps.iva.f1.x.g(a);
        float e2 = com.amazon.aps.iva.f1.x.e(a);
        float d3 = com.amazon.aps.iva.f1.x.d(a2);
        float h2 = com.amazon.aps.iva.f1.x.h(a2);
        float g2 = com.amazon.aps.iva.f1.x.g(a2);
        float e3 = com.amazon.aps.iva.f1.x.e(a2);
        return com.amazon.aps.iva.f1.x.a(b(b.Y(h, h2, f2), b.Y(g, g2, f2), b.Y(e2, e3, f2), b.Y(d2, d3, f2), lVar), com.amazon.aps.iva.f1.x.f(j2));
    }

    public static final float y(long j) {
        com.amazon.aps.iva.g1.c f2 = com.amazon.aps.iva.f1.x.f(j);
        if (com.amazon.aps.iva.g1.b.a(f2.b, com.amazon.aps.iva.g1.b.a)) {
            com.amazon.aps.iva.g1.m mVar = ((u) f2).p;
            double f3 = mVar.f(com.amazon.aps.iva.f1.x.h(j));
            double f4 = mVar.f(com.amazon.aps.iva.f1.x.e(j)) * 0.0722d;
            float f5 = (float) (f4 + (mVar.f(com.amazon.aps.iva.f1.x.g(j)) * 0.7152d) + (f3 * 0.2126d));
            float f6 = 0.0f;
            if (f5 > 0.0f) {
                f6 = 1.0f;
                if (f5 < 1.0f) {
                    return f5;
                }
            }
            return f6;
        }
        throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) com.amazon.aps.iva.g1.b.b(f2.b))).toString());
    }

    public static final com.amazon.aps.iva.e0.g0 z(com.amazon.aps.iva.o0.i iVar) {
        iVar.s(1470655220);
        e0.b bVar = e0.a;
        Object[] objArr = new Object[0];
        n nVar = com.amazon.aps.iva.e0.g0.u;
        iVar.s(511388516);
        boolean H = iVar.H(0) | iVar.H(0);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            t = new i0(0, 0);
            iVar.n(t);
        }
        iVar.G();
        com.amazon.aps.iva.e0.g0 g0Var = (com.amazon.aps.iva.e0.g0) A(objArr, nVar, (a) t, iVar, 4);
        iVar.G();
        return g0Var;
    }

    @Override // com.amazon.aps.iva.b0.j0
    public long a(com.amazon.aps.iva.p1.c cVar, com.amazon.aps.iva.p1.m mVar) {
        j.f(cVar, "$this$calculateMouseWheelScroll");
        com.amazon.aps.iva.e1.c cVar2 = new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.c.b);
        List<y> list = mVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            long j = cVar2.a;
            if (i < size) {
                i++;
                cVar2 = new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.c.f(j, list.get(i).j));
            } else {
                return com.amazon.aps.iva.e1.c.g(j, -cVar.P0(64));
            }
        }
    }

    @Override // com.amazon.aps.iva.lo.f
    public Object c(String str, com.amazon.aps.iva.ob0.d dVar) {
        return null;
    }

    public com.amazon.aps.iva.es.j r(com.amazon.aps.iva.ls.a aVar, float f2, com.amazon.aps.iva.ks.e eVar, com.amazon.aps.iva.ks.g gVar, com.amazon.aps.iva.js.i iVar, com.amazon.aps.iva.is.a... aVarArr) {
        j.f(aVar, "analyticsScreen");
        j.f(aVarArr, "properties");
        com.amazon.aps.iva.ak.b bVar = new com.amazon.aps.iva.ak.b(2);
        bVar.a(t(this, f2, eVar, gVar, null, iVar, 18));
        bVar.b(aVarArr);
        return new com.amazon.aps.iva.es.j(aVar, (com.amazon.aps.iva.is.a[]) bVar.d(new com.amazon.aps.iva.is.a[bVar.c()]));
    }

    @Override // com.amazon.aps.iva.de0.k
    public void lock() {
    }

    @Override // com.amazon.aps.iva.de0.k
    public void unlock() {
    }
}
