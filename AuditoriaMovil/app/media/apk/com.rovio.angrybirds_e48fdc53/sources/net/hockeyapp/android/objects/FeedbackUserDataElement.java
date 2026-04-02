package net.hockeyapp.android.objects;
/* loaded from: classes4.dex */
public enum FeedbackUserDataElement {
    DONT_SHOW(0),
    OPTIONAL(1),
    REQUIRED(2);
    
    private final int a;

    FeedbackUserDataElement(int i) {
        this.a = i;
    }

    public int getValue() {
        return this.a;
    }
}
