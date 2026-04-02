package com.amazon.aps.iva.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.h2.e0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.v1;
import com.amazon.aps.iva.s1.q0;
import com.amazon.aps.iva.se0.e2;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.v1.t1;
import com.amazon.aps.iva.x6.d0;
import com.amazon.aps.iva.x6.f0;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* loaded from: classes.dex */
public final class z implements com.amazon.aps.iva.gr.q, e0, com.amazon.aps.iva.v90.i, com.amazon.aps.iva.x6.p, com.amazon.aps.iva.xn.a {
    public static final z b = new z();
    public static final Object[] c = new Object[0];
    public static Method d;
    public static Method e;
    public static int f;
    public static volatile com.amazon.aps.iva.ja.f g;
    public static volatile com.amazon.aps.iva.ja.e h;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0195, code lost:
        if (r0.equals("video/mp2t") == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e.z.A(java.lang.String):int");
    }

    public static int B(Map map) {
        String str;
        List list = (List) map.get(HttpHeaders.CONTENT_TYPE);
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        } else {
            str = null;
        }
        return A(str);
    }

    public static int C(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (!lastPathSegment.endsWith(".avi")) {
                                                        return -1;
                                                    }
                                                    return 16;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static final boolean D(float[] fArr, float[] fArr2) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(fArr, "$this$invertTo");
        com.amazon.aps.iva.yb0.j.f(fArr2, "other");
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        float f31 = 1.0f / f30;
        fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
        fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
        fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
        fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
        float f32 = -f6;
        fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
        fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
        float f33 = -f14;
        fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
        fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
        fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
        fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
        fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
        fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
        fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
        fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
        fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
        fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        return true;
    }

    public static final boolean E(g0 g0Var) {
        com.amazon.aps.iva.ob0.g coroutineContext = g0Var.getCoroutineContext();
        int i = j1.m0;
        j1 j1Var = (j1) coroutineContext.get(j1.b.b);
        if (j1Var != null) {
            return j1Var.isActive();
        }
        return true;
    }

    public static final boolean F(long j) {
        com.amazon.aps.iva.o2.n[] nVarArr = com.amazon.aps.iva.o2.m.b;
        if ((j & 1095216660480L) == 0) {
            return true;
        }
        return false;
    }

    public static androidx.lifecycle.c G(com.amazon.aps.iva.xb0.p pVar) {
        return new androidx.lifecycle.c(com.amazon.aps.iva.ob0.h.b, 5000L, pVar);
    }

    public static final ArrayList H(Map map, com.amazon.aps.iva.xb0.l lVar) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (((com.amazon.aps.iva.g8.e) entry.getValue()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            if (((Boolean) lVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final v1 I(float f2) {
        int i = com.amazon.aps.iva.o0.b.a;
        return new v1(f2);
    }

    public static final com.amazon.aps.iva.z.p J(com.amazon.aps.iva.z.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "<this>");
        com.amazon.aps.iva.z.p c2 = pVar.c();
        com.amazon.aps.iva.yb0.j.d(c2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c2;
    }

    public static final com.amazon.aps.iva.a1.f K(com.amazon.aps.iva.a1.f fVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        t1.a aVar = t1.a;
        return fVar.o(new q0(lVar));
    }

    public static final long L(long j, float f2) {
        long floatToIntBits = j | (Float.floatToIntBits(f2) & 4294967295L);
        com.amazon.aps.iva.o2.n[] nVarArr = com.amazon.aps.iva.o2.m.b;
        return floatToIntBits;
    }

    public static void M(Bundle bundle, String str, com.amazon.aps.iva.q5.j jVar) {
        if (com.amazon.aps.iva.t5.g0.a >= 18) {
            bundle.putBinder(str, jVar);
            return;
        }
        Method method = e;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                e = method2;
                method2.setAccessible(true);
                method = e;
            } catch (NoSuchMethodException e2) {
                com.amazon.aps.iva.t5.p.a("Failed to retrieve putIBinder method", e2);
                com.amazon.aps.iva.t5.p.f();
                return;
            }
        }
        try {
            method.invoke(bundle, str, jVar);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            com.amazon.aps.iva.t5.p.a("Failed to invoke putIBinder via reflection", e3);
            com.amazon.aps.iva.t5.p.f();
        }
    }

    public static final Resources N(com.amazon.aps.iva.o0.i iVar) {
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        iVar.i(androidx.compose.ui.platform.d.a);
        Resources resources = ((Context) iVar.i(androidx.compose.ui.platform.d.b)).getResources();
        com.amazon.aps.iva.yb0.j.e(resources, "LocalContext.current.resources");
        return resources;
    }

    public static final void O(View view, v vVar) {
        com.amazon.aps.iva.yb0.j.f(view, "<this>");
        com.amazon.aps.iva.yb0.j.f(vVar, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, vVar);
    }

    public static final void P(Matrix matrix, float[] fArr) {
        com.amazon.aps.iva.yb0.j.f(fArr, "$this$setFrom");
        com.amazon.aps.iva.yb0.j.f(matrix, "matrix");
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final Object[] Q(Collection collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "collection");
        int size = collection.size();
        Object[] objArr = c;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (it.hasNext()) {
                            int i3 = ((i2 * 3) + 1) >>> 1;
                            if (i3 <= i2) {
                                i3 = 2147483645;
                                if (i2 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i3);
                            com.amazon.aps.iva.yb0.j.e(objArr2, "copyOf(result, newSize)");
                        } else {
                            return objArr2;
                        }
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr2, i2);
                        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i = i2;
                }
            } else {
                return objArr;
            }
        } else {
            return objArr;
        }
    }

    public static final Object[] R(Collection collection, Object[] objArr) {
        Object[] objArr2;
        com.amazon.aps.iva.yb0.j.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            com.amazon.aps.iva.yb0.j.d(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                com.amazon.aps.iva.yb0.j.e(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }

    public static final long S(long j, long j2) {
        boolean z;
        int d2;
        int e2;
        int i;
        boolean z2;
        boolean z3;
        int e3 = com.amazon.aps.iva.c2.z.e(j);
        int d3 = com.amazon.aps.iva.c2.z.d(j);
        boolean z4 = true;
        if (com.amazon.aps.iva.c2.z.e(j2) < com.amazon.aps.iva.c2.z.d(j) && com.amazon.aps.iva.c2.z.e(j) < com.amazon.aps.iva.c2.z.d(j2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (com.amazon.aps.iva.c2.z.e(j2) <= com.amazon.aps.iva.c2.z.e(j) && com.amazon.aps.iva.c2.z.d(j) <= com.amazon.aps.iva.c2.z.d(j2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                e3 = com.amazon.aps.iva.c2.z.e(j2);
                d3 = e3;
            } else {
                if (com.amazon.aps.iva.c2.z.e(j) <= com.amazon.aps.iva.c2.z.e(j2) && com.amazon.aps.iva.c2.z.d(j2) <= com.amazon.aps.iva.c2.z.d(j)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    d2 = com.amazon.aps.iva.c2.z.d(j2);
                    e2 = com.amazon.aps.iva.c2.z.e(j2);
                    i = d2 - e2;
                } else {
                    int e4 = com.amazon.aps.iva.c2.z.e(j2);
                    if (e3 >= com.amazon.aps.iva.c2.z.d(j2) || e4 > e3) {
                        z4 = false;
                    }
                    if (z4) {
                        e3 = com.amazon.aps.iva.c2.z.e(j2);
                        i = com.amazon.aps.iva.c2.z.d(j2) - com.amazon.aps.iva.c2.z.e(j2);
                    } else {
                        d3 = com.amazon.aps.iva.c2.z.e(j2);
                    }
                }
            }
            return com.amazon.aps.iva.ab.x.f(e3, d3);
        }
        if (d3 > com.amazon.aps.iva.c2.z.e(j2)) {
            e3 -= com.amazon.aps.iva.c2.z.d(j2) - com.amazon.aps.iva.c2.z.e(j2);
            d2 = com.amazon.aps.iva.c2.z.d(j2);
            e2 = com.amazon.aps.iva.c2.z.e(j2);
            i = d2 - e2;
        }
        return com.amazon.aps.iva.ab.x.f(e3, d3);
        d3 -= i;
        return com.amazon.aps.iva.ab.x.f(e3, d3);
    }

    public static final CancellationException h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final com.amazon.aps.iva.xe0.d i(com.amazon.aps.iva.ob0.g gVar) {
        if (gVar.get(j1.b.b) == null) {
            gVar = gVar.plus(com.amazon.aps.iva.a60.b.f());
        }
        return new com.amazon.aps.iva.xe0.d(gVar);
    }

    public static final com.amazon.aps.iva.xe0.d j() {
        e2 a = com.amazon.aps.iva.se0.i.a();
        com.amazon.aps.iva.ye0.c cVar = r0.a;
        return new com.amazon.aps.iva.xe0.d(a.plus(com.amazon.aps.iva.xe0.k.a));
    }

    public static final long k(float f2, boolean z) {
        long j;
        long floatToIntBits = Float.floatToIntBits(f2);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        return (j & 4294967295L) | (floatToIntBits << 32);
    }

    public static final void l(g0 g0Var, CancellationException cancellationException) {
        com.amazon.aps.iva.ob0.g coroutineContext = g0Var.getCoroutineContext();
        int i = j1.m0;
        j1 j1Var = (j1) coroutineContext.get(j1.b.b);
        if (j1Var != null) {
            j1Var.a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + g0Var).toString());
    }

    public static final com.amazon.aps.iva.z.p n(com.amazon.aps.iva.z.p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "<this>");
        com.amazon.aps.iva.z.p J = J(pVar);
        int b2 = J.b();
        for (int i = 0; i < b2; i++) {
            J.e(pVar.a(i), i);
        }
        return J;
    }

    public static final Object p(com.amazon.aps.iva.xb0.p pVar, com.amazon.aps.iva.ob0.d dVar) {
        com.amazon.aps.iva.xe0.p pVar2 = new com.amazon.aps.iva.xe0.p(dVar, dVar.getContext());
        Object u = com.amazon.aps.iva.ab.t.u(pVar2, pVar2, pVar);
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        return u;
    }

    public static Typeface q(String str, com.amazon.aps.iva.h2.y yVar, int i) {
        boolean z;
        Typeface create;
        Typeface create2;
        boolean z2;
        boolean z3 = true;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && com.amazon.aps.iva.yb0.j.a(yVar, com.amazon.aps.iva.h2.y.g)) {
            if (str != null && str.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                Typeface typeface = Typeface.DEFAULT;
                com.amazon.aps.iva.yb0.j.e(typeface, "DEFAULT");
                return typeface;
            }
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i2 = yVar.b;
        if (i != 1) {
            z3 = false;
        }
        create2 = Typeface.create(create, i2, z3);
        com.amazon.aps.iva.yb0.j.e(create2, "create(\n            fami…ontStyle.Italic\n        )");
        return create2;
    }

    public static void s() {
        int i = f;
        if (i > 0) {
            f = i - 1;
        }
    }

    public static String t(List list, String str) {
        com.amazon.aps.iva.yb0.j.f(list, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return sb2;
    }

    public static View u(int i, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r4 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int v(int r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r12, r0)
            boolean r0 = androidx.emoji2.text.d.c()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1e
            androidx.emoji2.text.d r0 = androidx.emoji2.text.d.a()
            int r4 = r0.b()
            if (r4 != r3) goto L1a
            r4 = r3
            goto L1b
        L1a:
            r4 = r2
        L1b:
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L93
            int r4 = r0.b()
            if (r4 != r3) goto L29
            r4 = r3
            goto L2a
        L29:
            r4 = r2
        L2a:
            if (r4 == 0) goto L8b
            androidx.emoji2.text.d$a r0 = r0.e
            androidx.emoji2.text.f r4 = r0.b
            r4.getClass()
            r0 = -1
            if (r11 < 0) goto L7b
            int r5 = r12.length()
            if (r11 < r5) goto L3d
            goto L7b
        L3d:
            boolean r5 = r12 instanceof android.text.Spanned
            if (r5 == 0) goto L58
            r5 = r12
            android.text.Spanned r5 = (android.text.Spanned) r5
            int r6 = r11 + 1
            java.lang.Class<com.amazon.aps.iva.i4.g> r7 = com.amazon.aps.iva.i4.g.class
            java.lang.Object[] r6 = r5.getSpans(r11, r6, r7)
            com.amazon.aps.iva.i4.g[] r6 = (com.amazon.aps.iva.i4.g[]) r6
            int r7 = r6.length
            if (r7 <= 0) goto L58
            r4 = r6[r2]
            int r4 = r5.getSpanEnd(r4)
            goto L7c
        L58:
            int r5 = r11 + (-16)
            int r6 = java.lang.Math.max(r2, r5)
            int r5 = r12.length()
            int r7 = r11 + 16
            int r7 = java.lang.Math.min(r5, r7)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            androidx.emoji2.text.f$c r10 = new androidx.emoji2.text.f$c
            r10.<init>(r11)
            r5 = r12
            java.lang.Object r4 = r4.c(r5, r6, r7, r8, r9, r10)
            androidx.emoji2.text.f$c r4 = (androidx.emoji2.text.f.c) r4
            int r4 = r4.c
            goto L7c
        L7b:
            r4 = r0
        L7c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r4.intValue()
            if (r5 != r0) goto L87
            r2 = r3
        L87:
            if (r2 != 0) goto L93
            r1 = r4
            goto L93
        L8b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not initialized yet"
            r11.<init>(r12)
            throw r11
        L93:
            if (r1 == 0) goto L9a
            int r11 = r1.intValue()
            return r11
        L9a:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r12)
            int r11 = r0.following(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e.z.v(int, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r4 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int w(int r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r13, r0)
            boolean r0 = androidx.emoji2.text.d.c()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1e
            androidx.emoji2.text.d r0 = androidx.emoji2.text.d.a()
            int r4 = r0.b()
            if (r4 != r3) goto L1a
            r4 = r3
            goto L1b
        L1a:
            r4 = r2
        L1b:
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L99
            int r4 = r12 + (-1)
            int r4 = java.lang.Math.max(r2, r4)
            int r5 = r0.b()
            if (r5 != r3) goto L2f
            r5 = r3
            goto L30
        L2f:
            r5 = r2
        L30:
            if (r5 == 0) goto L91
            androidx.emoji2.text.d$a r0 = r0.e
            androidx.emoji2.text.f r5 = r0.b
            r5.getClass()
            r0 = -1
            if (r4 < 0) goto L81
            int r6 = r13.length()
            if (r4 < r6) goto L43
            goto L81
        L43:
            boolean r6 = r13 instanceof android.text.Spanned
            if (r6 == 0) goto L5e
            r6 = r13
            android.text.Spanned r6 = (android.text.Spanned) r6
            int r7 = r4 + 1
            java.lang.Class<com.amazon.aps.iva.i4.g> r8 = com.amazon.aps.iva.i4.g.class
            java.lang.Object[] r7 = r6.getSpans(r4, r7, r8)
            com.amazon.aps.iva.i4.g[] r7 = (com.amazon.aps.iva.i4.g[]) r7
            int r8 = r7.length
            if (r8 <= 0) goto L5e
            r4 = r7[r2]
            int r4 = r6.getSpanStart(r4)
            goto L82
        L5e:
            int r6 = r4 + (-16)
            int r7 = java.lang.Math.max(r2, r6)
            int r6 = r13.length()
            int r8 = r4 + 16
            int r8 = java.lang.Math.min(r6, r8)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 1
            androidx.emoji2.text.f$c r11 = new androidx.emoji2.text.f$c
            r11.<init>(r4)
            r6 = r13
            java.lang.Object r4 = r5.c(r6, r7, r8, r9, r10, r11)
            androidx.emoji2.text.f$c r4 = (androidx.emoji2.text.f.c) r4
            int r4 = r4.b
            goto L82
        L81:
            r4 = r0
        L82:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r5 = r4.intValue()
            if (r5 != r0) goto L8d
            r2 = r3
        L8d:
            if (r2 != 0) goto L99
            r1 = r4
            goto L99
        L91:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Not initialized yet"
            r12.<init>(r13)
            throw r12
        L99:
            if (r1 == 0) goto La0
            int r12 = r1.intValue()
            return r12
        La0:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r13)
            int r12 = r0.preceding(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e.z.w(int, java.lang.String):int");
    }

    public static IBinder x(Bundle bundle, String str) {
        if (com.amazon.aps.iva.t5.g0.a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = d;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                d = method2;
                method2.setAccessible(true);
                method = d;
            } catch (NoSuchMethodException e2) {
                com.amazon.aps.iva.t5.p.a("Failed to retrieve getIBinder method", e2);
                com.amazon.aps.iva.t5.p.f();
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            com.amazon.aps.iva.t5.p.a("Failed to invoke getIBinder via reflection", e3);
            com.amazon.aps.iva.t5.p.f();
            return null;
        }
    }

    public static final long y(double d2) {
        return L(4294967296L, (float) d2);
    }

    public static final long z(int i) {
        return L(4294967296L, i);
    }

    @Override // com.amazon.aps.iva.h2.e0
    public Typeface b(com.amazon.aps.iva.h2.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(yVar, "fontWeight");
        return q(null, yVar, i);
    }

    @Override // com.amazon.aps.iva.xn.a
    public Object c(String str, com.amazon.aps.iva.ob0.d dVar) {
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                    com.amazon.aps.iva.yb0.j.e(bArr, "copyOf(this, newSize)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        com.amazon.aps.iva.vb0.a aVar = new com.amazon.aps.iva.vb0.a();
                        aVar.write(read2);
                        com.amazon.aps.iva.ab.x.E(fileInputStream, aVar);
                        int size = aVar.size() + i;
                        if (size >= 0) {
                            byte[] a = aVar.a();
                            bArr = Arrays.copyOf(bArr, size);
                            com.amazon.aps.iva.yb0.j.e(bArr, "copyOf(this, newSize)");
                            com.amazon.aps.iva.lb0.m.D(a, i, bArr, 0, aVar.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                com.amazon.aps.iva.a60.b.k(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.amazon.aps.iva.a60.b.k(fileInputStream, th);
                throw th2;
            }
        }
    }

    @Override // com.amazon.aps.iva.h2.e0
    public Typeface f(com.amazon.aps.iva.h2.z zVar, com.amazon.aps.iva.h2.y yVar, int i) {
        com.amazon.aps.iva.yb0.j.f(zVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(yVar, "fontWeight");
        return q(zVar.c, yVar, i);
    }

    @Override // com.amazon.aps.iva.x6.p
    public f0 r(int i, int i2) {
        return new com.amazon.aps.iva.x6.m();
    }

    @Override // com.amazon.aps.iva.x6.p
    public void o() {
    }

    @Override // com.amazon.aps.iva.gr.o
    public void a(Context context) {
    }

    @Override // com.amazon.aps.iva.gr.o
    public void d(Context context) {
    }

    @Override // com.amazon.aps.iva.x6.p
    public void m(d0 d0Var) {
    }

    @Override // com.amazon.aps.iva.v90.i
    public View e(View view, AttributeSet attributeSet) {
        return view;
    }
}
