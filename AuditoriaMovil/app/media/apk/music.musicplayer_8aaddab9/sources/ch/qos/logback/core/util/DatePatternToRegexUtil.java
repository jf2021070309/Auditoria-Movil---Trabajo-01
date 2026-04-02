package ch.qos.logback.core.util;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.ads.AdSize;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import d.a.a.b.e.a;
import d.a.a.b.e.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class DatePatternToRegexUtil {
    public final String datePattern;
    public final int datePatternLength;
    public final b regexMapper = new b();

    public DatePatternToRegexUtil(String str) {
        this.datePattern = str;
        this.datePatternLength = str.length();
    }

    private List<a> tokenize() {
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        for (int i2 = 0; i2 < this.datePatternLength; i2++) {
            char charAt = this.datePattern.charAt(i2);
            if (aVar == null || aVar.a != charAt) {
                aVar = new a(charAt);
                arrayList.add(aVar);
            } else {
                aVar.f4964b++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public String toRegex() {
        StringBuilder sb;
        String sb2;
        List<a> list = tokenize();
        StringBuilder sb3 = new StringBuilder();
        for (a aVar : list) {
            b bVar = this.regexMapper;
            Objects.requireNonNull(bVar);
            int i2 = aVar.f4964b;
            char c2 = aVar.a;
            if (c2 != 'y') {
                if (c2 != 'z') {
                    sb2 = "";
                    switch (c2) {
                        case '\'':
                            if (i2 == 1) {
                                break;
                            } else {
                                throw new IllegalStateException("Too many single quotes");
                            }
                        case '.':
                            sb2 = "\\.";
                            break;
                        case 'K':
                        case 'S':
                        case 'W':
                        case 'd':
                        case 'h':
                        case FacebookMediationAdapter.ERROR_NULL_CONTEXT /* 107 */:
                        case FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD /* 109 */:
                        case 's':
                        case 'w':
                            break;
                        case 'M':
                            if (i2 <= 2) {
                                sb = new StringBuilder();
                                sb.append("\\d{");
                                sb.append(i2);
                                sb.append("}");
                                sb2 = sb.toString();
                                break;
                            } else if (i2 == 3) {
                                sb2 = bVar.a(bVar.a.getShortMonths());
                                break;
                            } else {
                                sb2 = bVar.a(bVar.a.getMonths());
                                break;
                            }
                        case AdSize.LARGE_AD_HEIGHT /* 90 */:
                            sb2 = "(\\+|-)\\d{4}";
                            break;
                        case '\\':
                            throw new IllegalStateException("Forward slashes are not allowed");
                        case 'a':
                            sb2 = bVar.a(bVar.a.getAmPmStrings());
                            break;
                        default:
                            switch (c2) {
                                case 'D':
                                case CoreConstants.OOS_RESET_FREQUENCY /* 70 */:
                                case SyslogConstants.LOG_CRON /* 72 */:
                                    break;
                                case 'E':
                                    if (i2 >= 4) {
                                        sb2 = bVar.a(bVar.a.getWeekdays());
                                        break;
                                    } else {
                                        sb2 = bVar.a(bVar.a.getShortWeekdays());
                                        break;
                                    }
                                case 'G':
                                    break;
                                default:
                                    StringBuilder sb4 = new StringBuilder();
                                    if (i2 == 1) {
                                        sb4.append("");
                                        sb4.append(c2);
                                    } else {
                                        sb4.append(c2);
                                        sb4.append("{");
                                        sb4.append(i2);
                                        sb4.append("}");
                                    }
                                    sb2 = sb4.toString();
                                    break;
                            }
                    }
                    sb3.append(sb2);
                }
                sb2 = ".*";
                sb3.append(sb2);
            }
            sb = new StringBuilder();
            sb.append("\\d{");
            sb.append(i2);
            sb.append("}");
            sb2 = sb.toString();
            sb3.append(sb2);
        }
        return sb3.toString();
    }
}
