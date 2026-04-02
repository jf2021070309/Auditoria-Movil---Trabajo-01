package com.kwad.components.ad.splashscreen.f;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.kwad.components.ad.splashscreen.e;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.widget.f;
/* loaded from: classes.dex */
public final class b implements com.kwad.sdk.widget.c {
    private a De;
    private ViewStub EQ;
    private ViewGroup ER;
    private View ES;
    private TextView ET;
    private boolean EU;
    private e EV;
    private f EW;
    private ViewGroup gi;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;

    public b(ViewGroup viewGroup, ViewStub viewStub, boolean z, com.kwad.components.core.e.d.c cVar) {
        this.gi = viewGroup;
        this.EQ = viewStub;
        this.mApkDownloadHelper = cVar;
        this.EU = z;
    }

    private void a(com.kwad.components.ad.splashscreen.d dVar) {
        if (dVar == null) {
            return;
        }
        ac(dVar.kz());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(String str) {
        TextView textView = this.ET;
        if (textView == null || str == null) {
            return;
        }
        textView.setText(str);
    }

    private void g(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        this.ES = viewGroup.findViewById(R.id.ksad_splash_actionbar_native);
        this.ET = (TextView) viewGroup.findViewById(R.id.ksad_splash_actionbar_text);
        this.EW = new f(this.ES.getContext(), this.ES, this);
        this.ES.getContext();
        a(com.kwad.components.ad.splashscreen.d.a(this.mAdTemplate, this.mAdInfo, this.mApkDownloadHelper, 4));
    }

    private void g(boolean z, boolean z2) {
        e eVar = this.EV;
        if (eVar != null) {
            eVar.f(z, z2);
        }
    }

    public final void J(AdTemplate adTemplate) {
        a aVar;
        this.mAdTemplate = adTemplate;
        a aVar2 = this.De;
        if (aVar2 == null) {
            this.De = new a(this.gi.getContext(), this.mAdTemplate) { // from class: com.kwad.components.ad.splashscreen.f.b.1
                @Override // com.kwad.components.ad.splashscreen.f.a
                protected final void aa(String str) {
                    b.this.ac(str);
                }
            };
        } else {
            aVar2.setAdTemplate(adTemplate);
        }
        if (adTemplate != null) {
            this.mAdInfo = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        }
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar == null || (aVar = this.De) == null) {
            return;
        }
        cVar.b(aVar);
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        g(true, view.equals(this.ES));
    }

    public final void a(e eVar) {
        this.EV = eVar;
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (this.EU) {
            g(false, view.equals(this.ES));
        }
    }

    public final void lv() {
        com.kwad.sdk.core.e.c.d("SplashActionBarNativeHelper", "rollBackToNative mRootViewStub: " + this.EQ);
        if (this.ER == null) {
            ViewStub viewStub = this.EQ;
            this.ER = (ViewGroup) ((viewStub == null || viewStub.getParent() == null) ? this.gi.findViewById(R.id.ksad_splash_actionbar_native_root) : this.EQ.inflate());
            g(this.ER);
        }
        ViewGroup viewGroup = this.ER;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    public final void onUnbind() {
        a aVar;
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar == null || (aVar = this.De) == null) {
            return;
        }
        cVar.c(aVar);
    }
}
