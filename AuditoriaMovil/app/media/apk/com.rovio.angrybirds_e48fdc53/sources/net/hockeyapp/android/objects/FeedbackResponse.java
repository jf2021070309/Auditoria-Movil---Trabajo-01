package net.hockeyapp.android.objects;

import java.io.Serializable;
/* loaded from: classes4.dex */
public class FeedbackResponse implements Serializable {
    private static final long serialVersionUID = -1093570359639034766L;
    private String a;
    private Feedback b;
    private String c;

    public String getStatus() {
        return this.a;
    }

    public void setStatus(String str) {
        this.a = str;
    }

    public Feedback getFeedback() {
        return this.b;
    }

    public void setFeedback(Feedback feedback) {
        this.b = feedback;
    }

    public String getToken() {
        return this.c;
    }

    public void setToken(String str) {
        this.c = str;
    }
}
