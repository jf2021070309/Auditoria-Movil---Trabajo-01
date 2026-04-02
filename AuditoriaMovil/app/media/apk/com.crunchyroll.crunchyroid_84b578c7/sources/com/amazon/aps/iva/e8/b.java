package com.amazon.aps.iva.e8;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.mediarouter.app.MediaRouteButton;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.f8.q0;
/* compiled from: MediaRouteActionProvider.java */
/* loaded from: classes.dex */
public class b extends com.amazon.aps.iva.p3.b {
    private static final String TAG = "MRActionProvider";
    private MediaRouteButton mButton;
    private f mDialogFactory;
    private final f0 mRouter;
    private e0 mSelector;

    public b(Context context) {
        super(context);
        this.mSelector = e0.c;
        this.mDialogFactory = f.getDefault();
        this.mRouter = f0.d(context);
    }

    @Deprecated
    public void enableDynamicGroup() {
        q0 q0Var;
        q0.a aVar;
        this.mRouter.getClass();
        f0.b();
        f0.d c = f0.c();
        if (c == null) {
            q0Var = null;
        } else {
            q0Var = c.q;
        }
        if (q0Var == null) {
            aVar = new q0.a();
        } else {
            aVar = new q0.a(q0Var);
        }
        aVar.a = 2;
        f0 f0Var = this.mRouter;
        q0 q0Var2 = new q0(aVar);
        f0Var.getClass();
        f0.k(q0Var2);
    }

    public f getDialogFactory() {
        return this.mDialogFactory;
    }

    public MediaRouteButton getMediaRouteButton() {
        return this.mButton;
    }

    public e0 getRouteSelector() {
        return this.mSelector;
    }

    @Override // com.amazon.aps.iva.p3.b
    public View onCreateActionView() {
        MediaRouteButton onCreateMediaRouteButton = onCreateMediaRouteButton();
        this.mButton = onCreateMediaRouteButton;
        onCreateMediaRouteButton.setCheatSheetEnabled(true);
        this.mButton.setRouteSelector(this.mSelector);
        this.mButton.setDialogFactory(this.mDialogFactory);
        this.mButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.mButton;
    }

    public MediaRouteButton onCreateMediaRouteButton() {
        return new MediaRouteButton(getContext(), null);
    }

    @Override // com.amazon.aps.iva.p3.b
    public boolean onPerformDefaultAction() {
        MediaRouteButton mediaRouteButton = this.mButton;
        if (mediaRouteButton != null) {
            return mediaRouteButton.c();
        }
        return false;
    }

    public void setDialogFactory(f fVar) {
        if (fVar != null) {
            if (this.mDialogFactory != fVar) {
                this.mDialogFactory = fVar;
                MediaRouteButton mediaRouteButton = this.mButton;
                if (mediaRouteButton != null) {
                    mediaRouteButton.setDialogFactory(fVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("factory must not be null");
    }

    public void setRouteSelector(e0 e0Var) {
        if (e0Var != null) {
            if (!this.mSelector.equals(e0Var)) {
                this.mSelector = e0Var;
                MediaRouteButton mediaRouteButton = this.mButton;
                if (mediaRouteButton != null) {
                    mediaRouteButton.setRouteSelector(e0Var);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Deprecated
    public void setAlwaysVisible(boolean z) {
    }
}
