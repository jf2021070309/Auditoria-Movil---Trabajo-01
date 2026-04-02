package bo.app;
/* loaded from: classes.dex */
public final class z3 extends j {
    private z3(a1 a1Var, com.amazon.aps.iva.if0.c cVar, double d) {
        super(a1Var, cVar, d, (String) null, 8, (com.amazon.aps.iva.yb0.e) null);
    }

    public final String x() {
        String string = q().getString("cid");
        com.amazon.aps.iva.yb0.j.e(string, "data.getString(IBrazeEvent.DATA_CAMPAIGN_ID)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z3(java.lang.String r4, long r5) {
        /*
            r3 = this;
            java.lang.String r0 = "campaignId"
            com.amazon.aps.iva.yb0.j.f(r4, r0)
            bo.app.a1 r0 = bo.app.a1.PUSH_DELIVERY_EVENT
            com.amazon.aps.iva.if0.c r1 = new com.amazon.aps.iva.if0.c
            r1.<init>()
            java.lang.String r2 = "cid"
            com.amazon.aps.iva.if0.c r4 = r1.put(r2, r4)
            java.lang.String r1 = "JSONObject().put(IBrazeE…_CAMPAIGN_ID, campaignId)"
            com.amazon.aps.iva.yb0.j.e(r4, r1)
            double r5 = (double) r5
            r3.<init>(r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.z3.<init>(java.lang.String, long):void");
    }
}
