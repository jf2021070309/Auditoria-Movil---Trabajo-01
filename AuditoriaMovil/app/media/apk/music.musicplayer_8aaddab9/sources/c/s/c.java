package c.s;

import java.io.File;
import java.io.FileFilter;
/* loaded from: classes.dex */
public class c implements FileFilter {
    public c(d dVar) {
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
