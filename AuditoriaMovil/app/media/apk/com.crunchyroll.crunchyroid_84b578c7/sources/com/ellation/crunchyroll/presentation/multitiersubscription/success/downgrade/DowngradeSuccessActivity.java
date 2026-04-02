package com.ellation.crunchyroll.presentation.multitiersubscription.success.downgrade;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fs.d;
import com.amazon.aps.iva.i30.g;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: DowngradeSuccessActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/success/downgrade/DowngradeSuccessActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/i30/g;", "<init>", "()V", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DowngradeSuccessActivity extends com.amazon.aps.iva.i60.b implements g {
    public static final /* synthetic */ int n = 0;
    public final e k = f.a(com.amazon.aps.iva.kb0.g.NONE, new c(this));
    public final m l = f.b(a.h);
    public final m m = f.b(new b());

    /* compiled from: DowngradeSuccessActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.i30.a> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.i30.a invoke() {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            return new com.amazon.aps.iva.i30.b(new d());
        }
    }

    /* compiled from: DowngradeSuccessActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.i30.e> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.i30.e invoke() {
            com.amazon.aps.iva.i30.d dVar;
            Object obj;
            DowngradeSuccessActivity downgradeSuccessActivity = DowngradeSuccessActivity.this;
            com.amazon.aps.iva.i30.a aVar = (com.amazon.aps.iva.i30.a) downgradeSuccessActivity.l.getValue();
            Intent intent = downgradeSuccessActivity.getIntent();
            j.e(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = extras.getSerializable("downgrade_success_input", com.amazon.aps.iva.i30.d.class);
                } else {
                    obj = (com.amazon.aps.iva.i30.d) extras.getSerializable("downgrade_success_input");
                }
                dVar = (com.amazon.aps.iva.i30.d) obj;
            } else {
                dVar = null;
            }
            j.c(dVar);
            j.f(aVar, "analytics");
            return new com.amazon.aps.iva.i30.f(downgradeSuccessActivity, aVar, dVar);
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.v60.b> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.k.c cVar) {
            super(0);
            this.h = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.v60.b invoke() {
            LayoutInflater layoutInflater = this.h.getLayoutInflater();
            j.e(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.activity_downgrade_success, (ViewGroup) null, false);
            int i = R.id.downgrade_close_button;
            ImageView imageView = (ImageView) z.u(R.id.downgrade_close_button, inflate);
            if (imageView != null) {
                i = R.id.downgrade_success_cta;
                TextView textView = (TextView) z.u(R.id.downgrade_success_cta, inflate);
                if (textView != null) {
                    i = R.id.downgrade_success_hime;
                    if (((ImageView) z.u(R.id.downgrade_success_hime, inflate)) != null) {
                        i = R.id.downgrade_success_subtitle;
                        if (((TextView) z.u(R.id.downgrade_success_subtitle, inflate)) != null) {
                            i = R.id.downgrade_success_title;
                            TextView textView2 = (TextView) z.u(R.id.downgrade_success_title, inflate);
                            if (textView2 != null) {
                                return new com.amazon.aps.iva.v60.b(imageView, textView, textView2, (ConstraintLayout) inflate);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = this.k;
        ConstraintLayout constraintLayout = ((com.amazon.aps.iva.v60.b) eVar.getValue()).a;
        j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        com.amazon.aps.iva.xw.b.d(this, true);
        ((com.amazon.aps.iva.v60.b) eVar.getValue()).b.setOnClickListener(new com.amazon.aps.iva.c8.f(this, 16));
        ((com.amazon.aps.iva.v60.b) eVar.getValue()).c.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 17));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.i30.e) this.m.getValue());
    }

    @Override // com.amazon.aps.iva.i30.g
    public final void w2(String str) {
        ((com.amazon.aps.iva.v60.b) this.k.getValue()).d.setText(getString(R.string.downgrade_success_title, str));
    }
}
