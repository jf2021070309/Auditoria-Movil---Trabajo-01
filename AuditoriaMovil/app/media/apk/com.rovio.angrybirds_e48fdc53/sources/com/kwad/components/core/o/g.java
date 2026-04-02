package com.kwad.components.core.o;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.sdk.m;
import com.kwad.sdk.m.l;
import com.kwad.sdk.utils.s;
/* loaded from: classes.dex */
public abstract class g extends DialogFragment {
    private int a(FragmentTransaction fragmentTransaction, String str) {
        try {
            s.a(this, "mDismissed", Boolean.FALSE);
            s.a(this, "mShownByMe", Boolean.TRUE);
            s.a(this, "mViewDestroyed", Boolean.FALSE);
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
        return fragmentTransaction.add(this, str).commitAllowingStateLoss();
    }

    protected abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // android.app.DialogFragment
    public void dismiss() {
        try {
            if (getActivity() != null && !getActivity().isFinishing()) {
                super.dismissAllowingStateLoss();
            } else if (getActivity() == null) {
                super.dismissAllowingStateLoss();
            }
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }

    @Override // android.app.Fragment
    public Context getContext() {
        return l.wrapContextIfNeed(super.getContext());
    }

    public final boolean isShowing() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onAttach(Context context) {
        m.checkInitSDK(context);
        super.onAttach(l.wrapContextIfNeed(context));
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater dA = l.dA(l.wrapContextIfNeed(layoutInflater.getContext()));
        getDialog().requestWindowFeature(1);
        return a(dA, viewGroup);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return l.dA(l.wrapContextIfNeed(super.onGetLayoutInflater(bundle).getContext()));
    }

    @Override // android.app.DialogFragment
    public int show(FragmentTransaction fragmentTransaction, String str) {
        try {
            return super.show(fragmentTransaction, str);
        } catch (Throwable th) {
            return a(fragmentTransaction, str);
        }
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        try {
            super.show(fragmentManager, str);
        } catch (Throwable th) {
            try {
                s.f(this, "showAllowingStateLoss", fragmentManager, str);
            } catch (Throwable th2) {
                com.kwad.sdk.core.e.c.printStackTraceOnly(th2);
                a(fragmentManager.beginTransaction(), str);
            }
        }
    }
}
