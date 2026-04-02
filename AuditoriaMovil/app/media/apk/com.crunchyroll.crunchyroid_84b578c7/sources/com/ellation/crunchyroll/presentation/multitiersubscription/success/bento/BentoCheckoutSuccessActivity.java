package com.ellation.crunchyroll.presentation.multitiersubscription.success.bento;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.h;
import androidx.lifecycle.p;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.h30.k;
import com.amazon.aps.iva.h30.m;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.g;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: BentoCheckoutSuccessActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/success/bento/BentoCheckoutSuccessActivity;", "Lcom/amazon/aps/iva/i60/b;", "<init>", "()V", "a", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BentoCheckoutSuccessActivity extends com.amazon.aps.iva.i60.b {
    public final com.amazon.aps.iva.ez.a k = new com.amazon.aps.iva.ez.a(k.class, new e(this), new b());
    public static final /* synthetic */ l<Object>[] m = {q.a(BentoCheckoutSuccessActivity.class, "bentoCheckoutSuccessViewModel", "getBentoCheckoutSuccessViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/success/bento/BentoCheckoutSuccessViewModelImpl;", 0)};
    public static final a l = new a();

    /* compiled from: BentoCheckoutSuccessActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: BentoCheckoutSuccessActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, k> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final k invoke(p pVar) {
            com.amazon.aps.iva.wh.a aVar;
            l0 l0Var;
            String str;
            Object obj;
            Object obj2;
            Object obj3;
            j.f(pVar, "it");
            BentoCheckoutSuccessActivity bentoCheckoutSuccessActivity = BentoCheckoutSuccessActivity.this;
            Bundle extras = bentoCheckoutSuccessActivity.getIntent().getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj3 = extras.getSerializable("bento_product_purchase_key", com.amazon.aps.iva.wh.a.class);
                } else {
                    obj3 = (com.amazon.aps.iva.wh.a) extras.getSerializable("bento_product_purchase_key");
                }
                aVar = (com.amazon.aps.iva.wh.a) obj3;
            } else {
                aVar = null;
            }
            j.c(aVar);
            Bundle extras2 = bentoCheckoutSuccessActivity.getIntent().getExtras();
            if (extras2 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj2 = extras2.getSerializable("bento_upsell_type", l0.class);
                } else {
                    obj2 = (l0) extras2.getSerializable("bento_upsell_type");
                }
                l0Var = (l0) obj2;
            } else {
                l0Var = null;
            }
            j.c(l0Var);
            Bundle extras3 = bentoCheckoutSuccessActivity.getIntent().getExtras();
            if (extras3 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras3.getSerializable("bento_redirect_url", String.class);
                } else {
                    obj = (String) extras3.getSerializable("bento_redirect_url");
                }
                str = (String) obj;
            } else {
                str = null;
            }
            String string = bentoCheckoutSuccessActivity.getString(R.string.something_wrong);
            j.e(string, "getString(CommonResources.string.something_wrong)");
            com.amazon.aps.iva.k50.c cVar = new com.amazon.aps.iva.k50.c(bentoCheckoutSuccessActivity, string);
            com.amazon.aps.iva.ds.c cVar2 = com.amazon.aps.iva.ds.c.b;
            return new k(aVar, l0Var, str, cVar, new m(new com.amazon.aps.iva.fs.d()));
        }
    }

    /* compiled from: BentoCheckoutSuccessActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<i, Integer, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(i iVar, Integer num) {
            i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 584031113, new com.ellation.crunchyroll.presentation.multitiersubscription.success.bento.a(BentoCheckoutSuccessActivity.this)), iVar2, 6);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BentoCheckoutSuccessActivity.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.multitiersubscription.success.bento.BentoCheckoutSuccessActivity$onCreate$2", f = "BentoCheckoutSuccessActivity.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;

        /* compiled from: BentoCheckoutSuccessActivity.kt */
        /* loaded from: classes2.dex */
        public static final class a implements g<com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ BentoCheckoutSuccessActivity b;

            public a(BentoCheckoutSuccessActivity bentoCheckoutSuccessActivity) {
                this.b = bentoCheckoutSuccessActivity;
            }

            @Override // com.amazon.aps.iva.ve0.g
            public final Object a(com.amazon.aps.iva.kb0.q qVar, com.amazon.aps.iva.ob0.d dVar) {
                this.b.finish();
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x.i0(obj);
            } else {
                x.i0(obj);
                a aVar2 = BentoCheckoutSuccessActivity.l;
                BentoCheckoutSuccessActivity bentoCheckoutSuccessActivity = BentoCheckoutSuccessActivity.this;
                bentoCheckoutSuccessActivity.getClass();
                com.amazon.aps.iva.ve0.l0 l0Var = ((k) bentoCheckoutSuccessActivity.k.getValue(bentoCheckoutSuccessActivity, BentoCheckoutSuccessActivity.m[0])).e;
                a aVar3 = new a(bentoCheckoutSuccessActivity);
                this.h = 1;
                l0Var.getClass();
                if (com.amazon.aps.iva.ve0.l0.l(l0Var, aVar3, this) == aVar) {
                    return aVar;
                }
            }
            throw new com.amazon.aps.iva.la.a();
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return this.h;
        }
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.amazon.aps.iva.xw.b.c(this, com.amazon.aps.iva.v0.b.c(648835990, new c(), true));
        com.amazon.aps.iva.se0.i.d(x.O(this), null, null, new d(null), 3);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return b0.b;
    }
}
