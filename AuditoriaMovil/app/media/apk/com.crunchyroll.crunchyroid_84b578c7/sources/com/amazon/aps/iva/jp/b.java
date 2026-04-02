package com.amazon.aps.iva.jp;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                c.b();
                return;
            default:
                AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
                return;
        }
    }
}
