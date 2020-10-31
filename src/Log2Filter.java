import javax.servlet.*;
import java.io.IOException;

public class Log2Filter implements Filter {
    private String logFile;

    public Log2Filter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.logFile = filterConfig.getInitParameter("logFile");
        System.out.println("LogFile: " + logFile);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (this.logFile != null) {
            //Write info on LOgFile
            this.logToFile(this.logFile);
        }
    }


    @Override
    public void destroy() {
        System.out.println("Log2File destroyed");
    }

    private void logToFile(String fileName) {

    }

}
