package com.unity3d.services.ar.view;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import com.google.ar.core.Session;
/* loaded from: classes2.dex */
public class DisplayRotationHelper implements DisplayManager.DisplayListener {
    private final Context context;
    private final Display display;
    private boolean viewportChanged;
    private int viewportHeight;
    private int viewportWidth;

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DisplayRotationHelper(Context context) {
        this.context = context;
        this.display = ((WindowManager) context.getSystemService(WindowManager.class)).getDefaultDisplay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onResume() {
        ((DisplayManager) this.context.getSystemService(DisplayManager.class)).registerDisplayListener(this, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPause() {
        ((DisplayManager) this.context.getSystemService(DisplayManager.class)).unregisterDisplayListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onSurfaceChanged(int i, int i2) {
        this.viewportWidth = i;
        this.viewportHeight = i2;
        this.viewportChanged = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateSessionIfNeeded(Session session) {
        if (this.viewportChanged) {
            session.setDisplayGeometry(this.display.getRotation(), this.viewportWidth, this.viewportHeight);
            this.viewportChanged = false;
        }
    }

    public int getRotation() {
        return this.display.getRotation();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        this.viewportChanged = true;
    }
}
