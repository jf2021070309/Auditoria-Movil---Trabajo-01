package com.ss.android.socialbase.appdownloader.q;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class o {
    private static int dr = 8;
    private static volatile o ge;
    private dr<Integer, Bitmap> o;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class dr<K, T> extends LinkedHashMap<K, T> {
        final int dr;

        public dr(int i, int i2) {
            super(i2, 0.75f, true);
            this.dr = i;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<K, T> entry) {
            return size() > this.dr;
        }
    }

    public static o dr() {
        if (ge == null) {
            synchronized (o.class) {
                if (ge == null) {
                    ge = new o();
                }
            }
        }
        return ge;
    }

    private o() {
        this.o = null;
        int i = dr;
        this.o = new dr<>(i, i / 2);
    }

    public Bitmap dr(int i) {
        return this.o.get(Integer.valueOf(i));
    }

    public void dr(final int i, final String str) {
        if (TextUtils.isEmpty(str) || dr(i) != null) {
            return;
        }
        DownloadComponentManager.getIOThreadExecutor().submit(new Runnable() { // from class: com.ss.android.socialbase.appdownloader.q.o.1
            @Override // java.lang.Runnable
            public void run() {
                ByteArrayOutputStream byteArrayOutputStream;
                ByteArrayInputStream byteArrayInputStream;
                ByteArrayInputStream byteArrayInputStream2;
                Throwable th;
                InputStream inputStream;
                Exception e;
                try {
                    IDownloadHttpConnection downloadWithConnection = DownloadComponentManager.downloadWithConnection(true, 0, str, null);
                    if (downloadWithConnection == null) {
                        DownloadUtils.safeClose(null, null, null, null);
                        return;
                    }
                    inputStream = downloadWithConnection.getInputStream();
                    try {
                        byteArrayOutputStream = o.ge(inputStream);
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        } catch (Exception e2) {
                            byteArrayInputStream2 = null;
                            e = e2;
                            byteArrayInputStream = null;
                        } catch (Throwable th2) {
                            byteArrayInputStream2 = null;
                            th = th2;
                            byteArrayInputStream = null;
                        }
                    } catch (Exception e3) {
                        byteArrayInputStream = null;
                        byteArrayInputStream2 = null;
                        e = e3;
                        byteArrayOutputStream = null;
                    } catch (Throwable th3) {
                        byteArrayInputStream = null;
                        byteArrayInputStream2 = null;
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                    try {
                        byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                        try {
                            try {
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(byteArrayInputStream, null, options);
                                int i2 = options.outWidth;
                                int i3 = options.outHeight;
                                int dr2 = com.ss.android.socialbase.appdownloader.o.dr(DownloadComponentManager.getAppContext(), 44.0f);
                                options.inSampleSize = o.dr(dr2, dr2, options);
                                options.inJustDecodeBounds = false;
                                o.this.o.put(Integer.valueOf(i), BitmapFactory.decodeStream(byteArrayInputStream2, null, options));
                                DownloadUtils.safeClose(inputStream, byteArrayOutputStream, byteArrayInputStream, byteArrayInputStream2);
                            } catch (Exception e4) {
                                e = e4;
                                e.printStackTrace();
                                DownloadUtils.safeClose(inputStream, byteArrayOutputStream, byteArrayInputStream, byteArrayInputStream2);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            DownloadUtils.safeClose(inputStream, byteArrayOutputStream, byteArrayInputStream, byteArrayInputStream2);
                            throw th;
                        }
                    } catch (Exception e5) {
                        byteArrayInputStream2 = null;
                        e = e5;
                    } catch (Throwable th5) {
                        byteArrayInputStream2 = null;
                        th = th5;
                        DownloadUtils.safeClose(inputStream, byteArrayOutputStream, byteArrayInputStream, byteArrayInputStream2);
                        throw th;
                    }
                } catch (Exception e6) {
                    byteArrayOutputStream = null;
                    byteArrayInputStream = null;
                    byteArrayInputStream2 = null;
                    e = e6;
                    inputStream = null;
                } catch (Throwable th6) {
                    byteArrayOutputStream = null;
                    byteArrayInputStream = null;
                    byteArrayInputStream2 = null;
                    th = th6;
                    inputStream = null;
                }
            }
        });
    }

    public static int dr(int i, int i2, BitmapFactory.Options options) {
        if (options.outWidth > i || options.outHeight > i2) {
            return Math.min(Math.round(options.outWidth / i), Math.round(options.outHeight / i2));
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteArrayOutputStream ge(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream;
            }
        }
    }
}
