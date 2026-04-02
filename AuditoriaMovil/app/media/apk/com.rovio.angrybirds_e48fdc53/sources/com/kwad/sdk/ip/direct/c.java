package com.kwad.sdk.ip.direct;
/* loaded from: classes3.dex */
public final class c implements Comparable<c> {
    private String ip;
    private boolean success;
    private int weight;
    private float aCQ = -1.0f;
    private int aCV = 20;
    private int aCU = 3;
    private StringBuffer aCW = new StringBuffer();

    public c(String str) {
        this.ip = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(c cVar) {
        return (int) (this.aCQ - cVar.aCQ);
    }

    public final int FX() {
        return this.aCU;
    }

    public final float FY() {
        return this.aCQ;
    }

    public final void bs(boolean z) {
        this.success = z;
    }

    public final void cF(int i) {
        this.weight = i;
    }

    public final String getIp() {
        return this.ip;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final void i(float f) {
        this.aCQ = f;
    }

    public final boolean isSuccess() {
        return this.success;
    }

    public final String toString() {
        return "PingNetEntity{ip='" + this.ip + "', pingCount=" + this.aCU + ", pingWaitTime=" + this.aCV + ", pingTime='" + this.aCQ + " ms', success=" + this.success + '}';
    }
}
