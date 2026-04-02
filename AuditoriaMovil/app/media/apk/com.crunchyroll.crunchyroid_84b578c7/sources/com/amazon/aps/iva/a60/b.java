package com.amazon.aps.iva.a60;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ee0.r1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.me.c;
import com.amazon.aps.iva.nd0.d;
import com.amazon.aps.iva.nd0.f;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.oe0.e;
import com.amazon.aps.iva.q.n;
import com.amazon.aps.iva.se0.b0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.l2;
import com.amazon.aps.iva.se0.m1;
import com.amazon.aps.iva.se0.q0;
import com.amazon.aps.iva.se0.u;
import com.amazon.aps.iva.sp.h;
import com.amazon.aps.iva.x.i;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.music.watch.screen.WatchMusicActivity;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.Ascii;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
/* compiled from: FragmentViewBindingDelegate.kt */
/* loaded from: classes2.dex */
public class b implements com.amazon.aps.iva.hi.a, h, com.amazon.aps.iva.ps.a {
    public static com.amazon.aps.iva.me.b b;
    public static c c;

    public static final FragmentViewBindingDelegate A(Fragment fragment, l lVar) {
        j.f(fragment, "<this>");
        j.f(lVar, "viewBindingFactory");
        return new FragmentViewBindingDelegate(fragment, lVar);
    }

    public static u e() {
        return new u(null);
    }

    public static m1 f() {
        return new m1(null);
    }

    public static final com.amazon.aps.iva.nd0.c g(d dVar, String str) {
        com.amazon.aps.iva.nd0.c h = dVar.b(f.h(str)).h();
        j.e(h, "child(Name.identifier(name)).toSafe()");
        return h;
    }

    public static final e h(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new e(matcher, charSequence);
    }

    public static final void i(AbstractCollection abstractCollection, Object obj) {
        if (obj != null) {
            abstractCollection.add(obj);
        }
    }

    public static final void j(g gVar, CancellationException cancellationException) {
        int i = j1.m0;
        j1 j1Var = (j1) gVar.get(j1.b.b);
        if (j1Var != null) {
            j1Var.a(cancellationException);
        }
    }

    public static final void k(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                k.f(th, th2);
            }
        }
    }

    public static final List l(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                arrayList.trimToSize();
                return arrayList;
            }
            return f1.J(x.t0(arrayList));
        }
        return z.b;
    }

    public static final void m(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException(n.a("toIndex (", i, ") is greater than size (", i2, ")."));
    }

    public static final com.amazon.aps.iva.ob0.d n(l lVar, com.amazon.aps.iva.ob0.d dVar) {
        j.f(lVar, "<this>");
        j.f(dVar, "completion");
        if (lVar instanceof com.amazon.aps.iva.qb0.a) {
            return ((com.amazon.aps.iva.qb0.a) lVar).create(dVar);
        }
        g context = dVar.getContext();
        if (context == com.amazon.aps.iva.ob0.h.b) {
            return new com.amazon.aps.iva.pb0.b(lVar, dVar);
        }
        return new com.amazon.aps.iva.pb0.c(dVar, context, lVar);
    }

    public static final com.amazon.aps.iva.ob0.d o(p pVar, Object obj, com.amazon.aps.iva.ob0.d dVar) {
        j.f(pVar, "<this>");
        j.f(dVar, "completion");
        if (pVar instanceof com.amazon.aps.iva.qb0.a) {
            return ((com.amazon.aps.iva.qb0.a) pVar).create(obj, dVar);
        }
        g context = dVar.getContext();
        if (context == com.amazon.aps.iva.ob0.h.b) {
            return new com.amazon.aps.iva.pb0.d(pVar, obj, dVar);
        }
        return new com.amazon.aps.iva.pb0.e(dVar, context, pVar, obj);
    }

    public static final void p(g gVar) {
        j1 j1Var = (j1) gVar.get(j1.b.b);
        if (j1Var != null && !j1Var.isActive()) {
            throw j1Var.p();
        }
    }

    public static final j1 q(g gVar) {
        int i = j1.m0;
        j1 j1Var = (j1) gVar.get(j1.b.b);
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + gVar).toString());
    }

    public static int r(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    byte b3 = bArr[i];
                    byte b4 = bArr[i + 1];
                    if (b2 > -12 || b3 > -65 || b4 > -65) {
                        return -1;
                    }
                    return ((b3 << 8) ^ b2) ^ (b4 << Ascii.DLE);
                }
                throw new AssertionError();
            }
            byte b5 = bArr[i];
            if (b2 > -12 || b5 > -65) {
                return -1;
            }
            return b2 ^ (b5 << 8);
        } else if (b2 > -12) {
            return -1;
        } else {
            return b2;
        }
    }

    public static final com.amazon.aps.iva.ob0.d s(com.amazon.aps.iva.ob0.d dVar) {
        com.amazon.aps.iva.qb0.c cVar;
        com.amazon.aps.iva.ob0.d<Object> intercepted;
        j.f(dVar, "<this>");
        if (dVar instanceof com.amazon.aps.iva.qb0.c) {
            cVar = (com.amazon.aps.iva.qb0.c) dVar;
        } else {
            cVar = null;
        }
        if (cVar != null && (intercepted = cVar.intercepted()) != null) {
            return intercepted;
        }
        return dVar;
    }

    public static final boolean t(g gVar) {
        int i = j1.m0;
        j1 j1Var = (j1) gVar.get(j1.b.b);
        if (j1Var != null && j1Var.isActive()) {
            return true;
        }
        return false;
    }

    public static int u(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i3 >= i2) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 < -16) {
                    if (i3 >= i2 - 1) {
                        return r(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                        i = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                } else if (i3 >= i2 - 2) {
                    return r(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    byte b4 = bArr[i3];
                    if (b4 <= -65) {
                        if ((((b4 + 112) + (b2 << Ascii.FS)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }

    public static final void v(q0 q0Var, com.amazon.aps.iva.ob0.d dVar, boolean z) {
        Object g;
        l2<?> l2Var;
        boolean y0;
        Object i = q0Var.i();
        Throwable f = q0Var.f(i);
        if (f != null) {
            g = com.amazon.aps.iva.ab.x.H(f);
        } else {
            g = q0Var.g(i);
        }
        if (z) {
            com.amazon.aps.iva.xe0.e eVar = (com.amazon.aps.iva.xe0.e) dVar;
            com.amazon.aps.iva.ob0.d<T> dVar2 = eVar.f;
            g context = dVar2.getContext();
            Object c2 = com.amazon.aps.iva.xe0.u.c(context, eVar.h);
            if (c2 != com.amazon.aps.iva.xe0.u.a) {
                l2Var = b0.c(dVar2, context, c2);
            } else {
                l2Var = null;
            }
            try {
                eVar.f.resumeWith(g);
                q qVar = q.a;
                if (l2Var != null) {
                    if (!y0) {
                        return;
                    }
                }
                return;
            } finally {
                if (l2Var == null || l2Var.y0()) {
                    com.amazon.aps.iva.xe0.u.a(context, c2);
                }
            }
        }
        dVar.resumeWith(g);
    }

    public static com.amazon.aps.iva.cd0.a w(r1 r1Var, boolean z, boolean z2, com.amazon.aps.iva.rc0.k kVar, int i) {
        boolean z3;
        boolean z4;
        Set set;
        if ((i & 1) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i & 2) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i & 4) != 0) {
            kVar = null;
        }
        j.f(r1Var, "<this>");
        if (kVar != null) {
            set = l1.H(kVar);
        } else {
            set = null;
        }
        return new com.amazon.aps.iva.cd0.a(r1Var, z4, z3, set, 34);
    }

    public static final Class x(ClassLoader classLoader, String str) {
        j.f(classLoader, "<this>");
        j.f(str, "fqName");
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final com.amazon.aps.iva.x.j y(i iVar) {
        j.g(iVar, "receiver$0");
        return new com.amazon.aps.iva.x.j(iVar);
    }

    public static final FragmentViewBindingDelegate z(androidx.fragment.app.g gVar, l lVar) {
        j.f(gVar, "<this>");
        j.f(lVar, "viewBindingFactory");
        return new FragmentViewBindingDelegate(gVar, lVar);
    }

    @Override // com.amazon.aps.iva.hi.b
    public void a(Context context, com.amazon.aps.iva.l50.c cVar) {
        j.f(context, "context");
        Intent intent = new Intent(context, WatchMusicActivity.class);
        j.e(intent.putExtra("WATCH_MUSIC_INPUT", cVar), "intent.putExtra(\"WATCH_MUSIC_INPUT\", this)");
        context.startActivity(intent);
    }

    @Override // com.amazon.aps.iva.ps.a
    public JsonObject b(InputStreamReader inputStreamReader) {
        JsonObject asJsonObject = JsonParser.parseReader(inputStreamReader).getAsJsonObject();
        j.e(asJsonObject, "parseReader(reader).asJsonObject");
        return asJsonObject;
    }

    @Override // com.amazon.aps.iva.hi.b
    public boolean c(com.amazon.aps.iva.fc0.d dVar) {
        return j.a(dVar, WatchMusicActivity.class);
    }

    @Override // com.amazon.aps.iva.hi.a
    public void d(Activity activity, com.amazon.aps.iva.l50.c cVar) {
        j.f(activity, "activity");
        Intent intent = new Intent(activity, WatchMusicActivity.class);
        j.e(intent.putExtra("WATCH_MUSIC_INPUT", cVar), "intent.putExtra(\"WATCH_MUSIC_INPUT\", this)");
        activity.startActivityForResult(intent, 0);
    }

    @Override // com.amazon.aps.iva.sp.h
    public String serialize(Object obj) {
        com.amazon.aps.iva.eq.b bVar = (com.amazon.aps.iva.eq.b) obj;
        j.f(bVar, "model");
        JsonObject jsonObject = new JsonObject();
        String str = bVar.a;
        if (str != null) {
            jsonObject.addProperty("id", str);
        }
        String str2 = bVar.b;
        if (str2 != null) {
            jsonObject.addProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        }
        String str3 = bVar.c;
        if (str3 != null) {
            jsonObject.addProperty(Scopes.EMAIL, str3);
        }
        for (Map.Entry<String, Object> entry : bVar.d.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!o.N(com.amazon.aps.iva.eq.b.e, key)) {
                jsonObject.add(key, i.I(value));
            }
        }
        String jsonElement = jsonObject.getAsJsonObject().toString();
        j.e(jsonElement, "model.toJson().asJsonObject.toString()");
        return jsonElement;
    }
}
