package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.amazon.aps.iva.e.b;
import com.google.android.material.motion.MaterialBackHandler;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class MaterialBackOrchestrator {
    private final BackCallbackDelegate backCallbackDelegate;
    private final MaterialBackHandler backHandler;
    private final View view;

    /* loaded from: classes3.dex */
    public static class Api33BackCallbackDelegate implements BackCallbackDelegate {
        private OnBackInvokedCallback onBackInvokedCallback;

        private Api33BackCallbackDelegate() {
        }

        public OnBackInvokedCallback createOnBackInvokedCallback(final MaterialBackHandler materialBackHandler) {
            Objects.requireNonNull(materialBackHandler);
            return new OnBackInvokedCallback() { // from class: com.amazon.aps.iva.x80.a
                public final void onBackInvoked() {
                    MaterialBackHandler.this.handleBackInvoked();
                }
            };
        }

        public boolean isListeningForBackCallbacks() {
            if (this.onBackInvokedCallback != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
            r3 = r3.findOnBackInvokedDispatcher();
         */
        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void startListeningForBackCallbacks(com.google.android.material.motion.MaterialBackHandler r2, android.view.View r3, boolean r4) {
            /*
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.onBackInvokedCallback
                if (r0 == 0) goto L5
                return
            L5:
                android.window.OnBackInvokedDispatcher r3 = com.amazon.aps.iva.d2.w.c(r3)
                if (r3 != 0) goto Lc
                return
            Lc:
                android.window.OnBackInvokedCallback r2 = r1.createOnBackInvokedCallback(r2)
                r1.onBackInvokedCallback = r2
                if (r4 == 0) goto L18
                r4 = 1000000(0xf4240, float:1.401298E-39)
                goto L19
            L18:
                r4 = 0
            L19:
                com.amazon.aps.iva.ap.b.c(r3, r4, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate.startListeningForBackCallbacks(com.google.android.material.motion.MaterialBackHandler, android.view.View, boolean):void");
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        public void stopListeningForBackCallbacks(View view) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher != null) {
                findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
                this.onBackInvokedCallback = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Api34BackCallbackDelegate extends Api33BackCallbackDelegate {
        private Api34BackCallbackDelegate() {
            super();
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        public OnBackInvokedCallback createOnBackInvokedCallback(final MaterialBackHandler materialBackHandler) {
            return new OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                public void onBackCancelled() {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.cancelBackProgress();
                }

                public void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.updateBackProgress(new b(backEvent));
                }

                public void onBackStarted(BackEvent backEvent) {
                    if (!Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        return;
                    }
                    materialBackHandler.startBackProgress(new b(backEvent));
                }
            };
        }
    }

    /* loaded from: classes3.dex */
    public interface BackCallbackDelegate {
        void startListeningForBackCallbacks(MaterialBackHandler materialBackHandler, View view, boolean z);

        void stopListeningForBackCallbacks(View view);
    }

    public <T extends View & MaterialBackHandler> MaterialBackOrchestrator(T t) {
        this(t, t);
    }

    private static BackCallbackDelegate createBackCallbackDelegate() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return new Api34BackCallbackDelegate();
        }
        if (i < 33) {
            return null;
        }
        return new Api33BackCallbackDelegate();
    }

    public boolean shouldListenForBackCallbacks() {
        if (this.backCallbackDelegate != null) {
            return true;
        }
        return false;
    }

    public void startListeningForBackCallbacks() {
        startListeningForBackCallbacks(false);
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
        startListeningForBackCallbacks(true);
    }

    public void stopListeningForBackCallbacks() {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.stopListeningForBackCallbacks(this.view);
        }
    }

    public MaterialBackOrchestrator(MaterialBackHandler materialBackHandler, View view) {
        this.backCallbackDelegate = createBackCallbackDelegate();
        this.backHandler = materialBackHandler;
        this.view = view;
    }

    private void startListeningForBackCallbacks(boolean z) {
        BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.startListeningForBackCallbacks(this.backHandler, this.view, z);
        }
    }
}
