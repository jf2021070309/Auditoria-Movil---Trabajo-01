package com.amazon.aps.iva.x40;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.w;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
/* compiled from: AppInitPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<c> implements com.amazon.aps.iva.x40.a {
    public final LiveData<com.amazon.aps.iva.ms.a> b;

    /* compiled from: AppInitPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ms.a, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ms.a aVar) {
            b.this.getView().Y7();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: AppInitPresenter.kt */
    /* renamed from: com.amazon.aps.iva.x40.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0841b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public C0841b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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

    public b(StartupActivity startupActivity, LiveData liveData) {
        super(startupActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = liveData;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        C0841b c0841b = new C0841b(new a());
        this.b.e(getView(), c0841b);
    }
}
