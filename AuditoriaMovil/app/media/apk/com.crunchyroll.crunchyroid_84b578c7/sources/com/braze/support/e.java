package com.braze.support;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.BrazeGeofence;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class e {
    public static final e a = new e();

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank geofence Json. Not parsing.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to deserialize geofence Json due to JSONException: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.c b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.if0.c cVar) {
            super(0);
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to deserialize geofence Json:" + this.b;
        }
    }

    private e() {
    }

    public static final List a(com.amazon.aps.iva.if0.a aVar) {
        j.f(aVar, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int e = aVar.e();
        for (int i = 0; i < e; i++) {
            com.amazon.aps.iva.if0.c j = aVar.j(i);
            if (j == null) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                } catch (com.amazon.aps.iva.if0.b e2) {
                    BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.W, e2, new b(j));
                } catch (Exception e3) {
                    BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, e3, new c(j));
                }
            } else {
                arrayList.add(new BrazeGeofence(j));
            }
        }
        return arrayList;
    }
}
