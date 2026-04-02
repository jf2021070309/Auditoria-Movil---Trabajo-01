package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class lh<T> implements li<List<T>> {
    li<T> a;

    @Override // com.flurry.sdk.li
    public final /* bridge */ /* synthetic */ void a(OutputStream outputStream, Object obj) {
        a(outputStream, (List) ((List) obj));
    }

    public lh(li<T> liVar) {
        this.a = liVar;
    }

    public final void a(OutputStream outputStream, List<T> list) {
        if (outputStream != null) {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream) { // from class: com.flurry.sdk.lh.1
                @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }
            };
            int size = list != null ? list.size() : 0;
            dataOutputStream.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.a.a(outputStream, list.get(i));
            }
            dataOutputStream.flush();
        }
    }

    @Override // com.flurry.sdk.li
    /* renamed from: b */
    public final List<T> a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        int readInt = new DataInputStream(inputStream) { // from class: com.flurry.sdk.lh.2
            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            T a = this.a.a(inputStream);
            if (a == null) {
                throw new IOException("Missing record.");
            }
            arrayList.add(a);
        }
        return arrayList;
    }
}
