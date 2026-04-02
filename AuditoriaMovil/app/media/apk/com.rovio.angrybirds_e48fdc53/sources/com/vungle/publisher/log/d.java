package com.vungle.publisher.log;

import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.vungle.publisher.env.r;
import com.vungle.publisher.zk;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class d extends Formatter {
    SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    @Inject
    r b;

    @Override // java.util.logging.Formatter
    public String format(LogRecord logRecord) {
        String str = "";
        Object[] parameters = logRecord.getParameters();
        if (parameters != null && parameters.length > 0 && parameters[0] != null) {
            str = (String) parameters[0];
        }
        return zk.a(";", this.a.format(new Date(logRecord.getMillis())), TimeZone.getDefault().getID(), logRecord.getLoggerName(), a(logRecord.getLevel()), str, this.b.r(), logRecord.getMessage()) + "\n";
    }

    private String a(Level level) {
        String name = level.getName();
        char c = 65535;
        switch (name.hashCode()) {
            case -1852393868:
                if (name.equals("SEVERE")) {
                    c = 5;
                    break;
                }
                break;
            case 2158010:
                if (name.equals("FINE")) {
                    c = 0;
                    break;
                }
                break;
            case 2251950:
                if (name.equals("INFO")) {
                    c = 3;
                    break;
                }
                break;
            case 66898392:
                if (name.equals("FINER")) {
                    c = 1;
                    break;
                }
                break;
            case 1842428796:
                if (name.equals("WARNING")) {
                    c = 4;
                    break;
                }
                break;
            case 2073850267:
                if (name.equals("FINEST")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return "debug";
            case 3:
                return DBDefinition.SEGMENT_INFO;
            case 4:
                return "warn";
            case 5:
                return "error";
            default:
                return "debug";
        }
    }
}
