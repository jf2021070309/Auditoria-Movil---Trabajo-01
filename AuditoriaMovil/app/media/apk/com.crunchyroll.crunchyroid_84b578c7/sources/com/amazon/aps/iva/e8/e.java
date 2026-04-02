package com.amazon.aps.iva.e8;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.amazon.aps.iva.f8.e0;
/* compiled from: MediaRouteControllerDialogFragment.java */
/* loaded from: classes.dex */
public class e extends androidx.fragment.app.g {
    private static final String ARGUMENT_SELECTOR = "selector";
    private Dialog mDialog;
    private e0 mSelector;
    private boolean mUseDynamicGroup = false;

    public e() {
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
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            if (this.mUseDynamicGroup) {
                ((androidx.mediarouter.app.b) dialog).updateLayout();
            } else {
                ((androidx.mediarouter.app.a) dialog).updateLayout();
            }
        }
    }

    public androidx.mediarouter.app.a onCreateControllerDialog(Context context, Bundle bundle) {
        return new androidx.mediarouter.app.a(context);
    }

    @Override // androidx.fragment.app.g
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.mUseDynamicGroup) {
            androidx.mediarouter.app.b onCreateDynamicControllerDialog = onCreateDynamicControllerDialog(getContext());
            this.mDialog = onCreateDynamicControllerDialog;
            onCreateDynamicControllerDialog.setRouteSelector(this.mSelector);
        } else {
            this.mDialog = onCreateControllerDialog(getContext(), bundle);
        }
        return this.mDialog;
    }

    public androidx.mediarouter.app.b onCreateDynamicControllerDialog(Context context) {
        return new androidx.mediarouter.app.b(context);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null && !this.mUseDynamicGroup) {
            ((androidx.mediarouter.app.a) dialog).clearGroupListAnimation(false);
        }
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
                if (dialog != null && this.mUseDynamicGroup) {
                    ((androidx.mediarouter.app.b) dialog).setRouteSelector(e0Var);
                    return;
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
