package com.amazon.aps.iva.e8;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.amazon.aps.iva.f8.e0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: MediaRouteChooserDialogFragment.java */
/* loaded from: classes.dex */
public class d extends androidx.fragment.app.g {
    private static final String ARGUMENT_SELECTOR = "selector";
    private Dialog mDialog;
    private e0 mSelector;
    private boolean mUseDynamicGroup = false;

    public d() {
        setCancelable(true);
    }

    private void ensureRouteSelector() {
        if (this.mSelector == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mSelector = e0.b(arguments.getBundle(ARGUMENT_SELECTOR));
            }
            if (this.mSelector == null) {
                this.mSelector = e0.c;
            }
        }
    }

    public e0 getRouteSelector() {
        ensureRouteSelector();
        return this.mSelector;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int a;
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.mDialog;
        if (dialog == null) {
            return;
        }
        if (this.mUseDynamicGroup) {
            h hVar = (h) dialog;
            Context context = hVar.d;
            int i = -1;
            if (!context.getResources().getBoolean(R.bool.is_tablet)) {
                a = -1;
            } else {
                a = g.a(context);
            }
            if (context.getResources().getBoolean(R.bool.is_tablet)) {
                i = -2;
            }
            hVar.getWindow().setLayout(a, i);
            return;
        }
        ((c) dialog).updateLayout();
    }

    public c onCreateChooserDialog(Context context, Bundle bundle) {
        return new c(context);
    }

    @Override // androidx.fragment.app.g
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.mUseDynamicGroup) {
            h onCreateDynamicChooserDialog = onCreateDynamicChooserDialog(getContext());
            this.mDialog = onCreateDynamicChooserDialog;
            onCreateDynamicChooserDialog.setRouteSelector(getRouteSelector());
        } else {
            c onCreateChooserDialog = onCreateChooserDialog(getContext(), bundle);
            this.mDialog = onCreateChooserDialog;
            onCreateChooserDialog.setRouteSelector(getRouteSelector());
        }
        return this.mDialog;
    }

    public h onCreateDynamicChooserDialog(Context context) {
        return new h(context);
    }

    public void setRouteSelector(e0 e0Var) {
        if (e0Var != null) {
            ensureRouteSelector();
            if (!this.mSelector.equals(e0Var)) {
                this.mSelector = e0Var;
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putBundle(ARGUMENT_SELECTOR, e0Var.a);
                setArguments(arguments);
                Dialog dialog = this.mDialog;
                if (dialog != null) {
                    if (this.mUseDynamicGroup) {
                        ((h) dialog).setRouteSelector(e0Var);
                        return;
                    } else {
                        ((c) dialog).setRouteSelector(e0Var);
                        return;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public void setUseDynamicGroup(boolean z) {
        if (this.mDialog == null) {
            this.mUseDynamicGroup = z;
            return;
        }
        throw new IllegalStateException("This must be called before creating dialog");
    }
}
