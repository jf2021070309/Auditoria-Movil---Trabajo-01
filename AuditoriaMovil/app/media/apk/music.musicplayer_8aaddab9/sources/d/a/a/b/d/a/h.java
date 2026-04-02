package d.a.a.b.d.a;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public abstract class h {
    public String a;

    public h(String str) {
        this.a = str;
    }

    public abstract List<File> a(FileProvider fileProvider);

    public List<File> b(FileProvider fileProvider, String str) {
        File[] listFiles = fileProvider.listFiles(new File(str).getAbsoluteFile(), null);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        return Arrays.asList(listFiles);
    }

    public abstract boolean c(File file);
}
