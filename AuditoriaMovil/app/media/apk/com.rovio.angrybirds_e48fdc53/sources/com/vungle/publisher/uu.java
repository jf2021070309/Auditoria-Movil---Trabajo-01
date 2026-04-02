package com.vungle.publisher;

import com.vungle.publisher.ei;
import com.vungle.publisher.log.Logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import rx.exceptions.Exceptions;
import rx.functions.Func2;
/* loaded from: classes4.dex */
public class uu implements Func2<tw, gd<?>, gd<?>> {
    @Override // rx.functions.Func2
    /* renamed from: a */
    public gd<?> call(tw twVar, gd<?> gdVar) {
        try {
            return b(twVar, gdVar);
        } catch (IOException e) {
            throw Exceptions.propagate(e);
        }
    }

    public gd<?> b(tw twVar, gd<?> gdVar) {
        InputStream inputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        int i = 0;
        gd<?> gdVar2 = null;
        String i2 = gdVar.i();
        try {
            HttpURLConnection a = twVar.a();
            inputStream = a.getInputStream();
            try {
                File file = new File(i2);
                if (qr.d(file)) {
                    Logger.d(Logger.PREPARE_TAG, "downloading to: " + i2);
                    byte[] bArr = new byte[8192];
                    fileOutputStream = new FileOutputStream(file);
                    while (true) {
                        try {
                            try {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                i += read;
                                fileOutputStream.write(bArr, 0, read);
                            } catch (IOException e) {
                                throw new qn("could not write ad to disk");
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e2) {
                                    Logger.d(Logger.PREPARE_TAG, "error closing input stream", e2);
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    Logger.d(Logger.PREPARE_TAG, "error closing output stream", e3);
                                }
                            }
                            throw th;
                        }
                    }
                    fileOutputStream.flush();
                    int contentLength = a.getContentLength();
                    Logger.v(Logger.PREPARE_TAG, "response ContentLength = " + contentLength);
                    if (contentLength <= i) {
                        Logger.d(Logger.PREPARE_TAG, "download complete: " + i2 + ", size: " + i);
                        gdVar2 = a(i, gdVar);
                    } else {
                        Logger.w(Logger.PREPARE_TAG, "download size mismatch: " + i2 + ", expected size: " + contentLength + ", actual size: " + i);
                        gdVar.a(ei.a.failed);
                        gdVar.f_();
                    }
                } else {
                    Logger.w(Logger.PREPARE_TAG, "could not create or directory not writeable: " + file);
                    fileOutputStream = null;
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        Logger.d(Logger.PREPARE_TAG, "error closing input stream", e4);
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        Logger.d(Logger.PREPARE_TAG, "error closing output stream", e5);
                    }
                }
                return gdVar2;
            } catch (Throwable th3) {
                fileOutputStream = null;
                th = th3;
            }
        } catch (Throwable th4) {
            inputStream = null;
            th = th4;
            fileOutputStream = null;
        }
    }

    gd<?> a(int i, gd<?> gdVar) {
        ei.b o = gdVar.o();
        switch (o) {
            case postRoll:
            case template:
            case asset:
                gdVar.a(Integer.valueOf(i));
                break;
        }
        Logger.d(Logger.PREPARE_TAG, o + " downloaded for " + com.umeng.analytics.pro.bg.aw + " " + gdVar.f());
        gdVar.a(ei.a.downloaded);
        gdVar.f_();
        return gdVar;
    }
}
