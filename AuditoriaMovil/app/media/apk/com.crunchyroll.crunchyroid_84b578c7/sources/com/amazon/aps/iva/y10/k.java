package com.amazon.aps.iva.y10;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
/* compiled from: MyListsPresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.wy.b<l> implements j {
    public final com.amazon.aps.iva.uw.a b;
    public final q c;
    public final m d;

    /* compiled from: MyListsPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.WATCHLIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.OFFLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.CRUNCHYLISTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: MyListsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.yb0.j.e(bool2, "isInEditMode");
            boolean booleanValue = bool2.booleanValue();
            k kVar = k.this;
            if (booleanValue) {
                kVar.getView().z();
            } else {
                kVar.getView().u();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: MyListsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(b bVar) {
            this.a = bVar;
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

    public k(com.amazon.aps.iva.uw.a aVar, r rVar, m mVar, com.ellation.crunchyroll.presentation.main.lists.b bVar) {
        super(bVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = aVar;
        this.c = rVar;
        this.d = mVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().Se();
        q6(this.d);
        this.b.a1().e(getView(), new c(new b()));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onNewIntent(Intent intent) {
        m mVar;
        Object obj;
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = extras.getSerializable("tab_to_open", m.class);
            } else {
                obj = (m) extras.getSerializable("tab_to_open");
            }
            mVar = (m) obj;
        } else {
            mVar = null;
        }
        q6(mVar);
    }

    public final void q6(m mVar) {
        int i;
        if (this.c.c()) {
            if (mVar == null) {
                i = -1;
            } else {
                i = a.a[mVar.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        getView().Ig();
                        return;
                    }
                    return;
                }
                getView().Te();
                return;
            }
            getView().F4();
            return;
        }
        getView().Te();
    }
}
