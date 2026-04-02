package net.hockeyapp.android.objects;

import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;
import net.hockeyapp.android.Constants;
/* loaded from: classes4.dex */
public class FeedbackAttachment implements Serializable {
    private static final long serialVersionUID = 5059651319640956830L;
    private int a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;

    public int getId() {
        return this.a;
    }

    public void setId(int i) {
        this.a = i;
    }

    public int getMessageId() {
        return this.b;
    }

    public void setMessageId(int i) {
        this.b = i;
    }

    public String getFilename() {
        return this.c;
    }

    public void setFilename(String str) {
        this.c = str;
    }

    public String getUrl() {
        return this.d;
    }

    public void setUrl(String str) {
        this.d = str;
    }

    public String getCreatedAt() {
        return this.e;
    }

    public void setCreatedAt(String str) {
        this.e = str;
    }

    public String getUpdatedAt() {
        return this.f;
    }

    public void setUpdatedAt(String str) {
        this.f = str;
    }

    public String getCacheId() {
        return "" + this.b + this.a;
    }

    public boolean isAvailableInCache() {
        File hockeyAppStorageDir = Constants.getHockeyAppStorageDir();
        if (hockeyAppStorageDir.exists() && hockeyAppStorageDir.isDirectory()) {
            File[] listFiles = hockeyAppStorageDir.listFiles(new FilenameFilter() { // from class: net.hockeyapp.android.objects.FeedbackAttachment.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str) {
                    return str.equals(FeedbackAttachment.this.getCacheId());
                }
            });
            return listFiles != null && listFiles.length == 1;
        }
        return false;
    }

    public String toString() {
        return "\n" + FeedbackAttachment.class.getSimpleName() + "\nid         " + this.a + "\nmessage id " + this.b + "\nfilename   " + this.c + "\nurl        " + this.d + "\ncreatedAt  " + this.e + "\nupdatedAt  " + this.f;
    }
}
