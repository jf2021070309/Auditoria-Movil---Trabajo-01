package com.amazon.aps.iva.z30;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.jh.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.kh.e;
import com.amazon.aps.iva.y30.l0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.util.Iterator;
import java.util.List;
/* compiled from: AudioLanguageSettingsPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> implements com.amazon.aps.iva.z30.b {
    public final e b;
    public final l0 c;

    /* compiled from: AudioLanguageSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<String, q> {
        public final /* synthetic */ List<f> h;
        public final /* synthetic */ c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends f> list, c cVar) {
            super(1);
            this.h = list;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(String str) {
            Object obj;
            String str2 = str;
            Iterator<T> it = this.h.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (j.a(((f) obj).a(), str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            f fVar = (f) obj;
            if (fVar != null) {
                this.i.getView().i0(fVar);
            }
            return q.a;
        }
    }

    /* compiled from: AudioLanguageSettingsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public c(com.amazon.aps.iva.z30.a aVar, e eVar, l0 l0Var) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = eVar;
        this.c = l0Var;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        List<f> options = this.b.getOptions();
        getView().s2(options);
        this.c.d4().e(getView(), new b(new a(options, this)));
    }

    @Override // com.amazon.aps.iva.z30.b
    public final void s(f fVar) {
        j.f(fVar, "selectedOption");
        this.c.R6(fVar.a());
    }
}
