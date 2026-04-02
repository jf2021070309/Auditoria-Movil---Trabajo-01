package com.amazon.aps.iva.x60;

import android.app.Application;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ActionTracker.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final C0847a c = new C0847a();
    public static volatile a d;
    public com.amazon.aps.iva.x60.c a;
    public final com.amazon.aps.iva.y60.c b;

    /* compiled from: ActionTracker.kt */
    /* renamed from: com.amazon.aps.iva.x60.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0847a {
        public final a a(Application application) {
            j.f(application, "application");
            a aVar = a.d;
            if (aVar == null) {
                synchronized (this) {
                    aVar = a.d;
                    if (aVar == null) {
                        aVar = new a(application);
                        a.d = aVar;
                    }
                }
            }
            return aVar;
        }
    }

    /* compiled from: ActionTracker.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<String, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(String str) {
            String str2 = str;
            j.f(str2, "it");
            com.amazon.aps.iva.x60.c cVar = a.this.a;
            if (cVar != null) {
                cVar.b(str2);
            }
            return q.a;
        }
    }

    /* compiled from: ActionTracker.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.l<String, q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(String str) {
            String str2 = str;
            j.f(str2, "it");
            com.amazon.aps.iva.x60.c cVar = a.this.a;
            if (cVar != null) {
                cVar.d(str2);
            }
            return q.a;
        }
    }

    public a(Application application) {
        com.amazon.aps.iva.y60.c cVar = new com.amazon.aps.iva.y60.c();
        this.b = cVar;
        application.registerActivityLifecycleCallbacks(new d(new b(), new c()));
        application.registerActivityLifecycleCallbacks(cVar);
    }
}
