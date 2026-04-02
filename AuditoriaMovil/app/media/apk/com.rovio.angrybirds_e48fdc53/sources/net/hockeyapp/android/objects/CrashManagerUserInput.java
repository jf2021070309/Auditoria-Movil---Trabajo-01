package net.hockeyapp.android.objects;
/* loaded from: classes4.dex */
public enum CrashManagerUserInput {
    CrashManagerUserInputDontSend(0),
    CrashManagerUserInputSend(1),
    CrashManagerUserInputAlwaysSend(2);
    
    private final int a;

    CrashManagerUserInput(int i) {
        this.a = i;
    }

    public int getValue() {
        return this.a;
    }
}
