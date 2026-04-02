package com.amazon.aps.iva.jh;

import java.util.List;
/* compiled from: LanguageOptionsStore.kt */
/* loaded from: classes.dex */
public interface i {
    List<f> read();

    List<e> readFallback();

    void store(String str);

    void storeFallbacks(String str);
}
