package com.ellation.crunchyroll.commenting.comments.pendingstate.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.g;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ju.d;
import com.amazon.aps.iva.pu.i;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.button.ButtonBarLayout;
import kotlin.Metadata;
/* compiled from: PendingStateBannerLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/commenting/comments/pendingstate/banner/PendingStateBannerLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/amazon/aps/iva/ju/d;", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PendingStateBannerLayout extends ConstraintLayout implements d {
    public static final /* synthetic */ int c = 0;
    public final i b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PendingStateBannerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.ju.d
    public final void Hd() {
        TextView textView = this.b.c;
        j.e(textView, "binding.commentingBannerVerifyEmailButton");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.ju.d
    public final void Ia() {
        TextView textView = this.b.c;
        j.e(textView, "binding.commentingBannerVerifyEmailButton");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ju.d
    public final void Tg() {
        TextView textView = this.b.d;
        j.e(textView, "binding.commentsBannerCreateUsernameButton");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.ju.d
    public final void Vf() {
        TextView textView = this.b.d;
        j.e(textView, "binding.commentsBannerCreateUsernameButton");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ju.d
    public final void f3() {
        TextView textView = this.b.b;
        j.e(textView, "binding.commentingBannerAndText");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i5.o
    public g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.ju.d
    public final void hh() {
        TextView textView = this.b.b;
        j.e(textView, "binding.commentingBannerAndText");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.ju.d
    /* renamed from: if */
    public final void mo21if() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ju.d
    public final void tc() {
        setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingStateBannerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_comments_account_pending_banner, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.buttons_container;
        if (((ButtonBarLayout) z.u(R.id.buttons_container, inflate)) != null) {
            i2 = R.id.commenting_banner_and_text;
            TextView textView = (TextView) z.u(R.id.commenting_banner_and_text, inflate);
            if (textView != null) {
                i2 = R.id.commenting_banner_verify_email_button;
                TextView textView2 = (TextView) z.u(R.id.commenting_banner_verify_email_button, inflate);
                if (textView2 != null) {
                    i2 = R.id.comments_banner_create_username_button;
                    TextView textView3 = (TextView) z.u(R.id.comments_banner_create_username_button, inflate);
                    if (textView3 != null) {
                        i2 = R.id.comments_banner_title;
                        if (((TextView) z.u(R.id.comments_banner_title, inflate)) != null) {
                            this.b = new i((LinearLayout) inflate, textView, textView2, textView3);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
