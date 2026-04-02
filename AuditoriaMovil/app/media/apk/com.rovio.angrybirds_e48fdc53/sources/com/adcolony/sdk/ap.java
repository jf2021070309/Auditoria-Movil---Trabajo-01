package com.adcolony.sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLSurfaceView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ap implements GLSurfaceView.Renderer {
    static BitmapFactory.Options a = new BitmapFactory.Options();
    static ByteBuffer b;
    ao c;
    String d;
    int e;
    int f;
    boolean g;
    boolean h;
    aa j;
    int k;
    int l;
    ArrayList<d> i = new ArrayList<>();
    ArrayList<a> m = new ArrayList<>();
    HashMap<Integer, a> n = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ap(ao aoVar, boolean z, String str) {
        System.out.println("AdColony new ADCGLViewRenderer");
        this.c = aoVar;
        this.g = z;
        this.d = str;
        this.j = com.adcolony.sdk.a.a().j().b().get(str);
        this.e = aoVar.b;
        this.f = this.j.b();
        this.j.l().add(com.adcolony.sdk.a.a("RenderView.create_image", new f() { // from class: com.adcolony.sdk.ap.1
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ap.this.a(dVar);
            }
        }, true));
        this.j.l().add(com.adcolony.sdk.a.a("RenderView.load_texture", new f() { // from class: com.adcolony.sdk.ap.2
            @Override // com.adcolony.sdk.f
            public void a(d dVar) {
                ap.this.b(dVar);
            }
        }, true));
        this.j.m().add("RenderView.create_image");
        this.j.m().add("RenderView.load_texture");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        if (!this.h) {
            this.h = true;
            synchronized (ADCNative.lock) {
                ADCNative.nativeDeleteSceneController(this.f, this.e);
            }
        }
    }

    protected void finalize() {
        a();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public synchronized void onDrawFrame(GL10 gl10) {
        com.adcolony.sdk.a.f();
        synchronized (ADCNative.lock) {
            if (!this.h) {
                b();
                ADCNative.nativeRender(this.f, this.e, this.k, this.l);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        synchronized (ADCNative.lock) {
            if (!this.h) {
                ADCNative.nativeCreateSceneController(this.f, this.e);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    void a(d dVar) {
    }

    synchronized void b(d dVar) {
        this.i.add(dVar);
    }

    synchronized void b() {
        int i = 0;
        while (true) {
            if (i < this.i.size()) {
                d dVar = this.i.get(i);
                JSONObject b2 = dVar.b();
                a aVar = null;
                if (b2.has("pixels")) {
                    String b3 = as.b(b2, "pixels");
                    int[] iArr = new int[b3.length() / 4];
                    int length = b3.length() - 4;
                    int length2 = iArr.length;
                    while (length >= 0) {
                        char charAt = b3.charAt(length);
                        char charAt2 = b3.charAt(length + 1);
                        char charAt3 = b3.charAt(length + 2);
                        length += 4;
                        length2--;
                        iArr[length2] = (charAt << 24) | (charAt2 << 16) | (charAt3 << '\b') | b3.charAt(length + 3);
                    }
                    int c = as.c(b2, "width");
                    int c2 = as.c(b2, "height");
                    if (c * c2 == iArr.length) {
                        aVar = a(as.c(b2, "texture_id"), as.b(b2, "filepath"), iArr, c, c2);
                    }
                } else if (b2.has("bytes")) {
                    String b4 = as.b(b2, "bytes");
                    byte[] bArr = new byte[b4.length()];
                    int length3 = b4.length();
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        bArr[length3] = (byte) b4.charAt(length3);
                    }
                    aVar = a(as.c(b2, "texture_id"), as.b(b2, "filepath"), bArr);
                } else if (b2.has("filepath")) {
                    aVar = a(as.c(b2, "texture_id"), as.b(b2, "filepath"));
                }
                if (aVar == null) {
                    as.a(b2, "success", false);
                    break;
                }
                as.a(b2, "success", aVar.d);
                as.b(b2, "image_width", aVar.f);
                as.b(b2, "image_height", aVar.g);
                as.b(b2, "texture_width", aVar.h);
                as.b(b2, "texture_height", aVar.i);
                dVar.a(b2).a();
                i++;
            } else {
                this.i.clear();
                break;
            }
        }
    }

    a a(int i, String str) {
        Bitmap bitmap;
        a.inScaled = false;
        if (str.startsWith("file:///android_asset/")) {
            try {
                bitmap = BitmapFactory.decodeStream(com.adcolony.sdk.a.c().getAssets().open(str.substring("file:///android_asset/".length())), null, a);
            } catch (IOException e) {
                au.f.b(e.toString());
                bitmap = null;
            }
        } else {
            bitmap = BitmapFactory.decodeFile(str, a);
        }
        if (bitmap == null) {
            au.f.a("Failed to load ").a(str).b(" - using white 16x16 as placeholder.");
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-1);
            a a2 = a(i, str, createBitmap);
            a2.d = false;
            return a2;
        }
        return a(i, str, bitmap);
    }

    a a(int i, String str, byte[] bArr) {
        a.inScaled = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray == null) {
            au.f.a("Failed to load ").a(str).b(" bytes - using white 16x16 as placeholder.");
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-1);
            a a2 = a(i, str, createBitmap);
            a2.d = false;
            return a2;
        }
        return a(i, str, decodeByteArray);
    }

    a a(int i, String str, int[] iArr, int i2, int i3) {
        return a(i, str, Bitmap.createBitmap(iArr, i2, i3, Bitmap.Config.ARGB_8888));
    }

    a a(int i, String str, Bitmap bitmap) {
        a aVar = new a(i, str, bitmap.getWidth(), bitmap.getHeight());
        int i2 = aVar.h * aVar.i * 4;
        if (b == null || b.capacity() < i2) {
            b = ByteBuffer.allocateDirect(i2 >= 4194304 ? i2 : 4194304);
            b.order(ByteOrder.nativeOrder());
        }
        b.rewind();
        bitmap.copyPixelsToBuffer(b);
        this.m.add(aVar);
        this.n.put(Integer.valueOf(i), aVar);
        synchronized (ADCNative.lock) {
            ADCNative.nativeCreateTexture(this.f, this.e, i, str, b, aVar.f, aVar.g, aVar.h, aVar.i);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        static int a = 1;
        int b;
        String c;
        int f;
        int g;
        int i;
        boolean d = true;
        int e = this.e;
        int e = this.e;
        int h = 1;

        a(int i, String str, int i2, int i3) {
            this.b = i;
            this.c = str;
            this.f = i2;
            this.g = i3;
            while (this.h < i2) {
                this.h <<= 1;
            }
            this.i = 1;
            while (this.i < i3) {
                this.i <<= 1;
            }
        }
    }
}
