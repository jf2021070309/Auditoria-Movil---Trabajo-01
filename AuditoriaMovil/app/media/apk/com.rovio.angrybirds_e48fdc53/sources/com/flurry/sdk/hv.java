package com.flurry.sdk;

import com.flurry.sdk.jk;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
/* loaded from: classes2.dex */
public final class hv {
    private static final String a = hv.class.getSimpleName();

    public static jk a(File file) {
        Closeable closeable;
        FileInputStream fileInputStream;
        DataInputStream dataInputStream;
        jk jkVar;
        if (file == null || !file.exists()) {
            return null;
        }
        jk.a aVar = new jk.a();
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            dataInputStream = null;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            fileInputStream = null;
        }
        try {
            dataInputStream = new DataInputStream(fileInputStream);
            try {
            } catch (Exception e2) {
                e = e2;
                ko.a(3, a, "Error loading legacy agent data.", e);
                ma.a((Closeable) dataInputStream);
                ma.a((Closeable) fileInputStream);
                jkVar = null;
                return jkVar;
            }
        } catch (Exception e3) {
            e = e3;
            dataInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            ma.a(closeable);
            ma.a((Closeable) fileInputStream);
            throw th;
        }
        if (dataInputStream.readUnsignedShort() != 46586) {
            ko.a(3, a, "Unexpected file type");
            ma.a((Closeable) dataInputStream);
            ma.a((Closeable) fileInputStream);
            return null;
        }
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        if (readUnsignedShort != 2) {
            ko.a(6, a, "Unknown agent file version: " + readUnsignedShort);
            ma.a((Closeable) dataInputStream);
            ma.a((Closeable) fileInputStream);
            return null;
        }
        jkVar = (jk) aVar.a(dataInputStream);
        ma.a((Closeable) dataInputStream);
        ma.a((Closeable) fileInputStream);
        return jkVar;
    }
}
