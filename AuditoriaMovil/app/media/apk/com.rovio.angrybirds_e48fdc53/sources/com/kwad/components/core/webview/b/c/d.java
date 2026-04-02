package com.kwad.components.core.webview.b.c;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.kwad.components.core.o.g;
import com.kwad.components.offline.api.tk.model.StyleTemplate;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.mvp.Presenter;
import com.kwad.sdk.widget.KSFrameLayout;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class d extends g {
    public com.kwad.components.core.webview.b.e.c QN;
    protected StyleTemplate QP;
    private KSFrameLayout XA;
    protected List<DialogInterface.OnDismissListener> XB = new CopyOnWriteArrayList();
    public boolean XC = false;
    protected com.kwad.components.core.webview.b.c.b Xr;
    protected com.kwad.sdk.components.g Xt;
    public boolean Xu;
    public a Xv;
    private com.kwad.components.core.webview.b.e.d Xy;
    public AdTemplate mAdTemplate;
    private Presenter mPresenter;
    public String xH;

    /* loaded from: classes.dex */
    public interface a {
        boolean gk();
    }

    /* loaded from: classes.dex */
    public static class b {
        private boolean XC;
        private StyleTemplate XE;
        private com.kwad.sdk.components.g Xt;
        private boolean Xu;
        private AdTemplate mAdTemplate;
        private String templateId;

        public final void a(StyleTemplate styleTemplate) {
            this.XE = styleTemplate;
        }

        public final void aP(String str) {
            this.templateId = str;
        }

        public final void aP(boolean z) {
            this.Xu = false;
        }

        public final void aQ(boolean z) {
            this.XC = true;
        }

        public final void c(com.kwad.sdk.components.g gVar) {
            this.Xt = gVar;
        }

        public final AdTemplate getAdTemplate() {
            return this.mAdTemplate;
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public final boolean sc() {
            return this.Xu;
        }

        public final boolean sd() {
            return this.XC;
        }

        public final void setAdTemplate(AdTemplate adTemplate) {
            this.mAdTemplate = adTemplate;
        }
    }

    private Presenter ad() {
        Presenter presenter = new Presenter();
        this.mPresenter = presenter;
        presenter.a(jt());
        return this.mPresenter;
    }

    public static d b(b bVar) {
        d dVar = new d();
        dVar.mAdTemplate = bVar.getAdTemplate();
        dVar.xH = bVar.getTemplateId();
        dVar.Xu = bVar.Xu;
        dVar.XC = bVar.XC;
        dVar.QP = bVar.XE;
        dVar.Xt = bVar.Xt;
        Bundle bundle = new Bundle();
        bundle.putString("templateId", bVar.getTemplateId());
        dVar.setArguments(bundle);
        return dVar;
    }

    private void y(View view) {
        if (this.mPresenter == null) {
            Presenter ad = ad();
            this.mPresenter = ad;
            ad.F(view);
            this.Xr = js();
        }
        ju();
        this.mPresenter.k(this.Xr);
    }

    @Override // com.kwad.components.core.o.g
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.XA == null) {
            this.XA = (KSFrameLayout) layoutInflater.inflate(R.layout.ksad_video_tk_dialog_layout, viewGroup, false);
        }
        return this.XA;
    }

    public final void a(com.kwad.components.core.webview.b.e.d dVar) {
        this.Xy = dVar;
    }

    public final void d(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.XB.add(onDismissListener);
        }
    }

    public final void e(DialogInterface.OnDismissListener onDismissListener) {
        this.XB.remove(onDismissListener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.kwad.components.core.webview.b.c.b js() {
        return new com.kwad.components.core.webview.b.c.b();
    }

    protected c jt() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ju() {
        this.Xr.mActivity = getActivity();
        this.Xr.VS = this;
        this.Xr.Xs = this.XA;
        this.Xr.mAdTemplate = this.mAdTemplate;
        this.Xr.xH = this.xH;
        this.Xr.QP = this.QP;
        this.Xr.Xu = this.Xu;
        this.Xr.Xt = this.Xt;
        this.Xr.Xv = this.Xv;
        this.Xr.QN = this.QN;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Window window;
        try {
            super.onActivityCreated(bundle);
        } catch (Throwable th) {
        }
        if (getDialog() == null || (window = getDialog().getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.0f;
        window.setAttributes(attributes);
        getDialog().setCanceledOnTouchOutside(false);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setLayout(-1, -1);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        window.setSoftInputMode(16);
        if (this.XC) {
            getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.kwad.components.core.webview.b.c.d.1
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return i == 4 && keyEvent.getAction() == 0;
                }
            });
        }
        window.setFlags(1024, 1024);
        if (this.XC) {
            getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.kwad.components.core.webview.b.c.d.2
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return i == 4 && keyEvent.getAction() == 0;
                }
            });
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.xH = getArguments().getString("templateId");
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Presenter presenter = this.mPresenter;
        if (presenter != null) {
            presenter.destroy();
            this.mPresenter = null;
        }
        com.kwad.components.core.webview.b.c.b bVar = this.Xr;
        if (bVar != null) {
            bVar.release();
            this.Xr = null;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        KSFrameLayout kSFrameLayout = this.XA;
        if (kSFrameLayout != null && (kSFrameLayout.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.XA.getParent()).removeView(this.XA);
            this.XA = null;
        }
        com.kwad.components.core.webview.b.e.d dVar = this.Xy;
        if (dVar != null) {
            dVar.gq();
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.kwad.components.core.webview.b.e.c cVar = this.QN;
        if (cVar != null) {
            cVar.gq();
        }
        for (DialogInterface.OnDismissListener onDismissListener : this.XB) {
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
        }
        com.kwad.sdk.components.g gVar = this.Xt;
        if (gVar != null) {
            gVar.callbackDialogDismiss();
        }
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        y(view);
        com.kwad.components.core.webview.b.e.c cVar = this.QN;
        if (cVar != null) {
            cVar.gi();
        }
        com.kwad.components.core.webview.b.e.d dVar = this.Xy;
        if (dVar != null) {
            dVar.gi();
        }
    }
}
