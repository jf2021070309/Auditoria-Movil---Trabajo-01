package com.crunchyroll.restrictedstate;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.c8.h;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.en.d;
import com.amazon.aps.iva.en.f;
import com.amazon.aps.iva.k50.c;
import com.amazon.aps.iva.kb0.e;
import com.amazon.aps.iva.kb0.g;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: UserRestrictedStateActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/crunchyroll/restrictedstate/UserRestrictedStateActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/en/f;", "<init>", "()V", "restricted-state_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UserRestrictedStateActivity extends com.amazon.aps.iva.i60.b implements f {
    public static final /* synthetic */ int m = 0;
    public final e k = com.amazon.aps.iva.kb0.f.a(g.NONE, new b(this, this));
    public final m l = com.amazon.aps.iva.kb0.f.b(new a());

    /* compiled from: UserRestrictedStateActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<d> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            UserRestrictedStateActivity userRestrictedStateActivity = UserRestrictedStateActivity.this;
            j.f(userRestrictedStateActivity, "context");
            c cVar = new c(userRestrictedStateActivity, "");
            int i = UserRestrictedStateActivity.m;
            return new com.amazon.aps.iva.en.e(userRestrictedStateActivity, cVar, userRestrictedStateActivity.mi(), new com.amazon.aps.iva.en.c(com.amazon.aps.iva.ds.c.b));
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fn.a> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;
        public final /* synthetic */ UserRestrictedStateActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.k.c cVar, UserRestrictedStateActivity userRestrictedStateActivity) {
            super(0);
            this.h = cVar;
            this.i = userRestrictedStateActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.fn.a invoke() {
            j.e(this.h.getLayoutInflater(), "layoutInflater");
            View inflate = LayoutInflater.from(this.i).inflate(R.layout.activity_user_restricted_state, (ViewGroup) null, false);
            int i = R.id.close;
            ImageView imageView = (ImageView) z.u(R.id.close, inflate);
            if (imageView != null) {
                i = R.id.cta_contact_support;
                TextView textView = (TextView) z.u(R.id.cta_contact_support, inflate);
                if (textView != null) {
                    i = R.id.hime;
                    if (((ImageView) z.u(R.id.hime, inflate)) != null) {
                        i = R.id.text_header;
                        TextView textView2 = (TextView) z.u(R.id.text_header, inflate);
                        if (textView2 != null) {
                            i = R.id.text_subheader;
                            TextView textView3 = (TextView) z.u(R.id.text_subheader, inflate);
                            if (textView3 != null) {
                                return new com.amazon.aps.iva.fn.a(imageView, textView, textView2, textView3, (ConstraintLayout) inflate);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    @Override // com.amazon.aps.iva.en.f
    public final void kb(int i) {
        ((com.amazon.aps.iva.fn.a) this.k.getValue()).e.setText(getString(i));
    }

    public final com.amazon.aps.iva.en.g mi() {
        com.amazon.aps.iva.en.g gVar;
        Object obj;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = extras.getSerializable("user_restriction_input", com.amazon.aps.iva.en.g.class);
            } else {
                obj = (com.amazon.aps.iva.en.g) extras.getSerializable("user_restriction_input");
            }
            gVar = (com.amazon.aps.iva.en.g) obj;
        } else {
            gVar = null;
        }
        j.c(gVar);
        return gVar;
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = this.k;
        ConstraintLayout constraintLayout = ((com.amazon.aps.iva.fn.a) eVar.getValue()).a;
        j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        ((com.amazon.aps.iva.fn.a) eVar.getValue()).b.setOnClickListener(new h(this, 8));
        ((com.amazon.aps.iva.fn.a) eVar.getValue()).c.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 2));
    }

    @Override // com.amazon.aps.iva.en.f
    public final void setHeaderText(int i) {
        ((com.amazon.aps.iva.fn.a) this.k.getValue()).d.setText(getString(i));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((d) this.l.getValue());
    }
}
