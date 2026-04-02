package net.hockeyapp.android.metrics.model;
/* loaded from: classes4.dex */
public enum SessionState {
    START(0),
    END(1);
    
    private final int a;

    SessionState(int i) {
        this.a = i;
    }

    public int getValue() {
        return this.a;
    }
}
