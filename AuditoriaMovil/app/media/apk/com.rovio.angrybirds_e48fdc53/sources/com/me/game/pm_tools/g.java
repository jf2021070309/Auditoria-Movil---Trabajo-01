package com.me.game.pm_tools;

import com.me.game.pm_tools.h;
import java.io.File;
import java.io.FileOutputStream;
/* loaded from: classes5.dex */
public abstract class g<Bean extends h, L> extends z<L> {
    public Bean e;
    public File f;

    public g() {
        File file = new File(b.d.getFilesDir(), o());
        this.f = file;
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        this.e = m(n(a0.b(this.f)));
        p();
    }

    public abstract Bean m(String str);

    public String n(String str) {
        return str;
    }

    public abstract String o();

    public void p() {
    }

    public synchronized void q() {
        String obj = this.e.toString();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f);
            fileOutputStream.write(obj.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
