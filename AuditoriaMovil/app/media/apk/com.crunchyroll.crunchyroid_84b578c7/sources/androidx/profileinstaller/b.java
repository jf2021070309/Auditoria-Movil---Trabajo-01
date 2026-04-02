package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import com.amazon.aps.iva.m8.g;
import com.amazon.aps.iva.t5.n;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.Executor;
/* compiled from: DeviceProfileWriter.java */
/* loaded from: classes.dex */
public final class b {
    public final Executor a;
    public final c.InterfaceC0052c b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public com.amazon.aps.iva.m8.a[] g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0052c interfaceC0052c, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = interfaceC0052c;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i <= 33) {
            switch (i) {
                case 26:
                    bArr = g.d;
                    break;
                case 27:
                    bArr = g.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = g.b;
                    break;
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    bArr = g.a;
                    break;
            }
            this.c = bArr;
        }
        bArr = null;
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.b.a();
            }
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new n(this, i, 2, serializable));
    }
}
