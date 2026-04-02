package com.amazon.aps.iva.f7;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* compiled from: EventMessageEncoder.java */
/* loaded from: classes.dex */
public final class c {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(AdRequest.MAX_CONTENT_URL_LENGTH);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(a aVar) {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = this.b;
        try {
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            String str = aVar.c;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.writeLong(aVar.e);
            dataOutputStream.write(aVar.f);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
