import com.intellij.openapi.components.ServiceManager;

public interface StartupTimerService {

  long getFinishedTime();

  void setFinishedTime(long finishedTime);

  static StartupTimerService getInstance() {
    return ServiceManager.getService(StartupTimerService.class);
  }
}
