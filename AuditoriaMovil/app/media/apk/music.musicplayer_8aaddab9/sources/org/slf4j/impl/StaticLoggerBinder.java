package org.slf4j.impl;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.classic.util.ContextSelectorStaticBinder;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.StatusUtil;
import ch.qos.logback.core.util.StatusPrinter;
import e.a.d.a.a;
import org.slf4j.ILoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.spi.LoggerFactoryBinder;
/* loaded from: classes2.dex */
public class StaticLoggerBinder implements LoggerFactoryBinder {
    public static final String NULL_CS_URL = "http://logback.qos.ch/codes.html#null_CS";
    public static String REQUESTED_API_VERSION = "1.6";
    private static StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
    private static Object KEY = new Object();
    private boolean initialized = false;
    private LoggerContext defaultLoggerContext = new LoggerContext();
    private final ContextSelectorStaticBinder contextSelectorBinder = ContextSelectorStaticBinder.getSingleton();

    static {
        SINGLETON.init();
    }

    private StaticLoggerBinder() {
        this.defaultLoggerContext.setName("default");
    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    public static void reset() {
        StaticLoggerBinder staticLoggerBinder = new StaticLoggerBinder();
        SINGLETON = staticLoggerBinder;
        staticLoggerBinder.init();
    }

    @Override // org.slf4j.spi.LoggerFactoryBinder
    public ILoggerFactory getLoggerFactory() {
        if (this.initialized) {
            if (this.contextSelectorBinder.getContextSelector() != null) {
                return this.contextSelectorBinder.getContextSelector().getLoggerContext();
            }
            throw new IllegalStateException("contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS");
        }
        return this.defaultLoggerContext;
    }

    @Override // org.slf4j.spi.LoggerFactoryBinder
    public String getLoggerFactoryClassStr() {
        return this.contextSelectorBinder.getClass().getName();
    }

    public void init() {
        try {
            try {
                new ContextInitializer(this.defaultLoggerContext).autoConfig();
            } catch (JoranException e2) {
                Util.report("Failed to auto configure default logger context", e2);
            }
            if (!StatusUtil.contextHasStatusListener(this.defaultLoggerContext)) {
                StatusPrinter.printInCaseOfErrorsOrWarnings(this.defaultLoggerContext);
            }
            this.contextSelectorBinder.init(this.defaultLoggerContext, KEY);
            this.initialized = true;
        } catch (Exception e3) {
            StringBuilder y = a.y("Failed to instantiate [");
            y.append(LoggerContext.class.getName());
            y.append("]");
            Util.report(y.toString(), e3);
        }
    }
}
