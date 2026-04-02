package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1;

import android.text.TextUtils;
/* loaded from: classes.dex */
public class i extends d {
    private long g;
    private String h;
    private long i;

    public i(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        super(str, str2, str3, str4, i);
        this.i = 0L;
        this.g = 0L;
        try {
            this.g = Long.parseLong(str5);
        } catch (Exception e) {
        }
        this.h = str6;
    }

    public i(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7) {
        this(str, str2, str3, str4, i, str5, str6);
        this.i = 0L;
        try {
            this.i = Long.parseLong(str7);
        } catch (Exception e) {
        }
    }

    public void a(long j) {
        this.i = j;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1.d
    public boolean a() {
        return (TextUtils.isEmpty(this.h) || this.g == 0) ? false : true;
    }

    public long i() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public long k() {
        return this.i;
    }

    public boolean l() {
        return this.i != 0;
    }

    public String toString() {
        return "BaseIntervalBean{waterfallId='" + this.a + "', showRulesVersion='" + this.c + "', timingMode=" + this.e + "}IntervalPacingBean{pacing=" + this.g + ", pacingRuleId='" + this.h + "', effectiveTime=" + this.i + '}';
    }
}
