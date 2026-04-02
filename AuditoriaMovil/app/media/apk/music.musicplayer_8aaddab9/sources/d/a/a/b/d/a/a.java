package d.a.a.b.d.a;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public class a implements e<Date> {
    public final SimpleDateFormat a;

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f4962b;

    public a(FileNamePattern fileNamePattern) {
        DateTokenConverter<Object> primaryDateTokenConverter = fileNamePattern.getPrimaryDateTokenConverter();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(primaryDateTokenConverter != null ? primaryDateTokenConverter.getDatePattern() : "yyyy-MM-dd", Locale.US);
        TimeZone timeZone = primaryDateTokenConverter != null ? primaryDateTokenConverter.getTimeZone() : TimeZone.getDefault();
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.a = simpleDateFormat;
        this.f4962b = Pattern.compile(fileNamePattern.toRegex(true, false));
    }

    @Override // d.a.a.b.d.a.e
    /* renamed from: b */
    public Date a(String str) {
        try {
            Matcher matcher = this.f4962b.matcher(str);
            return this.a.parse((!matcher.find() || matcher.groupCount() < 1) ? "" : matcher.group(1));
        } catch (ParseException unused) {
            return null;
        }
    }
}
