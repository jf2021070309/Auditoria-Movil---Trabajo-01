package com.facebook.ads.internal.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.facebook.ads.internal.p.a.p;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes2.dex */
public class c {
    private static final String a = c.class.getSimpleName();
    private static c b;
    private final Context c;

    private c(Context context) {
        this.c = context;
    }

    private Bitmap a(String str) {
        byte[] d = com.facebook.ads.internal.q.c.d.a(this.c).a(str, (p) null).d();
        return BitmapFactory.decodeByteArray(d, 0, d.length);
    }

    public static c a(Context context) {
        if (b == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (c.class) {
                if (b == null) {
                    b = new c(applicationContext);
                }
            }
        }
        return b;
    }

    private static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.graphics.Bitmap] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a2 -> B:46:0x0044). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b2 -> B:46:0x0044). Please submit an issue!!! */
    private void a(String str, Bitmap bitmap) {
        Closeable closeable;
        File file;
        FileOutputStream fileOutputStream = null;
        ?? r3 = ".png";
        File file2 = new File(this.c.getCacheDir(), str.hashCode() + ".png");
        try {
            try {
                r3 = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, r3);
                    if (r3.size() >= 3145728) {
                        Log.d(a, "Bitmap size exceeds max size for storage");
                        a((Closeable) r3);
                        a((Closeable) null);
                        r3 = r3;
                        file2 = file2;
                    } else {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                        try {
                            r3.writeTo(fileOutputStream2);
                            fileOutputStream2.flush();
                            a((Closeable) r3);
                            a(fileOutputStream2);
                            r3 = r3;
                            file2 = file2;
                        } catch (FileNotFoundException e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            closeable = r3;
                            file = file2;
                            try {
                                Log.e(a, "Bad output destination (file=" + file.getAbsolutePath() + ").", e);
                                a(closeable);
                                a(fileOutputStream);
                            } catch (Throwable th) {
                                th = th;
                                r3 = closeable;
                                a((Closeable) r3);
                                a(fileOutputStream);
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            String str2 = "Unable to write bitmap to file (url=" + str + ").";
                            Log.e(a, str2, e);
                            a((Closeable) r3);
                            a(fileOutputStream);
                            r3 = r3;
                            file2 = str2;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            fileOutputStream = fileOutputStream2;
                            ?? r4 = "Unable to write bitmap to output stream";
                            Log.e(a, "Unable to write bitmap to output stream", e);
                            a((Closeable) r3);
                            a(fileOutputStream);
                            r3 = r3;
                            file2 = r4;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            a((Closeable) r3);
                            a(fileOutputStream);
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e4) {
                    e = e4;
                    closeable = r3;
                    file = file2;
                } catch (IOException e5) {
                    e = e5;
                } catch (OutOfMemoryError e6) {
                    e = e6;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            closeable = null;
            file = file2;
        } catch (IOException e8) {
            e = e8;
            r3 = 0;
        } catch (OutOfMemoryError e9) {
            e = e9;
            r3 = 0;
        } catch (Throwable th4) {
            th = th4;
            r3 = 0;
        }
    }

    private boolean a(int i, int i2) {
        return i > 0 && i2 > 0 && com.facebook.ads.internal.l.a.d(this.c);
    }

    private Bitmap b(String str, int i, int i2) {
        try {
            Bitmap a2 = a(i, i2) ? com.facebook.ads.internal.q.b.c.a(str.substring("file://".length()), i, i2) : BitmapFactory.decodeStream(new FileInputStream(str.substring("file://".length())), null, null);
            a(str, a2);
            return a2;
        } catch (IOException e) {
            Log.e(a, "Failed to copy local image into cache (url=" + str + ").", e);
            return null;
        }
    }

    private Bitmap c(String str, int i, int i2) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        if (str.startsWith("asset:///")) {
            try {
                inputStream = this.c.getAssets().open(str.substring(9, str.length()));
            } catch (IOException e) {
                inputStream = null;
            } catch (Throwable th2) {
                inputStream = null;
                th = th2;
            }
            try {
                bitmap = a(i, i2) ? com.facebook.ads.internal.q.b.c.a(inputStream, i, i2) : BitmapFactory.decodeStream(inputStream);
                if (inputStream != null) {
                    a(inputStream);
                }
            } catch (IOException e2) {
                if (inputStream != null) {
                    a(inputStream);
                }
                return bitmap;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    a(inputStream);
                }
                throw th;
            }
        } else if (a(i, i2)) {
            try {
                bitmap = d(str, i, i2);
            } catch (IOException e3) {
                bitmap = a(str);
            }
        } else {
            bitmap = a(str);
        }
        a(str, bitmap);
        return bitmap;
    }

    private Bitmap d(String str, int i, int i2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoInput(true);
        httpURLConnection.connect();
        InputStream inputStream = httpURLConnection.getInputStream();
        Bitmap a2 = com.facebook.ads.internal.q.b.c.a(inputStream, i, i2);
        a(inputStream);
        return a2;
    }

    public Bitmap a(String str, int i, int i2) {
        File file = new File(this.c.getCacheDir(), str.hashCode() + ".png");
        return !file.exists() ? str.startsWith("file://") ? b(str, i, i2) : c(str, i, i2) : a(i, i2) ? com.facebook.ads.internal.q.b.c.a(file.getAbsolutePath(), i, i2) : BitmapFactory.decodeFile(file.getAbsolutePath());
    }
}
