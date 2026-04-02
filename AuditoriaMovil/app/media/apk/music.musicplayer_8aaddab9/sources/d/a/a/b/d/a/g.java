package d.a.a.b.d.a;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class g extends h {
    public g(String str) {
        super(str);
    }

    @Override // d.a.a.b.d.a.h
    public List<File> a(FileProvider fileProvider) {
        return b(fileProvider, this.a);
    }

    @Override // d.a.a.b.d.a.h
    public boolean c(File file) {
        return file.getName().equals(this.a);
    }
}
