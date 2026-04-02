package com.ellation.crunchyroll.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.ui.R;
import com.ellation.widgets.bottommessage.error.ErrorBottomMessageView;
/* loaded from: classes2.dex */
public final class LayoutErrorsBinding implements a {
    public final FrameLayout errorsLayout;
    public final ErrorBottomMessageView noNetworkMessageView;
    private final FrameLayout rootView;

    private LayoutErrorsBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ErrorBottomMessageView errorBottomMessageView) {
        this.rootView = frameLayout;
        this.errorsLayout = frameLayout2;
        this.noNetworkMessageView = errorBottomMessageView;
    }

    public static LayoutErrorsBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = R.id.no_network_message_view;
        ErrorBottomMessageView errorBottomMessageView = (ErrorBottomMessageView) z.u(i, view);
        if (errorBottomMessageView != null) {
            return new LayoutErrorsBinding(frameLayout, frameLayout, errorBottomMessageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static LayoutErrorsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutErrorsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_errors, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
