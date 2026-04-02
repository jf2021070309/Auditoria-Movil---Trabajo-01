package com.fyber.inneractive.sdk.h;
/* loaded from: classes.dex */
public class aj extends Exception {
    public int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aj(int i) {
        this.a = i;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return String.valueOf(this.a);
    }
}
