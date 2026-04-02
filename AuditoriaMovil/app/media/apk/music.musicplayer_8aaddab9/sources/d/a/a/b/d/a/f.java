package d.a.a.b.d.a;

import ch.qos.logback.core.rolling.helper.FileNamePattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class f implements e<Integer> {
    public final Pattern a;

    public f(FileNamePattern fileNamePattern) {
        this.a = Pattern.compile(fileNamePattern.toRegex(false, true).replace("(?:\ufffe)?", "").replace("(?:\uffff)?", ""));
    }

    @Override // d.a.a.b.d.a.e
    public Integer a(String str) {
        int i2 = -1;
        try {
            Matcher matcher = this.a.matcher(str);
            return Integer.valueOf(Integer.parseInt((!matcher.find() || matcher.groupCount() < 1) ? "" : matcher.group(1), 10));
        } catch (NumberFormatException unused) {
            return i2;
        }
    }
}
