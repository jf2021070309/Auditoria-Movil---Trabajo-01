package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: TIOStreamTransport.java */
/* loaded from: classes3.dex */
public class da extends dc {
    protected InputStream a;
    protected OutputStream b;

    protected da() {
        this.a = null;
        this.b = null;
    }

    public da(InputStream inputStream) {
        this.a = null;
        this.b = null;
        this.a = inputStream;
    }

    public da(OutputStream outputStream) {
        this.a = null;
        this.b = null;
        this.b = outputStream;
    }

    public da(InputStream inputStream, OutputStream outputStream) {
        this.a = null;
        this.b = null;
        this.a = inputStream;
        this.b = outputStream;
    }

    @Override // com.umeng.analytics.pro.dc
    public boolean a() {
        return true;
    }

    @Override // com.umeng.analytics.pro.dc
    public void b() throws dd {
    }

    @Override // com.umeng.analytics.pro.dc
    public void c() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.a = null;
        }
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.b = null;
        }
    }

    @Override // com.umeng.analytics.pro.dc
    public int a(byte[] bArr, int i, int i2) throws dd {
        InputStream inputStream = this.a;
        if (inputStream == null) {
            throw new dd(1, "Cannot read from null inputStream");
        }
        try {
            int read = inputStream.read(bArr, i, i2);
            if (read < 0) {
                throw new dd(4);
            }
            return read;
        } catch (IOException e) {
            throw new dd(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.dc
    public void b(byte[] bArr, int i, int i2) throws dd {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new dd(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new dd(0, e);
        }
    }

    @Override // com.umeng.analytics.pro.dc
    public void d() throws dd {
        OutputStream outputStream = this.b;
        if (outputStream == null) {
            throw new dd(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
        } catch (IOException e) {
            throw new dd(0, e);
        }
    }
}
