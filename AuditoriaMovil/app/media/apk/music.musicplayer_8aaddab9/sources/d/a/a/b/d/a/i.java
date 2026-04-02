package d.a.a.b.d.a;

import ch.qos.logback.core.rolling.helper.FileProvider;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class i extends h {

    /* renamed from: b  reason: collision with root package name */
    public Pattern f4963b;

    public i(String str) {
        super(str);
        this.f4963b = Pattern.compile(str);
    }

    @Override // d.a.a.b.d.a.h
    public List<File> a(FileProvider fileProvider) {
        return b(fileProvider, ".");
    }

    @Override // d.a.a.b.d.a.h
    public boolean c(File file) {
        return this.f4963b.matcher(file.getName()).find();
    }
}
