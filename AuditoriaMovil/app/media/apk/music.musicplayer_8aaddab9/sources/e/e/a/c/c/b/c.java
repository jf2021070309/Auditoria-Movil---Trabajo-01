package e.e.a.c.c.b;

import e.h.g.s1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c implements e.e.a.c.c.a {
    public final HashMap<?, ?> a;

    /* renamed from: b  reason: collision with root package name */
    public final e.e.a.c.b.g f7963b;

    public c(HashMap<?, ?> hashMap, e.e.a.c.a aVar) {
        this.a = hashMap;
        this.f7963b = aVar.f7940g;
    }

    @Override // e.e.a.c.c.a
    public byte[] a() {
        e.e.a.c.b.g gVar = this.f7963b;
        HashMap<?, ?> hashMap = this.a;
        Objects.requireNonNull(gVar);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(hashMap);
                objectOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length = byteArray.length + 1;
                byte[] bArr = new byte[length];
                bArr[0] = -13;
                for (int i2 = 1; i2 < length; i2++) {
                    bArr[i2] = byteArray[i2 - 1];
                }
                try {
                    byteArrayOutputStream.close();
                    return bArr;
                } catch (IOException unused) {
                    return bArr;
                }
            } catch (IOException e2) {
                s1.l(e2, true);
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                }
                return new byte[0];
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }
}
