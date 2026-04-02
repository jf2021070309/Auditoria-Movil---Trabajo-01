package com.ellation.crunchyroll.presentation.multitiersubscription.success;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.h;
import androidx.lifecycle.p;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.g30.d;
import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SubscriptionSuccessActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/success/SubscriptionSuccessActivity;", "Lcom/amazon/aps/iva/i60/b;", "<init>", "()V", "a", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SubscriptionSuccessActivity extends com.amazon.aps.iva.i60.b {
    public com.amazon.aps.iva.vf.b k;
    public final com.amazon.aps.iva.ez.a l = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.g30.b.class, new b(this), new c());
    public final int m = R.layout.activity_subscription_success;
    public static final /* synthetic */ l<Object>[] o = {q.a(SubscriptionSuccessActivity.class, "subscriptionSuccessViewModel", "getSubscriptionSuccessViewModel()Lcom/ellation/crunchyroll/presentation/multitiersubscription/success/CrPlusSubscriptionSuccessViewModel;", 0)};
    public static final a n = new a();

    /* compiled from: SubscriptionSuccessActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return this.h;
        }
    }

    /* compiled from: SubscriptionSuccessActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.g30.b> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.g30.b invoke(p pVar) {
            com.amazon.aps.iva.wh.a aVar;
            l0 l0Var;
            Boolean bool;
            Object obj;
            Object serializable;
            Object obj2;
            Object obj3;
            j.f(pVar, "it");
            SubscriptionSuccessActivity subscriptionSuccessActivity = SubscriptionSuccessActivity.this;
            Bundle extras = subscriptionSuccessActivity.getIntent().getExtras();
            com.amazon.aps.iva.vw.a aVar2 = null;
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj3 = extras.getSerializable("product_purchase_key", com.amazon.aps.iva.wh.a.class);
                } else {
                    obj3 = (com.amazon.aps.iva.wh.a) extras.getSerializable("product_purchase_key");
                }
                aVar = (com.amazon.aps.iva.wh.a) obj3;
            } else {
                aVar = null;
            }
            j.c(aVar);
            Bundle extras2 = subscriptionSuccessActivity.getIntent().getExtras();
            if (extras2 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj2 = extras2.getSerializable("upsell_type", l0.class);
                } else {
                    obj2 = (l0) extras2.getSerializable("upsell_type");
                }
                l0Var = (l0) obj2;
            } else {
                l0Var = null;
            }
            j.c(l0Var);
            Bundle extras3 = subscriptionSuccessActivity.getIntent().getExtras();
            if (extras3 != null) {
                bool = Boolean.valueOf(extras3.getBoolean("track_acquisition_completed"));
            } else {
                bool = null;
            }
            j.c(bool);
            boolean booleanValue = bool.booleanValue();
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            Intent intent = subscriptionSuccessActivity.getIntent();
            j.e(intent, "intent");
            Bundle extras4 = intent.getExtras();
            if (extras4 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = extras4.getSerializable("experiment", com.amazon.aps.iva.vw.a.class);
                    obj = serializable;
                } else {
                    obj = (com.amazon.aps.iva.vw.a) extras4.getSerializable("experiment");
                }
                aVar2 = (com.amazon.aps.iva.vw.a) obj;
            }
            return new com.amazon.aps.iva.g30.b(aVar, l0Var, booleanValue, new d(new com.amazon.aps.iva.fs.d(), aVar2));
        }
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.m);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_subscription_success, (ViewGroup) null, false);
        int i = R.id.cr_plus_subscription_success_cta;
        TextView textView = (TextView) z.u(R.id.cr_plus_subscription_success_cta, inflate);
        if (textView != null) {
            i = R.id.cr_plus_subscription_success_subtitle;
            TextView textView2 = (TextView) z.u(R.id.cr_plus_subscription_success_subtitle, inflate);
            if (textView2 != null) {
                com.amazon.aps.iva.vf.b bVar = new com.amazon.aps.iva.vf.b((ConstraintLayout) inflate, textView, textView2, 1);
                this.k = bVar;
                ConstraintLayout a2 = bVar.a();
                j.e(a2, "binding.root");
                setContentView(a2);
                com.amazon.aps.iva.xw.b.d(this, true);
                com.amazon.aps.iva.g30.b bVar2 = (com.amazon.aps.iva.g30.b) this.l.getValue(this, o[0]);
                com.amazon.aps.iva.vf.b bVar3 = this.k;
                if (bVar3 != null) {
                    ((TextView) bVar3.d).setText(getString(R.string.cr_plus_subscription_success_subtitle_format, getIntent().getStringExtra("product_title")));
                    com.amazon.aps.iva.vf.b bVar4 = this.k;
                    if (bVar4 != null) {
                        ((TextView) bVar4.c).setOnClickListener(new com.amazon.aps.iva.c8.h(this, 19));
                        return;
                    } else {
                        j.m("binding");
                        throw null;
                    }
                }
                j.m("binding");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return b0.b;
    }
}
