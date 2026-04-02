package com.kwad.sdk.crash.report.upload;
/* loaded from: classes.dex */
public final class e {
    public static e aBF = new e(-11, "Please init.");
    public static e aBG = new e(-12, "error when zip_file");
    public static e aBH = new e(-13, "There is no valid network.");
    public static e aBI = new e(-14, "Token is invalid.");
    public static e aBJ = new e(-15, "upload task execute frequence exceed.");
    public static e aBK = new e(-16, "process request fail.");
    public static e aBL = new e(-17, "sever response error http code");
    public static e aBM = new e(-18, "sever response error result code");
    public static e aBN = new e(-19, "server bad response.");
    private final int aBO;
    private final String aBP;

    private e(int i, String str) {
        this.aBO = i;
        this.aBP = str;
    }

    public final String vr() {
        return this.aBP;
    }
}
