package com.kwad.framework.filedownloader.a;

import java.io.InputStream;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public interface b {
    String aZ(String str);

    void addHeader(String str, String str2);

    void execute();

    InputStream getInputStream();

    int getResponseCode();

    Map<String, List<String>> uh();

    Map<String, List<String>> ui();

    void uj();
}
