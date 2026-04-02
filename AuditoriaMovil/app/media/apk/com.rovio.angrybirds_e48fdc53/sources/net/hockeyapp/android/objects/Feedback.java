package net.hockeyapp.android.objects;

import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class Feedback implements Serializable {
    private static final long serialVersionUID = 2590172806951065320L;
    private String a;
    private String b;
    private int c;
    private String d;
    private ArrayList<FeedbackMessage> e;

    public String getName() {
        return this.a;
    }

    public void setName(String str) {
        this.a = str;
    }

    public String getEmail() {
        return this.b;
    }

    public void setEmail(String str) {
        this.b = str;
    }

    public int getId() {
        return this.c;
    }

    public void setId(int i) {
        this.c = i;
    }

    public String getCreatedAt() {
        return this.d;
    }

    public void setCreatedAt(String str) {
        this.d = str;
    }

    public ArrayList<FeedbackMessage> getMessages() {
        return this.e;
    }

    public void setMessages(ArrayList<FeedbackMessage> arrayList) {
        this.e = arrayList;
    }
}
