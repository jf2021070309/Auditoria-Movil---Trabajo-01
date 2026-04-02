package net.hockeyapp.android.objects;

import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
public class FeedbackMessage implements Serializable {
    private static final long serialVersionUID = -8773015828853994624L;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private String h;
    private int i;
    private String j;
    private String k;
    private String l;
    private String m;
    private List<FeedbackAttachment> n;

    @Deprecated
    public String getSubjec() {
        return this.a;
    }

    @Deprecated
    public void setSubjec(String str) {
        this.a = str;
    }

    public String getSubject() {
        return this.a;
    }

    public void setSubject(String str) {
        this.a = str;
    }

    public String getText() {
        return this.b;
    }

    public void setText(String str) {
        this.b = str;
    }

    public String getOem() {
        return this.c;
    }

    public void setOem(String str) {
        this.c = str;
    }

    public String getModel() {
        return this.d;
    }

    public void setModel(String str) {
        this.d = str;
    }

    public String getOsVersion() {
        return this.e;
    }

    public void setOsVersion(String str) {
        this.e = str;
    }

    public String getCreatedAt() {
        return this.f;
    }

    public void setCreatedAt(String str) {
        this.f = str;
    }

    public int getId() {
        return this.g;
    }

    public void setId(int i) {
        this.g = i;
    }

    public String getToken() {
        return this.h;
    }

    public void setToken(String str) {
        this.h = str;
    }

    public int getVia() {
        return this.i;
    }

    public void setVia(int i) {
        this.i = i;
    }

    public String getUserString() {
        return this.j;
    }

    public void setUserString(String str) {
        this.j = str;
    }

    public String getCleanText() {
        return this.k;
    }

    public void setCleanText(String str) {
        this.k = str;
    }

    public String getName() {
        return this.l;
    }

    public void setName(String str) {
        this.l = str;
    }

    public String getAppId() {
        return this.m;
    }

    public void setAppId(String str) {
        this.m = str;
    }

    public List<FeedbackAttachment> getFeedbackAttachments() {
        return this.n;
    }

    public void setFeedbackAttachments(List<FeedbackAttachment> list) {
        this.n = list;
    }
}
