package com.facebook.ads.internal.view.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.q.a.v;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class d extends AsyncTask<String, Void, Bitmap[]> {
    private static final String b = d.class.getSimpleName();
    public boolean a;
    private final WeakReference<Context> c;
    private final int d;
    private final WeakReference<ImageView> e;
    private final WeakReference<b> f;
    private final WeakReference<ViewGroup> g;
    private e h;
    private int i;
    private int j;

    public d(ViewGroup viewGroup, int i) {
        this.a = false;
        this.i = -1;
        this.j = -1;
        this.c = new WeakReference<>(viewGroup.getContext());
        this.f = null;
        this.e = null;
        this.g = new WeakReference<>(viewGroup);
        this.d = i;
    }

    public d(ImageView imageView) {
        this.a = false;
        this.i = -1;
        this.j = -1;
        this.c = new WeakReference<>(imageView.getContext());
        this.f = null;
        this.e = new WeakReference<>(imageView);
        this.g = null;
        this.d = 0;
    }

    public d(b bVar) {
        this.a = false;
        this.i = -1;
        this.j = -1;
        this.c = new WeakReference<>(bVar.getContext());
        this.f = new WeakReference<>(bVar);
        this.e = null;
        this.g = null;
        this.d = 0;
    }

    public d a() {
        this.i = -1;
        this.j = -1;
        return this;
    }

    public d a(int i, int i2) {
        this.i = i;
        this.j = i2;
        return this;
    }

    public d a(e eVar) {
        this.h = eVar;
        return this;
    }

    public d a(boolean z) {
        this.a = z;
        return this;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        executeOnExecutor(THREAD_POOL_EXECUTOR, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(Bitmap[] bitmapArr) {
        b bVar;
        ImageView imageView;
        if (this.e != null && (imageView = this.e.get()) != null) {
            imageView.setImageBitmap(bitmapArr[0]);
        }
        if (this.f != null && (bVar = this.f.get()) != null) {
            bVar.a(bitmapArr[0], bitmapArr[1]);
        }
        if (this.g != null && this.g.get() != null) {
            v.a(this.g.get(), new BitmapDrawable(this.c.get().getResources(), bitmapArr[1]));
        }
        if (this.h != null) {
            this.h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:6|7|(4:9|10|(1:41)(1:14)|15))|(2:17|(4:19|(3:26|27|(3:29|(1:31)(1:34)|32)(1:35))(1:22)|23|24))|40|(0)|26|27|(0)(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        android.util.Log.e(com.facebook.ads.internal.view.b.d.b, "Error downloading image: " + r6, r3);
        com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(r3, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
        r3 = r0;
        r0 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[Catch: Throwable -> 0x009a, TryCatch #0 {Throwable -> 0x009a, blocks: (B:20:0x0043, B:22:0x0047, B:24:0x0050, B:25:0x0052, B:29:0x0065), top: B:40:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap[] doInBackground(java.lang.String... r12) {
        /*
            r11 = this;
            r10 = 2
            r1 = 0
            r4 = 1
            r5 = 0
            r6 = r12[r5]
            java.lang.ref.WeakReference<android.content.Context> r0 = r11.c
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L17
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r10]
            r0[r5] = r1
            r0[r4] = r1
        L16:
            return r0
        L17:
            com.facebook.ads.internal.d.c r0 = com.facebook.ads.internal.d.c.a(r0)     // Catch: java.lang.Throwable -> L72
            int r2 = r11.i     // Catch: java.lang.Throwable -> L72
            int r3 = r11.j     // Catch: java.lang.Throwable -> L72
            android.graphics.Bitmap r2 = r0.a(r6, r2, r3)     // Catch: java.lang.Throwable -> L72
            java.lang.ref.WeakReference<com.facebook.ads.internal.view.b.b> r0 = r11.f     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L61
            java.lang.ref.WeakReference<com.facebook.ads.internal.view.b.b> r0 = r11.f     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L61
            r3 = r4
        L30:
            java.lang.ref.WeakReference<android.view.ViewGroup> r0 = r11.g     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L63
            java.lang.ref.WeakReference<android.view.ViewGroup> r0 = r11.g     // Catch: java.lang.Throwable -> L96
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L96
            if (r0 == 0) goto L63
            r0 = r4
        L3d:
            if (r3 != 0) goto L41
            if (r0 == 0) goto La0
        L41:
            if (r2 == 0) goto La0
            boolean r0 = r11.a     // Catch: java.lang.Throwable -> L9a
            if (r0 != 0) goto L9e
            com.facebook.ads.internal.q.b.e r3 = new com.facebook.ads.internal.q.b.e     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L9a
            int r0 = r11.d     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L65
            int r0 = r11.d     // Catch: java.lang.Throwable -> L9a
        L52:
            r3.a(r0)     // Catch: java.lang.Throwable -> L9a
            android.graphics.Bitmap r0 = r3.a()     // Catch: java.lang.Throwable -> L9a
        L59:
            android.graphics.Bitmap[] r1 = new android.graphics.Bitmap[r10]
            r1[r5] = r2
            r1[r4] = r0
            r0 = r1
            goto L16
        L61:
            r3 = r5
            goto L30
        L63:
            r0 = r5
            goto L3d
        L65:
            int r0 = r2.getWidth()     // Catch: java.lang.Throwable -> L9a
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L9a
            r7 = 1109393408(0x42200000, float:40.0)
            float r0 = r0 / r7
            int r0 = java.lang.Math.round(r0)     // Catch: java.lang.Throwable -> L9a
            goto L52
        L72:
            r0 = move-exception
            r3 = r0
            r2 = r1
            r0 = r1
        L76:
            java.lang.String r7 = com.facebook.ads.internal.view.b.d.b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Error downloading image: "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r7, r6, r3)
            com.facebook.ads.internal.j.a r1 = com.facebook.ads.internal.j.a.a(r3, r1)
            com.facebook.ads.internal.j.b.a(r1)
            goto L59
        L96:
            r0 = move-exception
            r3 = r0
            r0 = r1
            goto L76
        L9a:
            r0 = move-exception
            r3 = r0
            r0 = r2
            goto L76
        L9e:
            r0 = r2
            goto L59
        La0:
            r0 = r1
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.b.d.doInBackground(java.lang.String[]):android.graphics.Bitmap[]");
    }
}
