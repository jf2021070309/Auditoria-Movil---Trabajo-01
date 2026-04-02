package com.kwad.components.ad.splashscreen.c;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
public final class g extends e {
    private static void j(View view, int i) {
        if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.topMargin = i;
            view.setLayoutParams(layoutParams);
        } else if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.topMargin = i;
            view.setLayoutParams(layoutParams2);
        }
    }

    private void la() {
        bj.postOnUiThread(new Runnable() { // from class: com.kwad.components.ad.splashscreen.c.g.1
            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.getActivity() != null) {
                    try {
                        ViewGroup viewGroup = (ViewGroup) g.this.getActivity().getWindow().getDecorView();
                        if (com.kwad.sdk.d.a.a.B(viewGroup) && com.kwad.sdk.d.a.a.aI(g.this.getActivity()) == viewGroup.getHeight()) {
                            g.this.lb();
                        }
                    } catch (Throwable th) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lb() {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate);
        j(this.CS.p(ck).findViewById(R.id.ksad_preload_container), t(ck));
        if (com.kwad.components.ad.splashscreen.f.c.v(ck)) {
            j(this.CS.mRootContainer.findViewById(R.id.ksad_splash_logo_container), com.kwad.sdk.d.a.a.getStatusBarHeight(getActivity()) + com.kwad.sdk.d.a.a.a(getContext(), 12.0f));
            j(this.CS.mRootContainer.findViewById(R.id.ksad_splash_sound), com.kwad.sdk.d.a.a.getStatusBarHeight(getActivity()) + com.kwad.sdk.d.a.a.a(getContext(), 32.0f));
            j(this.CS.mRootContainer.findViewById(R.id.ksad_skip_view_area), com.kwad.sdk.d.a.a.getStatusBarHeight(getActivity()));
        }
    }

    private int t(AdInfo adInfo) {
        Activity activity;
        float f;
        if (com.kwad.components.ad.splashscreen.f.c.v(adInfo)) {
            activity = getActivity();
            f = 32.0f;
        } else {
            activity = getActivity();
            f = 16.0f;
        }
        return com.kwad.sdk.d.a.a.a(activity, f) + com.kwad.sdk.d.a.a.getStatusBarHeight(getActivity());
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        la();
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onCreate() {
        super.onCreate();
    }
}
