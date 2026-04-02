package com.kwad.library.solder.lib.ext;

import com.kuaishou.weapon.p0.bh;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class c {
    private final String agA;
    private final String agB;
    private final boolean agC;
    private final boolean agD;
    private final boolean agE;
    private ExecutorService agF;
    private String agG;
    private byte[] agH;
    private boolean agI;
    private final int agh;
    private final String agv;
    private final String agw;
    private final String agx;
    private final String agy;
    private final String agz;

    /* loaded from: classes.dex */
    public static class a {
        private String agB;
        private boolean agE;
        private ExecutorService agF;
        private String agG;
        private byte[] agH;
        private boolean agI;
        private int agh = 3;
        private String agv = "sodler";
        private String agw = "code-cache";
        private String agx = "lib";
        private String agy = "temp";
        private String agA = "base-1.apk";
        private String agz = bh.k;
        private boolean agD = false;
        private boolean agC = false;

        public final a a(ExecutorService executorService) {
            this.agF = executorService;
            return this;
        }

        public final a bK(int i) {
            if (i > 0) {
                this.agh = i;
            }
            return this;
        }

        public final a bL(String str) {
            this.agv = str;
            return this;
        }

        public final a ba(boolean z) {
            this.agI = false;
            return this;
        }

        public final a bb(boolean z) {
            this.agE = z;
            return this;
        }

        public final c wM() {
            return new c(this.agC, this.agD, this.agB, this.agv, this.agw, this.agx, this.agy, this.agz, this.agA, this.agh, this.agG, this.agH, this.agI, this.agE, this.agF, (byte) 0);
        }
    }

    private c(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, byte[] bArr, boolean z3, boolean z4, ExecutorService executorService) {
        this.agh = i;
        this.agv = str2;
        this.agw = str3;
        this.agx = str4;
        this.agy = str5;
        this.agz = str6;
        this.agA = str7;
        this.agB = str;
        this.agC = z;
        this.agD = z2;
        this.agG = str8;
        this.agH = bArr;
        this.agI = z3;
        this.agE = z4;
        this.agF = executorService;
    }

    /* synthetic */ c(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, byte[] bArr, boolean z3, boolean z4, ExecutorService executorService, byte b) {
        this(z, z2, str, str2, str3, str4, str5, str6, str7, i, str8, bArr, z3, z4, executorService);
    }

    public final int getRetryCount() {
        return this.agh;
    }

    public final String wD() {
        return this.agv;
    }

    public final String wE() {
        return this.agw;
    }

    public final String wF() {
        return this.agx;
    }

    public final String wG() {
        return this.agy;
    }

    public final String wH() {
        return this.agz;
    }

    public final String wI() {
        return this.agA;
    }

    public final boolean wJ() {
        return this.agD;
    }

    public final boolean wK() {
        return this.agE;
    }

    public final ExecutorService wL() {
        return this.agF;
    }
}
