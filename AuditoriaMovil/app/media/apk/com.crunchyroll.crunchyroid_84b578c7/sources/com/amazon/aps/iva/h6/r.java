package com.amazon.aps.iva.h6;

import android.util.Log;
import android.util.SparseArray;
import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.util.LogUtils;
import com.google.android.gms.cast.Cast;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: TimestampAdjusterProvider.java */
/* loaded from: classes.dex */
public final class r implements com.amazon.aps.iva.xa.b, com.amazon.aps.iva.kc.d {
    public final Object b;

    public r(com.amazon.aps.iva.oc.b bVar) {
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.xa.b
    public final void a() {
    }

    @Override // com.amazon.aps.iva.kc.d
    public final boolean c(Object obj, File file, com.amazon.aps.iva.kc.h hVar) {
        FileOutputStream fileOutputStream;
        InputStream inputStream = (InputStream) obj;
        com.amazon.aps.iva.oc.b bVar = (com.amazon.aps.iva.oc.b) this.b;
        byte[] bArr = (byte[]) bVar.c(byte[].class, Cast.MAX_MESSAGE_LENGTH);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } catch (IOException unused) {
                        fileOutputStream2 = fileOutputStream;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        bVar.put(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        bVar.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream.close();
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
                bVar.put(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException unused5) {
        }
    }

    @Override // com.amazon.aps.iva.xa.b
    public final boolean a(MetricEvent metricEvent) {
        LogUtils.i("b", ((Gson) this.b).toJson(metricEvent));
        return true;
    }

    public r(int i) {
        if (i != 1) {
            this.b = new SparseArray();
        } else {
            this.b = w.c().b();
        }
    }
}
