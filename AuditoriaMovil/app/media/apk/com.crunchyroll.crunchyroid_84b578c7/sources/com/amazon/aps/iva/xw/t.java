package com.amazon.aps.iva.xw;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.q.j1;
import com.amazon.aps.iva.v1.t2;
/* compiled from: FragmentExtensions.kt */
/* loaded from: classes2.dex */
public final class t {
    public static final ComposeView a(Fragment fragment, com.amazon.aps.iva.v0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setViewCompositionStrategy(t2.a.a);
        composeView.setContent(aVar);
        return composeView;
    }

    public static final void b(Fragment fragment, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(fragment, "<this>");
        androidx.fragment.app.h activity = fragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new j1(aVar, 6));
        }
    }
}
