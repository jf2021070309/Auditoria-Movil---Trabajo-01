package com.kwad.components.core.o;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public abstract class d extends AlertDialog {
    public Activity mActivity;
    protected final Context mContext;
    protected ViewGroup zz;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Activity activity) {
        super(activity);
        setOwnerActivity(activity);
        this.mActivity = activity;
        this.mContext = l.wrapContextIfNeed(activity);
    }

    protected ViewGroup cg() {
        return null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        try {
            l.h(activity);
        } catch (Throwable th) {
        }
        try {
            super.dismiss();
        } catch (Throwable th2) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th2);
        }
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        T t = (T) this.zz.findViewById(i);
        return t != null ? t : (T) super.findViewById(i);
    }

    protected abstract void g(View view);

    protected abstract int getLayoutId();

    protected boolean ne() {
        return false;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.zz = getLayoutId() != 0 ? (ViewGroup) l.inflate(this.mContext, getLayoutId(), null) : cg();
            setContentView(this.zz);
            setCanceledOnTouchOutside(ne());
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().clearFlags(131072);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            setCancelable(true);
            g(this.zz);
        } catch (Throwable th) {
            if (!KsAdSDKImpl.get().getIsExternal()) {
                throw th;
            }
            com.kwad.components.core.d.a.b(th);
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        setTitle((CharSequence) null);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(i);
        this.zz = (ViewGroup) l.inflate(this.mContext, i, null);
    }
}
