package com.ellation.crunchyroll.presentation.main.store;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.v10.c;
import com.amazon.aps.iva.vn.g;
import com.amazon.aps.iva.xa0.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yw.d0;
import com.ellation.crunchyroll.application.e;
import kotlin.Metadata;
/* compiled from: CrStoreBottomBarActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/store/CrStoreBottomBarActivity;", "Lcom/amazon/aps/iva/v10/c;", "<init>", "()V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CrStoreBottomBarActivity extends c {
    public final int r = 32;
    public final com.amazon.aps.iva.ls.a s = com.amazon.aps.iva.ls.a.STORE;

    /* compiled from: CrStoreBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<f, q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(f fVar) {
            f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            f.a(fVar2, false, false, true, false, com.ellation.crunchyroll.presentation.main.store.a.h, 251);
            return q.a;
        }
    }

    /* compiled from: CrStoreBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<Fragment> {
        public static final b h = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Fragment invoke() {
            ((d0) e.a()).B.getClass();
            return new g();
        }
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f1.i(ri(), a.h);
        mi(b.h);
    }

    @Override // com.amazon.aps.iva.v10.a
    public final int pi() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.v10.k
    public final void yh() {
        super.yh();
        g gVar = (g) qi();
        if (gVar != null) {
            gVar.ci();
        }
    }
}
