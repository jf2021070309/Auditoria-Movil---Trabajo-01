package com.ss.android.downloadlib.addownload.compliance;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.o;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.ss.android.socialbase.downloader.utils.LruCache;
import java.io.BufferedInputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class g extends LruCache<Long, Bitmap> {
    private final Map<Long, SoftReference<dr>> dr;

    /* loaded from: classes3.dex */
    public interface dr {
        void dr(Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ge {
        private static g dr = new g();
    }

    public static g dr() {
        return ge.dr;
    }

    private g() {
        super(8, 8);
        this.dr = new HashMap();
    }

    public void dr(long j, dr drVar) {
        if (get(Long.valueOf(j)) != null) {
            drVar.dr((Bitmap) get(Long.valueOf(j)));
        } else {
            this.dr.put(Long.valueOf(j), new SoftReference<>(drVar));
        }
    }

    public void dr(final long j, final long j2, final String str) {
        if (get(Long.valueOf(j)) != null) {
            SoftReference<dr> remove = this.dr.remove(Long.valueOf(j));
            if (remove != null && remove.get() != null) {
                remove.get().dr((Bitmap) get(Long.valueOf(j)));
            }
        } else if (TextUtils.isEmpty(str)) {
            q.dr(12, j2);
        } else {
            com.ss.android.downloadlib.rb.o.dr((o.dr<Object, R>) new o.dr<Object, Object>() { // from class: com.ss.android.downloadlib.addownload.compliance.g.2
                @Override // com.ss.android.downloadlib.rb.o.dr
                public Object dr(Object obj) {
                    BufferedInputStream bufferedInputStream;
                    Throwable th;
                    IDownloadHttpConnection downloadWithConnection;
                    try {
                        downloadWithConnection = DownloadComponentManager.downloadWithConnection(true, 0, str, null);
                    } catch (Exception e) {
                        e = e;
                        bufferedInputStream = null;
                    } catch (Throwable th2) {
                        bufferedInputStream = null;
                        th = th2;
                        DownloadUtils.safeClose(bufferedInputStream);
                        throw th;
                    }
                    if (downloadWithConnection == null) {
                        DownloadUtils.safeClose(null);
                        return null;
                    }
                    bufferedInputStream = new BufferedInputStream(downloadWithConnection.getInputStream());
                    try {
                        try {
                            bufferedInputStream.mark(bufferedInputStream.available());
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeStream(bufferedInputStream, null, options);
                            int i = options.outWidth;
                            int i2 = options.outHeight;
                            int dr2 = yk.dr(wb.getContext(), 60.0f);
                            options.inSampleSize = g.ge(dr2, dr2, options);
                            options.inJustDecodeBounds = false;
                            bufferedInputStream.reset();
                            Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.putOpt("ttdownloader_type", "load_bitmap");
                                jSONObject.putOpt("bm_original_w", Integer.valueOf(i));
                                jSONObject.putOpt("bm_original_h", Integer.valueOf(i2));
                                jSONObject.putOpt("bm_bytes", Integer.valueOf(decodeStream == null ? -1 : decodeStream.getByteCount()));
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            com.ss.android.downloadlib.g.dr.dr().dr("ttd_pref_monitor", jSONObject, j2);
                            g.this.put(Long.valueOf(j), decodeStream);
                            DownloadUtils.safeClose(bufferedInputStream);
                        } catch (Exception e3) {
                            e = e3;
                            com.ss.android.downloadlib.q.o.dr().dr(e, "BitmapCache loadBitmap");
                            DownloadUtils.safeClose(bufferedInputStream);
                            return null;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        DownloadUtils.safeClose(bufferedInputStream);
                        throw th;
                    }
                }
            }, (Object) null).dr(new o.dr<Object, Object>() { // from class: com.ss.android.downloadlib.addownload.compliance.g.1
                @Override // com.ss.android.downloadlib.rb.o.dr
                public Object dr(Object obj) {
                    SoftReference softReference = (SoftReference) g.this.dr.remove(Long.valueOf(j));
                    if (softReference != null && softReference.get() != null) {
                        ((dr) softReference.get()).dr((Bitmap) g.this.get(Long.valueOf(j)));
                        return null;
                    }
                    return null;
                }
            }).dr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ge(int i, int i2, BitmapFactory.Options options) {
        if (options.outWidth > i || options.outHeight > i2) {
            return Math.min(Math.round(options.outWidth / i), Math.round(options.outHeight / i2));
        }
        return 1;
    }
}
