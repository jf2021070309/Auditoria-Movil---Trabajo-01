package com.fyber.inneractive.sdk.a;
/* loaded from: classes.dex */
public final class e<ResultData> {
    public ResultData a;
    public String b;
    private Exception c;

    public e(ResultData resultdata, String str) {
        this.a = resultdata;
        this.b = str;
    }

    private e(Exception exc) {
        this.c = exc;
    }

    public static <ResultData> e<ResultData> a(Exception exc) {
        return new e<>(exc);
    }
}
