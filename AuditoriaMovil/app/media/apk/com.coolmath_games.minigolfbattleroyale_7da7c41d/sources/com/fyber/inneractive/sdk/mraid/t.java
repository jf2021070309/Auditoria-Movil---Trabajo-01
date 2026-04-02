package com.fyber.inneractive.sdk.mraid;
/* loaded from: classes.dex */
public abstract class t {
    abstract String a();

    public String toString() {
        String a = a();
        return a != null ? a.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "") : "";
    }
}
