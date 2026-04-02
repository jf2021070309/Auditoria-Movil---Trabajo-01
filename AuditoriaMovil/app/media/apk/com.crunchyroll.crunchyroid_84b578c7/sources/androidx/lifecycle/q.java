package androidx.lifecycle;

import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.h0;
import com.amazon.aps.iva.i5.y;
import com.amazon.aps.iva.i5.z;
import com.amazon.aps.iva.yb0.e0;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class q {
    public static final b a = new b();
    public static final c b = new c();
    public static final a c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class b {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class c {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.k5.a, z> {
        public static final d h = new d();

        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final z invoke(com.amazon.aps.iva.k5.a aVar) {
            com.amazon.aps.iva.yb0.j.f(aVar, "$this$initializer");
            return new z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r5.isEmpty() == true) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.lifecycle.p a(com.amazon.aps.iva.k5.c r7) {
        /*
            androidx.lifecycle.q$b r0 = androidx.lifecycle.q.a
            java.util.LinkedHashMap r7 = r7.a
            java.lang.Object r0 = r7.get(r0)
            com.amazon.aps.iva.s8.c r0 = (com.amazon.aps.iva.s8.c) r0
            if (r0 == 0) goto L92
            androidx.lifecycle.q$c r1 = androidx.lifecycle.q.b
            java.lang.Object r1 = r7.get(r1)
            com.amazon.aps.iva.i5.h0 r1 = (com.amazon.aps.iva.i5.h0) r1
            if (r1 == 0) goto L8a
            androidx.lifecycle.q$a r2 = androidx.lifecycle.q.c
            java.lang.Object r2 = r7.get(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.lifecycle.v r3 = androidx.lifecycle.v.a
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L82
            androidx.savedstate.a r0 = r0.getSavedStateRegistry()
            androidx.savedstate.a$b r0 = r0.b()
            boolean r3 = r0 instanceof com.amazon.aps.iva.i5.y
            r4 = 0
            if (r3 == 0) goto L38
            com.amazon.aps.iva.i5.y r0 = (com.amazon.aps.iva.i5.y) r0
            goto L39
        L38:
            r0 = r4
        L39:
            if (r0 == 0) goto L7a
            com.amazon.aps.iva.i5.z r1 = c(r1)
            java.util.LinkedHashMap r3 = r1.b
            java.lang.Object r3 = r3.get(r7)
            androidx.lifecycle.p r3 = (androidx.lifecycle.p) r3
            if (r3 != 0) goto L79
            java.lang.Class<? extends java.lang.Object>[] r3 = androidx.lifecycle.p.f
            r0.b()
            android.os.Bundle r3 = r0.c
            if (r3 == 0) goto L57
            android.os.Bundle r3 = r3.getBundle(r7)
            goto L58
        L57:
            r3 = r4
        L58:
            android.os.Bundle r5 = r0.c
            if (r5 == 0) goto L5f
            r5.remove(r7)
        L5f:
            android.os.Bundle r5 = r0.c
            if (r5 == 0) goto L6b
            boolean r5 = r5.isEmpty()
            r6 = 1
            if (r5 != r6) goto L6b
            goto L6c
        L6b:
            r6 = 0
        L6c:
            if (r6 == 0) goto L70
            r0.c = r4
        L70:
            androidx.lifecycle.p r3 = androidx.lifecycle.p.a.a(r3, r2)
            java.util.LinkedHashMap r0 = r1.b
            r0.put(r7, r3)
        L79:
            return r3
        L7a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            r7.<init>(r0)
            throw r7
        L82:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            r7.<init>(r0)
            throw r7
        L8a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        L92:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.q.a(com.amazon.aps.iva.k5.c):androidx.lifecycle.p");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends com.amazon.aps.iva.s8.c & h0> void b(T t) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(t, "<this>");
        g.b currentState = t.getLifecycle().getCurrentState();
        if (currentState != g.b.INITIALIZED && currentState != g.b.CREATED) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (t.getSavedStateRegistry().b() == null) {
                y yVar = new y(t.getSavedStateRegistry(), t);
                t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", yVar);
                t.getLifecycle().addObserver(new SavedStateHandleAttacher(yVar));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final z c(h0 h0Var) {
        com.amazon.aps.iva.yb0.j.f(h0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        com.amazon.aps.iva.fc0.d a2 = e0.a(z.class);
        com.amazon.aps.iva.yb0.j.f(a2, "clazz");
        d dVar = d.h;
        com.amazon.aps.iva.yb0.j.f(dVar, "initializer");
        arrayList.add(new com.amazon.aps.iva.k5.d(com.amazon.aps.iva.ab.t.o(a2), dVar));
        com.amazon.aps.iva.k5.d[] dVarArr = (com.amazon.aps.iva.k5.d[]) arrayList.toArray(new com.amazon.aps.iva.k5.d[0]);
        return (z) new u(h0Var, new com.amazon.aps.iva.k5.b((com.amazon.aps.iva.k5.d[]) Arrays.copyOf(dVarArr, dVarArr.length))).b(z.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
