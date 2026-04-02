package com.amazon.aps.iva.e;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.g;
import com.amazon.aps.iva.i5.i0;
/* compiled from: ComponentDialog.kt */
/* loaded from: classes.dex */
public class j extends Dialog implements com.amazon.aps.iva.i5.o, v, com.amazon.aps.iva.s8.c {
    private androidx.lifecycle.k _lifecycleRegistry;
    private final OnBackPressedDispatcher onBackPressedDispatcher;
    private final com.amazon.aps.iva.s8.b savedStateRegistryController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        this(context, 0, 2, null);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    private final androidx.lifecycle.k getLifecycleRegistry() {
        androidx.lifecycle.k kVar = this._lifecycleRegistry;
        if (kVar == null) {
            androidx.lifecycle.k kVar2 = new androidx.lifecycle.k(this);
            this._lifecycleRegistry = kVar2;
            return kVar2;
        }
        return kVar;
    }

    public static final void onBackPressedDispatcher$lambda$1(j jVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // com.amazon.aps.iva.e.v
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // com.amazon.aps.iva.s8.c
    public androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        com.amazon.aps.iva.yb0.j.c(window);
        View decorView = window.getDecorView();
        com.amazon.aps.iva.yb0.j.e(decorView, "window!!.decorView");
        i0.b(decorView, this);
        Window window2 = getWindow();
        com.amazon.aps.iva.yb0.j.c(window2);
        View decorView2 = window2.getDecorView();
        com.amazon.aps.iva.yb0.j.e(decorView2, "window!!.decorView");
        z.O(decorView2, this);
        Window window3 = getWindow();
        com.amazon.aps.iva.yb0.j.c(window3);
        View decorView3 = window3.getDecorView();
        com.amazon.aps.iva.yb0.j.e(decorView3, "window!!.decorView");
        com.amazon.aps.iva.s8.d.b(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.onBackPressedDispatcher;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            com.amazon.aps.iva.yb0.j.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.getClass();
            onBackPressedDispatcher.f = onBackInvokedDispatcher;
            onBackPressedDispatcher.d(onBackPressedDispatcher.h);
        }
        this.savedStateRegistryController.b(bundle);
        getLifecycleRegistry().c(g.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        com.amazon.aps.iva.yb0.j.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().c(g.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry().c(g.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    public /* synthetic */ j(Context context, int i, int i2, com.amazon.aps.iva.yb0.e eVar) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, int i) {
        super(context, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.savedStateRegistryController = new com.amazon.aps.iva.s8.b(this);
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new i(this, 0));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
