package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import com.amazon.aps.iva.f8.w;
import com.amazon.aps.iva.f8.x;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ColorResourcesLoaderCreator {
    private static final String TAG = "ColorResLoaderCreator";

    private ColorResourcesLoaderCreator() {
    }

    public static ResourcesLoader create(Context context, Map<Integer, Integer> map) {
        FileDescriptor fileDescriptor;
        ResourcesProvider loadFromTable;
        try {
            byte[] create = ColorResourcesTableCreator.create(context, map);
            int length = create.length;
            if (create.length == 0) {
                return null;
            }
            try {
                fileDescriptor = Os.memfd_create("temp.arsc", 0);
                if (fileDescriptor == null) {
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    return null;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                    fileOutputStream.write(create);
                    ParcelFileDescriptor dup = ParcelFileDescriptor.dup(fileDescriptor);
                    try {
                        x.c();
                        ResourcesLoader c = w.c();
                        loadFromTable = ResourcesProvider.loadFromTable(dup, null);
                        c.addProvider(loadFromTable);
                        if (dup != null) {
                            dup.close();
                        }
                        fileOutputStream.close();
                        Os.close(fileDescriptor);
                        return c;
                    } catch (Throwable th) {
                        if (dup != null) {
                            try {
                                dup.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileDescriptor != null) {
                        Os.close(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
