package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.gd0.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes4.dex */
public final class b {
    public final /* synthetic */ com.amazon.aps.iva.gd0.a<Object, Object> a;
    public final /* synthetic */ HashMap<w, List<Object>> b;
    public final /* synthetic */ t c;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes4.dex */
    public final class a extends C0301b {
        public a(w wVar) {
            super(wVar);
        }

        public final i c(int i, com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.tc0.b bVar2) {
            w wVar = this.a;
            com.amazon.aps.iva.yb0.j.f(wVar, "signature");
            w wVar2 = new w(wVar.a + '@' + i);
            b bVar3 = b.this;
            List<Object> list = bVar3.b.get(wVar2);
            if (list == null) {
                list = new ArrayList<>();
                bVar3.b.put(wVar2, list);
            }
            return bVar3.a.r(bVar, bVar2, list);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: com.amazon.aps.iva.gd0.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0301b implements t.c {
        public final w a;
        public final ArrayList<Object> b = new ArrayList<>();

        public C0301b(w wVar) {
            this.a = wVar;
        }

        @Override // com.amazon.aps.iva.gd0.t.c
        public final void a() {
            ArrayList<Object> arrayList = this.b;
            if (!arrayList.isEmpty()) {
                b.this.b.put(this.a, arrayList);
            }
        }

        @Override // com.amazon.aps.iva.gd0.t.c
        public final t.a b(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.tc0.b bVar2) {
            return b.this.a.r(bVar, bVar2, this.b);
        }
    }

    public b(com.amazon.aps.iva.gd0.a aVar, HashMap hashMap, t tVar, HashMap hashMap2) {
        this.a = aVar;
        this.b = hashMap;
        this.c = tVar;
    }

    public final C0301b a(com.amazon.aps.iva.nd0.f fVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "desc");
        String b = fVar.b();
        com.amazon.aps.iva.yb0.j.e(b, "name.asString()");
        return new C0301b(new w(b + '#' + str));
    }

    public final a b(com.amazon.aps.iva.nd0.f fVar, String str) {
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        String b = fVar.b();
        com.amazon.aps.iva.yb0.j.e(b, "name.asString()");
        return new a(new w(b.concat(str)));
    }
}
