package com.amazon.aps.iva.m70;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.c8.h;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.pu.l;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: LoadingStateLayout.kt */
/* loaded from: classes2.dex */
public final class c extends RelativeLayout implements f {
    public static final /* synthetic */ int d = 0;
    public final com.amazon.aps.iva.f70.c b;
    public final e c;

    public c(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_loading_state, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.error_message;
        TextView textView = (TextView) z.u(R.id.error_message, inflate);
        if (textView != null) {
            i = R.id.loading_state_empty_container;
            View u = z.u(R.id.loading_state_empty_container, inflate);
            if (u != null) {
                int i2 = R.id.loading_state_empty_icon;
                ImageView imageView = (ImageView) z.u(R.id.loading_state_empty_icon, u);
                if (imageView != null) {
                    i2 = R.id.loading_state_empty_subtitle;
                    TextView textView2 = (TextView) z.u(R.id.loading_state_empty_subtitle, u);
                    if (textView2 != null) {
                        i2 = R.id.loading_state_empty_title;
                        TextView textView3 = (TextView) z.u(R.id.loading_state_empty_title, u);
                        if (textView3 != null) {
                            l lVar = new l((LinearLayout) u, imageView, textView2, textView3, 1);
                            int i3 = R.id.loading_state_error_container;
                            LinearLayout linearLayout = (LinearLayout) z.u(R.id.loading_state_error_container, inflate);
                            if (linearLayout != null) {
                                i3 = R.id.loading_state_progress;
                                View u2 = z.u(R.id.loading_state_progress, inflate);
                                if (u2 != null) {
                                    ProgressBar progressBar = (ProgressBar) u2;
                                    com.amazon.aps.iva.pu.f fVar = new com.amazon.aps.iva.pu.f(progressBar, progressBar, 1);
                                    i3 = R.id.retry_button;
                                    TextView textView4 = (TextView) z.u(R.id.retry_button, inflate);
                                    if (textView4 != null) {
                                        this.b = new com.amazon.aps.iva.f70.c((FrameLayout) inflate, textView, lVar, linearLayout, fVar, textView4);
                                        this.c = new e(this);
                                        setGravity(17);
                                        return;
                                    }
                                }
                            }
                            i = i3;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(u.getResources().getResourceName(i2)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.amazon.aps.iva.m70.f
    public final void Bc() {
        this.b.f.setOnClickListener(null);
    }

    @Override // com.amazon.aps.iva.m70.f
    public final void L4(int i, int i2, d dVar) {
        com.amazon.aps.iva.f70.c cVar = this.b;
        cVar.b.setText(i);
        TextView textView = cVar.f;
        textView.setText(i2);
        textView.setOnClickListener(new h(dVar, 23));
        LinearLayout linearLayout = cVar.d;
        j.e(linearLayout, "binding.loadingStateErrorContainer");
        linearLayout.setVisibility(0);
        ProgressBar progressBar = (ProgressBar) cVar.e.b;
        j.e(progressBar, "binding.loadingStateProgress.root");
        progressBar.setVisibility(8);
        LinearLayout linearLayout2 = cVar.c.b;
        j.e(linearLayout2, "binding.loadingStateEmptyContainer.root");
        linearLayout2.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.m70.f
    public final void a() {
        com.amazon.aps.iva.f70.c cVar = this.b;
        ProgressBar progressBar = (ProgressBar) cVar.e.b;
        j.e(progressBar, "binding.loadingStateProgress.root");
        progressBar.setVisibility(0);
        LinearLayout linearLayout = cVar.d;
        j.e(linearLayout, "binding.loadingStateErrorContainer");
        linearLayout.setVisibility(8);
        LinearLayout a = cVar.c.a();
        j.e(a, "binding.loadingStateEmptyContainer.root");
        a.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.m70.f
    public final void q3(int i, int i2, int i3) {
        com.amazon.aps.iva.f70.c cVar = this.b;
        LinearLayout linearLayout = cVar.c.b;
        j.e(linearLayout, "binding.loadingStateEmptyContainer.root");
        linearLayout.setVisibility(0);
        l lVar = cVar.c;
        ((ImageView) lVar.c).setImageResource(i);
        ((TextView) lVar.e).setText(i2);
        ((TextView) lVar.d).setText(i3);
        LinearLayout linearLayout2 = cVar.d;
        j.e(linearLayout2, "binding.loadingStateErrorContainer");
        linearLayout2.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) cVar.e.b;
        j.e(progressBar, "binding.loadingStateProgress.root");
        progressBar.setVisibility(8);
    }
}
