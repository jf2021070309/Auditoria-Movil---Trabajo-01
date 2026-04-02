package com.amazon.aps.iva.r9;

import android.content.Intent;
import android.content.IntentFilter;
import com.amazon.aps.iva.k9.m;
/* compiled from: BatteryChargingTracker.java */
/* loaded from: classes.dex */
public final class a extends c<Boolean> {
    static {
        m.e("BatteryChrgTracker");
    }

    @Override // com.amazon.aps.iva.r9.d
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            m.c().b(new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return Boolean.valueOf((intExtra == 2 || intExtra == 5) ? true : true);
    }

    @Override // com.amazon.aps.iva.r9.c
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r4.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L7;
     */
    @Override // com.amazon.aps.iva.r9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.content.Intent r4) {
        /*
            r3 = this;
            java.lang.String r4 = r4.getAction()
            if (r4 != 0) goto L7
            return
        L7:
            com.amazon.aps.iva.k9.m r0 = com.amazon.aps.iva.k9.m.c()
            java.lang.String r1 = "Received %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r4}
            java.lang.String.format(r1, r2)
            r1 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]
            r0.a(r2)
            int r0 = r4.hashCode()
            r2 = -1
            switch(r0) {
                case -1886648615: goto L45;
                case -54942926: goto L3a;
                case 948344062: goto L2f;
                case 1019184907: goto L24;
                default: goto L22;
            }
        L22:
            r1 = r2
            goto L4e
        L24:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2d
            goto L22
        L2d:
            r1 = 3
            goto L4e
        L2f:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L38
            goto L22
        L38:
            r1 = 2
            goto L4e
        L3a:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L43
            goto L22
        L43:
            r1 = 1
            goto L4e
        L45:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L4e
            goto L22
        L4e:
            switch(r1) {
                case 0: goto L64;
                case 1: goto L5e;
                case 2: goto L58;
                case 3: goto L52;
                default: goto L51;
            }
        L51:
            goto L69
        L52:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.b(r4)
            goto L69
        L58:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.b(r4)
            goto L69
        L5e:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.b(r4)
            goto L69
        L64:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.b(r4)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r9.a.f(android.content.Intent):void");
    }
}
