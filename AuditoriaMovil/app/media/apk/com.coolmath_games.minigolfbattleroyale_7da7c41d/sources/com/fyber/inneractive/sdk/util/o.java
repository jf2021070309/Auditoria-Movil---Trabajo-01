package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
/* loaded from: classes.dex */
public final class o extends AsyncTask<Void, Void, Bitmap> {
    Context a;
    a b;
    String c;
    String d;
    int e;
    private com.fyber.inneractive.sdk.player.a.a f;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(Bitmap bitmap);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Bitmap doInBackground(Void[] voidArr) {
        return b();
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        a aVar = this.b;
        if (aVar != null) {
            if (bitmap2 != null) {
                aVar.a(bitmap2);
            } else {
                aVar.a();
            }
            this.b = null;
        }
    }

    private o(Context context, a aVar, String str) {
        this.f = null;
        this.a = context;
        this.b = aVar;
        this.c = str;
        this.d = null;
        this.e = 81920;
    }

    public o(Context context, a aVar, String str, byte b) {
        this(context, aVar, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8 A[Catch: IOException -> 0x00c1, TryCatch #19 {IOException -> 0x00c1, blocks: (B:58:0x00b3, B:60:0x00b8, B:62:0x00bd), top: B:132:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd A[Catch: IOException -> 0x00c1, TRY_LEAVE, TryCatch #19 {IOException -> 0x00c1, blocks: (B:58:0x00b3, B:60:0x00b8, B:62:0x00bd), top: B:132:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1 A[Catch: IOException -> 0x00ea, TryCatch #13 {IOException -> 0x00ea, blocks: (B:72:0x00dc, B:74:0x00e1, B:76:0x00e6), top: B:129:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6 A[Catch: IOException -> 0x00ea, TRY_LEAVE, TryCatch #13 {IOException -> 0x00ea, blocks: (B:72:0x00dc, B:74:0x00e1, B:76:0x00e6), top: B:129:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7 A[Catch: IOException -> 0x0100, TryCatch #21 {IOException -> 0x0100, blocks: (B:83:0x00f2, B:85:0x00f7, B:87:0x00fc), top: B:134:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc A[Catch: IOException -> 0x0100, TRY_LEAVE, TryCatch #21 {IOException -> 0x0100, blocks: (B:83:0x00f2, B:85:0x00f7, B:87:0x00fc), top: B:134:0x00f2 }] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap b() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.o.b():android.graphics.Bitmap");
    }

    public final void a() {
        super.cancel(true);
        this.b = null;
    }
}
