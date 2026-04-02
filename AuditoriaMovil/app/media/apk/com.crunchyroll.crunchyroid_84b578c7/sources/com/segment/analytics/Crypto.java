package com.segment.analytics;

import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes4.dex */
public abstract class Crypto {
    public static Crypto none() {
        return new Crypto() { // from class: com.segment.analytics.Crypto.1
            @Override // com.segment.analytics.Crypto
            public InputStream decrypt(InputStream inputStream) {
                return inputStream;
            }

            @Override // com.segment.analytics.Crypto
            public OutputStream encrypt(OutputStream outputStream) {
                return outputStream;
            }
        };
    }

    public abstract InputStream decrypt(InputStream inputStream);

    public abstract OutputStream encrypt(OutputStream outputStream);
}
