package ch.qos.logback.core.sift;

import ch.qos.logback.core.Appender;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.helpers.NOPAppender;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ContextAwareImpl;
/* loaded from: classes.dex */
public class AppenderTracker<E> extends AbstractComponentTracker<Appender<E>> {
    public final AppenderFactory<E> appenderFactory;
    public final Context context;
    public final ContextAwareImpl contextAware;
    public int nopaWarningCount = 0;

    public AppenderTracker(Context context, AppenderFactory<E> appenderFactory) {
        this.context = context;
        this.appenderFactory = appenderFactory;
        this.contextAware = new ContextAwareImpl(context, this);
    }

    private NOPAppender<E> buildNOPAppender(String str) {
        int i2 = this.nopaWarningCount;
        if (i2 < 4) {
            this.nopaWarningCount = i2 + 1;
            ContextAwareImpl contextAwareImpl = this.contextAware;
            contextAwareImpl.addError("Building NOPAppender for discriminating value [" + str + "]");
        }
        NOPAppender<E> nOPAppender = new NOPAppender<>();
        nOPAppender.setContext(this.context);
        nOPAppender.start();
        return nOPAppender;
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public Appender<E> buildComponent(String str) {
        Appender<E> appender;
        try {
            appender = this.appenderFactory.buildAppender(this.context, str);
        } catch (JoranException unused) {
            ContextAwareImpl contextAwareImpl = this.contextAware;
            contextAwareImpl.addError("Error while building appender with discriminating value [" + str + "]");
            appender = null;
        }
        return appender == null ? buildNOPAppender(str) : appender;
    }

    public boolean isComponentStale(Appender<E> appender) {
        return !appender.isStarted();
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public /* bridge */ /* synthetic */ boolean isComponentStale(Object obj) {
        return isComponentStale((Appender) ((Appender) obj));
    }

    public void processPriorToRemoval(Appender<E> appender) {
        appender.stop();
    }

    @Override // ch.qos.logback.core.spi.AbstractComponentTracker
    public /* bridge */ /* synthetic */ void processPriorToRemoval(Object obj) {
        processPriorToRemoval((Appender) ((Appender) obj));
    }
}
