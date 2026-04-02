package com.amazon.aps.iva.gd0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;
import com.amazon.aps.iva.c3.e0;
import com.amazon.aps.iva.sv.h2;
import com.amazon.aps.iva.sv.i2;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: DeserializationComponentsForJava.kt */
/* loaded from: classes4.dex */
public final class j implements com.amazon.aps.iva.xc0.v {
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781};
    public static com.amazon.aps.iva.rd.e e;

    public static final com.amazon.aps.iva.e1.e b(androidx.compose.ui.node.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.s1.q Z = cVar.Z();
        if (Z != null) {
            return ((androidx.compose.ui.node.o) Z).f(cVar, true);
        }
        long j = cVar.d;
        return new com.amazon.aps.iva.e1.e(0.0f, 0.0f, (int) (j >> 32), com.amazon.aps.iva.o2.j.b(j));
    }

    public static final com.amazon.aps.iva.e1.e c(com.amazon.aps.iva.s1.q qVar) {
        return f(qVar).f(qVar, true);
    }

    public static final com.amazon.aps.iva.e1.e d(com.amazon.aps.iva.s1.q qVar) {
        boolean z;
        boolean z2;
        com.amazon.aps.iva.s1.q f = f(qVar);
        com.amazon.aps.iva.e1.e f2 = f(qVar).f(qVar, true);
        float a2 = (int) (f.a() >> 32);
        float b2 = com.amazon.aps.iva.o2.j.b(f.a());
        float i = com.amazon.aps.iva.aq.j.i(f2.a, 0.0f, a2);
        float i2 = com.amazon.aps.iva.aq.j.i(f2.b, 0.0f, b2);
        float i3 = com.amazon.aps.iva.aq.j.i(f2.c, 0.0f, a2);
        float i4 = com.amazon.aps.iva.aq.j.i(f2.d, 0.0f, b2);
        if (i == i3) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i2 == i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long J = f.J(com.amazon.aps.iva.e1.d.d(i, i2));
                long J2 = f.J(com.amazon.aps.iva.e1.d.d(i3, i2));
                long J3 = f.J(com.amazon.aps.iva.e1.d.d(i3, i4));
                long J4 = f.J(com.amazon.aps.iva.e1.d.d(i, i4));
                float c2 = com.amazon.aps.iva.e1.c.c(J);
                float[] fArr = {com.amazon.aps.iva.e1.c.c(J2), com.amazon.aps.iva.e1.c.c(J4), com.amazon.aps.iva.e1.c.c(J3)};
                for (int i5 = 0; i5 < 3; i5++) {
                    c2 = Math.min(c2, fArr[i5]);
                }
                float d2 = com.amazon.aps.iva.e1.c.d(J);
                float[] fArr2 = {com.amazon.aps.iva.e1.c.d(J2), com.amazon.aps.iva.e1.c.d(J4), com.amazon.aps.iva.e1.c.d(J3)};
                for (int i6 = 0; i6 < 3; i6++) {
                    d2 = Math.min(d2, fArr2[i6]);
                }
                float c3 = com.amazon.aps.iva.e1.c.c(J);
                float[] fArr3 = {com.amazon.aps.iva.e1.c.c(J2), com.amazon.aps.iva.e1.c.c(J4), com.amazon.aps.iva.e1.c.c(J3)};
                for (int i7 = 0; i7 < 3; i7++) {
                    c3 = Math.max(c3, fArr3[i7]);
                }
                float d3 = com.amazon.aps.iva.e1.c.d(J);
                float[] fArr4 = {com.amazon.aps.iva.e1.c.d(J2), com.amazon.aps.iva.e1.c.d(J4), com.amazon.aps.iva.e1.c.d(J3)};
                for (int i8 = 0; i8 < 3; i8++) {
                    d3 = Math.max(d3, fArr4[i8]);
                }
                return new com.amazon.aps.iva.e1.e(c2, d2, c3, d3);
            }
        }
        return com.amazon.aps.iva.e1.e.e;
    }

    public static com.amazon.aps.iva.sd.b e() {
        return new com.amazon.aps.iva.sd.b(com.amazon.aps.iva.ds.c.b);
    }

    public static final com.amazon.aps.iva.s1.q f(com.amazon.aps.iva.s1.q qVar) {
        com.amazon.aps.iva.s1.q qVar2;
        androidx.compose.ui.node.o oVar;
        com.amazon.aps.iva.yb0.j.f(qVar, "<this>");
        com.amazon.aps.iva.s1.q Z = qVar.Z();
        while (true) {
            com.amazon.aps.iva.s1.q qVar3 = Z;
            qVar2 = qVar;
            qVar = qVar3;
            if (qVar == null) {
                break;
            }
            Z = qVar.Z();
        }
        if (qVar2 instanceof androidx.compose.ui.node.o) {
            oVar = (androidx.compose.ui.node.o) qVar2;
        } else {
            oVar = null;
        }
        if (oVar == null) {
            return qVar2;
        }
        androidx.compose.ui.node.o oVar2 = oVar.k;
        while (true) {
            androidx.compose.ui.node.o oVar3 = oVar2;
            androidx.compose.ui.node.o oVar4 = oVar;
            oVar = oVar3;
            if (oVar != null) {
                oVar2 = oVar.k;
            } else {
                return oVar4;
            }
        }
    }

    public static final Object g(InternalDownloadsManager internalDownloadsManager, String str, com.amazon.aps.iva.qb0.c cVar) {
        com.amazon.aps.iva.ob0.i iVar = new com.amazon.aps.iva.ob0.i(com.amazon.aps.iva.a60.b.s(cVar));
        internalDownloadsManager.P0(str, new i2(iVar), new h2(iVar));
        Object a2 = iVar.a();
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        return a2;
    }

    public static final long h(com.amazon.aps.iva.s1.q qVar) {
        com.amazon.aps.iva.yb0.j.f(qVar, "<this>");
        int i = com.amazon.aps.iva.e1.c.e;
        return qVar.d0(com.amazon.aps.iva.e1.c.b);
    }

    public static Intent i(Activity activity, String str) {
        Activity activity2;
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", activity.getPackageName());
        action.addFlags(524288);
        Activity activity3 = activity;
        while (true) {
            if (activity3 instanceof ContextWrapper) {
                if (activity3 instanceof Activity) {
                    activity2 = activity3;
                    break;
                }
                activity3 = activity3.getBaseContext();
            } else {
                activity2 = null;
                break;
            }
        }
        if (activity2 != null) {
            ComponentName componentName = activity2.getComponentName();
            action.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            action.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
        action.setType("text/plain");
        action.putExtra("android.intent.extra.TEXT", (CharSequence) str);
        action.setAction("android.intent.action.SEND");
        action.removeExtra("android.intent.extra.STREAM");
        e0.c(action);
        Intent createChooser = Intent.createChooser(action, null);
        com.amazon.aps.iva.yb0.j.e(createChooser, "IntentBuilder(activity)\n…   .createChooserIntent()");
        return createChooser;
    }

    @Override // com.amazon.aps.iva.xc0.v
    public void a(com.amazon.aps.iva.nd0.b bVar) {
    }
}
