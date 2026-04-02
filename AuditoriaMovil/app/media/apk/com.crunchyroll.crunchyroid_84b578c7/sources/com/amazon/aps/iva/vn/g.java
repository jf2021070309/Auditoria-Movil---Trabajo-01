package com.amazon.aps.iva.vn;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.vn.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: CrStoreFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/aps/iva/vn/g;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "cr-store_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class g extends Fragment {
    public WebView b;

    /* compiled from: CrStoreFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public final /* synthetic */ i h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super(1);
            this.h = iVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            this.h.setVisible(bool.booleanValue());
            return q.a;
        }
    }

    public final void ci() {
        WebView webView = this.b;
        if (webView != null) {
            int i = e.a;
            d dVar = e.a.a;
            if (dVar != null) {
                webView.loadUrl(dVar.a().c0());
                return;
            } else {
                j.m("dependencies");
                throw null;
            }
        }
        j.m("webView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        i iVar = new i(requireContext);
        Context requireContext2 = requireContext();
        j.e(requireContext2, "requireContext()");
        a aVar = new a(iVar);
        WebView webView = new WebView(requireContext2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new com.amazon.aps.iva.wn.b(aVar));
        webView.setWebChromeClient(new com.amazon.aps.iva.wn.a());
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        this.b = webView;
        h hVar = new h(webView, this);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        o viewLifecycleOwner = getViewLifecycleOwner();
        j.e(viewLifecycleOwner, "viewLifecycleOwner");
        onBackPressedDispatcher.a(viewLifecycleOwner, hVar);
        FrameLayout frameLayout = new FrameLayout(requireContext());
        WebView webView2 = this.b;
        if (webView2 != null) {
            webView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(webView2);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            iVar.setLayoutParams(layoutParams);
            frameLayout.addView(iVar);
            return frameLayout;
        }
        j.m("webView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        j.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        WebView webView = this.b;
        if (webView != null) {
            webView.saveState(bundle);
        } else {
            j.m("webView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            ci();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            WebView webView = this.b;
            if (webView != null) {
                webView.restoreState(bundle);
            } else {
                j.m("webView");
                throw null;
            }
        }
    }
}
