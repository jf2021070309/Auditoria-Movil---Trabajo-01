package com.ss.android.dr;

import com.kuaishou.weapon.p0.t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes3.dex */
public class dr implements ge {
    private final RandomAccessFile dr;

    public dr(File file) throws FileNotFoundException {
        this.dr = new RandomAccessFile(file, t.k);
    }

    @Override // com.ss.android.dr.ge
    public long dr() throws IOException {
        return this.dr.length();
    }

    @Override // com.ss.android.dr.ge
    public int dr(byte[] bArr, int i, int i2) throws IOException {
        return this.dr.read(bArr, i, i2);
    }

    @Override // com.ss.android.dr.ge
    public void dr(long j, long j2) throws IOException {
        this.dr.seek(j);
    }

    @Override // com.ss.android.dr.ge
    public void ge() throws IOException {
        this.dr.close();
    }
}
