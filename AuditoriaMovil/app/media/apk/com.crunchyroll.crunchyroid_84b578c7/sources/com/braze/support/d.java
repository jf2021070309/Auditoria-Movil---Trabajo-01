package com.braze.support;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.ne0.u;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.f(i) instanceof com.amazon.aps.iva.if0.c);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Object a(int i) {
            return (com.amazon.aps.iva.if0.c) this.b.get(i);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
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
            return "Failed to deserialize feature flag Json: " + this.b;
        }
    }

    private d() {
    }

    public final List a(com.amazon.aps.iva.if0.a aVar) {
        j.f(aVar, "featureFlagsJson");
        ArrayList arrayList = new ArrayList();
        u b0 = s.b0(s.V(x.k0(com.amazon.aps.iva.aq.j.T(0, aVar.e())), new a(aVar)), new b(aVar));
        for (T t : b0.a) {
            FeatureFlag a2 = a.a((com.amazon.aps.iva.if0.c) b0.b.invoke(t));
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public final FeatureFlag a(com.amazon.aps.iva.if0.c cVar) {
        j.f(cVar, "featureFlagObject");
        try {
            String string = cVar.getString("id");
            j.e(string, "featureFlagObject.getString(FeatureFlag.ID)");
            boolean z = cVar.getBoolean("enabled");
            com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("properties");
            if (optJSONObject == null) {
                optJSONObject = new com.amazon.aps.iva.if0.c();
            }
            return new FeatureFlag(string, z, optJSONObject, JsonUtils.getOptionalString(cVar, "fts"));
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new c(cVar));
            return null;
        }
    }
}
