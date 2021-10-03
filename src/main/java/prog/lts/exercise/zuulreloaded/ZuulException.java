package prog.lts.exercise.zuulreloaded;

/**
 * Base class for all zuul related exceptions.
 */
public class ZuulException extends Exception {
  private static final org.slf4j.Logger logger =
          org.slf4j.LoggerFactory.getLogger(ZuulException.class);

  /**
   * base class for all zuul related exceptions.
   */
  public ZuulException() {
  }

  public ZuulException(final String message) {
    super(message);
  }

  public ZuulException(final String message, final Throwable cause) {
    super(message, cause);
  }

  public ZuulException(final Throwable cause) {
    super(cause);
  }

  public ZuulException(final String message, final Throwable cause,
                       final boolean enableSuppression, final boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
