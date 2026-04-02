package com.rovio.fusion;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.os.Build;
import android.view.SurfaceHolder;
import com.rovio.fusion.CameraPreview;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public class CameraWrapper implements Camera.PreviewCallback, CameraPreview.Listener, IActivityListener {
    private static final int CAMERA_BACK = 1;
    private static final int CAMERA_FRONT = 2;
    private static final int ERROR_GENERIC = 1;
    private static final int ERROR_INIT = 2;
    private static final int ERROR_SHOW = 3;
    private static final int STATUS_READY = 0;
    private static final ExecutorService smPool = Executors.newSingleThreadExecutor();
    private Camera a;
    private CameraPreview b;
    private long c;
    private int h;
    private boolean d = true;
    private boolean e = false;
    private boolean i = false;
    private boolean j = false;
    private Camera.Size f = null;
    private CameraPreview.Bounds g = null;

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeCameraStatus(long j, int i, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeProcessFrame(long j, byte[] bArr, int i, int i2);

    public CameraWrapper(int i, long j) {
        this.h = i;
        this.c = j;
        Globals.registerActivityListener(this);
        open(true);
    }

    public void destroy() {
        close();
        this.c = 0L;
        Globals.unregisterActivityListener(this);
    }

    public static boolean isAvailable(int i) {
        PackageManager packageManager = Globals.getActivity().getPackageManager();
        if (i == 1) {
            return packageManager.hasSystemFeature("android.hardware.camera");
        }
        if (i == 2 && Build.VERSION.SDK_INT > 8) {
            return packageManager.hasSystemFeature("android.hardware.camera.front");
        }
        return false;
    }

    public static boolean isSupported() {
        PackageManager packageManager = Globals.getActivity().getPackageManager();
        boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        if (!hasSystemFeature) {
            return packageManager.hasSystemFeature("android.hardware.camera.front");
        }
        return hasSystemFeature;
    }

    public void open(final boolean z) {
        this.d = true;
        smPool.submit(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                CameraWrapper.this.j = z;
                try {
                    CameraWrapper.this.a = CameraWrapper.getCameraInstance(CameraWrapper.this.h);
                    if (CameraWrapper.this.f != null) {
                        CameraWrapper.this.a(CameraWrapper.this.f);
                    } else {
                        CameraWrapper.this.f = CameraWrapper.this.a.getParameters().getPreviewSize();
                    }
                    if (CameraWrapper.this.g == null) {
                        CameraWrapper.this.g = new CameraPreview.Bounds(0, 0, 1, 1);
                    }
                    CameraWrapper.this.showPreview();
                } catch (RuntimeException e) {
                    CameraWrapper.this.a(2, e.getMessage());
                }
            }
        });
    }

    public void close() {
        this.d = false;
        hidePreview();
        smPool.submit(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.2
            @Override // java.lang.Runnable
            public void run() {
                if (CameraWrapper.this.a != null) {
                    CameraWrapper.this.a.release();
                }
                CameraWrapper.this.a = null;
            }
        });
    }

    public void showPreview() {
        smPool.submit(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.3
            @Override // java.lang.Runnable
            public void run() {
                CameraWrapper.this.a.startPreview();
                CameraWrapper.this.a.setPreviewCallback(CameraWrapper.this);
                CameraWrapper.this.e = true;
                Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CameraWrapper.this.b = new CameraPreview(CameraWrapper.this.g, CameraWrapper.this);
                        CameraWrapper.this.b.show();
                    }
                });
            }
        });
    }

    public void hidePreview() {
        smPool.submit(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.4
            @Override // java.lang.Runnable
            public void run() {
                CameraWrapper.this.a.setPreviewCallback(null);
                CameraWrapper.this.a.stopPreview();
                CameraWrapper.this.e = false;
                Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (CameraWrapper.this.b != null) {
                            CameraWrapper.this.b.hide();
                            CameraWrapper.this.b = null;
                        }
                    }
                });
            }
        });
    }

    public Object[] getSupportedImageResolutions() {
        if (this.a == null) {
            return new Object[0];
        }
        return this.a.getParameters().getSupportedPreviewSizes().toArray();
    }

    public boolean setImageResolution(int i, int i2) {
        if (this.a == null) {
            return false;
        }
        this.f = this.a.getParameters().getPreviewSize();
        if (this.f.width == i && this.f.height == i2) {
            return true;
        }
        for (Camera.Size size : this.a.getParameters().getSupportedPreviewSizes()) {
            if (size.width == i && size.height == i2) {
                Camera camera = this.a;
                camera.getClass();
                this.f = new Camera.Size(camera, i, i2);
                b(this.f);
                return true;
            }
        }
        return false;
    }

    public void setPreviewBounds(final int i, final int i2, final int i3, final int i4) {
        Globals.getActivity().runOnUiThread(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.5
            @Override // java.lang.Runnable
            public void run() {
                CameraWrapper.this.g = new CameraPreview.Bounds(i, i2, i3, i4);
                if (CameraWrapper.this.b != null) {
                    CameraWrapper.this.b.setBounds(CameraWrapper.this.g);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i, final String str) {
        Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.6
            @Override // java.lang.Runnable
            public void run() {
                if (CameraWrapper.this.c != 0 && CameraWrapper.this.d) {
                    CameraWrapper.this.nativeCameraStatus(CameraWrapper.this.c, i, str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Camera.Size size) {
        Camera.Parameters parameters = this.a.getParameters();
        parameters.setPreviewSize(size.width, size.height);
        try {
            this.a.setParameters(parameters);
        } catch (RuntimeException e) {
            a(1, "Setting camera resolution failed");
        }
    }

    private void b(final Camera.Size size) {
        smPool.submit(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.7
            @Override // java.lang.Runnable
            public void run() {
                if (CameraWrapper.this.e) {
                    CameraWrapper.this.d = false;
                    CameraWrapper.this.a.setPreviewCallback(null);
                    CameraWrapper.this.a.stopPreview();
                }
                CameraWrapper.this.a(size);
                if (CameraWrapper.this.e) {
                    CameraWrapper.this.a.setPreviewCallback(CameraWrapper.this);
                    try {
                        if (CameraWrapper.this.b != null) {
                            CameraWrapper.this.a.setPreviewDisplay(CameraWrapper.this.b.getCurrentSurface());
                        }
                    } catch (IOException e) {
                    }
                    CameraWrapper.this.a.startPreview();
                    CameraWrapper.this.d = true;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Camera getCameraInstance(int i) {
        if (!Permissions.require("android.permission.CAMERA")) {
            throw new RuntimeException("CAMERA permission not granted by user");
        }
        int i2 = i == 2 ? 1 : 0;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera camera = null;
        for (int i3 = 0; i3 < numberOfCameras; i3++) {
            Camera.getCameraInfo(i3, cameraInfo);
            if (cameraInfo.facing == i2) {
                camera = Camera.open(i3);
            }
        }
        return camera;
    }

    @Override // com.rovio.fusion.CameraPreview.Listener
    public void onPreviewReady(final SurfaceHolder surfaceHolder) {
        smPool.submit(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (CameraWrapper.this.a != null) {
                        CameraWrapper.this.a.setPreviewDisplay(surfaceHolder);
                        if (CameraWrapper.this.j) {
                            CameraWrapper.this.a(0, "Camera successfully initialized");
                        }
                    }
                } catch (IOException e) {
                    CameraWrapper.this.a(3, "Displaying preview failed");
                }
            }
        });
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(final byte[] bArr, Camera camera) {
        Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.CameraWrapper.9
            @Override // java.lang.Runnable
            public void run() {
                if (CameraWrapper.this.c != 0 && CameraWrapper.this.d) {
                    CameraWrapper.this.nativeProcessFrame(CameraWrapper.this.c, bArr, CameraWrapper.this.f.width, CameraWrapper.this.f.height);
                }
            }
        });
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        if (this.i) {
            open(false);
        }
        this.i = false;
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
        this.i = false;
        if (this.a != null) {
            this.i = true;
            close();
        }
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onDestroy() {
        smPool.shutdown();
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
