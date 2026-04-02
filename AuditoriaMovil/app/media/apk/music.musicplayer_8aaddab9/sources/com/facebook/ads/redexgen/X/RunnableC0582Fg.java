package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Fg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0582Fg implements Runnable {
    public static String[] A06 = {"MFzmm2XpKtQDQZ1nrLFzIVLfypAdXqn0", "St6NP3oa8jPcs9ySqX58Qb7cq6M0Lslj", "FY6GSV0T1DmbxtheDZWAefy5bW4XMUrK", "e7zVVEHUrXPHmOTr9XrOqtCewhDOezV9", "rRe4XoYawEGGgKvf4FFgivRzu7z94IPy", "2sUcpRkbdiQEA9XQnsePPVJ2ZVsexJIi", "YygzZHUIY4dTUEusYM1qdSBaSuhDwAUc", "5Y8Iu0wedn9Jl3yvaaWMiUkpwoVz8Vqp"};
    public final /* synthetic */ C0587Fl A00;
    public final /* synthetic */ C0588Fm A01;
    public final /* synthetic */ C0589Fn A02;
    public final /* synthetic */ InterfaceC0590Fo A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public RunnableC0582Fg(C0587Fl c0587Fl, InterfaceC0590Fo interfaceC0590Fo, C0588Fm c0588Fm, C0589Fn c0589Fn, IOException iOException, boolean z) {
        this.A00 = c0587Fl;
        this.A03 = interfaceC0590Fo;
        this.A01 = c0588Fm;
        this.A02 = c0589Fn;
        this.A04 = iOException;
        this.A05 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A03.ABG(this.A00.A00, this.A00.A01, this.A01, this.A02, this.A04, this.A05);
        } catch (Throwable th) {
            String[] strArr = A06;
            if (strArr[7].charAt(1) != strArr[2].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[7] = "5YuzUPqIN2qUpgzcgBPCGBub3XZtkUQJ";
            strArr2[2] = "DYAXZKj6jF9OEHVnXiKZJEzpdMmcnACr";
            C0726Kz.A00(th, this);
        }
    }
}
