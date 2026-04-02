package com.amazon.aps.iva.ab;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.da.l;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ic0.k0;
import com.amazon.aps.iva.ic0.u0;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.m0.n0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.pe0.b;
import com.amazon.aps.iva.r4.a2;
import com.amazon.aps.iva.r4.c1;
import com.amazon.aps.iva.r4.o0;
import com.amazon.aps.iva.r4.y0;
import com.amazon.aps.iva.se0.e2;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.t3.j;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.yb0.h0;
import com.amazon.aps.iva.z.n1;
import com.amazon.aps.iva.z9.j0;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.primitives.Ints;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes.dex */
public /* synthetic */ class x implements com.amazon.aps.iva.sp.g, com.amazon.aps.iva.x90.a {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final com.amazon.aps.iva.xe0.s c = new com.amazon.aps.iva.xe0.s("NONE");
    public static final com.amazon.aps.iva.xe0.s d = new com.amazon.aps.iva.xe0.s("PENDING");

    public static final com.amazon.aps.iva.p4.n A(com.amazon.aps.iva.p4.n nVar, com.amazon.aps.iva.s4.j jVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "<this>");
        return nVar.d(new com.amazon.aps.iva.q4.b(jVar));
    }

    public static final void B(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        Intent putExtra = new Intent().putExtra("should_close_stack", true);
        com.amazon.aps.iva.yb0.j.e(putExtra, "Intent().putExtra(CLOSE_STACK_EXTRAS, true)");
        activity.setResult(-1, putExtra);
        activity.finish();
    }

    public static final long C(long j, int i) {
        int i2 = com.amazon.aps.iva.c2.z.c;
        int i3 = (int) (j >> 32);
        int j2 = com.amazon.aps.iva.aq.j.j(i3, 0, i);
        int j3 = com.amazon.aps.iva.aq.j.j(com.amazon.aps.iva.c2.z.c(j), 0, i);
        if (j2 == i3 && j3 == com.amazon.aps.iva.c2.z.c(j)) {
            return j;
        }
        return f(j2, j3);
    }

    public static n0 D(long j, com.amazon.aps.iva.o0.i iVar, int i) {
        long j2;
        iVar.s(1370708026);
        long j3 = 0;
        if ((i & 1) != 0) {
            e0.b bVar = com.amazon.aps.iva.o0.e0.a;
            j2 = ((com.amazon.aps.iva.m0.c0) iVar.i(com.amazon.aps.iva.m0.d0.a)).g();
        } else {
            j2 = 0;
        }
        if ((i & 2) != 0) {
            e0.b bVar2 = com.amazon.aps.iva.o0.e0.a;
            j = com.amazon.aps.iva.f1.x.b(((com.amazon.aps.iva.m0.c0) iVar.i(com.amazon.aps.iva.m0.d0.a)).e(), 0.6f);
        }
        long j4 = j;
        if ((i & 4) != 0) {
            e0.b bVar3 = com.amazon.aps.iva.o0.e0.a;
            j3 = com.amazon.aps.iva.f1.x.b(((com.amazon.aps.iva.m0.c0) iVar.i(com.amazon.aps.iva.m0.d0.a)).e(), com.amazon.aps.iva.hc.m.k(iVar));
        }
        long j5 = j3;
        e0.b bVar4 = com.amazon.aps.iva.o0.e0.a;
        com.amazon.aps.iva.f1.x xVar = new com.amazon.aps.iva.f1.x(j2);
        com.amazon.aps.iva.f1.x xVar2 = new com.amazon.aps.iva.f1.x(j4);
        com.amazon.aps.iva.f1.x xVar3 = new com.amazon.aps.iva.f1.x(j5);
        iVar.s(1618982084);
        boolean H = iVar.H(xVar) | iVar.H(xVar2) | iVar.H(xVar3);
        Object t = iVar.t();
        if (H || t == i.a.a) {
            t = new n0(j2, j4, j5);
            iVar.n(t);
        }
        iVar.G();
        n0 n0Var = (n0) t;
        iVar.G();
        return n0Var;
    }

    public static void E(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static final int F(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static com.amazon.aps.iva.uv.d G(com.amazon.aps.iva.zv.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "benefitsProvider");
        com.amazon.aps.iva.uv.e eVar = com.amazon.aps.iva.uv.e.h;
        com.amazon.aps.iva.yb0.j.f(eVar, "currentDate");
        return new com.amazon.aps.iva.uv.d(aVar, eVar);
    }

    public static final k.a H(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "exception");
        return new k.a(th);
    }

    public static void I() {
        if (com.amazon.aps.iva.t5.g0.a >= 18) {
            Trace.endSection();
        }
    }

    public static final long J(String str, int i, int i2, boolean z, boolean z2) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        if (i2 == 0) {
            return f(i, i);
        }
        if (i == 0) {
            if (z) {
                return f(com.amazon.aps.iva.e.z.v(0, str), 0);
            }
            return f(0, com.amazon.aps.iva.e.z.v(0, str));
        } else if (i == i2) {
            if (z) {
                return f(com.amazon.aps.iva.e.z.w(i2, str), i2);
            }
            return f(i2, com.amazon.aps.iva.e.z.w(i2, str));
        } else if (z) {
            if (!z2) {
                return f(com.amazon.aps.iva.e.z.w(i, str), i);
            }
            return f(com.amazon.aps.iva.e.z.v(i, str), i);
        } else if (!z2) {
            return f(i, com.amazon.aps.iva.e.z.v(i, str));
        } else {
            return f(i, com.amazon.aps.iva.e.z.w(i, str));
        }
    }

    public static final boolean K(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static String L(com.amazon.aps.iva.v4.h hVar) {
        StringBuilder sb = new StringBuilder(hVar.size());
        for (int i = 0; i < hVar.size(); i++) {
            byte b2 = hVar.b(i);
            if (b2 != 34) {
                if (b2 != 39) {
                    if (b2 != 92) {
                        switch (b2) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (b2 >= 32 && b2 <= 126) {
                                    sb.append((char) b2);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b2 >>> 6) & 3) + 48));
                                    sb.append((char) (((b2 >>> 3) & 7) + 48));
                                    sb.append((char) ((b2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.amazon.aps.iva.fc0.d M(com.amazon.aps.iva.fc0.e eVar) {
        com.amazon.aps.iva.oc0.e eVar2;
        boolean z;
        if (eVar instanceof com.amazon.aps.iva.fc0.d) {
            return (com.amazon.aps.iva.fc0.d) eVar;
        }
        if (eVar instanceof com.amazon.aps.iva.fc0.q) {
            List<com.amazon.aps.iva.fc0.p> upperBounds = ((com.amazon.aps.iva.fc0.q) eVar).getUpperBounds();
            Iterator<T> it = upperBounds.iterator();
            while (true) {
                eVar2 = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                com.amazon.aps.iva.fc0.p pVar = (com.amazon.aps.iva.fc0.p) next;
                com.amazon.aps.iva.yb0.j.d(pVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
                com.amazon.aps.iva.oc0.h k = ((k0) pVar).b.I0().k();
                if (k instanceof com.amazon.aps.iva.oc0.e) {
                    eVar2 = (com.amazon.aps.iva.oc0.e) k;
                }
                if (eVar2 != null && eVar2.getKind() != com.amazon.aps.iva.oc0.f.INTERFACE && eVar2.getKind() != com.amazon.aps.iva.oc0.f.ANNOTATION_CLASS) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    eVar2 = next;
                    break;
                }
            }
            com.amazon.aps.iva.fc0.p pVar2 = (com.amazon.aps.iva.fc0.p) eVar2;
            if (pVar2 == null) {
                pVar2 = (com.amazon.aps.iva.fc0.p) com.amazon.aps.iva.lb0.x.v0(upperBounds);
            }
            if (pVar2 != null) {
                return N(pVar2);
            }
            return com.amazon.aps.iva.yb0.e0.a(Object.class);
        }
        throw new com.amazon.aps.iva.wb0.a("Cannot calculate JVM erasure for type: " + eVar);
    }

    public static final com.amazon.aps.iva.fc0.d N(com.amazon.aps.iva.fc0.p pVar) {
        com.amazon.aps.iva.fc0.d M;
        com.amazon.aps.iva.yb0.j.f(pVar, "<this>");
        com.amazon.aps.iva.fc0.e b2 = pVar.b();
        if (b2 != null && (M = M(b2)) != null) {
            return M;
        }
        throw new com.amazon.aps.iva.wb0.a("Cannot calculate JVM erasure for type: " + pVar);
    }

    public static final LifecycleCoroutineScopeImpl O(com.amazon.aps.iva.i5.o oVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(oVar, "<this>");
        androidx.lifecycle.g lifecycle = oVar.getLifecycle();
        com.amazon.aps.iva.yb0.j.f(lifecycle, "<this>");
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl == null) {
                e2 a2 = com.amazon.aps.iva.se0.i.a();
                com.amazon.aps.iva.ye0.c cVar = r0.a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, a2.plus(com.amazon.aps.iva.xe0.k.a.C()));
                AtomicReference<Object> internalScopeRef = lifecycle.getInternalScopeRef();
                while (true) {
                    if (internalScopeRef.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                        z = true;
                        continue;
                        break;
                    } else if (internalScopeRef.get() != null) {
                        z = false;
                        continue;
                        break;
                    }
                }
                if (z) {
                    com.amazon.aps.iva.ye0.c cVar2 = r0.a;
                    com.amazon.aps.iva.se0.i.d(lifecycleCoroutineScopeImpl, com.amazon.aps.iva.xe0.k.a.C(), null, new androidx.lifecycle.h(lifecycleCoroutineScopeImpl, null), 2);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static final com.amazon.aps.iva.c2.b P(com.amazon.aps.iva.i2.e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        com.amazon.aps.iva.c2.b bVar = e0Var.a;
        bVar.getClass();
        long j = e0Var.b;
        return bVar.subSequence(com.amazon.aps.iva.c2.z.e(j), com.amazon.aps.iva.c2.z.d(j));
    }

    public static final com.amazon.aps.iva.c2.b Q(com.amazon.aps.iva.i2.e0 e0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        long j = e0Var.b;
        int d2 = com.amazon.aps.iva.c2.z.d(j);
        com.amazon.aps.iva.c2.b bVar = e0Var.a;
        return bVar.subSequence(d2, Math.min(com.amazon.aps.iva.c2.z.d(j) + i, bVar.b.length()));
    }

    public static final com.amazon.aps.iva.c2.b R(com.amazon.aps.iva.i2.e0 e0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(e0Var, "<this>");
        long j = e0Var.b;
        return e0Var.a.subSequence(Math.max(0, com.amazon.aps.iva.c2.z.e(j) - i), com.amazon.aps.iva.c2.z.e(j));
    }

    public static final com.amazon.aps.iva.oc0.h S(com.amazon.aps.iva.oc0.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "<this>");
        com.amazon.aps.iva.oc0.k d2 = kVar.d();
        if (d2 == null || (kVar instanceof com.amazon.aps.iva.oc0.f0)) {
            return null;
        }
        if (!(d2.d() instanceof com.amazon.aps.iva.oc0.f0)) {
            return S(d2);
        }
        if (!(d2 instanceof com.amazon.aps.iva.oc0.h)) {
            return null;
        }
        return (com.amazon.aps.iva.oc0.h) d2;
    }

    public static final Object T(com.amazon.aps.iva.de0.i iVar, com.amazon.aps.iva.fc0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "p");
        return iVar.invoke();
    }

    public static final void U(com.amazon.aps.iva.o0.i iVar, com.amazon.aps.iva.xb0.p pVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "composer");
        com.amazon.aps.iva.yb0.j.f(pVar, "composable");
        h0.e(2, pVar);
        pVar.invoke(iVar, 1);
    }

    public static boolean V(View view, ViewGroup viewGroup) {
        while (view != null) {
            if (view == viewGroup) {
                return true;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }

    public static final boolean W(com.amazon.aps.iva.oc0.n0 n0Var) {
        com.amazon.aps.iva.yb0.j.f(n0Var, "<this>");
        if (n0Var.getGetter() == null) {
            return true;
        }
        return false;
    }

    public static final boolean X(String str, int i) {
        char charAt = str.charAt(i);
        if ('A' <= charAt && charAt < '[') {
            return true;
        }
        return false;
    }

    public static final boolean Y(char c2) {
        if (!Character.isWhitespace(c2) && !Character.isSpaceChar(c2)) {
            return false;
        }
        return true;
    }

    public static final j0 Z(Context context, com.amazon.aps.iva.da.l lVar, final String str, boolean z) {
        if (lVar instanceof l.e) {
            if (com.amazon.aps.iva.yb0.j.a(str, "__LottieInternalDefaultCacheKey__")) {
                int i = ((l.e) lVar).a;
                return com.amazon.aps.iva.z9.p.e(context, i, com.amazon.aps.iva.z9.p.j(i, context));
            }
            return com.amazon.aps.iva.z9.p.e(context, ((l.e) lVar).a, str);
        } else if (lVar instanceof l.f) {
            if (com.amazon.aps.iva.yb0.j.a(str, "__LottieInternalDefaultCacheKey__")) {
                ((l.f) lVar).getClass();
                return com.amazon.aps.iva.z9.p.a("url_null", new com.amazon.aps.iva.z9.i(context, null, "url_null"));
            }
            ((l.f) lVar).getClass();
            return com.amazon.aps.iva.z9.p.a(str, new com.amazon.aps.iva.z9.i(context, null, str));
        } else if (lVar instanceof l.c) {
            if (z) {
                return null;
            }
            ((l.c) lVar).getClass();
            new FileInputStream((String) null);
            com.amazon.aps.iva.oe0.m.Y(null, "zip", false);
            throw null;
        } else if (lVar instanceof l.a) {
            if (com.amazon.aps.iva.yb0.j.a(str, "__LottieInternalDefaultCacheKey__")) {
                ((l.a) lVar).getClass();
                HashMap hashMap = com.amazon.aps.iva.z9.p.a;
                return com.amazon.aps.iva.z9.p.a("asset_null", new com.amazon.aps.iva.z9.n(context.getApplicationContext(), null, "asset_null"));
            }
            ((l.a) lVar).getClass();
            HashMap hashMap2 = com.amazon.aps.iva.z9.p.a;
            return com.amazon.aps.iva.z9.p.a(str, new com.amazon.aps.iva.z9.n(context.getApplicationContext(), null, str));
        } else if (lVar instanceof l.d) {
            if (!com.amazon.aps.iva.yb0.j.a(str, "__LottieInternalDefaultCacheKey__")) {
                ((l.d) lVar).getClass();
                return com.amazon.aps.iva.z9.p.a(str, new Callable() { // from class: com.amazon.aps.iva.z9.m
                    public final /* synthetic */ String a = null;

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        com.amazon.aps.iva.ef0.x b2 = com.amazon.aps.iva.ef0.r.b(com.amazon.aps.iva.ef0.r.f(new ByteArrayInputStream(this.a.getBytes())));
                        String[] strArr = com.amazon.aps.iva.la.c.f;
                        return p.d(new com.amazon.aps.iva.la.d(b2), str, true);
                    }
                });
            }
            ((l.d) lVar).getClass();
            throw null;
        } else if (lVar instanceof l.b) {
            ContentResolver contentResolver = context.getContentResolver();
            ((l.b) lVar).getClass();
            InputStream openInputStream = contentResolver.openInputStream(null);
            if (!com.amazon.aps.iva.yb0.j.a(str, "__LottieInternalDefaultCacheKey__")) {
                return com.amazon.aps.iva.z9.p.a(str, new com.amazon.aps.iva.z9.j(openInputStream, str));
            }
            throw null;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
    }

    public static final File a0(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return com.amazon.aps.iva.e.w.y(context, com.amazon.aps.iva.yb0.j.k(".preferences_pb", str));
    }

    public static final byte[] b0(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        E(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        com.amazon.aps.iva.yb0.j.e(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static final com.amazon.aps.iva.oc0.e c0(com.amazon.aps.iva.oc0.c0 c0Var, com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.wc0.d dVar) {
        com.amazon.aps.iva.oc0.e eVar;
        com.amazon.aps.iva.oc0.h hVar;
        com.amazon.aps.iva.xd0.i Q;
        com.amazon.aps.iva.yb0.j.f(c0Var, "<this>");
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        com.amazon.aps.iva.yb0.j.f(dVar, "lookupLocation");
        if (cVar.d()) {
            return null;
        }
        com.amazon.aps.iva.nd0.c e = cVar.e();
        com.amazon.aps.iva.yb0.j.e(e, "fqName.parent()");
        com.amazon.aps.iva.xd0.i l = c0Var.y(e).l();
        com.amazon.aps.iva.nd0.f f = cVar.f();
        com.amazon.aps.iva.yb0.j.e(f, "fqName.shortName()");
        com.amazon.aps.iva.oc0.h g = l.g(f, dVar);
        if (g instanceof com.amazon.aps.iva.oc0.e) {
            eVar = (com.amazon.aps.iva.oc0.e) g;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        com.amazon.aps.iva.nd0.c e2 = cVar.e();
        com.amazon.aps.iva.yb0.j.e(e2, "fqName.parent()");
        com.amazon.aps.iva.oc0.e c0 = c0(c0Var, e2, dVar);
        if (c0 != null && (Q = c0.Q()) != null) {
            com.amazon.aps.iva.nd0.f f2 = cVar.f();
            com.amazon.aps.iva.yb0.j.e(f2, "fqName.shortName()");
            hVar = Q.g(f2, dVar);
        } else {
            hVar = null;
        }
        if (!(hVar instanceof com.amazon.aps.iva.oc0.e)) {
            return null;
        }
        return (com.amazon.aps.iva.oc0.e) hVar;
    }

    public static com.amazon.aps.iva.z.b d(float f) {
        return new com.amazon.aps.iva.z.b(Float.valueOf(f), n1.a, Float.valueOf(0.01f), 8);
    }

    public static final String d0(com.amazon.aps.iva.gr.l lVar, Object obj) {
        com.amazon.aps.iva.yb0.j.f(lVar, "interactionPredicate");
        com.amazon.aps.iva.yb0.j.f(obj, "target");
        lVar.p(obj);
        return "";
    }

    public static final v0 e(Object obj) {
        if (obj == null) {
            obj = com.amazon.aps.iva.gr.n.d;
        }
        return new v0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[Catch: NotFoundException -> 0x002e, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x002e, blocks: (B:3:0x0006, B:11:0x001f, B:6:0x0011, B:9:0x0019), top: B:15:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String e0(int r4) {
        /*
            java.lang.String r0 = "0x"
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            r2 = 16
            java.lang.ref.WeakReference<android.content.Context> r3 = com.amazon.aps.iva.lp.a.e     // Catch: android.content.res.Resources.NotFoundException -> L2e
            java.lang.Object r3 = r3.get()     // Catch: android.content.res.Resources.NotFoundException -> L2e
            android.content.Context r3 = (android.content.Context) r3     // Catch: android.content.res.Resources.NotFoundException -> L2e
            if (r3 != 0) goto L11
            goto L17
        L11:
            android.content.res.Resources r3 = r3.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L2e
            if (r3 != 0) goto L19
        L17:
            r3 = 0
            goto L1d
        L19:
            java.lang.String r3 = r3.getResourceEntryName(r4)     // Catch: android.content.res.Resources.NotFoundException -> L2e
        L1d:
            if (r3 != 0) goto L3c
            x(r2)     // Catch: android.content.res.Resources.NotFoundException -> L2e
            java.lang.String r3 = java.lang.Integer.toString(r4, r2)     // Catch: android.content.res.Resources.NotFoundException -> L2e
            com.amazon.aps.iva.yb0.j.e(r3, r1)     // Catch: android.content.res.Resources.NotFoundException -> L2e
            java.lang.String r3 = r0.concat(r3)     // Catch: android.content.res.Resources.NotFoundException -> L2e
            goto L3c
        L2e:
            x(r2)
            java.lang.String r4 = java.lang.Integer.toString(r4, r2)
            com.amazon.aps.iva.yb0.j.e(r4, r1)
            java.lang.String r3 = r0.concat(r4)
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ab.x.e0(int):java.lang.String");
    }

    public static final long f(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 < 0) {
                z2 = false;
            }
            if (z2) {
                long j = (i2 & 4294967295L) | (i << 32);
                int i3 = com.amazon.aps.iva.c2.z.c;
                return j;
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }

    public static final int f0(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((com.amazon.aps.iva.o0.c) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int h = com.amazon.aps.iva.yb0.j.h(i5, i);
            if (h < 0) {
                i3 = i4 + 1;
            } else if (h > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final boolean g(int i, int[] iArr) {
        if ((iArr[(i * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public static final void g0(TextView textView, TypedArray typedArray, int i, int i2) {
        com.amazon.aps.iva.yb0.j.f(textView, "<this>");
        com.amazon.aps.iva.yb0.j.f(typedArray, "typedArray");
        int resourceId = typedArray.getResourceId(i, -1);
        if (resourceId != -1) {
            i2 = resourceId;
        }
        textView.setText(i2);
    }

    public static final int h(int i, int[] iArr) {
        return iArr[(i * 5) + 4];
    }

    public static final String h0(View view) {
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            return view.getClass().getSimpleName();
        }
        return canonicalName;
    }

    public static final String i(String str) {
        boolean z;
        if (str != null && !com.amazon.aps.iva.oe0.m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        if (!com.amazon.aps.iva.oe0.q.k0(str, '/')) {
            return com.amazon.aps.iva.yb0.j.k("/", str);
        }
        return str;
    }

    public static final void i0(Object obj) {
        if (!(obj instanceof k.a)) {
            return;
        }
        throw ((k.a) obj).b;
    }

    public static final String j(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        com.amazon.aps.iva.yb0.j.e(parameterTypes, "parameterTypes");
        sb.append(com.amazon.aps.iva.lb0.o.V(parameterTypes, "", "(", ")", u0.h, 24));
        Class<?> returnType = method.getReturnType();
        com.amazon.aps.iva.yb0.j.e(returnType, "returnType");
        sb.append(com.amazon.aps.iva.uc0.d.b(returnType));
        return sb.toString();
    }

    public static String j0(int i) {
        return com.amazon.aps.iva.t5.g0.o("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }

    public static final int k(int i, int[] iArr) {
        return iArr[(i * 5) + 3];
    }

    public static final com.amazon.aps.iva.xg.a k0(PlayableAsset playableAsset) {
        Episode episode;
        com.amazon.aps.iva.yb0.j.f(playableAsset, "<this>");
        String id = playableAsset.getId();
        String parentId = playableAsset.getParentId();
        com.amazon.aps.iva.x50.t parentType = playableAsset.getParentType();
        String str = null;
        if (playableAsset instanceof Episode) {
            episode = (Episode) playableAsset;
        } else {
            episode = null;
        }
        if (episode != null) {
            str = episode.getSeasonId();
        }
        return new com.amazon.aps.iva.xg.a(id, parentId, parentType, str);
    }

    public static final boolean l(int i, int[] iArr) {
        if ((iArr[(i * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static final com.amazon.aps.iva.xg.a l0(PlayableAsset playableAsset, PlayableAssetVersion playableAssetVersion) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "<this>");
        com.amazon.aps.iva.yb0.j.f(playableAssetVersion, "version");
        return new com.amazon.aps.iva.xg.a(playableAssetVersion.getAssetId(), playableAsset.getParentId(), playableAsset.getParentType(), playableAssetVersion.getSeasonId());
    }

    public static final boolean m(int i, int[] iArr) {
        if ((iArr[(i * 5) + 1] & Ints.MAX_POWER_OF_TWO) != 0) {
            return true;
        }
        return false;
    }

    public static final com.amazon.aps.iva.pe0.a m0(Iterable iterable) {
        com.amazon.aps.iva.pe0.a aVar;
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        if (iterable instanceof com.amazon.aps.iva.pe0.a) {
            aVar = (com.amazon.aps.iva.pe0.a) iterable;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return p0(iterable);
        }
        return aVar;
    }

    public static final int n(ArrayList arrayList, int i, int i2) {
        int f0 = f0(arrayList, i, i2);
        if (f0 < 0) {
            return -(f0 + 1);
        }
        return f0;
    }

    public static final String n0(String str) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "builder.toString()");
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(android.content.Context r14, com.amazon.aps.iva.da.l r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.amazon.aps.iva.ob0.d r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ab.x.o(android.content.Context, com.amazon.aps.iva.da.l, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final void o0(com.amazon.aps.iva.p1.m mVar, long j, com.amazon.aps.iva.xb0.l lVar, boolean z) {
        MotionEvent motionEvent;
        com.amazon.aps.iva.p1.h hVar = mVar.b;
        if (hVar != null) {
            motionEvent = hVar.b.b;
        } else {
            motionEvent = null;
        }
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (z) {
                motionEvent.setAction(3);
            }
            motionEvent.offsetLocation(-com.amazon.aps.iva.e1.c.c(j), -com.amazon.aps.iva.e1.c.d(j));
            lVar.invoke(motionEvent);
            motionEvent.offsetLocation(com.amazon.aps.iva.e1.c.c(j), com.amazon.aps.iva.e1.c.d(j));
            motionEvent.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.".toString());
    }

    public static final int p(int i, int[] iArr) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final com.amazon.aps.iva.pe0.b p0(Iterable iterable) {
        com.amazon.aps.iva.pe0.b bVar;
        b.a aVar;
        com.amazon.aps.iva.pe0.b build;
        com.amazon.aps.iva.yb0.j.f(iterable, "<this>");
        com.amazon.aps.iva.pe0.b bVar2 = null;
        if (iterable instanceof com.amazon.aps.iva.pe0.b) {
            bVar = (com.amazon.aps.iva.pe0.b) iterable;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            if (iterable instanceof b.a) {
                aVar = (b.a) iterable;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                bVar2 = aVar.build();
            }
            if (bVar2 == null) {
                com.amazon.aps.iva.qe0.h hVar = com.amazon.aps.iva.qe0.h.c;
                com.amazon.aps.iva.yb0.j.f(hVar, "<this>");
                if (iterable instanceof Collection) {
                    build = hVar.d((Collection) iterable);
                } else {
                    com.amazon.aps.iva.qe0.d e = hVar.e();
                    com.amazon.aps.iva.lb0.t.d0(e, iterable);
                    build = e.build();
                }
                return build;
            }
            return bVar2;
        }
        return bVar;
    }

    public static final int q(int i, int[] iArr) {
        int i2 = i * 5;
        return F(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void q0(RemoteViews remoteViews, a2 a2Var, com.amazon.aps.iva.t4.a aVar) {
        int i;
        com.amazon.aps.iva.yb0.j.f(remoteViews, "<this>");
        com.amazon.aps.iva.yb0.j.f(aVar, "element");
        com.amazon.aps.iva.r4.n0 b2 = y0.b(remoteViews, a2Var, c1.List, aVar.d);
        if (!a2Var.f) {
            Intent intent = new Intent();
            Context context = a2Var.a;
            boolean z = false;
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 167772168);
            int i2 = b2.a;
            remoteViews.setPendingIntentTemplate(i2, activity);
            j.c.a aVar2 = new j.c.a();
            a2 f = a2Var.f(i2);
            Iterator it = aVar.c.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    com.amazon.aps.iva.p4.i iVar = (com.amazon.aps.iva.p4.i) next;
                    com.amazon.aps.iva.yb0.j.d(iVar, "null cannot be cast to non-null type androidx.glance.appwidget.lazy.EmittableLazyListItem");
                    com.amazon.aps.iva.t4.c cVar = (com.amazon.aps.iva.t4.c) iVar;
                    a2 g = f.g(i3);
                    List J = f1.J(iVar);
                    o0 o0Var = a2Var.d;
                    if (o0Var != null) {
                        i = o0Var.a(iVar);
                    } else {
                        i = -1;
                    }
                    RemoteViews q = com.amazon.aps.iva.n1.c.q(g, J, i);
                    aVar2.a.add(0L);
                    aVar2.b.add(q);
                    z = true;
                    i3 = i4;
                } else {
                    f1.S();
                    throw null;
                }
            }
            aVar2.c = z;
            aVar2.d = y0.c;
            com.amazon.aps.iva.t3.j.a(context, remoteViews, a2Var.b, i2, aVar2.a());
            com.amazon.aps.iva.r4.d.a(a2Var.c(), remoteViews, aVar.d, b2);
            return;
        }
        throw new IllegalStateException("Glance does not support nested list views.".toString());
    }

    public static final void r(int i, int i2, int[] iArr) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.o0.e0.f(z);
        iArr[(i * 5) + 3] = i2;
    }

    public static final void r0(MessageDigest messageDigest, int i) {
        com.amazon.aps.iva.yb0.j.g(messageDigest, "receiver$0");
        messageDigest.update((byte) (i >>> 24));
        messageDigest.update((byte) (i >>> 16));
        messageDigest.update((byte) (i >>> 8));
        messageDigest.update((byte) i);
    }

    public static final void s(int i, int i2, int[] iArr) {
        boolean z;
        if (i2 >= 0 && i2 < 67108863) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.o0.e0.f(z);
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final void s0(MessageDigest messageDigest, byte[] bArr) {
        com.amazon.aps.iva.yb0.j.g(messageDigest, "receiver$0");
        r0(messageDigest, bArr.length);
        messageDigest.update(bArr);
    }

    public static final com.amazon.aps.iva.ti.a t(androidx.lifecycle.p pVar, String str, Serializable serializable, com.amazon.aps.iva.se0.g0 g0Var) {
        com.amazon.aps.iva.yb0.j.f(pVar, "<this>");
        return new com.amazon.aps.iva.ti.a(str, pVar, serializable, g0Var);
    }

    public static final Object t0(com.amazon.aps.iva.ob0.g gVar, Object obj, Object obj2, com.amazon.aps.iva.xb0.p pVar, com.amazon.aps.iva.ob0.d dVar) {
        Object c2 = com.amazon.aps.iva.xe0.u.c(gVar, obj2);
        try {
            com.amazon.aps.iva.we0.s sVar = new com.amazon.aps.iva.we0.s(dVar, gVar);
            h0.e(2, pVar);
            Object invoke = pVar.invoke(obj, sVar);
            com.amazon.aps.iva.xe0.u.a(gVar, c2);
            if (invoke == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                com.amazon.aps.iva.yb0.j.f(dVar, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            com.amazon.aps.iva.xe0.u.a(gVar, c2);
            throw th;
        }
    }

    public static void u(String str) {
        if (com.amazon.aps.iva.t5.g0.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String v(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        char c2;
        Object[] objArr = new Object[5];
        objArr[0] = b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        if (z) {
            c2 = 'H';
        } else {
            c2 = 'L';
        }
        objArr[3] = Character.valueOf(c2);
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(com.amazon.aps.iva.t5.g0.o("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static final String w(String str) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (z2) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
        return str;
    }

    public static final void x(int i) {
        if (new com.amazon.aps.iva.ec0.j(2, 36).j(i)) {
            return;
        }
        StringBuilder d2 = com.amazon.aps.iva.e4.e.d("radix ", i, " was not in valid range ");
        d2.append(new com.amazon.aps.iva.ec0.j(2, 36));
        throw new IllegalArgumentException(d2.toString());
    }

    public static final void y(long j, com.amazon.aps.iva.b0.f0 f0Var) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "orientation");
        boolean z = true;
        if (f0Var == com.amazon.aps.iva.b0.f0.Vertical) {
            if (com.amazon.aps.iva.o2.a.g(j) == Integer.MAX_VALUE) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
            return;
        }
        if (com.amazon.aps.iva.o2.a.h(j) == Integer.MAX_VALUE) {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
    }

    public static int z(Context context, String str) {
        boolean z;
        int c2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d2 = com.amazon.aps.iva.c3.g.d(str);
        if (d2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && com.amazon.aps.iva.o3.b.a(packageName2, packageName)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c3 = com.amazon.aps.iva.c3.h.c(context);
                    c2 = com.amazon.aps.iva.c3.h.a(c3, d2, Binder.getCallingUid(), packageName);
                    if (c2 == 0) {
                        c2 = com.amazon.aps.iva.c3.h.a(c3, d2, myUid, com.amazon.aps.iva.c3.h.b(context));
                    }
                } else {
                    c2 = com.amazon.aps.iva.c3.g.c((AppOpsManager) com.amazon.aps.iva.c3.g.a(context, AppOpsManager.class), d2, packageName);
                }
            } else {
                c2 = com.amazon.aps.iva.c3.g.c((AppOpsManager) com.amazon.aps.iva.c3.g.a(context, AppOpsManager.class), d2, packageName);
            }
            if (c2 != 0) {
                return -2;
            }
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.x90.a
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.amazon.aps.iva.sp.g
    public com.amazon.aps.iva.sp.c b() {
        return new com.amazon.aps.iva.sp.e();
    }

    @Override // com.amazon.aps.iva.x90.a
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.amazon.aps.iva.sp.g
    public com.amazon.aps.iva.sp.b getReader() {
        return new com.amazon.aps.iva.aq.j();
    }
}
