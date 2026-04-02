package e.j.d.z;

import android.content.Context;
import android.text.TextUtils;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.FixedWindowRollingPolicy;
import ch.qos.logback.core.rolling.RollingFileAppender;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.util.FileSize;
import h.o.c.j;
import java.util.Objects;
import n.a.a;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* loaded from: classes2.dex */
public final class a extends a.c {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8905b;

    /* renamed from: c  reason: collision with root package name */
    public final Logger f8906c;

    public a(Context context, boolean z) {
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f8905b = z;
        this.f8906c = LoggerFactory.getLogger("PremiumHelper");
        String i2 = j.i(context.getFilesDir().getAbsolutePath(), "/premium_helper.log");
        String i3 = j.i(context.getFilesDir().getAbsolutePath(), "/premium_helper.log.%i");
        ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();
        Objects.requireNonNull(iLoggerFactory, "null cannot be cast to non-null type ch.qos.logback.classic.LoggerContext");
        LoggerContext loggerContext = (LoggerContext) iLoggerFactory;
        loggerContext.reset();
        RollingFileAppender rollingFileAppender = new RollingFileAppender();
        rollingFileAppender.setContext(loggerContext);
        rollingFileAppender.setFile(i2);
        FixedWindowRollingPolicy fixedWindowRollingPolicy = new FixedWindowRollingPolicy();
        fixedWindowRollingPolicy.setContext(loggerContext);
        fixedWindowRollingPolicy.setFileNamePattern(i3);
        fixedWindowRollingPolicy.setParent(rollingFileAppender);
        fixedWindowRollingPolicy.setMaxIndex(2);
        fixedWindowRollingPolicy.setMinIndex(1);
        fixedWindowRollingPolicy.start();
        SizeBasedTriggeringPolicy sizeBasedTriggeringPolicy = new SizeBasedTriggeringPolicy();
        sizeBasedTriggeringPolicy.setMaxFileSize(FileSize.valueOf(String.valueOf(z ? 5242880 : 512000)));
        sizeBasedTriggeringPolicy.start();
        PatternLayoutEncoder patternLayoutEncoder = new PatternLayoutEncoder();
        patternLayoutEncoder.setContext(loggerContext);
        patternLayoutEncoder.setPattern("%d{yyyy-MM-dd HH:mm:ss.SSS} %-5level %logger{36} - %msg%n");
        patternLayoutEncoder.start();
        rollingFileAppender.setEncoder(patternLayoutEncoder);
        rollingFileAppender.setRollingPolicy(fixedWindowRollingPolicy);
        rollingFileAppender.setTriggeringPolicy(sizeBasedTriggeringPolicy);
        rollingFileAppender.start();
        Logger logger = LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        Objects.requireNonNull(logger, "null cannot be cast to non-null type ch.qos.logback.classic.Logger");
        ch.qos.logback.classic.Logger logger2 = (ch.qos.logback.classic.Logger) logger;
        logger2.addAppender(rollingFileAppender);
        logger2.setLevel(Level.DEBUG);
    }

    @Override // n.a.a.c
    public boolean h(String str, int i2) {
        return this.f8905b || !(i2 == 2 || i2 == 3 || i2 == 4);
    }

    @Override // n.a.a.c
    public void i(int i2, String str, String str2, Throwable th) {
        j.e(str2, "message");
        if (h(str, i2)) {
            if (!TextUtils.isEmpty(str)) {
                str2 = ((Object) str) + CoreConstants.COLON_CHAR + str2;
            }
            switch (i2) {
                case 2:
                case 3:
                case 7:
                    Logger logger = this.f8906c;
                    if (th == null) {
                        logger.debug(str2);
                        return;
                    } else {
                        logger.debug(str2, th);
                        return;
                    }
                case 4:
                    Logger logger2 = this.f8906c;
                    if (th == null) {
                        logger2.info(str2);
                        return;
                    } else {
                        logger2.info(str2, th);
                        return;
                    }
                case 5:
                    Logger logger3 = this.f8906c;
                    if (th == null) {
                        logger3.warn(str2);
                        return;
                    } else {
                        logger3.warn(str2, th);
                        return;
                    }
                case 6:
                    Logger logger4 = this.f8906c;
                    if (th == null) {
                        logger4.error(str2);
                        return;
                    } else {
                        logger4.error(str2, th);
                        return;
                    }
                default:
                    Logger logger5 = this.f8906c;
                    if (th == null) {
                        logger5.debug(str2);
                        return;
                    } else {
                        logger5.error(str2, th);
                        return;
                    }
            }
        }
    }
}
